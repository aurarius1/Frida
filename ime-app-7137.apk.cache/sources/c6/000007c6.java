package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.BitSet;

/* renamed from: c.g.a.a.g0.p */
/* loaded from: classes.dex */
public class C1858p {

    /* renamed from: a */
    public final C1866x[] f5705a = new C1866x[4];

    /* renamed from: b */
    public final Matrix[] f5706b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f5707c = new Matrix[4];

    /* renamed from: d */
    public final PointF f5708d = new PointF();

    /* renamed from: e */
    public final Path f5709e = new Path();

    /* renamed from: f */
    public final Path f5710f = new Path();

    /* renamed from: g */
    public final C1866x f5711g = new C1866x();

    /* renamed from: h */
    public final float[] f5712h = new float[2];

    /* renamed from: i */
    public final float[] f5713i = new float[2];

    /* renamed from: j */
    public final Path f5714j = new Path();

    /* renamed from: k */
    public final Path f5715k = new Path();

    /* renamed from: l */
    public boolean f5716l = true;

    public C1858p() {
        for (int i = 0; i < 4; i++) {
            this.f5705a[i] = new C1866x();
            this.f5706b[i] = new Matrix();
            this.f5707c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public void m715a(C1856n c1856n, float f, RectF rectF, C1849g c1849g, Path path) {
        int i;
        float[] fArr;
        float centerX;
        float f2;
        C1848f c1848f;
        C1866x c1866x;
        Matrix matrix;
        Path path2;
        InterfaceC1845c interfaceC1845c;
        AbstractC1846d abstractC1846d;
        float f3;
        float f4;
        path.rewind();
        this.f5709e.rewind();
        this.f5710f.rewind();
        this.f5710f.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                interfaceC1845c = c1856n.f5698g;
            } else if (i2 == 2) {
                interfaceC1845c = c1856n.f5699h;
            } else if (i2 != 3) {
                interfaceC1845c = c1856n.f5697f;
            } else {
                interfaceC1845c = c1856n.f5696e;
            }
            if (i2 == 1) {
                abstractC1846d = c1856n.f5694c;
            } else if (i2 == 2) {
                abstractC1846d = c1856n.f5695d;
            } else if (i2 != 3) {
                abstractC1846d = c1856n.f5693b;
            } else {
                abstractC1846d = c1856n.f5692a;
            }
            C1866x c1866x2 = this.f5705a[i2];
            abstractC1846d.getClass();
            abstractC1846d.mo728a(c1866x2, 90.0f, f, interfaceC1845c.mo729a(rectF));
            int i3 = i2 + 1;
            float f5 = i3 * 90;
            this.f5706b[i2].reset();
            PointF pointF = this.f5708d;
            if (i2 == 1) {
                f3 = rectF.right;
            } else if (i2 != 2) {
                f3 = i2 != 3 ? rectF.right : rectF.left;
                f4 = rectF.top;
                pointF.set(f3, f4);
                Matrix matrix2 = this.f5706b[i2];
                PointF pointF2 = this.f5708d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f5706b[i2].preRotate(f5);
                float[] fArr2 = this.f5712h;
                C1866x[] c1866xArr = this.f5705a;
                fArr2[0] = c1866xArr[i2].f5736c;
                fArr2[1] = c1866xArr[i2].f5737d;
                this.f5706b[i2].mapPoints(fArr2);
                this.f5707c[i2].reset();
                Matrix matrix3 = this.f5707c[i2];
                float[] fArr3 = this.f5712h;
                matrix3.setTranslate(fArr3[0], fArr3[1]);
                this.f5707c[i2].preRotate(f5);
                i2 = i3;
            } else {
                f3 = rectF.left;
            }
            f4 = rectF.bottom;
            pointF.set(f3, f4);
            Matrix matrix22 = this.f5706b[i2];
            PointF pointF22 = this.f5708d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f5706b[i2].preRotate(f5);
            float[] fArr22 = this.f5712h;
            C1866x[] c1866xArr2 = this.f5705a;
            fArr22[0] = c1866xArr2[i2].f5736c;
            fArr22[1] = c1866xArr2[i2].f5737d;
            this.f5706b[i2].mapPoints(fArr22);
            this.f5707c[i2].reset();
            Matrix matrix32 = this.f5707c[i2];
            float[] fArr32 = this.f5712h;
            matrix32.setTranslate(fArr32[0], fArr32[1]);
            this.f5707c[i2].preRotate(f5);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr4 = this.f5712h;
            C1866x[] c1866xArr3 = this.f5705a;
            fArr4[0] = c1866xArr3[i4].f5734a;
            fArr4[1] = c1866xArr3[i4].f5735b;
            this.f5706b[i4].mapPoints(fArr4);
            float[] fArr5 = this.f5712h;
            if (i4 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f5705a[i4].m709b(this.f5706b[i4], path);
            if (c1849g != null) {
                C1866x c1866x3 = this.f5705a[i4];
                Matrix matrix4 = this.f5706b[i4];
                BitSet bitSet = c1849g.f5632a.f5660g;
                c1866x3.getClass();
                bitSet.set(i4, false);
                AbstractC1865w[] abstractC1865wArr = c1849g.f5632a.f5658e;
                c1866x3.m710a(c1866x3.f5739f);
                abstractC1865wArr[i4] = new C1859q(c1866x3, new ArrayList(c1866x3.f5741h), new Matrix(matrix4));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f5712h;
            C1866x[] c1866xArr4 = this.f5705a;
            fArr6[0] = c1866xArr4[i4].f5736c;
            fArr6[1] = c1866xArr4[i4].f5737d;
            this.f5706b[i4].mapPoints(fArr6);
            float[] fArr7 = this.f5713i;
            C1866x[] c1866xArr5 = this.f5705a;
            fArr7[0] = c1866xArr5[i6].f5734a;
            fArr7[1] = c1866xArr5[i6].f5735b;
            this.f5706b[i6].mapPoints(fArr7);
            float f6 = this.f5712h[0];
            float[] fArr8 = this.f5713i;
            float max = Math.max(((float) Math.hypot(f6 - fArr8[0], fArr[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.f5712h;
            C1866x[] c1866xArr6 = this.f5705a;
            fArr9[0] = c1866xArr6[i4].f5736c;
            fArr9[1] = c1866xArr6[i4].f5737d;
            this.f5706b[i4].mapPoints(fArr9);
            if (i4 == 1 || i4 == 3) {
                centerX = rectF.centerX();
                f2 = this.f5712h[0];
            } else {
                centerX = rectF.centerY();
                f2 = this.f5712h[1];
            }
            Math.abs(centerX - f2);
            this.f5711g.m707d(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                c1848f = c1856n.f5702k;
            } else if (i4 == 2) {
                c1848f = c1856n.f5703l;
            } else if (i4 != 3) {
                c1848f = c1856n.f5701j;
            } else {
                c1848f = c1856n.f5700i;
            }
            C1866x c1866x4 = this.f5711g;
            c1848f.getClass();
            c1866x4.m708c(max, 0.0f);
            this.f5714j.reset();
            this.f5711g.m709b(this.f5707c[i4], this.f5714j);
            if (this.f5716l && Build.VERSION.SDK_INT >= 19 && (m714b(this.f5714j, i4) || m714b(this.f5714j, i6))) {
                Path path3 = this.f5714j;
                path3.op(path3, this.f5710f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.f5712h;
                C1866x c1866x5 = this.f5711g;
                fArr10[0] = c1866x5.f5734a;
                fArr10[1] = c1866x5.f5735b;
                this.f5707c[i4].mapPoints(fArr10);
                Path path4 = this.f5709e;
                float[] fArr11 = this.f5712h;
                path4.moveTo(fArr11[0], fArr11[1]);
                c1866x = this.f5711g;
                matrix = this.f5707c[i4];
                path2 = this.f5709e;
            } else {
                c1866x = this.f5711g;
                matrix = this.f5707c[i4];
                path2 = path;
            }
            c1866x.m709b(matrix, path2);
            if (c1849g != null) {
                C1866x c1866x6 = this.f5711g;
                Matrix matrix5 = this.f5707c[i4];
                c1866x6.getClass();
                c1849g.f5632a.f5660g.set(i4 + 4, false);
                AbstractC1865w[] abstractC1865wArr2 = c1849g.f5632a.f5659f;
                c1866x6.m710a(c1866x6.f5739f);
                abstractC1865wArr2[i4] = new C1859q(c1866x6, new ArrayList(c1866x6.f5741h), new Matrix(matrix5));
            }
            i4 = i5;
        }
        path.close();
        this.f5709e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f5709e.isEmpty()) {
            return;
        }
        path.op(this.f5709e, Path.Op.UNION);
    }

    /* renamed from: b */
    public final boolean m714b(Path path, int i) {
        this.f5715k.reset();
        this.f5705a[i].m709b(this.f5706b[i], this.f5715k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f5715k.computeBounds(rectF, true);
        path.op(this.f5715k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}