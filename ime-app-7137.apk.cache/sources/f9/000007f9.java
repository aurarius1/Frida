package p093c.p145g.p146a.p147a.p156i0;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: c.g.a.a.i0.p0 */
/* loaded from: classes.dex */
public class C1909p0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ TextInputLayout f5823a;

    public C1909p0(TextInputLayout textInputLayout) {
        this.f5823a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5823a.f6851F0.m779o(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}