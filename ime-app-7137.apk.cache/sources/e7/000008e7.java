package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import p093c.p145g.p146a.p147a.p165q.AbstractC1965b;
import p093c.p145g.p146a.p147a.p165q.View$OnLayoutChangeListenerC1964a;

/* loaded from: classes.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {

    /* renamed from: d */
    public final Rect f6675d;

    /* renamed from: e */
    public WeakReference f6676e;

    /* renamed from: f */
    public final View.OnLayoutChangeListener f6677f;

    public BottomAppBar$Behavior() {
        this.f6677f = new View$OnLayoutChangeListenerC1964a(this);
        this.f6675d = new Rect();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6677f = new View$OnLayoutChangeListenerC1964a(this);
        this.f6675d = new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, p010b.p044i.p045d.AbstractC0452b
    /* renamed from: k */
    public boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f6676e = new WeakReference((AbstractC1965b) view);
        int i2 = AbstractC1965b.f5949O;
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, p010b.p044i.p045d.AbstractC0452b
    /* renamed from: x */
    public boolean mo324x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        AbstractC1965b abstractC1965b = (AbstractC1965b) view;
        throw null;
    }
}