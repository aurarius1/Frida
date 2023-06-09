package p010b.p083u.p084e;

import android.view.View;
import java.util.List;

/* renamed from: b.u.e.p0 */
/* loaded from: classes.dex */
public class C0975p0 {

    /* renamed from: b */
    public int f3756b;

    /* renamed from: c */
    public int f3757c;

    /* renamed from: d */
    public int f3758d;

    /* renamed from: e */
    public int f3759e;

    /* renamed from: f */
    public int f3760f;

    /* renamed from: g */
    public int f3761g;

    /* renamed from: j */
    public int f3764j;

    /* renamed from: l */
    public boolean f3766l;

    /* renamed from: a */
    public boolean f3755a = true;

    /* renamed from: h */
    public int f3762h = 0;

    /* renamed from: i */
    public int f3763i = 0;

    /* renamed from: k */
    public List f3765k = null;

    /* renamed from: a */
    public void m1595a(View view) {
        int m1473a;
        int size = this.f3765k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC0941g2) this.f3765k.get(i2)).f3605c;
            C0984r1 c0984r1 = (C0984r1) view3.getLayoutParams();
            if (view3 != view && !c0984r1.m1471c() && (m1473a = (c0984r1.m1473a() - this.f3758d) * this.f3759e) >= 0 && m1473a < i) {
                view2 = view3;
                if (m1473a == 0) {
                    break;
                }
                i = m1473a;
            }
        }
        this.f3758d = view2 == null ? -1 : ((C0984r1) view2.getLayoutParams()).m1473a();
    }

    /* renamed from: b */
    public boolean m1594b(C0929d2 c0929d2) {
        int i = this.f3758d;
        return i >= 0 && i < c0929d2.m1684b();
    }

    /* renamed from: c */
    public View m1593c(C1007x1 c1007x1) {
        List list = this.f3765k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((AbstractC0941g2) this.f3765k.get(i)).f3605c;
                C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
                if (!c0984r1.m1471c() && this.f3758d == c0984r1.m1473a()) {
                    m1595a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = c1007x1.m1397k(this.f3758d, false, Long.MAX_VALUE).f3605c;
        this.f3758d += this.f3759e;
        return view2;
    }
}