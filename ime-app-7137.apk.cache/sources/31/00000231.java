package p010b.p037h.p040b.p041n.p042k;

import java.util.List;
import p010b.p037h.p040b.AbstractC0403k;
import p010b.p037h.p040b.p041n.C0409d;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.EnumC0408c;
import p010b.p037h.p040b.p041n.InterfaceC0413h;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.n.k.n */
/* loaded from: classes.dex */
public class C0429n extends AbstractC0430o {

    /* renamed from: k */
    public C0423h f2198k;

    /* renamed from: l */
    public C0424i f2199l;

    public C0429n(C0410e c0410e) {
        super(c0410e);
        C0423h c0423h = new C0423h(this);
        this.f2198k = c0423h;
        this.f2199l = null;
        this.f2207h.f2185e = EnumC0422g.TOP;
        this.f2208i.f2185e = EnumC0422g.BOTTOM;
        c0423h.f2185e = EnumC0422g.BASELINE;
        this.f2205f = 1;
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o, p010b.p037h.p040b.p041n.p042k.InterfaceC0420e
    /* renamed from: a */
    public void mo2483a(InterfaceC0420e interfaceC0420e) {
        float f;
        float f2;
        float f3;
        int i;
        int m2567a = AbstractC0403k.m2567a(this.f2209j);
        if (m2567a != 1 && m2567a != 2 && m2567a == 3) {
            C0410e c0410e = this.f2201b;
            m2472l(c0410e.f2125z, c0410e.f2071B, 1);
            return;
        }
        C0424i c0424i = this.f2204e;
        if (c0424i.f2183c && !c0424i.f2190j && this.f2203d == 3) {
            C0410e c0410e2 = this.f2201b;
            int i2 = c0410e2.f2110k;
            if (i2 == 2) {
                C0410e c0410e3 = c0410e2.f2080K;
                if (c0410e3 != null) {
                    C0424i c0424i2 = c0410e3.f2104e.f2204e;
                    if (c0424i2.f2190j) {
                        f = c0410e2.f2117r;
                        f2 = c0424i2.f2187g;
                        f3 = f2 * f;
                    }
                }
            } else if (i2 == 3) {
                C0424i c0424i3 = c0410e2.f2102d.f2204e;
                if (c0424i3.f2190j) {
                    int i3 = c0410e2.f2084O;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f2 = c0424i3.f2187g;
                            f = c0410e2.f2083N;
                            f3 = f2 * f;
                        } else if (i3 != 1) {
                            i = 0;
                            c0424i.mo2491c(i);
                        }
                    }
                    f3 = c0424i3.f2187g / c0410e2.f2083N;
                }
            }
            i = (int) (f3 + 0.5f);
            c0424i.mo2491c(i);
        }
        C0423h c0423h = this.f2207h;
        if (c0423h.f2183c) {
            C0423h c0423h2 = this.f2208i;
            if (c0423h2.f2183c) {
                if (c0423h.f2190j && c0423h2.f2190j && this.f2204e.f2190j) {
                    return;
                }
                if (!this.f2204e.f2190j && this.f2203d == 3) {
                    C0410e c0410e4 = this.f2201b;
                    if (c0410e4.f2109j == 0 && !c0410e4.m2524s()) {
                        int i4 = ((C0423h) this.f2207h.f2192l.get(0)).f2187g;
                        C0423h c0423h3 = this.f2207h;
                        int i5 = i4 + c0423h3.f2186f;
                        int i6 = ((C0423h) this.f2208i.f2192l.get(0)).f2187g + this.f2208i.f2186f;
                        c0423h3.mo2491c(i5);
                        this.f2208i.mo2491c(i6);
                        this.f2204e.mo2491c(i6 - i5);
                        return;
                    }
                }
                if (!this.f2204e.f2190j && this.f2203d == 3 && this.f2200a == 1 && this.f2207h.f2192l.size() > 0 && this.f2208i.f2192l.size() > 0) {
                    int i7 = (((C0423h) this.f2208i.f2192l.get(0)).f2187g + this.f2208i.f2186f) - (((C0423h) this.f2207h.f2192l.get(0)).f2187g + this.f2207h.f2186f);
                    C0424i c0424i4 = this.f2204e;
                    int i8 = c0424i4.f2193m;
                    if (i7 < i8) {
                        c0424i4.mo2491c(i7);
                    } else {
                        c0424i4.mo2491c(i8);
                    }
                }
                if (this.f2204e.f2190j && this.f2207h.f2192l.size() > 0 && this.f2208i.f2192l.size() > 0) {
                    C0423h c0423h4 = (C0423h) this.f2207h.f2192l.get(0);
                    C0423h c0423h5 = (C0423h) this.f2208i.f2192l.get(0);
                    int i9 = c0423h4.f2187g;
                    C0423h c0423h6 = this.f2207h;
                    int i10 = c0423h6.f2186f + i9;
                    int i11 = c0423h5.f2187g;
                    int i12 = this.f2208i.f2186f + i11;
                    float f4 = this.f2201b.f2091V;
                    if (c0423h4 == c0423h5) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    c0423h6.mo2491c((int) ((((i11 - i9) - this.f2204e.f2187g) * f4) + i9 + 0.5f));
                    this.f2208i.mo2491c(this.f2207h.f2187g + this.f2204e.f2187g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0309, code lost:
        if (r9.f2201b.f2122w != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035c, code lost:
        if (r0.f2203d == 3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0395, code lost:
        if (r9.f2201b.f2122w != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0397, code lost:
        r0 = r9.f2198k;
        r1 = r9.f2207h;
        r3 = r9.f2199l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x040a, code lost:
        if (r0.f2203d == 3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x040c, code lost:
        r0.f2204e.f2191k.add(r9.f2204e);
        r9.f2204e.f2192l.add(r9.f2201b.f2102d.f2204e);
        r9.f2204e.f2181a = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2480d() {
        C0410e c0410e;
        C0410e c0410e2;
        C0427l c0427l;
        C0423h c0423h;
        C0423h c0423h2;
        C0424i c0424i;
        List list;
        C0410e c0410e3;
        C0410e c0410e4;
        C0410e c0410e5 = this.f2201b;
        if (c0410e5.f2096a) {
            this.f2204e.mo2491c(c0410e5.m2535h());
        }
        if (!this.f2204e.f2190j) {
            this.f2203d = this.f2201b.m2530m();
            if (this.f2201b.f2122w) {
                this.f2199l = new C0416a(this);
            }
            int i = this.f2203d;
            if (i != 3) {
                if (i == 4 && (c0410e4 = this.f2201b.f2080K) != null && c0410e4.m2530m() == 1) {
                    int m2535h = (c0410e4.m2535h() - this.f2201b.f2125z.m2545b()) - this.f2201b.f2071B.m2545b();
                    m2482b(this.f2207h, c0410e4.f2104e.f2207h, this.f2201b.f2125z.m2545b());
                    m2482b(this.f2208i, c0410e4.f2104e.f2208i, -this.f2201b.f2071B.m2545b());
                    this.f2204e.mo2491c(m2535h);
                    return;
                } else if (this.f2203d == 1) {
                    this.f2204e.mo2491c(this.f2201b.m2535h());
                }
            }
        } else if (this.f2203d == 4 && (c0410e = this.f2201b.f2080K) != null && c0410e.m2530m() == 1) {
            m2482b(this.f2207h, c0410e.f2104e.f2207h, this.f2201b.f2125z.m2545b());
            m2482b(this.f2208i, c0410e.f2104e.f2208i, -this.f2201b.f2071B.m2545b());
            return;
        }
        C0424i c0424i2 = this.f2204e;
        boolean z = c0424i2.f2190j;
        if (z) {
            C0410e c0410e6 = this.f2201b;
            if (c0410e6.f2096a) {
                C0409d[] c0409dArr = c0410e6.f2076G;
                if (c0409dArr[2].f2066d != null && c0409dArr[3].f2066d != null) {
                    if (c0410e6.m2524s()) {
                        this.f2207h.f2186f = this.f2201b.f2076G[2].m2545b();
                        this.f2208i.f2186f = -this.f2201b.f2076G[3].m2545b();
                    } else {
                        C0423h m2476h = m2476h(this.f2201b.f2076G[2]);
                        if (m2476h != null) {
                            C0423h c0423h3 = this.f2207h;
                            int m2545b = this.f2201b.f2076G[2].m2545b();
                            c0423h3.f2192l.add(m2476h);
                            c0423h3.f2186f = m2545b;
                            m2476h.f2191k.add(c0423h3);
                        }
                        C0423h m2476h2 = m2476h(this.f2201b.f2076G[3]);
                        if (m2476h2 != null) {
                            C0423h c0423h4 = this.f2208i;
                            c0423h4.f2192l.add(m2476h2);
                            c0423h4.f2186f = -this.f2201b.f2076G[3].m2545b();
                            m2476h2.f2191k.add(c0423h4);
                        }
                        this.f2207h.f2182b = true;
                        this.f2208i.f2182b = true;
                    }
                    c0410e3 = this.f2201b;
                    if (!c0410e3.f2122w) {
                        return;
                    }
                } else if (c0409dArr[2].f2066d != null) {
                    C0423h m2476h3 = m2476h(c0409dArr[2]);
                    if (m2476h3 == null) {
                        return;
                    }
                    C0423h c0423h5 = this.f2207h;
                    int m2545b2 = this.f2201b.f2076G[2].m2545b();
                    c0423h5.f2192l.add(m2476h3);
                    c0423h5.f2186f = m2545b2;
                    m2476h3.f2191k.add(c0423h5);
                    m2482b(this.f2208i, this.f2207h, this.f2204e.f2187g);
                    c0410e3 = this.f2201b;
                    if (!c0410e3.f2122w) {
                        return;
                    }
                } else if (c0409dArr[3].f2066d != null) {
                    C0423h m2476h4 = m2476h(c0409dArr[3]);
                    if (m2476h4 != null) {
                        C0423h c0423h6 = this.f2208i;
                        c0423h6.f2192l.add(m2476h4);
                        c0423h6.f2186f = -this.f2201b.f2076G[3].m2545b();
                        m2476h4.f2191k.add(c0423h6);
                        m2482b(this.f2207h, this.f2208i, -this.f2204e.f2187g);
                    }
                    c0410e3 = this.f2201b;
                    if (!c0410e3.f2122w) {
                        return;
                    }
                } else if (c0409dArr[4].f2066d != null) {
                    C0423h m2476h5 = m2476h(c0409dArr[4]);
                    if (m2476h5 != null) {
                        C0423h c0423h7 = this.f2198k;
                        c0423h7.f2192l.add(m2476h5);
                        c0423h7.f2186f = 0;
                        m2476h5.f2191k.add(c0423h7);
                        m2482b(this.f2207h, this.f2198k, -this.f2201b.f2087R);
                        m2482b(this.f2208i, this.f2207h, this.f2204e.f2187g);
                        return;
                    }
                    return;
                } else if ((c0410e6 instanceof InterfaceC0413h) || c0410e6.f2080K == null || c0410e6.mo2505e(EnumC0408c.CENTER).f2066d != null) {
                    return;
                } else {
                    C0410e c0410e7 = this.f2201b;
                    m2482b(this.f2207h, c0410e7.f2080K.f2104e.f2207h, c0410e7.m2527p());
                    m2482b(this.f2208i, this.f2207h, this.f2204e.f2187g);
                    c0410e3 = this.f2201b;
                    if (!c0410e3.f2122w) {
                        return;
                    }
                }
                m2482b(this.f2198k, this.f2207h, c0410e3.f2087R);
                return;
            }
        }
        if (z || this.f2203d != 3) {
            c0424i2.f2191k.add(this);
            if (c0424i2.f2190j) {
                mo2483a(this);
            }
        } else {
            C0410e c0410e8 = this.f2201b;
            int i2 = c0410e8.f2110k;
            if (i2 == 2) {
                C0410e c0410e9 = c0410e8.f2080K;
                if (c0410e9 != null) {
                    C0424i c0424i3 = c0410e9.f2104e.f2204e;
                    c0424i2.f2192l.add(c0424i3);
                    list = c0424i3.f2191k;
                    list.add(this.f2204e);
                    C0424i c0424i4 = this.f2204e;
                    c0424i4.f2182b = true;
                    c0424i4.f2191k.add(this.f2207h);
                    this.f2204e.f2191k.add(this.f2208i);
                }
            } else if (i2 == 3 && !c0410e8.m2524s()) {
                C0410e c0410e10 = this.f2201b;
                if (c0410e10.f2109j != 3) {
                    C0424i c0424i5 = c0410e10.f2102d.f2204e;
                    this.f2204e.f2192l.add(c0424i5);
                    list = c0424i5.f2191k;
                    list.add(this.f2204e);
                    C0424i c0424i42 = this.f2204e;
                    c0424i42.f2182b = true;
                    c0424i42.f2191k.add(this.f2207h);
                    this.f2204e.f2191k.add(this.f2208i);
                }
            }
        }
        C0410e c0410e11 = this.f2201b;
        C0409d[] c0409dArr2 = c0410e11.f2076G;
        if (c0409dArr2[2].f2066d == null || c0409dArr2[3].f2066d == null) {
            if (c0409dArr2[2].f2066d != null) {
                C0423h m2476h6 = m2476h(c0409dArr2[2]);
                if (m2476h6 != null) {
                    C0423h c0423h8 = this.f2207h;
                    int m2545b3 = this.f2201b.f2076G[2].m2545b();
                    c0423h8.f2192l.add(m2476h6);
                    c0423h8.f2186f = m2545b3;
                    m2476h6.f2191k.add(c0423h8);
                    m2481c(this.f2208i, this.f2207h, 1, this.f2204e);
                    if (this.f2201b.f2122w) {
                        m2481c(this.f2198k, this.f2207h, 1, this.f2199l);
                    }
                    if (this.f2203d == 3) {
                        C0410e c0410e12 = this.f2201b;
                        if (c0410e12.f2083N > 0.0f) {
                            c0427l = c0410e12.f2102d;
                        }
                    }
                }
            } else if (c0409dArr2[3].f2066d != null) {
                C0423h m2476h7 = m2476h(c0409dArr2[3]);
                if (m2476h7 != null) {
                    C0423h c0423h9 = this.f2208i;
                    c0423h9.f2192l.add(m2476h7);
                    c0423h9.f2186f = -this.f2201b.f2076G[3].m2545b();
                    m2476h7.f2191k.add(c0423h9);
                    m2481c(this.f2207h, this.f2208i, -1, this.f2204e);
                }
            } else if (c0409dArr2[4].f2066d != null) {
                C0423h m2476h8 = m2476h(c0409dArr2[4]);
                if (m2476h8 != null) {
                    C0423h c0423h10 = this.f2198k;
                    c0423h10.f2192l.add(m2476h8);
                    c0423h10.f2186f = 0;
                    m2476h8.f2191k.add(c0423h10);
                    m2481c(this.f2207h, this.f2198k, -1, this.f2199l);
                    c0423h = this.f2208i;
                    c0423h2 = this.f2207h;
                    c0424i = this.f2204e;
                }
            } else if (!(c0410e11 instanceof InterfaceC0413h) && (c0410e2 = c0410e11.f2080K) != null) {
                m2482b(this.f2207h, c0410e2.f2104e.f2207h, c0410e11.m2527p());
                m2481c(this.f2208i, this.f2207h, 1, this.f2204e);
                if (this.f2201b.f2122w) {
                    m2481c(this.f2198k, this.f2207h, 1, this.f2199l);
                }
                if (this.f2203d == 3) {
                    C0410e c0410e13 = this.f2201b;
                    if (c0410e13.f2083N > 0.0f) {
                        c0427l = c0410e13.f2102d;
                    }
                }
            }
            if (this.f2204e.f2192l.size() != 0) {
                this.f2204e.f2183c = true;
                return;
            }
            return;
        } else if (c0410e11.m2524s()) {
            this.f2207h.f2186f = this.f2201b.f2076G[2].m2545b();
            this.f2208i.f2186f = -this.f2201b.f2076G[3].m2545b();
        } else {
            C0423h m2476h9 = m2476h(this.f2201b.f2076G[2]);
            C0423h m2476h10 = m2476h(this.f2201b.f2076G[3]);
            m2476h9.f2191k.add(this);
            if (m2476h9.f2190j) {
                mo2483a(this);
            }
            m2476h10.f2191k.add(this);
            if (m2476h10.f2190j) {
                mo2483a(this);
            }
            this.f2209j = 4;
        }
        m2481c(c0423h, c0423h2, 1, c0424i);
        if (this.f2204e.f2192l.size() != 0) {
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: e */
    public void mo2479e() {
        C0423h c0423h = this.f2207h;
        if (c0423h.f2190j) {
            this.f2201b.f2086Q = c0423h.f2187g;
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: f */
    public void mo2478f() {
        this.f2202c = null;
        this.f2207h.m2492b();
        this.f2208i.m2492b();
        this.f2198k.m2492b();
        this.f2204e.m2492b();
        this.f2206g = false;
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: k */
    public boolean mo2473k() {
        return this.f2203d != 3 || this.f2201b.f2110k == 0;
    }

    /* renamed from: m */
    public void m2484m() {
        this.f2206g = false;
        this.f2207h.m2492b();
        this.f2207h.f2190j = false;
        this.f2208i.m2492b();
        this.f2208i.f2190j = false;
        this.f2198k.m2492b();
        this.f2198k.f2190j = false;
        this.f2204e.f2190j = false;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("VerticalRun ");
        m1187i.append(this.f2201b.f2094Y);
        return m1187i.toString();
    }
}