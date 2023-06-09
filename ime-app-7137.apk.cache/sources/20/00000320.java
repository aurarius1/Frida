package p010b.p067m.p068d;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.a */
/* loaded from: classes.dex */
public final class C0668a implements InterfaceC0678c1 {

    /* renamed from: a */
    public ArrayList f2897a;

    /* renamed from: b */
    public int f2898b;

    /* renamed from: c */
    public int f2899c;

    /* renamed from: d */
    public int f2900d;

    /* renamed from: e */
    public int f2901e;

    /* renamed from: f */
    public int f2902f;

    /* renamed from: g */
    public boolean f2903g;

    /* renamed from: h */
    public boolean f2904h;

    /* renamed from: i */
    public String f2905i;

    /* renamed from: j */
    public int f2906j;

    /* renamed from: k */
    public CharSequence f2907k;

    /* renamed from: l */
    public int f2908l;

    /* renamed from: m */
    public CharSequence f2909m;

    /* renamed from: n */
    public ArrayList f2910n;

    /* renamed from: o */
    public ArrayList f2911o;

    /* renamed from: p */
    public boolean f2912p;

    /* renamed from: q */
    public final C0690f1 f2913q;

    /* renamed from: r */
    public boolean f2914r;

    /* renamed from: s */
    public int f2915s;

    public C0668a(C0690f1 c0690f1) {
        c0690f1.m2081P();
        C0677c0 c0677c0 = c0690f1.f2983q;
        if (c0677c0 != null) {
            c0677c0.f2924c.getClassLoader();
        }
        this.f2897a = new ArrayList();
        this.f2904h = true;
        this.f2912p = false;
        this.f2915s = -1;
        this.f2913q = c0690f1;
    }

