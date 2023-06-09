package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p010b.p044i.p045d.AbstractC0452b;
import p093c.p145g.p146a.p147a.p161m.AbstractC1946a;
import p093c.p145g.p146a.p147a.p164p.C1960a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends AbstractC0452b {

    /* renamed from: a */
    public int f6665a;

    /* renamed from: b */
    public int f6666b;

    /* renamed from: c */
    public ViewPropertyAnimator f6667c;

    public HideBottomViewOnScrollBehavior() {
        this.f6665a = 0;
        this.f6666b = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6665a = 0;
        this.f6666b = 2;
    }

    /* renamed from: B */
    public final void m350B(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f6667c = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C1960a(this));
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: k */
    public boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f6665a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: r */
    public void mo327r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f6666b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f6667c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f6666b = 1;
            m350B(view, this.f6665a + 0, 175L, AbstractC1946a.f5896c);
        } else if (i2 >= 0 || this.f6666b == 2) {
        } else {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f6667c;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f6666b = 2;
            m350B(view, 0, 225L, AbstractC1946a.f5897d);
        }
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: x */
    public boolean mo324x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }
}