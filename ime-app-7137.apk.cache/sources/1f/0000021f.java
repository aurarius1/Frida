package p010b.p037h.p040b.p041n;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p037h.p040b.C0396d;
import p010b.p037h.p040b.C0398f;
import p010b.p037h.p040b.p041n.p042k.AbstractC0430o;
import p010b.p037h.p040b.p041n.p042k.C0418c;
import p010b.p037h.p040b.p041n.p042k.C0419d;
import p010b.p037h.p040b.p041n.p042k.C0421f;
import p010b.p037h.p040b.p041n.p042k.C0424i;
import p010b.p037h.p043c.C0435e;

/* renamed from: b.h.b.n.f */
/* loaded from: classes.dex */
public class C0411f extends C0410e {

    /* renamed from: k0 */
    public int f2132k0;

    /* renamed from: l0 */
    public int f2133l0;

    /* renamed from: e0 */
    public ArrayList f2126e0 = new ArrayList();

    /* renamed from: f0 */
    public C0418c f2127f0 = new C0418c(this);

    /* renamed from: g0 */
    public C0421f f2128g0 = new C0421f(this);

    /* renamed from: h0 */
    public C0435e f2129h0 = null;

    /* renamed from: i0 */
    public boolean f2130i0 = false;

    /* renamed from: j0 */
    public C0398f f2131j0 = new C0398f();

    /* renamed from: m0 */
    public int f2134m0 = 0;

    /* renamed from: n0 */
    public int f2135n0 = 0;

    /* renamed from: o0 */
    public C0407b[] f2136o0 = new C0407b[4];

    /* renamed from: p0 */
    public C0407b[] f2137p0 = new C0407b[4];

    /* renamed from: q0 */
    public int f2138q0 = 263;

    /* renamed from: r0 */
    public boolean f2139r0 = false;

    /* renamed from: s0 */
    public boolean f2140s0 = false;

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: B */
    public void mo2518B(boolean z, boolean z2) {
        super.mo2518B(z, z2);
        int size = this.f2126e0.size();
        for (int i = 0; i < size; i++) {
            ((C0410e) this.f2126e0.get(i)).mo2518B(z, z2);
        }
    }

    /* renamed from: D */
    public void m2517D(C0410e c0410e, int i) {
        if (i == 0) {
            int i2 = this.f2134m0 + 1;
            C0407b[] c0407bArr = this.f2137p0;
            if (i2 >= c0407bArr.length) {
                this.f2137p0 = (C0407b[]) Arrays.copyOf(c0407bArr, c0407bArr.length * 2);
            }
            C0407b[] c0407bArr2 = this.f2137p0;
            int i3 = this.f2134m0;
            c0407bArr2[i3] = new C0407b(c0410e, 0, this.f2130i0);
            this.f2134m0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.f2135n0 + 1;
            C0407b[] c0407bArr3 = this.f2136o0;
            if (i4 >= c0407bArr3.length) {
                this.f2136o0 = (C0407b[]) Arrays.copyOf(c0407bArr3, c0407bArr3.length * 2);
            }
            C0407b[] c0407bArr4 = this.f2136o0;
            int i5 = this.f2135n0;
            c0407bArr4[i5] = new C0407b(c0410e, 1, this.f2130i0);
            this.f2135n0 = i5 + 1;
        }
    }

