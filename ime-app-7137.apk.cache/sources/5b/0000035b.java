package p010b.p067m.p068d;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p010b.p046j.p054h.C0529b;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.o2 */
/* loaded from: classes.dex */
public class C0727o2 {

    /* renamed from: a */
    public EnumC0739r2 f3087a;

    /* renamed from: b */
    public EnumC0735q2 f3088b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0763z f3089c;

    /* renamed from: d */
    public final List f3090d;

    /* renamed from: e */
    public final HashSet f3091e;

    /* renamed from: f */
    public boolean f3092f;

    /* renamed from: g */
    public boolean f3093g;

    /* renamed from: h */
    public final C0718m1 f3094h;

    public C0727o2(EnumC0739r2 enumC0739r2, EnumC0735q2 enumC0735q2, C0718m1 c0718m1, C0529b c0529b) {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
        this.f3090d = new ArrayList();
        this.f3091e = new HashSet();
        this.f3092f = false;
        this.f3093g = false;
        this.f3087a = enumC0739r2;
        this.f3088b = enumC0735q2;
        this.f3089c = abstractComponentCallbacksC0763z;
        c0529b.m2349b(new C0731p2(this));
        this.f3094h = c0718m1;
    }

    /* renamed from: a */
    public final void m1975a() {
        if (this.f3092f) {
            return;
        }
        this.f3092f = true;
        if (this.f3091e.isEmpty()) {
            m1974b();
            return;
        }
        Iterator it = new ArrayList(this.f3091e).iterator();
        while (it.hasNext()) {
            ((C0529b) it.next()).m2350a();
        }
    }

    /* renamed from: b */
    public void m1974b() {
        if (!this.f3093g) {
            if (C0690f1.m2078S(2)) {
                String str = "SpecialEffectsController: " + this + " has called complete.";
            }
            this.f3093g = true;
            for (Runnable runnable : this.f3090d) {
                runnable.run();
            }
        }
        this.f3094h.m1997k();
    }

    /* renamed from: c */
    public final void m1973c(EnumC0739r2 enumC0739r2, EnumC0735q2 enumC0735q2) {
        EnumC0735q2 enumC0735q22;
        EnumC0739r2 enumC0739r22 = EnumC0739r2.REMOVED;
        int ordinal = enumC0735q2.ordinal();
        if (ordinal == 0) {
            if (this.f3087a != enumC0739r22) {
                if (C0690f1.m2078S(2)) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("SpecialEffectsController: For fragment ");
                    m1187i.append(this.f3089c);
                    m1187i.append(" mFinalState = ");
                    m1187i.append(this.f3087a);
                    m1187i.append(" -> ");
                    m1187i.append(enumC0739r2);
                    m1187i.append(". ");
                    m1187i.toString();
                }
                this.f3087a = enumC0739r2;
                return;
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            if (C0690f1.m2078S(2)) {
                StringBuilder m1187i2 = AbstractC1124a.m1187i("SpecialEffectsController: For fragment ");
                m1187i2.append(this.f3089c);
                m1187i2.append(" mFinalState = ");
                m1187i2.append(this.f3087a);
                m1187i2.append(" -> REMOVED. mLifecycleImpact  = ");
                m1187i2.append(this.f3088b);
                m1187i2.append(" to REMOVING.");
                m1187i2.toString();
            }
            this.f3087a = enumC0739r22;
            enumC0735q22 = EnumC0735q2.REMOVING;
        } else if (this.f3087a != enumC0739r22) {
            return;
        } else {
            if (C0690f1.m2078S(2)) {
                StringBuilder m1187i3 = AbstractC1124a.m1187i("SpecialEffectsController: For fragment ");
                m1187i3.append(this.f3089c);
                m1187i3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                m1187i3.append(this.f3088b);
                m1187i3.append(" to ADDING.");
                m1187i3.toString();
            }
            this.f3087a = EnumC0739r2.VISIBLE;
            enumC0735q22 = EnumC0735q2.ADDING;
        }
        this.f3088b = enumC0735q22;
    }

    /* renamed from: d */
    public void m1972d() {
        if (this.f3088b == EnumC0735q2.ADDING) {
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3094h.f3061c;
            View findFocus = abstractComponentCallbacksC0763z.f3216I.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC0763z.m1874f().f3200o = findFocus;
                if (C0690f1.m2078S(2)) {
                    String str = "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0763z;
                }
            }
            View m1909C0 = this.f3089c.m1909C0();
            if (m1909C0.getParent() == null) {
                this.f3094h.m2006b();
                m1909C0.setAlpha(0.0f);
            }
            if (m1909C0.getAlpha() == 0.0f && m1909C0.getVisibility() == 0) {
                m1909C0.setVisibility(4);
            }
            C0757x c0757x = abstractComponentCallbacksC0763z.f3219L;
            m1909C0.setAlpha(c0757x == null ? 1.0f : c0757x.f3199n);
        }
    }

    public String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3087a + "} {mLifecycleImpact = " + this.f3088b + "} {mFragment = " + this.f3089c + "}";
    }
}