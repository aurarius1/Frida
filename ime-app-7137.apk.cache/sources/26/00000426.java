package p010b.p083u.p084e;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b.u.e.e */
/* loaded from: classes.dex */
public class RunnableC0930e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3584b;

    /* renamed from: c */
    public final /* synthetic */ C0970o f3585c;

    public RunnableC0930e(C0970o c0970o, ArrayList arrayList) {
        this.f3585c = c0970o;
        this.f3584b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f3584b.iterator();
        while (it.hasNext()) {
            C0966n c0966n = (C0966n) it.next();
            C0970o c0970o = this.f3585c;
            AbstractC0941g2 abstractC0941g2 = c0966n.f3723a;
            int i = c0966n.f3724b;
            int i2 = c0966n.f3725c;
            int i3 = c0966n.f3726d;
            int i4 = c0966n.f3727e;
            c0970o.getClass();
            View view = abstractC0941g2.f3605c;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            c0970o.f3744q.add(abstractC0941g2);
            animate.setDuration(c0970o.f3662e).setListener(new C0950j(c0970o, abstractC0941g2, i5, view, i6, animate)).start();
        }
        this.f3584b.clear();
        this.f3585c.f3741n.remove(this.f3584b);
    }
}