package p010b.p044i.p045d;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: b.i.d.j */
/* loaded from: classes.dex */
public abstract class AbstractC0460j {

    /* renamed from: a */
    public static final ThreadLocal f2433a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f2434b = new ThreadLocal();

    /* renamed from: a */
    public static void m2435a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2435a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}