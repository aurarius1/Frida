package p093c.p145g.p146a.p147a.p167s;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p093c.p145g.p146a.p147a.p154g0.C1851i;

/* renamed from: c.g.a.a.s.b */
/* loaded from: classes.dex */
public class C1979b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f6005a;

    public C1979b(BottomSheetBehavior bottomSheetBehavior) {
        this.f6005a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1851i c1851i = this.f6005a.f6715j;
        if (c1851i != null) {
            c1851i.m736q(floatValue);
        }
    }
}