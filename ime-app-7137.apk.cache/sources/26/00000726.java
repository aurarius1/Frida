package p093c.p097b.p130z.p132r0.p133a1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.SystemClock;
import p093c.p097b.p130z.p132r0.AbstractC1718e0;

/* renamed from: c.b.z.r0.a1.d */
/* loaded from: classes.dex */
public abstract class AbstractC1698d implements InterfaceC1695a {

    /* renamed from: a */
    public final CharSequence f5253a;

    /* renamed from: b */
    public final long f5254b;

    /* renamed from: c */
    public final Point f5255c;

    /* renamed from: d */
    public final int f5256d;

    public AbstractC1698d(CharSequence charSequence, Point point, int i, long j) {
        this.f5253a = charSequence;
        this.f5254b = j;
        this.f5255c = point;
        this.f5256d = i;
    }

    @Override // p093c.p097b.p130z.p132r0.p133a1.InterfaceC1695a
    /* renamed from: a */
    public boolean mo887a(Canvas canvas, Paint paint, AbstractC1718e0 abstractC1718e0) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5254b;
        if (elapsedRealtime > 1200) {
            return false;
        }
        float mo889b = mo889b(((float) elapsedRealtime) / 1200.0f);
        int mo888c = mo888c(this.f5255c.y, this.f5256d, mo889b);
        int i = this.f5255c.x;
        abstractC1718e0.setPaintToKeyText(paint);
        paint.setAlpha(255 - ((int) (255.0f * mo889b)));
        paint.setShadowLayer(5.0f, 0.0f, 0.0f, -16777216);
        paint.setTextSize((mo889b + 1.0f) * paint.getTextSize());
        canvas.translate(i, mo888c);
        CharSequence charSequence = this.f5253a;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, 0.0f, paint);
        canvas.translate(-i, -mo888c);
        return true;
    }

    /* renamed from: b */
    public abstract float mo889b(float f);

    /* renamed from: c */
    public abstract int mo888c(int i, int i2, float f);
}