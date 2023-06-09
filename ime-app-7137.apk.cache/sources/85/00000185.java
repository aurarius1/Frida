package p010b.p016c.p026q;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.q.h4 */
/* loaded from: classes.dex */
public abstract class AbstractC0257h4 {

    /* renamed from: a */
    public static Method f1595a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1595a = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                f1595a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m2817a(View view) {
        return AbstractC0605j0.m2241q(view) == 1;
    }
}