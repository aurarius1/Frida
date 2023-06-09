package p093c.p097b.p130z.p132r0.p133a1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.SystemClock;
import p093c.p097b.p106g0.C1220c;
import p093c.p097b.p130z.p132r0.AbstractC1718e0;

/* renamed from: c.b.z.r0.a1.e */
/* loaded from: classes.dex */
public class C1699e implements InterfaceC1695a {

    /* renamed from: a */
    public final String f5257a;

    /* renamed from: b */
    public String f5258b;

    /* renamed from: c */
    public long f5259c;

    /* renamed from: d */
    public long f5260d;

    /* renamed from: e */
    public final C1220c f5261e;

    /* renamed from: f */
    public final long f5262f = SystemClock.elapsedRealtime();

    /* renamed from: g */
    public final long f5263g;

    /* renamed from: h */
    public final Point f5264h;

    public C1699e(String str, Point point, long j, C1220c c1220c) {
        this.f5257a = str;
        this.f5258b = str.substring(0, 1);
        this.f5261e = c1220c;
        this.f5259c = j;
        this.f5260d = j;
        this.f5263g = j * str.length();
        this.f5264h = point;
    }

    @Override // p093c.p097b.p130z.p132r0.p133a1.InterfaceC1695a
    /* renamed from: a */
    public boolean mo887a(Canvas canvas, Paint paint, AbstractC1718e0 abstractC1718e0) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5262f;
        long j = this.f5263g;
        if (elapsedRealtime > j) {
            return false;
        }
        float f = ((float) elapsedRealtime) / ((float) j);
        C1220c c1220c = this.f5261e;
        Float valueOf = Float.valueOf(f);
        c1220c.f4396a.getClass();
        Paint paint2 = new Paint(paint);
        abstractC1718e0.setPaintToKeyText(paint2);
        paint2.setTextSkewX(0.3f);
        paint2.setAlpha((int) ((1.0f - valueOf.floatValue()) * 255.0f));
        paint2.setTextScaleX(valueOf.floatValue() + 1.0f);
        paint2.setShadowLayer(5.0f, 0.0f, 0.0f, -16777216);
        long j2 = this.f5259c;
        if (elapsedRealtime >= j2) {
            this.f5259c = j2 + this.f5260d;
            this.f5258b = this.f5257a.substring(0, this.f5258b.length() + 1);
        }
        Point point = this.f5264h;
        canvas.translate(point.x, point.y);
        String str = this.f5258b;
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint2);
        Point point2 = this.f5264h;
        canvas.translate(-point2.x, -point2.y);
        return true;
    }
}