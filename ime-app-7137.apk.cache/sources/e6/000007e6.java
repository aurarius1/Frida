package p093c.p145g.p146a.p147a.p156i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: c.g.a.a.i0.g */
/* loaded from: classes.dex */
public class C1890g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1898k f5794a;

    public C1890g(C1898k c1898k) {
        this.f5794a = c1898k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f5794a.f5755a.setEndIconVisible(true);
    }
}