package p010b.p067m.p068d;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p010b.p036g.AbstractC0389m;
import p010b.p036g.C0378b;
import p010b.p046j.p054h.C0529b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.ViewTreeObserver$OnPreDrawListenerC0626u;

/* renamed from: b.m.d.w1 */
/* loaded from: classes.dex */
public abstract class AbstractC0756w1 {

    /* renamed from: a */
    public static final int[] f3183a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final AbstractC0695g2 f3184b;

    /* renamed from: c */
    public static final AbstractC0695g2 f3185c;

    static {
        AbstractC0695g2 abstractC0695g2 = null;
        f3184b = Build.VERSION.SDK_INT >= 21 ? new C0679c2() : null;
        try {
            abstractC0695g2 = (AbstractC0695g2) Class.forName("b.w.t").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f3185c = abstractC0695g2;
    }

    /* renamed from: a */
    public static void m1931a(ArrayList arrayList, C0378b c0378b, Collection collection) {
        for (int i = c0378b.f1943h - 1; i >= 0; i--) {
            View view = (View) c0378b.m2613k(i);
            if (collection.contains(AbstractC0605j0.m2235w(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
        if (r0.f3241n != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0074, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0084, code lost:
        if (r0.f3209B != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0086, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1930b(C0668a c0668a, C0726o1 c0726o1, SparseArray sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        C0753v1 c0753v1;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0726o1.f3080b;
        if (abstractComponentCallbacksC0763z == null || (i = abstractComponentCallbacksC0763z.f3253z) == 0) {
            return;
        }
        int i2 = z ? f3183a[c0726o1.f3079a] : c0726o1.f3079a;
        boolean z6 = true;
        boolean z7 = false;
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 == 4) {
                    boolean z8 = !z2 ? false : false;
                    z5 = z8;
                    z4 = false;
                    c0753v1 = (C0753v1) sparseArray.get(i);
                    if (z7) {
                    }
                    if (!z2) {
                        if (c0753v1 != null) {
                            c0753v1.f3179d = null;
                        }
                        if (!c0668a.f2912p) {
                        }
                    }
                    if (z5) {
                        if (c0753v1 == null) {
                        }
                        c0753v1.f3179d = abstractComponentCallbacksC0763z;
                        c0753v1.f3180e = z;
                        c0753v1.f3181f = c0668a;
                    }
                    if (z2) {
                        return;
                    }
                    return;
                }
                if (i2 != 5) {
                    if (i2 != 6) {
                        if (i2 != 7) {
                            z3 = false;
                            z6 = false;
                        }
                    }
                } else if (z2) {
                    if (abstractComponentCallbacksC0763z.f3220M) {
                        if (!abstractComponentCallbacksC0763z.f3209B) {
                        }
                    }
                    z3 = false;
                } else {
                    z3 = abstractComponentCallbacksC0763z.f3209B;
                }
                z7 = z3;
                z4 = z6;
                z6 = false;
                z5 = false;
                c0753v1 = (C0753v1) sparseArray.get(i);
                if (z7) {
                    if (c0753v1 == null) {
                        C0753v1 c0753v12 = new C0753v1();
                        sparseArray.put(i, c0753v12);
                        c0753v1 = c0753v12;
                    }
                    c0753v1.f3176a = abstractComponentCallbacksC0763z;
                    c0753v1.f3177b = z;
                    c0753v1.f3178c = c0668a;
                }
                if (!z2 && z4) {
                    if (c0753v1 != null && c0753v1.f3179d == abstractComponentCallbacksC0763z) {
                        c0753v1.f3179d = null;
                    }
                    if (!c0668a.f2912p) {
                        C0690f1 c0690f1 = c0668a.f2913q;
                        c0690f1.f2969c.m1979j(c0690f1.m2052j(abstractComponentCallbacksC0763z));
                        c0690f1.m2072Y(abstractComponentCallbacksC0763z, c0690f1.f2982p);
                    }
                }
                if (z5 && (c0753v1 == null || c0753v1.f3179d == null)) {
                    if (c0753v1 == null) {
                        C0753v1 c0753v13 = new C0753v1();
                        sparseArray.put(i, c0753v13);
                        c0753v1 = c0753v13;
                    }
                    c0753v1.f3179d = abstractComponentCallbacksC0763z;
                    c0753v1.f3180e = z;
                    c0753v1.f3181f = c0668a;
                }
                if (z2 || !z6 || c0753v1 == null || c0753v1.f3176a != abstractComponentCallbacksC0763z) {
                    return;
                }
                c0753v1.f3176a = null;
                return;
            }
            boolean z9 = abstractComponentCallbacksC0763z.f3241n;
            if (!z2) {
            }
            z5 = z8;
            z4 = false;
            c0753v1 = (C0753v1) sparseArray.get(i);
            if (z7) {
            }
            if (!z2) {
            }
            if (z5) {
            }
            if (z2) {
            }
        }
        if (!z2) {
            if (!abstractComponentCallbacksC0763z.f3241n) {
            }
        }
        z3 = false;
        z7 = z3;
        z4 = z6;
        z6 = false;
        z5 = false;
        c0753v1 = (C0753v1) sparseArray.get(i);
        if (z7) {
        }
        if (!z2) {
        }
        if (z5) {
        }
        if (z2) {
        }
    }

    /* renamed from: c */
    public static void m1929c(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2, boolean z, C0378b c0378b, boolean z2) {
        if (z) {
            abstractComponentCallbacksC0763z2.m1862n();
        } else {
            abstractComponentCallbacksC0763z.m1862n();
        }
    }

    /* renamed from: d */
    public static boolean m1928d(AbstractC0695g2 abstractC0695g2, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0695g2.mo1319e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C0378b m1927e(AbstractC0695g2 abstractC0695g2, C0378b c0378b, Object obj, C0753v1 c0753v1) {
        ArrayList arrayList;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0753v1.f3176a;
        View view = abstractComponentCallbacksC0763z.f3216I;
        if (c0378b.isEmpty() || obj == null || view == null) {
            c0378b.clear();
            return null;
        }
        C0378b c0378b2 = new C0378b();
        abstractC0695g2.m2025i(c0378b2, view);
        C0668a c0668a = c0753v1.f3178c;
        if (c0753v1.f3177b) {
            abstractComponentCallbacksC0763z.m1859q();
            arrayList = c0668a.f2910n;
        } else {
            abstractComponentCallbacksC0763z.m1862n();
            arrayList = c0668a.f2911o;
        }
        if (arrayList != null) {
            AbstractC0389m.m2626k(c0378b2, arrayList);
            AbstractC0389m.m2626k(c0378b2, c0378b.values());
        }
        m1919m(c0378b, c0378b2);
        return c0378b2;
    }

    /* renamed from: f */
    public static C0378b m1926f(AbstractC0695g2 abstractC0695g2, C0378b c0378b, Object obj, C0753v1 c0753v1) {
        ArrayList arrayList;
        if (!c0378b.isEmpty() && obj != null) {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0753v1.f3179d;
            C0378b c0378b2 = new C0378b();
            abstractC0695g2.m2025i(c0378b2, abstractComponentCallbacksC0763z.m1909C0());
            C0668a c0668a = c0753v1.f3181f;
            if (c0753v1.f3180e) {
                abstractComponentCallbacksC0763z.m1862n();
                arrayList = c0668a.f2911o;
            } else {
                abstractComponentCallbacksC0763z.m1859q();
                arrayList = c0668a.f2910n;
            }
            if (arrayList != null) {
                AbstractC0389m.m2626k(c0378b2, arrayList);
            }
            AbstractC0389m.m2626k(c0378b, c0378b2.keySet());
            return c0378b2;
        }
        c0378b.clear();
        return null;
    }

    /* renamed from: g */
    public static AbstractC0695g2 m1925g(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2) {
        ArrayList arrayList = new ArrayList();
        if (abstractComponentCallbacksC0763z != null) {
            abstractComponentCallbacksC0763z.m1860p();
            Object m1914A = abstractComponentCallbacksC0763z.m1914A();
            if (m1914A != null) {
                arrayList.add(m1914A);
            }
            Object m1910C = abstractComponentCallbacksC0763z.m1910C();
            if (m1910C != null) {
                arrayList.add(m1910C);
            }
        }
        if (abstractComponentCallbacksC0763z2 != null) {
            abstractComponentCallbacksC0763z2.m1863m();
            Object m1845y = abstractComponentCallbacksC0763z2.m1845y();
            if (m1845y != null) {
                arrayList.add(m1845y);
            }
            abstractComponentCallbacksC0763z2.m1912B();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0695g2 abstractC0695g2 = f3184b;
        if (abstractC0695g2 == null || !m1928d(abstractC0695g2, arrayList)) {
            AbstractC0695g2 abstractC0695g22 = f3185c;
            if (abstractC0695g22 == null || !m1928d(abstractC0695g22, arrayList)) {
                if (abstractC0695g2 == null && abstractC0695g22 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return abstractC0695g22;
        }
        return abstractC0695g2;
    }

    /* renamed from: h */
    public static ArrayList m1924h(AbstractC0695g2 abstractC0695g2, Object obj, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, ArrayList arrayList, View view) {
        if (obj != null) {
            ArrayList arrayList2 = new ArrayList();
            View view2 = abstractComponentCallbacksC0763z.f3216I;
            if (view2 != null) {
                abstractC0695g2.m2027f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            abstractC0695g2.mo1321b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    /* renamed from: i */
    public static Object m1923i(AbstractC0695g2 abstractC0695g2, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, boolean z) {
        Object obj = null;
        if (abstractComponentCallbacksC0763z == null) {
            return null;
        }
        if (z) {
            obj = abstractComponentCallbacksC0763z.m1845y();
        } else {
            abstractComponentCallbacksC0763z.m1863m();
        }
        return abstractC0695g2.mo1318g(obj);
    }

    /* renamed from: j */
    public static Object m1922j(AbstractC0695g2 abstractC0695g2, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, boolean z) {
        Object obj = null;
        if (abstractComponentCallbacksC0763z == null) {
            return null;
        }
        if (z) {
            obj = abstractComponentCallbacksC0763z.m1914A();
        } else {
            abstractComponentCallbacksC0763z.m1860p();
        }
        return abstractC0695g2.mo1318g(obj);
    }

    /* renamed from: k */
    public static View m1921k(C0378b c0378b, C0753v1 c0753v1, Object obj, boolean z) {
        ArrayList arrayList;
        C0668a c0668a = c0753v1.f3178c;
        if (obj == null || c0378b == null || (arrayList = c0668a.f2910n) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) c0378b.get((String) (z ? c0668a.f2910n : c0668a.f2911o).get(0));
    }

    /* renamed from: l */
    public static Object m1920l(AbstractC0695g2 abstractC0695g2, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2, boolean z) {
        Object obj;
        if (z) {
            obj = abstractComponentCallbacksC0763z2.m1910C();
        } else {
            abstractComponentCallbacksC0763z.m1912B();
            obj = null;
        }
        return abstractC0695g2.mo1307y(abstractC0695g2.mo1318g(obj));
    }

    /* renamed from: m */
    public static void m1919m(C0378b c0378b, C0378b c0378b2) {
        int i = c0378b.f1943h;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!c0378b2.containsKey((String) c0378b.m2613k(i))) {
                c0378b.m2615i(i);
            }
        }
    }

    /* renamed from: n */
    public static void m1918n(AbstractC0695g2 abstractC0695g2, Object obj, Object obj2, C0378b c0378b, boolean z, C0668a c0668a) {
        ArrayList arrayList = c0668a.f2910n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) c0378b.get((String) (z ? c0668a.f2911o : c0668a.f2910n).get(0));
        abstractC0695g2.mo1310t(obj, view);
        if (obj2 != null) {
            abstractC0695g2.mo1310t(obj2, view);
        }
    }

    /* renamed from: o */
    public static void m1917o(ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022e  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1916p(Context context, AbstractC0709k0 abstractC0709k0, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z, C0749u0 c0749u0) {
        SparseArray sparseArray;
        int i3;
        int i4;
        ViewGroup viewGroup;
        int i5;
        int i6;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj;
        C0749u0 c0749u02;
        Object obj2;
        C0378b c0378b;
        Object obj3;
        Object mo1316m;
        Object m1920l;
        ArrayList arrayList5;
        Object obj4;
        Object obj5;
        boolean z2;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3;
        Rect rect;
        ArrayList arrayList6;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4;
        C0378b c0378b2;
        Object obj6;
        Object mo1316m2;
        View view;
        Rect rect2;
        ArrayList arrayList7 = arrayList;
        ArrayList arrayList8 = arrayList2;
        int i7 = i2;
        boolean z3 = z;
        C0749u0 c0749u03 = c0749u0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i8 = i; i8 < i7; i8++) {
            C0668a c0668a = (C0668a) arrayList7.get(i8);
            if (((Boolean) arrayList8.get(i8)).booleanValue()) {
                if (c0668a.f2913q.f2984r.mo1932d()) {
                    for (int size = c0668a.f2897a.size() - 1; size >= 0; size--) {
                        m1930b(c0668a, (C0726o1) c0668a.f2897a.get(size), sparseArray2, true, z3);
                    }
                }
            } else {
                int size2 = c0668a.f2897a.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    m1930b(c0668a, (C0726o1) c0668a.f2897a.get(i9), sparseArray2, false, z3);
                }
            }
        }
        if (sparseArray2.size() != 0) {
            View view2 = new View(context);
            int size3 = sparseArray2.size();
            int i10 = 0;
            while (i10 < size3) {
                int keyAt = sparseArray2.keyAt(i10);
                C0378b c0378b3 = new C0378b();
                int i11 = i7 - 1;
                while (i11 >= i) {
                    C0668a c0668a2 = (C0668a) arrayList7.get(i11);
                    if (c0668a2.m2112l(keyAt)) {
                        boolean booleanValue = ((Boolean) arrayList8.get(i11)).booleanValue();
                        ArrayList arrayList9 = c0668a2.f2910n;
                        if (arrayList9 != null) {
                            int size4 = arrayList9.size();
                            ArrayList arrayList10 = c0668a2.f2910n;
                            ArrayList arrayList11 = c0668a2.f2911o;
                            if (!booleanValue) {
                                arrayList11 = arrayList10;
                                arrayList10 = arrayList11;
                            }
                            int i12 = 0;
                            while (i12 < size4) {
                                String str = (String) arrayList11.get(i12);
                                String str2 = (String) arrayList10.get(i12);
                                ArrayList arrayList12 = arrayList10;
                                String str3 = (String) c0378b3.remove(str2);
                                if (str3 != null) {
                                    c0378b3.put(str, str3);
                                } else {
                                    c0378b3.put(str, str2);
                                }
                                i12++;
                                arrayList10 = arrayList12;
                            }
                        }
                    }
                    i11--;
                    arrayList7 = arrayList;
                    arrayList8 = arrayList2;
                }
                C0753v1 c0753v1 = (C0753v1) sparseArray2.valueAt(i10);
                if (!abstractC0709k0.mo1932d() || (viewGroup = (ViewGroup) abstractC0709k0.mo1933c(keyAt)) == null) {
                    sparseArray = sparseArray2;
                    i3 = i10;
                    i4 = size3;
                } else {
                    if (z3) {
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = c0753v1.f3176a;
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z6 = c0753v1.f3179d;
                        AbstractC0695g2 m1925g = m1925g(abstractComponentCallbacksC0763z6, abstractComponentCallbacksC0763z5);
                        if (m1925g == null) {
                            sparseArray = sparseArray2;
                            i5 = i10;
                            i6 = size3;
                        } else {
                            boolean z4 = c0753v1.f3177b;
                            boolean z5 = c0753v1.f3180e;
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = new ArrayList();
                            Object m1923i = m1923i(m1925g, abstractComponentCallbacksC0763z5, z4);
                            Object m1922j = m1922j(m1925g, abstractComponentCallbacksC0763z6, z5);
                            sparseArray = sparseArray2;
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z7 = c0753v1.f3176a;
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z8 = c0753v1.f3179d;
                            i5 = i10;
                            if (abstractComponentCallbacksC0763z7 != null) {
                                i6 = size3;
                                abstractComponentCallbacksC0763z7.m1909C0().setVisibility(0);
                            } else {
                                i6 = size3;
                            }
                            if (abstractComponentCallbacksC0763z7 == null || abstractComponentCallbacksC0763z8 == null) {
                                arrayList6 = arrayList13;
                                abstractComponentCallbacksC0763z4 = abstractComponentCallbacksC0763z5;
                            } else {
                                boolean z6 = c0753v1.f3177b;
                                Object m1920l2 = c0378b3.isEmpty() ? null : m1920l(m1925g, abstractComponentCallbacksC0763z7, abstractComponentCallbacksC0763z8, z6);
                                C0378b m1926f = m1926f(m1925g, c0378b3, m1920l2, c0753v1);
                                abstractComponentCallbacksC0763z4 = abstractComponentCallbacksC0763z5;
                                C0378b m1927e = m1927e(m1925g, c0378b3, m1920l2, c0753v1);
                                if (c0378b3.isEmpty()) {
                                    if (m1926f != null) {
                                        m1926f.clear();
                                    }
                                    if (m1927e != null) {
                                        m1927e.clear();
                                    }
                                    obj6 = null;
                                } else {
                                    m1931a(arrayList14, m1926f, c0378b3.keySet());
                                    m1931a(arrayList13, m1927e, c0378b3.values());
                                    obj6 = m1920l2;
                                }
                                if (m1923i == null && m1922j == null && obj6 == null) {
                                    arrayList6 = arrayList13;
                                } else {
                                    c0378b2 = c0378b3;
                                    m1929c(abstractComponentCallbacksC0763z7, abstractComponentCallbacksC0763z8, z6, m1926f, true);
                                    if (obj6 != null) {
                                        arrayList13.add(view2);
                                        m1925g.mo1309w(obj6, view2, arrayList14);
                                        arrayList6 = arrayList13;
                                        m1918n(m1925g, obj6, m1922j, m1926f, c0753v1.f3180e, c0753v1.f3181f);
                                        Rect rect3 = new Rect();
                                        View m1921k = m1921k(m1927e, c0753v1, m1923i, z6);
                                        if (m1921k != null) {
                                            m1925g.mo1311s(m1923i, rect3);
                                        }
                                        view = m1921k;
                                        rect2 = rect3;
                                    } else {
                                        arrayList6 = arrayList13;
                                        view = null;
                                        rect2 = null;
                                    }
                                    ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(viewGroup, new RunnableC0746t1(abstractComponentCallbacksC0763z7, abstractComponentCallbacksC0763z8, z6, m1927e, view, m1925g, rect2));
                                    if (m1923i == null || obj6 != null || m1922j != null) {
                                        ArrayList m1924h = m1924h(m1925g, m1922j, abstractComponentCallbacksC0763z6, arrayList14, view2);
                                        ArrayList arrayList15 = arrayList6;
                                        ArrayList m1924h2 = m1924h(m1925g, m1923i, abstractComponentCallbacksC0763z4, arrayList15, view2);
                                        m1917o(m1924h2, 4);
                                        mo1316m2 = m1925g.mo1316m(m1922j, m1923i, obj6);
                                        if (abstractComponentCallbacksC0763z6 == null && m1924h != null && (m1924h.size() > 0 || arrayList14.size() > 0)) {
                                            C0529b c0529b = new C0529b();
                                            c0749u0.m1940b(abstractComponentCallbacksC0763z6, c0529b);
                                            m1925g.mo2021u(abstractComponentCallbacksC0763z6, mo1316m2, c0529b, new RunnableC0730p1(c0749u0, abstractComponentCallbacksC0763z6, c0529b));
                                        }
                                        if (mo1316m2 != null) {
                                            if (abstractComponentCallbacksC0763z6 != null && m1922j != null && abstractComponentCallbacksC0763z6.f3241n && abstractComponentCallbacksC0763z6.f3209B && abstractComponentCallbacksC0763z6.f3220M) {
                                                abstractComponentCallbacksC0763z6.m1895J0(true);
                                                m1925g.mo1313q(m1922j, abstractComponentCallbacksC0763z6.f3216I, m1924h);
                                                ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(abstractComponentCallbacksC0763z6.f3215H, new RunnableC0734q1(m1924h));
                                            }
                                            ArrayList m2022n = m1925g.m2022n(arrayList15);
                                            m1925g.mo1312r(mo1316m2, m1923i, m1924h2, m1922j, m1924h, obj6, arrayList15);
                                            m1925g.mo1320c(viewGroup, mo1316m2);
                                            m1925g.m2020v(viewGroup, arrayList14, arrayList15, m2022n, c0378b2);
                                            m1917o(m1924h2, 0);
                                            m1925g.mo1308x(obj6, arrayList14, arrayList15);
                                        }
                                    }
                                }
                            }
                            c0378b2 = c0378b3;
                            obj6 = null;
                            if (m1923i == null) {
                            }
                            ArrayList m1924h3 = m1924h(m1925g, m1922j, abstractComponentCallbacksC0763z6, arrayList14, view2);
                            ArrayList arrayList152 = arrayList6;
                            ArrayList m1924h22 = m1924h(m1925g, m1923i, abstractComponentCallbacksC0763z4, arrayList152, view2);
                            m1917o(m1924h22, 4);
                            mo1316m2 = m1925g.mo1316m(m1922j, m1923i, obj6);
                            if (abstractComponentCallbacksC0763z6 == null) {
                            }
                            if (mo1316m2 != null) {
                            }
                        }
                    } else {
                        sparseArray = sparseArray2;
                        i5 = i10;
                        i6 = size3;
                        C0749u0 c0749u04 = c0749u03;
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z9 = c0753v1.f3176a;
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z10 = c0753v1.f3179d;
                        AbstractC0695g2 m1925g2 = m1925g(abstractComponentCallbacksC0763z10, abstractComponentCallbacksC0763z9);
                        if (m1925g2 != null) {
                            boolean z7 = c0753v1.f3177b;
                            boolean z8 = c0753v1.f3180e;
                            Object m1923i2 = m1923i(m1925g2, abstractComponentCallbacksC0763z9, z7);
                            Object m1922j2 = m1922j(m1925g2, abstractComponentCallbacksC0763z10, z8);
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = new ArrayList();
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z11 = c0753v1.f3176a;
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z12 = c0753v1.f3179d;
                            if (abstractComponentCallbacksC0763z11 == null || abstractComponentCallbacksC0763z12 == null) {
                                abstractComponentCallbacksC0763z = abstractComponentCallbacksC0763z9;
                                arrayList3 = arrayList17;
                                arrayList4 = arrayList16;
                                obj = m1922j2;
                                c0749u02 = c0749u04;
                                obj2 = m1923i2;
                                i3 = i5;
                                i4 = i6;
                                c0378b = c0378b3;
                            } else {
                                boolean z9 = c0753v1.f3177b;
                                if (c0378b3.isEmpty()) {
                                    arrayList5 = arrayList17;
                                    c0378b = c0378b3;
                                    m1920l = null;
                                } else {
                                    m1920l = m1920l(m1925g2, abstractComponentCallbacksC0763z11, abstractComponentCallbacksC0763z12, z9);
                                    arrayList5 = arrayList17;
                                    c0378b = c0378b3;
                                }
                                C0378b m1926f2 = m1926f(m1925g2, c0378b, m1920l, c0753v1);
                                if (c0378b.isEmpty()) {
                                    obj4 = null;
                                } else {
                                    arrayList16.addAll(m1926f2.values());
                                    obj4 = m1920l;
                                }
                                if (m1923i2 == null && m1922j2 == null && obj4 == null) {
                                    abstractComponentCallbacksC0763z = abstractComponentCallbacksC0763z9;
                                    arrayList4 = arrayList16;
                                    obj = m1922j2;
                                    c0749u02 = c0749u04;
                                    obj2 = m1923i2;
                                    arrayList3 = arrayList5;
                                    i3 = i5;
                                    i4 = i6;
                                } else {
                                    abstractComponentCallbacksC0763z = abstractComponentCallbacksC0763z9;
                                    m1929c(abstractComponentCallbacksC0763z11, abstractComponentCallbacksC0763z12, z9, m1926f2, true);
                                    if (obj4 != null) {
                                        Rect rect4 = new Rect();
                                        m1925g2.mo1309w(obj4, view2, arrayList16);
                                        obj5 = obj4;
                                        z2 = z9;
                                        abstractComponentCallbacksC0763z2 = abstractComponentCallbacksC0763z12;
                                        abstractComponentCallbacksC0763z3 = abstractComponentCallbacksC0763z11;
                                        arrayList3 = arrayList5;
                                        arrayList4 = arrayList16;
                                        m1918n(m1925g2, obj5, m1922j2, m1926f2, c0753v1.f3180e, c0753v1.f3181f);
                                        if (m1923i2 != null) {
                                            m1925g2.mo1311s(m1923i2, rect4);
                                        }
                                        rect = rect4;
                                    } else {
                                        obj5 = obj4;
                                        z2 = z9;
                                        abstractComponentCallbacksC0763z2 = abstractComponentCallbacksC0763z12;
                                        abstractComponentCallbacksC0763z3 = abstractComponentCallbacksC0763z11;
                                        arrayList4 = arrayList16;
                                        arrayList3 = arrayList5;
                                        rect = null;
                                    }
                                    obj = m1922j2;
                                    c0749u02 = c0749u0;
                                    i3 = i5;
                                    obj2 = m1923i2;
                                    i4 = i6;
                                    ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(viewGroup, new RunnableC0750u1(m1925g2, c0378b, obj5, c0753v1, arrayList3, view2, abstractComponentCallbacksC0763z3, abstractComponentCallbacksC0763z2, z2, arrayList4, obj2, rect));
                                    obj3 = obj5;
                                    if (obj2 == null || obj3 != null || obj != null) {
                                        ArrayList arrayList18 = arrayList4;
                                        ArrayList m1924h4 = m1924h(m1925g2, obj, abstractComponentCallbacksC0763z10, arrayList18, view2);
                                        Object obj7 = (m1924h4 != null || m1924h4.isEmpty()) ? null : obj;
                                        m1925g2.mo1322a(obj2, view2);
                                        mo1316m = m1925g2.mo1316m(obj7, obj2, obj3);
                                        if (abstractComponentCallbacksC0763z10 != null && m1924h4 != null && (m1924h4.size() > 0 || arrayList18.size() > 0)) {
                                            C0529b c0529b2 = new C0529b();
                                            c0749u02.m1940b(abstractComponentCallbacksC0763z10, c0529b2);
                                            m1925g2.mo2021u(abstractComponentCallbacksC0763z10, mo1316m, c0529b2, new RunnableC0738r1(c0749u02, abstractComponentCallbacksC0763z10, c0529b2));
                                        }
                                        if (mo1316m == null) {
                                            ArrayList arrayList19 = new ArrayList();
                                            Object obj8 = obj2;
                                            ArrayList arrayList20 = arrayList3;
                                            m1925g2.mo1312r(mo1316m, obj8, arrayList19, obj7, m1924h4, obj3, arrayList20);
                                            ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(viewGroup, new RunnableC0742s1(obj8, m1925g2, view2, abstractComponentCallbacksC0763z, arrayList20, arrayList19, m1924h4, obj7));
                                            ArrayList arrayList21 = arrayList3;
                                            ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(viewGroup, new RunnableC0687e2(m1925g2, arrayList21, c0378b));
                                            m1925g2.mo1320c(viewGroup, mo1316m);
                                            ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(viewGroup, new RunnableC0691f2(m1925g2, arrayList21, c0378b));
                                        }
                                    }
                                }
                            }
                            obj3 = null;
                            if (obj2 == null) {
                            }
                            ArrayList arrayList182 = arrayList4;
                            ArrayList m1924h42 = m1924h(m1925g2, obj, abstractComponentCallbacksC0763z10, arrayList182, view2);
                            if (m1924h42 != null) {
                            }
                            m1925g2.mo1322a(obj2, view2);
                            mo1316m = m1925g2.mo1316m(obj7, obj2, obj3);
                            if (abstractComponentCallbacksC0763z10 != null) {
                                C0529b c0529b22 = new C0529b();
                                c0749u02.m1940b(abstractComponentCallbacksC0763z10, c0529b22);
                                m1925g2.mo2021u(abstractComponentCallbacksC0763z10, mo1316m, c0529b22, new RunnableC0738r1(c0749u02, abstractComponentCallbacksC0763z10, c0529b22));
                            }
                            if (mo1316m == null) {
                            }
                        }
                    }
                    i3 = i5;
                    i4 = i6;
                }
                i10 = i3 + 1;
                arrayList7 = arrayList;
                arrayList8 = arrayList2;
                i7 = i2;
                z3 = z;
                c0749u03 = c0749u0;
                size3 = i4;
                sparseArray2 = sparseArray;
            }
        }
    }
}