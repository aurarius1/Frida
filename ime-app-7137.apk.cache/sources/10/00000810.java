package p093c.p145g.p146a.p147a.p159k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.timepicker.ClockHandView;

/* renamed from: c.g.a.a.k0.f */
/* loaded from: classes.dex */
public class C1932f extends AnimatorListenerAdapter {
    public C1932f(ClockHandView clockHandView) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        animator.end();
    }
}