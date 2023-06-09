package p010b.p064l.p066b;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p046j.p058l.p059d1.C0584i;

/* renamed from: b.l.b.c */
/* loaded from: classes.dex */
public class C0658c extends C0584i {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0659d f2856b;

    public C0658c(AbstractC0659d abstractC0659d) {
        this.f2856b = abstractC0659d;
    }

    @Override // p010b.p046j.p058l.p059d1.C0584i
    /* renamed from: a */
    public C0580e mo2155a(int i) {
        return new C0580e(AccessibilityNodeInfo.obtain(this.f2856b.m2148o(i).f2703b));
    }

    @Override // p010b.p046j.p058l.p059d1.C0584i
    /* renamed from: b */
    public C0580e mo2154b(int i) {
        int i2 = i == 2 ? this.f2856b.f2867n : this.f2856b.f2868o;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return new C0580e(AccessibilityNodeInfo.obtain(this.f2856b.m2148o(i2).f2703b));
    }

    @Override // p010b.p046j.p058l.p059d1.C0584i
    /* renamed from: c */
    public boolean mo2153c(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC0659d abstractC0659d = this.f2856b;
        boolean z = false;
        if (i == -1) {
            View view = abstractC0659d.f2865l;
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                z = view.performAccessibilityAction(i2, bundle);
            }
        } else if (i2 == 1) {
            return abstractC0659d.m2147r(i);
        } else {
            if (i2 == 2) {
                return abstractC0659d.m2151k(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? abstractC0659d.mo616p(i, i2, bundle) : abstractC0659d.m2152j(i);
            } else if (abstractC0659d.f2864k.isEnabled() && abstractC0659d.f2864k.isTouchExplorationEnabled() && (i3 = abstractC0659d.f2867n) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    abstractC0659d.m2152j(i3);
                }
                abstractC0659d.f2867n = i;
                abstractC0659d.f2865l.invalidate();
                abstractC0659d.m2146s(i, 32768);
                z = true;
            }
        }
        return z;
    }
}