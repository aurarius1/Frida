package p010b.p086w;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.w.g1 */
/* loaded from: classes.dex */
public class C1041g1 {

    /* renamed from: a */
    public static Method f3952a;

    /* renamed from: b */
    public static boolean f3953b;

    /* renamed from: c */
    public static Field f3954c;

    /* renamed from: d */
    public static boolean f3955d;

    /* renamed from: a */
    public void mo1370a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(AbstractC1076v.save_non_transition_alpha, null);
        }
    }

    /* renamed from: b */
    public float mo1369b(View view) {
        Float f = (Float) view.getTag(AbstractC1076v.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: c */
    public void mo1368c(View view) {
        int i = AbstractC1076v.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: d */
    public void mo1367d(View view, int i, int i2, int i3, int i4) {
        if (!f3953b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f3952a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3953b = true;
        }
        Method method = f3952a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: e */
    public void mo1366e(View view, float f) {
        Float f2 = (Float) view.getTag(AbstractC1076v.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: f */
    public void mo1365f(View view, int i) {
        if (!f3955d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3954c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3955d = true;
        }
        Field field = f3954c;
        if (field != null) {
            try {
                f3954c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public void mo1364g(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1364g(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: h */
    public void mo1363h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1363h(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}