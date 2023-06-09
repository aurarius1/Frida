package p010b.p091z.p092a;

import android.view.animation.Interpolator;

/* renamed from: b.z.a.c  reason: invalid class name */
/* loaded from: classes.dex */
public final class animationInterpolatorC1112c implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}