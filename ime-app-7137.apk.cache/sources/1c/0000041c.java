package p010b.p083u.p084e;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.b1 */
/* loaded from: classes.dex */
public class C0920b1 {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3538a;

    public C0920b1(RecyclerView recyclerView) {
        this.f3538a = recyclerView;
    }

    /* renamed from: a */
    public void m1718a(AbstractC0941g2 abstractC0941g2, C0952j1 c0952j1, C0952j1 c0952j12) {
        boolean z;
        int i;
        int i2;
        RecyclerView recyclerView = this.f3538a;
        recyclerView.getClass();
        abstractC0941g2.m1652u(false);
        C0970o c0970o = (C0970o) recyclerView.f743a0;
        c0970o.getClass();
        if (c0952j1 == null || ((i = c0952j1.f3645a) == (i2 = c0952j12.f3645a) && c0952j1.f3646b == c0952j12.f3646b)) {
            c0970o.m1602n(abstractC0941g2);
            abstractC0941g2.f3605c.setAlpha(0.0f);
            c0970o.f3737j.add(abstractC0941g2);
            z = true;
        } else {
            z = c0970o.m1607i(abstractC0941g2, i, c0952j1.f3646b, i2, c0952j12.f3646b);
        }
        if (z) {
            recyclerView.m3172a0();
        }
    }

    /* renamed from: b */
    public void m1717b(AbstractC0941g2 abstractC0941g2, C0952j1 c0952j1, C0952j1 c0952j12) {
        boolean z;
        this.f3538a.f755l.m1396l(abstractC0941g2);
        RecyclerView recyclerView = this.f3538a;
        recyclerView.m3164f(abstractC0941g2);
        abstractC0941g2.m1652u(false);
        C0970o c0970o = (C0970o) recyclerView.f743a0;
        c0970o.getClass();
        int i = c0952j1.f3645a;
        int i2 = c0952j1.f3646b;
        View view = abstractC0941g2.f3605c;
        int left = c0952j12 == null ? view.getLeft() : c0952j12.f3645a;
        int top = c0952j12 == null ? view.getTop() : c0952j12.f3646b;
        if (abstractC0941g2.m1659n() || (i == left && i2 == top)) {
            c0970o.m1602n(abstractC0941g2);
            c0970o.f3736i.add(abstractC0941g2);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = c0970o.m1607i(abstractC0941g2, i, i2, left, top);
        }
        if (z) {
            recyclerView.m3172a0();
        }
    }
}