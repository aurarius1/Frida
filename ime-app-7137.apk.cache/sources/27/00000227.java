package p010b.p037h.p040b.p041n.p042k;

import java.util.ArrayList;
import java.util.Iterator;
import p010b.p037h.p040b.p041n.C0409d;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.C0411f;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.n.k.d */
/* loaded from: classes.dex */
public class C0419d extends AbstractC0430o {

    /* renamed from: k */
    public ArrayList f2162k;

    /* renamed from: l */
    public int f2163l;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r2 == 1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:13:0x0029). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0038 -> B:17:0x003a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003f -> B:13:0x0029). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0419d(C0410e c0410e, int i) {
        super(c0410e);
        C0419d c0419d;
        AbstractC0430o abstractC0430o;
        int i2;
        this.f2162k = new ArrayList();
        this.f2205f = i;
        C0410e c0410e2 = this.f2201b;
        while (true) {
            C0410e m2532k = c0410e2.m2532k(this.f2205f);
            if (m2532k == null) {
                break;
            }
            c0410e2 = m2532k;
        }
        this.f2201b = c0410e2;
        ArrayList arrayList = this.f2162k;
        int i3 = this.f2205f;
        if (i3 == 0) {
            c0419d = this;
            abstractC0430o = c0410e2.f2102d;
            arrayList.add(abstractC0430o);
            c0410e2 = c0410e2.m2533j(c0419d.f2205f);
            if (c0410e2 == null) {
                arrayList = c0419d.f2162k;
                int i4 = c0419d.f2205f;
                if (i4 != 0) {
                }
                abstractC0430o = c0410e2.f2102d;
                arrayList.add(abstractC0430o);
                c0410e2 = c0410e2.m2533j(c0419d.f2205f);
                if (c0410e2 == null) {
                    Iterator it = c0419d.f2162k.iterator();
                    while (it.hasNext()) {
                        AbstractC0430o abstractC0430o2 = (AbstractC0430o) it.next();
                        int i5 = c0419d.f2205f;
                        if (i5 == 0) {
                            abstractC0430o2.f2201b.f2098b = c0419d;
                        } else if (i5 == 1) {
                            abstractC0430o2.f2201b.f2100c = c0419d;
                        }
                    }
                    if ((c0419d.f2205f == 0 && ((C0411f) c0419d.f2201b.f2080K).f2130i0) && c0419d.f2162k.size() > 1) {
                        ArrayList arrayList2 = c0419d.f2162k;
                        c0419d.f2201b = ((AbstractC0430o) arrayList2.get(arrayList2.size() - 1)).f2201b;
                    }
                    if (c0419d.f2205f == 0) {
                        i2 = c0419d.f2201b.f2095Z;
                    } else {
                        i2 = c0419d.f2201b.f2097a0;
                    }
                    c0419d.f2163l = i2;
                }
            }
        } else if (i3 == 1) {
            c0419d = this;
            abstractC0430o = c0410e2.f2104e;
            arrayList.add(abstractC0430o);
            c0410e2 = c0410e2.m2533j(c0419d.f2205f);
            if (c0410e2 == null) {
            }
        } else {
            c0419d = this;
            abstractC0430o = null;
            arrayList.add(abstractC0430o);
            c0410e2 = c0410e2.m2533j(c0419d.f2205f);
            if (c0410e2 == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:284:0x03c2, code lost:
        r9 = r9 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o, p010b.p037h.p040b.p041n.p042k.InterfaceC0420e
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2483a(InterfaceC0420e interfaceC0420e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        float f2;
        boolean z2;
        int i9;
        float f3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0423h c0423h = this.f2207h;
        if (c0423h.f2190j) {
            C0423h c0423h2 = this.f2208i;
            if (c0423h2.f2190j) {
                C0410e c0410e = this.f2201b.f2080K;
                boolean z3 = (c0410e == null || !(c0410e instanceof C0411f)) ? false : ((C0411f) c0410e).f2130i0;
                int i15 = c0423h2.f2187g - c0423h.f2187g;
                int size = this.f2162k.size();
                int i16 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i16 >= size) {
                        i16 = -1;
                        break;
                    } else if (((AbstractC0430o) this.f2162k.get(i16)).f2201b.f2093X != 8) {
                        break;
                    } else {
                        i16++;
                    }
                }
                int i17 = size - 1;
                int i18 = i17;
                while (true) {
                    if (i18 < 0) {
                        break;
                    }
                    if (((AbstractC0430o) this.f2162k.get(i18)).f2201b.f2093X != 8) {
                        i = i18;
                        break;
                    }
                    i18--;
                }
                int i19 = 0;
                while (true) {
                    int i20 = 3;
                    if (i19 >= 2) {
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        f = 0.0f;
                        break;
                    }
                    int i21 = 0;
                    i5 = 0;
                    i11 = 0;
                    i12 = 0;
                    f = 0.0f;
                    while (i21 < size) {
                        AbstractC0430o abstractC0430o = (AbstractC0430o) this.f2162k.get(i21);
                        C0410e c0410e2 = abstractC0430o.f2201b;
                        if (c0410e2.f2093X != i2) {
                            i12++;
                            if (i21 > 0 && i21 >= i16) {
                                i5 += abstractC0430o.f2207h.f2186f;
                            }
                            C0424i c0424i = abstractC0430o.f2204e;
                            int i22 = c0424i.f2187g;
                            boolean z4 = abstractC0430o.f2203d != i20;
                            if (z4) {
                                int i23 = this.f2205f;
                                if (i23 == 0 && !c0410e2.f2102d.f2204e.f2190j) {
                                    return;
                                }
                                if (i23 == 1 && !c0410e2.f2104e.f2204e.f2190j) {
                                    return;
                                }
                                i13 = i22;
                            } else {
                                i13 = i22;
                                if (abstractC0430o.f2200a == 1 && i19 == 0) {
                                    i14 = c0424i.f2193m;
                                    i11++;
                                } else if (c0424i.f2190j) {
                                    i14 = i13;
                                }
                                z4 = true;
                                if (z4) {
                                    i11++;
                                    float f4 = c0410e2.f2099b0[this.f2205f];
                                    if (f4 >= 0.0f) {
                                        f += f4;
                                    }
                                } else {
                                    i5 += i14;
                                }
                                if (i21 < i17 && i21 < i) {
                                    i5 += -abstractC0430o.f2208i.f2186f;
                                }
                            }
                            i14 = i13;
                            if (z4) {
                            }
                            if (i21 < i17) {
                                i5 += -abstractC0430o.f2208i.f2186f;
                            }
                        }
                        i21++;
                        i2 = 8;
                        i20 = 3;
                    }
                    if (i5 < i15 || i11 == 0) {
                        break;
                    }
                    i19++;
                    i2 = 8;
                }
                i3 = i11;
                i4 = i12;
                int i24 = this.f2207h.f2187g;
                if (z3) {
                    i24 = this.f2208i.f2187g;
                }
                if (i5 > i15) {
                    int i25 = (int) (((i5 - i15) / 2.0f) + 0.5f);
                    i24 = z3 ? i24 + i25 : i24 - i25;
                }
                if (i3 > 0) {
                    float f5 = i15 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        AbstractC0430o abstractC0430o2 = (AbstractC0430o) this.f2162k.get(i27);
                        int i29 = i26;
                        C0410e c0410e3 = abstractC0430o2.f2201b;
                        int i30 = i5;
                        int i31 = i24;
                        if (c0410e3.f2093X != 8 && abstractC0430o2.f2203d == 3) {
                            C0424i c0424i2 = abstractC0430o2.f2204e;
                            if (!c0424i2.f2190j) {
                                if (f > 0.0f) {
                                    z2 = z3;
                                    i10 = (int) (((c0410e3.f2099b0[this.f2205f] * f5) / f) + 0.5f);
                                } else {
                                    z2 = z3;
                                    i10 = i29;
                                }
                                if (this.f2205f == 0) {
                                    int i32 = c0410e3.f2113n;
                                    f3 = f5;
                                    i9 = i4;
                                    int max = Math.max(c0410e3.f2112m, abstractC0430o2.f2200a == 1 ? Math.min(i10, c0424i2.f2193m) : i10);
                                    if (i32 > 0) {
                                        max = Math.min(i32, max);
                                    }
                                    if (max != i10) {
                                        i28++;
                                        i10 = max;
                                    }
                                } else {
                                    i9 = i4;
                                    f3 = f5;
                                    int i33 = c0410e3.f2116q;
                                    int max2 = Math.max(c0410e3.f2115p, abstractC0430o2.f2200a == 1 ? Math.min(i10, c0424i2.f2193m) : i10);
                                    if (i33 > 0) {
                                        max2 = Math.min(i33, max2);
                                    }
                                    if (max2 != i10) {
                                        i28++;
                                        i10 = max2;
                                    }
                                }
                                abstractC0430o2.f2204e.mo2491c(i10);
                                i27++;
                                i26 = i29;
                                i5 = i30;
                                i24 = i31;
                                z3 = z2;
                                f5 = f3;
                                i4 = i9;
                            }
                        }
                        z2 = z3;
                        i9 = i4;
                        f3 = f5;
                        i27++;
                        i26 = i29;
                        i5 = i30;
                        i24 = i31;
                        z3 = z2;
                        f5 = f3;
                        i4 = i9;
                    }
                    z = z3;
                    i6 = i4;
                    i7 = i24;
                    int i34 = i5;
                    if (i28 > 0) {
                        i3 -= i28;
                        int i35 = 0;
                        for (int i36 = 0; i36 < size; i36++) {
                            AbstractC0430o abstractC0430o3 = (AbstractC0430o) this.f2162k.get(i36);
                            if (abstractC0430o3.f2201b.f2093X != 8) {
                                if (i36 > 0 && i36 >= i16) {
                                    i35 += abstractC0430o3.f2207h.f2186f;
                                }
                                i35 += abstractC0430o3.f2204e.f2187g;
                                if (i36 < i17 && i36 < i) {
                                    i35 += -abstractC0430o3.f2208i.f2186f;
                                }
                            }
                        }
                        i5 = i35;
                    } else {
                        i5 = i34;
                    }
                    i8 = 2;
                    if (this.f2163l == 2 && i28 == 0) {
                        this.f2163l = 0;
                    }
                } else {
                    z = z3;
                    i6 = i4;
                    i7 = i24;
                    i8 = 2;
                }
                if (i5 > i15) {
                    this.f2163l = i8;
                }
                if (i6 > 0 && i3 == 0 && i16 == i) {
                    this.f2163l = i8;
                }
                int i37 = this.f2163l;
                int i38 = i6;
                if (i37 == 1) {
                    int i39 = i38 > 1 ? (i15 - i5) / (i38 - 1) : i38 == 1 ? (i15 - i5) / 2 : 0;
                    if (i3 > 0) {
                        i39 = 0;
                    }
                    int i40 = i7;
                    for (int i41 = 0; i41 < size; i41++) {
                        AbstractC0430o abstractC0430o4 = (AbstractC0430o) this.f2162k.get(z ? size - (i41 + 1) : i41);
                        if (abstractC0430o4.f2201b.f2093X == 8) {
                            abstractC0430o4.f2207h.mo2491c(i40);
                            abstractC0430o4.f2208i.mo2491c(i40);
                        } else {
                            if (i41 > 0) {
                                i40 = z ? i40 - i39 : i40 + i39;
                            }
                            if (i41 > 0 && i41 >= i16) {
                                int i42 = abstractC0430o4.f2207h.f2186f;
                                i40 = z ? i40 - i42 : i40 + i42;
                            }
                            (z ? abstractC0430o4.f2208i : abstractC0430o4.f2207h).mo2491c(i40);
                            C0424i c0424i3 = abstractC0430o4.f2204e;
                            int i43 = c0424i3.f2187g;
                            if (abstractC0430o4.f2203d == 3 && abstractC0430o4.f2200a == 1) {
                                i43 = c0424i3.f2193m;
                            }
                            i40 = z ? i40 - i43 : i40 + i43;
                            (z ? abstractC0430o4.f2207h : abstractC0430o4.f2208i).mo2491c(i40);
                            abstractC0430o4.f2206g = true;
                            if (i41 < i17 && i41 < i) {
                                int i44 = -abstractC0430o4.f2208i.f2186f;
                                i40 = z ? i40 - i44 : i40 + i44;
                            }
                        }
                    }
                } else if (i37 == 0) {
                    int i45 = (i15 - i5) / (i38 + 1);
                    if (i3 > 0) {
                        i45 = 0;
                    }
                    int i46 = i7;
                    for (int i47 = 0; i47 < size; i47++) {
                        AbstractC0430o abstractC0430o5 = (AbstractC0430o) this.f2162k.get(z ? size - (i47 + 1) : i47);
                        if (abstractC0430o5.f2201b.f2093X == 8) {
                            abstractC0430o5.f2207h.mo2491c(i46);
                            abstractC0430o5.f2208i.mo2491c(i46);
                        } else {
                            int i48 = z ? i46 - i45 : i46 + i45;
                            if (i47 > 0 && i47 >= i16) {
                                int i49 = abstractC0430o5.f2207h.f2186f;
                                i48 = z ? i48 - i49 : i48 + i49;
                            }
                            (z ? abstractC0430o5.f2208i : abstractC0430o5.f2207h).mo2491c(i48);
                            C0424i c0424i4 = abstractC0430o5.f2204e;
                            int i50 = c0424i4.f2187g;
                            if (abstractC0430o5.f2203d == 3 && abstractC0430o5.f2200a == 1) {
                                i50 = Math.min(i50, c0424i4.f2193m);
                            }
                            i46 = z ? i48 - i50 : i48 + i50;
                            (z ? abstractC0430o5.f2207h : abstractC0430o5.f2208i).mo2491c(i46);
                            if (i47 < i17 && i47 < i) {
                                int i51 = -abstractC0430o5.f2208i.f2186f;
                                i46 = z ? i46 - i51 : i46 + i51;
                            }
                        }
                    }
                } else if (i37 == 2) {
                    if (this.f2205f == 0) {
                        f2 = this.f2201b.f2090U;
                    } else {
                        f2 = this.f2201b.f2091V;
                    }
                    if (z) {
                        f2 = 1.0f - f2;
                    }
                    int i52 = (((int) ((((float) (i15 - i5)) * f2) + 0.5f)) < 0 || i3 > 0) ? 0 : 0;
                    int i53 = z ? i7 - i52 : i7 + i52;
                    for (int i54 = 0; i54 < size; i54++) {
                        AbstractC0430o abstractC0430o6 = (AbstractC0430o) this.f2162k.get(z ? size - (i54 + 1) : i54);
                        if (abstractC0430o6.f2201b.f2093X == 8) {
                            abstractC0430o6.f2207h.mo2491c(i53);
                            abstractC0430o6.f2208i.mo2491c(i53);
                        } else {
                            if (i54 > 0 && i54 >= i16) {
                                int i55 = abstractC0430o6.f2207h.f2186f;
                                i53 = z ? i53 - i55 : i53 + i55;
                            }
                            (z ? abstractC0430o6.f2208i : abstractC0430o6.f2207h).mo2491c(i53);
                            C0424i c0424i5 = abstractC0430o6.f2204e;
                            int i56 = c0424i5.f2187g;
                            if (abstractC0430o6.f2203d == 3 && abstractC0430o6.f2200a == 1) {
                                i56 = c0424i5.f2193m;
                            }
                            i53 += i56;
                            (z ? abstractC0430o6.f2207h : abstractC0430o6.f2208i).mo2491c(i53);
                            if (i54 < i17 && i54 < i) {
                                int i57 = -abstractC0430o6.f2208i.f2186f;
                                i53 = z ? i53 - i57 : i53 + i57;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        r2 = r6.f2208i;
        r2.f2192l.add(r1);
        r2.f2186f = -r0;
        r1.f2191k.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
        r6.f2207h.f2181a = r6;
        r6.f2208i.f2181a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
        return;
     */
    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2480d() {
        C0423h m2475i;
        int m2545b;
        Iterator it = this.f2162k.iterator();
        while (it.hasNext()) {
            ((AbstractC0430o) it.next()).mo2480d();
        }
        int size = this.f2162k.size();
        if (size < 1) {
            return;
        }
        C0410e c0410e = ((AbstractC0430o) this.f2162k.get(0)).f2201b;
        C0410e c0410e2 = ((AbstractC0430o) this.f2162k.get(size - 1)).f2201b;
        if (this.f2205f == 0) {
            C0409d c0409d = c0410e.f2124y;
            C0409d c0409d2 = c0410e2.f2070A;
            C0423h m2475i2 = m2475i(c0409d, 0);
            int m2545b2 = c0409d.m2545b();
            C0410e m2501m = m2501m();
            if (m2501m != null) {
                m2545b2 = m2501m.f2124y.m2545b();
            }
            if (m2475i2 != null) {
                C0423h c0423h = this.f2207h;
                c0423h.f2192l.add(m2475i2);
                c0423h.f2186f = m2545b2;
                m2475i2.f2191k.add(c0423h);
            }
            m2475i = m2475i(c0409d2, 0);
            m2545b = c0409d2.m2545b();
            C0410e m2500n = m2500n();
            if (m2500n != null) {
                m2545b = m2500n.f2070A.m2545b();
            }
        } else {
            C0409d c0409d3 = c0410e.f2125z;
            C0409d c0409d4 = c0410e2.f2071B;
            C0423h m2475i3 = m2475i(c0409d3, 1);
            int m2545b3 = c0409d3.m2545b();
            C0410e m2501m2 = m2501m();
            if (m2501m2 != null) {
                m2545b3 = m2501m2.f2125z.m2545b();
            }
            if (m2475i3 != null) {
                C0423h c0423h2 = this.f2207h;
                c0423h2.f2192l.add(m2475i3);
                c0423h2.f2186f = m2545b3;
                m2475i3.f2191k.add(c0423h2);
            }
            m2475i = m2475i(c0409d4, 1);
            m2545b = c0409d4.m2545b();
            C0410e m2500n2 = m2500n();
            if (m2500n2 != null) {
                m2545b = m2500n2.f2071B.m2545b();
            }
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: e */
    public void mo2479e() {
        for (int i = 0; i < this.f2162k.size(); i++) {
            ((AbstractC0430o) this.f2162k.get(i)).mo2479e();
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: f */
    public void mo2478f() {
        this.f2202c = null;
        Iterator it = this.f2162k.iterator();
        while (it.hasNext()) {
            ((AbstractC0430o) it.next()).mo2478f();
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: j */
    public long mo2474j() {
        int size = this.f2162k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC0430o abstractC0430o = (AbstractC0430o) this.f2162k.get(i);
            j = abstractC0430o.f2208i.f2186f + abstractC0430o.mo2474j() + j + abstractC0430o.f2207h.f2186f;
        }
        return j;
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: k */
    public boolean mo2473k() {
        int size = this.f2162k.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0430o) this.f2162k.get(i)).mo2473k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C0410e m2501m() {
        for (int i = 0; i < this.f2162k.size(); i++) {
            C0410e c0410e = ((AbstractC0430o) this.f2162k.get(i)).f2201b;
            if (c0410e.f2093X != 8) {
                return c0410e;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final C0410e m2500n() {
        for (int size = this.f2162k.size() - 1; size >= 0; size--) {
            C0410e c0410e = ((AbstractC0430o) this.f2162k.get(size)).f2201b;
            if (c0410e.f2093X != 8) {
                return c0410e;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("ChainRun ");
        m1187i.append(this.f2205f == 0 ? "horizontal : " : "vertical : ");
        String sb = m1187i.toString();
        Iterator it = this.f2162k.iterator();
        while (it.hasNext()) {
            String m1190f = AbstractC1124a.m1190f(sb, "<");
            sb = AbstractC1124a.m1190f(m1190f + ((AbstractC0430o) it.next()), "> ");
        }
        return sb;
    }
}