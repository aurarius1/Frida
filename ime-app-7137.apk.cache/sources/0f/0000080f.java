package p093c.p145g.p146a.p147a.p159k0;

import android.animation.ValueAnimator;
import com.google.android.material.timepicker.ClockHandView;

/* renamed from: c.g.a.a.k0.e */
/* loaded from: classes.dex */
public class C1931e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ClockHandView f5873a;

    public C1931e(ClockHandView clockHandView) {
        this.f5873a = clockHandView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ClockHandView clockHandView = this.f5873a;
        int i = ClockHandView.f6944b;
        clockHandView.m225c(floatValue, true);
    }
}