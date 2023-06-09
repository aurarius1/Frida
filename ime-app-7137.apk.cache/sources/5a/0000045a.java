package p010b.p083u.p084e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b.u.e.r */
/* loaded from: classes.dex */
public class C0982r extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3795a = false;

    /* renamed from: b */
    public final /* synthetic */ C0990t f3796b;

    public C0982r(C0990t c0990t) {
        this.f3796b = c0990t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3795a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f3795a) {
            this.f3795a = false;
        } else if (((Float) this.f3796b.f3827B.getAnimatedValue()).floatValue() == 0.0f) {
            C0990t c0990t = this.f3796b;
            c0990t.f3828C = 0;
            c0990t.m1458k(0);
        } else {
            C0990t c0990t2 = this.f3796b;
            c0990t2.f3828C = 2;
            c0990t2.f3849u.invalidate();
        }
    }
}