package p010b.p037h.p040b;

import java.util.Arrays;
import java.util.Iterator;
import p010b.p037h.p040b.p041n.C0409d;

/* renamed from: b.h.b.f */
/* loaded from: classes.dex */
public class C0398f {

    /* renamed from: a */
    public static int f1968a = 1000;

    /* renamed from: b */
    public static boolean f1969b = true;

    /* renamed from: c */
    public static long f1970c;

    /* renamed from: d */
    public static long f1971d;

    /* renamed from: f */
    public C0395c f1973f;

    /* renamed from: i */
    public C0395c[] f1976i;

    /* renamed from: o */
    public final C0396d f1982o;

    /* renamed from: r */
    public C0395c f1985r;

    /* renamed from: e */
    public int f1972e = 0;

    /* renamed from: g */
    public int f1974g = 32;

    /* renamed from: h */
    public int f1975h = 32;

    /* renamed from: j */
    public boolean f1977j = false;

    /* renamed from: k */
    public boolean[] f1978k = new boolean[32];

    /* renamed from: l */
    public int f1979l = 1;

    /* renamed from: m */
    public int f1980m = 0;

    /* renamed from: n */
    public int f1981n = 32;

    /* renamed from: p */
    public C0404l[] f1983p = new C0404l[f1968a];

    /* renamed from: q */
    public int f1984q = 0;

    public C0398f() {
        this.f1976i = null;
        this.f1976i = new C0395c[32];
        m2577s();
        C0396d c0396d = new C0396d();
        this.f1982o = c0396d;
        this.f1973f = new C0402j(c0396d);
        this.f1985r = f1969b ? new C0397e(this, c0396d) : new C0395c(c0396d);
    }

