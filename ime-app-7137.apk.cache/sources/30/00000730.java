package p093c.p097b.p130z.p132r0.p134b1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.menny.android.anysoftkeyboard.R;
import java.lang.ref.WeakReference;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.b1.g */
/* loaded from: classes.dex */
public class HandlerC1708g extends Handler {

    /* renamed from: a */
    public final WeakReference f5279a;

    /* renamed from: b */
    public final long f5280b;

    public HandlerC1708g(C1709h c1709h, long j) {
        super(Looper.getMainLooper());
        this.f5280b = j;
        this.f5279a = new WeakReference(c1709h);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C1709h c1709h = (C1709h) this.f5279a.get();
        if (c1709h != null) {
            if (message.what == R.id.popup_manager_dismiss_preview_message_id) {
                Key key = (Key) message.obj;
                if (c1709h.m880g(key) || !c1709h.f5286f.containsKey(key)) {
                    return;
                }
                InterfaceC1704c interfaceC1704c = (InterfaceC1704c) c1709h.f5286f.remove(key);
                c1709h.f5284d.add(interfaceC1704c);
                try {
                    interfaceC1704c.dismiss();
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
            super.handleMessage(message);
        }
    }
}