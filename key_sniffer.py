import frida, sys

def on_message(message, data):
    if message['type'] == 'send':
        print("[*] {0}".format(message['payload']))
    else:
        print(message)

jscode = """

let test = "10";
let always_caps = false;
let user_pressed_caps = false;

function only_allow_caps_after_one_cap(i)
{
    if(!always_caps)
    {
        user_pressed_caps = i;
        if(user_pressed_caps)
        {
            always_caps = true;
        }
        return user_pressed_caps;
    }
    return always_caps;
}




Java.perform(() => {
    let Integer = Java.use("java.lang.Integer");
    let castObj = Java.use("c.d.a.a.g");
    let SharedPref = Java.use("android.content.SharedPreferences");
    let cIC = undefined;
    let prefsChanged = false;
    let autoCaps = undefined;

    let AnySoftKeyboardRxPrefs = Java.use("com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs");
    let AnySoftKeyboard = Java.use("com.anysoftkeyboard.AnySoftKeyboard");
    let n0 = Java.use("c.b.x.n0");
    n0["onSharedPreferenceChanged"].implementation = function (sharedPreferences, str) {
        // here a prefrence change can be detected
        prefsChanged = true;
        this["onSharedPreferenceChanged"](sharedPreferences, str);
    };

    function getCurrentCursorPosition()
    {
        if(cIC !== undefined && cIC !== null)
        {
            return cIC.getTextBeforeCursor(Integer["MAX_VALUE"].value, 0).length()
        }
    }

    function isSomethingAfterCursor()
    {
        if(cIC !== undefined && cIC !== null)
        {
            return cIC.getTextAfterCursor(10, 0).length() !== 0;
        }
    }


    function getPreferenceValue(classObj, prefId, prefDefaultValId)
    {
        let prefs = Java.cast(classObj, AnySoftKeyboardRxPrefs);
        let test = prefs.m.value.a(prefId,prefDefaultValId);
        test = Java.cast(test, castObj);    
        return test.b();
    }
    
    // get currentInputConnection
    let AnySoftKeyboardBase = Java.use("com.anysoftkeyboard.ime.AnySoftKeyboardBase");
    AnySoftKeyboardBase["onComputeInsets"].implementation = function (insets) {
        if(cIC === undefined)
            cIC = this.getCurrentInputConnection(); 
        this["onComputeInsets"](insets);
    };

    AnySoftKeyboard["s"].implementation = function (i, pVar, i2, iArr, z) {
        // init autoCaps setting
        if(autoCaps === undefined)
        {
            autoCaps = getPreferenceValue(this, 2131821138, 2131034122);
            console.log("Initial autoCaps value: " + autoCaps);
        }

        if(prefsChanged)
        {
            // once a preference change is detected, the actual values of the preferences can be read here
            let value = getPreferenceValue(this, 2131821138, 2131034122);
            console.log("autoCaps value updated from " + autoCaps + " to " + value);
            value = autoCaps;
            cIC = this.getCurrentInputConnection();
            prefsChanged = false;
        }
        if(cIC === undefined)
            cIC = this.getCurrentInputConnection(); 
        this["s"](i, pVar, i2, iArr, z);
    };

    let DetectorClass = Java.use("c.b.z.r0.n0");
    DetectorClass["c"].implementation = function(i){
        //return only_allow_caps_after_one_cap(this["c"](i));
        return this["c"](i);
    };

    let PointerTracker = Java.use("c.b.z.r0.x0");
    PointerTracker["a"].implementation = function (i, i1, i2, i3, i4) {
        let keyboard_key = this["b"](i); // is getKey Function
        let detector = this["_d"].value; // _d is mKeyDetector
        // detect if letter is capitalized
        let capitalizedLetter = detector.c(keyboard_key); //c == isKeyShifted
        console.log("Something is behind cursor: " + isSomethingAfterCursor());
        if(keyboard_key.e() !== 10 || true)
        {
            
            console.log(capitalizedLetter);
            let test = keyboard_key.getClass().getDeclaredFields();
            for(let i = 0; i < test.length; ++i)
            {
                // iterating over members with type CharSequence 
            if(test[i].getType().getName() === "java.lang.CharSequence")
            {
                    let curr_charseq = test[i].get(keyboard_key);
                    if(curr_charseq !== null)
                        console.log(test[i].getName() + " : " + curr_charseq);
            }
            }
            console.log("Unicode letterid (primaryKey): " + keyboard_key.e())
            this["a"](i, i1, i2, i3, i4);
            console.log("Current cursor position: " + getCurrentCursorPosition());
        }
        else
        {
            // this would delete every input once enter is pressed

            let mKeys = this["_f"].value;
            let backspace = undefined;
            for(let i = 0; i < mKeys.length; ++i)
                if(mKeys[i].e() === -5)
                    backspace = i;
            while(getCurrentCursorPosition() !== 0)
            {
                this["a"](backspace, mKeys[backspace].i.value, mKeys[backspace].k.value, i3, i4);
            }
            console.log("hallo");
            return;
            for(let i = 0; i < 10; ++i)
                this["a"](97, i1, i2, i3, i4);
            
        }

    };


    // TODO: 
        // parse https://github.com/AnySoftKeyboard/AnySoftKeyboard/blob/bae409df8396409474cb36d32b6a9b8bfc8733f3/api/src/main/java/com/anysoftkeyboard/api/KeyCodes.java#L3
        // check all settings 
        // build correct "userinput"


    let CandidateView = Java.use("com.anysoftkeyboard.keyboards.views.CandidateView");
    CandidateView["e"].implementation = function (list, z, z2) {
        let newList = Java.use("java.util.ArrayList").$new(0);
        newList.add(test);
        this["e"](newList, z, z2);
    };
});
"""

process = frida.get_usb_device().attach('AnySoftKeyboard')
script = process.create_script(jscode)
script.on('message', on_message)
print('[*] Running CTF')
script.load()
sys.stdin.read()