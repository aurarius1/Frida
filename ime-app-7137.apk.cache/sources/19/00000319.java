package p010b.p064l.p066b;

import android.view.animation.Interpolator;

/* renamed from: b.l.b.f  reason: invalid class name */
/* loaded from: classes.dex */
public final class animationInterpolatorC0661f implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}