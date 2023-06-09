package p010b.p037h.p040b.p041n.p042k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p010b.p037h.p040b.p041n.AbstractC0414i;
import p010b.p037h.p040b.p041n.C0409d;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.C0411f;
import p010b.p037h.p040b.p041n.C0412g;
import p010b.p037h.p043c.C0435e;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.n.k.f */
/* loaded from: classes.dex */
public class C0421f {

    /* renamed from: a */
    public C0411f f2164a;

    /* renamed from: d */
    public C0411f f2167d;

    /* renamed from: f */
    public C0435e f2169f;

    /* renamed from: g */
    public C0417b f2170g;

    /* renamed from: h */
    public ArrayList f2171h;

    /* renamed from: b */
    public boolean f2165b = true;

    /* renamed from: c */
    public boolean f2166c = true;

    /* renamed from: e */
    public ArrayList f2168e = new ArrayList();

    public C0421f(C0411f c0411f) {
        new ArrayList();
        this.f2169f = null;
        this.f2170g = new C0417b();
        this.f2171h = new ArrayList();
        this.f2164a = c0411f;
        this.f2167d = c0411f;
    }

    /* renamed from: a */
    public final void m2499a(C0423h c0423h, int i, int i2, C0423h c0423h2, ArrayList arrayList, C0428m c0428m) {
        AbstractC0430o abstractC0430o = c0423h.f2184d;
        if (abstractC0430o.f2202c == null) {
            C0411f c0411f = this.f2164a;
            if (abstractC0430o == c0411f.f2102d || abstractC0430o == c0411f.f2104e) {
                return;
            }
            if (c0428m == null) {
                c0428m = new C0428m(abstractC0430o, i2);
                arrayList.add(c0428m);
            }
            abstractC0430o.f2202c = c0428m;
            c0428m.f2197c.add(abstractC0430o);
            for (InterfaceC0420e interfaceC0420e : abstractC0430o.f2207h.f2191k) {
                if (interfaceC0420e instanceof C0423h) {
                    m2499a((C0423h) interfaceC0420e, i, 0, c0423h2, arrayList, c0428m);
                }
            }
            for (InterfaceC0420e interfaceC0420e2 : abstractC0430o.f2208i.f2191k) {
                if (interfaceC0420e2 instanceof C0423h) {
                    m2499a((C0423h) interfaceC0420e2, i, 1, c0423h2, arrayList, c0428m);
                }
            }
            if (i == 1 && (abstractC0430o instanceof C0429n)) {
                for (InterfaceC0420e interfaceC0420e3 : ((C0429n) abstractC0430o).f2198k.f2191k) {
                    if (interfaceC0420e3 instanceof C0423h) {
                        m2499a((C0423h) interfaceC0420e3, i, 2, c0423h2, arrayList, c0428m);
                    }
                }
            }
            for (C0423h c0423h3 : abstractC0430o.f2207h.f2192l) {
                m2499a(c0423h3, i, 0, c0423h2, arrayList, c0428m);
            }
            for (C0423h c0423h4 : abstractC0430o.f2208i.f2192l) {
                m2499a(c0423h4, i, 1, c0423h2, arrayList, c0428m);
            }
            if (i == 1 && (abstractC0430o instanceof C0429n)) {
                for (C0423h c0423h5 : ((C0429n) abstractC0430o).f2198k.f2192l) {
                    m2499a(c0423h5, i, 2, c0423h2, arrayList, c0428m);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        if (r2.f2110k == 0) goto L23;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2498b(C0411f c0411f) {
        int i;
        int i2;
        int i3;
        int i4;
        C0421f c0421f;
        C0410e c0410e;
        C0424i c0424i;
        int m2535h;
        Iterator it = c0411f.f2126e0.iterator();
        while (it.hasNext()) {
            C0410e c0410e2 = (C0410e) it.next();
            int[] iArr = c0410e2.f2079J;
            int i5 = iArr[0];
            int i6 = iArr[1];
            if (c0410e2.f2093X != 8) {
                float f = c0410e2.f2114o;
                if (f < 1.0f && i5 == 3) {
                    c0410e2.f2109j = 2;
                }
                float f2 = c0410e2.f2117r;
                if (f2 < 1.0f && i6 == 3) {
                    c0410e2.f2110k = 2;
                }
                if (c0410e2.f2083N > 0.0f) {
                    if (i5 == 3 && (i6 == 2 || i6 == 1)) {
                        c0410e2.f2109j = 3;
                    } else {
                        if (i6 != 3 || (i5 != 2 && i5 != 1)) {
                            if (i5 == 3 && i6 == 3) {
                                if (c0410e2.f2109j == 0) {
                                    c0410e2.f2109j = 3;
                                }
                            }
                        }
                        c0410e2.f2110k = 3;
                    }
                }
                int i7 = (i5 == 3 && c0410e2.f2109j == 1 && (c0410e2.f2124y.f2066d == null || c0410e2.f2070A.f2066d == null)) ? 2 : i5;
                int i8 = (i6 == 3 && c0410e2.f2110k == 1 && (c0410e2.f2125z.f2066d == null || c0410e2.f2071B.f2066d == null)) ? 2 : i6;
                C0427l c0427l = c0410e2.f2102d;
                c0427l.f2203d = i7;
                int i9 = c0410e2.f2109j;
                c0427l.f2200a = i9;
                C0429n c0429n = c0410e2.f2104e;
                c0429n.f2203d = i8;
                int i10 = c0410e2.f2110k;
                c0429n.f2200a = i10;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i8 == 4 || i8 == 1 || i8 == 2)) {
                    int m2529n = c0410e2.m2529n();
                    if (i7 == 4) {
                        i = (c0411f.m2529n() - c0410e2.f2124y.f2067e) - c0410e2.f2070A.f2067e;
                        i2 = 1;
                    } else {
                        i = m2529n;
                        i2 = i7;
                    }
                    int m2535h2 = c0410e2.m2535h();
                    if (i8 == 4) {
                        i3 = (c0411f.m2535h() - c0410e2.f2125z.f2067e) - c0410e2.f2071B.f2067e;
                        i4 = 1;
                        c0421f = this;
                        c0410e = c0410e2;
                        c0421f.m2494f(c0410e, i2, i, i4, i3);
                        c0410e2.f2102d.f2204e.mo2491c(c0410e2.m2529n());
                        c0410e2.f2104e.f2204e.mo2491c(c0410e2.m2535h());
                    } else {
                        i3 = m2535h2;
                        i4 = i8;
                        c0421f = this;
                        c0410e = c0410e2;
                        c0421f.m2494f(c0410e, i2, i, i4, i3);
                        c0410e2.f2102d.f2204e.mo2491c(c0410e2.m2529n());
                        c0410e2.f2104e.f2204e.mo2491c(c0410e2.m2535h());
                    }
                } else {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        if (i9 == 3) {
                            if (i8 == 2) {
                                m2494f(c0410e2, 2, 0, 2, 0);
                            }
                            int m2535h3 = c0410e2.m2535h();
                            i3 = m2535h3;
                            i = (int) ((m2535h3 * c0410e2.f2083N) + 0.5f);
                            i4 = 1;
                        } else if (i9 == 1) {
                            m2494f(c0410e2, 2, 0, i8, 0);
                            c0424i = c0410e2.f2102d.f2204e;
                            m2535h = c0410e2.m2529n();
                            c0424i.f2193m = m2535h;
                        } else if (i9 == 2) {
                            int[] iArr2 = c0411f.f2079J;
                            if (iArr2[0] == 1 || iArr2[0] == 4) {
                                i = (int) ((f * c0411f.m2529n()) + 0.5f);
                                i3 = c0410e2.m2535h();
                                i4 = i8;
                            }
                        } else {
                            C0409d[] c0409dArr = c0410e2.f2076G;
                            if (c0409dArr[0].f2066d != null) {
                                if (c0409dArr[1].f2066d == null) {
                                }
                            }
                            i4 = i8;
                            i2 = 2;
                            i = 0;
                            i3 = 0;
                            c0421f = this;
                            c0410e = c0410e2;
                            c0421f.m2494f(c0410e, i2, i, i4, i3);
                            c0410e2.f2102d.f2204e.mo2491c(c0410e2.m2529n());
                            c0410e2.f2104e.f2204e.mo2491c(c0410e2.m2535h());
                        }
                        i2 = 1;
                        c0421f = this;
                        c0410e = c0410e2;
                        c0421f.m2494f(c0410e, i2, i, i4, i3);
                        c0410e2.f2102d.f2204e.mo2491c(c0410e2.m2529n());
                        c0410e2.f2104e.f2204e.mo2491c(c0410e2.m2535h());
                    }
                    if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        if (i10 == 3) {
                            if (i7 == 2) {
                                m2494f(c0410e2, 2, 0, 2, 0);
                            }
                            i = c0410e2.m2529n();
                            float f3 = c0410e2.f2083N;
                            if (c0410e2.f2084O == -1) {
                                f3 = 1.0f / f3;
                            }
                            i3 = (int) ((i * f3) + 0.5f);
                            i4 = 1;
                            c0421f = this;
                            c0410e = c0410e2;
                            i2 = 1;
                            c0421f.m2494f(c0410e, i2, i, i4, i3);
                            c0410e2.f2102d.f2204e.mo2491c(c0410e2.m2529n());
                            c0410e2.f2104e.f2204e.mo2491c(c0410e2.m2535h());
                        } else if (i10 == 1) {
                            m2494f(c0410e2, i7, 0, 2, 0);
                            c0424i = c0410e2.f2104e.f2204e;
                            m2535h = c0410e2.m2535h();
                            c0424i.f2193m = m2535h;
                        } else if (i10 == 2) {
                            int[] iArr3 = c0411f.f2079J;
                            if (iArr3[1] == 1 || iArr3[1] == 4) {
                                i = c0410e2.m2529n();
                                i3 = (int) ((f2 * c0411f.m2535h()) + 0.5f);
                                i2 = i7;
                                i4 = 1;
                                c0421f = this;
                                c0410e = c0410e2;
                                c0421f.m2494f(c0410e, i2, i, i4, i3);
                                c0410e2.f2102d.f2204e.mo2491c(c0410e2.m2529n());
                                c0410e2.f2104e.f2204e.mo2491c(c0410e2.m2535h());
                            }
                        } else {
                            C0409d[] c0409dArr2 = c0410e2.f2076G;
                            if (c0409dArr2[2].f2066d != null) {
                                if (c0409dArr2[3].f2066d == null) {
                                }
                            }
                            i4 = i8;
                            i2 = 2;
                            i = 0;
                            i3 = 0;
                            c0421f = this;
                            c0410e = c0410e2;
                            c0421f.m2494f(c0410e, i2, i, i4, i3);
                            c0410e2.f2102d.f2204e.mo2491c(c0410e2.m2529n());
                            c0410e2.f2104e.f2204e.mo2491c(c0410e2.m2535h());
                        }
                    }
                    if (i7 == 3 && i8 == 3) {
                        if (i9 == 1 || i10 == 1) {
                            m2494f(c0410e2, 2, 0, 2, 0);
                            c0410e2.f2102d.f2204e.f2193m = c0410e2.m2529n();
                            c0424i = c0410e2.f2104e.f2204e;
                            m2535h = c0410e2.m2535h();
                            c0424i.f2193m = m2535h;
                        } else if (i10 == 2 && i9 == 2) {
                            int[] iArr4 = c0411f.f2079J;
                            if (iArr4[0] == 1 || iArr4[0] == 1) {
                                if (iArr4[1] == 1 || iArr4[1] == 1) {
                                    i = (int) ((f * c0411f.m2529n()) + 0.5f);
                                    i3 = (int) ((f2 * c0411f.m2535h()) + 0.5f);
                                    i4 = 1;
                                    c0421f = this;
                                    c0410e = c0410e2;
                                    i2 = 1;
                                    c0421f.m2494f(c0410e, i2, i, i4, i3);
                                    c0410e2.f2102d.f2204e.mo2491c(c0410e2.m2529n());
                                    c0410e2.f2104e.f2204e.mo2491c(c0410e2.m2535h());
                                }
                            }
                        }
                    }
                }
            }
            c0410e2.f2096a = true;
        }
        return false;
    }

