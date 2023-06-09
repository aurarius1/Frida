package p010b.p067m.p068d;

import android.animation.Animator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p011a.C0055e;
import p010b.p011a.C0059i;
import p010b.p011a.InterfaceC0051a;
import p010b.p011a.InterfaceC0060j;
import p010b.p011a.p013l.C0065c;
import p010b.p011a.p013l.InterfaceC0068f;
import p010b.p011a.p013l.p014h.C0072c;
import p010b.p011a.p013l.p014h.C0073d;
import p010b.p046j.p054h.C0529b;
import p010b.p067m.AbstractC0666b;
import p010b.p072o.AbstractC0779h;
import p010b.p072o.AbstractC0794w;
import p010b.p072o.C0784m;
import p010b.p072o.C0796y;
import p010b.p072o.EnumC0778g;
import p010b.p072o.InterfaceC0797z;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.f1 */
/* loaded from: classes.dex */
public class C0690f1 {

    /* renamed from: A */
    public boolean f2956A;

    /* renamed from: B */
    public boolean f2957B;

    /* renamed from: C */
    public boolean f2958C;

    /* renamed from: D */
    public boolean f2959D;

    /* renamed from: E */
    public boolean f2960E;

    /* renamed from: F */
    public ArrayList f2961F;

    /* renamed from: G */
    public ArrayList f2962G;

    /* renamed from: H */
    public ArrayList f2963H;

    /* renamed from: I */
    public ArrayList f2964I;

    /* renamed from: J */
    public C0702i1 f2965J;

    /* renamed from: b */
    public boolean f2968b;

    /* renamed from: d */
    public ArrayList f2970d;

    /* renamed from: e */
    public ArrayList f2971e;

    /* renamed from: g */
    public C0059i f2973g;

    /* renamed from: q */
    public C0677c0 f2983q;

    /* renamed from: r */
    public AbstractC0709k0 f2984r;

    /* renamed from: s */
    public AbstractComponentCallbacksC0763z f2985s;

    /* renamed from: t */
    public AbstractComponentCallbacksC0763z f2986t;

    /* renamed from: w */
    public C0065c f2989w;

    /* renamed from: x */
    public C0065c f2990x;

    /* renamed from: y */
    public C0065c f2991y;

    /* renamed from: a */
    public final ArrayList f2967a = new ArrayList();

    /* renamed from: c */
    public final C0722n1 f2969c = new C0722n1();

    /* renamed from: f */
    public final LayoutInflater$Factory2C0725o0 f2972f = new LayoutInflater$Factory2C0725o0(this);

    /* renamed from: h */
    public final C0745t0 f2974h = new C0745t0(this, false);

    /* renamed from: i */
    public final AtomicInteger f2975i = new AtomicInteger();

    /* renamed from: j */
    public final Map f2976j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map f2977k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public Map f2978l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public final C0749u0 f2979m = new C0749u0(this);

