package p010b.p016c.p026q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: b.c.q.v1 */
/* loaded from: classes.dex */
public class RunnableC0325v1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractView$OnTouchListenerC0330w1 f1781b;

    public RunnableC0325v1(AbstractView$OnTouchListenerC0330w1 abstractView$OnTouchListenerC0330w1) {
        this.f1781b = abstractView$OnTouchListenerC0330w1;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractView$OnTouchListenerC0330w1 abstractView$OnTouchListenerC0330w1 = this.f1781b;
        abstractView$OnTouchListenerC0330w1.m2732a();
        View view = abstractView$OnTouchListenerC0330w1.f1792e;
        if (view.isEnabled() && !view.isLongClickable() && abstractView$OnTouchListenerC0330w1.mo2730c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            abstractView$OnTouchListenerC0330w1.f1795h = true;
        }
    }
}