package p010b.p083u.p084e;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b.u.e.g */
/* loaded from: classes.dex */
public class RunnableC0938g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3602b;

    /* renamed from: c */
    public final /* synthetic */ C0970o f3603c;

    public RunnableC0938g(C0970o c0970o, ArrayList arrayList) {
        this.f3603c = c0970o;
        this.f3602b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f3602b.iterator();
        while (it.hasNext()) {
            AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) it.next();
            C0970o c0970o = this.f3603c;
            c0970o.getClass();
            View view = abstractC0941g2.f3605c;
            ViewPropertyAnimator animate = view.animate();
            c0970o.f3743p.add(abstractC0941g2);
            animate.alpha(1.0f).setDuration(c0970o.f3660c).setListener(new C0946i(c0970o, abstractC0941g2, view, animate)).start();
        }
        this.f3602b.clear();
        this.f3603c.f3740m.remove(this.f3602b);
    }
}