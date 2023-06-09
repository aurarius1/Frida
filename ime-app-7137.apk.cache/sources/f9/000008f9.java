package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import p010b.p044i.p045d.AbstractC0452b;
import p010b.p044i.p045d.C0455e;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p148a0.AbstractC1803b;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior extends AbstractC0452b {

    /* renamed from: a */
    public boolean f6814a;

    public FloatingActionButton$BaseBehavior() {
        this.f6814a = true;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.FloatingActionButton_Behavior_Layout);
        this.f6814a = obtainStyledAttributes.getBoolean(AbstractC1940l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    public boolean m277B(AbstractC1803b abstractC1803b, Rect rect) {
        throw null;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo276a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return m277B((AbstractC1803b) view, rect);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: f */
    public void mo209f(C0455e c0455e) {
        if (c0455e.f2418h == 0) {
            c0455e.f2418h = 80;
        }
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: g */
    public boolean mo222g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1803b abstractC1803b = (AbstractC1803b) view;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof C0455e ? ((C0455e) layoutParams).f2411a instanceof BottomSheetBehavior : false) {
            throw null;
        }
        return false;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: k */
    public boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC1803b abstractC1803b = (AbstractC1803b) view;
        List m3359j = coordinatorLayout.m3359j(abstractC1803b);
        int size = m3359j.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewGroup.LayoutParams layoutParams = ((View) m3359j.get(i2)).getLayoutParams();
            if (layoutParams instanceof C0455e ? ((C0455e) layoutParams).f2411a instanceof BottomSheetBehavior : false) {
                throw null;
            }
        }
        coordinatorLayout.m3352q(abstractC1803b, i);
        throw null;
    }
}