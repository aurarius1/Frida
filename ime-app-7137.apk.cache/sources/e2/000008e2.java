package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p044i.p045d.AbstractC0452b;
import p010b.p044i.p045d.C0455e;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p162n.AbstractC1954d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1954d {

    /* renamed from: c */
    public final Rect f6648c;

    /* renamed from: d */
    public final Rect f6649d;

    /* renamed from: e */
    public int f6650e;

    public AppBarLayout$ScrollingViewBehavior() {
        this.f6648c = new Rect();
        this.f6649d = new Rect();
    }

    @Override // p093c.p145g.p146a.p147a.p162n.AbstractC1954d
    /* renamed from: C */
    public void mo356C(CoordinatorLayout coordinatorLayout, View view, int i) {
        m355D(coordinatorLayout.m3359j(view));
        coordinatorLayout.m3352q(view, i);
    }

    /* renamed from: D */
    public void m355D(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
        }
    }

    /* renamed from: E */
    public final int m354E(View view) {
        int i = this.f6650e;
        if (i == 0) {
            return 0;
        }
        return AbstractC0022t.m3489j((int) (i * 0.0f), 0, i);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: g */
    public boolean mo222g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0452b abstractC0452b = ((C0455e) view2.getLayoutParams()).f2411a;
        if (abstractC0452b instanceof AppBarLayout$BaseBehavior) {
            ((AppBarLayout$BaseBehavior) abstractC0452b).getClass();
            AbstractC0605j0.m2280C(view, (((view2.getBottom() - view.getTop()) + 0) + 0) - m354E(view2));
        }
        return false;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: h */
    public void mo353h(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: l */
    public boolean mo352l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            m355D(coordinatorLayout.m3359j(view));
            return false;
        }
        return false;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: t */
    public boolean mo351t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        m355D(coordinatorLayout.m3359j(view));
        return false;
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6648c = new Rect();
        this.f6649d = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.ScrollingViewBehavior_Layout);
        this.f6650e = obtainStyledAttributes.getDimensionPixelSize(AbstractC1940l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
        obtainStyledAttributes.recycle();
    }
}