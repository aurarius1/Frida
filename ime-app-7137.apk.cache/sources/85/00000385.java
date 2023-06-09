package p010b.p069n.p070a.p071a;

import android.view.animation.Interpolator;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.n.a.a.d  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AbstractanimationInterpolatorC0769d implements Interpolator {

    /* renamed from: a */
    public final float[] f3265a;

    /* renamed from: b */
    public final float f3266b;

    public AbstractanimationInterpolatorC0769d(float[] fArr) {
        this.f3265a = fArr;
        this.f3266b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3265a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f3266b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f3265a;
        return AbstractC1124a.m1195a(fArr2[min + 1], fArr2[min], f3, fArr2[min]);
    }
}