package p093c.p145g.p146a.p147a.p160l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: c.g.a.a.l0.c */
/* loaded from: classes.dex */
public class C1943c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f5887a;

    /* renamed from: b */
    public final /* synthetic */ View f5888b;

    /* renamed from: c */
    public final /* synthetic */ View f5889c;

    public C1943c(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
        this.f5887a = z;
        this.f5888b = view;
        this.f5889c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f5887a) {
            return;
        }
        this.f5888b.setVisibility(4);
        this.f5889c.setAlpha(1.0f);
        this.f5889c.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.f5887a) {
            this.f5888b.setVisibility(0);
            this.f5889c.setAlpha(0.0f);
            this.f5889c.setVisibility(4);
        }
    }
}