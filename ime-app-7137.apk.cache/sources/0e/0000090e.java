package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p093c.p145g.p146a.p147a.p160l0.C1942b;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f6966b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: C */
    public boolean mo205C(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f6966b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet mo207D = mo207D(view, view2, z, z3);
        this.f6966b = mo207D;
        mo207D.addListener(new C1942b(this));
        this.f6966b.start();
        if (!z2) {
            this.f6966b.end();
        }
        return true;
    }

    /* renamed from: D */
    public abstract AnimatorSet mo207D(View view, View view2, boolean z, boolean z2);
}