package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p026q.C0338y;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p152e0.AbstractC1839d;
import p093c.p145g.p146a.p147a.p152e0.C1838c;
import p093c.p145g.p146a.p147a.p154g0.C1850h;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p154g0.InterfaceC1867y;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;
import p093c.p145g.p146a.p147a.p168t.C1987b;
import p093c.p145g.p146a.p147a.p168t.C1988c;
import p093c.p145g.p146a.p147a.p168t.C1991f;
import p093c.p145g.p146a.p147a.p168t.C1993h;
import p093c.p145g.p146a.p147a.p168t.InterfaceC1986a;

/* loaded from: classes.dex */
public class MaterialButton extends C0338y implements Checkable, InterfaceC1867y {

    /* renamed from: d */
    public static final int[] f6737d = {16842911};

    /* renamed from: e */
    public static final int[] f6738e = {16842912};

    /* renamed from: f */
    public static final int f6739f = AbstractC1926k.Widget_MaterialComponents_Button;

    /* renamed from: g */
    public final C1988c f6740g;

    /* renamed from: h */
    public final LinkedHashSet f6741h;

    /* renamed from: i */
    public InterfaceC1986a f6742i;

    /* renamed from: j */
    public PorterDuff.Mode f6743j;

    /* renamed from: k */
    public ColorStateList f6744k;

    /* renamed from: l */
    public Drawable f6745l;

    /* renamed from: m */
    public int f6746m;

    /* renamed from: n */
    public int f6747n;

    /* renamed from: o */
    public int f6748o;

    /* renamed from: p */
    public int f6749p;

    /* renamed from: q */
    public boolean f6750q;

    /* renamed from: r */
    public boolean f6751r;

    /* renamed from: s */
    public int f6752s;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C1987b();

