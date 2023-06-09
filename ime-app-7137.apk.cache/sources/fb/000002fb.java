package p010b.p046j.p058l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000a.p001a.p002a.p004b.C0021s;
import p010b.p046j.p050f.C0507b;

/* renamed from: b.j.l.w0 */
/* loaded from: classes.dex */
public class C0631w0 extends C0570b1 {

    /* renamed from: c */
    public static boolean f2796c = false;

    /* renamed from: d */
    public static Method f2797d;

    /* renamed from: e */
    public static Class f2798e;

    /* renamed from: f */
    public static Class f2799f;

    /* renamed from: g */
    public static Field f2800g;

    /* renamed from: h */
    public static Field f2801h;

    /* renamed from: i */
    public final WindowInsets f2802i;

    /* renamed from: j */
    public C0507b f2803j;

    /* renamed from: k */
    public C0573c1 f2804k;

    /* renamed from: l */
    public C0507b f2805l;

    public C0631w0(C0573c1 c0573c1, WindowInsets windowInsets) {
        super(c0573c1);
        this.f2803j = null;
        this.f2802i = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: p */
    public static void m2186p() {
        try {
            f2797d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            f2798e = Class.forName("android.view.ViewRootImpl");
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2799f = cls;
            f2800g = cls.getDeclaredField("mVisibleInsets");
            f2801h = f2798e.getDeclaredField("mAttachInfo");
            f2800g.setAccessible(true);
            f2801h.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f2796c = true;
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: d */
    public void mo2192d(View view) {
        C0507b m2187o = m2187o(view);
        if (m2187o == null) {
            m2187o = C0507b.f2541a;
        }
        m2185q(m2187o);
    }

    @Override // p010b.p046j.p058l.C0570b1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return C0021s.m3534a(this.f2805l, ((C0631w0) obj).f2805l);
        }
        return false;
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: h */
    public final C0507b mo2191h() {
        if (this.f2803j == null) {
            this.f2803j = C0507b.m2385a(this.f2802i.getSystemWindowInsetLeft(), this.f2802i.getSystemWindowInsetTop(), this.f2802i.getSystemWindowInsetRight(), this.f2802i.getSystemWindowInsetBottom());
        }
        return this.f2803j;
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: i */
    public C0573c1 mo2173i(int i, int i2, int i3, int i4) {
        C0573c1 m2318i = C0573c1.m2318i(this.f2802i);
        int i5 = Build.VERSION.SDK_INT;
        C0629v0 c0627u0 = i5 >= 30 ? new C0627u0(m2318i) : i5 >= 29 ? new C0625t0(m2318i) : i5 >= 20 ? new C0623s0(m2318i) : new C0629v0(m2318i);
        c0627u0.mo2193d(C0573c1.m2322e(mo2191h(), i, i2, i3, i4));
        c0627u0.mo2194c(C0573c1.m2322e(mo2181g(), i, i2, i3, i4));
        return c0627u0.mo2195b();
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: k */
    public boolean mo2190k() {
        return this.f2802i.isRound();
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: l */
    public void mo2189l(C0507b[] c0507bArr) {
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: m */
    public void mo2188m(C0573c1 c0573c1) {
        this.f2804k = c0573c1;
    }

    /* renamed from: o */
    public final C0507b m2187o(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f2796c) {
                m2186p();
            }
            Method method = f2797d;
            if (method != null && f2799f != null && f2800g != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f2800g.get(f2801h.get(invoke));
                    if (rect != null) {
                        return C0507b.m2385a(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    e.getMessage();
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    /* renamed from: q */
    public void m2185q(C0507b c0507b) {
        this.f2805l = c0507b;
    }
}