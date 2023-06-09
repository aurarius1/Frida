package p010b.p086w;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: b.w.f1 */
/* loaded from: classes.dex */
public class C1038f1 extends C1035e1 {
    @Override // p010b.p086w.C1026b1, p010b.p086w.C1041g1
    /* renamed from: b */
    public float mo1369b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p010b.p086w.C1032d1, p010b.p086w.C1041g1
    /* renamed from: d */
    public void mo1367d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p010b.p086w.C1026b1, p010b.p086w.C1041g1
    /* renamed from: e */
    public void mo1366e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p010b.p086w.C1035e1, p010b.p086w.C1041g1
    /* renamed from: f */
    public void mo1365f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p010b.p086w.C1029c1, p010b.p086w.C1041g1
    /* renamed from: g */
    public void mo1364g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p010b.p086w.C1029c1, p010b.p086w.C1041g1
    /* renamed from: h */
    public void mo1363h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}