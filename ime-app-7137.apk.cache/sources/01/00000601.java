package p093c.p097b.p108i0.p110p.p113z1;

import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0668a;
import p010b.p067m.p068d.C0690f1;
import p010b.p067m.p068d.C0726o1;
import p010b.p091z.p092a.AbstractC1110a;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.i0.p.z1.q */
/* loaded from: classes.dex */
public class C1405q extends AbstractC1110a {

    /* renamed from: c */
    public final C0690f1 f4647c;

    /* renamed from: d */
    public C0668a f4648d = null;

    /* renamed from: e */
    public AbstractComponentCallbacksC0763z f4649e = null;

    /* renamed from: f */
    public boolean f4650f;

    /* renamed from: g */
    public final List f4651g;

    public C1405q(C0690f1 c0690f1, boolean z) {
        this.f4647c = c0690f1;
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new View$OnClickListenerC1404p());
        arrayList.add(new C1400l());
        arrayList.add(new C1402n());
        if (Build.VERSION.SDK_INT >= 23) {
            arrayList.add(new View$OnClickListenerC1406r());
        }
        if (z) {
            arrayList.add(new C1394f());
        }
        arrayList.add(new View$OnClickListenerC1396h());
        this.f4651g = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: l */
    public static String m1085l(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: a */
    public void mo1095a(ViewGroup viewGroup, int i, Object obj) {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractComponentCallbacksC0763z) obj;
        if (this.f4648d == null) {
            this.f4648d = new C0668a(this.f4647c);
        }
        C0668a c0668a = this.f4648d;
        c0668a.getClass();
        C0690f1 c0690f1 = abstractComponentCallbacksC0763z.f3248u;
        if (c0690f1 != null && c0690f1 != c0668a.f2913q) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            m1187i.append(abstractComponentCallbacksC0763z.toString());
            m1187i.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(m1187i.toString());
        }
        c0668a.m2122b(new C0726o1(6, abstractComponentCallbacksC0763z));
        if (abstractComponentCallbacksC0763z.equals(this.f4649e)) {
            this.f4649e = null;
        }
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: b */
    public void mo1094b(ViewGroup viewGroup) {
        C0668a c0668a = this.f4648d;
        if (c0668a != null) {
            if (!this.f4650f) {
                try {
                    this.f4650f = true;
                    c0668a.m2117g();
                } finally {
                    this.f4650f = false;
                }
            }
            this.f4648d = null;
        }
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: c */
    public int mo1093c() {
        return this.f4651g.size();
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: d */
    public int mo1092d(Object obj) {
        return -2;
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: f */
    public Object mo1091f(ViewGroup viewGroup, int i) {
        if (this.f4648d == null) {
            this.f4648d = new C0668a(this.f4647c);
        }
        long j = i;
        AbstractComponentCallbacksC0763z m2086K = this.f4647c.m2086K(m1085l(viewGroup.getId(), j));
        if (m2086K != null) {
            this.f4648d.m2122b(new C0726o1(7, m2086K));
        } else {
            m2086K = (AbstractComponentCallbacksC0763z) this.f4651g.get(i);
            this.f4648d.m2116h(viewGroup.getId(), m2086K, m1085l(viewGroup.getId(), j), 1);
        }
        if (m2086K != this.f4649e) {
            m2086K.m1893K0(false);
            m2086K.m1888N0(false);
        }
        return m2086K;
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: g */
    public boolean mo1090g(View view, Object obj) {
        return ((AbstractComponentCallbacksC0763z) obj).f3216I == view;
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: h */
    public void mo1089h(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: i */
    public /* bridge */ /* synthetic */ Parcelable mo1088i() {
        return null;
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: j */
    public void mo1087j(ViewGroup viewGroup, int i, Object obj) {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractComponentCallbacksC0763z) obj;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = this.f4649e;
        if (abstractComponentCallbacksC0763z != abstractComponentCallbacksC0763z2) {
            if (abstractComponentCallbacksC0763z2 != null) {
                abstractComponentCallbacksC0763z2.m1893K0(false);
                this.f4649e.m1888N0(false);
            }
            abstractComponentCallbacksC0763z.m1893K0(true);
            abstractComponentCallbacksC0763z.m1888N0(true);
            this.f4649e = abstractComponentCallbacksC0763z;
        }
    }

    @Override // p010b.p091z.p092a.AbstractC1110a
    /* renamed from: k */
    public void mo1086k(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}