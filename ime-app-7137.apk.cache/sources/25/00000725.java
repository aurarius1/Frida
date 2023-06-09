package p093c.p097b.p130z.p132r0.p133a1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.SystemClock;
import p093c.p097b.p130z.p132r0.AbstractC1718e0;

/* renamed from: c.b.z.r0.a1.c */
/* loaded from: classes.dex */
public class C1697c extends AbstractC1698d {

    /* renamed from: e */
    public boolean f5252e;

    public C1697c(CharSequence charSequence, Point point, int i) {
        super(charSequence, point, i, SystemClock.elapsedRealtime());
    }

    @Override // p093c.p097b.p130z.p132r0.p133a1.AbstractC1698d, p093c.p097b.p130z.p132r0.p133a1.InterfaceC1695a
    /* renamed from: a */
    public boolean mo887a(Canvas canvas, Paint paint, AbstractC1718e0 abstractC1718e0) {
        if (this.f5252e) {
            return false;
        }
        boolean z = !super.mo887a(canvas, paint, abstractC1718e0);
        this.f5252e = z;
        return !z;
    }

    @Override // p093c.p097b.p130z.p132r0.p133a1.AbstractC1698d
    /* renamed from: b */
    public float mo889b(float f) {
        float f2 = 1.0f - f;
        return 1.0f - (f2 * f2);
    }

    @Override // p093c.p097b.p130z.p132r0.p133a1.AbstractC1698d
    /* renamed from: c */
    public int mo888c(int i, int i2, float f) {
        return i - ((int) ((i - i2) * f));
    }
}