package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p093c.p145g.p146a.p147a.p155h0.AbstractC1873e;
import p093c.p145g.p146a.p147a.p155h0.C1869a;
import p093c.p145g.p146a.p147a.p155h0.C1876h;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {

    /* renamed from: h */
    public final C1869a f6832h = new C1869a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: B */
    public boolean mo273B(View view) {
        this.f6832h.getClass();
        return view instanceof AbstractC1873e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p010b.p044i.p045d.AbstractC0452b
    /* renamed from: j */
    public boolean mo272j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f6832h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C1876h.f5751a == null) {
                    C1876h.f5751a = new C1876h();
                }
                synchronized (C1876h.f5751a.f5752b) {
                }
            }
        } else if (coordinatorLayout.m3354o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C1876h.f5751a == null) {
                C1876h.f5751a = new C1876h();
            }
            synchronized (C1876h.f5751a.f5752b) {
            }
        }
        return super.mo272j(coordinatorLayout, view, motionEvent);
    }
}