package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: c.g.a.a.g0.u */
/* loaded from: classes.dex */
public class C1863u extends AbstractC1864v {

    /* renamed from: b */
    public float f5730b;

    /* renamed from: c */
    public float f5731c;

    @Override // p093c.p145g.p146a.p147a.p154g0.AbstractC1864v
    /* renamed from: a */
    public void mo712a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f5732a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f5730b, this.f5731c);
        path.transform(matrix);
    }
}