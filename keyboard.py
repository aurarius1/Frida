import frida, sys

def on_message(message, data):
    if message['type'] == 'send':
        print("[*] {0}".format(message['payload']))
    else:
        print(message)

jscode = """
Java.perform(() => {
    let CandidateView = Java.use("com.anysoftkeyboard.keyboards.views.CandidateView");
    CandidateView["e"].implementation = function (list, z, z2) {
        var iter = list.iterator();
        while(iter.hasNext()) {
            console.log(iter.next());
        }
        let newList = Java.use("java.util.ArrayList").$new(0);
        newList.add("Look at me I am the keyboard now! :)");
        console.log(`CandidateView.e is called: list=${list}, z=${z}, z2=${z2}`);
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