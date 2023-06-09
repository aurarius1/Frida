package p093c.p097b.p130z.p132r0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;
import java.lang.ref.WeakReference;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.a0 */
/* loaded from: classes.dex */
public class HandlerC1694a0 extends Handler {

    /* renamed from: a */
    public final WeakReference f5250a;

    /* renamed from: b */
    public boolean f5251b;

    public HandlerC1694a0(AnyKeyboardViewBase anyKeyboardViewBase) {
        super(Looper.getMainLooper());
        this.f5250a = new WeakReference(anyKeyboardViewBase);
    }

    /* renamed from: a */
    public void m890a() {
        this.f5251b = false;
        removeMessages(3);
        removeMessages(4);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        AnyKeyboardViewBase anyKeyboardViewBase = (AnyKeyboardViewBase) this.f5250a.get();
        if (anyKeyboardViewBase == null) {
            return;
        }
        PointerTracker pointerTracker = (PointerTracker) message.obj;
        Key key = pointerTracker.getKey(message.arg1);
        int i = message.what;
        if (i != 3) {
            if (i != 4) {
                super.handleMessage(message);
                return;
            } else if (key == null || !anyKeyboardViewBase.mo389x(anyKeyboardViewBase.getKeyboard().f5134d, key, false, pointerTracker)) {
                return;
            } else {
                anyKeyboardViewBase.f6523u.mo473b(key);
                return;
            }
        }
        if (!(key instanceof Key) || key.f5211C == 0) {
            pointerTracker.m847i(message.arg1);
        } else {
            anyKeyboardViewBase.mo389x(anyKeyboardViewBase.getKeyboard().f5134d, key, false, pointerTracker);
        }
        int i2 = message.arg1;
        this.f5251b = true;
        sendMessageDelayed(obtainMessage(3, i2, 0, pointerTracker), anyKeyboardViewBase.f6502j);
    }
}