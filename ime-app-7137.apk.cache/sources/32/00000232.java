package p010b.p037h.p040b.p041n.p042k;

import p010b.p037h.p040b.p041n.C0409d;
import p010b.p037h.p040b.p041n.C0410e;

/* renamed from: b.h.b.n.k.o */
/* loaded from: classes.dex */
public abstract class AbstractC0430o implements InterfaceC0420e {

    /* renamed from: a */
    public int f2200a;

    /* renamed from: b */
    public C0410e f2201b;

    /* renamed from: c */
    public C0428m f2202c;

    /* renamed from: d */
    public int f2203d;

    /* renamed from: e */
    public C0424i f2204e = new C0424i(this);

    /* renamed from: f */
    public int f2205f = 0;

    /* renamed from: g */
    public boolean f2206g = false;

    /* renamed from: h */
    public C0423h f2207h = new C0423h(this);

    /* renamed from: i */
    public C0423h f2208i = new C0423h(this);

    /* renamed from: j */
    public int f2209j = 1;

    public AbstractC0430o(C0410e c0410e) {
        this.f2201b = c0410e;
    }

    @Override // p010b.p037h.p040b.p041n.p042k.InterfaceC0420e
    /* renamed from: a */
    public abstract void mo2483a(InterfaceC0420e interfaceC0420e);

    /* renamed from: b */
    public final void m2482b(C0423h c0423h, C0423h c0423h2, int i) {
        c0423h.f2192l.add(c0423h2);
        c0423h.f2186f = i;
        c0423h2.f2191k.add(c0423h);
    }

    /* renamed from: c */
    public final void m2481c(C0423h c0423h, C0423h c0423h2, int i, C0424i c0424i) {
        c0423h.f2192l.add(c0423h2);
        c0423h.f2192l.add(this.f2204e);
        c0423h.f2188h = i;
        c0423h.f2189i = c0424i;
        c0423h2.f2191k.add(c0423h);
        c0424i.f2191k.add(c0423h);
    }

    /* renamed from: d */
    public abstract void mo2480d();

    /* renamed from: e */
    public abstract void mo2479e();

    /* renamed from: f */
    public abstract void mo2478f();

    /* renamed from: g */
    public final int m2477g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0410e c0410e = this.f2201b;
            int i3 = c0410e.f2113n;
            max = Math.max(c0410e.f2112m, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0410e c0410e2 = this.f2201b;
            int i4 = c0410e2.f2116q;
            max = Math.max(c0410e2.f2115p, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* renamed from: h */
    public final C0423h m2476h(C0409d c0409d) {
        AbstractC0430o abstractC0430o;
        AbstractC0430o abstractC0430o2;
        C0409d c0409d2 = c0409d.f2066d;
        if (c0409d2 == null) {
            return null;
        }
        C0410e c0410e = c0409d2.f2064b;
        int ordinal = c0409d2.f2065c.ordinal();
        if (ordinal == 1) {
            abstractC0430o = c0410e.f2102d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                abstractC0430o2 = c0410e.f2102d;
            } else if (ordinal != 4) {
                if (ordinal != 5) {
                    return null;
                }
                return c0410e.f2104e.f2198k;
            } else {
                abstractC0430o2 = c0410e.f2104e;
            }
            return abstractC0430o2.f2208i;
        } else {
            abstractC0430o = c0410e.f2104e;
        }
        return abstractC0430o.f2207h;
    }

    /* renamed from: i */
    public final C0423h m2475i(C0409d c0409d, int i) {
        C0409d c0409d2 = c0409d.f2066d;
        if (c0409d2 == null) {
            return null;
        }
        C0410e c0410e = c0409d2.f2064b;
        AbstractC0430o abstractC0430o = i == 0 ? c0410e.f2102d : c0410e.f2104e;
        int ordinal = c0409d2.f2065c.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return abstractC0430o.f2207h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return abstractC0430o.f2208i;
        }
        return null;
    }

    /* renamed from: j */
    public long mo2474j() {
        C0424i c0424i = this.f2204e;
        if (c0424i.f2190j) {
            return c0424i.f2187g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo2473k();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.f2200a == 3) goto L47;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2472l(C0409d c0409d, C0409d c0409d2, int i) {
        float f;
        int i2;
        int m2477g;
        C0423h m2476h = m2476h(c0409d);
        C0423h m2476h2 = m2476h(c0409d2);
        if (m2476h.f2190j && m2476h2.f2190j) {
            int m2545b = c0409d.m2545b() + m2476h.f2187g;
            int m2545b2 = m2476h2.f2187g - c0409d2.m2545b();
            int i3 = m2545b2 - m2545b;
            C0424i c0424i = this.f2204e;
            if (!c0424i.f2190j && this.f2203d == 3) {
                int i4 = this.f2200a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        int m2477g2 = m2477g(c0424i.f2193m, i);
                        C0424i c0424i2 = this.f2204e;
                        m2477g = Math.min(m2477g2, i3);
                        c0424i = c0424i2;
                    } else if (i4 == 2) {
                        C0410e c0410e = this.f2201b;
                        C0410e c0410e2 = c0410e.f2080K;
                        if (c0410e2 != null) {
                            C0424i c0424i3 = (i == 0 ? c0410e2.f2102d : c0410e2.f2104e).f2204e;
                            if (c0424i3.f2190j) {
                                i2 = (int) ((c0424i3.f2187g * (i == 0 ? c0410e.f2114o : c0410e.f2117r)) + 0.5f);
                            }
                        }
                    } else if (i4 == 3) {
                        C0410e c0410e3 = this.f2201b;
                        AbstractC0430o abstractC0430o = c0410e3.f2102d;
                        if (abstractC0430o.f2203d == 3 && abstractC0430o.f2200a == 3) {
                            C0429n c0429n = c0410e3.f2104e;
                            if (c0429n.f2203d == 3) {
                            }
                        }
                        if (i == 0) {
                            abstractC0430o = c0410e3.f2104e;
                        }
                        C0424i c0424i4 = abstractC0430o.f2204e;
                        if (c0424i4.f2190j) {
                            float f2 = c0410e3.f2083N;
                            m2477g = i == 1 ? (int) ((c0424i4.f2187g / f2) + 0.5f) : (int) ((f2 * c0424i4.f2187g) + 0.5f);
                        }
                    }
                    c0424i.mo2491c(m2477g);
                } else {
                    i2 = i3;
                }
                m2477g = m2477g(i2, i);
                c0424i.mo2491c(m2477g);
            }
            C0424i c0424i5 = this.f2204e;
            if (c0424i5.f2190j) {
                int i5 = c0424i5.f2187g;
                if (i5 == i3) {
                    this.f2207h.mo2491c(m2545b);
                    this.f2208i.mo2491c(m2545b2);
                    return;
                }
                C0410e c0410e4 = this.f2201b;
                if (i == 0) {
                    f = c0410e4.f2090U;
                } else {
                    f = c0410e4.f2091V;
                }
                if (m2476h == m2476h2) {
                    m2545b = m2476h.f2187g;
                    m2545b2 = m2476h2.f2187g;
                    f = 0.5f;
                }
                this.f2207h.mo2491c((int) ((((m2545b2 - m2545b) - i5) * f) + m2545b + 0.5f));
                this.f2208i.mo2491c(this.f2207h.f2187g + this.f2204e.f2187g);
            }
        }
    }
}