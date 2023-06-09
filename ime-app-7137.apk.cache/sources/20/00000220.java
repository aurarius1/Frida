package p010b.p037h.p040b.p041n;

import p010b.p037h.p040b.C0395c;
import p010b.p037h.p040b.C0398f;
import p010b.p037h.p040b.C0404l;

/* renamed from: b.h.b.n.g */
/* loaded from: classes.dex */
public class C0412g extends C0410e {

    /* renamed from: e0 */
    public float f2141e0 = -1.0f;

    /* renamed from: f0 */
    public int f2142f0 = -1;

    /* renamed from: g0 */
    public int f2143g0 = -1;

    /* renamed from: h0 */
    public C0409d f2144h0 = this.f2125z;

    /* renamed from: i0 */
    public int f2145i0 = 0;

    public C0412g() {
        this.f2077H.clear();
        this.f2077H.add(this.f2144h0);
        int length = this.f2076G.length;
        for (int i = 0; i < length; i++) {
            this.f2076G[i] = this.f2144h0;
        }
    }

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: C */
    public void mo2509C(C0398f c0398f) {
        if (this.f2080K == null) {
            return;
        }
        int m2581o = c0398f.m2581o(this.f2144h0);
        if (this.f2145i0 == 1) {
            this.f2085P = m2581o;
            this.f2086Q = 0;
            m2523v(this.f2080K.m2535h());
            m2540A(0);
            return;
        }
        this.f2085P = 0;
        this.f2086Q = m2581o;
        m2540A(this.f2080K.m2529n());
        m2523v(0);
    }

    /* renamed from: D */
    public void m2508D(int i) {
        if (this.f2145i0 == i) {
            return;
        }
        this.f2145i0 = i;
        this.f2077H.clear();
        this.f2144h0 = this.f2145i0 == 1 ? this.f2124y : this.f2125z;
        this.f2077H.add(this.f2144h0);
        int length = this.f2076G.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f2076G[i2] = this.f2144h0;
        }
    }

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: a */
    public void mo2507a(C0398f c0398f) {
        C0411f c0411f = (C0411f) this.f2080K;
        if (c0411f == null) {
            return;
        }
        C0409d mo2505e = c0411f.mo2505e(EnumC0408c.LEFT);
        C0409d mo2505e2 = c0411f.mo2505e(EnumC0408c.RIGHT);
        C0410e c0410e = this.f2080K;
        boolean z = true;
        boolean z2 = c0410e != null && c0410e.f2079J[0] == 2;
        if (this.f2145i0 == 0) {
            mo2505e = c0411f.mo2505e(EnumC0408c.TOP);
            mo2505e2 = c0411f.mo2505e(EnumC0408c.BOTTOM);
            C0410e c0410e2 = this.f2080K;
            z2 = (c0410e2 == null || c0410e2.f2079J[1] != 2) ? false : false;
        }
        if (this.f2142f0 != -1) {
            C0404l m2584l = c0398f.m2584l(this.f2144h0);
            c0398f.m2592d(m2584l, c0398f.m2584l(mo2505e), this.f2142f0, 8);
            if (z2) {
                c0398f.m2590f(c0398f.m2584l(mo2505e2), m2584l, 0, 5);
            }
        } else if (this.f2143g0 != -1) {
            C0404l m2584l2 = c0398f.m2584l(this.f2144h0);
            C0404l m2584l3 = c0398f.m2584l(mo2505e2);
            c0398f.m2592d(m2584l2, m2584l3, -this.f2143g0, 8);
            if (z2) {
                c0398f.m2590f(m2584l2, c0398f.m2584l(mo2505e), 0, 5);
                c0398f.m2590f(m2584l3, m2584l2, 0, 5);
            }
        } else if (this.f2141e0 != -1.0f) {
            C0404l m2584l4 = c0398f.m2584l(this.f2144h0);
            C0404l m2584l5 = c0398f.m2584l(mo2505e2);
            float f = this.f2141e0;
            C0395c m2583m = c0398f.m2583m();
            m2583m.f1962d.mo2558c(m2584l4, -1.0f);
            m2583m.f1962d.mo2558c(m2584l5, f);
            c0398f.m2593c(m2583m);
        }
    }

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: b */
    public boolean mo2506b() {
        return true;
    }

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: e */
    public C0409d mo2505e(EnumC0408c enumC0408c) {
        switch (enumC0408c.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f2145i0 == 1) {
                    return this.f2144h0;
                }
                break;
            case 2:
            case 4:
                if (this.f2145i0 == 0) {
                    return this.f2144h0;
                }
                break;
        }
        throw new AssertionError(enumC0408c.name());
    }
}