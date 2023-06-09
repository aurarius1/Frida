package p010b.p083u.p084e;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.d1 */
/* loaded from: classes.dex */
public class C0928d1 {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3569a;

    public C0928d1(RecyclerView recyclerView) {
        this.f3569a = recyclerView;
    }

    /* renamed from: a */
    public void m1690a(C0914a c0914a) {
        int i = c0914a.f3525a;
        if (i == 1) {
            RecyclerView recyclerView = this.f3569a;
            recyclerView.f777w.mo1511p0(recyclerView, c0914a.f3526b, c0914a.f3528d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f3569a;
            recyclerView2.f777w.mo1505s0(recyclerView2, c0914a.f3526b, c0914a.f3528d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f3569a;
            recyclerView3.f777w.mo1501u0(recyclerView3, c0914a.f3526b, c0914a.f3528d, c0914a.f3527c);
        } else if (i != 8) {
        } else {
            RecyclerView recyclerView4 = this.f3569a;
            recyclerView4.f777w.mo1507r0(recyclerView4, c0914a.f3526b, c0914a.f3528d, 1);
        }
    }

    /* renamed from: b */
    public AbstractC0941g2 m1689b(int i) {
        RecyclerView recyclerView = this.f3569a;
        int m1695h = recyclerView.f761o.m1695h();
        int i2 = 0;
        AbstractC0941g2 abstractC0941g2 = null;
        while (true) {
            if (i2 >= m1695h) {
                break;
            }
            AbstractC0941g2 m3189K = RecyclerView.m3189K(recyclerView.f761o.m1696g(i2));
            if (m3189K != null && !m3189K.m1659n() && m3189K.f3607e == i) {
                if (!recyclerView.f761o.m1692k(m3189K.f3605c)) {
                    abstractC0941g2 = m3189K;
                    break;
                }
                abstractC0941g2 = m3189K;
            }
            i2++;
        }
        if (abstractC0941g2 == null || this.f3569a.f761o.m1692k(abstractC0941g2.f3605c)) {
            return null;
        }
        return abstractC0941g2;
    }

    /* renamed from: c */
    public void m1688c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3569a;
        int m1695h = recyclerView.f761o.m1695h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m1695h; i6++) {
            View m1696g = recyclerView.f761o.m1696g(i6);
            AbstractC0941g2 m3189K = RecyclerView.m3189K(m1696g);
            if (m3189K != null && !m3189K.m1651v() && (i4 = m3189K.f3607e) >= i && i4 < i5) {
                m3189K.m1671b(2);
                m3189K.m1672a(obj);
                ((C0984r1) m1696g.getLayoutParams()).f3815c = true;
            }
        }
        C1007x1 c1007x1 = recyclerView.f755l;
        int size = c1007x1.f3894c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f3569a.f778w0 = true;
                return;
            }
            AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) c1007x1.f3894c.get(size);
            if (abstractC0941g2 != null && (i3 = abstractC0941g2.f3607e) >= i && i3 < i5) {
                abstractC0941g2.m1671b(2);
                c1007x1.m1401g(size);
            }
        }
    }

    /* renamed from: d */
    public void m1687d(int i, int i2) {
        RecyclerView recyclerView = this.f3569a;
        int m1695h = recyclerView.f761o.m1695h();
        for (int i3 = 0; i3 < m1695h; i3++) {
            AbstractC0941g2 m3189K = RecyclerView.m3189K(recyclerView.f761o.m1696g(i3));
            if (m3189K != null && !m3189K.m1651v() && m3189K.f3607e >= i) {
                m3189K.m1655r(i2, false);
                recyclerView.f770s0.f3575f = true;
            }
        }
        C1007x1 c1007x1 = recyclerView.f755l;
        int size = c1007x1.f3894c.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) c1007x1.f3894c.get(i4);
            if (abstractC0941g2 != null && abstractC0941g2.f3607e >= i) {
                abstractC0941g2.m1655r(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.f3569a.f776v0 = true;
    }

    /* renamed from: e */
    public void m1686e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f3569a;
        int m1695h = recyclerView.f761o.m1695h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < m1695h; i11++) {
            AbstractC0941g2 m3189K = RecyclerView.m3189K(recyclerView.f761o.m1696g(i11));
            if (m3189K != null && (i9 = m3189K.f3607e) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    m3189K.m1655r(i2 - i, false);
                } else {
                    m3189K.m1655r(i5, false);
                }
                recyclerView.f770s0.f3575f = true;
            }
        }
        C1007x1 c1007x1 = recyclerView.f755l;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = c1007x1.f3894c.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) c1007x1.f3894c.get(i12);
            if (abstractC0941g2 != null && (i8 = abstractC0941g2.f3607e) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0941g2.m1655r(i2 - i, false);
                } else {
                    abstractC0941g2.m1655r(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f3569a.f776v0 = true;
    }
}