package p093c.p097b.p127w;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: c.b.w.k */
/* loaded from: classes.dex */
public class C1545k {

    /* renamed from: f */
    public Paint f4953f;

    /* renamed from: g */
    public Path f4954g;

    /* renamed from: i */
    public float f4956i;

    /* renamed from: j */
    public float f4957j;

    /* renamed from: a */
    public int f4948a = 255;

    /* renamed from: b */
    public float f4949b = -1.0f;

    /* renamed from: c */
    public float f4950c = -1.0f;

    /* renamed from: d */
    public float f4951d = -1.0f;

    /* renamed from: e */
    public float f4952e = -1.0f;

    /* renamed from: h */
    public PointF[] f4955h = new PointF[4];

    public C1545k(float f) {
        Paint paint = new Paint();
        this.f4953f = paint;
        int i = 0;
        paint.setARGB(255, 255, 255, 0);
        this.f4953f.setAntiAlias(true);
        this.f4953f.setStrokeWidth(1.0f);
        this.f4953f.setStrokeCap(Paint.Cap.BUTT);
        this.f4953f.setStyle(Paint.Style.FILL);
        this.f4954g = new Path();
        this.f4957j = f;
        this.f4956i = f;
        while (true) {
            PointF[] pointFArr = this.f4955h;
            if (i >= pointFArr.length) {
                return;
            }
            pointFArr[i] = new PointF();
            i++;
        }
    }

    /* renamed from: a */
    public void m945a(int i) {
        this.f4948a = i;
        this.f4953f.setAlpha(i);
        this.f4956i = (this.f4948a * this.f4957j) / 255.0f;
    }

    /* renamed from: b */
    public boolean m944b() {
        float f = this.f4956i / 2.0f;
        PointF pointF = new PointF(this.f4951d - this.f4949b, this.f4952e - this.f4950c);
        pointF.x /= pointF.length();
        pointF.y /= pointF.length();
        PointF pointF2 = new PointF(pointF.y, -pointF.x);
        float f2 = pointF2.x * f;
        float f3 = f * pointF2.y;
        PointF pointF3 = new PointF(this.f4951d + f2, this.f4952e + f3);
        PointF pointF4 = new PointF(this.f4951d - f2, this.f4952e - f3);
        PointF pointF5 = new PointF(this.f4949b + f2, this.f4950c + f3);
        PointF pointF6 = new PointF(this.f4949b - f2, this.f4950c - f3);
        PointF[] pointFArr = this.f4955h;
        pointFArr[0] = pointF3;
        pointFArr[1] = pointF4;
        pointFArr[2] = pointF6;
        pointFArr[3] = pointF5;
        return true;
    }
}