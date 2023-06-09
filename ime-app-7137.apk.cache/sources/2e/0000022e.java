package p010b.p037h.p040b.p041n.p042k;

import p010b.p037h.p040b.p041n.C0406a;
import p010b.p037h.p040b.p041n.C0410e;

/* renamed from: b.h.b.n.k.k */
/* loaded from: classes.dex */
public class C0426k extends AbstractC0430o {
    public C0426k(C0410e c0410e) {
        super(c0410e);
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o, p010b.p037h.p040b.p041n.p042k.InterfaceC0420e
    /* renamed from: a */
    public void mo2483a(InterfaceC0420e interfaceC0420e) {
        C0406a c0406a = (C0406a) this.f2201b;
        int i = c0406a.f2030g0;
        int i2 = 0;
        int i3 = -1;
        for (C0423h c0423h : this.f2207h.f2192l) {
            int i4 = c0423h.f2187g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            this.f2207h.mo2491c(i2 + c0406a.f2032i0);
        } else {
            this.f2207h.mo2491c(i3 + c0406a.f2032i0);
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: d */
    public void mo2480d() {
        AbstractC0430o abstractC0430o;
        C0410e c0410e = this.f2201b;
        if (c0410e instanceof C0406a) {
            C0423h c0423h = this.f2207h;
            c0423h.f2182b = true;
            C0406a c0406a = (C0406a) c0410e;
            int i = c0406a.f2030g0;
            boolean z = c0406a.f2031h0;
            int i2 = 0;
            if (i == 0) {
                c0423h.f2185e = EnumC0422g.LEFT;
                while (i2 < c0406a.f2147f0) {
                    C0410e c0410e2 = c0406a.f2146e0[i2];
                    if (z || c0410e2.f2093X != 8) {
                        C0423h c0423h2 = c0410e2.f2102d.f2207h;
                        c0423h2.f2191k.add(this.f2207h);
                        this.f2207h.f2192l.add(c0423h2);
                    }
                    i2++;
                }
            } else if (i != 1) {
                if (i == 2) {
                    c0423h.f2185e = EnumC0422g.TOP;
                    while (i2 < c0406a.f2147f0) {
                        C0410e c0410e3 = c0406a.f2146e0[i2];
                        if (z || c0410e3.f2093X != 8) {
                            C0423h c0423h3 = c0410e3.f2104e.f2207h;
                            c0423h3.f2191k.add(this.f2207h);
                            this.f2207h.f2192l.add(c0423h3);
                        }
                        i2++;
                    }
                } else if (i != 3) {
                    return;
                } else {
                    c0423h.f2185e = EnumC0422g.BOTTOM;
                    while (i2 < c0406a.f2147f0) {
                        C0410e c0410e4 = c0406a.f2146e0[i2];
                        if (z || c0410e4.f2093X != 8) {
                            C0423h c0423h4 = c0410e4.f2104e.f2208i;
                            c0423h4.f2191k.add(this.f2207h);
                            this.f2207h.f2192l.add(c0423h4);
                        }
                        i2++;
                    }
                }
                m2489m(this.f2201b.f2104e.f2207h);
                abstractC0430o = this.f2201b.f2104e;
                m2489m(abstractC0430o.f2208i);
            } else {
                c0423h.f2185e = EnumC0422g.RIGHT;
                while (i2 < c0406a.f2147f0) {
                    C0410e c0410e5 = c0406a.f2146e0[i2];
                    if (z || c0410e5.f2093X != 8) {
                        C0423h c0423h5 = c0410e5.f2102d.f2208i;
                        c0423h5.f2191k.add(this.f2207h);
                        this.f2207h.f2192l.add(c0423h5);
                    }
                    i2++;
                }
            }
            m2489m(this.f2201b.f2102d.f2207h);
            abstractC0430o = this.f2201b.f2102d;
            m2489m(abstractC0430o.f2208i);
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: e */
    public void mo2479e() {
        C0410e c0410e = this.f2201b;
        if (c0410e instanceof C0406a) {
            int i = ((C0406a) c0410e).f2030g0;
            if (i != 0 && i != 1) {
                c0410e.f2086Q = this.f2207h.f2187g;
            } else {
                c0410e.f2085P = this.f2207h.f2187g;
            }
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: f */
    public void mo2478f() {
        this.f2202c = null;
        this.f2207h.m2492b();
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: k */
    public boolean mo2473k() {
        return false;
    }

    /* renamed from: m */
    public final void m2489m(C0423h c0423h) {
        this.f2207h.f2191k.add(c0423h);
        c0423h.f2192l.add(this.f2207h);
    }
}