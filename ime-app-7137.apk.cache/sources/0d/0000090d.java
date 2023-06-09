package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p010b.p044i.p045d.AbstractC0452b;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.p160l0.ViewTreeObserver$OnPreDrawListenerC1941a;
import p093c.p145g.p146a.p147a.p174z.InterfaceC2046a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0452b {

    /* renamed from: a */
    public int f6965a;

    public ExpandableBehavior() {
        this.f6965a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6965a = 0;
    }

    /* renamed from: B */
    public final boolean m223B(boolean z) {
        if (!z) {
            return this.f6965a == 1;
        }
        int i = this.f6965a;
        return i == 0 || i == 2;
    }

    /* renamed from: C */
    public abstract boolean mo205C(View view, View view2, boolean z, boolean z2);

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: g */
    public boolean mo222g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC2046a interfaceC2046a = (InterfaceC2046a) view2;
        if (m223B(interfaceC2046a.m520a())) {
            this.f6965a = interfaceC2046a.m520a() ? 1 : 2;
            return mo205C((View) interfaceC2046a, view, interfaceC2046a.m520a(), true);
        }
        return false;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: k */
    public boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC2046a interfaceC2046a;
        if (!AbstractC0605j0.m2232z(view)) {
            List m3359j = coordinatorLayout.m3359j(view);
            int size = m3359j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    interfaceC2046a = null;
                    break;
                }
                View view2 = (View) m3359j.get(i2);
                if (mo210d(coordinatorLayout, view, view2)) {
                    interfaceC2046a = (InterfaceC2046a) view2;
                    break;
                }
                i2++;
            }
            if (interfaceC2046a != null && m223B(interfaceC2046a.m520a())) {
                int i3 = interfaceC2046a.m520a() ? 1 : 2;
                this.f6965a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC1941a(this, view, i3, interfaceC2046a));
            }
        }
        return false;
    }
}