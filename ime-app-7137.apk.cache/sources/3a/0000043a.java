package p010b.p083u.p084e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: b.u.e.j */
/* loaded from: classes.dex */
public class C0950j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0941g2 f3638a;

    /* renamed from: b */
    public final /* synthetic */ int f3639b;

    /* renamed from: c */
    public final /* synthetic */ View f3640c;

    /* renamed from: d */
    public final /* synthetic */ int f3641d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3642e;

    /* renamed from: f */
    public final /* synthetic */ C0970o f3643f;

    public C0950j(C0970o c0970o, AbstractC0941g2 abstractC0941g2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3643f = c0970o;
        this.f3638a = abstractC0941g2;
        this.f3639b = i;
        this.f3640c = view;
        this.f3641d = i2;
        this.f3642e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f3639b != 0) {
            this.f3640c.setTranslationX(0.0f);
        }
        if (this.f3641d != 0) {
            this.f3640c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3642e.setListener(null);
        this.f3643f.m1631c(this.f3638a);
        this.f3643f.f3744q.remove(this.f3638a);
        this.f3643f.m1605k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3643f.getClass();
    }
}