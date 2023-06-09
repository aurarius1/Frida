package p010b.p083u.p084e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: b.u.e.h */
/* loaded from: classes.dex */
public class C0942h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0941g2 f3624a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3625b;

    /* renamed from: c */
    public final /* synthetic */ View f3626c;

    /* renamed from: d */
    public final /* synthetic */ C0970o f3627d;

    public C0942h(C0970o c0970o, AbstractC0941g2 abstractC0941g2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3627d = c0970o;
        this.f3624a = abstractC0941g2;
        this.f3625b = viewPropertyAnimator;
        this.f3626c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3625b.setListener(null);
        this.f3626c.setAlpha(1.0f);
        this.f3627d.m1631c(this.f3624a);
        this.f3627d.f3745r.remove(this.f3624a);
        this.f3627d.m1605k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3627d.getClass();
    }
}