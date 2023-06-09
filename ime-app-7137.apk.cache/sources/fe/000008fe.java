package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0181e0;
import p010b.p016c.p026q.C0335x1;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0568b;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1835e;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1811g;
import p093c.p145g.p146a.p147a.p149b0.C1812h;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC1811g implements InterfaceC0181e0 {

    /* renamed from: w */
    public static final int[] f6821w = {16842912};

    /* renamed from: A */
    public final CheckedTextView f6822A;

    /* renamed from: B */
    public FrameLayout f6823B;

    /* renamed from: C */
    public C0202s f6824C;

    /* renamed from: D */
    public ColorStateList f6825D;

    /* renamed from: E */
    public boolean f6826E;

    /* renamed from: F */
    public Drawable f6827F;

    /* renamed from: G */
    public final C0568b f6828G;

    /* renamed from: x */
    public int f6829x;

    /* renamed from: y */
    public boolean f6830y;

    /* renamed from: z */
    public boolean f6831z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1812h c1812h = new C1812h(this);
        this.f6828G = c1812h;
        setOrientation(0);
        LayoutInflater.from(context).inflate(AbstractC1868h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(AbstractC1829d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(AbstractC1840f.design_menu_item_text);
        this.f6822A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0605j0.m2269N(checkedTextView, c1812h);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f6823B == null) {
                this.f6823B = (FrameLayout) ((ViewStub) findViewById(AbstractC1840f.design_menu_item_action_area_stub)).inflate();
            }
            this.f6823B.removeAllViews();
            this.f6823B.addView(view);
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0181e0
    /* renamed from: d */
    public void mo275d(C0202s c0202s, int i) {
        C0335x1 c0335x1;
        int i2;
        StateListDrawable stateListDrawable;
        this.f6824C = c0202s;
        int i3 = c0202s.f1404a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(c0202s.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(AbstractC0075a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f6821w, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(stateListDrawable);
            } else {
                setBackgroundDrawable(stateListDrawable);
            }
        }
        setCheckable(c0202s.isCheckable());
        setChecked(c0202s.isChecked());
        setEnabled(c0202s.isEnabled());
        setTitle(c0202s.f1408e);
        setIcon(c0202s.getIcon());
        setActionView(c0202s.getActionView());
        setContentDescription(c0202s.f1420q);
        AbstractC0022t.m3476p0(this, c0202s.f1421r);
        C0202s c0202s2 = this.f6824C;
        if ((c0202s2.f1408e == null && c0202s2.getIcon() == null && this.f6824C.getActionView() != null) ? false : false) {
            this.f6822A.setVisibility(8);
            FrameLayout frameLayout = this.f6823B;
            if (frameLayout == null) {
                return;
            }
            c0335x1 = (C0335x1) frameLayout.getLayoutParams();
            i2 = -1;
        } else {
            this.f6822A.setVisibility(0);
            FrameLayout frameLayout2 = this.f6823B;
            if (frameLayout2 == null) {
                return;
            }
            c0335x1 = (C0335x1) frameLayout2.getLayoutParams();
            i2 = -2;
        }
        ((LinearLayout.LayoutParams) c0335x1).width = i2;
        this.f6823B.setLayoutParams(c0335x1);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0181e0
    public C0202s getItemData() {
        return this.f6824C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0202s c0202s = this.f6824C;
        if (c0202s != null && c0202s.isCheckable() && this.f6824C.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f6821w);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f6831z != z) {
            this.f6831z = z;
            this.f6828G.mo1645h(this.f6822A, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f6822A.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f6826E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC0022t.m3466u0(drawable).mutate();
                AbstractC0022t.m3480n0(drawable, this.f6825D);
            }
            int i = this.f6829x;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f6830y) {
            if (this.f6827F == null) {
                Drawable m2402c = AbstractC0505k.m2402c(getResources(), AbstractC1835e.navigation_empty_icon, getContext().getTheme());
                this.f6827F = m2402c;
                if (m2402c != null) {
                    int i2 = this.f6829x;
                    m2402c.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f6827F;
        }
        AbstractC0022t.m3506a0(this.f6822A, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f6822A.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f6829x = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f6825D = colorStateList;
        this.f6826E = colorStateList != null;
        C0202s c0202s = this.f6824C;
        if (c0202s != null) {
            setIcon(c0202s.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f6822A.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f6830y = z;
    }

    public void setTextAppearance(int i) {
        AbstractC0022t.m3484l0(this.f6822A, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f6822A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f6822A.setText(charSequence);
    }
}