    /* renamed from: c */
    public void m2497c() {
        AbstractC0430o c0425j;
        ArrayList arrayList = this.f2168e;
        arrayList.clear();
        this.f2167d.f2102d.mo2478f();
        this.f2167d.f2104e.mo2478f();
        arrayList.add(this.f2167d.f2102d);
        arrayList.add(this.f2167d.f2104e);
        Iterator it = this.f2167d.f2126e0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0410e c0410e = (C0410e) it.next();
            if (c0410e instanceof C0412g) {
                c0425j = new C0425j(c0410e);
            } else {
                if (c0410e.m2525r()) {
                    if (c0410e.f2098b == null) {
                        c0410e.f2098b = new C0419d(c0410e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0410e.f2098b);
                } else {
                    arrayList.add(c0410e.f2102d);
                }
                if (c0410e.m2524s()) {
                    if (c0410e.f2100c == null) {
                        c0410e.f2100c = new C0419d(c0410e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0410e.f2100c);
                } else {
                    arrayList.add(c0410e.f2104e);
                }
                if (c0410e instanceof AbstractC0414i) {
                    c0425j = new C0426k(c0410e);
                }
            }
            arrayList.add(c0425j);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0430o) it2.next()).mo2478f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0430o abstractC0430o = (AbstractC0430o) it3.next();
            if (abstractC0430o.f2201b != this.f2167d) {
                abstractC0430o.mo2480d();
            }
        }
        this.f2171h.clear();
        C0428m.f2195a = 0;
        m2495e(this.f2164a.f2102d, 0, this.f2171h);
        m2495e(this.f2164a.f2104e, 1, this.f2171h);
        this.f2165b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2496d(C0411f c0411f, int i) {
        boolean contains;
        C0423h c0423h;
        long j;
        long j2;
        C0423h c0423h2;
        float f;
        C0421f c0421f = this;
        C0411f c0411f2 = c0411f;
        int size = c0421f.f2171h.size();
        long j3 = 0;
        long j4 = 0;
        int i2 = 0;
        while (i2 < size) {
            C0428m c0428m = (C0428m) c0421f.f2171h.get(i2);
            AbstractC0430o abstractC0430o = c0428m.f2196b;
            if (abstractC0430o instanceof C0419d) {
                if (((C0419d) abstractC0430o).f2205f != i) {
                    j3 = Math.max(j3, j4);
                    i2++;
                    j4 = 0;
                    c0421f = this;
                    c0411f2 = c0411f;
                }
                C0423h c0423h3 = (i == 0 ? c0411f2.f2102d : c0411f2.f2104e).f2207h;
                C0423h c0423h4 = (i == 0 ? c0411f2.f2102d : c0411f2.f2104e).f2208i;
                contains = abstractC0430o.f2207h.f2192l.contains(c0423h3);
                boolean contains2 = c0428m.f2196b.f2208i.f2192l.contains(c0423h4);
                long mo2474j = c0428m.f2196b.mo2474j();
                if (contains || !contains2) {
                    AbstractC0430o abstractC0430o2 = c0428m.f2196b;
                    if (contains) {
                        j2 = c0428m.m2485b(abstractC0430o2.f2207h, c0423h2.f2186f);
                        j = c0428m.f2196b.f2207h.f2186f + mo2474j;
                    } else if (contains2) {
                        j = (-c0428m.f2196b.f2208i.f2186f) + mo2474j;
                        j2 = -c0428m.m2486a(abstractC0430o2.f2208i, c0423h.f2186f);
                    } else {
                        j4 = (abstractC0430o2.mo2474j() + abstractC0430o2.f2207h.f2186f) - c0428m.f2196b.f2208i.f2186f;
                    }
                    j4 = Math.max(j2, j);
                } else {
                    long m2485b = c0428m.m2485b(c0428m.f2196b.f2207h, j4);
                    long m2486a = c0428m.m2486a(c0428m.f2196b.f2208i, j4);
                    long j5 = m2485b - mo2474j;
                    AbstractC0430o abstractC0430o3 = c0428m.f2196b;
                    int i3 = abstractC0430o3.f2208i.f2186f;
                    if (j5 >= (-i3)) {
                        j5 += i3;
                    }
                    long j6 = abstractC0430o3.f2207h.f2186f;
                    long j7 = ((-m2486a) - mo2474j) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0410e c0410e = abstractC0430o3.f2201b;
                    c0410e.getClass();
                    float f2 = (float) ((i == 0 ? c0410e.f2090U : i == 1 ? c0410e.f2091V : -1.0f) > 0.0f ? (((float) j5) / (1.0f - f)) + (((float) j7) / f) : 0L);
                    long m1195a = (f2 * f) + 0.5f + mo2474j + AbstractC1124a.m1195a(1.0f, f, f2, 0.5f);
                    AbstractC0430o abstractC0430o4 = c0428m.f2196b;
                    j4 = (abstractC0430o4.f2207h.f2186f + m1195a) - abstractC0430o4.f2208i.f2186f;
                }
                j3 = Math.max(j3, j4);
                i2++;
                j4 = 0;
                c0421f = this;
                c0411f2 = c0411f;
            } else if (i == 0) {
                if (!(abstractC0430o instanceof C0427l)) {
                    j3 = Math.max(j3, j4);
                    i2++;
                    j4 = 0;
                    c0421f = this;
                    c0411f2 = c0411f;
                }
                C0423h c0423h32 = (i == 0 ? c0411f2.f2102d : c0411f2.f2104e).f2207h;
                C0423h c0423h42 = (i == 0 ? c0411f2.f2102d : c0411f2.f2104e).f2208i;
                contains = abstractC0430o.f2207h.f2192l.contains(c0423h32);
                boolean contains22 = c0428m.f2196b.f2208i.f2192l.contains(c0423h42);
                long mo2474j2 = c0428m.f2196b.mo2474j();
                if (contains) {
                }
                AbstractC0430o abstractC0430o22 = c0428m.f2196b;
                if (contains) {
                }
                j4 = Math.max(j2, j);
                j3 = Math.max(j3, j4);
                i2++;
                j4 = 0;
                c0421f = this;
                c0411f2 = c0411f;
            } else {
                if (!(abstractC0430o instanceof C0429n)) {
                    j3 = Math.max(j3, j4);
                    i2++;
                    j4 = 0;
                    c0421f = this;
                    c0411f2 = c0411f;
                }
                C0423h c0423h322 = (i == 0 ? c0411f2.f2102d : c0411f2.f2104e).f2207h;
                C0423h c0423h422 = (i == 0 ? c0411f2.f2102d : c0411f2.f2104e).f2208i;
                contains = abstractC0430o.f2207h.f2192l.contains(c0423h322);
                boolean contains222 = c0428m.f2196b.f2208i.f2192l.contains(c0423h422);
                long mo2474j22 = c0428m.f2196b.mo2474j();
                if (contains) {
                }
                AbstractC0430o abstractC0430o222 = c0428m.f2196b;
                if (contains) {
                }
                j4 = Math.max(j2, j);
                j3 = Math.max(j3, j4);
                i2++;
                j4 = 0;
                c0421f = this;
                c0411f2 = c0411f;
            }
        }
        return (int) j3;
    }

