package p093c.p145g.p146a.p147a.p156i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: c.g.a.a.i0.y */
/* loaded from: classes.dex */
public class C1922y extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1923z f5835a;

    public C1922y(C1923z c1923z) {
        this.f5835a = c1923z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C1923z c1923z = this.f5835a;
        c1923z.f5757c.setChecked(c1923z.f5843k);
        this.f5835a.f5849q.start();
    }
}