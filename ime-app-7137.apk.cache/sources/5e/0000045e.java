package p010b.p083u.p084e;

import android.animation.ValueAnimator;

/* renamed from: b.u.e.s */
/* loaded from: classes.dex */
public class C0986s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0990t f3822a;

    public C0986s(C0990t c0990t) {
        this.f3822a = c0990t;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f3822a.f3833e.setAlpha(floatValue);
        this.f3822a.f3834f.setAlpha(floatValue);
        this.f3822a.f3849u.invalidate();
    }
}