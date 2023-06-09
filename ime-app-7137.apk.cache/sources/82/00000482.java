package p010b.p086w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b.w.a0 */
/* loaded from: classes.dex */
public class C1022a0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1034e0 f3913a;

    public C1022a0(AbstractC1034e0 abstractC1034e0) {
        this.f3913a = abstractC1034e0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3913a.m1376m();
        animator.removeListener(this);
    }
}