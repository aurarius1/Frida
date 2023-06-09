package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: c.g.a.a.g0.t */
/* loaded from: classes.dex */
public class C1862t extends AbstractC1864v {

    /* renamed from: b */
    public static final RectF f5723b = new RectF();
    @Deprecated

    /* renamed from: c */
    public float f5724c;
    @Deprecated

    /* renamed from: d */
    public float f5725d;
    @Deprecated

    /* renamed from: e */
    public float f5726e;
    @Deprecated

    /* renamed from: f */
    public float f5727f;
    @Deprecated

    /* renamed from: g */
    public float f5728g;
    @Deprecated

    /* renamed from: h */
    public float f5729h;

    public C1862t(float f, float f2, float f3, float f4) {
        this.f5724c = f;
        this.f5725d = f2;
        this.f5726e = f3;
        this.f5727f = f4;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.AbstractC1864v
    /* renamed from: a */
    public void mo712a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f5732a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f5723b;
        rectF.set(this.f5724c, this.f5725d, this.f5726e, this.f5727f);
        path.arcTo(rectF, this.f5728g, this.f5729h, false);
        path.transform(matrix);
    }
}