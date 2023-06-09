package p010b.p083u.p084e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: b.u.e.k */
/* loaded from: classes.dex */
public class C0954k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0962m f3649a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3650b;

    /* renamed from: c */
    public final /* synthetic */ View f3651c;

    /* renamed from: d */
    public final /* synthetic */ C0970o f3652d;

    public C0954k(C0970o c0970o, C0962m c0962m, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3652d = c0970o;
        this.f3649a = c0962m;
        this.f3650b = viewPropertyAnimator;
        this.f3651c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3650b.setListener(null);
        this.f3651c.setAlpha(1.0f);
        this.f3651c.setTranslationX(0.0f);
        this.f3651c.setTranslationY(0.0f);
        this.f3652d.m1631c(this.f3649a.f3707a);
        this.f3652d.f3746s.remove(this.f3649a.f3707a);
        this.f3652d.m1605k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C0970o c0970o = this.f3652d;
        AbstractC0941g2 abstractC0941g2 = this.f3649a.f3707a;
        c0970o.getClass();
    }
}