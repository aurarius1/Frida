package p010b.p083u.p084e;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b.u.e.f */
/* loaded from: classes.dex */
public class RunnableC0934f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3592b;

    /* renamed from: c */
    public final /* synthetic */ C0970o f3593c;

    public RunnableC0934f(C0970o c0970o, ArrayList arrayList) {
        this.f3593c = c0970o;
        this.f3592b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f3592b.iterator();
        while (it.hasNext()) {
            C0962m c0962m = (C0962m) it.next();
            C0970o c0970o = this.f3593c;
            c0970o.getClass();
            AbstractC0941g2 abstractC0941g2 = c0962m.f3707a;
            View view = abstractC0941g2 == null ? null : abstractC0941g2.f3605c;
            AbstractC0941g2 abstractC0941g22 = c0962m.f3708b;
            View view2 = abstractC0941g22 != null ? abstractC0941g22.f3605c : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c0970o.f3663f);
                c0970o.f3746s.add(c0962m.f3707a);
                duration.translationX(c0962m.f3711e - c0962m.f3709c);
                duration.translationY(c0962m.f3712f - c0962m.f3710d);
                duration.alpha(0.0f).setListener(new C0954k(c0970o, c0962m, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                c0970o.f3746s.add(c0962m.f3708b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(c0970o.f3663f).alpha(1.0f).setListener(new C0958l(c0970o, c0962m, animate, view2)).start();
            }
        }
        this.f3592b.clear();
        this.f3593c.f3742o.remove(this.f3592b);
    }
}