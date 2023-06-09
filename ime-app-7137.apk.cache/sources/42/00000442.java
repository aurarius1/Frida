package p010b.p083u.p084e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: b.u.e.l */
/* loaded from: classes.dex */
public class C0958l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0962m f3665a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3666b;

    /* renamed from: c */
    public final /* synthetic */ View f3667c;

    /* renamed from: d */
    public final /* synthetic */ C0970o f3668d;

    public C0958l(C0970o c0970o, C0962m c0962m, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3668d = c0970o;
        this.f3665a = c0962m;
        this.f3666b = viewPropertyAnimator;
        this.f3667c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3666b.setListener(null);
        this.f3667c.setAlpha(1.0f);
        this.f3667c.setTranslationX(0.0f);
        this.f3667c.setTranslationY(0.0f);
        this.f3668d.m1631c(this.f3665a.f3708b);
        this.f3668d.f3746s.remove(this.f3665a.f3708b);
        this.f3668d.m1605k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C0970o c0970o = this.f3668d;
        AbstractC0941g2 abstractC0941g2 = this.f3665a.f3708b;
        c0970o.getClass();
    }
}