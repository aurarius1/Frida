package p093c.p145g.p146a.p147a.p160l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* renamed from: c.g.a.a.l0.b */
/* loaded from: classes.dex */
public class C1942b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ExpandableTransformationBehavior f5886a;

    public C1942b(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f5886a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f5886a.f6966b = null;
    }
}