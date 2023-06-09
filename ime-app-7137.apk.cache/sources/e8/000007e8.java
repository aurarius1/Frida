package p093c.p145g.p146a.p147a.p156i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: c.g.a.a.i0.h */
/* loaded from: classes.dex */
public class C1892h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1898k f5796a;

    public C1892h(C1898k c1898k) {
        this.f5796a = c1898k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f5796a.f5755a.setEndIconVisible(false);
    }
}