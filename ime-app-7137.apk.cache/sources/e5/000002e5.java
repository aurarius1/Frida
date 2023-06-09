package p010b.p046j.p058l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: b.j.l.l0 */
/* loaded from: classes.dex */
public class C0609l0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0617p0 f2765a;

    /* renamed from: b */
    public final /* synthetic */ View f2766b;

    public C0609l0(C0615o0 c0615o0, InterfaceC0617p0 interfaceC0617p0, View view) {
        this.f2765a = interfaceC0617p0;
        this.f2766b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f2765a.mo2201c(this.f2766b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2765a.mo2203a(this.f2766b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f2765a.mo2202b(this.f2766b);
    }
}