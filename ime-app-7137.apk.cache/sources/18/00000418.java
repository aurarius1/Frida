package p010b.p083u.p084e;

import android.view.animation.Interpolator;

/* renamed from: b.u.e.a1  reason: invalid class name */
/* loaded from: classes.dex */
public class animationInterpolatorC0916a1 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}