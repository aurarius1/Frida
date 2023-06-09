package p010b.p016c.p017k;

import android.os.Message;
import android.view.View;

/* renamed from: b.c.k.d */
/* loaded from: classes.dex */
public class View$OnClickListenerC0094d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0117o f879b;

    public View$OnClickListenerC0094d(C0117o c0117o) {
        this.f879b = c0117o;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Message message;
        Message message2;
        C0117o c0117o = this.f879b;
        Message obtain = ((view != c0117o.f1013o || (message2 = c0117o.f1015q) == null) && (view != c0117o.f1017s || (message2 = c0117o.f1019u) == null)) ? (view != c0117o.f1021w || (message = c0117o.f1023y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
        if (obtain != null) {
            obtain.sendToTarget();
        }
        C0117o c0117o2 = this.f879b;
        c0117o2.f997Q.obtainMessage(1, c0117o2.f1000b).sendToTarget();
    }
}