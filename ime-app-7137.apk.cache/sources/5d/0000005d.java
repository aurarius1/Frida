package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0082h;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p023o.C0159a;
import p010b.p016c.p026q.AbstractC0257h4;
import p010b.p016c.p026q.AbstractC0282m3;
import p010b.p016c.p026q.AbstractC0290o1;
import p010b.p016c.p026q.C0236e1;
import p010b.p016c.p026q.C0277l3;
import p010b.p016c.p026q.C0302q3;
import p010b.p046j.p058l.AbstractC0605j0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: b */
    public static final Property f312b = new C0277l3(Float.class, "thumbPos");

    /* renamed from: c */
    public static final int[] f313c = {16842912};

    /* renamed from: A */
    public float f314A;

    /* renamed from: B */
    public int f315B;

    /* renamed from: C */
    public int f316C;

    /* renamed from: D */
    public int f317D;

    /* renamed from: E */
    public int f318E;

    /* renamed from: F */
    public int f319F;

    /* renamed from: G */
    public int f320G;

    /* renamed from: H */
    public int f321H;

    /* renamed from: I */
    public final TextPaint f322I;

    /* renamed from: J */
    public ColorStateList f323J;

    /* renamed from: K */
    public Layout f324K;

    /* renamed from: L */
    public Layout f325L;

    /* renamed from: M */
    public TransformationMethod f326M;

    /* renamed from: N */
    public ObjectAnimator f327N;

    /* renamed from: O */
    public final C0236e1 f328O;

    /* renamed from: P */
    public final Rect f329P;

    /* renamed from: d */
    public Drawable f330d;

    /* renamed from: e */
    public ColorStateList f331e;

    /* renamed from: f */
    public PorterDuff.Mode f332f;

    /* renamed from: g */
    public boolean f333g;

    /* renamed from: h */
    public boolean f334h;

    /* renamed from: i */
    public Drawable f335i;

    /* renamed from: j */
    public ColorStateList f336j;

    /* renamed from: k */
    public PorterDuff.Mode f337k;

    /* renamed from: l */
    public boolean f338l;

    /* renamed from: m */
    public boolean f339m;

    /* renamed from: n */
    public int f340n;

    /* renamed from: o */
    public int f341o;

    /* renamed from: p */
    public int f342p;

    /* renamed from: q */
    public boolean f343q;

    /* renamed from: r */
    public CharSequence f344r;

    /* renamed from: s */
    public CharSequence f345s;

    /* renamed from: t */
    public boolean f346t;

    /* renamed from: u */
    public int f347u;

    /* renamed from: v */
    public int f348v;

    /* renamed from: w */
    public float f349w;

    /* renamed from: x */
    public float f350x;

    /* renamed from: y */
    public VelocityTracker f351y;

    /* renamed from: z */
    public int f352z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r10);
        Typeface typeface;
        int resourceId;
        int i = AbstractC0075a.switchStyle;
        this.f331e = null;
        this.f332f = null;
        this.f333g = false;
        this.f334h = false;
        this.f336j = null;
        this.f337k = null;
        this.f338l = false;
        this.f339m = false;
        this.f351y = VelocityTracker.obtain();
        this.f329P = new Rect();
        AbstractC0282m3.m2793a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f322I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0084j.SwitchCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0302q3 c0302q3 = new C0302q3(context, obtainStyledAttributes);
        AbstractC0605j0.m2270M(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        Drawable m2751g = c0302q3.m2751g(AbstractC0084j.SwitchCompat_android_thumb);
        this.f330d = m2751g;
        if (m2751g != null) {
            m2751g.setCallback(this);
        }
        Drawable m2751g2 = c0302q3.m2751g(AbstractC0084j.SwitchCompat_track);
        this.f335i = m2751g2;
        if (m2751g2 != null) {
            m2751g2.setCallback(this);
        }
        this.f344r = c0302q3.m2743o(AbstractC0084j.SwitchCompat_android_textOn);
        this.f345s = c0302q3.m2743o(AbstractC0084j.SwitchCompat_android_textOff);
        this.f346t = c0302q3.m2757a(AbstractC0084j.SwitchCompat_showText, true);
        this.f340n = c0302q3.m2752f(AbstractC0084j.SwitchCompat_thumbTextPadding, 0);
        this.f341o = c0302q3.m2752f(AbstractC0084j.SwitchCompat_switchMinWidth, 0);
        this.f342p = c0302q3.m2752f(AbstractC0084j.SwitchCompat_switchPadding, 0);
        this.f343q = c0302q3.m2757a(AbstractC0084j.SwitchCompat_splitTrack, false);
        ColorStateList m2755c = c0302q3.m2755c(AbstractC0084j.SwitchCompat_thumbTint);
        if (m2755c != null) {
            this.f331e = m2755c;
            this.f333g = true;
        }
        PorterDuff.Mode m2783d = AbstractC0290o1.m2783d(c0302q3.m2748j(AbstractC0084j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f332f != m2783d) {
            this.f332f = m2783d;
            this.f334h = true;
        }
        if (this.f333g || this.f334h) {
            m3399a();
        }
        ColorStateList m2755c2 = c0302q3.m2755c(AbstractC0084j.SwitchCompat_trackTint);
        if (m2755c2 != null) {
            this.f336j = m2755c2;
            this.f338l = true;
        }
        PorterDuff.Mode m2783d2 = AbstractC0290o1.m2783d(c0302q3.m2748j(AbstractC0084j.SwitchCompat_trackTintMode, -1), null);
        if (this.f337k != m2783d2) {
            this.f337k = m2783d2;
            this.f339m = true;
        }
        if (this.f338l || this.f339m) {
            m3398b();
        }
        int m2745m = c0302q3.m2745m(AbstractC0084j.SwitchCompat_switchTextAppearance, 0);
        if (m2745m != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(m2745m, AbstractC0084j.TextAppearance);
            int i2 = AbstractC0084j.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(i2) || (resourceId = obtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = AbstractC0142b.m3001a(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(i2) : colorStateList;
            this.f323J = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(AbstractC0084j.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = obtainStyledAttributes2.getInt(AbstractC0084j.TextAppearance_android_typeface, -1);
            int i4 = obtainStyledAttributes2.getInt(AbstractC0084j.TextAppearance_android_textStyle, -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 != 2) {
                typeface = i3 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i4 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(defaultFromStyle);
                int style = ((-1) ^ (defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i4;
                textPaint.setFakeBoldText((style & 1) != 0);
                textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(AbstractC0084j.TextAppearance_textAllCaps, false)) {
                this.f326M = new C0159a(getContext());
            } else {
                this.f326M = null;
            }
            obtainStyledAttributes2.recycle();
        }
        C0236e1 c0236e1 = new C0236e1(this);
        this.f328O = c0236e1;
        c0236e1.m2849e(attributeSet, i);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f348v = viewConfiguration.getScaledTouchSlop();
        this.f352z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f314A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((AbstractC0257h4.m2817a(this) ? 1.0f - this.f314A : this.f314A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f335i;
        if (drawable != null) {
            Rect rect = this.f329P;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f330d;
            Rect m2784c = drawable2 != null ? AbstractC0290o1.m2784c(drawable2) : AbstractC0290o1.f1676c;
            return ((((this.f315B - this.f317D) - rect.left) - rect.right) - m2784c.left) - m2784c.right;
        }
        return 0;
    }

    /* renamed from: a */
    public final void m3399a() {
        Drawable drawable = this.f330d;
        if (drawable != null) {
            if (this.f333g || this.f334h) {
                Drawable mutate = AbstractC0022t.m3466u0(drawable).mutate();
                this.f330d = mutate;
                if (this.f333g) {
                    AbstractC0022t.m3480n0(mutate, this.f331e);
                }
                if (this.f334h) {
                    AbstractC0022t.m3478o0(this.f330d, this.f332f);
                }
                if (this.f330d.isStateful()) {
                    this.f330d.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m3398b() {
        Drawable drawable = this.f335i;
        if (drawable != null) {
            if (this.f338l || this.f339m) {
                Drawable mutate = AbstractC0022t.m3466u0(drawable).mutate();
                this.f335i = mutate;
                if (this.f338l) {
                    AbstractC0022t.m3480n0(mutate, this.f336j);
                }
                if (this.f339m) {
                    AbstractC0022t.m3478o0(this.f335i, this.f337k);
                }
                if (this.f335i.isStateful()) {
                    this.f335i.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final Layout m3397c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f326M;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f322I;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: d */
    public final void m3396d() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f345s;
            if (charSequence == null) {
                charSequence = getResources().getString(AbstractC0082h.abc_capital_off);
            }
            AbstractC0605j0.m2260W(this, charSequence);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f329P;
        int i3 = this.f318E;
        int i4 = this.f319F;
        int i5 = this.f320G;
        int i6 = this.f321H;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f330d;
        Rect m2784c = drawable != null ? AbstractC0290o1.m2784c(drawable) : AbstractC0290o1.f1676c;
        Drawable drawable2 = this.f335i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (m2784c != null) {
                int i8 = m2784c.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = m2784c.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = m2784c.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = m2784c.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f335i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f335i.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f330d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f317D + rect.right;
            this.f330d.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0022t.m3498e0(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f330d;
        if (drawable != null) {
            AbstractC0022t.m3500d0(drawable, f, f2);
        }
        Drawable drawable2 = this.f335i;
        if (drawable2 != null) {
            AbstractC0022t.m3500d0(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f330d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f335i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m3395e() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f344r;
            if (charSequence == null) {
                charSequence = getResources().getString(AbstractC0082h.abc_capital_on);
            }
            AbstractC0605j0.m2260W(this, charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (AbstractC0257h4.m2817a(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f315B;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f342p : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (AbstractC0257h4.m2817a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f315B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f342p : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f346t;
    }

    public boolean getSplitTrack() {
        return this.f343q;
    }

    public int getSwitchMinWidth() {
        return this.f341o;
    }

    public int getSwitchPadding() {
        return this.f342p;
    }

    public CharSequence getTextOff() {
        return this.f345s;
    }

    public CharSequence getTextOn() {
        return this.f344r;
    }

    public Drawable getThumbDrawable() {
        return this.f330d;
    }

    public int getThumbTextPadding() {
        return this.f340n;
    }

    public ColorStateList getThumbTintList() {
        return this.f331e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f332f;
    }

    public Drawable getTrackDrawable() {
        return this.f335i;
    }

    public ColorStateList getTrackTintList() {
        return this.f336j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f337k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f330d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f335i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f327N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f327N.end();
        this.f327N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f313c);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f329P;
        Drawable drawable = this.f335i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f319F;
        int i2 = this.f321H;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f330d;
        if (drawable != null) {
            if (!this.f343q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m2784c = AbstractC0290o1.m2784c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m2784c.left;
                rect.right -= m2784c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f324K : this.f325L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f323J;
            if (colorStateList != null) {
                this.f322I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f322I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f344r : this.f345s;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f330d != null) {
            Rect rect = this.f329P;
            Drawable drawable = this.f335i;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m2784c = AbstractC0290o1.m2784c(this.f330d);
            i5 = Math.max(0, m2784c.left - rect.left);
            i9 = Math.max(0, m2784c.right - rect.right);
        } else {
            i5 = 0;
        }
        if (AbstractC0257h4.m2817a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f315B + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f315B) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i10 = this.f316C;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i10 / 2);
            i7 = i10 + height;
            i8 = height;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.f316C + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.f316C;
        }
        this.f318E = i6;
        this.f319F = i8;
        this.f321H = i7;
        this.f320G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f346t) {
            if (this.f324K == null) {
                this.f324K = m3397c(this.f344r);
            }
            if (this.f325L == null) {
                this.f325L = m3397c(this.f345s);
            }
        }
        Rect rect = this.f329P;
        Drawable drawable = this.f330d;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f330d.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f330d.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.f346t) {
            i5 = (this.f340n * 2) + Math.max(this.f324K.getWidth(), this.f325L.getWidth());
        } else {
            i5 = 0;
        }
        this.f317D = Math.max(i5, i3);
        Drawable drawable2 = this.f335i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f335i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f330d;
        if (drawable3 != null) {
            Rect m2784c = AbstractC0290o1.m2784c(drawable3);
            i7 = Math.max(i7, m2784c.left);
            i8 = Math.max(i8, m2784c.right);
        }
        int max = Math.max(this.f341o, (this.f317D * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.f315B = max;
        this.f316C = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f344r : this.f345s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f351y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f347u;
                    if (i == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x - this.f349w) > this.f348v || Math.abs(y - this.f350x) > this.f348v) {
                            this.f347u = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f349w = x;
                            this.f350x = y;
                            return true;
                        }
                    } else if (i == 2) {
                        float x2 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f = x2 - this.f349w;
                        float f2 = thumbScrollRange != 0 ? f / thumbScrollRange : f > 0.0f ? 1.0f : -1.0f;
                        if (AbstractC0257h4.m2817a(this)) {
                            f2 = -f2;
                        }
                        float f3 = this.f314A;
                        float f4 = f2 + f3;
                        float f5 = f4 >= 0.0f ? f4 > 1.0f ? 1.0f : f4 : 0.0f;
                        if (f5 != f3) {
                            this.f349w = x2;
                            setThumbPosition(f5);
                        }
                        return true;
                    }
                }
            }
            if (this.f347u == 2) {
                this.f347u = 0;
                boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z3) {
                    this.f351y.computeCurrentVelocity(1000);
                    float xVelocity = this.f351y.getXVelocity();
                    z = Math.abs(xVelocity) > ((float) this.f352z) ? !AbstractC0257h4.m2817a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
                } else {
                    z = isChecked;
                }
                if (z != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f347u = 0;
            this.f351y.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled()) {
                if (this.f330d != null) {
                    int thumbOffset = getThumbOffset();
                    this.f330d.getPadding(this.f329P);
                    int i2 = this.f319F;
                    int i3 = this.f348v;
                    int i4 = i2 - i3;
                    int i5 = (this.f318E + thumbOffset) - i3;
                    Rect rect = this.f329P;
                    int i6 = this.f317D + i5 + rect.left + rect.right + i3;
                    int i7 = this.f321H + i3;
                    if (x3 > i5 && x3 < i6 && y2 > i4 && y2 < i7) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.f347u = 1;
                    this.f349w = x3;
                    this.f350x = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m3395e();
        } else {
            m3396d();
        }
        if (getWindowToken() != null && AbstractC0605j0.m2232z(this)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f312b, isChecked ? 1.0f : 0.0f);
            this.f327N = ofFloat;
            ofFloat.setDuration(250L);
            if (Build.VERSION.SDK_INT >= 18) {
                this.f327N.setAutoCancel(true);
            }
            this.f327N.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f327N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0022t.m3464v0(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f346t != z) {
            this.f346t = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f343q = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f341o = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f342p = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f322I.getTypeface() == null || this.f322I.getTypeface().equals(typeface)) && (this.f322I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f322I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f345s = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        m3396d();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f344r = charSequence;
        requestLayout();
        if (isChecked()) {
            m3395e();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f330d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f330d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f314A = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC0142b.m3000b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f340n = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f331e = colorStateList;
        this.f333g = true;
        m3399a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f332f = mode;
        this.f334h = true;
        m3399a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f335i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f335i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC0142b.m3000b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f336j = colorStateList;
        this.f338l = true;
        m3398b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f337k = mode;
        this.f339m = true;
        m3398b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f330d || drawable == this.f335i;
    }
}