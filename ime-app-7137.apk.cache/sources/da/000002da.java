package p010b.p046j.p058l;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;

/* renamed from: b.j.l.g */
/* loaded from: classes.dex */
public class HandlerC0598g extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C0600h f2717a;

    public HandlerC0598g(C0600h c0600h) {
        this.f2717a = c0600h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0598g(C0600h c0600h, Handler handler) {
        super(handler.getLooper());
        this.f2717a = c0600h;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C0600h c0600h = this.f2717a;
            c0600h.f2726i.onShowPress(c0600h.f2733p);
        } else if (i == 2) {
            C0600h c0600h2 = this.f2717a;
            c0600h2.f2725h.removeMessages(3);
            c0600h2.f2729l = false;
            c0600h2.f2730m = true;
            c0600h2.f2726i.onLongPress(c0600h2.f2733p);
        } else if (i != 3) {
            throw new RuntimeException("Unknown message " + message);
        } else {
            C0600h c0600h3 = this.f2717a;
            GestureDetector.OnDoubleTapListener onDoubleTapListener = c0600h3.f2727j;
            if (onDoubleTapListener != null) {
                if (c0600h3.f2728k) {
                    c0600h3.f2729l = true;
                } else {
                    onDoubleTapListener.onSingleTapConfirmed(c0600h3.f2733p);
                }
            }
        }
    }
}