    /* renamed from: n */
    public final C0733q0 f2980n = new C0733q0(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList f2981o = new CopyOnWriteArrayList();

    /* renamed from: p */
    public int f2982p = -1;

    /* renamed from: u */
    public C0752v0 f2987u = new C0752v0(this);

    /* renamed from: v */
    public C0755w0 f2988v = new C0755w0(this);

    /* renamed from: z */
    public ArrayDeque f2992z = new ArrayDeque();

    /* renamed from: K */
    public Runnable f2966K = new RunnableC0758x0(this);

    /* renamed from: S */
    public static boolean m2078S(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: A */
    public void m2096A(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String m1190f = AbstractC1124a.m1190f(str, "    ");
        C0722n1 c0722n1 = this.f2969c;
        c0722n1.getClass();
        String str2 = str + "    ";
        if (!c0722n1.f3071b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0718m1 c0718m1 : c0722n1.f3071b.values()) {
                printWriter.print(str);
                if (c0718m1 != null) {
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
                    printWriter.println(abstractComponentCallbacksC0763z);
                    abstractComponentCallbacksC0763z.m1877d(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = c0722n1.f3070a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((AbstractComponentCallbacksC0763z) c0722n1.f3070a.get(i)).toString());
            }
        }
        ArrayList arrayList = this.f2971e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((AbstractComponentCallbacksC0763z) this.f2971e.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.f2970d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0668a c0668a = (C0668a) this.f2970d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0668a.toString());
                c0668a.m2115i(m1190f, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2975i.get());
        synchronized (this.f2967a) {
            int size4 = this.f2967a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((InterfaceC0678c1) this.f2967a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2983q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2984r);
        if (this.f2985s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2985s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2982p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2957B);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2958C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2959D);
        if (this.f2956A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2956A);
        }
    }

    /* renamed from: B */
    public final void m2095B() {
        Iterator it = ((HashSet) m2058g()).iterator();
        while (it.hasNext()) {
            ((AbstractC0743s2) it.next()).m1946e();
        }
    }

    /* renamed from: C */
    public void m2094C(InterfaceC0678c1 interfaceC0678c1, boolean z) {
        if (!z) {
            if (this.f2983q == null) {
                if (!this.f2959D) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m2062e();
        }
        synchronized (this.f2967a) {
            if (this.f2983q != null) {
                this.f2967a.add(interfaceC0678c1);
                m2053i0();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: D */
    public final void m2093D(boolean z) {
        if (this.f2968b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2983q == null) {
            if (!this.f2959D) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else if (Looper.myLooper() != this.f2983q.f2925d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                m2062e();
            }
            if (this.f2961F == null) {
                this.f2961F = new ArrayList();
                this.f2962G = new ArrayList();
            }
            this.f2968b = true;
            try {
                m2089H(null, null);
            } finally {
                this.f2968b = false;
            }
        }
    }

    /* renamed from: E */
    public boolean m2092E(boolean z) {
        m2093D(z);
        boolean z2 = false;
        while (m2084M(this.f2961F, this.f2962G)) {
            this.f2968b = true;
            try {
                m2059f0(this.f2961F, this.f2962G);
                m2060f();
                z2 = true;
            } catch (Throwable th) {
                m2060f();
                throw th;
            }
        }
        m2039p0();
        m2029z();
        this.f2969c.m1987b();
        return z2;
    }

    /* renamed from: F */
    public void m2091F(InterfaceC0678c1 interfaceC0678c1, boolean z) {
        if (z && (this.f2983q == null || this.f2959D)) {
            return;
        }
        m2093D(z);
        ((C0668a) interfaceC0678c1).mo2098a(this.f2961F, this.f2962G);
        this.f2968b = true;
        try {
            m2059f0(this.f2961F, this.f2962G);
            m2060f();
            m2039p0();
            m2029z();
            this.f2969c.m1987b();
        } catch (Throwable th) {
            m2060f();
            throw th;
        }
    }

    /* renamed from: G */
    public final void m2090G(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList3 = arrayList2;
        boolean z = ((C0668a) arrayList.get(i)).f2912p;
        ArrayList arrayList4 = this.f2963H;
        if (arrayList4 == null) {
            this.f2963H = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f2963H.addAll(this.f2969c.m1980i());
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f2986t;
        int i5 = i;
        boolean z2 = false;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                C0668a c0668a = (C0668a) arrayList.get(i5);
                int i7 = 3;
                if (!((Boolean) arrayList3.get(i5)).booleanValue()) {
                    ArrayList arrayList5 = this.f2963H;
                    int i8 = 0;
                    while (i8 < c0668a.f2897a.size()) {
                        C0726o1 c0726o1 = (C0726o1) c0668a.f2897a.get(i8);
                        int i9 = c0726o1.f3079a;
                        if (i9 != i6) {
                            if (i9 != 2) {
                                if (i9 == i7 || i9 == 6) {
                                    arrayList5.remove(c0726o1.f3080b);
                                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = c0726o1.f3080b;
                                    if (abstractComponentCallbacksC0763z2 == abstractComponentCallbacksC0763z) {
                                        c0668a.f2897a.add(i8, new C0726o1(9, abstractComponentCallbacksC0763z2));
                                        i8++;
                                        i3 = 1;
                                        abstractComponentCallbacksC0763z = null;
                                        i8 += i3;
                                        i6 = 1;
                                        i7 = 3;
                                    }
                                } else if (i9 != 7) {
                                    if (i9 == 8) {
                                        c0668a.f2897a.add(i8, new C0726o1(9, abstractComponentCallbacksC0763z));
                                        i8++;
                                        abstractComponentCallbacksC0763z = c0726o1.f3080b;
                                    }
                                }
                                i3 = 1;
                                i8 += i3;
                                i6 = 1;
                                i7 = 3;
                            } else {
                                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = c0726o1.f3080b;
                                int i10 = abstractComponentCallbacksC0763z3.f3253z;
                                int size = arrayList5.size() - 1;
                                boolean z3 = false;
                                while (size >= 0) {
                                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = (AbstractComponentCallbacksC0763z) arrayList5.get(size);
                                    if (abstractComponentCallbacksC0763z4.f3253z != i10) {
                                        i4 = i10;
                                    } else if (abstractComponentCallbacksC0763z4 == abstractComponentCallbacksC0763z3) {
                                        i4 = i10;
                                        z3 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0763z4 == abstractComponentCallbacksC0763z) {
                                            i4 = i10;
                                            c0668a.f2897a.add(i8, new C0726o1(9, abstractComponentCallbacksC0763z4));
                                            i8++;
                                            abstractComponentCallbacksC0763z = null;
                                        } else {
                                            i4 = i10;
                                        }
                                        C0726o1 c0726o12 = new C0726o1(3, abstractComponentCallbacksC0763z4);
                                        c0726o12.f3081c = c0726o1.f3081c;
                                        c0726o12.f3083e = c0726o1.f3083e;
                                        c0726o12.f3082d = c0726o1.f3082d;
                                        c0726o12.f3084f = c0726o1.f3084f;
                                        c0668a.f2897a.add(i8, c0726o12);
                                        arrayList5.remove(abstractComponentCallbacksC0763z4);
                                        i8++;
                                    }
                                    size--;
                                    i10 = i4;
                                }
                                if (z3) {
                                    c0668a.f2897a.remove(i8);
                                    i8--;
                                    i3 = 1;
                                    i8 += i3;
                                    i6 = 1;
                                    i7 = 3;
                                } else {
                                    i3 = 1;
                                    c0726o1.f3079a = 1;
                                    arrayList5.add(abstractComponentCallbacksC0763z3);
                                    i8 += i3;
                                    i6 = 1;
                                    i7 = 3;
                                }
                            }
                        }
                        i3 = 1;
                        arrayList5.add(c0726o1.f3080b);
                        i8 += i3;
                        i6 = 1;
                        i7 = 3;
                    }
                } else {
                    int i11 = 1;
                    ArrayList arrayList6 = this.f2963H;
                    int size2 = c0668a.f2897a.size() - 1;
                    while (size2 >= 0) {
                        C0726o1 c0726o13 = (C0726o1) c0668a.f2897a.get(size2);
                        int i12 = c0726o13.f3079a;
                        if (i12 != i11) {
                            if (i12 != 3) {
                                switch (i12) {
                                    case 8:
                                        abstractComponentCallbacksC0763z = null;
                                        break;
                                    case 9:
                                        abstractComponentCallbacksC0763z = c0726o13.f3080b;
                                        break;
                                    case 10:
                                        c0726o13.f3086h = c0726o13.f3085g;
                                        break;
                                }
                                size2--;
                                i11 = 1;
                            }
                            arrayList6.add(c0726o13.f3080b);
                            size2--;
                            i11 = 1;
                        }
                        arrayList6.remove(c0726o13.f3080b);
                        size2--;
                        i11 = 1;
                    }
                }
                z2 = z2 || c0668a.f2903g;
                i5++;
                arrayList3 = arrayList2;
            } else {
                this.f2963H.clear();
                if (!z && this.f2982p >= 1) {
                    for (int i13 = i; i13 < i2; i13++) {
                        Iterator it = ((C0668a) arrayList.get(i13)).f2897a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = ((C0726o1) it.next()).f3080b;
                            if (abstractComponentCallbacksC0763z5 != null && abstractComponentCallbacksC0763z5.f3248u != null) {
                                this.f2969c.m1979j(m2052j(abstractComponentCallbacksC0763z5));
                            }
                        }
                    }
                }
                int i14 = i;
                while (i14 < i2) {
                    C0668a c0668a2 = (C0668a) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        c0668a2.m2120d(-1);
                        c0668a2.m2113k(i14 == i2 + (-1));
                    } else {
                        c0668a2.m2120d(1);
                        c0668a2.m2114j();
                    }
                    i14++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i15 = i; i15 < i2; i15++) {
                    C0668a c0668a3 = (C0668a) arrayList.get(i15);
                    if (booleanValue) {
                        for (int size3 = c0668a3.f2897a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z6 = ((C0726o1) c0668a3.f2897a.get(size3)).f3080b;
                            if (abstractComponentCallbacksC0763z6 != null) {
                                m2052j(abstractComponentCallbacksC0763z6).m1997k();
                            }
                        }
                    } else {
                        Iterator it2 = c0668a3.f2897a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z7 = ((C0726o1) it2.next()).f3080b;
                            if (abstractComponentCallbacksC0763z7 != null) {
                                m2052j(abstractComponentCallbacksC0763z7).m1997k();
                            }
                        }
                    }
                }
                m2073X(this.f2982p, true);
                int i16 = i;
                Iterator it3 = ((HashSet) m2056h(arrayList, i16, i2)).iterator();
                while (it3.hasNext()) {
                    AbstractC0743s2 abstractC0743s2 = (AbstractC0743s2) it3.next();
                    abstractC0743s2.f3130d = booleanValue;
                    abstractC0743s2.m1943h();
                    abstractC0743s2.m1948c();
                }
                while (i16 < i2) {
                    C0668a c0668a4 = (C0668a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue() && c0668a4.f2915s >= 0) {
                        c0668a4.f2915s = -1;
                    }
                    c0668a4.getClass();
                    i16++;
                }
                return;
            }
        }
    }

    /* renamed from: H */
    public final void m2089H(ArrayList arrayList, ArrayList arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList arrayList3 = this.f2964I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            AbstractC0686e1 abstractC0686e1 = (AbstractC0686e1) this.f2964I.get(i);
            if (arrayList == null || abstractC0686e1.f2949a || (indexOf2 = arrayList.indexOf(abstractC0686e1.f2950b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                if ((abstractC0686e1.f2951c == 0) || (arrayList != null && abstractC0686e1.f2950b.m2111m(arrayList, 0, arrayList.size()))) {
                    this.f2964I.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || abstractC0686e1.f2949a || (indexOf = arrayList.indexOf(abstractC0686e1.f2950b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        abstractC0686e1.m2097a();
                    }
                }
                i++;
            } else {
                this.f2964I.remove(i);
                i--;
                size--;
            }
            C0668a c0668a = abstractC0686e1.f2950b;
            c0668a.f2913q.m2054i(c0668a, abstractC0686e1.f2949a, false, false);
            i++;
        }
    }

    /* renamed from: I */
    public AbstractComponentCallbacksC0763z m2088I(String str) {
        return this.f2969c.m1985d(str);
    }

    /* renamed from: J */
    public AbstractComponentCallbacksC0763z m2087J(int i) {
        C0722n1 c0722n1 = this.f2969c;
        int size = c0722n1.f3070a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (C0718m1 c0718m1 : c0722n1.f3071b.values()) {
                    if (c0718m1 != null) {
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
                        if (abstractComponentCallbacksC0763z.f3252y == i) {
                            return abstractComponentCallbacksC0763z;
                        }
                    }
                }
                return null;
            }
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = (AbstractComponentCallbacksC0763z) c0722n1.f3070a.get(size);
            if (abstractComponentCallbacksC0763z2 != null && abstractComponentCallbacksC0763z2.f3252y == i) {
                return abstractComponentCallbacksC0763z2;
            }
        }
    }

