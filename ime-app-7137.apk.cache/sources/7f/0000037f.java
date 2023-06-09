package p010b.p067m.p068d;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p072o.AbstractC0779h;
import p010b.p072o.C0784m;
import p010b.p072o.C0789r;
import p010b.p072o.C0796y;
import p010b.p072o.EnumC0777f;
import p010b.p072o.EnumC0778g;
import p010b.p072o.InterfaceC0782k;
import p010b.p072o.InterfaceC0797z;
import p010b.p072o.p073a0.AbstractC0771a;
import p010b.p072o.p074b0.AbstractC0773a;
import p010b.p075p.p076a.AbstractC0798a;
import p010b.p075p.p076a.AbstractC0799b;
import p010b.p075p.p076a.C0801d;
import p010b.p075p.p076a.C0802e;
import p010b.p085v.AbstractC1014a;
import p010b.p085v.C1018e;
import p010b.p085v.C1019f;
import p010b.p085v.InterfaceC1020g;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.z */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0763z implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0782k, InterfaceC0797z, InterfaceC1020g {

    /* renamed from: b */
    public static final Object f3207b = new Object();

    /* renamed from: A */
    public String f3208A;

    /* renamed from: B */
    public boolean f3209B;

    /* renamed from: C */
    public boolean f3210C;

    /* renamed from: D */
    public boolean f3211D;

    /* renamed from: E */
    public boolean f3212E;

    /* renamed from: G */
    public boolean f3214G;

    /* renamed from: H */
    public ViewGroup f3215H;

    /* renamed from: I */
    public View f3216I;

    /* renamed from: J */
    public boolean f3217J;

    /* renamed from: L */
    public C0757x f3219L;

    /* renamed from: M */
    public boolean f3220M;

    /* renamed from: N */
    public float f3221N;

    /* renamed from: O */
    public LayoutInflater f3222O;

    /* renamed from: P */
    public boolean f3223P;

    /* renamed from: R */
    public C0784m f3225R;

    /* renamed from: S */
    public C0699h2 f3226S;

    /* renamed from: U */
    public C1019f f3228U;

    /* renamed from: V */
    public final ArrayList f3229V;

    /* renamed from: d */
    public Bundle f3231d;

    /* renamed from: e */
    public SparseArray f3232e;

    /* renamed from: f */
    public Bundle f3233f;

    /* renamed from: g */
    public Boolean f3234g;

    /* renamed from: i */
    public Bundle f3236i;

    /* renamed from: j */
    public AbstractComponentCallbacksC0763z f3237j;

    /* renamed from: l */
    public int f3239l;

    /* renamed from: n */
    public boolean f3241n;

    /* renamed from: o */
    public boolean f3242o;

    /* renamed from: p */
    public boolean f3243p;

    /* renamed from: q */
    public boolean f3244q;

    /* renamed from: r */
    public boolean f3245r;

    /* renamed from: s */
    public boolean f3246s;

    /* renamed from: t */
    public int f3247t;

    /* renamed from: u */
    public C0690f1 f3248u;

    /* renamed from: v */
    public C0677c0 f3249v;

    /* renamed from: x */
    public AbstractComponentCallbacksC0763z f3251x;

    /* renamed from: y */
    public int f3252y;

    /* renamed from: z */
    public int f3253z;

    /* renamed from: c */
    public int f3230c = -1;

    /* renamed from: h */
    public String f3235h = UUID.randomUUID().toString();

    /* renamed from: k */
    public String f3238k = null;

    /* renamed from: m */
    public Boolean f3240m = null;

    /* renamed from: w */
    public C0690f1 f3250w = new C0690f1();

    /* renamed from: F */
    public boolean f3213F = true;

    /* renamed from: K */
    public boolean f3218K = true;

    /* renamed from: Q */
    public EnumC0778g f3224Q = EnumC0778g.RESUMED;

    /* renamed from: T */
    public C0789r f3227T = new C0789r();

    public AbstractComponentCallbacksC0763z() {
        new AtomicInteger();
        this.f3229V = new ArrayList();
        this.f3225R = new C0784m(this);
        this.f3228U = new C1019f(this);
    }

    /* renamed from: A */
    public Object m1914A() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return null;
        }
        Object obj = c0757x.f3196k;
        if (obj == f3207b) {
            m1863m();
            return null;
        }
        return obj;
    }

    /* renamed from: A0 */
    public final AbstractActivityC0681d0 m1913A0() {
        AbstractActivityC0681d0 m1872h = m1872h();
        if (m1872h != null) {
            return m1872h;
        }
        throw new IllegalStateException(AbstractC1124a.m1191e("Fragment ", this, " not attached to an activity."));
    }

    /* renamed from: B */
    public Object m1912B() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return null;
        }
        c0757x.getClass();
        return null;
    }

    /* renamed from: B0 */
    public final Context m1911B0() {
        Context m1866k = m1866k();
        if (m1866k != null) {
            return m1866k;
        }
        throw new IllegalStateException(AbstractC1124a.m1191e("Fragment ", this, " not attached to a context."));
    }

    /* renamed from: C */
    public Object m1910C() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return null;
        }
        Object obj = c0757x.f3198m;
        if (obj == f3207b) {
            m1912B();
            return null;
        }
        return obj;
    }

    /* renamed from: C0 */
    public final View m1909C0() {
        View view = this.f3216I;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC1124a.m1191e("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* renamed from: D */
    public final String m1908D(int i) {
        return m1843z().getString(i);
    }

    /* renamed from: D0 */
    public void m1907D0(View view) {
        m1874f().f3186a = view;
    }

    /* renamed from: E */
    public final String m1906E(int i, Object... objArr) {
        return m1843z().getString(i, objArr);
    }

    /* renamed from: E0 */
    public void m1905E0(int i, int i2, int i3, int i4) {
        if (this.f3219L == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m1874f().f3189d = i;
        m1874f().f3190e = i2;
        m1874f().f3191f = i3;
        m1874f().f3192g = i4;
    }

    @Deprecated
    /* renamed from: F */
    public final AbstractComponentCallbacksC0763z m1904F() {
        String str;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3237j;
        if (abstractComponentCallbacksC0763z != null) {
            return abstractComponentCallbacksC0763z;
        }
        C0690f1 c0690f1 = this.f3248u;
        if (c0690f1 == null || (str = this.f3238k) == null) {
            return null;
        }
        return c0690f1.m2088I(str);
    }

    /* renamed from: F0 */
    public void m1903F0(Animator animator) {
        m1874f().f3187b = animator;
    }

    /* renamed from: G */
    public final CharSequence m1902G(int i) {
        return m1843z().getText(i);
    }

    /* renamed from: G0 */
    public void m1901G0(Bundle bundle) {
        C0690f1 c0690f1 = this.f3248u;
        if (c0690f1 != null) {
            if (c0690f1 == null ? false : c0690f1.m2074W()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f3236i = bundle;
    }

    /* renamed from: H */
    public final boolean m1900H() {
        return this.f3249v != null && this.f3241n;
    }

    /* renamed from: H0 */
    public void m1899H0(View view) {
        m1874f().f3200o = null;
    }

    /* renamed from: I */
    public final boolean m1898I() {
        return this.f3247t > 0;
    }

    /* renamed from: I0 */
    public void m1897I0(boolean z) {
        if (this.f3212E != z) {
            this.f3212E = z;
            if (!m1900H() || this.f3209B) {
                return;
            }
            this.f3249v.f2927f.mo2099o();
        }
    }

    /* renamed from: J */
    public final boolean m1896J() {
        C0690f1 c0690f1;
        return this.f3213F && ((c0690f1 = this.f3248u) == null || c0690f1.m2076U(this.f3251x));
    }

    /* renamed from: J0 */
    public void m1895J0(boolean z) {
        m1874f().f3201p = z;
    }

    /* renamed from: K */
    public boolean m1894K() {
        C0757x c0757x = this.f3219L;
        return false;
    }

    /* renamed from: K0 */
    public void m1893K0(boolean z) {
        if (this.f3213F != z) {
            this.f3213F = z;
            if (this.f3212E && m1900H() && !this.f3209B) {
                this.f3249v.f2927f.mo2099o();
            }
        }
    }

    /* renamed from: L */
    public final boolean m1892L() {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3251x;
        return abstractComponentCallbacksC0763z != null && (abstractComponentCallbacksC0763z.f3242o || abstractComponentCallbacksC0763z.m1892L());
    }

    /* renamed from: L0 */
    public void m1891L0(boolean z) {
        if (this.f3219L == null) {
            return;
        }
        m1874f().f3188c = z;
    }

    /* renamed from: M */
    public final boolean m1890M() {
        return this.f3230c >= 7;
    }

    @Deprecated
    /* renamed from: M0 */
    public void m1889M0(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, int i) {
        C0690f1 c0690f1 = this.f3248u;
        C0690f1 c0690f12 = abstractComponentCallbacksC0763z.f3248u;
        if (c0690f1 != null && c0690f12 != null && c0690f1 != c0690f12) {
            throw new IllegalArgumentException(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = abstractComponentCallbacksC0763z; abstractComponentCallbacksC0763z2 != null; abstractComponentCallbacksC0763z2 = abstractComponentCallbacksC0763z2.m1904F()) {
            if (abstractComponentCallbacksC0763z2.equals(this)) {
                throw new IllegalArgumentException("Setting " + abstractComponentCallbacksC0763z + " as the target of " + this + " would create a target cycle");
            }
        }
        if (this.f3248u == null || abstractComponentCallbacksC0763z.f3248u == null) {
            this.f3238k = null;
            this.f3237j = abstractComponentCallbacksC0763z;
        } else {
            this.f3238k = abstractComponentCallbacksC0763z.f3235h;
            this.f3237j = null;
        }
        this.f3239l = i;
    }

    @Deprecated
    /* renamed from: N */
    public void mo1100N(Bundle bundle) {
        this.f3214G = true;
    }

    @Deprecated
    /* renamed from: N0 */
    public void m1888N0(boolean z) {
        if (!this.f3218K && z && this.f3230c < 5 && this.f3248u != null && m1900H() && this.f3223P) {
            C0690f1 c0690f1 = this.f3248u;
            c0690f1.m2069a0(c0690f1.m2052j(this));
        }
        this.f3218K = z;
        this.f3217J = this.f3230c < 5 && !z;
        if (this.f3231d != null) {
            this.f3234g = Boolean.valueOf(z);
        }
    }

    @Deprecated
    /* renamed from: O */
    public void mo1116O(int i, int i2, Intent intent) {
        if (C0690f1.m2078S(2)) {
            String str = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent;
        }
    }

    /* renamed from: O0 */
    public void m1887O0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        C0677c0 c0677c0 = this.f3249v;
        if (c0677c0 == null) {
            throw new IllegalStateException(AbstractC1124a.m1191e("Fragment ", this, " not attached to Activity"));
        }
        c0677c0.m2104i(this, intent, -1, null);
    }

    @Deprecated
    /* renamed from: P */
    public void m1886P() {
        this.f3214G = true;
    }

    @Deprecated
    /* renamed from: P0 */
    public void m1885P0(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (this.f3249v != null) {
            C0690f1 m1853u = m1853u();
            if (m1853u.f2989w == null) {
                m1853u.f2983q.m2104i(this, intent, i, null);
                return;
            }
            m1853u.f2992z.addLast(new FragmentManager$LaunchedFragmentInfo(this.f3235h, i));
            m1853u.f2989w.m3088a(intent);
            return;
        }
        throw new IllegalStateException(AbstractC1124a.m1191e("Fragment ", this, " not attached to Activity"));
    }

    /* renamed from: Q */
    public void mo15Q(Context context) {
        this.f3214G = true;
        C0677c0 c0677c0 = this.f3249v;
        if ((c0677c0 == null ? null : c0677c0.f2923b) != null) {
            this.f3214G = false;
            m1886P();
        }
    }

    @Deprecated
    /* renamed from: R */
    public void m1884R() {
    }

    /* renamed from: S */
    public boolean m1883S() {
        return false;
    }

    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        Parcelable parcelable;
        this.f3214G = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f3250w.m2057g0(parcelable);
            this.f3250w.m2042o();
        }
        C0690f1 c0690f1 = this.f3250w;
        if (c0690f1.f2982p >= 1) {
            return;
        }
        c0690f1.m2042o();
    }

    /* renamed from: U */
    public Animation m1882U() {
        return null;
    }

    /* renamed from: V */
    public Animator m1881V() {
        return null;
    }

    /* renamed from: W */
    public void mo1110W(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: Y */
    public void mo1098Y() {
        this.f3214G = true;
    }

    /* renamed from: Z */
    public void mo1096Z() {
        this.f3214G = true;
    }

    /* renamed from: a0 */
    public void mo13a0() {
        this.f3214G = true;
    }

    @Override // p010b.p085v.InterfaceC1020g
    /* renamed from: b */
    public final C1018e mo1385b() {
        return this.f3228U.f3912b;
    }

    /* renamed from: b0 */
    public LayoutInflater mo1880b0(Bundle bundle) {
        return m1857s();
    }

    /* renamed from: c */
    public AbstractC0709k0 mo1879c() {
        return new C0754w(this);
    }

    /* renamed from: c0 */
    public void m1878c0() {
    }

    /* renamed from: d */
    public void m1877d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3252y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3253z));
        printWriter.print(" mTag=");
        printWriter.println(this.f3208A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3230c);
        printWriter.print(" mWho=");
        printWriter.print(this.f3235h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3247t);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3241n);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3242o);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3243p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3244q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3209B);
        printWriter.print(" mDetached=");
        printWriter.print(this.f3210C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f3213F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f3212E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f3211D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3218K);
        if (this.f3248u != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3248u);
        }
        if (this.f3249v != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3249v);
        }
        if (this.f3251x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3251x);
        }
        if (this.f3236i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3236i);
        }
        if (this.f3231d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3231d);
        }
        if (this.f3232e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3232e);
        }
        if (this.f3233f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3233f);
        }
        AbstractComponentCallbacksC0763z m1904F = m1904F();
        if (m1904F != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m1904F);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3239l);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m1851v());
        if (m1864l() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m1864l());
        }
        if (m1861o() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m1861o());
        }
        if (m1849w() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m1849w());
        }
        if (m1847x() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m1847x());
        }
        if (this.f3215H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3215H);
        }
        if (this.f3216I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3216I);
        }
        if (m1870i() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m1870i());
        }
        if (m1866k() != null) {
            AbstractC0798a.m1800b(this).mo1798a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3250w + ":");
        this.f3250w.m2096A(AbstractC1124a.m1190f(str, "  "), fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    /* renamed from: d0 */
    public void m1876d0() {
        this.f3214G = true;
    }

    @Override // p010b.p072o.InterfaceC0797z
    /* renamed from: e */
    public C0796y mo1801e() {
        if (this.f3248u != null) {
            if (m1855t() != 1) {
                C0702i1 c0702i1 = this.f3248u.f2965J;
                C0796y c0796y = (C0796y) c0702i1.f3022e.get(this.f3235h);
                if (c0796y == null) {
                    C0796y c0796y2 = new C0796y();
                    c0702i1.f3022e.put(this.f3235h, c0796y2);
                    return c0796y2;
                }
                return c0796y;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: e0 */
    public void m1875e0(AttributeSet attributeSet, Bundle bundle) {
        this.f3214G = true;
        C0677c0 c0677c0 = this.f3249v;
        if ((c0677c0 == null ? null : c0677c0.f2923b) != null) {
            this.f3214G = false;
            m1876d0();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C0757x m1874f() {
        if (this.f3219L == null) {
            this.f3219L = new C0757x();
        }
        return this.f3219L;
    }

    /* renamed from: f0 */
    public void m1873f0() {
    }

    @Override // p010b.p072o.InterfaceC0782k
    /* renamed from: g */
    public AbstractC0779h mo1826g() {
        return this.f3225R;
    }

    /* renamed from: g0 */
    public boolean mo1109g0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: h */
    public final AbstractActivityC0681d0 m1872h() {
        C0677c0 c0677c0 = this.f3249v;
        if (c0677c0 == null) {
            return null;
        }
        return (AbstractActivityC0681d0) c0677c0.f2923b;
    }

    /* renamed from: h0 */
    public void m1871h0() {
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public View m1870i() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return null;
        }
        return c0757x.f3186a;
    }

    /* renamed from: i0 */
    public void m1869i0() {
    }

    /* renamed from: j */
    public final C0690f1 m1868j() {
        if (this.f3249v != null) {
            return this.f3250w;
        }
        throw new IllegalStateException(AbstractC1124a.m1191e("Fragment ", this, " has not been attached yet."));
    }

    /* renamed from: j0 */
    public void m1867j0() {
    }

    /* renamed from: k */
    public Context m1866k() {
        C0677c0 c0677c0 = this.f3249v;
        if (c0677c0 == null) {
            return null;
        }
        return c0677c0.f2924c;
    }

    /* renamed from: k0 */
    public void m1865k0() {
    }

    /* renamed from: l */
    public int m1864l() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return 0;
        }
        return c0757x.f3189d;
    }

    @Deprecated
    /* renamed from: l0 */
    public void mo1101l0(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: m */
    public Object m1863m() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return null;
        }
        c0757x.getClass();
        return null;
    }

    /* renamed from: m0 */
    public void mo1103m0() {
        this.f3214G = true;
    }

    /* renamed from: n */
    public void m1862n() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return;
        }
        c0757x.getClass();
    }

    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
    }

    /* renamed from: o */
    public int m1861o() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return 0;
        }
        return c0757x.f3190e;
    }

    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f3214G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m1913A0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3214G = true;
    }

    /* renamed from: p */
    public Object m1860p() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return null;
        }
        c0757x.getClass();
        return null;
    }

    /* renamed from: p0 */
    public void mo526p0() {
        this.f3214G = true;
    }

    /* renamed from: q */
    public void m1859q() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return;
        }
        c0757x.getClass();
    }

    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
    }

    /* renamed from: r */
    public final LayoutInflater m1858r() {
        LayoutInflater layoutInflater = this.f3222O;
        return layoutInflater == null ? m1850v0(null) : layoutInflater;
    }

    /* renamed from: r0 */
    public void mo1113r0(Bundle bundle) {
        this.f3214G = true;
    }

    @Deprecated
    /* renamed from: s */
    public LayoutInflater m1857s() {
        C0677c0 c0677c0 = this.f3249v;
        if (c0677c0 != null) {
            LayoutInflater cloneInContext = c0677c0.f2927f.getLayoutInflater().cloneInContext(c0677c0.f2927f);
            AbstractC0022t.m3504b0(cloneInContext, this.f3250w.f2972f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: s0 */
    public boolean m1856s0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f3209B) {
            return false;
        }
        if (this.f3212E && this.f3213F) {
            z = true;
            mo1110W(menu, menuInflater);
        }
        return z | this.f3250w.m2040p(menu, menuInflater);
    }

    /* renamed from: t */
    public final int m1855t() {
        EnumC0778g enumC0778g = this.f3224Q;
        return (enumC0778g == EnumC0778g.INITIALIZED || this.f3251x == null) ? enumC0778g.ordinal() : Math.min(enumC0778g.ordinal(), this.f3251x.m1855t());
    }

    /* renamed from: t0 */
    public void mo1854t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3250w.m2071Z();
        this.f3246s = true;
        this.f3226S = new C0699h2(this, mo1801e());
        View mo522X = mo522X(layoutInflater, viewGroup, bundle);
        this.f3216I = mo522X;
        if (mo522X != null) {
            this.f3226S.m2018c();
            this.f3216I.setTag(AbstractC0771a.view_tree_lifecycle_owner, this.f3226S);
            this.f3216I.setTag(AbstractC0773a.view_tree_view_model_store_owner, this.f3226S);
            this.f3216I.setTag(AbstractC1014a.view_tree_saved_state_registry_owner, this.f3226S);
            this.f3227T.m1806e(this.f3226S);
            return;
        }
        if (this.f3226S.f3011c != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.f3226S = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f3235h);
        if (this.f3252y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3252y));
        }
        if (this.f3208A != null) {
            sb.append(" tag=");
            sb.append(this.f3208A);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public final C0690f1 m1853u() {
        C0690f1 c0690f1 = this.f3248u;
        if (c0690f1 != null) {
            return c0690f1;
        }
        throw new IllegalStateException(AbstractC1124a.m1191e("Fragment ", this, " not associated with a fragment manager."));
    }

    /* renamed from: u0 */
    public void m1852u0() {
        this.f3250w.m2030y(1);
        if (this.f3216I != null) {
            C0699h2 c0699h2 = this.f3226S;
            c0699h2.m2018c();
            if (c0699h2.f3011c.f3283b.compareTo(EnumC0778g.CREATED) >= 0) {
                this.f3226S.m2019a(EnumC0777f.ON_DESTROY);
            }
        }
        this.f3230c = 1;
        this.f3214G = false;
        mo1096Z();
        if (this.f3214G) {
            C0801d c0801d = ((C0802e) AbstractC0798a.m1800b(this)).f3311b;
            if (c0801d.f3309c.m2606g() <= 0) {
                this.f3246s = false;
                return;
            } else {
                AbstractC0799b abstractC0799b = (AbstractC0799b) c0801d.f3309c.m2605h(0);
                throw null;
            }
        }
        throw new C0747t2(AbstractC1124a.m1191e("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    /* renamed from: v */
    public boolean m1851v() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return false;
        }
        return c0757x.f3188c;
    }

    /* renamed from: v0 */
    public LayoutInflater m1850v0(Bundle bundle) {
        LayoutInflater mo1880b0 = mo1880b0(bundle);
        this.f3222O = mo1880b0;
        return mo1880b0;
    }

    /* renamed from: w */
    public int m1849w() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return 0;
        }
        return c0757x.f3191f;
    }

    /* renamed from: w0 */
    public void m1848w0() {
        onLowMemory();
        this.f3250w.m2037r();
    }

    /* renamed from: x */
    public int m1847x() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return 0;
        }
        return c0757x.f3192g;
    }

    /* renamed from: x0 */
    public void m1846x0(boolean z) {
        m1873f0();
        this.f3250w.m2036s(z);
    }

    /* renamed from: y */
    public Object m1845y() {
        C0757x c0757x = this.f3219L;
        if (c0757x == null) {
            return null;
        }
        Object obj = c0757x.f3197l;
        if (obj == f3207b) {
            m1860p();
            return null;
        }
        return obj;
    }

    /* renamed from: y0 */
    public void m1844y0(boolean z) {
        m1869i0();
        this.f3250w.m2032w(z);
    }

    /* renamed from: z */
    public final Resources m1843z() {
        return m1911B0().getResources();
    }

    /* renamed from: z0 */
    public boolean m1842z0(Menu menu) {
        boolean z = false;
        if (this.f3209B) {
            return false;
        }
        if (this.f3212E && this.f3213F) {
            z = true;
            m1867j0();
        }
        return z | this.f3250w.m2031x(menu);
    }
}