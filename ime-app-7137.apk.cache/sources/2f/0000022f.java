package p010b.p037h.p040b.p041n.p042k;

import java.util.List;
import p010b.p037h.p040b.AbstractC0403k;
import p010b.p037h.p040b.p041n.C0409d;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.EnumC0408c;
import p010b.p037h.p040b.p041n.InterfaceC0413h;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.n.k.l */
/* loaded from: classes.dex */
public class C0427l extends AbstractC0430o {

    /* renamed from: k */
    public static int[] f2194k = new int[2];

    public C0427l(C0410e c0410e) {
        super(c0410e);
        this.f2207h.f2185e = EnumC0422g.LEFT;
        this.f2208i.f2185e = EnumC0422g.RIGHT;
        this.f2205f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x026a, code lost:
        if (r15 != 1) goto L131;
     */
    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o, p010b.p037h.p040b.p041n.p042k.InterfaceC0420e
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2483a(InterfaceC0420e interfaceC0420e) {
        float f;
        float f2;
        float f3;
        int i;
        int m2477g;
        float f4;
        int m2477g2;
        int m2477g3;
        float f5;
        float f6;
        C0423h c0423h;
        int m2567a = AbstractC0403k.m2567a(this.f2209j);
        if (m2567a != 1 && m2567a != 2 && m2567a == 3) {
            C0410e c0410e = this.f2201b;
            m2472l(c0410e.f2124y, c0410e.f2070A, 0);
            return;
        }
        C0424i c0424i = this.f2204e;
        if (!c0424i.f2190j && this.f2203d == 3) {
            C0410e c0410e2 = this.f2201b;
            int i2 = c0410e2.f2109j;
            if (i2 == 2) {
                C0410e c0410e3 = c0410e2.f2080K;
                if (c0410e3 != null) {
                    C0424i c0424i2 = c0410e3.f2102d.f2204e;
                    if (c0424i2.f2190j) {
                        f = c0410e2.f2114o;
                        f2 = c0424i2.f2187g;
                        f3 = f2 * f;
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0410e2.f2110k;
                if (i3 != 0 && i3 != 3) {
                    int i4 = c0410e2.f2084O;
                    if (i4 != -1) {
                        if (i4 == 0) {
                            f3 = c0410e2.f2104e.f2204e.f2187g / c0410e2.f2083N;
                        } else if (i4 != 1) {
                            i = 0;
                        }
                    }
                    f2 = c0410e2.f2104e.f2204e.f2187g;
                    f = c0410e2.f2083N;
                    f3 = f2 * f;
                } else {
                    C0429n c0429n = c0410e2.f2104e;
                    C0423h c0423h2 = c0429n.f2207h;
                    C0423h c0423h3 = c0429n.f2208i;
                    boolean z = c0410e2.f2124y.f2066d != null;
                    boolean z2 = c0410e2.f2125z.f2066d != null;
                    boolean z3 = c0410e2.f2070A.f2066d != null;
                    boolean z4 = c0410e2.f2071B.f2066d != null;
                    int i5 = c0410e2.f2084O;
                    if (z && z2 && z3 && z4) {
                        float f7 = c0410e2.f2083N;
                        if (c0423h2.f2190j && c0423h3.f2190j) {
                            C0423h c0423h4 = this.f2207h;
                            if (c0423h4.f2183c && this.f2208i.f2183c) {
                                m2488m(f2194k, ((C0423h) c0423h4.f2192l.get(0)).f2187g + this.f2207h.f2186f, ((C0423h) this.f2208i.f2192l.get(0)).f2187g - this.f2208i.f2186f, c0423h2.f2187g + c0423h2.f2186f, c0423h3.f2187g - c0423h3.f2186f, f7, i5);
                                this.f2204e.mo2491c(f2194k[0]);
                                this.f2201b.f2104e.f2204e.mo2491c(f2194k[1]);
                                return;
                            }
                            return;
                        }
                        C0423h c0423h5 = this.f2207h;
                        if (c0423h5.f2190j) {
                            C0423h c0423h6 = this.f2208i;
                            if (c0423h6.f2190j) {
                                if (!c0423h2.f2183c || !c0423h3.f2183c) {
                                    return;
                                }
                                f6 = f7;
                                m2488m(f2194k, c0423h5.f2187g + c0423h5.f2186f, c0423h6.f2187g - c0423h6.f2186f, ((C0423h) c0423h2.f2192l.get(0)).f2187g + c0423h2.f2186f, ((C0423h) c0423h3.f2192l.get(0)).f2187g - c0423h3.f2186f, f7, i5);
                                this.f2204e.mo2491c(f2194k[0]);
                                this.f2201b.f2104e.f2204e.mo2491c(f2194k[1]);
                                c0423h = this.f2207h;
                                if (c0423h.f2183c || !this.f2208i.f2183c || !c0423h2.f2183c || !c0423h3.f2183c) {
                                    return;
                                }
                                m2488m(f2194k, ((C0423h) c0423h.f2192l.get(0)).f2187g + this.f2207h.f2186f, ((C0423h) this.f2208i.f2192l.get(0)).f2187g - this.f2208i.f2186f, ((C0423h) c0423h2.f2192l.get(0)).f2187g + c0423h2.f2186f, ((C0423h) c0423h3.f2192l.get(0)).f2187g - c0423h3.f2186f, f6, i5);
                                this.f2204e.mo2491c(f2194k[0]);
                                c0424i = this.f2201b.f2104e.f2204e;
                                i = f2194k[1];
                            }
                        }
                        f6 = f7;
                        c0423h = this.f2207h;
                        if (c0423h.f2183c) {
                            return;
                        }
                        return;
                    } else if (z && z3) {
                        C0423h c0423h7 = this.f2207h;
                        if (!c0423h7.f2183c || !this.f2208i.f2183c) {
                            return;
                        }
                        float f8 = c0410e2.f2083N;
                        int i6 = ((C0423h) c0423h7.f2192l.get(0)).f2187g + this.f2207h.f2186f;
                        int i7 = ((C0423h) this.f2208i.f2192l.get(0)).f2187g - this.f2208i.f2186f;
                        if (i5 == -1 || i5 == 0) {
                            m2477g2 = m2477g(i7 - i6, 0);
                            int i8 = (int) ((m2477g2 * f8) + 0.5f);
                            m2477g3 = m2477g(i8, 1);
                            if (i8 != m2477g3) {
                                f5 = m2477g3 / f8;
                                m2477g2 = (int) (f5 + 0.5f);
                            }
                            this.f2204e.mo2491c(m2477g2);
                            this.f2201b.f2104e.f2204e.mo2491c(m2477g3);
                        } else if (i5 == 1) {
                            m2477g2 = m2477g(i7 - i6, 0);
                            int i9 = (int) ((m2477g2 / f8) + 0.5f);
                            m2477g3 = m2477g(i9, 1);
                            if (i9 != m2477g3) {
                                f5 = m2477g3 * f8;
                                m2477g2 = (int) (f5 + 0.5f);
                            }
                            this.f2204e.mo2491c(m2477g2);
                            this.f2201b.f2104e.f2204e.mo2491c(m2477g3);
                        }
                    } else if (z2 && z4) {
                        if (!c0423h2.f2183c || !c0423h3.f2183c) {
                            return;
                        }
                        float f9 = c0410e2.f2083N;
                        int i10 = ((C0423h) c0423h2.f2192l.get(0)).f2187g + c0423h2.f2186f;
                        int i11 = ((C0423h) c0423h3.f2192l.get(0)).f2187g - c0423h3.f2186f;
                        if (i5 != -1) {
                            if (i5 == 0) {
                                i = m2477g(i11 - i10, 1);
                                int i12 = (int) ((i * f9) + 0.5f);
                                m2477g = m2477g(i12, 0);
                                if (i12 != m2477g) {
                                    f4 = m2477g / f9;
                                    i = (int) (f4 + 0.5f);
                                }
                                this.f2204e.mo2491c(m2477g);
                                c0424i = this.f2201b.f2104e.f2204e;
                            }
                        }
                        i = m2477g(i11 - i10, 1);
                        int i13 = (int) ((i / f9) + 0.5f);
                        m2477g = m2477g(i13, 0);
                        if (i13 != m2477g) {
                            f4 = m2477g * f9;
                            i = (int) (f4 + 0.5f);
                        }
                        this.f2204e.mo2491c(m2477g);
                        c0424i = this.f2201b.f2104e.f2204e;
                    }
                }
                c0424i.mo2491c(i);
            }
            i = (int) (f3 + 0.5f);
            c0424i.mo2491c(i);
        }
        C0423h c0423h8 = this.f2207h;
        if (c0423h8.f2183c) {
            C0423h c0423h9 = this.f2208i;
            if (c0423h9.f2183c) {
                if (c0423h8.f2190j && c0423h9.f2190j && this.f2204e.f2190j) {
                    return;
                }
                if (!this.f2204e.f2190j && this.f2203d == 3) {
                    C0410e c0410e4 = this.f2201b;
                    if (c0410e4.f2109j == 0 && !c0410e4.m2525r()) {
                        int i14 = ((C0423h) this.f2207h.f2192l.get(0)).f2187g;
                        C0423h c0423h10 = this.f2207h;
                        int i15 = i14 + c0423h10.f2186f;
                        int i16 = ((C0423h) this.f2208i.f2192l.get(0)).f2187g + this.f2208i.f2186f;
                        c0423h10.mo2491c(i15);
                        this.f2208i.mo2491c(i16);
                        this.f2204e.mo2491c(i16 - i15);
                        return;
                    }
                }
                if (!this.f2204e.f2190j && this.f2203d == 3 && this.f2200a == 1 && this.f2207h.f2192l.size() > 0 && this.f2208i.f2192l.size() > 0) {
                    int min = Math.min((((C0423h) this.f2208i.f2192l.get(0)).f2187g + this.f2208i.f2186f) - (((C0423h) this.f2207h.f2192l.get(0)).f2187g + this.f2207h.f2186f), this.f2204e.f2193m);
                    C0410e c0410e5 = this.f2201b;
                    int i17 = c0410e5.f2113n;
                    int max = Math.max(c0410e5.f2112m, min);
                    if (i17 > 0) {
                        max = Math.min(i17, max);
                    }
                    this.f2204e.mo2491c(max);
                }
                if (this.f2204e.f2190j) {
                    C0423h c0423h11 = (C0423h) this.f2207h.f2192l.get(0);
                    C0423h c0423h12 = (C0423h) this.f2208i.f2192l.get(0);
                    int i18 = c0423h11.f2187g;
                    C0423h c0423h13 = this.f2207h;
                    int i19 = c0423h13.f2186f + i18;
                    int i20 = c0423h12.f2187g;
                    int i21 = this.f2208i.f2186f + i20;
                    float f10 = this.f2201b.f2090U;
                    if (c0423h11 == c0423h12) {
                        f10 = 0.5f;
                    } else {
                        i18 = i19;
                        i20 = i21;
                    }
                    c0423h13.mo2491c((int) ((((i20 - i18) - this.f2204e.f2187g) * f10) + i18 + 0.5f));
                    this.f2208i.mo2491c(this.f2207h.f2187g + this.f2204e.f2187g);
                }
            }
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: d */
    public void mo2480d() {
        C0410e c0410e;
        C0410e c0410e2;
        C0423h c0423h;
        C0409d c0409d;
        List list;
        Object obj;
        C0423h c0423h2;
        C0423h c0423h3;
        C0423h c0423h4;
        int i;
        C0410e c0410e3;
        C0410e c0410e4 = this.f2201b;
        if (c0410e4.f2096a) {
            this.f2204e.mo2491c(c0410e4.m2529n());
        }
        if (!this.f2204e.f2190j) {
            int m2534i = this.f2201b.m2534i();
            this.f2203d = m2534i;
            if (m2534i != 3) {
                if (m2534i == 4 && (((c0410e3 = this.f2201b.f2080K) != null && c0410e3.m2534i() == 1) || c0410e3.m2534i() == 4)) {
                    int m2529n = (c0410e3.m2529n() - this.f2201b.f2124y.m2545b()) - this.f2201b.f2070A.m2545b();
                    m2482b(this.f2207h, c0410e3.f2102d.f2207h, this.f2201b.f2124y.m2545b());
                    m2482b(this.f2208i, c0410e3.f2102d.f2208i, -this.f2201b.f2070A.m2545b());
                    this.f2204e.mo2491c(m2529n);
                    return;
                } else if (this.f2203d == 1) {
                    this.f2204e.mo2491c(this.f2201b.m2529n());
                }
            }
        } else if (this.f2203d == 4 && (((c0410e = this.f2201b.f2080K) != null && c0410e.m2534i() == 1) || c0410e.m2534i() == 4)) {
            m2482b(this.f2207h, c0410e.f2102d.f2207h, this.f2201b.f2124y.m2545b());
            m2482b(this.f2208i, c0410e.f2102d.f2208i, -this.f2201b.f2070A.m2545b());
            return;
        }
        C0424i c0424i = this.f2204e;
        if (c0424i.f2190j) {
            C0410e c0410e5 = this.f2201b;
            if (c0410e5.f2096a) {
                C0409d[] c0409dArr = c0410e5.f2076G;
                if (c0409dArr[0].f2066d != null && c0409dArr[1].f2066d != null) {
                    if (c0410e5.m2525r()) {
                        this.f2207h.f2186f = this.f2201b.f2076G[0].m2545b();
                        c0423h = this.f2208i;
                        c0409d = this.f2201b.f2076G[1];
                        c0423h.f2186f = -c0409d.m2545b();
                        return;
                    }
                    C0423h m2476h = m2476h(this.f2201b.f2076G[0]);
                    if (m2476h != null) {
                        C0423h c0423h5 = this.f2207h;
                        int m2545b = this.f2201b.f2076G[0].m2545b();
                        c0423h5.f2192l.add(m2476h);
                        c0423h5.f2186f = m2545b;
                        m2476h.f2191k.add(c0423h5);
                    }
                    C0423h m2476h2 = m2476h(this.f2201b.f2076G[1]);
                    if (m2476h2 != null) {
                        C0423h c0423h6 = this.f2208i;
                        c0423h6.f2192l.add(m2476h2);
                        c0423h6.f2186f = -this.f2201b.f2076G[1].m2545b();
                        m2476h2.f2191k.add(c0423h6);
                    }
                    this.f2207h.f2182b = true;
                    this.f2208i.f2182b = true;
                    return;
                }
                if (c0409dArr[0].f2066d != null) {
                    C0423h m2476h3 = m2476h(c0409dArr[0]);
                    if (m2476h3 == null) {
                        return;
                    }
                    C0423h c0423h7 = this.f2207h;
                    int m2545b2 = this.f2201b.f2076G[0].m2545b();
                    c0423h7.f2192l.add(m2476h3);
                    c0423h7.f2186f = m2545b2;
                    m2476h3.f2191k.add(c0423h7);
                } else if (c0409dArr[1].f2066d != null) {
                    C0423h m2476h4 = m2476h(c0409dArr[1]);
                    if (m2476h4 != null) {
                        C0423h c0423h8 = this.f2208i;
                        c0423h8.f2192l.add(m2476h4);
                        c0423h8.f2186f = -this.f2201b.f2076G[1].m2545b();
                        m2476h4.f2191k.add(c0423h8);
                        c0423h3 = this.f2207h;
                        c0423h4 = this.f2208i;
                        i = -this.f2204e.f2187g;
                        m2482b(c0423h3, c0423h4, i);
                        return;
                    }
                    return;
                } else if ((c0410e5 instanceof InterfaceC0413h) || c0410e5.f2080K == null || c0410e5.mo2505e(EnumC0408c.CENTER).f2066d != null) {
                    return;
                } else {
                    C0410e c0410e6 = this.f2201b;
                    m2482b(this.f2207h, c0410e6.f2080K.f2102d.f2207h, c0410e6.m2528o());
                }
                c0423h3 = this.f2208i;
                c0423h4 = this.f2207h;
                i = this.f2204e.f2187g;
                m2482b(c0423h3, c0423h4, i);
                return;
            }
        }
        if (this.f2203d == 3) {
            C0410e c0410e7 = this.f2201b;
            int i2 = c0410e7.f2109j;
            if (i2 == 2) {
                C0410e c0410e8 = c0410e7.f2080K;
                if (c0410e8 != null) {
                    C0424i c0424i2 = c0410e8.f2104e.f2204e;
                    c0424i.f2192l.add(c0424i2);
                    c0424i2.f2191k.add(this.f2204e);
                    C0424i c0424i3 = this.f2204e;
                    c0424i3.f2182b = true;
                    c0424i3.f2191k.add(this.f2207h);
                    list = this.f2204e.f2191k;
                    obj = this.f2208i;
                    list.add(obj);
                }
            } else if (i2 == 3) {
                if (c0410e7.f2110k == 3) {
                    this.f2207h.f2181a = this;
                    this.f2208i.f2181a = this;
                    C0429n c0429n = c0410e7.f2104e;
                    c0429n.f2207h.f2181a = this;
                    c0429n.f2208i.f2181a = this;
                    c0424i.f2181a = this;
                    if (c0410e7.m2524s()) {
                        this.f2204e.f2192l.add(this.f2201b.f2104e.f2204e);
                        this.f2201b.f2104e.f2204e.f2191k.add(this.f2204e);
                        C0429n c0429n2 = this.f2201b.f2104e;
                        c0429n2.f2204e.f2181a = this;
                        this.f2204e.f2192l.add(c0429n2.f2207h);
                        this.f2204e.f2192l.add(this.f2201b.f2104e.f2208i);
                        this.f2201b.f2104e.f2207h.f2191k.add(this.f2204e);
                        list = this.f2201b.f2104e.f2208i.f2191k;
                        obj = this.f2204e;
                        list.add(obj);
                    } else if (this.f2201b.m2525r()) {
                        this.f2201b.f2104e.f2204e.f2192l.add(this.f2204e);
                        list = this.f2204e.f2191k;
                        obj = this.f2201b.f2104e.f2204e;
                        list.add(obj);
                    } else {
                        c0423h2 = this.f2201b.f2104e.f2204e;
                    }
                } else {
                    C0424i c0424i4 = c0410e7.f2104e.f2204e;
                    c0424i.f2192l.add(c0424i4);
                    c0424i4.f2191k.add(this.f2204e);
                    this.f2201b.f2104e.f2207h.f2191k.add(this.f2204e);
                    this.f2201b.f2104e.f2208i.f2191k.add(this.f2204e);
                    C0424i c0424i5 = this.f2204e;
                    c0424i5.f2182b = true;
                    c0424i5.f2191k.add(this.f2207h);
                    this.f2204e.f2191k.add(this.f2208i);
                    this.f2207h.f2192l.add(this.f2204e);
                    c0423h2 = this.f2208i;
                }
                list = c0423h2.f2192l;
                obj = this.f2204e;
                list.add(obj);
            }
            c0423h.f2186f = -c0409d.m2545b();
            return;
        }
        C0410e c0410e9 = this.f2201b;
        C0409d[] c0409dArr2 = c0410e9.f2076G;
        if (c0409dArr2[0].f2066d != null && c0409dArr2[1].f2066d != null) {
            if (c0410e9.m2525r()) {
                this.f2207h.f2186f = this.f2201b.f2076G[0].m2545b();
                c0423h = this.f2208i;
                c0409d = this.f2201b.f2076G[1];
                c0423h.f2186f = -c0409d.m2545b();
                return;
            }
            C0423h m2476h5 = m2476h(this.f2201b.f2076G[0]);
            C0423h m2476h6 = m2476h(this.f2201b.f2076G[1]);
            m2476h5.f2191k.add(this);
            if (m2476h5.f2190j) {
                mo2483a(this);
            }
            m2476h6.f2191k.add(this);
            if (m2476h6.f2190j) {
                mo2483a(this);
            }
            this.f2209j = 4;
            return;
        }
        if (c0409dArr2[0].f2066d != null) {
            C0423h m2476h7 = m2476h(c0409dArr2[0]);
            if (m2476h7 == null) {
                return;
            }
            C0423h c0423h9 = this.f2207h;
            int m2545b3 = this.f2201b.f2076G[0].m2545b();
            c0423h9.f2192l.add(m2476h7);
            c0423h9.f2186f = m2545b3;
            m2476h7.f2191k.add(c0423h9);
        } else if (c0409dArr2[1].f2066d != null) {
            C0423h m2476h8 = m2476h(c0409dArr2[1]);
            if (m2476h8 != null) {
                C0423h c0423h10 = this.f2208i;
                c0423h10.f2192l.add(m2476h8);
                c0423h10.f2186f = -this.f2201b.f2076G[1].m2545b();
                m2476h8.f2191k.add(c0423h10);
                m2481c(this.f2207h, this.f2208i, -1, this.f2204e);
                return;
            }
            return;
        } else if ((c0410e9 instanceof InterfaceC0413h) || (c0410e2 = c0410e9.f2080K) == null) {
            return;
        } else {
            m2482b(this.f2207h, c0410e2.f2102d.f2207h, c0410e9.m2528o());
        }
        m2481c(this.f2208i, this.f2207h, 1, this.f2204e);
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: e */
    public void mo2479e() {
        C0423h c0423h = this.f2207h;
        if (c0423h.f2190j) {
            this.f2201b.f2085P = c0423h.f2187g;
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: f */
    public void mo2478f() {
        this.f2202c = null;
        this.f2207h.m2492b();
        this.f2208i.m2492b();
        this.f2204e.m2492b();
        this.f2206g = false;
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: k */
    public boolean mo2473k() {
        return this.f2203d != 3 || this.f2201b.f2109j == 0;
    }

    /* renamed from: m */
    public final void m2488m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i6 > i6 || i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* renamed from: n */
    public void m2487n() {
        this.f2206g = false;
        this.f2207h.m2492b();
        this.f2207h.f2190j = false;
        this.f2208i.m2492b();
        this.f2208i.f2190j = false;
        this.f2204e.f2190j = false;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("HorizontalRun ");
        m1187i.append(this.f2201b.f2094Y);
        return m1187i.toString();
    }
}