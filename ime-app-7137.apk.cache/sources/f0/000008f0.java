package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p026q.C0343z;
import p010b.p046j.p056j.C0550b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.C0579d;
import p010b.p064l.p066b.AbstractC0659d;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p151d0.AbstractC1834e;
import p093c.p145g.p146a.p147a.p151d0.C1833d;
import p093c.p145g.p146a.p147a.p152e0.AbstractC1839d;
import p093c.p145g.p146a.p147a.p154g0.C1850h;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p154g0.InterfaceC1867y;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;
import p093c.p145g.p146a.p147a.p161m.C1948c;
import p093c.p145g.p146a.p147a.p170v.C1995a;
import p093c.p145g.p146a.p147a.p170v.C1996b;
import p093c.p145g.p146a.p147a.p170v.C1997c;
import p093c.p145g.p146a.p147a.p170v.C1999e;
import p093c.p145g.p146a.p147a.p170v.InterfaceC1998d;

/* loaded from: classes.dex */
public class Chip extends C0343z implements InterfaceC1998d, InterfaceC1867y {

    /* renamed from: e */
    public static final int f6766e = AbstractC1926k.Widget_MaterialComponents_Chip_Action;

    /* renamed from: f */
    public static final Rect f6767f = new Rect();

    /* renamed from: g */
    public static final int[] f6768g = {16842913};

    /* renamed from: h */
    public static final int[] f6769h = {16842911};

    /* renamed from: i */
    public C1999e f6770i;

    /* renamed from: j */
    public InsetDrawable f6771j;

    /* renamed from: k */
    public RippleDrawable f6772k;

    /* renamed from: l */
    public View.OnClickListener f6773l;

    /* renamed from: m */
    public CompoundButton.OnCheckedChangeListener f6774m;

    /* renamed from: n */
    public boolean f6775n;

    /* renamed from: o */
    public boolean f6776o;

    /* renamed from: p */
    public boolean f6777p;

    /* renamed from: q */
    public boolean f6778q;

    /* renamed from: r */
    public boolean f6779r;

    /* renamed from: s */
    public int f6780s;

    /* renamed from: t */
    public int f6781t;

    /* renamed from: u */
    public final C1997c f6782u;

    /* renamed from: v */
    public final Rect f6783v;

    /* renamed from: w */
    public final RectF f6784w;

