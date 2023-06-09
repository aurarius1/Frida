package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.List;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.p160l0.C1945e;
import p093c.p145g.p146a.p147a.p161m.C1949d;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C1949d f6973c;

    /* renamed from: d */
    public final C1949d f6974d;

    public FabTransformationScrimBehavior() {
        this.f6973c = new C1949d(75L, 150L);
        this.f6974d = new C1949d(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6973c = new C1949d(75L, 150L);
        this.f6974d = new C1949d(0L, 150L);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: A */
    public boolean mo208A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: D */
    public AnimatorSet mo207D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        m206E(view2, z, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC1077v0.m1290N(animatorSet, arrayList);
        animatorSet.addListener(new C1945e(this, z, view2));
        return animatorSet;
    }

    /* renamed from: E */
    public final void m206E(View view, boolean z, boolean z2, List list) {
        ObjectAnimator ofFloat;
        C1949d c1949d = z ? this.f6973c : this.f6974d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        c1949d.m670a(ofFloat);
        list.add(ofFloat);
    }
}