package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.C0578c;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1810f;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;
import p093c.p145g.p146a.p147a.p170v.C2001g;
import p093c.p145g.p146a.p147a.p170v.C2002h;
import p093c.p145g.p146a.p147a.p170v.InterfaceC2003i;
import p093c.p145g.p146a.p147a.p170v.ViewGroup$OnHierarchyChangeListenerC2004j;

/* loaded from: classes.dex */
public class ChipGroup extends AbstractC1810f {

    /* renamed from: f */
    public static final int f6786f = AbstractC1926k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: g */
    public int f6787g;

    /* renamed from: h */
    public int f6788h;

    /* renamed from: i */
    public boolean f6789i;

    /* renamed from: j */
    public boolean f6790j;

    /* renamed from: k */
    public InterfaceC2003i f6791k;

    /* renamed from: l */
    public final C2001g f6792l;

    /* renamed from: m */
    public ViewGroup$OnHierarchyChangeListenerC2004j f6793m;

    /* renamed from: n */
    public int f6794n;

    /* renamed from: o */
    public boolean f6795o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = AbstractC1804b.chipGroupStyle;
        int i2 = f6786f;
        this.f6792l = new C2001g(this, null);
        this.f6793m = new ViewGroup$OnHierarchyChangeListenerC2004j(this, null);
        this.f6794n = -1;
        this.f6795o = false;
        TypedArray m764d = AbstractC1822r.m764d(getContext(), attributeSet, AbstractC1940l.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = m764d.getDimensionPixelOffset(AbstractC1940l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(m764d.getDimensionPixelOffset(AbstractC1940l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(m764d.getDimensionPixelOffset(AbstractC1940l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(m764d.getBoolean(AbstractC1940l.ChipGroup_singleLine, false));
        setSingleSelection(m764d.getBoolean(AbstractC1940l.ChipGroup_singleSelection, false));
        setSelectionRequired(m764d.getBoolean(AbstractC1940l.ChipGroup_selectionRequired, false));
        int resourceId = m764d.getResourceId(AbstractC1940l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f6794n = resourceId;
        }
        m764d.recycle();
        super.setOnHierarchyChangeListener(this.f6793m);
        AbstractC0605j0.m2263T(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f6794n = i;
        InterfaceC2003i interfaceC2003i = this.f6791k;
        if (interfaceC2003i == null || !this.f6789i) {
            return;
        }
        interfaceC2003i.m567a(this, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f6794n;
                if (i2 != -1 && this.f6789i) {
                    m294c(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void m295b(int i) {
        int i2 = this.f6794n;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.f6789i) {
            m294c(i2, false);
        }
        if (i != -1) {
            m294c(i, true);
        }
        setCheckedId(i);
    }

    /* renamed from: c */
    public final void m294c(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f6795o = true;
            ((Chip) findViewById).setChecked(z);
            this.f6795o = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2002h);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2002h(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2002h(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2002h(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f6789i) {
            return this.f6794n;
        }
        return -1;
    }

    public List getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f6789i) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f6787g;
    }

    public int getChipSpacingVertical() {
        return this.f6788h;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f6794n;
        if (i != -1) {
            m294c(i, true);
            setCheckedId(this.f6794n);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0578c m2315a = C0578c.m2315a(getRowCount(), this.f5537d ? getChipCount() : -1, false, this.f6789i ? 1 : 2);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) m2315a.f2700a);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f6787g != i) {
            this.f6787g = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f6788h != i) {
            this.f6788h = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC2003i interfaceC2003i) {
        this.f6791k = interfaceC2003i;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6793m.f6114a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f6790j = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // p093c.p145g.p146a.p147a.p149b0.AbstractC1810f
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f6789i != z) {
            this.f6789i = z;
            this.f6795o = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f6795o = false;
            setCheckedId(-1);
        }
    }
}