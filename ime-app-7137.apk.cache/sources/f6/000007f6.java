package p093c.p145g.p146a.p147a.p156i0;

import android.animation.ValueAnimator;

/* renamed from: c.g.a.a.i0.o */
/* loaded from: classes.dex */
public class C1906o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1923z f5820a;

    public C1906o(C1923z c1923z) {
        this.f5820a = c1923z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5820a.f5757c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}