    /* renamed from: e */
    public final void m2495e(AbstractC0430o abstractC0430o, int i, ArrayList arrayList) {
        for (InterfaceC0420e interfaceC0420e : abstractC0430o.f2207h.f2191k) {
            if (interfaceC0420e instanceof C0423h) {
                m2499a((C0423h) interfaceC0420e, i, 0, abstractC0430o.f2208i, arrayList, null);
            } else if (interfaceC0420e instanceof AbstractC0430o) {
                m2499a(((AbstractC0430o) interfaceC0420e).f2207h, i, 0, abstractC0430o.f2208i, arrayList, null);
            }
        }
        for (InterfaceC0420e interfaceC0420e2 : abstractC0430o.f2208i.f2191k) {
            if (interfaceC0420e2 instanceof C0423h) {
                m2499a((C0423h) interfaceC0420e2, i, 1, abstractC0430o.f2207h, arrayList, null);
            } else if (interfaceC0420e2 instanceof AbstractC0430o) {
                m2499a(((AbstractC0430o) interfaceC0420e2).f2208i, i, 1, abstractC0430o.f2207h, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC0420e interfaceC0420e3 : ((C0429n) abstractC0430o).f2198k.f2191k) {
                if (interfaceC0420e3 instanceof C0423h) {
                    m2499a((C0423h) interfaceC0420e3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m2494f(C0410e c0410e, int i, int i2, int i3, int i4) {
        C0417b c0417b = this.f2170g;
        c0417b.f2149a = i;
        c0417b.f2150b = i3;
        c0417b.f2151c = i2;
        c0417b.f2152d = i4;
        this.f2169f.m2460a(c0410e, c0417b);
        c0410e.m2540A(this.f2170g.f2153e);
        c0410e.m2523v(this.f2170g.f2154f);
        C0417b c0417b2 = this.f2170g;
        c0410e.f2122w = c0417b2.f2156h;
        int i5 = c0417b2.f2155g;
        c0410e.f2087R = i5;
        c0410e.f2122w = i5 > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r10 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r8 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        r2.f2193m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        r2.mo2491c(r3);
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2493g() {
        C0424i c0424i;
        int m2529n;
        C0424i c0424i2;
        Iterator it = this.f2164a.f2126e0.iterator();
        while (it.hasNext()) {
            C0410e c0410e = (C0410e) it.next();
            if (!c0410e.f2096a) {
                int[] iArr = c0410e.f2079J;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0410e.f2109j;
                int i4 = c0410e.f2110k;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C0424i c0424i3 = c0410e.f2102d.f2204e;
                boolean z3 = c0424i3.f2190j;
                C0424i c0424i4 = c0410e.f2104e.f2204e;
                boolean z4 = c0424i4.f2190j;
                if (z3 && z4) {
                    m2494f(c0410e, 1, c0424i3.f2187g, 1, c0424i4.f2187g);
                } else if (z3 && z) {
                    m2494f(c0410e, 1, c0424i3.f2187g, 2, c0424i4.f2187g);
                    c0424i = c0410e.f2104e.f2204e;
                    m2529n = c0410e.m2535h();
                } else {
                    if (z4 && z2) {
                        m2494f(c0410e, 2, c0424i3.f2187g, 1, c0424i4.f2187g);
                        c0424i = c0410e.f2102d.f2204e;
                        m2529n = c0410e.m2529n();
                    }
                    if (c0410e.f2096a && (c0424i2 = c0410e.f2104e.f2199l) != null) {
                        c0424i2.mo2491c(c0410e.f2087R);
                    }
                }
                c0410e.f2096a = true;
                if (c0410e.f2096a) {
                    c0424i2.mo2491c(c0410e.f2087R);
                }
            }
        }
    }
}