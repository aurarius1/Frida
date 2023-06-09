package p010b.p016c.p026q;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p050f.p051p.C0523c;
import p010b.p046j.p050f.p051p.InterfaceC0522b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.c.q.o1 */
/* loaded from: classes.dex */
public abstract class AbstractC0290o1 {

    /* renamed from: a */
    public static final int[] f1674a = {16842912};

    /* renamed from: b */
    public static final int[] f1675b = new int[0];

    /* renamed from: c */
    public static final Rect f1676c = new Rect();

    /* renamed from: d */
    public static Class f1677d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1677d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m2786a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 17 || !(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof DrawableContainer)) {
                if (drawable instanceof InterfaceC0522b) {
                    return m2786a(((C0523c) ((InterfaceC0522b) drawable)).f2575h);
                }
                if (drawable instanceof C0295p1) {
                    return m2786a(((C0295p1) drawable).f1688b);
                }
                if (drawable instanceof ScaleDrawable) {
                    return m2786a(((ScaleDrawable) drawable).getDrawable());
                }
                return true;
            }
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!m2786a(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m2785b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f1674a);
            } else {
                drawable.setState(f1675b);
            }
            drawable.setState(state);
        }
    }

    /* renamed from: c */
    public static Rect m2784c(Drawable drawable) {
        Field[] fields;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1677d != null) {
            try {
                Drawable m3468t0 = AbstractC0022t.m3468t0(drawable);
                Object invoke = m3468t0.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(m3468t0, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1677d.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f1676c;
    }

    /* renamed from: d */
    public static PorterDuff.Mode m2783d(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}