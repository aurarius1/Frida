package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p093c.p145g.p146a.p147a.p153f0.C1841a;

/* renamed from: c.g.a.a.g0.s */
/* loaded from: classes.dex */
public class C1861s extends AbstractC1865w {

    /* renamed from: b */
    public final C1863u f5720b;

    /* renamed from: c */
    public final float f5721c;

    /* renamed from: d */
    public final float f5722d;

    public C1861s(C1863u c1863u, float f, float f2) {
        this.f5720b = c1863u;
        this.f5721c = f;
        this.f5722d = f2;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.AbstractC1865w
    /* renamed from: a */
    public void mo711a(Matrix matrix, C1841a c1841a, int i, Canvas canvas) {
        C1863u c1863u = this.f5720b;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(c1863u.f5731c - this.f5722d, c1863u.f5730b - this.f5721c), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.f5721c, this.f5722d);
        matrix2.preRotate(m713b());
        c1841a.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C1841a.f5617a;
        iArr[0] = c1841a.f5626j;
        iArr[1] = c1841a.f5625i;
        iArr[2] = c1841a.f5624h;
        Paint paint = c1841a.f5623g;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, C1841a.f5618b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, c1841a.f5623g);
        canvas.restore();
    }

    /* renamed from: b */
    public float m713b() {
        C1863u c1863u = this.f5720b;
        return (float) Math.toDegrees(Math.atan((c1863u.f5731c - this.f5722d) / (c1863u.f5730b - this.f5721c)));
    }
}