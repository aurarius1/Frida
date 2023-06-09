package com.anysoftkeyboard.keyboards.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.List;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p128x.InterfaceC1561c3;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.p132r0.InterfaceC1742q0;
import p093c.p097b.p130z.p132r0.InterfaceC1748t0;
import p093c.p097b.p130z.p132r0.InterfaceC1757y;
import p093c.p097b.p130z.p132r0.InterfaceC1760z0;

/* loaded from: classes.dex */
public class KeyboardViewContainerView extends ViewGroup implements InterfaceC1760z0 {

    /* renamed from: b */
    public final int f6560b;

    /* renamed from: c */
    public boolean f6561c;

    /* renamed from: d */
    public final List f6562d;

    /* renamed from: e */
    public InterfaceC1566d3 f6563e;

    /* renamed from: f */
    public CandidateView f6564f;

    /* renamed from: g */
    public InterfaceC1748t0 f6565g;

    /* renamed from: h */
    public C1237f f6566h;

    /* renamed from: i */
    public C1138a f6567i;

    /* renamed from: j */
    public LinearLayout f6568j;

    /* renamed from: k */
    public HorizontalScrollView f6569k;

    public KeyboardViewContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6561c = true;
        this.f6562d = new ArrayList();
        this.f6567i = new C1138a();
        this.f6560b = getResources().getDimensionPixelSize(R.dimen.candidate_strip_height);
    }

    private void setThemeForChildView(View view) {
        C1237f c1237f;
        if (!(view instanceof InterfaceC1760z0) || (c1237f = this.f6566h) == null) {
            return;
        }
        InterfaceC1760z0 interfaceC1760z0 = (InterfaceC1760z0) view;
        interfaceC1760z0.setKeyboardTheme(c1237f);
        interfaceC1760z0.setThemeOverlay(this.f6567i);
    }

    /* renamed from: d */
    public void m382d(InterfaceC1742q0 interfaceC1742q0) {
        for (View view : this.f6562d) {
            if (view.getTag(R.id.keyboard_container_provider_tag_id) == interfaceC1742q0) {
                return;
            }
        }
        View mo858b = interfaceC1742q0.mo858b(this);
        if (mo858b.getParent() != null) {
            throw new IllegalStateException("StripActionProvider inflated a view with a parent!");
        }
        mo858b.setTag(R.id.keyboard_container_provider_tag_id, interfaceC1742q0);
        if (this.f6561c) {
            addView(mo858b);
        }
        this.f6562d.add(mo858b);
        invalidate();
    }

    /* renamed from: e */
    public void m381e(InterfaceC1742q0 interfaceC1742q0) {
        for (View view : this.f6562d) {
            if (view.getTag(R.id.keyboard_container_provider_tag_id) == interfaceC1742q0) {
                removeView(view);
                interfaceC1742q0.mo859a();
                this.f6562d.remove(view);
                invalidate();
                return;
            }
        }
    }

    public CandidateView getCandidateView() {
        if (this.f6564f == null) {
            this.f6564f = (CandidateView) getChildAt(1);
        }
        return this.f6564f;
    }

    public LinearLayout getInlineAutofillView() {
        if (this.f6568j == null) {
            this.f6568j = (LinearLayout) getInlineScrollView().getChildAt(0);
        }
        return this.f6568j;
    }

    public HorizontalScrollView getInlineScrollView() {
        if (this.f6569k == null) {
            this.f6569k = (HorizontalScrollView) getChildAt(0);
        }
        return this.f6569k;
    }

    public InterfaceC1566d3 getStandardKeyboardView() {
        if (this.f6563e == null) {
            this.f6563e = (InterfaceC1566d3) getChildAt(2);
        }
        return this.f6563e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft() + i;
        int paddingRight = i3 - getPaddingRight();
        int paddingTop = getPaddingTop() + i2;
        int paddingTop2 = getPaddingTop() + i2;
        int paddingRight2 = i3 - getPaddingRight();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                if (childAt.getTag(R.id.keyboard_container_provider_tag_id) == null) {
                    childAt.layout(paddingLeft, paddingTop, paddingRight, childAt.getMeasuredHeight() + paddingTop);
                    paddingTop = childAt.getMeasuredHeight() + paddingTop;
                } else {
                    childAt.layout(paddingRight2 - childAt.getMeasuredWidth(), paddingTop2, paddingRight2, childAt.getMeasuredHeight() + paddingTop2);
                    paddingRight2 -= childAt.getMeasuredWidth();
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f6564f.getVisibility() == 0 ? this.f6560b : 0;
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                if (childAt.getTag(R.id.keyboard_container_provider_tag_id) != null || childAt == this.f6564f) {
                    measureChild(childAt, i, i2);
                } else {
                    measureChild(childAt, i, i2);
                    i4 = Math.max(i4, childAt.getMeasuredWidth());
                    i3 = childAt.getMeasuredHeight() + i3;
                }
            }
        }
        setMeasuredDimension(i4, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        InterfaceC1748t0 interfaceC1748t0 = this.f6565g;
        if (interfaceC1748t0 != null && (view instanceof InterfaceC1561c3)) {
            ((InterfaceC1561c3) view).setOnKeyboardActionListener(interfaceC1748t0);
        }
        setThemeForChildView(view);
        setActionsStripVisibility(this.f6561c);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        setActionsStripVisibility(this.f6561c);
    }

    public void setActionsStripVisibility(boolean z) {
        this.f6561c = z;
        if (this.f6564f != null) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    z = false;
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt.getVisibility() == 0 && (childAt instanceof InterfaceC1757y)) {
                    break;
                }
                i++;
            }
            int i2 = z ? 0 : 8;
            if (i2 != this.f6564f.getVisibility()) {
                this.f6564f.setVisibility(i2);
                for (View view : this.f6562d) {
                    if (!z) {
                        removeView(view);
                    } else if (view.getParent() == null) {
                        addView(view);
                    }
                }
                invalidate();
            }
        }
    }

    public void setBottomPadding(int i) {
        ((AnyKeyboardView) getStandardKeyboardView()).setBottomOffset(i);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1760z0
    public void setKeyboardTheme(C1237f c1237f) {
        this.f6566h = c1237f;
        for (int i = 0; i < getChildCount(); i++) {
            setThemeForChildView(getChildAt(i));
        }
    }

    public void setOnKeyboardActionListener(InterfaceC1748t0 interfaceC1748t0) {
        this.f6565g = interfaceC1748t0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof InterfaceC1561c3) {
                ((InterfaceC1561c3) childAt).setOnKeyboardActionListener(interfaceC1748t0);
            }
        }
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1760z0
    public void setThemeOverlay(C1138a c1138a) {
        this.f6567i = c1138a;
        for (int i = 0; i < getChildCount(); i++) {
            setThemeForChildView(getChildAt(i));
        }
    }
}