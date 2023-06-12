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
