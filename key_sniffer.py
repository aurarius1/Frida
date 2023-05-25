import frida, sys

def on_message(message, data):
    if message['type'] == 'send':
        print("[*] {0}".format(message['payload']))
    else:
        print(message)

jscode = """
Java.perform(() => {
    let PointerTracker = Java.use("c.b.z.r0.x0");
    PointerTracker["a"].implementation = function (i, i1, i2, i3, i4) {
        console.log(i);
        this["a"](i, i1, i2, i3, i4);
    };
});
"""

process = frida.get_usb_device().attach('AnySoftKeyboard')
script = process.create_script(jscode)
script.on('message', on_message)
print('[*] Running CTF')
script.load()
sys.stdin.read()