    /* renamed from: x */
    public final AbstractC1834e f6785x;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r8, r9), attributeSet, r8);
        TextUtils.TruncateAt truncateAt;
        int i;
        int i2;
        int i3;
        boolean hasValue;
        int resourceId;
        int i4 = AbstractC1804b.chipStyle;
        int i5 = f6766e;
        this.f6783v = new Rect();
        this.f6784w = new RectF();
        this.f6785x = new C1995a(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        C1999e c1999e = new C1999e(context2, attributeSet, i4, i5);
        Context context3 = c1999e.f6095i0;
        int[] iArr = AbstractC1940l.Chip;
        TypedArray m764d = AbstractC1822r.m764d(context3, attributeSet, iArr, i4, i5, new int[0]);
        int i6 = AbstractC1940l.Chip_shapeAppearance;
        c1999e.f6070J0 = m764d.hasValue(i6);
        ColorStateList m1262q = AbstractC1077v0.m1262q(c1999e.f6095i0, m764d, AbstractC1940l.Chip_chipSurfaceColor);
        if (c1999e.f6053B != m1262q) {
            c1999e.f6053B = m1262q;
            c1999e.onStateChange(c1999e.getState());
        }
        c1999e.m600O(AbstractC1077v0.m1262q(c1999e.f6095i0, m764d, AbstractC1940l.Chip_chipBackgroundColor));
        c1999e.m593V(m764d.getDimension(AbstractC1940l.Chip_chipMinHeight, 0.0f));
        int i7 = AbstractC1940l.Chip_chipCornerRadius;
        if (m764d.hasValue(i7)) {
            c1999e.m599P(m764d.getDimension(i7, 0.0f));
        }
        c1999e.m591X(AbstractC1077v0.m1262q(c1999e.f6095i0, m764d, AbstractC1940l.Chip_chipStrokeColor));
        c1999e.m590Y(m764d.getDimension(AbstractC1940l.Chip_chipStrokeWidth, 0.0f));
        c1999e.m579i0(AbstractC1077v0.m1262q(c1999e.f6095i0, m764d, AbstractC1940l.Chip_rippleColor));
        c1999e.m578j0(m764d.getText(AbstractC1940l.Chip_android_text));
        Context context4 = c1999e.f6095i0;
        int i8 = AbstractC1940l.Chip_android_textAppearance;
        C1833d c1833d = (!m764d.hasValue(i8) || (resourceId = m764d.getResourceId(i8, 0)) == 0) ? null : new C1833d(context4, resourceId);
        c1833d.f5596k = m764d.getDimension(AbstractC1940l.Chip_android_textSize, c1833d.f5596k);
        c1999e.f6101o0.m772b(c1833d, c1999e.f6095i0);
        int i9 = m764d.getInt(AbstractC1940l.Chip_android_ellipsize, 0);
        if (i9 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i9 != 2) {
            if (i9 == 3) {
                truncateAt = TextUtils.TruncateAt.END;
            }
            c1999e.m594U(m764d.getBoolean(AbstractC1940l.Chip_chipIconVisible, false));
            if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                c1999e.m594U(m764d.getBoolean(AbstractC1940l.Chip_chipIconEnabled, false));
            }
            c1999e.m597R(AbstractC1077v0.m1260s(c1999e.f6095i0, m764d, AbstractC1940l.Chip_chipIcon));
            i = AbstractC1940l.Chip_chipIconTint;
            if (m764d.hasValue(i)) {
                c1999e.m595T(AbstractC1077v0.m1262q(c1999e.f6095i0, m764d, i));
            }
            c1999e.m596S(m764d.getDimension(AbstractC1940l.Chip_chipIconSize, -1.0f));
            c1999e.m582f0(m764d.getBoolean(AbstractC1940l.Chip_closeIconVisible, false));
            if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                c1999e.m582f0(m764d.getBoolean(AbstractC1940l.Chip_closeIconEnabled, false));
            }
            c1999e.m589Z(AbstractC1077v0.m1260s(c1999e.f6095i0, m764d, AbstractC1940l.Chip_closeIcon));
            c1999e.m583e0(AbstractC1077v0.m1262q(c1999e.f6095i0, m764d, AbstractC1940l.Chip_closeIconTint));
            c1999e.m586b0(m764d.getDimension(AbstractC1940l.Chip_closeIconSize, 0.0f));
            c1999e.m604K(m764d.getBoolean(AbstractC1940l.Chip_android_checkable, false));
            c1999e.m601N(m764d.getBoolean(AbstractC1940l.Chip_checkedIconVisible, false));
            if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                c1999e.m601N(m764d.getBoolean(AbstractC1940l.Chip_checkedIconEnabled, false));
            }
            c1999e.m603L(AbstractC1077v0.m1260s(c1999e.f6095i0, m764d, AbstractC1940l.Chip_checkedIcon));
            i2 = AbstractC1940l.Chip_checkedIconTint;
            if (m764d.hasValue(i2)) {
                c1999e.m602M(AbstractC1077v0.m1262q(c1999e.f6095i0, m764d, i2));
            }
            c1999e.f6085Y = C1948c.m674a(c1999e.f6095i0, m764d, AbstractC1940l.Chip_showMotionSpec);
            c1999e.f6086Z = C1948c.m674a(c1999e.f6095i0, m764d, AbstractC1940l.Chip_hideMotionSpec);
            c1999e.m592W(m764d.getDimension(AbstractC1940l.Chip_chipStartPadding, 0.0f));
            c1999e.m580h0(m764d.getDimension(AbstractC1940l.Chip_iconStartPadding, 0.0f));
            c1999e.m581g0(m764d.getDimension(AbstractC1940l.Chip_iconEndPadding, 0.0f));
            c1999e.m576l0(m764d.getDimension(AbstractC1940l.Chip_textStartPadding, 0.0f));
            c1999e.m577k0(m764d.getDimension(AbstractC1940l.Chip_textEndPadding, 0.0f));
            c1999e.m585c0(m764d.getDimension(AbstractC1940l.Chip_closeIconStartPadding, 0.0f));
            c1999e.m587a0(m764d.getDimension(AbstractC1940l.Chip_closeIconEndPadding, 0.0f));
            c1999e.m598Q(m764d.getDimension(AbstractC1940l.Chip_chipEndPadding, 0.0f));
            c1999e.f6068I0 = m764d.getDimensionPixelSize(AbstractC1940l.Chip_android_maxWidth, Integer.MAX_VALUE);
            m764d.recycle();
            AbstractC1822r.m767a(context2, attributeSet, i4, i5);
            AbstractC1822r.m766b(context2, attributeSet, iArr, i4, i5, new int[0]);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i4, i5);
            this.f6779r = obtainStyledAttributes.getBoolean(AbstractC1940l.Chip_ensureMinTouchTargetSize, false);
            this.f6781t = (int) Math.ceil(obtainStyledAttributes.getDimension(AbstractC1940l.Chip_chipMinTouchTargetSize, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
            obtainStyledAttributes.recycle();
            setChipDrawable(c1999e);
            c1999e.m738o(AbstractC0605j0.m2245m(this));
            AbstractC1822r.m767a(context2, attributeSet, i4, i5);
            AbstractC1822r.m766b(context2, attributeSet, iArr, i4, i5, new int[0]);
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i4, i5);
            i3 = Build.VERSION.SDK_INT;
            if (i3 < 23) {
                setTextColor(AbstractC1077v0.m1262q(context2, obtainStyledAttributes2, AbstractC1940l.Chip_android_textColor));
            }
            hasValue = obtainStyledAttributes2.hasValue(i6);
            obtainStyledAttributes2.recycle();
            this.f6782u = new C1997c(this, this);
            m301g();
            if (!hasValue && i3 >= 21) {
                setOutlineProvider(new C1996b(this));
            }
            setChecked(this.f6775n);
            setText(c1999e.f6067I);
            setEllipsize(c1999e.f6064G0);
            m297k();
            if (!this.f6770i.f6066H0) {
                setLines(1);
                setHorizontallyScrolling(true);
            }
            setGravity(8388627);
            m298j();
            if (this.f6779r) {
                setMinHeight(this.f6781t);
            }
            this.f6780s = AbstractC0605j0.m2241q(this);
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        c1999e.f6064G0 = truncateAt;
        c1999e.m594U(m764d.getBoolean(AbstractC1940l.Chip_chipIconVisible, false));
        if (attributeSet != null) {
            c1999e.m594U(m764d.getBoolean(AbstractC1940l.Chip_chipIconEnabled, false));
        }
        c1999e.m597R(AbstractC1077v0.m1260s(c1999e.f6095i0, m764d, AbstractC1940l.Chip_chipIcon));
        i = AbstractC1940l.Chip_chipIconTint;
        if (m764d.hasValue(i)) {
        }
        c1999e.m596S(m764d.getDimension(AbstractC1940l.Chip_chipIconSize, -1.0f));
        c1999e.m582f0(m764d.getBoolean(AbstractC1940l.Chip_closeIconVisible, false));
        if (attributeSet != null) {
            c1999e.m582f0(m764d.getBoolean(AbstractC1940l.Chip_closeIconEnabled, false));
        }
        c1999e.m589Z(AbstractC1077v0.m1260s(c1999e.f6095i0, m764d, AbstractC1940l.Chip_closeIcon));
        c1999e.m583e0(AbstractC1077v0.m1262q(c1999e.f6095i0, m764d, AbstractC1940l.Chip_closeIconTint));
        c1999e.m586b0(m764d.getDimension(AbstractC1940l.Chip_closeIconSize, 0.0f));
        c1999e.m604K(m764d.getBoolean(AbstractC1940l.Chip_android_checkable, false));
        c1999e.m601N(m764d.getBoolean(AbstractC1940l.Chip_checkedIconVisible, false));
        if (attributeSet != null) {
            c1999e.m601N(m764d.getBoolean(AbstractC1940l.Chip_checkedIconEnabled, false));
        }
        c1999e.m603L(AbstractC1077v0.m1260s(c1999e.f6095i0, m764d, AbstractC1940l.Chip_checkedIcon));
        i2 = AbstractC1940l.Chip_checkedIconTint;
        if (m764d.hasValue(i2)) {
        }
        c1999e.f6085Y = C1948c.m674a(c1999e.f6095i0, m764d, AbstractC1940l.Chip_showMotionSpec);
        c1999e.f6086Z = C1948c.m674a(c1999e.f6095i0, m764d, AbstractC1940l.Chip_hideMotionSpec);
        c1999e.m592W(m764d.getDimension(AbstractC1940l.Chip_chipStartPadding, 0.0f));
        c1999e.m580h0(m764d.getDimension(AbstractC1940l.Chip_iconStartPadding, 0.0f));
        c1999e.m581g0(m764d.getDimension(AbstractC1940l.Chip_iconEndPadding, 0.0f));
        c1999e.m576l0(m764d.getDimension(AbstractC1940l.Chip_textStartPadding, 0.0f));
        c1999e.m577k0(m764d.getDimension(AbstractC1940l.Chip_textEndPadding, 0.0f));
        c1999e.m585c0(m764d.getDimension(AbstractC1940l.Chip_closeIconStartPadding, 0.0f));
        c1999e.m587a0(m764d.getDimension(AbstractC1940l.Chip_closeIconEndPadding, 0.0f));
        c1999e.m598Q(m764d.getDimension(AbstractC1940l.Chip_chipEndPadding, 0.0f));
        c1999e.f6068I0 = m764d.getDimensionPixelSize(AbstractC1940l.Chip_android_maxWidth, Integer.MAX_VALUE);
        m764d.recycle();
        AbstractC1822r.m767a(context2, attributeSet, i4, i5);
        AbstractC1822r.m766b(context2, attributeSet, iArr, i4, i5, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i4, i5);
        this.f6779r = obtainStyledAttributes3.getBoolean(AbstractC1940l.Chip_ensureMinTouchTargetSize, false);
        this.f6781t = (int) Math.ceil(obtainStyledAttributes3.getDimension(AbstractC1940l.Chip_chipMinTouchTargetSize, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes3.recycle();
        setChipDrawable(c1999e);
        c1999e.m738o(AbstractC0605j0.m2245m(this));
        AbstractC1822r.m767a(context2, attributeSet, i4, i5);
        AbstractC1822r.m766b(context2, attributeSet, iArr, i4, i5, new int[0]);
        TypedArray obtainStyledAttributes22 = context2.obtainStyledAttributes(attributeSet, iArr, i4, i5);
        i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
        }
        hasValue = obtainStyledAttributes22.hasValue(i6);
        obtainStyledAttributes22.recycle();
        this.f6782u = new C1997c(this, this);
        m301g();
        if (!hasValue) {
            setOutlineProvider(new C1996b(this));
        }
        setChecked(this.f6775n);
        setText(c1999e.f6067I);
        setEllipsize(c1999e.f6064G0);
        m297k();
        if (!this.f6770i.f6066H0) {
        }
        setGravity(8388627);
        m298j();
        if (this.f6779r) {
        }
        this.f6780s = AbstractC0605j0.m2241q(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f6784w.setEmpty();
        if (m304d() && this.f6773l != null) {
            C1999e c1999e = this.f6770i;
            c1999e.m613B(c1999e.getBounds(), this.f6784w);
        }
        return this.f6784w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f6783v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f6783v;
    }

    private C1833d getTextAppearance() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6101o0.f5564f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f6777p != z) {
            this.f6777p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f6776o != z) {
            this.f6776o = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        if (getMinWidth() != r10) goto L42;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m305c(int i) {
        this.f6781t = i;
        if (!this.f6779r) {
            if (this.f6771j != null) {
                m302f();
            } else {
                m300h();
            }
            return false;
        }
        int max = Math.max(0, i - ((int) this.f6770i.f6057D));
        int max2 = Math.max(0, i - this.f6770i.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f6771j != null) {
                m302f();
            } else {
                m300h();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f6771j != null) {
            Rect rect = new Rect();
            this.f6771j.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m300h();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT < 16) {
            setMinHeight(i);
        } else if (getMinHeight() != i) {
            setMinHeight(i);
        }
        setMinWidth(i);
        this.f6771j = new InsetDrawable((Drawable) this.f6770i, i2, i3, i2, i3);
        m300h();
        return true;
    }

    /* renamed from: d */
    public final boolean m304d() {
        C1999e c1999e = this.f6770i;
        return (c1999e == null || c1999e.m610E() == null) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (r1 != Integer.MIN_VALUE) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Field declaredField;
        boolean z;
        boolean z2;
        int i;
        if (motionEvent.getAction() == 10) {
            try {
                declaredField = AbstractC0659d.class.getDeclaredField("p");
                declaredField.setAccessible(true);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (((Integer) declaredField.get(this.f6782u)).intValue() != Integer.MIN_VALUE) {
                Method declaredMethod = AbstractC0659d.class.getDeclaredMethod("t", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.f6782u, Integer.MIN_VALUE);
                z = true;
                if (!z) {
                    C1997c c1997c = this.f6782u;
                    if (c1997c.f2864k.isEnabled() && c1997c.f2864k.isTouchExplorationEnabled()) {
                        int action = motionEvent.getAction();
                        if (action == 7 || action == 9) {
                            int i2 = (c1997c.f6049q.m304d() && c1997c.f6049q.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY())) ? 1 : 0;
                            int i3 = c1997c.f2869p;
                            if (i3 != i2) {
                                c1997c.f2869p = i2;
                                c1997c.m2146s(i2, 128);
                                c1997c.m2146s(i3, 256);
                            }
                        } else if (action == 10 && (i = c1997c.f2869p) != Integer.MIN_VALUE) {
                            if (i != Integer.MIN_VALUE) {
                                c1997c.f2869p = Integer.MIN_VALUE;
                                c1997c.m2146s(Integer.MIN_VALUE, 128);
                                c1997c.m2146s(i, 256);
                            }
                            z2 = true;
                        }
                        if (z2 && !super.dispatchHoverEvent(motionEvent)) {
                            return false;
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                return true;
            }
        }
        z = false;
        if (!z) {
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C1997c c1997c = this.f6782u;
        c1997c.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && c1997c.m2149n(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = c1997c.f2868o;
                    if (i3 != Integer.MIN_VALUE) {
                        c1997c.mo616p(i3, 16, null);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = c1997c.m2149n(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = c1997c.m2149n(1, null);
            }
        }
        if (!z || this.f6782u.f2868o == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p010b.p016c.p026q.C0343z, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1999e c1999e = this.f6770i;
        boolean z = false;
        int i = 0;
        z = false;
        if (c1999e != null && C1999e.m607H(c1999e.f6076P)) {
            C1999e c1999e2 = this.f6770i;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f6778q) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f6777p) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f6776o) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f6778q) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f6777p) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f6776o) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = c1999e2.m584d0(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public boolean m303e() {
        C1999e c1999e = this.f6770i;
        return c1999e != null && c1999e.f6081U;
    }

    /* renamed from: f */
    public final void m302f() {
        if (this.f6771j != null) {
            this.f6771j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m300h();
        }
    }

    /* renamed from: g */
    public final void m301g() {
        C1997c c1997c;
        if (m304d()) {
            C1999e c1999e = this.f6770i;
            if ((c1999e != null && c1999e.f6075O) && this.f6773l != null) {
                c1997c = this.f6782u;
                AbstractC0605j0.m2269N(this, c1997c);
            }
        }
        c1997c = null;
        AbstractC0605j0.m2269N(this, c1997c);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6771j;
        return insetDrawable == null ? this.f6770i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6083W;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6084X;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6055C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return Math.max(0.0f, c1999e.m611D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6770i;
    }

    public float getChipEndPadding() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6094h0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C1999e c1999e = this.f6770i;
        if (c1999e == null || (drawable = c1999e.f6071K) == null) {
            return null;
        }
        return AbstractC0022t.m3468t0(drawable);
    }

    public float getChipIconSize() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6073M;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6072L;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6057D;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6087a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6061F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6063G;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.m610E();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6080T;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6093g0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6079S;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6092f0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6078R;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6064G0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        C1997c c1997c = this.f6782u;
        if (c1997c.f2868o == 1 || c1997c.f2867n == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C1948c getHideMotionSpec() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6086Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6089c0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6088b0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6065H;
        }
        return null;
    }

    public C1856n getShapeAppearanceModel() {
        return this.f6770i.f5657d.f5633a;
    }

    public C1948c getShowMotionSpec() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6085Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6091e0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            return c1999e.f6090d0;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void m300h() {
        if (AbstractC1839d.f5603a) {
            m299i();
            return;
        }
        this.f6770i.m575m0(true);
        Drawable backgroundDrawable = getBackgroundDrawable();
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(backgroundDrawable);
        } else {
            setBackgroundDrawable(backgroundDrawable);
        }
        m298j();
        if (getBackgroundDrawable() == this.f6771j && this.f6770i.getCallback() == null) {
            this.f6770i.setCallback(this.f6771j);
        }
    }

    /* renamed from: i */
    public final void m299i() {
        this.f6772k = new RippleDrawable(AbstractC1839d.m754b(this.f6770i.f6065H), getBackgroundDrawable(), null);
        this.f6770i.m575m0(false);
        RippleDrawable rippleDrawable = this.f6772k;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(rippleDrawable);
        } else {
            setBackgroundDrawable(rippleDrawable);
        }
        m298j();
    }

    /* renamed from: j */
    public final void m298j() {
        C1999e c1999e;
        if (TextUtils.isEmpty(getText()) || (c1999e = this.f6770i) == null) {
            return;
        }
        int m612C = (int) (c1999e.m612C() + c1999e.f6094h0 + c1999e.f6091e0);
        C1999e c1999e2 = this.f6770i;
        int m568z = (int) (c1999e2.m568z() + c1999e2.f6087a0 + c1999e2.f6090d0);
        if (this.f6771j != null) {
            Rect rect = new Rect();
            this.f6771j.getPadding(rect);
            m568z += rect.left;
            m612C += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 17) {
            setPaddingRelative(m568z, paddingTop, m612C, paddingBottom);
        } else {
            setPadding(m568z, paddingTop, m612C, paddingBottom);
        }
    }

    /* renamed from: k */
    public final void m297k() {
        TextPaint paint = getPaint();
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            paint.drawableState = c1999e.getState();
        }
        C1833d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m757c(getContext(), paint, this.f6785x);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1077v0.m1280X(this, this.f6770i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f6768g);
        }
        if (m303e()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f6769h);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C1997c c1997c = this.f6782u;
        int i2 = c1997c.f2868o;
        if (i2 != Integer.MIN_VALUE) {
            c1997c.m2151k(i2);
        }
        if (z) {
            c1997c.m2149n(i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((m303e() || isClickable()) ? m303e() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(m303e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f5537d) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        }
                        i3++;
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(AbstractC1840f.row_index_key);
            C0579d m2314a = C0579d.m2314a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i, 1, false, isChecked());
            if (Build.VERSION.SDK_INT >= 19) {
                accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) m2314a.f2701a);
            }
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f6780s != i) {
            this.f6780s = i;
            m298j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f6776o) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.f6776o) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f6773l;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                this.f6782u.m2146s(1, 1);
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6772k) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // p010b.p016c.p026q.C0343z, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6772k) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p010b.p016c.p026q.C0343z, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m604K(z);
        }
    }

    public void setCheckableResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m604K(c1999e.f6095i0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C1999e c1999e = this.f6770i;
        if (c1999e == null) {
            this.f6775n = z;
        } else if (c1999e.f6081U) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.f6774m) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m603L(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m603L(AbstractC0142b.m3000b(c1999e.f6095i0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m602M(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m602M(AbstractC0142b.m3001a(c1999e.f6095i0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m601N(c1999e.f6095i0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m601N(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1999e c1999e = this.f6770i;
        if (c1999e == null || c1999e.f6055C == colorStateList) {
            return;
        }
        c1999e.f6055C = colorStateList;
        c1999e.onStateChange(c1999e.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m600O(AbstractC0142b.m3001a(c1999e.f6095i0, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m599P(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m599P(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C1999e c1999e) {
        C1999e c1999e2 = this.f6770i;
        if (c1999e2 != c1999e) {
            if (c1999e2 != null) {
                c1999e2.f6062F0 = new WeakReference(null);
            }
            this.f6770i = c1999e;
            c1999e.f6066H0 = false;
            c1999e.getClass();
            c1999e.f6062F0 = new WeakReference(this);
            m305c(this.f6781t);
        }
    }

    public void setChipEndPadding(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e == null || c1999e.f6094h0 == f) {
            return;
        }
        c1999e.f6094h0 = f;
        c1999e.invalidateSelf();
        c1999e.m606I();
    }

    public void setChipEndPaddingResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m598Q(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m597R(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m597R(AbstractC0142b.m3000b(c1999e.f6095i0, i));
        }
    }

    public void setChipIconSize(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m596S(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m596S(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m595T(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m595T(AbstractC0142b.m3001a(c1999e.f6095i0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m594U(c1999e.f6095i0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m594U(z);
        }
    }

    public void setChipMinHeight(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e == null || c1999e.f6057D == f) {
            return;
        }
        c1999e.f6057D = f;
        c1999e.invalidateSelf();
        c1999e.m606I();
    }

    public void setChipMinHeightResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m593V(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e == null || c1999e.f6087a0 == f) {
            return;
        }
        c1999e.f6087a0 = f;
        c1999e.invalidateSelf();
        c1999e.m606I();
    }

    public void setChipStartPaddingResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m592W(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m591X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m591X(AbstractC0142b.m3001a(c1999e.f6095i0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m590Y(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m590Y(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m589Z(drawable);
        }
        m301g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1999e c1999e = this.f6770i;
        if (c1999e == null || c1999e.f6080T == charSequence) {
            return;
        }
        C0550b m2339c = C0550b.m2339c();
        c1999e.f6080T = m2339c.m2338d(charSequence, m2339c.f2639h, true);
        c1999e.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m587a0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m587a0(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m589Z(AbstractC0142b.m3000b(c1999e.f6095i0, i));
        }
        m301g();
    }

    public void setCloseIconSize(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m586b0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m586b0(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m585c0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m585c0(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m583e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m583e0(AbstractC0142b.m3001a(c1999e.f6095i0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m582f0(z);
        }
        m301g();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            C1850h c1850h = c1999e.f5657d;
            if (c1850h.f5647o != f) {
                c1850h.f5647o = f;
                c1999e.m730w();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6770i == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6064G0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f6779r = z;
        m305c(this.f6781t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(C1948c c1948c) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6086Z = c1948c;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6086Z = C1948c.m673b(c1999e.f6095i0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m581g0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m581g0(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m580h0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m580h0(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f6770i != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6068I0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6774m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6773l = onClickListener;
        m301g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m579i0(colorStateList);
        }
        if (this.f6770i.f6058D0) {
            return;
        }
        m299i();
    }

    public void setRippleColorResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m579i0(AbstractC0142b.m3001a(c1999e.f6095i0, i));
            if (this.f6770i.f6058D0) {
                return;
            }
            m299i();
        }
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.InterfaceC1867y
    public void setShapeAppearanceModel(C1856n c1856n) {
        C1999e c1999e = this.f6770i;
        c1999e.f5657d.f5633a = c1856n;
        c1999e.invalidateSelf();
    }

    public void setShowMotionSpec(C1948c c1948c) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6085Y = c1948c;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6085Y = C1948c.m673b(c1999e.f6095i0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1999e c1999e = this.f6770i;
        if (c1999e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1999e.f6066H0 ? null : charSequence, bufferType);
        C1999e c1999e2 = this.f6770i;
        if (c1999e2 != null) {
            c1999e2.m578j0(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6101o0.m772b(new C1833d(c1999e.f6095i0, i), c1999e.f6095i0);
        }
        m297k();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e == null || c1999e.f6091e0 == f) {
            return;
        }
        c1999e.f6091e0 = f;
        c1999e.invalidateSelf();
        c1999e.m606I();
    }

    public void setTextEndPaddingResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m577k0(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        C1999e c1999e = this.f6770i;
        if (c1999e == null || c1999e.f6090d0 == f) {
            return;
        }
        c1999e.f6090d0 = f;
        c1999e.invalidateSelf();
        c1999e.m606I();
    }

    public void setTextStartPaddingResource(int i) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.m576l0(c1999e.f6095i0.getResources().getDimension(i));
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6101o0.m772b(new C1833d(c1999e.f6095i0, i), c1999e.f6095i0);
        }
        m297k();
    }

    public void setTextAppearance(C1833d c1833d) {
        C1999e c1999e = this.f6770i;
        if (c1999e != null) {
            c1999e.f6101o0.m772b(c1833d, c1999e.f6095i0);
        }
        m297k();
    }
}