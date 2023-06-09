package p093c.p145g.p146a.p147a.p156i0;

import android.animation.ValueAnimator;

/* renamed from: c.g.a.a.i0.j */
/* loaded from: classes.dex */
public class C1896j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1898k f5801a;

    public C1896j(C1898k c1898k) {
        this.f5801a = c1898k;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5801a.f5757c.setScaleX(floatValue);
        this.f5801a.f5757c.setScaleY(floatValue);
    }
}