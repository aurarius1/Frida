package p093c.p097b.p130z.p132r0.p133a1;

import android.graphics.Point;
import android.os.SystemClock;

/* renamed from: c.b.z.r0.a1.b */
/* loaded from: classes.dex */
public class C1696b extends AbstractC1698d {
    public C1696b(CharSequence charSequence, Point point, int i, long j) {
        super(charSequence, point, i, SystemClock.elapsedRealtime() - (1200 - j));
    }

    @Override // p093c.p097b.p130z.p132r0.p133a1.AbstractC1698d
    /* renamed from: b */
    public float mo889b(float f) {
        return 1.0f - (f * f);
    }

    @Override // p093c.p097b.p130z.p132r0.p133a1.AbstractC1698d
    /* renamed from: c */
    public int mo888c(int i, int i2, float f) {
        return i2 + ((int) ((i - i2) * f));
    }
}