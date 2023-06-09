package p093c.p145g.p146a.p147a.p156i0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1856n;

/* renamed from: c.g.a.a.i0.m */
/* loaded from: classes.dex */
public class C1902m extends C1851i {

    /* renamed from: A */
    public final RectF f5813A;

    /* renamed from: B */
    public int f5814B;

    /* renamed from: z */
    public final Paint f5815z;

    public C1902m(C1856n c1856n) {
        super(c1856n == null ? new C1856n() : c1856n);
        Paint paint = new Paint(1);
        this.f5815z = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f5813A = new RectF();
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.f5814B = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.f5813A, this.f5815z);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.f5814B);
    }

    /* renamed from: x */
    public void m688x(float f, float f2, float f3, float f4) {
        RectF rectF = this.f5813A;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}