        /* renamed from: d */
        public boolean f6753d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                SavedState.class.getClassLoader();
            }
            this.f6753d = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            parcel.writeInt(this.f6753d ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r6, r7), attributeSet, r6);
        int i = AbstractC1804b.materialButtonStyle;
        int i2 = f6739f;
        this.f6741h = new LinkedHashSet();
        this.f6750q = false;
        this.f6751r = false;
        Context context2 = getContext();
        TypedArray m764d = AbstractC1822r.m764d(context2, attributeSet, AbstractC1940l.MaterialButton, i, i2, new int[0]);
        this.f6749p = m764d.getDimensionPixelSize(AbstractC1940l.MaterialButton_iconPadding, 0);
        this.f6743j = AbstractC1077v0.m1291M(m764d.getInt(AbstractC1940l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f6744k = AbstractC1077v0.m1262q(getContext(), m764d, AbstractC1940l.MaterialButton_iconTint);
        this.f6745l = AbstractC1077v0.m1260s(getContext(), m764d, AbstractC1940l.MaterialButton_icon);
        this.f6752s = m764d.getInteger(AbstractC1940l.MaterialButton_iconGravity, 1);
        this.f6746m = m764d.getDimensionPixelSize(AbstractC1940l.MaterialButton_iconSize, 0);
        C1988c c1988c = new C1988c(this, C1856n.m719b(context2, attributeSet, i, i2).m727a());
        this.f6740g = c1988c;
        c1988c.f6017d = m764d.getDimensionPixelOffset(AbstractC1940l.MaterialButton_android_insetLeft, 0);
        c1988c.f6018e = m764d.getDimensionPixelOffset(AbstractC1940l.MaterialButton_android_insetRight, 0);
        c1988c.f6019f = m764d.getDimensionPixelOffset(AbstractC1940l.MaterialButton_android_insetTop, 0);
        c1988c.f6020g = m764d.getDimensionPixelOffset(AbstractC1940l.MaterialButton_android_insetBottom, 0);
        int i3 = AbstractC1940l.MaterialButton_cornerRadius;
        if (m764d.hasValue(i3)) {
            int dimensionPixelSize = m764d.getDimensionPixelSize(i3, -1);
            c1988c.f6021h = dimensionPixelSize;
            c1988c.m623e(c1988c.f6016c.m716e(dimensionPixelSize));
            c1988c.f6030q = true;
        }
        c1988c.f6022i = m764d.getDimensionPixelSize(AbstractC1940l.MaterialButton_strokeWidth, 0);
        c1988c.f6023j = AbstractC1077v0.m1291M(m764d.getInt(AbstractC1940l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        c1988c.f6024k = AbstractC1077v0.m1262q(getContext(), m764d, AbstractC1940l.MaterialButton_backgroundTint);
        c1988c.f6025l = AbstractC1077v0.m1262q(getContext(), m764d, AbstractC1940l.MaterialButton_strokeColor);
        c1988c.f6026m = AbstractC1077v0.m1262q(getContext(), m764d, AbstractC1940l.MaterialButton_rippleColor);
        c1988c.f6031r = m764d.getBoolean(AbstractC1940l.MaterialButton_android_checkable, false);
        c1988c.f6033t = m764d.getDimensionPixelSize(AbstractC1940l.MaterialButton_elevation, 0);
        int m2237u = AbstractC0605j0.m2237u(this);
        int paddingTop = getPaddingTop();
        int m2238t = AbstractC0605j0.m2238t(this);
        int paddingBottom = getPaddingBottom();
        if (m764d.hasValue(AbstractC1940l.MaterialButton_android_background)) {
            c1988c.f6029p = true;
            setSupportBackgroundTintList(c1988c.f6024k);
            setSupportBackgroundTintMode(c1988c.f6023j);
        } else {
            c1988c.m621g();
        }
        AbstractC0605j0.m2261V(this, m2237u + c1988c.f6017d, paddingTop + c1988c.f6019f, m2238t + c1988c.f6018e, paddingBottom + c1988c.f6020g);
        m764d.recycle();
        setCompoundDrawablePadding(this.f6749p);
        m316g(this.f6745l != null);
    }

    private String getA11yClassName() {
        return (m322a() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: a */
    public boolean m322a() {
        C1988c c1988c = this.f6740g;
        return c1988c != null && c1988c.f6031r;
    }

    /* renamed from: b */
    public final boolean m321b() {
        int i = this.f6752s;
        return i == 3 || i == 4;
    }

    /* renamed from: c */
    public final boolean m320c() {
        int i = this.f6752s;
        return i == 1 || i == 2;
    }

    /* renamed from: d */
    public final boolean m319d() {
        int i = this.f6752s;
        return i == 16 || i == 32;
    }

    /* renamed from: e */
    public final boolean m318e() {
        C1988c c1988c = this.f6740g;
        return (c1988c == null || c1988c.f6029p) ? false : true;
    }

    /* renamed from: f */
    public final void m317f() {
        if (m320c()) {
            AbstractC0022t.m3506a0(this, this.f6745l, null, null, null);
        } else if (m321b()) {
            AbstractC0022t.m3506a0(this, null, null, this.f6745l, null);
        } else if (m319d()) {
            AbstractC0022t.m3506a0(this, null, this.f6745l, null, null);
        }
    }

    /* renamed from: g */
    public final void m316g(boolean z) {
        Drawable drawable = this.f6745l;
        if (drawable != null) {
            Drawable mutate = AbstractC0022t.m3466u0(drawable).mutate();
            this.f6745l = mutate;
            AbstractC0022t.m3480n0(mutate, this.f6744k);
            PorterDuff.Mode mode = this.f6743j;
            if (mode != null) {
                AbstractC0022t.m3478o0(this.f6745l, mode);
            }
            int i = this.f6746m;
            if (i == 0) {
                i = this.f6745l.getIntrinsicWidth();
            }
            int i2 = this.f6746m;
            if (i2 == 0) {
                i2 = this.f6745l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6745l;
            int i3 = this.f6747n;
            int i4 = this.f6748o;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            m317f();
            return;
        }
        Drawable[] m3531C = AbstractC0022t.m3531C(this);
        boolean z2 = false;
        Drawable drawable3 = m3531C[0];
        Drawable drawable4 = m3531C[1];
        Drawable drawable5 = m3531C[2];
        if ((m320c() && drawable3 != this.f6745l) || ((m321b() && drawable5 != this.f6745l) || (m319d() && drawable4 != this.f6745l))) {
            z2 = true;
        }
        if (z2) {
            m317f();
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m318e()) {
            return this.f6740g.f6021h;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6745l;
    }

    public int getIconGravity() {
        return this.f6752s;
    }

    public int getIconPadding() {
        return this.f6749p;
    }

    public int getIconSize() {
        return this.f6746m;
    }

    public ColorStateList getIconTint() {
        return this.f6744k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6743j;
    }

    public int getInsetBottom() {
        return this.f6740g.f6020g;
    }

    public int getInsetTop() {
        return this.f6740g.f6019f;
    }

    public ColorStateList getRippleColor() {
        if (m318e()) {
            return this.f6740g.f6026m;
        }
        return null;
    }

    public C1856n getShapeAppearanceModel() {
        if (m318e()) {
            return this.f6740g.f6016c;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m318e()) {
            return this.f6740g.f6025l;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m318e()) {
            return this.f6740g.f6022i;
        }
        return 0;
    }

    @Override // p010b.p016c.p026q.C0338y, p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        if (m318e()) {
            return this.f6740g.f6024k;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // p010b.p016c.p026q.C0338y, p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m318e()) {
            return this.f6740g.f6023j;
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final void m315h(int i, int i2) {
        if (this.f6745l == null || getLayout() == null) {
            return;
        }
        if (!m320c() && !m321b()) {
            if (m319d()) {
                this.f6747n = 0;
                if (this.f6752s == 16) {
                    this.f6748o = 0;
                    m316g(false);
                    return;
                }
                int i3 = this.f6746m;
                if (i3 == 0) {
                    i3 = this.f6745l.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.f6749p) - getPaddingBottom()) / 2;
                if (this.f6748o != textHeight) {
                    this.f6748o = textHeight;
                    m316g(false);
                }
                return;
            }
            return;
        }
        this.f6748o = 0;
        int i4 = this.f6752s;
        if (i4 == 1 || i4 == 3) {
            this.f6747n = 0;
            m316g(false);
            return;
        }
        int i5 = this.f6746m;
        if (i5 == 0) {
            i5 = this.f6745l.getIntrinsicWidth();
        }
        int textWidth = (((((i - getTextWidth()) - AbstractC0605j0.m2238t(this)) - i5) - this.f6749p) - AbstractC0605j0.m2237u(this)) / 2;
        if ((AbstractC0605j0.m2241q(this) == 1) != (this.f6752s == 4)) {
            textWidth = -textWidth;
        }
        if (this.f6747n != textWidth) {
            this.f6747n = textWidth;
            m316g(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f6750q;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m318e()) {
            AbstractC1077v0.m1280X(this, this.f6740g.m626b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m322a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f6737d);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f6738e);
        }
        return onCreateDrawableState;
    }

    @Override // p010b.p016c.p026q.C0338y, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // p010b.p016c.p026q.C0338y, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m322a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p010b.p016c.p026q.C0338y, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1988c c1988c;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (c1988c = this.f6740g) == null) {
            return;
        }
        int i5 = i4 - i2;
        int i6 = i3 - i;
        Drawable drawable = c1988c.f6027n;
        if (drawable != null) {
            drawable.setBounds(c1988c.f6017d, c1988c.f6019f, i6 - c1988c.f6018e, i5 - c1988c.f6020g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f511c);
        setChecked(savedState.f6753d);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6753d = this.f6750q;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m315h(i, i2);
    }

    @Override // p010b.p016c.p026q.C0338y, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m315h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m318e()) {
            C1988c c1988c = this.f6740g;
            if (c1988c.m626b() != null) {
                c1988c.m626b().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // p010b.p016c.p026q.C0338y, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m318e()) {
            if (drawable != getBackground()) {
                C1988c c1988c = this.f6740g;
                c1988c.f6029p = true;
                c1988c.f6015b.setSupportBackgroundTintList(c1988c.f6024k);
                c1988c.f6015b.setSupportBackgroundTintMode(c1988c.f6023j);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // p010b.p016c.p026q.C0338y, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0142b.m3000b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m318e()) {
            this.f6740g.f6031r = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m322a() && isEnabled() && this.f6750q != z) {
            this.f6750q = z;
            refreshDrawableState();
            if (this.f6751r) {
                return;
            }
            this.f6751r = true;
            Iterator it = this.f6741h.iterator();
            while (it.hasNext()) {
                C1991f c1991f = (C1991f) it.next();
                boolean z2 = this.f6750q;
                MaterialButtonToggleGroup materialButtonToggleGroup = c1991f.f6036a;
                if (!materialButtonToggleGroup.f6762j) {
                    if (materialButtonToggleGroup.f6763k) {
                        materialButtonToggleGroup.f6765m = z2 ? getId() : -1;
                    }
                    if (c1991f.f6036a.m309f(getId(), z2)) {
                        c1991f.f6036a.m313b(getId(), isChecked());
                    }
                    c1991f.f6036a.invalidate();
                }
            }
            this.f6751r = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m318e()) {
            C1988c c1988c = this.f6740g;
            if (c1988c.f6030q && c1988c.f6021h == i) {
                return;
            }
            c1988c.f6021h = i;
            c1988c.f6030q = true;
            c1988c.m623e(c1988c.f6016c.m716e(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m318e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m318e()) {
            C1851i m626b = this.f6740g.m626b();
            C1850h c1850h = m626b.f5657d;
            if (c1850h.f5647o != f) {
                c1850h.f5647o = f;
                m626b.m730w();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6745l != drawable) {
            this.f6745l = drawable;
            m316g(true);
            m315h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f6752s != i) {
            this.f6752s = i;
            m315h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f6749p != i) {
            this.f6749p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0142b.m3000b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f6746m != i) {
            this.f6746m = i;
            m316g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6744k != colorStateList) {
            this.f6744k = colorStateList;
            m316g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6743j != mode) {
            this.f6743j = mode;
            m316g(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC0142b.m3001a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C1988c c1988c = this.f6740g;
        c1988c.m622f(c1988c.f6019f, i);
    }

    public void setInsetTop(int i) {
        C1988c c1988c = this.f6740g;
        c1988c.m622f(i, c1988c.f6020g);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1986a interfaceC1986a) {
        this.f6742i = interfaceC1986a;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC1986a interfaceC1986a = this.f6742i;
        if (interfaceC1986a != null) {
            ((C1993h) interfaceC1986a).f6042a.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m318e()) {
            C1988c c1988c = this.f6740g;
            if (c1988c.f6026m != colorStateList) {
                c1988c.f6026m = colorStateList;
                boolean z = C1988c.f6014a;
                if (z && (c1988c.f6015b.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) c1988c.f6015b.getBackground()).setColor(AbstractC1839d.m754b(colorStateList));
                } else if (z || !(c1988c.f6015b.getBackground() instanceof C1838c)) {
                } else {
                    ((C1838c) c1988c.f6015b.getBackground()).setTintList(AbstractC1839d.m754b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m318e()) {
            setRippleColor(AbstractC0142b.m3001a(getContext(), i));
        }
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.InterfaceC1867y
    public void setShapeAppearanceModel(C1856n c1856n) {
        if (!m318e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f6740g.m623e(c1856n);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m318e()) {
            C1988c c1988c = this.f6740g;
            c1988c.f6028o = z;
            c1988c.m620h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m318e()) {
            C1988c c1988c = this.f6740g;
            if (c1988c.f6025l != colorStateList) {
                c1988c.f6025l = colorStateList;
                c1988c.m620h();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m318e()) {
            setStrokeColor(AbstractC0142b.m3001a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m318e()) {
            C1988c c1988c = this.f6740g;
            if (c1988c.f6022i != i) {
                c1988c.f6022i = i;
                c1988c.m620h();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m318e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p010b.p016c.p026q.C0338y, p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m318e()) {
            C1988c c1988c = this.f6740g;
            if (c1988c.f6024k != colorStateList) {
                c1988c.f6024k = colorStateList;
                if (c1988c.m626b() != null) {
                    AbstractC0022t.m3480n0(c1988c.m626b(), c1988c.f6024k);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // p010b.p016c.p026q.C0338y, p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m318e()) {
            C1988c c1988c = this.f6740g;
            if (c1988c.f6023j != mode) {
                c1988c.f6023j = mode;
                if (c1988c.m626b() == null || c1988c.f6023j == null) {
                    return;
                }
                AbstractC0022t.m3478o0(c1988c.m626b(), c1988c.f6023j);
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f6750q);
    }
}