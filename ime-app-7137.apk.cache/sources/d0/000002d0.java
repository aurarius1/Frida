package p010b.p046j.p058l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import p010b.p046j.AbstractC0462b;
import p010b.p046j.p050f.C0507b;

/* renamed from: b.j.l.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC0588e0 {
    /* renamed from: a */
    public static void m2302a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC0462b.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static C0573c1 m2301b(View view, C0573c1 c0573c1, Rect rect) {
        WindowInsets m2319h = c0573c1.m2319h();
        if (m2319h != null) {
            return C0573c1.m2317j(view.computeSystemWindowInsets(m2319h, rect), view);
        }
        rect.setEmpty();
        return c0573c1;
    }

    /* renamed from: c */
    public static C0573c1 m2300c(View view) {
        if (AbstractC0621r0.f2783d && view.isAttachedToWindow()) {
            try {
                Object obj = AbstractC0621r0.f2780a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) AbstractC0621r0.f2781b.get(obj);
                    Rect rect2 = (Rect) AbstractC0621r0.f2782c.get(obj);
                    if (rect == null || rect2 == null) {
                        return null;
                    }
                    int i = Build.VERSION.SDK_INT;
                    C0629v0 c0627u0 = i >= 30 ? new C0627u0() : i >= 29 ? new C0625t0() : i >= 20 ? new C0623s0() : new C0629v0();
                    c0627u0.mo2194c(C0507b.m2385a(rect.left, rect.top, rect.right, rect.bottom));
                    c0627u0.mo2193d(C0507b.m2385a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                    C0573c1 mo2195b = c0627u0.mo2195b();
                    mo2195b.f2676b.mo2188m(mo2195b);
                    mo2195b.f2676b.mo2192d(view.getRootView());
                    return mo2195b;
                }
                return null;
            } catch (IllegalAccessException e) {
                e.getMessage();
                return null;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m2299d(View view, InterfaceC0622s interfaceC0622s) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(AbstractC0462b.tag_on_apply_window_listener, interfaceC0622s);
        }
        if (interfaceC0622s == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC0462b.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0575d0(view, interfaceC0622s));
        }
    }
}