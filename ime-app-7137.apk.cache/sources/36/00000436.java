package p010b.p083u.p084e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: b.u.e.i */
/* loaded from: classes.dex */
public class C0946i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0941g2 f3630a;

    /* renamed from: b */
    public final /* synthetic */ View f3631b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3632c;

    /* renamed from: d */
    public final /* synthetic */ C0970o f3633d;

    public C0946i(C0970o c0970o, AbstractC0941g2 abstractC0941g2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3633d = c0970o;
        this.f3630a = abstractC0941g2;
        this.f3631b = view;
        this.f3632c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3631b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3632c.setListener(null);
        this.f3633d.m1631c(this.f3630a);
        this.f3633d.f3743p.remove(this.f3630a);
        this.f3633d.m1605k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3633d.getClass();
    }
}