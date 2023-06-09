package p010b.p086w;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: b.w.c1 */
/* loaded from: classes.dex */
public class C1029c1 extends C1026b1 {

    /* renamed from: f */
    public static boolean f3923f = true;

    /* renamed from: g */
    public static boolean f3924g = true;

    @Override // p010b.p086w.C1041g1
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo1364g(View view, Matrix matrix) {
        if (f3923f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f3923f = false;
            }
        }
    }

    @Override // p010b.p086w.C1041g1
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo1363h(View view, Matrix matrix) {
        if (f3924g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f3924g = false;
            }
        }
    }
}