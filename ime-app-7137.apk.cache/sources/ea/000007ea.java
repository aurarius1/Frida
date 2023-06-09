package p093c.p145g.p146a.p147a.p156i0;

import android.animation.ValueAnimator;

/* renamed from: c.g.a.a.i0.i */
/* loaded from: classes.dex */
public class C1894i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1898k f5798a;

    public C1894i(C1898k c1898k) {
        this.f5798a = c1898k;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5798a.f5757c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}