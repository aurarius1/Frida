package p093c.p145g.p146a.p147a.p160l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* renamed from: c.g.a.a.l0.e */
/* loaded from: classes.dex */
public class C1945e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f5892a;

    /* renamed from: b */
    public final /* synthetic */ View f5893b;

    public C1945e(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
        this.f5892a = z;
        this.f5893b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f5892a) {
            return;
        }
        this.f5893b.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.f5892a) {
            this.f5893b.setVisibility(0);
        }
    }
}