    @Override // p010b.p067m.p068d.InterfaceC0678c1
    /* renamed from: a */
    public boolean mo2098a(ArrayList arrayList, ArrayList arrayList2) {
        if (C0690f1.m2078S(2)) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2903g) {
            C0690f1 c0690f1 = this.f2913q;
            if (c0690f1.f2970d == null) {
                c0690f1.f2970d = new ArrayList();
            }
            c0690f1.f2970d.add(this);
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public void m2122b(C0726o1 c0726o1) {
        this.f2897a.add(c0726o1);
        c0726o1.f3081c = this.f2898b;
        c0726o1.f3082d = this.f2899c;
        c0726o1.f3083e = this.f2900d;
        c0726o1.f3084f = this.f2901e;
    }

    /* renamed from: c */
    public C0668a m2121c(String str) {
        if (this.f2904h) {
            this.f2903g = true;
            this.f2905i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: d */
    public void m2120d(int i) {
        if (this.f2903g) {
            if (C0690f1.m2078S(2)) {
                String str = "Bump nesting in " + this + " by " + i;
            }
            int size = this.f2897a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0726o1 c0726o1 = (C0726o1) this.f2897a.get(i2);
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0726o1.f3080b;
                if (abstractComponentCallbacksC0763z != null) {
                    abstractComponentCallbacksC0763z.f3247t += i;
                    if (C0690f1.m2078S(2)) {
                        StringBuilder m1187i = AbstractC1124a.m1187i("Bump nesting of ");
                        m1187i.append(c0726o1.f3080b);
                        m1187i.append(" to ");
                        m1187i.append(c0726o1.f3080b.f3247t);
                        m1187i.toString();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public int m2119e() {
        return m2118f(false);
    }

    /* renamed from: f */
    public int m2118f(boolean z) {
        if (this.f2914r) {
            throw new IllegalStateException("commit already called");
        }
        if (C0690f1.m2078S(2)) {
            String str = "Commit: " + this;
            PrintWriter printWriter = new PrintWriter(new C0715l2("FragmentManager"));
            m2115i("  ", printWriter, true);
            printWriter.close();
        }
        this.f2914r = true;
        this.f2915s = this.f2903g ? this.f2913q.f2975i.getAndIncrement() : -1;
        this.f2913q.m2094C(this, z);
        return this.f2915s;
    }

    /* renamed from: g */
    public void m2117g() {
        if (!this.f2903g) {
            this.f2904h = false;
            this.f2913q.m2091F(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: h */
    public void m2116h(int i, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, String str, int i2) {
        Class<?> cls = abstractComponentCallbacksC0763z.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = abstractComponentCallbacksC0763z.f3208A;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0763z + ": was " + abstractComponentCallbacksC0763z.f3208A + " now " + str);
                }
                abstractComponentCallbacksC0763z.f3208A = str;
            }
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0763z + " with tag " + str + " to container view with no id");
                }
                int i3 = abstractComponentCallbacksC0763z.f3252y;
                if (i3 != 0 && i3 != i) {
                    throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0763z + ": was " + abstractComponentCallbacksC0763z.f3252y + " now " + i);
                }
                abstractComponentCallbacksC0763z.f3252y = i;
                abstractComponentCallbacksC0763z.f3253z = i;
            }
            m2122b(new C0726o1(i2, abstractComponentCallbacksC0763z));
            abstractComponentCallbacksC0763z.f3248u = this.f2913q;
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Fragment ");
        m1187i.append(cls.getCanonicalName());
        m1187i.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(m1187i.toString());
    }

    /* renamed from: i */
    public void m2115i(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2905i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2915s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2914r);
            if (this.f2902f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2902f));
            }
            if (this.f2898b != 0 || this.f2899c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2898b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2899c));
            }
            if (this.f2900d != 0 || this.f2901e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2900d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2901e));
            }
            if (this.f2906j != 0 || this.f2907k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2906j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2907k);
            }
            if (this.f2908l != 0 || this.f2909m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2908l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2909m);
            }
        }
        if (this.f2897a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2897a.size();
        for (int i = 0; i < size; i++) {
            C0726o1 c0726o1 = (C0726o1) this.f2897a.get(i);
            switch (c0726o1.f3079a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder m1187i = AbstractC1124a.m1187i("cmd=");
                    m1187i.append(c0726o1.f3079a);
                    str2 = m1187i.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0726o1.f3080b);
            if (z) {
                if (c0726o1.f3081c != 0 || c0726o1.f3082d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0726o1.f3081c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0726o1.f3082d));
                }
                if (c0726o1.f3083e != 0 || c0726o1.f3084f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0726o1.f3083e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0726o1.f3084f));
                }
            }
        }
    }

    /* renamed from: j */
    public void m2114j() {
        C0690f1 c0690f1;
        int size = this.f2897a.size();
        for (int i = 0; i < size; i++) {
            C0726o1 c0726o1 = (C0726o1) this.f2897a.get(i);
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0726o1.f3080b;
            if (abstractComponentCallbacksC0763z != null) {
                abstractComponentCallbacksC0763z.m1891L0(false);
                int i2 = this.f2902f;
                if (abstractComponentCallbacksC0763z.f3219L != null || i2 != 0) {
                    abstractComponentCallbacksC0763z.m1874f();
                    abstractComponentCallbacksC0763z.f3219L.f3193h = i2;
                }
                ArrayList arrayList = this.f2910n;
                ArrayList arrayList2 = this.f2911o;
                abstractComponentCallbacksC0763z.m1874f();
                C0757x c0757x = abstractComponentCallbacksC0763z.f3219L;
                c0757x.f3194i = arrayList;
                c0757x.f3195j = arrayList2;
            }
            switch (c0726o1.f3079a) {
                case 1:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2051j0(abstractComponentCallbacksC0763z, false);
                    this.f2913q.m2070a(abstractComponentCallbacksC0763z);
                    continue;
                case 2:
                default:
                    StringBuilder m1187i = AbstractC1124a.m1187i("Unknown cmd: ");
                    m1187i.append(c0726o1.f3079a);
                    throw new IllegalArgumentException(m1187i.toString());
                case 3:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2061e0(abstractComponentCallbacksC0763z);
                    continue;
                case 4:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2079R(abstractComponentCallbacksC0763z);
                    continue;
                case 5:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2051j0(abstractComponentCallbacksC0763z, false);
                    this.f2913q.m2043n0(abstractComponentCallbacksC0763z);
                    continue;
                case 6:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2048l(abstractComponentCallbacksC0763z);
                    continue;
                case 7:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2051j0(abstractComponentCallbacksC0763z, false);
                    this.f2913q.m2066c(abstractComponentCallbacksC0763z);
                    continue;
                case 8:
                    c0690f1 = this.f2913q;
                    break;
                case 9:
                    c0690f1 = this.f2913q;
                    abstractComponentCallbacksC0763z = null;
                    break;
                case 10:
                    this.f2913q.m2049k0(abstractComponentCallbacksC0763z, c0726o1.f3086h);
                    continue;
            }
            c0690f1.m2047l0(abstractComponentCallbacksC0763z);
        }
    }

    /* renamed from: k */
    public void m2113k(boolean z) {
        C0690f1 c0690f1;
        for (int size = this.f2897a.size() - 1; size >= 0; size--) {
            C0726o1 c0726o1 = (C0726o1) this.f2897a.get(size);
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0726o1.f3080b;
            if (abstractComponentCallbacksC0763z != null) {
                abstractComponentCallbacksC0763z.m1891L0(true);
                int i = this.f2902f;
                int i2 = i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
                if (abstractComponentCallbacksC0763z.f3219L != null || i2 != 0) {
                    abstractComponentCallbacksC0763z.m1874f();
                    abstractComponentCallbacksC0763z.f3219L.f3193h = i2;
                }
                ArrayList arrayList = this.f2911o;
                ArrayList arrayList2 = this.f2910n;
                abstractComponentCallbacksC0763z.m1874f();
                C0757x c0757x = abstractComponentCallbacksC0763z.f3219L;
                c0757x.f3194i = arrayList;
                c0757x.f3195j = arrayList2;
            }
            switch (c0726o1.f3079a) {
                case 1:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2051j0(abstractComponentCallbacksC0763z, true);
                    this.f2913q.m2061e0(abstractComponentCallbacksC0763z);
                    continue;
                case 2:
                default:
                    StringBuilder m1187i = AbstractC1124a.m1187i("Unknown cmd: ");
                    m1187i.append(c0726o1.f3079a);
                    throw new IllegalArgumentException(m1187i.toString());
                case 3:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2070a(abstractComponentCallbacksC0763z);
                    continue;
                case 4:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2043n0(abstractComponentCallbacksC0763z);
                    continue;
                case 5:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2051j0(abstractComponentCallbacksC0763z, true);
                    this.f2913q.m2079R(abstractComponentCallbacksC0763z);
                    continue;
                case 6:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2066c(abstractComponentCallbacksC0763z);
                    continue;
                case 7:
                    abstractComponentCallbacksC0763z.m1905E0(c0726o1.f3081c, c0726o1.f3082d, c0726o1.f3083e, c0726o1.f3084f);
                    this.f2913q.m2051j0(abstractComponentCallbacksC0763z, true);
                    this.f2913q.m2048l(abstractComponentCallbacksC0763z);
                    continue;
                case 8:
                    c0690f1 = this.f2913q;
                    abstractComponentCallbacksC0763z = null;
                    break;
                case 9:
                    c0690f1 = this.f2913q;
                    break;
                case 10:
                    this.f2913q.m2049k0(abstractComponentCallbacksC0763z, c0726o1.f3085g);
                    continue;
            }
            c0690f1.m2047l0(abstractComponentCallbacksC0763z);
        }
    }

    /* renamed from: l */
    public boolean m2112l(int i) {
        int size = this.f2897a.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = ((C0726o1) this.f2897a.get(i2)).f3080b;
            int i3 = abstractComponentCallbacksC0763z != null ? abstractComponentCallbacksC0763z.f3253z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m2111m(ArrayList arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2897a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = ((C0726o1) this.f2897a.get(i4)).f3080b;
            int i5 = abstractComponentCallbacksC0763z != null ? abstractComponentCallbacksC0763z.f3253z : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0668a c0668a = (C0668a) arrayList.get(i6);
                    int size2 = c0668a.f2897a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = ((C0726o1) c0668a.f2897a.get(i7)).f3080b;
                        if ((abstractComponentCallbacksC0763z2 != null ? abstractComponentCallbacksC0763z2.f3253z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: n */
    public C0668a m2110n(int i, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (i != 0) {
            m2116h(i, abstractComponentCallbacksC0763z, null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2915s >= 0) {
            sb.append(" #");
            sb.append(this.f2915s);
        }
        if (this.f2905i != null) {
            sb.append(" ");
            sb.append(this.f2905i);
        }
        sb.append("}");
        return sb.toString();
    }
}