    /* renamed from: K */
    public AbstractComponentCallbacksC0763z m2086K(String str) {
        C0722n1 c0722n1 = this.f2969c;
        c0722n1.getClass();
        if (str != null) {
            int size = c0722n1.f3070a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractComponentCallbacksC0763z) c0722n1.f3070a.get(size);
                if (abstractComponentCallbacksC0763z != null && str.equals(abstractComponentCallbacksC0763z.f3208A)) {
                    return abstractComponentCallbacksC0763z;
                }
            }
        }
        if (str != null) {
            for (C0718m1 c0718m1 : c0722n1.f3071b.values()) {
                if (c0718m1 != null) {
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = c0718m1.f3061c;
                    if (str.equals(abstractComponentCallbacksC0763z2.f3208A)) {
                        return abstractComponentCallbacksC0763z2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: L */
    public final void m2085L() {
        Iterator it = ((HashSet) m2058g()).iterator();
        while (it.hasNext()) {
            AbstractC0743s2 abstractC0743s2 = (AbstractC0743s2) it.next();
            if (abstractC0743s2.f3131e) {
                abstractC0743s2.f3131e = false;
                abstractC0743s2.m1948c();
            }
        }
    }

    /* renamed from: M */
    public final boolean m2084M(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f2967a) {
            if (this.f2967a.isEmpty()) {
                return false;
            }
            int size = this.f2967a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= ((InterfaceC0678c1) this.f2967a.get(i)).mo2098a(arrayList, arrayList2);
            }
            this.f2967a.clear();
            this.f2983q.f2925d.removeCallbacks(this.f2966K);
            return z;
        }
    }

    /* renamed from: N */
    public final C0702i1 m2083N(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        C0702i1 c0702i1 = this.f2965J;
        C0702i1 c0702i12 = (C0702i1) c0702i1.f3021d.get(abstractComponentCallbacksC0763z.f3235h);
        if (c0702i12 == null) {
            C0702i1 c0702i13 = new C0702i1(c0702i1.f3023f);
            c0702i1.f3021d.put(abstractComponentCallbacksC0763z.f3235h, c0702i13);
            return c0702i13;
        }
        return c0702i12;
    }

    /* renamed from: O */
    public final ViewGroup m2082O(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        ViewGroup viewGroup = abstractComponentCallbacksC0763z.f3215H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0763z.f3253z > 0 && this.f2984r.mo1932d()) {
            View mo1933c = this.f2984r.mo1933c(abstractComponentCallbacksC0763z.f3253z);
            if (mo1933c instanceof ViewGroup) {
                return (ViewGroup) mo1933c;
            }
        }
        return null;
    }

    /* renamed from: P */
    public C0752v0 m2081P() {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f2985s;
        return abstractComponentCallbacksC0763z != null ? abstractComponentCallbacksC0763z.f3248u.m2081P() : this.f2987u;
    }

    /* renamed from: Q */
    public C0755w0 m2080Q() {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f2985s;
        return abstractComponentCallbacksC0763z != null ? abstractComponentCallbacksC0763z.f3248u.m2080Q() : this.f2988v;
    }

    /* renamed from: R */
    public void m2079R(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (m2078S(2)) {
            AbstractC1124a.m1186j("hide: ", abstractComponentCallbacksC0763z);
        }
        if (abstractComponentCallbacksC0763z.f3209B) {
            return;
        }
        abstractComponentCallbacksC0763z.f3209B = true;
        abstractComponentCallbacksC0763z.f3220M = true ^ abstractComponentCallbacksC0763z.f3220M;
        m2045m0(abstractComponentCallbacksC0763z);
    }

    /* renamed from: T */
    public final boolean m2077T(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        boolean z;
        if (abstractComponentCallbacksC0763z.f3212E && abstractComponentCallbacksC0763z.f3213F) {
            return true;
        }
        C0690f1 c0690f1 = abstractComponentCallbacksC0763z.f3250w;
        Iterator it = ((ArrayList) c0690f1.f2969c.m1982g()).iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = (AbstractComponentCallbacksC0763z) it.next();
            if (abstractComponentCallbacksC0763z2 != null) {
                z2 = c0690f1.m2077T(abstractComponentCallbacksC0763z2);
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    /* renamed from: U */
    public boolean m2076U(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (abstractComponentCallbacksC0763z == null) {
            return true;
        }
        return abstractComponentCallbacksC0763z.m1896J();
    }

    /* renamed from: V */
    public boolean m2075V(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (abstractComponentCallbacksC0763z == null) {
            return true;
        }
        C0690f1 c0690f1 = abstractComponentCallbacksC0763z.f3248u;
        return abstractComponentCallbacksC0763z.equals(c0690f1.f2986t) && m2075V(c0690f1.f2985s);
    }

    /* renamed from: W */
    public boolean m2074W() {
        return this.f2957B || this.f2958C;
    }

    /* renamed from: X */
    public void m2073X(int i, boolean z) {
        C0677c0 c0677c0;
        if (this.f2983q == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f2982p) {
            this.f2982p = i;
            C0722n1 c0722n1 = this.f2969c;
            Iterator it = c0722n1.f3070a.iterator();
            while (it.hasNext()) {
                C0718m1 c0718m1 = (C0718m1) c0722n1.f3071b.get(((AbstractComponentCallbacksC0763z) it.next()).f3235h);
                if (c0718m1 != null) {
                    c0718m1.m1997k();
                }
            }
            Iterator it2 = c0722n1.f3071b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                C0718m1 c0718m12 = (C0718m1) it2.next();
                if (c0718m12 != null) {
                    c0718m12.m1997k();
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m12.f3061c;
                    if (abstractComponentCallbacksC0763z.f3242o && !abstractComponentCallbacksC0763z.m1898I()) {
                        z2 = true;
                    }
                    if (z2) {
                        c0722n1.m1978k(c0718m12);
                    }
                }
            }
            m2041o0();
            if (this.f2956A && (c0677c0 = this.f2983q) != null && this.f2982p == 7) {
                c0677c0.f2927f.mo2099o();
                this.f2956A = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2072Y(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, int i) {
        ViewGroup viewGroup;
        C0718m1 m1981h = this.f2969c.m1981h(abstractComponentCallbacksC0763z.f3235h);
        int i2 = 1;
        if (m1981h == null) {
            m1981h = new C0718m1(this.f2980n, this.f2969c, abstractComponentCallbacksC0763z);
            m1981h.f3063e = 1;
        }
        if (abstractComponentCallbacksC0763z.f3243p && abstractComponentCallbacksC0763z.f3244q && abstractComponentCallbacksC0763z.f3230c == 2) {
            i = Math.max(i, 2);
        }
        int min = Math.min(i, m1981h.m2004d());
        int i3 = abstractComponentCallbacksC0763z.f3230c;
        if (i3 <= min) {
            if (i3 < min && !this.f2978l.isEmpty()) {
                m2064d(abstractComponentCallbacksC0763z);
            }
            int i4 = abstractComponentCallbacksC0763z.f3230c;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                            }
                            if (min > 4) {
                                m1981h.m1992p();
                            }
                            if (min > 5) {
                                m1981h.m1994n();
                            }
                        }
                        if (min > 2) {
                            m1981h.m2007a();
                        }
                        if (min > 4) {
                        }
                        if (min > 5) {
                        }
                    }
                    if (min > -1) {
                        m1981h.m1998j();
                    }
                    if (min > 1) {
                        m1981h.m2002f();
                    }
                    if (min > 2) {
                    }
                    if (min > 4) {
                    }
                    if (min > 5) {
                    }
                }
            } else if (min > -1) {
                m1981h.m2005c();
            }
            if (min > 0) {
                m1981h.m2003e();
            }
            if (min > -1) {
            }
            if (min > 1) {
            }
            if (min > 2) {
            }
            if (min > 4) {
            }
            if (min > 5) {
            }
        } else if (i3 > min) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 == 7) {
                                    if (min < 7) {
                                        m1981h.m1996l();
                                    }
                                }
                            }
                            if (min < 5) {
                                m1981h.m1991q();
                            }
                        }
                        if (min < 4) {
                            if (m2078S(3)) {
                                AbstractC1124a.m1186j("movefrom ACTIVITY_CREATED: ", abstractComponentCallbacksC0763z);
                            }
                            if (abstractComponentCallbacksC0763z.f3216I != null && (!this.f2983q.f2927f.isFinishing()) && abstractComponentCallbacksC0763z.f3232e == null) {
                                m1981h.m1993o();
                            }
                        }
                    }
                    if (min < 2) {
                        C0701i0 c0701i0 = null;
                        View view = abstractComponentCallbacksC0763z.f3216I;
                        if (view != null && (viewGroup = abstractComponentCallbacksC0763z.f3215H) != null) {
                            viewGroup.endViewTransition(view);
                            abstractComponentCallbacksC0763z.f3216I.clearAnimation();
                            if (!abstractComponentCallbacksC0763z.m1892L()) {
                                if (this.f2982p > -1 && !this.f2959D && abstractComponentCallbacksC0763z.f3216I.getVisibility() == 0 && abstractComponentCallbacksC0763z.f3221N >= 0.0f) {
                                    c0701i0 = AbstractC0022t.m3518P(this.f2983q.f2924c, abstractComponentCallbacksC0763z, false, abstractComponentCallbacksC0763z.m1851v());
                                }
                                abstractComponentCallbacksC0763z.f3221N = 0.0f;
                                ViewGroup viewGroup2 = abstractComponentCallbacksC0763z.f3215H;
                                View view2 = abstractComponentCallbacksC0763z.f3216I;
                                if (c0701i0 != null) {
                                    C0749u0 c0749u0 = this.f2979m;
                                    viewGroup2.startViewTransition(view2);
                                    C0529b c0529b = new C0529b();
                                    c0529b.m2349b(new C0685e0(abstractComponentCallbacksC0763z));
                                    c0749u0.m1940b(abstractComponentCallbacksC0763z, c0529b);
                                    if (c0701i0.f3017a != null) {
                                        RunnableC0705j0 runnableC0705j0 = new RunnableC0705j0(c0701i0.f3017a, viewGroup2, view2);
                                        abstractComponentCallbacksC0763z.m1907D0(abstractComponentCallbacksC0763z.f3216I);
                                        runnableC0705j0.setAnimationListener(new animationAnimation$AnimationListenerC0693g0(viewGroup2, abstractComponentCallbacksC0763z, c0749u0, c0529b));
                                        abstractComponentCallbacksC0763z.f3216I.startAnimation(runnableC0705j0);
                                    } else {
                                        Animator animator = c0701i0.f3018b;
                                        abstractComponentCallbacksC0763z.m1903F0(animator);
                                        animator.addListener(new C0697h0(viewGroup2, view2, abstractComponentCallbacksC0763z, c0749u0, c0529b));
                                        animator.setTarget(abstractComponentCallbacksC0763z.f3216I);
                                        animator.start();
                                    }
                                }
                                viewGroup2.removeView(view2);
                                if (m2078S(2)) {
                                    String str = "Removing view " + view2 + " for fragment " + abstractComponentCallbacksC0763z + " from container " + viewGroup2;
                                }
                                if (viewGroup2 != abstractComponentCallbacksC0763z.f3215H) {
                                    return;
                                }
                            }
                        }
                        if (this.f2978l.get(abstractComponentCallbacksC0763z) == null) {
                            m1981h.m2000h();
                        }
                    }
                }
                if (min < 1) {
                    if (this.f2978l.get(abstractComponentCallbacksC0763z) == null) {
                        m1981h.m2001g();
                    }
                    if (i2 < 0) {
                        m1981h.m1999i();
                    }
                    min = i2;
                }
            }
            i2 = min;
            if (i2 < 0) {
            }
            min = i2;
        }
        if (abstractComponentCallbacksC0763z.f3230c != min) {
            if (m2078S(3)) {
                String str2 = "moveToState: Fragment state for " + abstractComponentCallbacksC0763z + " not updated inline; expected state " + min + " found " + abstractComponentCallbacksC0763z.f3230c;
            }
            abstractComponentCallbacksC0763z.f3230c = min;
        }
    }

    /* renamed from: Z */
    public void m2071Z() {
        if (this.f2983q == null) {
            return;
        }
        this.f2957B = false;
        this.f2958C = false;
        this.f2965J.f3025h = false;
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
            if (abstractComponentCallbacksC0763z != null) {
                abstractComponentCallbacksC0763z.f3250w.m2071Z();
            }
        }
    }

    /* renamed from: a */
    public C0718m1 m2070a(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (m2078S(2)) {
            AbstractC1124a.m1186j("add: ", abstractComponentCallbacksC0763z);
        }
        C0718m1 m2052j = m2052j(abstractComponentCallbacksC0763z);
        abstractComponentCallbacksC0763z.f3248u = this;
        this.f2969c.m1979j(m2052j);
        if (!abstractComponentCallbacksC0763z.f3210C) {
            this.f2969c.m1988a(abstractComponentCallbacksC0763z);
            abstractComponentCallbacksC0763z.f3242o = false;
            if (abstractComponentCallbacksC0763z.f3216I == null) {
                abstractComponentCallbacksC0763z.f3220M = false;
            }
            if (m2077T(abstractComponentCallbacksC0763z)) {
                this.f2956A = true;
            }
        }
        return m2052j;
    }

    /* renamed from: a0 */
    public void m2069a0(C0718m1 c0718m1) {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
        if (abstractComponentCallbacksC0763z.f3217J) {
            if (this.f2968b) {
                this.f2960E = true;
                return;
            }
            abstractComponentCallbacksC0763z.f3217J = false;
            c0718m1.m1997k();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: b.m.d.z */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2068b(C0677c0 c0677c0, AbstractC0709k0 abstractC0709k0, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        C0702i1 c0702i1;
        C0677c0 c0677c02;
        String str;
        if (this.f2983q != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2983q = c0677c0;
        this.f2984r = abstractC0709k0;
        this.f2985s = abstractComponentCallbacksC0763z;
        if (abstractComponentCallbacksC0763z != 0) {
            this.f2981o.add(new C0761y0(this, abstractComponentCallbacksC0763z));
        } else if (c0677c0 instanceof InterfaceC0706j1) {
            this.f2981o.add(c0677c0);
        }
        if (this.f2985s != null) {
            m2039p0();
        }
        if (c0677c0 instanceof InterfaceC0060j) {
            C0059i m2105h = c0677c0.m2105h();
            this.f2973g = m2105h;
            C0677c0 c0677c03 = abstractComponentCallbacksC0763z != 0 ? abstractComponentCallbacksC0763z : c0677c0;
            C0745t0 c0745t0 = this.f2974h;
            m2105h.getClass();
            AbstractC0779h mo1826g = c0677c03.mo1826g();
            if (((C0784m) mo1826g).f3283b != EnumC0778g.DESTROYED) {
                c0745t0.f3134b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(m2105h, mo1826g, c0745t0));
            }
        }
        if (abstractComponentCallbacksC0763z != 0) {
            c0702i1 = abstractComponentCallbacksC0763z.f3248u.m2083N(abstractComponentCallbacksC0763z);
        } else if (c0677c0 instanceof InterfaceC0797z) {
            C0796y mo1801e = c0677c0.mo1801e();
            String canonicalName = C0702i1.class.getCanonicalName();
            if (canonicalName != null) {
                String m1190f = AbstractC1124a.m1190f("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                Object obj = (AbstractC0794w) mo1801e.f3307a.get(m1190f);
                if (!C0702i1.class.isInstance(obj)) {
                    obj = new C0702i1(true);
                    AbstractC0794w abstractC0794w = (AbstractC0794w) mo1801e.f3307a.put(m1190f, obj);
                    if (abstractC0794w != null) {
                        abstractC0794w.mo1799a();
                    }
                }
                this.f2965J = (C0702i1) obj;
                this.f2965J.f3025h = m2074W();
                this.f2969c.f3072c = this.f2965J;
                c0677c02 = this.f2983q;
                if (c0677c02 instanceof InterfaceC0068f) {
                    return;
                }
                C0055e m2106f = c0677c02.m2106f();
                if (abstractComponentCallbacksC0763z != 0) {
                    str = abstractComponentCallbacksC0763z.f3235h + ":";
                } else {
                    str = "";
                }
                String m1190f2 = AbstractC1124a.m1190f("FragmentManager:", str);
                this.f2989w = m2106f.m3095e(AbstractC1124a.m1190f(m1190f2, "StartActivityForResult"), new C0073d(), new C0764z0(this));
                this.f2990x = m2106f.m3095e(AbstractC1124a.m1190f(m1190f2, "StartIntentSenderForResult"), new C0670a1(), new C0737r0(this));
                this.f2991y = m2106f.m3095e(AbstractC1124a.m1190f(m1190f2, "RequestPermissions"), new C0072c(), new C0741s0(this));
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else {
            c0702i1 = new C0702i1(false);
        }
        this.f2965J = c0702i1;
        this.f2965J.f3025h = m2074W();
        this.f2969c.f3072c = this.f2965J;
        c0677c02 = this.f2983q;
        if (c0677c02 instanceof InterfaceC0068f) {
        }
    }

    /* renamed from: b0 */
    public boolean m2067b0() {
        return m2065c0(null, -1, 0);
    }

    /* renamed from: c */
    public void m2066c(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (m2078S(2)) {
            AbstractC1124a.m1186j("attach: ", abstractComponentCallbacksC0763z);
        }
        if (abstractComponentCallbacksC0763z.f3210C) {
            abstractComponentCallbacksC0763z.f3210C = false;
            if (abstractComponentCallbacksC0763z.f3241n) {
                return;
            }
            this.f2969c.m1988a(abstractComponentCallbacksC0763z);
            if (m2078S(2)) {
                AbstractC1124a.m1186j("add from attach: ", abstractComponentCallbacksC0763z);
            }
            if (m2077T(abstractComponentCallbacksC0763z)) {
                this.f2956A = true;
            }
        }
    }

    /* renamed from: c0 */
    public final boolean m2065c0(String str, int i, int i2) {
        m2092E(false);
        m2093D(true);
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f2986t;
        if (abstractComponentCallbacksC0763z == null || i >= 0 || !abstractComponentCallbacksC0763z.m1868j().m2067b0()) {
            boolean m2063d0 = m2063d0(this.f2961F, this.f2962G, null, i, i2);
            if (m2063d0) {
                this.f2968b = true;
                try {
                    m2059f0(this.f2961F, this.f2962G);
                } finally {
                    m2060f();
                }
            }
            m2039p0();
            m2029z();
            this.f2969c.m1987b();
            return m2063d0;
        }
        return true;
    }

    /* renamed from: d */
    public final void m2064d(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        HashSet hashSet = (HashSet) this.f2978l.get(abstractComponentCallbacksC0763z);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C0529b) it.next()).m2350a();
            }
            hashSet.clear();
            m2050k(abstractComponentCallbacksC0763z);
            this.f2978l.remove(abstractComponentCallbacksC0763z);
        }
    }

    /* renamed from: d0 */
    public boolean m2063d0(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        ArrayList arrayList3 = this.f2970d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2970d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0668a c0668a = (C0668a) this.f2970d.get(size2);
                    if ((str != null && str.equals(c0668a.f2905i)) || (i >= 0 && i == c0668a.f2915s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0668a c0668a2 = (C0668a) this.f2970d.get(size2);
                        if (str == null || !str.equals(c0668a2.f2905i)) {
                            if (i < 0 || i != c0668a2.f2915s) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f2970d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2970d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2970d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void m2062e() {
        if (m2074W()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: e0 */
    public void m2061e0(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (m2078S(2)) {
            String str = "remove: " + abstractComponentCallbacksC0763z + " nesting=" + abstractComponentCallbacksC0763z.f3247t;
        }
        boolean z = !abstractComponentCallbacksC0763z.m1898I();
        if (!abstractComponentCallbacksC0763z.f3210C || z) {
            this.f2969c.m1977l(abstractComponentCallbacksC0763z);
            if (m2077T(abstractComponentCallbacksC0763z)) {
                this.f2956A = true;
            }
            abstractComponentCallbacksC0763z.f3242o = true;
            m2045m0(abstractComponentCallbacksC0763z);
        }
    }

    /* renamed from: f */
    public final void m2060f() {
        this.f2968b = false;
        this.f2962G.clear();
        this.f2961F.clear();
    }

    /* renamed from: f0 */
    public final void m2059f0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m2089H(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0668a) arrayList.get(i)).f2912p) {
                if (i2 != i) {
                    m2090G(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0668a) arrayList.get(i2)).f2912p) {
                        i2++;
                    }
                }
                m2090G(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m2090G(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: g */
    public final Set m2058g() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f2969c.m1983f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0718m1) it.next()).f3061c.f3215H;
            if (viewGroup != null) {
                hashSet.add(AbstractC0743s2.m1945f(viewGroup, m2080Q()));
            }
        }
        return hashSet;
    }

    /* renamed from: g0 */
    public void m2057g0(Parcelable parcelable) {
        C0718m1 c0718m1;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f529b == null) {
            return;
        }
        this.f2969c.f3071b.clear();
        Iterator it = fragmentManagerState.f529b.iterator();
        while (it.hasNext()) {
            FragmentState fragmentState = (FragmentState) it.next();
            if (fragmentState != null) {
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractComponentCallbacksC0763z) this.f2965J.f3020c.get(fragmentState.f538c);
                if (abstractComponentCallbacksC0763z != null) {
                    if (m2078S(2)) {
                        AbstractC1124a.m1186j("restoreSaveState: re-attaching retained ", abstractComponentCallbacksC0763z);
                    }
                    c0718m1 = new C0718m1(this.f2980n, this.f2969c, abstractComponentCallbacksC0763z, fragmentState);
                } else {
                    c0718m1 = new C0718m1(this.f2980n, this.f2969c, this.f2983q.f2924c.getClassLoader(), m2081P(), fragmentState);
                }
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = c0718m1.f3061c;
                abstractComponentCallbacksC0763z2.f3248u = this;
                if (m2078S(2)) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("restoreSaveState: active (");
                    m1187i.append(abstractComponentCallbacksC0763z2.f3235h);
                    m1187i.append("): ");
                    m1187i.append(abstractComponentCallbacksC0763z2);
                    m1187i.toString();
                }
                c0718m1.m1995m(this.f2983q.f2924c.getClassLoader());
                this.f2969c.m1979j(c0718m1);
                c0718m1.f3063e = this.f2982p;
            }
        }
        C0702i1 c0702i1 = this.f2965J;
        c0702i1.getClass();
        Iterator it2 = new ArrayList(c0702i1.f3020c.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = (AbstractComponentCallbacksC0763z) it2.next();
            if (!this.f2969c.m1986c(abstractComponentCallbacksC0763z3.f3235h)) {
                if (m2078S(2)) {
                    String str = "Discarding retained Fragment " + abstractComponentCallbacksC0763z3 + " that was not found in the set of active Fragments " + fragmentManagerState.f529b;
                }
                this.f2965J.m2017b(abstractComponentCallbacksC0763z3);
                abstractComponentCallbacksC0763z3.f3248u = this;
                C0718m1 c0718m12 = new C0718m1(this.f2980n, this.f2969c, abstractComponentCallbacksC0763z3);
                c0718m12.f3063e = 1;
                c0718m12.m1997k();
                abstractComponentCallbacksC0763z3.f3242o = true;
                c0718m12.m1997k();
            }
        }
        C0722n1 c0722n1 = this.f2969c;
        ArrayList<String> arrayList = fragmentManagerState.f530c;
        c0722n1.f3070a.clear();
        if (arrayList != null) {
            for (String str2 : arrayList) {
                AbstractComponentCallbacksC0763z m1985d = c0722n1.m1985d(str2);
                if (m1985d == null) {
                    throw new IllegalStateException(AbstractC1124a.m1189g("No instantiated fragment for (", str2, ")"));
                }
                if (m2078S(2)) {
                    String str3 = "restoreSaveState: added (" + str2 + "): " + m1985d;
                }
                c0722n1.m1988a(m1985d);
            }
        }
        if (fragmentManagerState.f531d != null) {
            this.f2970d = new ArrayList(fragmentManagerState.f531d.length);
            int i = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f531d;
                if (i >= backStackStateArr.length) {
                    break;
                }
                BackStackState backStackState = backStackStateArr[i];
                backStackState.getClass();
                C0668a c0668a = new C0668a(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = backStackState.f512b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    C0726o1 c0726o1 = new C0726o1();
                    int i4 = i2 + 1;
                    c0726o1.f3079a = iArr[i2];
                    if (m2078S(2)) {
                        String str4 = "Instantiate " + c0668a + " op #" + i3 + " base fragment #" + backStackState.f512b[i4];
                    }
                    String str5 = (String) backStackState.f513c.get(i3);
                    c0726o1.f3080b = str5 != null ? this.f2969c.m1985d(str5) : null;
                    c0726o1.f3085g = EnumC0778g.values()[backStackState.f514d[i3]];
                    c0726o1.f3086h = EnumC0778g.values()[backStackState.f515e[i3]];
                    int[] iArr2 = backStackState.f512b;
                    int i5 = i4 + 1;
                    int i6 = iArr2[i4];
                    c0726o1.f3081c = i6;
                    int i7 = i5 + 1;
                    int i8 = iArr2[i5];
                    c0726o1.f3082d = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr2[i7];
                    c0726o1.f3083e = i10;
                    int i11 = iArr2[i9];
                    c0726o1.f3084f = i11;
                    c0668a.f2898b = i6;
                    c0668a.f2899c = i8;
                    c0668a.f2900d = i10;
                    c0668a.f2901e = i11;
                    c0668a.m2122b(c0726o1);
                    i3++;
                    i2 = i9 + 1;
                }
                c0668a.f2902f = backStackState.f516f;
                c0668a.f2905i = backStackState.f517g;
                c0668a.f2915s = backStackState.f518h;
                c0668a.f2903g = true;
                c0668a.f2906j = backStackState.f519i;
                c0668a.f2907k = backStackState.f520j;
                c0668a.f2908l = backStackState.f521k;
                c0668a.f2909m = backStackState.f522l;
                c0668a.f2910n = backStackState.f523m;
                c0668a.f2911o = backStackState.f524n;
                c0668a.f2912p = backStackState.f525o;
                c0668a.m2120d(1);
                if (m2078S(2)) {
                    String str6 = "restoreAllState: back stack #" + i + " (index " + c0668a.f2915s + "): " + c0668a;
                    PrintWriter printWriter = new PrintWriter(new C0715l2("FragmentManager"));
                    c0668a.m2115i("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2970d.add(c0668a);
                i++;
            }
        } else {
            this.f2970d = null;
        }
        this.f2975i.set(fragmentManagerState.f532e);
        String str7 = fragmentManagerState.f533f;
        if (str7 != null) {
            AbstractComponentCallbacksC0763z m2088I = m2088I(str7);
            this.f2986t = m2088I;
            m2033v(m2088I);
        }
        ArrayList arrayList2 = fragmentManagerState.f534g;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                Bundle bundle = (Bundle) fragmentManagerState.f535h.get(i12);
                bundle.setClassLoader(this.f2983q.f2924c.getClassLoader());
                this.f2976j.put(arrayList2.get(i12), bundle);
            }
        }
        this.f2992z = new ArrayDeque(fragmentManagerState.f536i);
    }

    /* renamed from: h */
    public final Set m2056h(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C0668a) arrayList.get(i)).f2897a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = ((C0726o1) it.next()).f3080b;
                if (abstractComponentCallbacksC0763z != null && (viewGroup = abstractComponentCallbacksC0763z.f3215H) != null) {
                    hashSet.add(AbstractC0743s2.m1945f(viewGroup, m2080Q()));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: h0 */
    public Parcelable m2055h0() {
        int i;
        BackStackState[] backStackStateArr;
        ArrayList arrayList;
        int size;
        m2085L();
        m2095B();
        m2092E(true);
        this.f2957B = true;
        this.f2965J.f3025h = true;
        C0722n1 c0722n1 = this.f2969c;
        c0722n1.getClass();
        ArrayList arrayList2 = new ArrayList(c0722n1.f3071b.size());
        Iterator it = c0722n1.f3071b.values().iterator();
        while (true) {
            backStackStateArr = null;
            backStackStateArr = null;
            if (!it.hasNext()) {
                break;
            }
            C0718m1 c0718m1 = (C0718m1) it.next();
            if (c0718m1 != null) {
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
                FragmentState fragmentState = new FragmentState(abstractComponentCallbacksC0763z);
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = c0718m1.f3061c;
                if (abstractComponentCallbacksC0763z2.f3230c <= -1 || fragmentState.f549n != null) {
                    fragmentState.f549n = abstractComponentCallbacksC0763z2.f3231d;
                } else {
                    Bundle bundle = new Bundle();
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = c0718m1.f3061c;
                    abstractComponentCallbacksC0763z3.mo521n0(bundle);
                    abstractComponentCallbacksC0763z3.f3228U.m1386b(bundle);
                    Parcelable m2055h0 = abstractComponentCallbacksC0763z3.f3250w.m2055h0();
                    if (m2055h0 != null) {
                        bundle.putParcelable("android:support:fragments", m2055h0);
                    }
                    c0718m1.f3059a.m1958j(c0718m1.f3061c, bundle, false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (c0718m1.f3061c.f3216I != null) {
                        c0718m1.m1993o();
                    }
                    if (c0718m1.f3061c.f3232e != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", c0718m1.f3061c.f3232e);
                    }
                    if (c0718m1.f3061c.f3233f != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", c0718m1.f3061c.f3233f);
                    }
                    if (!c0718m1.f3061c.f3218K) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", c0718m1.f3061c.f3218K);
                    }
                    fragmentState.f549n = bundle2;
                    if (c0718m1.f3061c.f3238k != null) {
                        if (bundle2 == null) {
                            fragmentState.f549n = new Bundle();
                        }
                        fragmentState.f549n.putString("android:target_state", c0718m1.f3061c.f3238k);
                        int i2 = c0718m1.f3061c.f3239l;
                        if (i2 != 0) {
                            fragmentState.f549n.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(fragmentState);
                if (m2078S(2)) {
                    String str = "Saved state of " + abstractComponentCallbacksC0763z + ": " + fragmentState.f549n;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        C0722n1 c0722n12 = this.f2969c;
        synchronized (c0722n12.f3070a) {
            if (c0722n12.f3070a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(c0722n12.f3070a.size());
                Iterator it2 = c0722n12.f3070a.iterator();
                while (it2.hasNext()) {
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = (AbstractComponentCallbacksC0763z) it2.next();
                    arrayList.add(abstractComponentCallbacksC0763z4.f3235h);
                    if (m2078S(2)) {
                        String str2 = "saveAllState: adding fragment (" + abstractComponentCallbacksC0763z4.f3235h + "): " + abstractComponentCallbacksC0763z4;
                    }
                }
            }
        }
        ArrayList arrayList3 = this.f2970d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState((C0668a) this.f2970d.get(i));
                if (m2078S(2)) {
                    String str3 = "saveAllState: adding back stack #" + i + ": " + this.f2970d.get(i);
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f529b = arrayList2;
        fragmentManagerState.f530c = arrayList;
        fragmentManagerState.f531d = backStackStateArr;
        fragmentManagerState.f532e = this.f2975i.get();
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = this.f2986t;
        if (abstractComponentCallbacksC0763z5 != null) {
            fragmentManagerState.f533f = abstractComponentCallbacksC0763z5.f3235h;
        }
        fragmentManagerState.f534g.addAll(this.f2976j.keySet());
        fragmentManagerState.f535h.addAll(this.f2976j.values());
        fragmentManagerState.f536i = new ArrayList(this.f2992z);
        return fragmentManagerState;
    }

    /* renamed from: i */
    public void m2054i(C0668a c0668a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0668a.m2113k(z3);
        } else {
            c0668a.m2114j();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0668a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f2982p >= 1) {
            AbstractC0756w1.m1916p(this.f2983q.f2924c, this.f2984r, arrayList, arrayList2, 0, 1, true, this.f2979m);
        }
        if (z3) {
            m2073X(this.f2982p, true);
        }
        Iterator it = ((ArrayList) this.f2969c.m1982g()).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractComponentCallbacksC0763z) it.next();
            if (abstractComponentCallbacksC0763z != null) {
                View view = abstractComponentCallbacksC0763z.f3216I;
            }
        }
    }

    /* renamed from: i0 */
    public void m2053i0() {
        synchronized (this.f2967a) {
            ArrayList arrayList = this.f2964I;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f2967a.size() == 1;
            if (z || z2) {
                this.f2983q.f2925d.removeCallbacks(this.f2966K);
                this.f2983q.f2925d.post(this.f2966K);
                m2039p0();
            }
        }
    }

    /* renamed from: j */
    public C0718m1 m2052j(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        C0718m1 m1981h = this.f2969c.m1981h(abstractComponentCallbacksC0763z.f3235h);
        if (m1981h != null) {
            return m1981h;
        }
        C0718m1 c0718m1 = new C0718m1(this.f2980n, this.f2969c, abstractComponentCallbacksC0763z);
        c0718m1.m1995m(this.f2983q.f2924c.getClassLoader());
        c0718m1.f3063e = this.f2982p;
        return c0718m1;
    }

    /* renamed from: j0 */
    public void m2051j0(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, boolean z) {
        ViewGroup m2082O = m2082O(abstractComponentCallbacksC0763z);
        if (m2082O == null || !(m2082O instanceof C0713l0)) {
            return;
        }
        ((C0713l0) m2082O).setDrawDisappearingViewsLast(!z);
    }

    /* renamed from: k */
    public final void m2050k(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        abstractComponentCallbacksC0763z.m1852u0();
        this.f2980n.m1954n(abstractComponentCallbacksC0763z, false);
        abstractComponentCallbacksC0763z.f3215H = null;
        abstractComponentCallbacksC0763z.f3216I = null;
        abstractComponentCallbacksC0763z.f3226S = null;
        abstractComponentCallbacksC0763z.f3227T.m1806e(null);
        abstractComponentCallbacksC0763z.f3244q = false;
    }

    /* renamed from: k0 */
    public void m2049k0(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, EnumC0778g enumC0778g) {
        if (abstractComponentCallbacksC0763z.equals(m2088I(abstractComponentCallbacksC0763z.f3235h)) && (abstractComponentCallbacksC0763z.f3249v == null || abstractComponentCallbacksC0763z.f3248u == this)) {
            abstractComponentCallbacksC0763z.f3224Q = enumC0778g;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0763z + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: l */
    public void m2048l(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (m2078S(2)) {
            AbstractC1124a.m1186j("detach: ", abstractComponentCallbacksC0763z);
        }
        if (abstractComponentCallbacksC0763z.f3210C) {
            return;
        }
        abstractComponentCallbacksC0763z.f3210C = true;
        if (abstractComponentCallbacksC0763z.f3241n) {
            if (m2078S(2)) {
                AbstractC1124a.m1186j("remove from detach: ", abstractComponentCallbacksC0763z);
            }
            this.f2969c.m1977l(abstractComponentCallbacksC0763z);
            if (m2077T(abstractComponentCallbacksC0763z)) {
                this.f2956A = true;
            }
            m2045m0(abstractComponentCallbacksC0763z);
        }
    }

    /* renamed from: l0 */
    public void m2047l0(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (abstractComponentCallbacksC0763z == null || (abstractComponentCallbacksC0763z.equals(m2088I(abstractComponentCallbacksC0763z.f3235h)) && (abstractComponentCallbacksC0763z.f3249v == null || abstractComponentCallbacksC0763z.f3248u == this))) {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f2986t;
            this.f2986t = abstractComponentCallbacksC0763z;
            m2033v(abstractComponentCallbacksC0763z2);
            m2033v(this.f2986t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0763z + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: m */
    public void m2046m(Configuration configuration) {
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
            if (abstractComponentCallbacksC0763z != null) {
                abstractComponentCallbacksC0763z.onConfigurationChanged(configuration);
                abstractComponentCallbacksC0763z.f3250w.m2046m(configuration);
            }
        }
    }

    /* renamed from: m0 */
    public final void m2045m0(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        ViewGroup m2082O = m2082O(abstractComponentCallbacksC0763z);
        if (m2082O != null) {
            if (abstractComponentCallbacksC0763z.m1847x() + abstractComponentCallbacksC0763z.m1849w() + abstractComponentCallbacksC0763z.m1861o() + abstractComponentCallbacksC0763z.m1864l() > 0) {
                int i = AbstractC0666b.visible_removing_fragment_view_tag;
                if (m2082O.getTag(i) == null) {
                    m2082O.setTag(i, abstractComponentCallbacksC0763z);
                }
                ((AbstractComponentCallbacksC0763z) m2082O.getTag(i)).m1891L0(abstractComponentCallbacksC0763z.m1851v());
            }
        }
    }

    /* renamed from: n */
    public boolean m2044n(MenuItem menuItem) {
        if (this.f2982p >= 1) {
            for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
                if (abstractComponentCallbacksC0763z != null) {
                    if (!abstractComponentCallbacksC0763z.f3209B ? abstractComponentCallbacksC0763z.m1883S() ? true : abstractComponentCallbacksC0763z.f3250w.m2044n(menuItem) : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: n0 */
    public void m2043n0(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (m2078S(2)) {
            AbstractC1124a.m1186j("show: ", abstractComponentCallbacksC0763z);
        }
        if (abstractComponentCallbacksC0763z.f3209B) {
            abstractComponentCallbacksC0763z.f3209B = false;
            abstractComponentCallbacksC0763z.f3220M = !abstractComponentCallbacksC0763z.f3220M;
        }
    }

    /* renamed from: o */
    public void m2042o() {
        this.f2957B = false;
        this.f2958C = false;
        this.f2965J.f3025h = false;
        m2030y(1);
    }

    /* renamed from: o0 */
    public final void m2041o0() {
        Iterator it = ((ArrayList) this.f2969c.m1983f()).iterator();
        while (it.hasNext()) {
            m2069a0((C0718m1) it.next());
        }
    }

    /* renamed from: p */
    public boolean m2040p(Menu menu, MenuInflater menuInflater) {
        if (this.f2982p < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
            if (abstractComponentCallbacksC0763z != null && m2076U(abstractComponentCallbacksC0763z) && abstractComponentCallbacksC0763z.m1856s0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC0763z);
                z = true;
            }
        }
        if (this.f2971e != null) {
            for (int i = 0; i < this.f2971e.size(); i++) {
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = (AbstractComponentCallbacksC0763z) this.f2971e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0763z2)) {
                    abstractComponentCallbacksC0763z2.getClass();
                }
            }
        }
        this.f2971e = arrayList;
        return z;
    }

    /* renamed from: p0 */
    public final void m2039p0() {
        synchronized (this.f2967a) {
            boolean z = true;
            if (!this.f2967a.isEmpty()) {
                this.f2974h.f3133a = true;
                return;
            }
            C0745t0 c0745t0 = this.f2974h;
            ArrayList arrayList = this.f2970d;
            c0745t0.f3133a = ((arrayList != null ? arrayList.size() : 0) <= 0 || !m2075V(this.f2985s)) ? false : false;
        }
    }

    /* renamed from: q */
    public void m2038q() {
        this.f2959D = true;
        m2092E(true);
        m2095B();
        m2030y(-1);
        this.f2983q = null;
        this.f2984r = null;
        this.f2985s = null;
        if (this.f2973g != null) {
            Iterator it = this.f2974h.f3134b.iterator();
            while (it.hasNext()) {
                ((InterfaceC0051a) it.next()).cancel();
            }
            this.f2973g = null;
        }
        C0065c c0065c = this.f2989w;
        if (c0065c != null) {
            c0065c.m3087b();
            this.f2990x.m3087b();
            this.f2991y.m3087b();
        }
    }

    /* renamed from: r */
    public void m2037r() {
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
            if (abstractComponentCallbacksC0763z != null) {
                abstractComponentCallbacksC0763z.m1848w0();
            }
        }
    }

    /* renamed from: s */
    public void m2036s(boolean z) {
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
            if (abstractComponentCallbacksC0763z != null) {
                abstractComponentCallbacksC0763z.m1846x0(z);
            }
        }
    }

    /* renamed from: t */
    public boolean m2035t(MenuItem menuItem) {
        if (this.f2982p >= 1) {
            for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
                if (abstractComponentCallbacksC0763z != null) {
                    if (!abstractComponentCallbacksC0763z.f3209B ? (abstractComponentCallbacksC0763z.f3212E && abstractComponentCallbacksC0763z.f3213F && abstractComponentCallbacksC0763z.mo1109g0(menuItem)) ? true : abstractComponentCallbacksC0763z.f3250w.m2035t(menuItem) : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f2985s;
        if (abstractComponentCallbacksC0763z != null) {
            sb.append(abstractComponentCallbacksC0763z.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2985s;
        } else if (this.f2983q == null) {
            str = "null";
            sb.append(str);
            sb.append("}}");
            return sb.toString();
        } else {
            sb.append(C0677c0.class.getSimpleName());
            sb.append("{");
            obj = this.f2983q;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        str = "}";
        sb.append(str);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void m2034u(Menu menu) {
        if (this.f2982p < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
            if (abstractComponentCallbacksC0763z != null && !abstractComponentCallbacksC0763z.f3209B) {
                if (abstractComponentCallbacksC0763z.f3212E && abstractComponentCallbacksC0763z.f3213F) {
                    abstractComponentCallbacksC0763z.m1871h0();
                }
                abstractComponentCallbacksC0763z.f3250w.m2034u(menu);
            }
        }
    }

    /* renamed from: v */
    public final void m2033v(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (abstractComponentCallbacksC0763z == null || !abstractComponentCallbacksC0763z.equals(m2088I(abstractComponentCallbacksC0763z.f3235h))) {
            return;
        }
        boolean m2075V = abstractComponentCallbacksC0763z.f3248u.m2075V(abstractComponentCallbacksC0763z);
        Boolean bool = abstractComponentCallbacksC0763z.f3240m;
        if (bool == null || bool.booleanValue() != m2075V) {
            abstractComponentCallbacksC0763z.f3240m = Boolean.valueOf(m2075V);
            abstractComponentCallbacksC0763z.m1865k0();
            C0690f1 c0690f1 = abstractComponentCallbacksC0763z.f3250w;
            c0690f1.m2039p0();
            c0690f1.m2033v(c0690f1.f2986t);
        }
    }

    /* renamed from: w */
    public void m2032w(boolean z) {
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
            if (abstractComponentCallbacksC0763z != null) {
                abstractComponentCallbacksC0763z.m1844y0(z);
            }
        }
    }

    /* renamed from: x */
    public boolean m2031x(Menu menu) {
        boolean z = false;
        if (this.f2982p >= 1) {
            for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : this.f2969c.m1980i()) {
                if (abstractComponentCallbacksC0763z != null && m2076U(abstractComponentCallbacksC0763z) && abstractComponentCallbacksC0763z.m1842z0(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: y */
    public final void m2030y(int i) {
        try {
            this.f2968b = true;
            for (C0718m1 c0718m1 : this.f2969c.f3071b.values()) {
                if (c0718m1 != null) {
                    c0718m1.f3063e = i;
                }
            }
            m2073X(i, false);
            Iterator it = ((HashSet) m2058g()).iterator();
            while (it.hasNext()) {
                ((AbstractC0743s2) it.next()).m1946e();
            }
            this.f2968b = false;
            m2092E(true);
        } catch (Throwable th) {
            this.f2968b = false;
            throw th;
        }
    }

    /* renamed from: z */
    public final void m2029z() {
        if (this.f2960E) {
            this.f2960E = false;
            m2041o0();
        }
    }
}