package p093c.p145g.p146a.p147a.p149b0;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: c.g.a.a.b0.o */
/* loaded from: classes.dex */
public class C1819o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f5565a;

    public C1819o(C1820p c1820p, TextView textView) {
        this.f5565a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5565a.setScaleX(floatValue);
        this.f5565a.setScaleY(floatValue);
    }
}