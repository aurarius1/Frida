package p010b.p016c.p026q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: b.c.q.d */
/* loaded from: classes.dex */
public class C0228d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ActionBarOverlayLayout f1499a;

    public C0228d(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1499a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1499a;
        actionBarOverlayLayout.f200C = null;
        actionBarOverlayLayout.f215m = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1499a;
        actionBarOverlayLayout.f200C = null;
        actionBarOverlayLayout.f215m = false;
    }
}