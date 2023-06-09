package p010b.p083u.p084e;

import android.animation.ValueAnimator;

/* renamed from: b.u.e.j0 */
/* loaded from: classes.dex */
public class C0951j0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0927d0 f3644a;

    public C0951j0(C0927d0 c0927d0) {
        this.f3644a = c0927d0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3644a.f3565m = valueAnimator.getAnimatedFraction();
    }
}