package p010b.p086w;

import android.animation.LayoutTransition;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.w.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC1073t0 {

    /* renamed from: a */
    public static boolean f4030a = true;

    /* renamed from: a */
    public static InterfaceC1071s0 m1305a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C1069r0(viewGroup) : (C1067q0) AbstractC1081x0.m1251c(viewGroup);
    }

    /* renamed from: b */
    public static void m1304b(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
            return;
        }
        boolean z2 = false;
        if (i >= 18) {
            if (f4030a) {
                try {
                    viewGroup.suppressLayout(z);
                    return;
                } catch (NoSuchMethodError unused) {
                    f4030a = false;
                    return;
                }
            }
            return;
        }
        if (AbstractC1077v0.f4037a == null) {
            C1075u0 c1075u0 = new C1075u0();
            AbstractC1077v0.f4037a = c1075u0;
            c1075u0.setAnimator(2, null);
            AbstractC1077v0.f4037a.setAnimator(0, null);
            AbstractC1077v0.f4037a.setAnimator(1, null);
            AbstractC1077v0.f4037a.setAnimator(3, null);
            AbstractC1077v0.f4037a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    if (!AbstractC1077v0.f4041e) {
                        try {
                            Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                            AbstractC1077v0.f4040d = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused2) {
                        }
                        AbstractC1077v0.f4041e = true;
                    }
                    Method method = AbstractC1077v0.f4040d;
                    if (method != null) {
                        try {
                            method.invoke(layoutTransition, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    }
                }
                if (layoutTransition != AbstractC1077v0.f4037a) {
                    viewGroup.setTag(AbstractC1076v.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(AbstractC1077v0.f4037a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!AbstractC1077v0.f4039c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                AbstractC1077v0.f4038b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused4) {
            }
            AbstractC1077v0.f4039c = true;
        }
        Field field = AbstractC1077v0.f4038b;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        AbstractC1077v0.f4038b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused5) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused6) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        int i2 = AbstractC1076v.transition_layout_save;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i2);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i2, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}