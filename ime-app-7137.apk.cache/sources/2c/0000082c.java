package p093c.p145g.p146a.p147a.p164p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: c.g.a.a.p.a */
/* loaded from: classes.dex */
public class C1960a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ HideBottomViewOnScrollBehavior f5940a;

    public C1960a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f5940a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f5940a.f6667c = null;
    }
}