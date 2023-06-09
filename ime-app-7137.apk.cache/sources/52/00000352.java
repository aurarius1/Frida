package p010b.p067m.p068d;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p067m.AbstractC0666b;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p072o.C0784m;
import p010b.p072o.C0796y;
import p010b.p072o.EnumC0777f;
import p010b.p072o.EnumC0778g;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;
import p010b.p072o.InterfaceC0797z;
import p010b.p085v.C1019f;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.m1 */
/* loaded from: classes.dex */
public class C0718m1 {

    /* renamed from: a */
    public final C0733q0 f3059a;

    /* renamed from: b */
    public final C0722n1 f3060b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0763z f3061c;

    /* renamed from: d */
    public boolean f3062d = false;

    /* renamed from: e */
    public int f3063e = -1;

    public C0718m1(C0733q0 c0733q0, C0722n1 c0722n1, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        this.f3059a = c0733q0;
        this.f3060b = c0722n1;
        this.f3061c = abstractComponentCallbacksC0763z;
    }

    public C0718m1(C0733q0 c0733q0, C0722n1 c0722n1, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, FragmentState fragmentState) {
        this.f3059a = c0733q0;
        this.f3060b = c0722n1;
        this.f3061c = abstractComponentCallbacksC0763z;
        abstractComponentCallbacksC0763z.f3232e = null;
        abstractComponentCallbacksC0763z.f3233f = null;
        abstractComponentCallbacksC0763z.f3247t = 0;
        abstractComponentCallbacksC0763z.f3244q = false;
        abstractComponentCallbacksC0763z.f3241n = false;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = abstractComponentCallbacksC0763z.f3237j;
        abstractComponentCallbacksC0763z.f3238k = abstractComponentCallbacksC0763z2 != null ? abstractComponentCallbacksC0763z2.f3235h : null;
        abstractComponentCallbacksC0763z.f3237j = null;
        Bundle bundle = fragmentState.f549n;
        abstractComponentCallbacksC0763z.f3231d = bundle == null ? new Bundle() : bundle;
    }

    public C0718m1(C0733q0 c0733q0, C0722n1 c0722n1, ClassLoader classLoader, C0752v0 c0752v0, FragmentState fragmentState) {
        this.f3059a = c0733q0;
        this.f3060b = c0722n1;
        AbstractComponentCallbacksC0763z m1936a = c0752v0.m1936a(fragmentState.f537b);
        this.f3061c = m1936a;
        Bundle bundle = fragmentState.f546k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        m1936a.m1901G0(fragmentState.f546k);
        m1936a.f3235h = fragmentState.f538c;
        m1936a.f3243p = fragmentState.f539d;
        m1936a.f3245r = true;
        m1936a.f3252y = fragmentState.f540e;
        m1936a.f3253z = fragmentState.f541f;
        m1936a.f3208A = fragmentState.f542g;
        m1936a.f3211D = fragmentState.f543h;
        m1936a.f3242o = fragmentState.f544i;
        m1936a.f3210C = fragmentState.f545j;
        m1936a.f3209B = fragmentState.f547l;
        m1936a.f3224Q = EnumC0778g.values()[fragmentState.f548m];
        Bundle bundle2 = fragmentState.f549n;
        m1936a.f3231d = bundle2 == null ? new Bundle() : bundle2;
        if (C0690f1.m2078S(2)) {
            AbstractC1124a.m1186j("Instantiated fragment ", m1936a);
        }
    }

