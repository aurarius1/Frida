package p010b.p083u.p084e;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.u.e.z0 */
/* loaded from: classes.dex */
public class RunnableC1012z0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RecyclerView f3903b;

    public RunnableC1012z0(RecyclerView recyclerView) {
        this.f3903b = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0956k1 abstractC0956k1 = this.f3903b.f743a0;
        if (abstractC0956k1 != null) {
            C0970o c0970o = (C0970o) abstractC0956k1;
            boolean z = !c0970o.f3736i.isEmpty();
            boolean z2 = !c0970o.f3738k.isEmpty();
            boolean z3 = !c0970o.f3739l.isEmpty();
            boolean z4 = !c0970o.f3737j.isEmpty();
            if (z || z2 || z4 || z3) {
                Iterator it = c0970o.f3736i.iterator();
                while (it.hasNext()) {
                    AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) it.next();
                    View view = abstractC0941g2.f3605c;
                    ViewPropertyAnimator animate = view.animate();
                    c0970o.f3745r.add(abstractC0941g2);
                    animate.setDuration(c0970o.f3661d).alpha(0.0f).setListener(new C0942h(c0970o, abstractC0941g2, animate, view)).start();
                }
                c0970o.f3736i.clear();
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(c0970o.f3738k);
                    c0970o.f3741n.add(arrayList);
                    c0970o.f3738k.clear();
                    RunnableC0930e runnableC0930e = new RunnableC0930e(c0970o, arrayList);
                    if (z) {
                        AbstractC0605j0.m2275H(((C0966n) arrayList.get(0)).f3723a.f3605c, runnableC0930e, c0970o.f3661d);
                    } else {
                        runnableC0930e.run();
                    }
                }
                if (z3) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(c0970o.f3739l);
                    c0970o.f3742o.add(arrayList2);
                    c0970o.f3739l.clear();
                    RunnableC0934f runnableC0934f = new RunnableC0934f(c0970o, arrayList2);
                    if (z) {
                        AbstractC0605j0.m2275H(((C0962m) arrayList2.get(0)).f3707a.f3605c, runnableC0934f, c0970o.f3661d);
                    } else {
                        runnableC0934f.run();
                    }
                }
                if (z4) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(c0970o.f3737j);
                    c0970o.f3740m.add(arrayList3);
                    c0970o.f3737j.clear();
                    RunnableC0938g runnableC0938g = new RunnableC0938g(c0970o, arrayList3);
                    if (z || z2 || z3) {
                        AbstractC0605j0.m2275H(((AbstractC0941g2) arrayList3.get(0)).f3605c, runnableC0938g, Math.max(z2 ? c0970o.f3662e : 0L, z3 ? c0970o.f3663f : 0L) + (z ? c0970o.f3661d : 0L));
                    } else {
                        runnableC0938g.run();
                    }
                }
            }
        }
        this.f3903b.f782y0 = false;
    }
}