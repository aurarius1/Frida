package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p093c.p145g.p146a.p147a.p153f0.C1841a;

/* renamed from: c.g.a.a.g0.r */
/* loaded from: classes.dex */
public class C1860r extends AbstractC1865w {

    /* renamed from: b */
    public final C1862t f5719b;

    public C1860r(C1862t c1862t) {
        this.f5719b = c1862t;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.AbstractC1865w
    /* renamed from: a */
    public void mo711a(Matrix matrix, C1841a c1841a, int i, Canvas canvas) {
        C1862t c1862t = this.f5719b;
        float f = c1862t.f5728g;
        float f2 = c1862t.f5729h;
        C1862t c1862t2 = this.f5719b;
        RectF rectF = new RectF(c1862t2.f5724c, c1862t2.f5725d, c1862t2.f5726e, c1862t2.f5727f);
        boolean z = f2 < 0.0f;
        Path path = c1841a.f5627k;
        if (z) {
            int[] iArr = C1841a.f5619c;
            iArr[0] = 0;
            iArr[1] = c1841a.f5626j;
            iArr[2] = c1841a.f5625i;
            iArr[3] = c1841a.f5624h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = C1841a.f5619c;
            iArr2[0] = 0;
            iArr2[1] = c1841a.f5624h;
            iArr2[2] = c1841a.f5625i;
            iArr2[3] = c1841a.f5626j;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = C1841a.f5620d;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        c1841a.f5622f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, C1841a.f5619c, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c1841a.f5628l);
        }
        canvas.drawArc(rectF, f, f2, true, c1841a.f5622f);
        canvas.restore();
    }
}