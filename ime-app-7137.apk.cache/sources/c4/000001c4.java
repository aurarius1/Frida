package p010b.p016c.p026q;

import android.view.ViewParent;

/* renamed from: b.c.q.u1 */
/* loaded from: classes.dex */
public class RunnableC0320u1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractView$OnTouchListenerC0330w1 f1775b;

    public RunnableC0320u1(AbstractView$OnTouchListenerC0330w1 abstractView$OnTouchListenerC0330w1) {
        this.f1775b = abstractView$OnTouchListenerC0330w1;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewParent parent = this.f1775b.f1792e.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}