    /* renamed from: a */
    public void m2007a() {
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("moveto ACTIVITY_CREATED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        Bundle bundle = abstractComponentCallbacksC0763z.f3231d;
        abstractComponentCallbacksC0763z.f3250w.m2071Z();
        abstractComponentCallbacksC0763z.f3230c = 3;
        abstractComponentCallbacksC0763z.f3214G = false;
        abstractComponentCallbacksC0763z.mo1100N(bundle);
        if (abstractComponentCallbacksC0763z.f3214G) {
            if (C0690f1.m2078S(3)) {
                AbstractC1124a.m1186j("moveto RESTORE_VIEW_STATE: ", abstractComponentCallbacksC0763z);
            }
            View view = abstractComponentCallbacksC0763z.f3216I;
            if (view != null) {
                Bundle bundle2 = abstractComponentCallbacksC0763z.f3231d;
                SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0763z.f3232e;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    abstractComponentCallbacksC0763z.f3232e = null;
                }
                if (abstractComponentCallbacksC0763z.f3216I != null) {
                    C0699h2 c0699h2 = abstractComponentCallbacksC0763z.f3226S;
                    c0699h2.f3012d.m1387a(abstractComponentCallbacksC0763z.f3233f);
                    abstractComponentCallbacksC0763z.f3233f = null;
                }
                abstractComponentCallbacksC0763z.f3214G = false;
                abstractComponentCallbacksC0763z.mo1113r0(bundle2);
                if (!abstractComponentCallbacksC0763z.f3214G) {
                    throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z, " did not call through to super.onViewStateRestored()"));
                }
                if (abstractComponentCallbacksC0763z.f3216I != null) {
                    abstractComponentCallbacksC0763z.f3226S.m2019a(EnumC0777f.ON_CREATE);
                }
            }
            abstractComponentCallbacksC0763z.f3231d = null;
            C0690f1 c0690f1 = abstractComponentCallbacksC0763z.f3250w;
            c0690f1.f2957B = false;
            c0690f1.f2958C = false;
            c0690f1.f2965J.f3025h = false;
            c0690f1.m2030y(4);
            C0733q0 c0733q0 = this.f3059a;
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
            c0733q0.m1967a(abstractComponentCallbacksC0763z2, abstractComponentCallbacksC0763z2.f3231d, false);
            return;
        }
        throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z, " did not call through to super.onActivityCreated()"));
    }

    /* renamed from: b */
    public void m2006b() {
        View view;
        View view2;
        C0722n1 c0722n1 = this.f3060b;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        c0722n1.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0763z.f3215H;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = c0722n1.f3070a.indexOf(abstractComponentCallbacksC0763z);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= c0722n1.f3070a.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = (AbstractComponentCallbacksC0763z) c0722n1.f3070a.get(indexOf);
                        if (abstractComponentCallbacksC0763z2.f3215H == viewGroup && (view = abstractComponentCallbacksC0763z2.f3216I) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = (AbstractComponentCallbacksC0763z) c0722n1.f3070a.get(i2);
                    if (abstractComponentCallbacksC0763z3.f3215H == viewGroup && (view2 = abstractComponentCallbacksC0763z3.f3216I) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = this.f3061c;
        abstractComponentCallbacksC0763z4.f3215H.addView(abstractComponentCallbacksC0763z4.f3216I, i);
    }

    /* renamed from: c */
    public void m2005c() {
        C0718m1 c0718m1;
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("moveto ATTACHED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = abstractComponentCallbacksC0763z.f3237j;
        if (abstractComponentCallbacksC0763z2 != null) {
            c0718m1 = this.f3060b.m1981h(abstractComponentCallbacksC0763z2.f3235h);
            if (c0718m1 == null) {
                StringBuilder m1187i2 = AbstractC1124a.m1187i("Fragment ");
                m1187i2.append(this.f3061c);
                m1187i2.append(" declared target fragment ");
                m1187i2.append(this.f3061c.f3237j);
                m1187i2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(m1187i2.toString());
            }
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
            abstractComponentCallbacksC0763z3.f3238k = abstractComponentCallbacksC0763z3.f3237j.f3235h;
            abstractComponentCallbacksC0763z3.f3237j = null;
        } else {
            String str = abstractComponentCallbacksC0763z.f3238k;
            if (str != null) {
                c0718m1 = this.f3060b.m1981h(str);
                if (c0718m1 == null) {
                    StringBuilder m1187i3 = AbstractC1124a.m1187i("Fragment ");
                    m1187i3.append(this.f3061c);
                    m1187i3.append(" declared target fragment ");
                    m1187i3.append(this.f3061c.f3238k);
                    m1187i3.append(" that does not belong to this FragmentManager!");
                    throw new IllegalStateException(m1187i3.toString());
                }
            } else {
                c0718m1 = null;
            }
        }
        if (c0718m1 != null) {
            c0718m1.m1997k();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = this.f3061c;
        C0690f1 c0690f1 = abstractComponentCallbacksC0763z4.f3248u;
        abstractComponentCallbacksC0763z4.f3249v = c0690f1.f2983q;
        abstractComponentCallbacksC0763z4.f3251x = c0690f1.f2985s;
        this.f3059a.m1961g(abstractComponentCallbacksC0763z4, false);
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = this.f3061c;
        Iterator it = abstractComponentCallbacksC0763z5.f3229V.iterator();
        if (it.hasNext()) {
            AbstractC0760y abstractC0760y = (AbstractC0760y) it.next();
            throw null;
        }
        abstractComponentCallbacksC0763z5.f3229V.clear();
        abstractComponentCallbacksC0763z5.f3250w.m2068b(abstractComponentCallbacksC0763z5.f3249v, abstractComponentCallbacksC0763z5.mo1879c(), abstractComponentCallbacksC0763z5);
        abstractComponentCallbacksC0763z5.f3230c = 0;
        abstractComponentCallbacksC0763z5.f3214G = false;
        abstractComponentCallbacksC0763z5.mo15Q(abstractComponentCallbacksC0763z5.f3249v.f2924c);
        if (abstractComponentCallbacksC0763z5.f3214G) {
            C0690f1 c0690f12 = abstractComponentCallbacksC0763z5.f3248u;
            Iterator it2 = c0690f12.f2981o.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0706j1) it2.next()).mo1915a(c0690f12, abstractComponentCallbacksC0763z5);
            }
            C0690f1 c0690f13 = abstractComponentCallbacksC0763z5.f3250w;
            c0690f13.f2957B = false;
            c0690f13.f2958C = false;
            c0690f13.f2965J.f3025h = false;
            c0690f13.m2030y(0);
            this.f3059a.m1966b(this.f3061c, false);
            return;
        }
        throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z5, " did not call through to super.onAttach()"));
    }

    /* renamed from: d */
    public int m2004d() {
        C0727o2 c0727o2;
        EnumC0735q2 enumC0735q2;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        if (abstractComponentCallbacksC0763z.f3248u == null) {
            return abstractComponentCallbacksC0763z.f3230c;
        }
        int i = this.f3063e;
        int ordinal = abstractComponentCallbacksC0763z.f3224Q.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
        if (abstractComponentCallbacksC0763z2.f3243p) {
            if (abstractComponentCallbacksC0763z2.f3244q) {
                i = Math.max(this.f3063e, 2);
                View view = this.f3061c.f3216I;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f3063e < 4 ? Math.min(i, abstractComponentCallbacksC0763z2.f3230c) : Math.min(i, 1);
            }
        }
        if (!this.f3061c.f3241n) {
            i = Math.min(i, 1);
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
        ViewGroup viewGroup = abstractComponentCallbacksC0763z3.f3215H;
        EnumC0735q2 enumC0735q22 = null;
        if (viewGroup != null) {
            AbstractC0743s2 m1945f = AbstractC0743s2.m1945f(viewGroup, abstractComponentCallbacksC0763z3.m1853u().m2080Q());
            m1945f.getClass();
            C0727o2 m1947d = m1945f.m1947d(this.f3061c);
            if (m1947d != null) {
                enumC0735q2 = m1947d.f3088b;
            } else {
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = this.f3061c;
                Iterator it = m1945f.f3129c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c0727o2 = null;
                        break;
                    }
                    c0727o2 = (C0727o2) it.next();
                    if (c0727o2.f3089c.equals(abstractComponentCallbacksC0763z4) && !c0727o2.f3092f) {
                        break;
                    }
                }
                if (c0727o2 != null) {
                    enumC0735q2 = c0727o2.f3088b;
                }
            }
            enumC0735q22 = enumC0735q2;
        }
        if (enumC0735q22 == EnumC0735q2.ADDING) {
            i = Math.min(i, 6);
        } else if (enumC0735q22 == EnumC0735q2.REMOVING) {
            i = Math.max(i, 3);
        } else {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = this.f3061c;
            if (abstractComponentCallbacksC0763z5.f3242o) {
                i = abstractComponentCallbacksC0763z5.m1898I() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z6 = this.f3061c;
        if (abstractComponentCallbacksC0763z6.f3217J && abstractComponentCallbacksC0763z6.f3230c < 5) {
            i = Math.min(i, 4);
        }
        if (C0690f1.m2078S(2)) {
            String str = "computeExpectedState() of " + i + " for " + this.f3061c;
        }
        return i;
    }

    /* renamed from: e */
    public void m2003e() {
        Parcelable parcelable;
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("moveto CREATED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        if (!abstractComponentCallbacksC0763z.f3223P) {
            this.f3059a.m1960h(abstractComponentCallbacksC0763z, abstractComponentCallbacksC0763z.f3231d, false);
            final AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
            Bundle bundle = abstractComponentCallbacksC0763z2.f3231d;
            abstractComponentCallbacksC0763z2.f3250w.m2071Z();
            abstractComponentCallbacksC0763z2.f3230c = 1;
            abstractComponentCallbacksC0763z2.f3214G = false;
            if (Build.VERSION.SDK_INT >= 19) {
                abstractComponentCallbacksC0763z2.f3225R.mo1824a(new InterfaceC0780i() { // from class: androidx.fragment.app.Fragment$5
                    @Override // p010b.p072o.InterfaceC0780i
                    /* renamed from: d */
                    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
                        View view;
                        if (enumC0777f != EnumC0777f.ON_STOP || (view = AbstractComponentCallbacksC0763z.this.f3216I) == null) {
                            return;
                        }
                        view.cancelPendingInputEvents();
                    }
                });
            }
            abstractComponentCallbacksC0763z2.f3228U.m1387a(bundle);
            abstractComponentCallbacksC0763z2.mo523T(bundle);
            abstractComponentCallbacksC0763z2.f3223P = true;
            if (abstractComponentCallbacksC0763z2.f3214G) {
                abstractComponentCallbacksC0763z2.f3225R.m1821d(EnumC0777f.ON_CREATE);
                C0733q0 c0733q0 = this.f3059a;
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
                c0733q0.m1965c(abstractComponentCallbacksC0763z3, abstractComponentCallbacksC0763z3.f3231d, false);
                return;
            }
            throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z2, " did not call through to super.onCreate()"));
        }
        Bundle bundle2 = abstractComponentCallbacksC0763z.f3231d;
        if (bundle2 != null && (parcelable = bundle2.getParcelable("android:support:fragments")) != null) {
            abstractComponentCallbacksC0763z.f3250w.m2057g0(parcelable);
            abstractComponentCallbacksC0763z.f3250w.m2042o();
        }
        this.f3061c.f3230c = 1;
    }

    /* renamed from: f */
    public void m2002f() {
        String str;
        if (this.f3061c.f3243p) {
            return;
        }
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("moveto CREATE_VIEW: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        LayoutInflater m1850v0 = abstractComponentCallbacksC0763z.m1850v0(abstractComponentCallbacksC0763z.f3231d);
        ViewGroup viewGroup = null;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0763z2.f3215H;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC0763z2.f3253z;
            if (i != 0) {
                if (i == -1) {
                    StringBuilder m1187i2 = AbstractC1124a.m1187i("Cannot create fragment ");
                    m1187i2.append(this.f3061c);
                    m1187i2.append(" for a container view with no id");
                    throw new IllegalArgumentException(m1187i2.toString());
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0763z2.f3248u.f2984r.mo1933c(i);
                if (viewGroup == null) {
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
                    if (!abstractComponentCallbacksC0763z3.f3245r) {
                        try {
                            str = abstractComponentCallbacksC0763z3.m1843z().getResourceName(this.f3061c.f3253z);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        StringBuilder m1187i3 = AbstractC1124a.m1187i("No view found for id 0x");
                        m1187i3.append(Integer.toHexString(this.f3061c.f3253z));
                        m1187i3.append(" (");
                        m1187i3.append(str);
                        m1187i3.append(") for fragment ");
                        m1187i3.append(this.f3061c);
                        throw new IllegalArgumentException(m1187i3.toString());
                    }
                }
            }
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = this.f3061c;
        abstractComponentCallbacksC0763z4.f3215H = viewGroup;
        abstractComponentCallbacksC0763z4.mo1854t0(m1850v0, viewGroup, abstractComponentCallbacksC0763z4.f3231d);
        View view = this.f3061c.f3216I;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = this.f3061c;
            abstractComponentCallbacksC0763z5.f3216I.setTag(AbstractC0666b.fragment_container_view_tag, abstractComponentCallbacksC0763z5);
            if (viewGroup != null) {
                m2006b();
            }
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z6 = this.f3061c;
            if (abstractComponentCallbacksC0763z6.f3209B) {
                abstractComponentCallbacksC0763z6.f3216I.setVisibility(8);
            }
            if (AbstractC0605j0.m2233y(this.f3061c.f3216I)) {
                AbstractC0605j0.m2271L(this.f3061c.f3216I);
            } else {
                View view2 = this.f3061c.f3216I;
                view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0714l1(this, view2));
            }
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z7 = this.f3061c;
            abstractComponentCallbacksC0763z7.mo1080q0(abstractComponentCallbacksC0763z7.f3216I, abstractComponentCallbacksC0763z7.f3231d);
            abstractComponentCallbacksC0763z7.f3250w.m2030y(2);
            C0733q0 c0733q0 = this.f3059a;
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z8 = this.f3061c;
            c0733q0.m1955m(abstractComponentCallbacksC0763z8, abstractComponentCallbacksC0763z8.f3216I, abstractComponentCallbacksC0763z8.f3231d, false);
            int visibility = this.f3061c.f3216I.getVisibility();
            this.f3061c.m1874f().f3199n = this.f3061c.f3216I.getAlpha();
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z9 = this.f3061c;
            if (abstractComponentCallbacksC0763z9.f3215H != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0763z9.f3216I.findFocus();
                if (findFocus != null) {
                    this.f3061c.m1874f().f3200o = findFocus;
                    if (C0690f1.m2078S(2)) {
                        String str2 = "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3061c;
                    }
                }
                this.f3061c.f3216I.setAlpha(0.0f);
            }
        }
        this.f3061c.f3230c = 2;
    }

    /* renamed from: g */
    public void m2001g() {
        AbstractComponentCallbacksC0763z m1985d;
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("movefrom CREATED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        boolean z = true;
        boolean z2 = abstractComponentCallbacksC0763z.f3242o && !abstractComponentCallbacksC0763z.m1898I();
        if (z2 || this.f3060b.f3072c.m2016c(this.f3061c)) {
            C0677c0 c0677c0 = this.f3061c.f3249v;
            if (c0677c0 instanceof InterfaceC0797z) {
                z = this.f3060b.f3072c.f3024g;
            } else {
                Context context = c0677c0.f2924c;
                if (context instanceof Activity) {
                    z = true ^ ((Activity) context).isChangingConfigurations();
                }
            }
            if (z2 || z) {
                C0702i1 c0702i1 = this.f3060b.f3072c;
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
                c0702i1.getClass();
                if (C0690f1.m2078S(3)) {
                    AbstractC1124a.m1186j("Clearing non-config state for ", abstractComponentCallbacksC0763z2);
                }
                C0702i1 c0702i12 = (C0702i1) c0702i1.f3021d.get(abstractComponentCallbacksC0763z2.f3235h);
                if (c0702i12 != null) {
                    c0702i12.mo1799a();
                    c0702i1.f3021d.remove(abstractComponentCallbacksC0763z2.f3235h);
                }
                C0796y c0796y = (C0796y) c0702i1.f3022e.get(abstractComponentCallbacksC0763z2.f3235h);
                if (c0796y != null) {
                    c0796y.m1802a();
                    c0702i1.f3022e.remove(abstractComponentCallbacksC0763z2.f3235h);
                }
            }
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
            abstractComponentCallbacksC0763z3.f3250w.m2038q();
            abstractComponentCallbacksC0763z3.f3225R.m1821d(EnumC0777f.ON_DESTROY);
            abstractComponentCallbacksC0763z3.f3230c = 0;
            abstractComponentCallbacksC0763z3.f3214G = false;
            abstractComponentCallbacksC0763z3.f3223P = false;
            abstractComponentCallbacksC0763z3.mo1098Y();
            if (abstractComponentCallbacksC0763z3.f3214G) {
                this.f3059a.m1964d(this.f3061c, false);
                Iterator it = ((ArrayList) this.f3060b.m1983f()).iterator();
                while (it.hasNext()) {
                    C0718m1 c0718m1 = (C0718m1) it.next();
                    if (c0718m1 != null) {
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = c0718m1.f3061c;
                        if (this.f3061c.f3235h.equals(abstractComponentCallbacksC0763z4.f3238k)) {
                            abstractComponentCallbacksC0763z4.f3237j = this.f3061c;
                            abstractComponentCallbacksC0763z4.f3238k = null;
                        }
                    }
                }
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = this.f3061c;
                String str = abstractComponentCallbacksC0763z5.f3238k;
                if (str != null) {
                    abstractComponentCallbacksC0763z5.f3237j = this.f3060b.m1985d(str);
                }
                this.f3060b.m1978k(this);
                return;
            }
            throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z3, " did not call through to super.onDestroy()"));
        }
        String str2 = this.f3061c.f3238k;
        if (str2 != null && (m1985d = this.f3060b.m1985d(str2)) != null && m1985d.f3211D) {
            this.f3061c.f3237j = m1985d;
        }
        this.f3061c.f3230c = 0;
    }

    /* renamed from: h */
    public void m2000h() {
        View view;
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("movefrom CREATE_VIEW: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        ViewGroup viewGroup = abstractComponentCallbacksC0763z.f3215H;
        if (viewGroup != null && (view = abstractComponentCallbacksC0763z.f3216I) != null) {
            viewGroup.removeView(view);
        }
        this.f3061c.m1852u0();
        this.f3059a.m1954n(this.f3061c, false);
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
        abstractComponentCallbacksC0763z2.f3215H = null;
        abstractComponentCallbacksC0763z2.f3216I = null;
        abstractComponentCallbacksC0763z2.f3226S = null;
        abstractComponentCallbacksC0763z2.f3227T.m1806e(null);
        this.f3061c.f3244q = false;
    }

    /* renamed from: i */
    public void m1999i() {
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("movefrom ATTACHED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        abstractComponentCallbacksC0763z.f3230c = -1;
        abstractComponentCallbacksC0763z.f3214G = false;
        abstractComponentCallbacksC0763z.mo13a0();
        abstractComponentCallbacksC0763z.f3222O = null;
        if (abstractComponentCallbacksC0763z.f3214G) {
            C0690f1 c0690f1 = abstractComponentCallbacksC0763z.f3250w;
            if (!c0690f1.f2959D) {
                c0690f1.m2038q();
                abstractComponentCallbacksC0763z.f3250w = new C0690f1();
            }
            this.f3059a.m1963e(this.f3061c, false);
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
            abstractComponentCallbacksC0763z2.f3230c = -1;
            abstractComponentCallbacksC0763z2.f3249v = null;
            abstractComponentCallbacksC0763z2.f3251x = null;
            abstractComponentCallbacksC0763z2.f3248u = null;
            if ((abstractComponentCallbacksC0763z2.f3242o && !abstractComponentCallbacksC0763z2.m1898I()) || this.f3060b.f3072c.m2016c(this.f3061c)) {
                if (C0690f1.m2078S(3)) {
                    StringBuilder m1187i2 = AbstractC1124a.m1187i("initState called for fragment: ");
                    m1187i2.append(this.f3061c);
                    m1187i2.toString();
                }
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
                abstractComponentCallbacksC0763z3.getClass();
                abstractComponentCallbacksC0763z3.f3225R = new C0784m(abstractComponentCallbacksC0763z3);
                abstractComponentCallbacksC0763z3.f3228U = new C1019f(abstractComponentCallbacksC0763z3);
                abstractComponentCallbacksC0763z3.f3235h = UUID.randomUUID().toString();
                abstractComponentCallbacksC0763z3.f3241n = false;
                abstractComponentCallbacksC0763z3.f3242o = false;
                abstractComponentCallbacksC0763z3.f3243p = false;
                abstractComponentCallbacksC0763z3.f3244q = false;
                abstractComponentCallbacksC0763z3.f3245r = false;
                abstractComponentCallbacksC0763z3.f3247t = 0;
                abstractComponentCallbacksC0763z3.f3248u = null;
                abstractComponentCallbacksC0763z3.f3250w = new C0690f1();
                abstractComponentCallbacksC0763z3.f3249v = null;
                abstractComponentCallbacksC0763z3.f3252y = 0;
                abstractComponentCallbacksC0763z3.f3253z = 0;
                abstractComponentCallbacksC0763z3.f3208A = null;
                abstractComponentCallbacksC0763z3.f3209B = false;
                abstractComponentCallbacksC0763z3.f3210C = false;
                return;
            }
            return;
        }
        throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z, " did not call through to super.onDetach()"));
    }

    /* renamed from: j */
    public void m1998j() {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        if (abstractComponentCallbacksC0763z.f3243p && abstractComponentCallbacksC0763z.f3244q && !abstractComponentCallbacksC0763z.f3246s) {
            if (C0690f1.m2078S(3)) {
                StringBuilder m1187i = AbstractC1124a.m1187i("moveto CREATE_VIEW: ");
                m1187i.append(this.f3061c);
                m1187i.toString();
            }
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
            abstractComponentCallbacksC0763z2.mo1854t0(abstractComponentCallbacksC0763z2.m1850v0(abstractComponentCallbacksC0763z2.f3231d), null, this.f3061c.f3231d);
            View view = this.f3061c.f3216I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
                abstractComponentCallbacksC0763z3.f3216I.setTag(AbstractC0666b.fragment_container_view_tag, abstractComponentCallbacksC0763z3);
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = this.f3061c;
                if (abstractComponentCallbacksC0763z4.f3209B) {
                    abstractComponentCallbacksC0763z4.f3216I.setVisibility(8);
                }
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = this.f3061c;
                abstractComponentCallbacksC0763z5.mo1080q0(abstractComponentCallbacksC0763z5.f3216I, abstractComponentCallbacksC0763z5.f3231d);
                abstractComponentCallbacksC0763z5.f3250w.m2030y(2);
                C0733q0 c0733q0 = this.f3059a;
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z6 = this.f3061c;
                c0733q0.m1955m(abstractComponentCallbacksC0763z6, abstractComponentCallbacksC0763z6.f3216I, abstractComponentCallbacksC0763z6.f3231d, false);
                this.f3061c.f3230c = 2;
            }
        }
    }

    /* renamed from: k */
    public void m1997k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        EnumC0735q2 enumC0735q2 = EnumC0735q2.NONE;
        if (this.f3062d) {
            if (C0690f1.m2078S(2)) {
                StringBuilder m1187i = AbstractC1124a.m1187i("Ignoring re-entrant call to moveToExpectedState() for ");
                m1187i.append(this.f3061c);
                m1187i.toString();
                return;
            }
            return;
        }
        try {
            this.f3062d = true;
            while (true) {
                int m2004d = m2004d();
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
                int i = abstractComponentCallbacksC0763z.f3230c;
                if (m2004d == i) {
                    if (abstractComponentCallbacksC0763z.f3220M) {
                        if (abstractComponentCallbacksC0763z.f3216I != null && (viewGroup = abstractComponentCallbacksC0763z.f3215H) != null) {
                            AbstractC0743s2 m1945f = AbstractC0743s2.m1945f(viewGroup, abstractComponentCallbacksC0763z.m1853u().m2080Q());
                            if (this.f3061c.f3209B) {
                                m1945f.getClass();
                                if (C0690f1.m2078S(2)) {
                                    String str = "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f3061c;
                                }
                                m1945f.m1950a(EnumC0739r2.GONE, enumC0735q2, this);
                            } else {
                                m1945f.getClass();
                                if (C0690f1.m2078S(2)) {
                                    String str2 = "SpecialEffectsController: Enqueuing show operation for fragment " + this.f3061c;
                                }
                                m1945f.m1950a(EnumC0739r2.VISIBLE, enumC0735q2, this);
                            }
                        }
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
                        C0690f1 c0690f1 = abstractComponentCallbacksC0763z2.f3248u;
                        if (c0690f1 != null && abstractComponentCallbacksC0763z2.f3241n && c0690f1.m2077T(abstractComponentCallbacksC0763z2)) {
                            c0690f1.f2956A = true;
                        }
                        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
                        abstractComponentCallbacksC0763z3.f3220M = false;
                        abstractComponentCallbacksC0763z3.m1878c0();
                    }
                    return;
                } else if (m2004d > i) {
                    switch (i + 1) {
                        case 0:
                            m2005c();
                            continue;
                        case 1:
                            m2003e();
                            continue;
                        case 2:
                            m1998j();
                            m2002f();
                            continue;
                        case 3:
                            m2007a();
                            continue;
                        case 4:
                            if (abstractComponentCallbacksC0763z.f3216I != null && (viewGroup2 = abstractComponentCallbacksC0763z.f3215H) != null) {
                                AbstractC0743s2 m1945f2 = AbstractC0743s2.m1945f(viewGroup2, abstractComponentCallbacksC0763z.m1853u().m2080Q());
                                EnumC0739r2 m1952b = EnumC0739r2.m1952b(this.f3061c.f3216I.getVisibility());
                                m1945f2.getClass();
                                if (C0690f1.m2078S(2)) {
                                    String str3 = "SpecialEffectsController: Enqueuing add operation for fragment " + this.f3061c;
                                }
                                m1945f2.m1950a(m1952b, EnumC0735q2.ADDING, this);
                            }
                            this.f3061c.f3230c = 4;
                            continue;
                        case 5:
                            m1992p();
                            continue;
                        case 6:
                            abstractComponentCallbacksC0763z.f3230c = 6;
                            continue;
                        case 7:
                            m1994n();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            m1999i();
                            continue;
                        case 0:
                            m2001g();
                            continue;
                        case 1:
                            m2000h();
                            this.f3061c.f3230c = 1;
                            continue;
                        case 2:
                            abstractComponentCallbacksC0763z.f3244q = false;
                            abstractComponentCallbacksC0763z.f3230c = 2;
                            continue;
                        case 3:
                            if (C0690f1.m2078S(3)) {
                                String str4 = "movefrom ACTIVITY_CREATED: " + this.f3061c;
                            }
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = this.f3061c;
                            if (abstractComponentCallbacksC0763z4.f3216I != null && abstractComponentCallbacksC0763z4.f3232e == null) {
                                m1993o();
                            }
                            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = this.f3061c;
                            if (abstractComponentCallbacksC0763z5.f3216I != null && (viewGroup3 = abstractComponentCallbacksC0763z5.f3215H) != null) {
                                AbstractC0743s2 m1945f3 = AbstractC0743s2.m1945f(viewGroup3, abstractComponentCallbacksC0763z5.m1853u().m2080Q());
                                m1945f3.getClass();
                                if (C0690f1.m2078S(2)) {
                                    String str5 = "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f3061c;
                                }
                                m1945f3.m1950a(EnumC0739r2.REMOVED, EnumC0735q2.REMOVING, this);
                            }
                            this.f3061c.f3230c = 3;
                            continue;
                        case 4:
                            m1991q();
                            continue;
                        case 5:
                            abstractComponentCallbacksC0763z.f3230c = 5;
                            continue;
                        case 6:
                            m1996l();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.f3062d = false;
        }
    }

    /* renamed from: l */
    public void m1996l() {
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("movefrom RESUMED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        abstractComponentCallbacksC0763z.f3250w.m2030y(5);
        if (abstractComponentCallbacksC0763z.f3216I != null) {
            abstractComponentCallbacksC0763z.f3226S.m2019a(EnumC0777f.ON_PAUSE);
        }
        abstractComponentCallbacksC0763z.f3225R.m1821d(EnumC0777f.ON_PAUSE);
        abstractComponentCallbacksC0763z.f3230c = 6;
        abstractComponentCallbacksC0763z.f3214G = false;
        abstractComponentCallbacksC0763z.f3214G = true;
        this.f3059a.m1962f(this.f3061c, false);
    }

    /* renamed from: m */
    public void m1995m(ClassLoader classLoader) {
        Bundle bundle = this.f3061c.f3231d;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        abstractComponentCallbacksC0763z.f3232e = abstractComponentCallbacksC0763z.f3231d.getSparseParcelableArray("android:view_state");
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
        abstractComponentCallbacksC0763z2.f3233f = abstractComponentCallbacksC0763z2.f3231d.getBundle("android:view_registry_state");
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
        abstractComponentCallbacksC0763z3.f3238k = abstractComponentCallbacksC0763z3.f3231d.getString("android:target_state");
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z4 = this.f3061c;
        if (abstractComponentCallbacksC0763z4.f3238k != null) {
            abstractComponentCallbacksC0763z4.f3239l = abstractComponentCallbacksC0763z4.f3231d.getInt("android:target_req_state", 0);
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z5 = this.f3061c;
        Boolean bool = abstractComponentCallbacksC0763z5.f3234g;
        if (bool != null) {
            abstractComponentCallbacksC0763z5.f3218K = bool.booleanValue();
            this.f3061c.f3234g = null;
        } else {
            abstractComponentCallbacksC0763z5.f3218K = abstractComponentCallbacksC0763z5.f3231d.getBoolean("android:user_visible_hint", true);
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z6 = this.f3061c;
        if (abstractComponentCallbacksC0763z6.f3218K) {
            return;
        }
        abstractComponentCallbacksC0763z6.f3217J = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1994n() {
        boolean z;
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("moveto RESUMED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        C0757x c0757x = abstractComponentCallbacksC0763z.f3219L;
        View view = c0757x == null ? null : c0757x.f3200o;
        if (view != null) {
            if (view != abstractComponentCallbacksC0763z.f3216I) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != this.f3061c.f3216I) {
                    }
                }
                z = false;
                if (z) {
                    boolean requestFocus = view.requestFocus();
                    if (C0690f1.m2078S(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Restoring focused view ");
                        sb.append(view);
                        sb.append(" ");
                        sb.append(requestFocus ? "succeeded" : "failed");
                        sb.append(" on Fragment ");
                        sb.append(this.f3061c);
                        sb.append(" resulting in focused view ");
                        sb.append(this.f3061c.f3216I.findFocus());
                        sb.toString();
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
        this.f3061c.m1899H0(null);
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f3061c;
        abstractComponentCallbacksC0763z2.f3250w.m2071Z();
        abstractComponentCallbacksC0763z2.f3250w.m2092E(true);
        abstractComponentCallbacksC0763z2.f3230c = 7;
        abstractComponentCallbacksC0763z2.f3214G = false;
        abstractComponentCallbacksC0763z2.mo1103m0();
        if (abstractComponentCallbacksC0763z2.f3214G) {
            C0784m c0784m = abstractComponentCallbacksC0763z2.f3225R;
            EnumC0777f enumC0777f = EnumC0777f.ON_RESUME;
            c0784m.m1821d(enumC0777f);
            if (abstractComponentCallbacksC0763z2.f3216I != null) {
                abstractComponentCallbacksC0763z2.f3226S.m2019a(enumC0777f);
            }
            C0690f1 c0690f1 = abstractComponentCallbacksC0763z2.f3250w;
            c0690f1.f2957B = false;
            c0690f1.f2958C = false;
            c0690f1.f2965J.f3025h = false;
            c0690f1.m2030y(7);
            this.f3059a.m1959i(this.f3061c, false);
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z3 = this.f3061c;
            abstractComponentCallbacksC0763z3.f3231d = null;
            abstractComponentCallbacksC0763z3.f3232e = null;
            abstractComponentCallbacksC0763z3.f3233f = null;
            return;
        }
        throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z2, " did not call through to super.onResume()"));
    }

    /* renamed from: o */
    public void m1993o() {
        if (this.f3061c.f3216I == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3061c.f3216I.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3061c.f3232e = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3061c.f3226S.f3012d.m1386b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3061c.f3233f = bundle;
    }

    /* renamed from: p */
    public void m1992p() {
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("moveto STARTED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        abstractComponentCallbacksC0763z.f3250w.m2071Z();
        abstractComponentCallbacksC0763z.f3250w.m2092E(true);
        abstractComponentCallbacksC0763z.f3230c = 5;
        abstractComponentCallbacksC0763z.f3214G = false;
        abstractComponentCallbacksC0763z.mo527o0();
        if (abstractComponentCallbacksC0763z.f3214G) {
            C0784m c0784m = abstractComponentCallbacksC0763z.f3225R;
            EnumC0777f enumC0777f = EnumC0777f.ON_START;
            c0784m.m1821d(enumC0777f);
            if (abstractComponentCallbacksC0763z.f3216I != null) {
                abstractComponentCallbacksC0763z.f3226S.m2019a(enumC0777f);
            }
            C0690f1 c0690f1 = abstractComponentCallbacksC0763z.f3250w;
            c0690f1.f2957B = false;
            c0690f1.f2958C = false;
            c0690f1.f2965J.f3025h = false;
            c0690f1.m2030y(5);
            this.f3059a.m1957k(this.f3061c, false);
            return;
        }
        throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z, " did not call through to super.onStart()"));
    }

    /* renamed from: q */
    public void m1991q() {
        if (C0690f1.m2078S(3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("movefrom STARTED: ");
            m1187i.append(this.f3061c);
            m1187i.toString();
        }
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3061c;
        C0690f1 c0690f1 = abstractComponentCallbacksC0763z.f3250w;
        c0690f1.f2958C = true;
        c0690f1.f2965J.f3025h = true;
        c0690f1.m2030y(4);
        if (abstractComponentCallbacksC0763z.f3216I != null) {
            abstractComponentCallbacksC0763z.f3226S.m2019a(EnumC0777f.ON_STOP);
        }
        abstractComponentCallbacksC0763z.f3225R.m1821d(EnumC0777f.ON_STOP);
        abstractComponentCallbacksC0763z.f3230c = 4;
        abstractComponentCallbacksC0763z.f3214G = false;
        abstractComponentCallbacksC0763z.mo526p0();
        if (abstractComponentCallbacksC0763z.f3214G) {
            this.f3059a.m1956l(this.f3061c, false);
            return;
        }
        throw new C0747t2(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z, " did not call through to super.onStop()"));
    }
}