    /* renamed from: a */
    public final C0404l m2595a(int i, String str) {
        C0404l c0404l = (C0404l) this.f1982o.f1966c.m2575a();
        if (c0404l == null) {
            c0404l = new C0404l(i);
        } else {
            c0404l.m2563c();
        }
        c0404l.f2015j = i;
        int i2 = this.f1984q;
        int i3 = f1968a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1968a = i4;
            this.f1983p = (C0404l[]) Arrays.copyOf(this.f1983p, i4);
        }
        C0404l[] c0404lArr = this.f1983p;
        int i5 = this.f1984q;
        this.f1984q = i5 + 1;
        c0404lArr[i5] = c0404l;
        return c0404l;
    }

    /* renamed from: b */
    public void m2594b(C0404l c0404l, C0404l c0404l2, int i, float f, C0404l c0404l3, C0404l c0404l4, int i2, int i3) {
        int i4;
        float f2;
        C0395c m2583m = m2583m();
        if (c0404l2 == c0404l3) {
            m2583m.f1962d.mo2558c(c0404l, 1.0f);
            m2583m.f1962d.mo2558c(c0404l4, 1.0f);
            m2583m.f1962d.mo2558c(c0404l2, -2.0f);
        } else {
            if (f == 0.5f) {
                m2583m.f1962d.mo2558c(c0404l, 1.0f);
                m2583m.f1962d.mo2558c(c0404l2, -1.0f);
                m2583m.f1962d.mo2558c(c0404l3, -1.0f);
                m2583m.f1962d.mo2558c(c0404l4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                m2583m.f1962d.mo2558c(c0404l, -1.0f);
                m2583m.f1962d.mo2558c(c0404l2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                m2583m.f1962d.mo2558c(c0404l4, -1.0f);
                m2583m.f1962d.mo2558c(c0404l3, 1.0f);
                i4 = -i2;
                f2 = i4;
            } else {
                float f3 = 1.0f - f;
                m2583m.f1962d.mo2558c(c0404l, f3 * 1.0f);
                m2583m.f1962d.mo2558c(c0404l2, f3 * (-1.0f));
                m2583m.f1962d.mo2558c(c0404l3, (-1.0f) * f);
                m2583m.f1962d.mo2558c(c0404l4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    m2583m.f1960b = (i2 * f) + ((-i) * f3);
                }
            }
            m2583m.f1960b = f2;
        }
        if (i3 != 8) {
            m2583m.m2604a(this, i3);
        }
        m2593c(m2583m);
    }

    /* renamed from: c */
    public void m2593c(C0395c c0395c) {
        boolean z;
        boolean z2;
        boolean z3;
        C0404l m2598j;
        boolean z4 = true;
        if (this.f1980m + 1 >= this.f1981n || this.f1979l + 1 >= this.f1975h) {
            m2580p();
        }
        if (c0395c.f1963e) {
            z = false;
        } else {
            if (this.f1976i.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int mo2550k = c0395c.f1962d.mo2550k();
                    for (int i = 0; i < mo2550k; i++) {
                        C0404l mo2555f = c0395c.f1962d.mo2555f(i);
                        if (mo2555f.f2009d != -1 || mo2555f.f2012g) {
                            c0395c.f1961c.add(mo2555f);
                        }
                    }
                    if (c0395c.f1961c.size() > 0) {
                        Iterator it = c0395c.f1961c.iterator();
                        while (it.hasNext()) {
                            C0404l c0404l = (C0404l) it.next();
                            if (c0404l.f2012g) {
                                c0395c.m2596l(c0404l, true);
                            } else {
                                c0395c.mo2570m(this.f1976i[c0404l.f2009d], true);
                            }
                        }
                        c0395c.f1961c.clear();
                    } else {
                        z5 = true;
                    }
                }
            }
            if (c0395c.f1959a == null && c0395c.f1960b == 0.0f && c0395c.f1962d.mo2550k() == 0) {
                return;
            }
            float f = c0395c.f1960b;
            if (f < 0.0f) {
                c0395c.f1960b = f * (-1.0f);
                c0395c.f1962d.mo2551j();
            }
            int mo2550k2 = c0395c.f1962d.mo2550k();
            C0404l c0404l2 = null;
            C0404l c0404l3 = null;
            float f2 = 0.0f;
            boolean z6 = false;
            float f3 = 0.0f;
            boolean z7 = false;
            for (int i2 = 0; i2 < mo2550k2; i2++) {
                float mo2560a = c0395c.f1962d.mo2560a(i2);
                C0404l mo2555f2 = c0395c.f1962d.mo2555f(i2);
                if (mo2555f2.f2015j == 1) {
                    if (c0404l2 == null || f2 > mo2560a) {
                        z6 = c0395c.m2599i(mo2555f2);
                        c0404l2 = mo2555f2;
                        f2 = mo2560a;
                    } else if (!z6 && c0395c.m2599i(mo2555f2)) {
                        c0404l2 = mo2555f2;
                        f2 = mo2560a;
                        z6 = true;
                    }
                } else if (c0404l2 == null && mo2560a < 0.0f) {
                    if (c0404l3 == null || f3 > mo2560a) {
                        z7 = c0395c.m2599i(mo2555f2);
                        c0404l3 = mo2555f2;
                        f3 = mo2560a;
                    } else if (!z7 && c0395c.m2599i(mo2555f2)) {
                        c0404l3 = mo2555f2;
                        f3 = mo2560a;
                        z7 = true;
                    }
                }
            }
            if (c0404l2 == null) {
                c0404l2 = c0404l3;
            }
            if (c0404l2 == null) {
                z2 = true;
            } else {
                c0395c.m2597k(c0404l2);
                z2 = false;
            }
            if (c0395c.f1962d.mo2550k() == 0) {
                c0395c.f1963e = true;
            }
            if (z2) {
                if (this.f1979l + 1 >= this.f1975h) {
                    m2580p();
                }
                C0404l m2595a = m2595a(3, null);
                int i3 = this.f1972e + 1;
                this.f1972e = i3;
                this.f1979l++;
                m2595a.f2008c = i3;
                this.f1982o.f1967d[i3] = m2595a;
                c0395c.f1959a = m2595a;
                m2587i(c0395c);
                C0395c c0395c2 = this.f1985r;
                c0395c2.getClass();
                c0395c2.f1959a = null;
                c0395c2.f1962d.clear();
                for (int i4 = 0; i4 < c0395c.f1962d.mo2550k(); i4++) {
                    c0395c2.f1962d.mo2556e(c0395c.f1962d.mo2555f(i4), c0395c.f1962d.mo2560a(i4), true);
                }
                m2578r(this.f1985r);
                if (m2595a.f2009d == -1) {
                    if (c0395c.f1959a == m2595a && (m2598j = c0395c.m2598j(null, m2595a)) != null) {
                        c0395c.m2597k(m2598j);
                    }
                    if (!c0395c.f1963e) {
                        c0395c.f1959a.m2561e(c0395c);
                    }
                    this.f1980m--;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            C0404l c0404l4 = c0395c.f1959a;
            if (c0404l4 == null || (c0404l4.f2015j != 1 && c0395c.f1960b < 0.0f)) {
                z4 = false;
            }
            if (!z4) {
                return;
            }
            z = z3;
        }
        if (z) {
            return;
        }
        m2587i(c0395c);
    }

    /* renamed from: d */
    public C0395c m2592d(C0404l c0404l, C0404l c0404l2, int i, int i2) {
        if (i2 == 8 && c0404l2.f2012g && c0404l.f2009d == -1) {
            c0404l.m2562d(this, c0404l2.f2011f + i);
            return null;
        }
        C0395c m2583m = m2583m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m2583m.f1960b = i;
        }
        if (z) {
            m2583m.f1962d.mo2558c(c0404l, 1.0f);
            m2583m.f1962d.mo2558c(c0404l2, -1.0f);
        } else {
            m2583m.f1962d.mo2558c(c0404l, -1.0f);
            m2583m.f1962d.mo2558c(c0404l2, 1.0f);
        }
        if (i2 != 8) {
            m2583m.m2604a(this, i2);
        }
        m2593c(m2583m);
        return m2583m;
    }

    /* renamed from: e */
    public void m2591e(C0404l c0404l, int i) {
        C0395c m2583m;
        InterfaceC0394b interfaceC0394b;
        float f;
        int i2 = c0404l.f2009d;
        if (i2 == -1) {
            c0404l.m2562d(this, i);
            return;
        }
        if (i2 != -1) {
            C0395c c0395c = this.f1976i[i2];
            if (!c0395c.f1963e) {
                if (c0395c.f1962d.mo2550k() == 0) {
                    c0395c.f1963e = true;
                } else {
                    m2583m = m2583m();
                    if (i < 0) {
                        m2583m.f1960b = i * (-1);
                        interfaceC0394b = m2583m.f1962d;
                        f = 1.0f;
                    } else {
                        m2583m.f1960b = i;
                        interfaceC0394b = m2583m.f1962d;
                        f = -1.0f;
                    }
                    interfaceC0394b.mo2558c(c0404l, f);
                }
            }
            c0395c.f1960b = i;
            return;
        }
        m2583m = m2583m();
        m2583m.f1959a = c0404l;
        float f2 = i;
        c0404l.f2011f = f2;
        m2583m.f1960b = f2;
        m2583m.f1963e = true;
        m2593c(m2583m);
    }

    /* renamed from: f */
    public void m2590f(C0404l c0404l, C0404l c0404l2, int i, int i2) {
        C0395c m2583m = m2583m();
        C0404l m2582n = m2582n();
        m2582n.f2010e = 0;
        m2583m.m2602e(c0404l, c0404l2, m2582n, i);
        if (i2 != 8) {
            m2583m.f1962d.mo2558c(m2585k(i2, null), (int) (m2583m.f1962d.mo2554g(m2582n) * (-1.0f)));
        }
        m2593c(m2583m);
    }

    /* renamed from: g */
    public void m2589g(C0404l c0404l, C0404l c0404l2, int i, int i2) {
        C0395c m2583m = m2583m();
        C0404l m2582n = m2582n();
        m2582n.f2010e = 0;
        m2583m.m2601f(c0404l, c0404l2, m2582n, i);
        if (i2 != 8) {
            m2583m.f1962d.mo2558c(m2585k(i2, null), (int) (m2583m.f1962d.mo2554g(m2582n) * (-1.0f)));
        }
        m2593c(m2583m);
    }

    /* renamed from: h */
    public void m2588h(C0404l c0404l, C0404l c0404l2, C0404l c0404l3, C0404l c0404l4, float f, int i) {
        C0395c m2583m = m2583m();
        m2583m.m2603d(c0404l, c0404l2, c0404l3, c0404l4, f);
        if (i != 8) {
            m2583m.m2604a(this, i);
        }
        m2593c(m2583m);
    }

    /* renamed from: i */
    public final void m2587i(C0395c c0395c) {
        C0399g c0399g;
        C0395c c0395c2;
        if (f1969b) {
            C0395c[] c0395cArr = this.f1976i;
            int i = this.f1980m;
            if (c0395cArr[i] != null) {
                c0399g = this.f1982o.f1964a;
                c0395c2 = c0395cArr[i];
                c0399g.m2574b(c0395c2);
            }
        } else {
            C0395c[] c0395cArr2 = this.f1976i;
            int i2 = this.f1980m;
            if (c0395cArr2[i2] != null) {
                c0399g = this.f1982o.f1965b;
                c0395c2 = c0395cArr2[i2];
                c0399g.m2574b(c0395c2);
            }
        }
        C0395c[] c0395cArr3 = this.f1976i;
        int i3 = this.f1980m;
        c0395cArr3[i3] = c0395c;
        C0404l c0404l = c0395c.f1959a;
        c0404l.f2009d = i3;
        this.f1980m = i3 + 1;
        c0404l.m2561e(c0395c);
    }

    /* renamed from: j */
    public final void m2586j() {
        for (int i = 0; i < this.f1980m; i++) {
            C0395c c0395c = this.f1976i[i];
            c0395c.f1959a.f2011f = c0395c.f1960b;
        }
    }

    /* renamed from: k */
    public C0404l m2585k(int i, String str) {
        if (this.f1979l + 1 >= this.f1975h) {
            m2580p();
        }
        C0404l m2595a = m2595a(4, str);
        int i2 = this.f1972e + 1;
        this.f1972e = i2;
        this.f1979l++;
        m2595a.f2008c = i2;
        m2595a.f2010e = i;
        this.f1982o.f1967d[i2] = m2595a;
        this.f1973f.mo2573b(m2595a);
        return m2595a;
    }

    /* renamed from: l */
    public C0404l m2584l(Object obj) {
        C0404l c0404l = null;
        if (obj == null) {
            return null;
        }
        if (this.f1979l + 1 >= this.f1975h) {
            m2580p();
        }
        if (obj instanceof C0409d) {
            C0409d c0409d = (C0409d) obj;
            c0404l = c0409d.f2069g;
            if (c0404l == null) {
                c0409d.m2541f();
                c0404l = c0409d.f2069g;
            }
            int i = c0404l.f2008c;
            if (i == -1 || i > this.f1972e || this.f1982o.f1967d[i] == null) {
                if (i != -1) {
                    c0404l.m2563c();
                }
                int i2 = this.f1972e + 1;
                this.f1972e = i2;
                this.f1979l++;
                c0404l.f2008c = i2;
                c0404l.f2015j = 1;
                this.f1982o.f1967d[i2] = c0404l;
            }
        }
        return c0404l;
    }

    /* renamed from: m */
    public C0395c m2583m() {
        C0395c c0395c;
        if (!f1969b) {
            c0395c = (C0395c) this.f1982o.f1965b.m2575a();
            if (c0395c == null) {
                c0395c = new C0395c(this.f1982o);
                f1970c++;
            }
            c0395c.f1959a = null;
            c0395c.f1962d.clear();
            c0395c.f1960b = 0.0f;
            c0395c.f1963e = false;
        } else {
            c0395c = (C0395c) this.f1982o.f1964a.m2575a();
            if (c0395c == null) {
                c0395c = new C0397e(this, this.f1982o);
                f1971d++;
            }
            c0395c.f1959a = null;
            c0395c.f1962d.clear();
            c0395c.f1960b = 0.0f;
            c0395c.f1963e = false;
        }
        C0404l.f2006a++;
        return c0395c;
    }

    /* renamed from: n */
    public C0404l m2582n() {
        if (this.f1979l + 1 >= this.f1975h) {
            m2580p();
        }
        C0404l m2595a = m2595a(3, null);
        int i = this.f1972e + 1;
        this.f1972e = i;
        this.f1979l++;
        m2595a.f2008c = i;
        this.f1982o.f1967d[i] = m2595a;
        return m2595a;
    }

    /* renamed from: o */
    public int m2581o(Object obj) {
        C0404l c0404l = ((C0409d) obj).f2069g;
        if (c0404l != null) {
            return (int) (c0404l.f2011f + 0.5f);
        }
        return 0;
    }

    /* renamed from: p */
    public final void m2580p() {
        int i = this.f1974g * 2;
        this.f1974g = i;
        this.f1976i = (C0395c[]) Arrays.copyOf(this.f1976i, i);
        C0396d c0396d = this.f1982o;
        c0396d.f1967d = (C0404l[]) Arrays.copyOf(c0396d.f1967d, this.f1974g);
        int i2 = this.f1974g;
        this.f1978k = new boolean[i2];
        this.f1975h = i2;
        this.f1981n = i2;
    }

    /* renamed from: q */
    public void m2579q(C0395c c0395c) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f1980m) {
                z = false;
                break;
            }
            C0395c[] c0395cArr = this.f1976i;
            if (c0395cArr[i].f1959a.f2015j != 1 && c0395cArr[i].f1960b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                while (i3 < this.f1980m) {
                    C0395c c0395c2 = this.f1976i[i3];
                    if (c0395c2.f1959a.f2015j != 1 && !c0395c2.f1963e && c0395c2.f1960b < f) {
                        int i7 = 1;
                        while (i7 < this.f1979l) {
                            C0404l c0404l = this.f1982o.f1967d[i7];
                            float mo2554g = c0395c2.f1962d.mo2554g(c0404l);
                            if (mo2554g > f) {
                                for (int i8 = 0; i8 < 9; i8++) {
                                    float f3 = c0404l.f2013h[i8] / mo2554g;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i6 = i8;
                                        f2 = f3;
                                        i4 = i3;
                                        i5 = i7;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i3++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    C0395c c0395c3 = this.f1976i[i4];
                    c0395c3.f1959a.f2009d = -1;
                    c0395c3.m2597k(this.f1982o.f1967d[i5]);
                    C0404l c0404l2 = c0395c3.f1959a;
                    c0404l2.f2009d = i4;
                    c0404l2.m2561e(c0395c3);
                } else {
                    z2 = true;
                }
                if (i2 > this.f1979l / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
        }
        m2578r(c0395c);
        m2586j();
    }

    /* renamed from: r */
    public final int m2578r(C0395c c0395c) {
        for (int i = 0; i < this.f1979l; i++) {
            this.f1978k[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f1979l * 2) {
                return i2;
            }
            C0404l c0404l = c0395c.f1959a;
            if (c0404l != null) {
                this.f1978k[c0404l.f2008c] = true;
            }
            C0404l mo2571h = c0395c.mo2571h(this, this.f1978k);
            if (mo2571h != null) {
                boolean[] zArr = this.f1978k;
                int i3 = mo2571h.f2008c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo2571h != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f1980m; i5++) {
                    C0395c c0395c2 = this.f1976i[i5];
                    if (c0395c2.f1959a.f2015j != 1 && !c0395c2.f1963e && c0395c2.f1962d.mo2553h(mo2571h)) {
                        float mo2554g = c0395c2.f1962d.mo2554g(mo2571h);
                        if (mo2554g < 0.0f) {
                            float f2 = (-c0395c2.f1960b) / mo2554g;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0395c c0395c3 = this.f1976i[i4];
                    c0395c3.f1959a.f2009d = -1;
                    c0395c3.m2597k(mo2571h);
                    C0404l c0404l2 = c0395c3.f1959a;
                    c0404l2.f2009d = i4;
                    c0404l2.m2561e(c0395c3);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    /* renamed from: s */
    public final void m2577s() {
        int i = 0;
        if (f1969b) {
            while (true) {
                C0395c[] c0395cArr = this.f1976i;
                if (i >= c0395cArr.length) {
                    return;
                }
                C0395c c0395c = c0395cArr[i];
                if (c0395c != null) {
                    this.f1982o.f1964a.m2574b(c0395c);
                }
                this.f1976i[i] = null;
                i++;
            }
        } else {
            while (true) {
                C0395c[] c0395cArr2 = this.f1976i;
                if (i >= c0395cArr2.length) {
                    return;
                }
                C0395c c0395c2 = c0395cArr2[i];
                if (c0395c2 != null) {
                    this.f1982o.f1965b.m2574b(c0395c2);
                }
                this.f1976i[i] = null;
                i++;
            }
        }
    }

    /* renamed from: t */
    public void m2576t() {
        C0396d c0396d;
        int i = 0;
        while (true) {
            c0396d = this.f1982o;
            C0404l[] c0404lArr = c0396d.f1967d;
            if (i >= c0404lArr.length) {
                break;
            }
            C0404l c0404l = c0404lArr[i];
            if (c0404l != null) {
                c0404l.m2563c();
            }
            i++;
        }
        C0399g c0399g = c0396d.f1966c;
        C0404l[] c0404lArr2 = this.f1983p;
        int i2 = this.f1984q;
        c0399g.getClass();
        if (i2 > c0404lArr2.length) {
            i2 = c0404lArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0404l c0404l2 = c0404lArr2[i3];
            int i4 = c0399g.f1987b;
            Object[] objArr = c0399g.f1986a;
            if (i4 < objArr.length) {
                objArr[i4] = c0404l2;
                c0399g.f1987b = i4 + 1;
            }
        }
        this.f1984q = 0;
        Arrays.fill(this.f1982o.f1967d, (Object) null);
        this.f1972e = 0;
        this.f1973f.mo2572c();
        this.f1979l = 1;
        for (int i5 = 0; i5 < this.f1980m; i5++) {
            this.f1976i[i5].getClass();
        }
        m2577s();
        this.f1980m = 0;
        this.f1985r = f1969b ? new C0397e(this, this.f1982o) : new C0395c(this.f1982o);
    }
}