package p010b.p046j.p058l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p050f.C0507b;

/* renamed from: b.j.l.c1 */
/* loaded from: classes.dex */
public class C0573c1 {

    /* renamed from: a */
    public static final C0573c1 f2675a;

    /* renamed from: b */
    public final C0570b1 f2676b;

    static {
        f2675a = Build.VERSION.SDK_INT >= 30 ? C0567a1.f2660o : C0570b1.f2664a;
    }

    public C0573c1(WindowInsets windowInsets) {
        C0570b1 c0631w0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c0631w0 = new C0567a1(this, windowInsets);
        } else if (i >= 29) {
            c0631w0 = new C0637z0(this, windowInsets);
        } else if (i >= 28) {
            c0631w0 = new C0635y0(this, windowInsets);
        } else if (i >= 21) {
            c0631w0 = new C0633x0(this, windowInsets);
        } else if (i < 20) {
            this.f2676b = new C0570b1(this);
            return;
        } else {
            c0631w0 = new C0631w0(this, windowInsets);
        }
        this.f2676b = c0631w0;
    }

    public C0573c1(C0573c1 c0573c1) {
        this.f2676b = new C0570b1(this);
    }

    /* renamed from: e */
    public static C0507b m2322e(C0507b c0507b, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c0507b.f2542b - i);
        int max2 = Math.max(0, c0507b.f2543c - i2);
        int max3 = Math.max(0, c0507b.f2544d - i3);
        int max4 = Math.max(0, c0507b.f2545e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c0507b : C0507b.m2385a(max, max2, max3, max4);
    }

    /* renamed from: i */
    public static C0573c1 m2318i(WindowInsets windowInsets) {
        return m2317j(windowInsets, null);
    }

    /* renamed from: j */
    public static C0573c1 m2317j(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C0573c1 c0573c1 = new C0573c1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c0573c1.f2676b.mo2188m(AbstractC0605j0.m2236v(view));
            c0573c1.f2676b.mo2192d(view.getRootView());
        }
        return c0573c1;
    }

    @Deprecated
    /* renamed from: a */
    public int m2326a() {
        return this.f2676b.mo2191h().f2545e;
    }

    @Deprecated
    /* renamed from: b */
    public int m2325b() {
        return this.f2676b.mo2191h().f2542b;
    }

    @Deprecated
    /* renamed from: c */
    public int m2324c() {
        return this.f2676b.mo2191h().f2544d;
    }

    @Deprecated
    /* renamed from: d */
    public int m2323d() {
        return this.f2676b.mo2191h().f2543c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0573c1) {
            return AbstractC0022t.m3463w(this.f2676b, ((C0573c1) obj).f2676b);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m2321f() {
        return this.f2676b.mo2180j();
    }

    @Deprecated
    /* renamed from: g */
    public C0573c1 m2320g(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        C0629v0 c0627u0 = i5 >= 30 ? new C0627u0(this) : i5 >= 29 ? new C0625t0(this) : i5 >= 20 ? new C0623s0(this) : new C0629v0(this);
        c0627u0.mo2193d(C0507b.m2385a(i, i2, i3, i4));
        return c0627u0.mo2195b();
    }

    /* renamed from: h */
    public WindowInsets m2319h() {
        C0570b1 c0570b1 = this.f2676b;
        if (c0570b1 instanceof C0631w0) {
            return ((C0631w0) c0570b1).f2802i;
        }
        return null;
    }

    public int hashCode() {
        C0570b1 c0570b1 = this.f2676b;
        if (c0570b1 == null) {
            return 0;
        }
        return c0570b1.hashCode();
    }
}