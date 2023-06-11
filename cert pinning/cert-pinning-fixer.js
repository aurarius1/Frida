setTimeout(function(){
    Java.perform(function() {
        let nsc = Java.use('android.security.net.config.NetworkSecurityConfig');       
        let X509Certificate = Java.use("java.security.cert.X509Certificate");
        let MessageDigest = Java.use("java.security.MessageDigest");
        let CertificateFactory = Java.use("java.security.cert.CertificateFactory");
        let FileInputStream = Java.use("java.io.FileInputStream");
        let Pin = Java.use("android.security.net.config.Pin");
        let PinSet = Java.use("android.security.net.config.PinSet");
        let Set = Java.use("android.util.ArraySet");
        let Long = Java.use("java.lang.Long");
        

        let NSC_OBJ;
        
        
        const nsc_const = nsc.$init.overload('boolean', 'boolean', 'android.security.net.config.PinSet', 'java.util.List');
        nsc_const.implementation = function(a, b, pinset, l)
        {
            console.log("Hooking NSC constructor");
            if(pinset.pins.value.size() === 0){
                console.log("NSC HAS NO DEFAULT PINS SET, ADDING PIN"); 
                let pins = Set.$new();
                let md = MessageDigest.getInstance("SHA256");
                let cf = CertificateFactory.getInstance("X509");
                let is = FileInputStream.$new("/data/local/tmp/cat.crt");
                let cert = Java.cast(cf.generateCertificate(is), X509Certificate);
                let pubKeyPin = Java.cast(cert.getPublicKey(), Java.use("java.security.Key")).getEncoded();
                let pin = md.digest(pubKeyPin);
                pin = Pin.$new("SHA-256", pin);
                pins.add(pin);
                pinset = PinSet.$new(pins, Long["MAX_VALUE"].value);
            }
            NSC_OBJ = nsc_const.call(this,a, b, pinset, l);
            return NSC_OBJ;
        }
      });
},0);



function hexToBytes(hex) {
    let bytes = [];
    for (let c = 0; c < hex.length; c += 2)
        bytes.push(parseInt(hex.substr(c, 2), 16));
    return bytes;
}

function legacy_doesnt_work_always()
{
    try {
        var SSLContext = Java.use("javax.net.ssl.SSLContext");
        var AppTrustManager = Java.use("com.wopin.simpledemoapp.MainActivity$1");
        //var AppSSLContext = Java.use("com.wopin.simpledemoapp.MainActivity$1");
        var HTTPSUrlConn = Java.use("javax.net.ssl.HttpsURLConnection");
        var X509TrustManager = Java.use("javax.net.ssl.X509TrustManager");
        var X509Certificate = Java.use("java.security.cert.X509Certificate");
        var MessageDigest = Java.use("java.security.MessageDigest");
        let CertificateFactory = Java.use("java.security.cert.CertificateFactory");
        let FileInputStream = Java.use("java.io.FileInputStream");
        let JavaArrays = Java.use("java.util.Arrays");
        let CertificateException = Java.use("javax.security.cert.CertificateException");
        const TrustManagerImpl = Java.use('com.android.org.conscrypt.TrustManagerImpl');
        
        var t = TrustManagerImpl.checkTrustedRecursive.overload('[Ljava.security.cert.X509Certificate;', '[B', '[B', 'java.lang.String', 'boolean', 'java.util.ArrayList', 'java.util.ArrayList', 'java.util.Set');
        t.implementation = function(chain, b, c, d, e, f)
        {   
            let md = MessageDigest.getInstance("SHA256");

            let cf = CertificateFactory.getInstance("X509");
            let is = FileInputStream.$new("/data/local/tmp/cat.crt");
            let cert = Java.cast(cf.generateCertificate(is), X509Certificate);
            let pubKeyPin = Java.cast(cert.getPublicKey(), Java.use("java.security.Key")).getEncoded();
            let pin = md.digest(pubKeyPin);

            
            let certificate = Java.cast(chain[0], X509Certificate); // this needs to match our pin;
            
            let pubKey = Java.cast(certificate.getPublicKey(), Java.use("java.security.Key")).getEncoded();
            let fingerprint = md.digest(pubKey);

            console.log("Fingerprint of cert: ");
            console.log(fingerprint);
            console.log("PIN: ");
            console.log(pin);
            console.log("ARE PINS EQUAL?");
            if(!JavaArrays.equals(fingerprint, pin))
            {
                console.log("PINS ARE NOT EQUALS SOMETHING'S FISHY");
                CertificateException.$new("FUCK OFF");
            }
            else
            {
                console.log("IT'S ALL GOOD MAN!");
            }
            let trustedList = Java.use("java.util.ArrayList").$new(0);
            trustedList.add(cf);
            return trustedList;
        }

        const sslFac = HTTPSUrlConn.getDefaultSSLSocketFactory.overload();
        sslFac.implementation = function()
        {
            console.log("HI");
            return sslFac.call(this);
        }


        const Test = Java.registerClass({
            // Implement a custom TrustManager
            name: 'certpin.test.TrustManager',
            implements: [X509TrustManager],
            methods: {
                checkClientTrusted: function (chain, authType) { console.log("BITE NET "); },
                checkServerTrusted: function (chain, authType) {  
                    console.log("HALLO FROM CHECK SERVER TRUSTED");           
                    let md = MessageDigest.getInstance("SHA256");

                    let cf = CertificateFactory.getInstance("X509");
                    let is = FileInputStream.$new("/data/local/tmp/cat.crt");
                    let cert = Java.cast(cf.generateCertificate(is), X509Certificate);
                    let pubKeyPin = Java.cast(cert.getPublicKey(), Java.use("java.security.Key")).getEncoded();
                    let pin = md.digest(pubKeyPin);
        
                    
                    let certificate = Java.cast(chain[0], X509Certificate); // this needs to match our pin;
                    
                    let pubKey = Java.cast(certificate.getPublicKey(), Java.use("java.security.Key")).getEncoded();
                    let fingerprint = md.digest(pubKey);
        
                    console.log("Fingerprint of cert: ");
                    console.log(fingerprint);
                    console.log("PIN: ");
                    console.log(pin);
                    console.log("ARE PINS EQUAL?");
                    if(!JavaArrays.equals(fingerprint, pin))
                    {
                        console.log("PINS ARE NOT EQUALS SOMETHING'S FISHY");
                    }
                    else
                    {
                        console.log("IT'S ALL GOOD MAN!");
                    } 
                },
                getAcceptedIssuers: function () { return []; }
            }
        });

        const TrustManagers = [Test.$new()];

        console.log('[+] SSLContext');
        //const initOverload = SSLContext.init.overload('[Ljavax.net.ssl.KeyManager;', '[Ljavax.net.ssl.TrustManager;', 'java.security.SecureRandom');
        //initOverload.implementation = function(a, b, c)
        //{
        //    console.log("HALLO FROM SSL CONTEXT OVERLOAD");
        //    initOverload.call(this, a, TrustManagers, c);
        //}
        } catch (err) {
            console.log(err);
        }
}