    /* renamed from: E */
    public boolean m2516E(C0398f c0398f) {
        mo2507a(c0398f);
        int size = this.f2126e0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0410e c0410e = (C0410e) this.f2126e0.get(i);
            boolean[] zArr = c0410e.f2078I;
            zArr[0] = false;
            zArr[1] = false;
            if (c0410e instanceof C0406a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C0410e c0410e2 = (C0410e) this.f2126e0.get(i2);
                if (c0410e2 instanceof C0406a) {
                    C0406a c0406a = (C0406a) c0410e2;
                    for (int i3 = 0; i3 < c0406a.f2147f0; i3++) {
                        C0410e c0410e3 = c0406a.f2146e0[i3];
                        int i4 = c0406a.f2030g0;
                        if (i4 == 0 || i4 == 1) {
                            c0410e3.f2078I[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            c0410e3.f2078I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            C0410e c0410e4 = (C0410e) this.f2126e0.get(i5);
            c0410e4.getClass();
            if (c0410e4 instanceof C0412g) {
                c0410e4.mo2507a(c0398f);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C0410e c0410e5 = (C0410e) this.f2126e0.get(i6);
            if (c0410e5 instanceof C0411f) {
                int[] iArr = c0410e5.f2079J;
                int i7 = iArr[0];
                int i8 = iArr[1];
                if (i7 == 2) {
                    iArr[0] = 1;
                }
                if (i8 == 2) {
                    iArr[1] = 1;
                }
                c0410e5.mo2507a(c0398f);
                if (i7 == 2) {
                    c0410e5.m2522w(i7);
                }
                if (i8 == 2) {
                    c0410e5.m2519z(i8);
                }
            } else {
                c0410e5.f2107h = -1;
                c0410e5.f2108i = -1;
                if (this.f2079J[0] != 2 && c0410e5.f2079J[0] == 4) {
                    int i9 = c0410e5.f2124y.f2067e;
                    int m2529n = m2529n() - c0410e5.f2070A.f2067e;
                    C0409d c0409d = c0410e5.f2124y;
                    c0409d.f2069g = c0398f.m2584l(c0409d);
                    C0409d c0409d2 = c0410e5.f2070A;
                    c0409d2.f2069g = c0398f.m2584l(c0409d2);
                    c0398f.m2591e(c0410e5.f2124y.f2069g, i9);
                    c0398f.m2591e(c0410e5.f2070A.f2069g, m2529n);
                    c0410e5.f2107h = 2;
                    c0410e5.f2085P = i9;
                    int i10 = m2529n - i9;
                    c0410e5.f2081L = i10;
                    int i11 = c0410e5.f2088S;
                    if (i10 < i11) {
                        c0410e5.f2081L = i11;
                    }
                }
                if (this.f2079J[1] != 2 && c0410e5.f2079J[1] == 4) {
                    int i12 = c0410e5.f2125z.f2067e;
                    int m2535h = m2535h() - c0410e5.f2071B.f2067e;
                    C0409d c0409d3 = c0410e5.f2125z;
                    c0409d3.f2069g = c0398f.m2584l(c0409d3);
                    C0409d c0409d4 = c0410e5.f2071B;
                    c0409d4.f2069g = c0398f.m2584l(c0409d4);
                    c0398f.m2591e(c0410e5.f2125z.f2069g, i12);
                    c0398f.m2591e(c0410e5.f2071B.f2069g, m2535h);
                    if (c0410e5.f2087R > 0 || c0410e5.f2093X == 8) {
                        C0409d c0409d5 = c0410e5.f2072C;
                        c0409d5.f2069g = c0398f.m2584l(c0409d5);
                        c0398f.m2591e(c0410e5.f2072C.f2069g, c0410e5.f2087R + i12);
                    }
                    c0410e5.f2108i = 2;
                    c0410e5.f2086Q = i12;
                    int i13 = m2535h - i12;
                    c0410e5.f2082M = i13;
                    int i14 = c0410e5.f2089T;
                    if (i13 < i14) {
                        c0410e5.f2082M = i14;
                    }
                }
                if (!(c0410e5 instanceof C0412g)) {
                    c0410e5.mo2507a(c0398f);
                }
            }
        }
        if (this.f2134m0 > 0) {
            AbstractC0022t.m3507a(this, c0398f, 0);
        }
        if (this.f2135n0 > 0) {
            AbstractC0022t.m3507a(this, c0398f, 1);
        }
        return true;
    }

    /* renamed from: F */
    public boolean m2515F(boolean z, int i) {
        int i2;
        C0424i c0424i;
        boolean z2;
        C0424i c0424i2;
        int m2535h;
        C0421f c0421f = this.f2128g0;
        boolean z3 = true;
        boolean z4 = z & true;
        int m2536g = c0421f.f2164a.m2536g(0);
        int m2536g2 = c0421f.f2164a.m2536g(1);
        int m2528o = c0421f.f2164a.m2528o();
        int m2527p = c0421f.f2164a.m2527p();
        if (z4 && (m2536g == 2 || m2536g2 == 2)) {
            Iterator it = c0421f.f2168e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0430o abstractC0430o = (AbstractC0430o) it.next();
                if (abstractC0430o.f2205f == i && !abstractC0430o.mo2473k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m2536g == 2) {
                    C0411f c0411f = c0421f.f2164a;
                    c0411f.f2079J[0] = 1;
                    c0411f.m2540A(c0421f.m2496d(c0411f, 0));
                    C0411f c0411f2 = c0421f.f2164a;
                    c0424i2 = c0411f2.f2102d.f2204e;
                    m2535h = c0411f2.m2529n();
                    c0424i2.mo2491c(m2535h);
                }
            } else if (z4 && m2536g2 == 2) {
                C0411f c0411f3 = c0421f.f2164a;
                c0411f3.f2079J[1] = 1;
                c0411f3.m2523v(c0421f.m2496d(c0411f3, 1));
                C0411f c0411f4 = c0421f.f2164a;
                c0424i2 = c0411f4.f2104e.f2204e;
                m2535h = c0411f4.m2535h();
                c0424i2.mo2491c(m2535h);
            }
        }
        C0411f c0411f5 = c0421f.f2164a;
        int[] iArr = c0411f5.f2079J;
        if (i == 0) {
            if (iArr[0] == 1 || iArr[0] == 4) {
                int m2529n = c0411f5.m2529n() + m2528o;
                c0421f.f2164a.f2102d.f2208i.mo2491c(m2529n);
                c0424i = c0421f.f2164a.f2102d.f2204e;
                i2 = m2529n - m2528o;
                c0424i.mo2491c(i2);
                z2 = true;
            }
            z2 = false;
        } else {
            if (iArr[1] == 1 || iArr[1] == 4) {
                int m2535h2 = c0411f5.m2535h() + m2527p;
                c0421f.f2164a.f2104e.f2208i.mo2491c(m2535h2);
                i2 = m2535h2 - m2527p;
                c0424i = c0421f.f2164a.f2104e.f2204e;
                c0424i.mo2491c(i2);
                z2 = true;
            }
            z2 = false;
        }
        c0421f.m2493g();
        Iterator it2 = c0421f.f2168e.iterator();
        while (it2.hasNext()) {
            AbstractC0430o abstractC0430o2 = (AbstractC0430o) it2.next();
            if (abstractC0430o2.f2205f == i && (abstractC0430o2.f2201b != c0421f.f2164a || abstractC0430o2.f2206g)) {
                abstractC0430o2.mo2479e();
            }
        }
        Iterator it3 = c0421f.f2168e.iterator();
        while (it3.hasNext()) {
            AbstractC0430o abstractC0430o3 = (AbstractC0430o) it3.next();
            if (abstractC0430o3.f2205f == i && (z2 || abstractC0430o3.f2201b != c0421f.f2164a)) {
                if (!abstractC0430o3.f2207h.f2190j || !abstractC0430o3.f2208i.f2190j || (!(abstractC0430o3 instanceof C0419d) && !abstractC0430o3.f2204e.f2190j)) {
                    z3 = false;
                    break;
                }
            }
        }
        c0421f.f2164a.m2522w(m2536g);
        c0421f.f2164a.m2519z(m2536g2);
        return z3;
    }

    /* renamed from: G */
    public void m2514G() {
        this.f2128g0.f2165b = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: int[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2513H() {
        boolean z;
        C0398f c0398f;
        int size;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int max;
        ?? r2;
        boolean z5;
        int max2;
        boolean z6;
        boolean z7;
        C0398f c0398f2;
        boolean z8;
        int i2 = 0;
        this.f2085P = 0;
        this.f2086Q = 0;
        int max3 = Math.max(0, m2529n());
        int max4 = Math.max(0, m2535h());
        this.f2139r0 = false;
        this.f2140s0 = false;
        int i3 = this.f2138q0;
        if (!((i3 & 64) == 64)) {
            if (!((i3 & 128) == 128)) {
                z = false;
                c0398f = this.f2131j0;
                c0398f.getClass();
                c0398f.f1977j = false;
                if (i3 != 0 && z) {
                    c0398f.f1977j = true;
                }
                int[] iArr = this.f2079J;
                int i4 = iArr[1];
                int i5 = iArr[0];
                ArrayList arrayList = this.f2126e0;
                boolean z9 = m2534i() != 2 || m2530m() == 2;
                this.f2134m0 = 0;
                this.f2135n0 = 0;
                size = this.f2126e0.size();
                for (i = 0; i < size; i++) {
                    C0410e c0410e = (C0410e) this.f2126e0.get(i);
                    if (c0410e instanceof C0411f) {
                        ((C0411f) c0410e).m2513H();
                    }
                }
                int i6 = 0;
                z2 = true;
                z3 = false;
                while (z2) {
                    int i7 = i6 + 1;
                    try {
                        this.f2131j0.m2576t();
                        this.f2134m0 = i2;
                        this.f2135n0 = i2;
                        m2538d(this.f2131j0);
                        for (int i8 = 0; i8 < size; i8++) {
                            ((C0410e) this.f2126e0.get(i8)).m2538d(this.f2131j0);
                        }
                        m2516E(this.f2131j0);
                        try {
                            c0398f2 = this.f2131j0;
                            c0398f2.getClass();
                        } catch (Exception e) {
                            e = e;
                            z2 = true;
                            e.printStackTrace();
                            PrintStream printStream = System.out;
                            printStream.println("EXCEPTION : " + e);
                            C0398f c0398f3 = this.f2131j0;
                            if (z2) {
                            }
                            if (z9) {
                            }
                            z4 = false;
                            max = Math.max(this.f2088S, m2529n());
                            if (max > m2529n()) {
                            }
                            max2 = Math.max(this.f2089T, m2535h());
                            if (max2 > m2535h()) {
                            }
                            if (!z7) {
                            }
                            z3 = z7;
                            z2 = z6;
                            i6 = i7;
                            i2 = 0;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (c0398f2.f1977j) {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= c0398f2.f1980m) {
                                z8 = true;
                                break;
                            } else if (!c0398f2.f1976i[i9].f1963e) {
                                z8 = false;
                                break;
                            } else {
                                i9++;
                            }
                        }
                        if (z8) {
                            c0398f2.m2586j();
                            z2 = true;
                            C0398f c0398f32 = this.f2131j0;
                            if (z2) {
                                AbstractC0415j.f2148a[2] = false;
                                mo2509C(c0398f32);
                                int size2 = this.f2126e0.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    ((C0410e) this.f2126e0.get(i10)).mo2509C(c0398f32);
                                }
                            } else {
                                mo2509C(c0398f32);
                                for (int i11 = 0; i11 < size; i11++) {
                                    ((C0410e) this.f2126e0.get(i11)).mo2509C(this.f2131j0);
                                }
                            }
                            if (z9 || i7 >= 8 || !AbstractC0415j.f2148a[2]) {
                                z4 = false;
                            } else {
                                int i12 = 0;
                                int i13 = 0;
                                for (int i14 = 0; i14 < size; i14++) {
                                    C0410e c0410e2 = (C0410e) this.f2126e0.get(i14);
                                    i12 = Math.max(i12, c0410e2.m2529n() + c0410e2.f2085P);
                                    i13 = Math.max(i13, c0410e2.m2535h() + c0410e2.f2086Q);
                                }
                                int max5 = Math.max(this.f2088S, i12);
                                int max6 = Math.max(this.f2089T, i13);
                                if (i5 != 2 || m2529n() >= max5) {
                                    z4 = false;
                                } else {
                                    m2540A(max5);
                                    this.f2079J[0] = 2;
                                    z4 = true;
                                    z3 = true;
                                }
                                if (i4 == 2 && m2535h() < max6) {
                                    m2523v(max6);
                                    this.f2079J[1] = 2;
                                    z4 = true;
                                    z3 = true;
                                }
                            }
                            max = Math.max(this.f2088S, m2529n());
                            if (max > m2529n()) {
                                m2540A(max);
                                r2 = 1;
                                this.f2079J[0] = 1;
                                z4 = true;
                                z5 = true;
                            } else {
                                r2 = 1;
                                z5 = z3;
                            }
                            max2 = Math.max(this.f2089T, m2535h());
                            if (max2 > m2535h()) {
                                m2523v(max2);
                                this.f2079J[r2] = r2;
                                z7 = true;
                                z6 = true;
                            } else {
                                z6 = z4;
                                z7 = z5;
                            }
                            if (!z7) {
                                if (this.f2079J[0] == 2 && max3 > 0 && m2529n() > max3) {
                                    this.f2139r0 = r2;
                                    this.f2079J[0] = r2;
                                    m2540A(max3);
                                    z7 = true;
                                    z6 = true;
                                }
                                if (this.f2079J[r2] == 2 && max4 > 0 && m2535h() > max4) {
                                    this.f2140s0 = r2;
                                    this.f2079J[r2] = r2;
                                    m2523v(max4);
                                    z2 = true;
                                    z3 = true;
                                    i6 = i7;
                                    i2 = 0;
                                }
                            }
                            z3 = z7;
                            z2 = z6;
                            i6 = i7;
                            i2 = 0;
                        }
                    }
                    c0398f2.m2579q(c0398f2.f1973f);
                    z2 = true;
                    C0398f c0398f322 = this.f2131j0;
                    if (z2) {
                    }
                    if (z9) {
                    }
                    z4 = false;
                    max = Math.max(this.f2088S, m2529n());
                    if (max > m2529n()) {
                    }
                    max2 = Math.max(this.f2089T, m2535h());
                    if (max2 > m2535h()) {
                    }
                    if (!z7) {
                    }
                    z3 = z7;
                    z2 = z6;
                    i6 = i7;
                    i2 = 0;
                }
                this.f2126e0 = arrayList;
                if (z3) {
                    int[] iArr2 = this.f2079J;
                    iArr2[0] = i5;
                    iArr2[1] = i4;
                }
                mo2510u(this.f2131j0.f1982o);
            }
        }
        z = true;
        c0398f = this.f2131j0;
        c0398f.getClass();
        c0398f.f1977j = false;
        if (i3 != 0) {
            c0398f.f1977j = true;
        }
        int[] iArr3 = this.f2079J;
        int i42 = iArr3[1];
        int i52 = iArr3[0];
        ArrayList arrayList2 = this.f2126e0;
        if (m2534i() != 2) {
        }
        this.f2134m0 = 0;
        this.f2135n0 = 0;
        size = this.f2126e0.size();
        while (i < size) {
        }
        int i62 = 0;
        z2 = true;
        z3 = false;
        while (z2) {
        }
        this.f2126e0 = arrayList2;
        if (z3) {
        }
        mo2510u(this.f2131j0.f1982o);
    }

    /* renamed from: I */
    public void m2512I(int i) {
        this.f2138q0 = i;
        C0398f.f1969b = AbstractC0415j.m2504a(i, 256);
    }

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: t */
    public void mo2511t() {
        this.f2131j0.m2576t();
        this.f2132k0 = 0;
        this.f2133l0 = 0;
        this.f2126e0.clear();
        super.mo2511t();
    }

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: u */
    public void mo2510u(C0396d c0396d) {
        super.mo2510u(c0396d);
        int size = this.f2126e0.size();
        for (int i = 0; i < size; i++) {
            ((C0410e) this.f2126e0.get(i)).mo2510u(c0396d);
        }
    }
}