package p010b.p083u.p084e;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p057k.C0562c;

/* renamed from: b.u.e.b */
/* loaded from: classes.dex */
public final class C0918b {

    /* renamed from: d */
    public final C0928d1 f3534d;

    /* renamed from: a */
    public C0562c f3531a = new C0562c(30);

    /* renamed from: b */
    public final ArrayList f3532b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f3533c = new ArrayList();

    /* renamed from: f */
    public int f3536f = 0;

    /* renamed from: e */
    public final C0987s0 f3535e = new C0987s0(this);

    public C0918b(C0928d1 c0928d1) {
        this.f3534d = c0928d1;
    }

    /* renamed from: a */
    public final boolean m1731a(int i) {
        int size = this.f3533c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0914a c0914a = (C0914a) this.f3533c.get(i2);
            int i3 = c0914a.f3525a;
            if (i3 == 8) {
                if (m1726f(c0914a.f3528d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0914a.f3526b;
                int i5 = c0914a.f3528d + i4;
                while (i4 < i5) {
                    if (m1726f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m1730b() {
        int size = this.f3533c.size();
        for (int i = 0; i < size; i++) {
            this.f3534d.m1690a((C0914a) this.f3533c.get(i));
        }
        m1720l(this.f3533c);
        this.f3536f = 0;
    }

    /* renamed from: c */
    public void m1729c() {
        m1730b();
        int size = this.f3532b.size();
        for (int i = 0; i < size; i++) {
            C0914a c0914a = (C0914a) this.f3532b.get(i);
            int i2 = c0914a.f3525a;
            if (i2 == 1) {
                this.f3534d.m1690a(c0914a);
                this.f3534d.m1687d(c0914a.f3526b, c0914a.f3528d);
            } else if (i2 == 2) {
                this.f3534d.m1690a(c0914a);
                C0928d1 c0928d1 = this.f3534d;
                int i3 = c0914a.f3526b;
                int i4 = c0914a.f3528d;
                c0928d1.f3569a.m3181S(i3, i4, true);
                RecyclerView recyclerView = c0928d1.f3569a;
                recyclerView.f776v0 = true;
                recyclerView.f770s0.f3572c += i4;
            } else if (i2 == 4) {
                this.f3534d.m1690a(c0914a);
                this.f3534d.m1688c(c0914a.f3526b, c0914a.f3528d, c0914a.f3527c);
            } else if (i2 == 8) {
                this.f3534d.m1690a(c0914a);
                this.f3534d.m1686e(c0914a.f3526b, c0914a.f3528d);
            }
        }
        m1720l(this.f3532b);
        this.f3536f = 0;
    }

    /* renamed from: d */
    public final void m1728d(C0914a c0914a) {
        int i;
        int i2 = c0914a.f3525a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m1719m = m1719m(c0914a.f3526b, i2);
        int i3 = c0914a.f3526b;
        int i4 = c0914a.f3525a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + c0914a);
        } else {
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0914a.f3528d; i6++) {
            int m1719m2 = m1719m((i * i6) + c0914a.f3526b, c0914a.f3525a);
            int i7 = c0914a.f3525a;
            if (i7 == 2 ? m1719m2 == m1719m : i7 == 4 && m1719m2 == m1719m + 1) {
                i5++;
            } else {
                C0914a m1724h = m1724h(i7, m1719m, i5, c0914a.f3527c);
                m1727e(m1724h, i3);
                m1721k(m1724h);
                if (c0914a.f3525a == 4) {
                    i3 += i5;
                }
                m1719m = m1719m2;
                i5 = 1;
            }
        }
        Object obj = c0914a.f3527c;
        m1721k(c0914a);
        if (i5 > 0) {
            C0914a m1724h2 = m1724h(c0914a.f3525a, m1719m, i5, obj);
            m1727e(m1724h2, i3);
            m1721k(m1724h2);
        }
    }

    /* renamed from: e */
    public void m1727e(C0914a c0914a, int i) {
        this.f3534d.m1690a(c0914a);
        int i2 = c0914a.f3525a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f3534d.m1688c(i, c0914a.f3528d, c0914a.f3527c);
            return;
        }
        C0928d1 c0928d1 = this.f3534d;
        int i3 = c0914a.f3528d;
        c0928d1.f3569a.m3181S(i, i3, true);
        RecyclerView recyclerView = c0928d1.f3569a;
        recyclerView.f776v0 = true;
        recyclerView.f770s0.f3572c += i3;
    }

    /* renamed from: f */
    public int m1726f(int i, int i2) {
        int size = this.f3533c.size();
        while (i2 < size) {
            C0914a c0914a = (C0914a) this.f3533c.get(i2);
            int i3 = c0914a.f3525a;
            if (i3 == 8) {
                int i4 = c0914a.f3526b;
                if (i4 == i) {
                    i = c0914a.f3528d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0914a.f3528d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0914a.f3526b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0914a.f3528d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0914a.f3528d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public boolean m1725g() {
        return this.f3532b.size() > 0;
    }

    /* renamed from: h */
    public C0914a m1724h(int i, int i2, int i3, Object obj) {
        C0914a c0914a = (C0914a) this.f3531a.mo2331a();
        if (c0914a == null) {
            return new C0914a(i, i2, i3, obj);
        }
        c0914a.f3525a = i;
        c0914a.f3526b = i2;
        c0914a.f3528d = i3;
        c0914a.f3527c = obj;
        return c0914a;
    }

    /* renamed from: i */
    public final void m1723i(C0914a c0914a) {
        this.f3533c.add(c0914a);
        int i = c0914a.f3525a;
        if (i == 1) {
            this.f3534d.m1687d(c0914a.f3526b, c0914a.f3528d);
        } else if (i == 2) {
            C0928d1 c0928d1 = this.f3534d;
            c0928d1.f3569a.m3181S(c0914a.f3526b, c0914a.f3528d, false);
            c0928d1.f3569a.f776v0 = true;
        } else if (i == 4) {
            this.f3534d.m1688c(c0914a.f3526b, c0914a.f3528d, c0914a.f3527c);
        } else if (i == 8) {
            this.f3534d.m1686e(c0914a.f3526b, c0914a.f3528d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0914a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017e, code lost:
        r2.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
        if (r6 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0183, code lost:
        r2.add(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0140, code lost:
        if (r4 > r12.f3526b) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016a, code lost:
        if (r4 >= r12.f3526b) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016c, code lost:
        r11.f3528d = r4 - r12.f3528d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0171, code lost:
        r2.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:
        if (r11.f3526b == r11.f3528d) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017a, code lost:
        r2.set(r7, r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1722j() {
        boolean z;
        char c;
        C0914a m1724h;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        C0987s0 c0987s0 = this.f3535e;
        ArrayList arrayList = this.f3532b;
        c0987s0.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0914a) arrayList.get(size)).f3525a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            C0914a c0914a = null;
            if (size == -1) {
                break;
            }
            int i6 = size + 1;
            C0914a c0914a2 = (C0914a) arrayList.get(size);
            C0914a c0914a3 = (C0914a) arrayList.get(i6);
            int i7 = c0914a3.f3525a;
            if (i7 == 1) {
                int i8 = c0914a2.f3528d;
                int i9 = c0914a3.f3526b;
                int i10 = i8 < i9 ? -1 : 0;
                int i11 = c0914a2.f3526b;
                if (i11 < i9) {
                    i10++;
                }
                if (i9 <= i11) {
                    c0914a2.f3526b = i11 + c0914a3.f3528d;
                }
                int i12 = c0914a3.f3526b;
                if (i12 <= i8) {
                    c0914a2.f3528d = i8 + c0914a3.f3528d;
                }
                c0914a3.f3526b = i12 + i10;
                arrayList.set(size, c0914a3);
                arrayList.set(i6, c0914a2);
            } else if (i7 == 2) {
                int i13 = c0914a2.f3526b;
                int i14 = c0914a2.f3528d;
                int i15 = c0914a3.f3526b;
                if (i13 < i14) {
                    if (i15 == i13 && c0914a3.f3528d == i14 - i13) {
                        z4 = false;
                        z3 = z4;
                        z2 = true;
                        if (i14 >= i15) {
                        }
                        i3 = c0914a2.f3526b;
                        i4 = c0914a3.f3526b;
                        if (i3 > i4) {
                        }
                        if (!z2) {
                        }
                    } else {
                        z2 = false;
                        z3 = false;
                        if (i14 >= i15) {
                            c0914a3.f3526b = i15 - 1;
                        } else {
                            int i16 = c0914a3.f3528d;
                            if (i14 < i15 + i16) {
                                c0914a3.f3528d = i16 - 1;
                                c0914a2.f3525a = 2;
                                c0914a2.f3528d = 1;
                                if (c0914a3.f3528d == 0) {
                                    arrayList.remove(i6);
                                    c0987s0.f3823a.m1721k(c0914a3);
                                }
                            }
                        }
                        i3 = c0914a2.f3526b;
                        i4 = c0914a3.f3526b;
                        if (i3 > i4) {
                            c0914a3.f3526b = i4 + 1;
                        } else {
                            int i17 = i4 + c0914a3.f3528d;
                            if (i3 < i17) {
                                c0914a = c0987s0.f3823a.m1724h(2, i3 + 1, i17 - i3, null);
                                c0914a3.f3528d = c0914a2.f3526b - c0914a3.f3526b;
                            }
                        }
                        if (!z2) {
                            arrayList.set(size, c0914a3);
                            arrayList.remove(i6);
                            c0987s0.f3823a.m1721k(c0914a2);
                        } else if (z3) {
                            if (c0914a != null) {
                                int i18 = c0914a2.f3526b;
                                if (i18 > c0914a.f3526b) {
                                    c0914a2.f3526b = i18 - c0914a.f3528d;
                                }
                                int i19 = c0914a2.f3528d;
                                if (i19 > c0914a.f3526b) {
                                    c0914a2.f3528d = i19 - c0914a.f3528d;
                                }
                            }
                            int i20 = c0914a2.f3526b;
                            if (i20 > c0914a3.f3526b) {
                                c0914a2.f3526b = i20 - c0914a3.f3528d;
                            }
                            i5 = c0914a2.f3528d;
                        } else {
                            if (c0914a != null) {
                                int i21 = c0914a2.f3526b;
                                if (i21 >= c0914a.f3526b) {
                                    c0914a2.f3526b = i21 - c0914a.f3528d;
                                }
                                int i22 = c0914a2.f3528d;
                                if (i22 >= c0914a.f3526b) {
                                    c0914a2.f3528d = i22 - c0914a.f3528d;
                                }
                            }
                            int i23 = c0914a2.f3526b;
                            if (i23 >= c0914a3.f3526b) {
                                c0914a2.f3526b = i23 - c0914a3.f3528d;
                            }
                            i5 = c0914a2.f3528d;
                        }
                    }
                } else if (i15 == i14 + 1 && c0914a3.f3528d == i13 - i14) {
                    z4 = true;
                    z3 = z4;
                    z2 = true;
                    if (i14 >= i15) {
                    }
                    i3 = c0914a2.f3526b;
                    i4 = c0914a3.f3526b;
                    if (i3 > i4) {
                    }
                    if (!z2) {
                    }
                } else {
                    z2 = false;
                    z3 = true;
                    if (i14 >= i15) {
                    }
                    i3 = c0914a2.f3526b;
                    i4 = c0914a3.f3526b;
                    if (i3 > i4) {
                    }
                    if (!z2) {
                    }
                }
            } else if (i7 == 4) {
                int i24 = c0914a2.f3528d;
                int i25 = c0914a3.f3526b;
                if (i24 < i25) {
                    c0914a3.f3526b = i25 - 1;
                } else {
                    int i26 = c0914a3.f3528d;
                    if (i24 < i25 + i26) {
                        c0914a3.f3528d = i26 - 1;
                        m1724h = c0987s0.f3823a.m1724h(4, c0914a2.f3526b, 1, c0914a3.f3527c);
                        i = c0914a2.f3526b;
                        i2 = c0914a3.f3526b;
                        if (i > i2) {
                            c0914a3.f3526b = i2 + 1;
                        } else {
                            int i27 = i2 + c0914a3.f3528d;
                            if (i < i27) {
                                int i28 = i27 - i;
                                c0914a = c0987s0.f3823a.m1724h(4, i + 1, i28, c0914a3.f3527c);
                                c0914a3.f3528d -= i28;
                            }
                        }
                        arrayList.set(i6, c0914a2);
                        if (c0914a3.f3528d <= 0) {
                            arrayList.set(size, c0914a3);
                        } else {
                            arrayList.remove(size);
                            c0987s0.f3823a.m1721k(c0914a3);
                        }
                        if (m1724h != null) {
                            arrayList.add(size, m1724h);
                        }
                        if (c0914a == null) {
                            arrayList.add(size, c0914a);
                        }
                    }
                }
                m1724h = null;
                i = c0914a2.f3526b;
                i2 = c0914a3.f3526b;
                if (i > i2) {
                }
                arrayList.set(i6, c0914a2);
                if (c0914a3.f3528d <= 0) {
                }
                if (m1724h != null) {
                }
                if (c0914a == null) {
                }
            }
        }
        int size2 = this.f3532b.size();
        for (int i29 = 0; i29 < size2; i29++) {
            C0914a c0914a4 = (C0914a) this.f3532b.get(i29);
            int i30 = c0914a4.f3525a;
            if (i30 == 1) {
                m1723i(c0914a4);
            } else if (i30 == 2) {
                int i31 = c0914a4.f3526b;
                int i32 = c0914a4.f3528d + i31;
                int i33 = i31;
                int i34 = 0;
                char c2 = 65535;
                while (i33 < i32) {
                    if (this.f3534d.m1689b(i33) != null || m1731a(i33)) {
                        if (c2 == 0) {
                            m1728d(m1724h(2, i31, i34, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            m1723i(m1724h(2, i31, i34, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i33 -= i34;
                        i32 -= i34;
                        i34 = 1;
                    } else {
                        i34++;
                    }
                    i33++;
                    c2 = c;
                }
                if (i34 != c0914a4.f3528d) {
                    m1721k(c0914a4);
                    c0914a4 = m1724h(2, i31, i34, null);
                }
                if (c2 == 0) {
                    m1728d(c0914a4);
                } else {
                    m1723i(c0914a4);
                }
            } else if (i30 == 4) {
                int i35 = c0914a4.f3526b;
                int i36 = c0914a4.f3528d + i35;
                int i37 = i35;
                int i38 = 0;
                char c3 = 65535;
                while (i35 < i36) {
                    if (this.f3534d.m1689b(i35) != null || m1731a(i35)) {
                        if (c3 == 0) {
                            m1728d(m1724h(4, i37, i38, c0914a4.f3527c));
                            i37 = i35;
                            i38 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            m1723i(m1724h(4, i37, i38, c0914a4.f3527c));
                            i37 = i35;
                            i38 = 0;
                        }
                        c3 = 0;
                    }
                    i38++;
                    i35++;
                }
                if (i38 != c0914a4.f3528d) {
                    Object obj = c0914a4.f3527c;
                    m1721k(c0914a4);
                    c0914a4 = m1724h(4, i37, i38, obj);
                }
                if (c3 == 0) {
                    m1728d(c0914a4);
                } else {
                    m1723i(c0914a4);
                }
            } else if (i30 == 8) {
                m1723i(c0914a4);
            }
        }
        this.f3532b.clear();
    }

    /* renamed from: k */
    public void m1721k(C0914a c0914a) {
        c0914a.f3527c = null;
        this.f3531a.mo2330b(c0914a);
    }

    /* renamed from: l */
    public void m1720l(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m1721k((C0914a) list.get(i));
        }
        list.clear();
    }

    /* renamed from: m */
    public final int m1719m(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f3533c.size() - 1; size >= 0; size--) {
            C0914a c0914a = (C0914a) this.f3533c.get(size);
            int i9 = c0914a.f3525a;
            if (i9 == 8) {
                int i10 = c0914a.f3526b;
                int i11 = c0914a.f3528d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            c0914a.f3526b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            c0914a.f3526b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        c0914a.f3528d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    c0914a.f3528d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    c0914a.f3526b = i7;
                    i--;
                }
            } else {
                int i12 = c0914a.f3526b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    c0914a.f3526b = i3;
                } else if (i9 == 1) {
                    i -= c0914a.f3528d;
                } else if (i9 == 2) {
                    i += c0914a.f3528d;
                }
            }
        }
        for (int size2 = this.f3533c.size() - 1; size2 >= 0; size2--) {
            C0914a c0914a2 = (C0914a) this.f3533c.get(size2);
            if (c0914a2.f3525a == 8) {
                int i13 = c0914a2.f3528d;
                if (i13 != c0914a2.f3526b && i13 >= 0) {
                }
                this.f3533c.remove(size2);
                m1721k(c0914a2);
            } else {
                if (c0914a2.f3528d > 0) {
                }
                this.f3533c.remove(size2);
                m1721k(c0914a2);
            }
        }
        return i;
    }
}