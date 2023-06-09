package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p010b.p044i.p045d.AbstractC0452b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.C0577b;
import p010b.p064l.p066b.AbstractC0663h;
import p010b.p064l.p066b.C0664i;
import p093c.p145g.p146a.p147a.p164p.C1961b;
import p093c.p145g.p146a.p147a.p164p.C1962c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior extends AbstractC0452b {

    /* renamed from: a */
    public C0664i f6668a;

    /* renamed from: b */
    public boolean f6669b;

    /* renamed from: c */
    public int f6670c = 2;

    /* renamed from: d */
    public float f6671d = 0.5f;

    /* renamed from: e */
    public float f6672e = 0.0f;

    /* renamed from: f */
    public float f6673f = 0.5f;

    /* renamed from: g */
    public final AbstractC0663h f6674g = new C1961b(this);

    /* renamed from: C */
    public static float m349C(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: A */
    public boolean mo208A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0664i c0664i = this.f6668a;
        if (c0664i != null) {
            c0664i.m2131n(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean mo273B(View view) {
        return true;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: j */
    public boolean mo272j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f6669b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m3354o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6669b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6669b = false;
        }
        if (z) {
            if (this.f6668a == null) {
                this.f6668a = new C0664i(coordinatorLayout.getContext(), coordinatorLayout, this.f6674g);
            }
            return this.f6668a.m2124u(motionEvent);
        }
        return false;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: k */
    public boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (AbstractC0605j0.m2242p(view) == 0) {
            AbstractC0605j0.m2263T(view, 1);
            AbstractC0605j0.m2274I(view, 1048576);
            if (mo273B(view)) {
                AbstractC0605j0.m2272K(view, C0577b.f2693f, null, new C1962c(this));
                return false;
            }
            return false;
        }
        return false;
    }
}