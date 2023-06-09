package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p010b.p034f.AbstractC0362a;
import p010b.p034f.AbstractC0363b;
import p010b.p034f.AbstractC0365d;
import p010b.p034f.AbstractC0366e;
import p010b.p034f.p035f.C0367a;
import p010b.p034f.p035f.C0369c;
import p010b.p034f.p035f.C0370d;
import p010b.p034f.p035f.C0372f;
import p010b.p034f.p035f.InterfaceC0373g;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: b */
    public static final int[] f399b = {16842801};

    /* renamed from: c */
    public static final InterfaceC0373g f400c;

    /* renamed from: d */
    public boolean f401d;

    /* renamed from: e */
    public boolean f402e;

    /* renamed from: f */
    public int f403f;

    /* renamed from: g */
    public int f404g;

    /* renamed from: h */
    public final Rect f405h;

    /* renamed from: i */
    public final Rect f406i;

    /* renamed from: j */
    public final C0367a f407j;

    static {
        int i = Build.VERSION.SDK_INT;
        InterfaceC0373g c0370d = i >= 21 ? new C0370d() : i >= 17 ? new C0369c() : new C0372f();
        f400c = c0370d;
        c0370d.mo2670m();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        Resources resources;
        int i;
        ColorStateList valueOf;
        int i2 = AbstractC0362a.cardViewStyle;
        Rect rect = new Rect();
        this.f405h = rect;
        this.f406i = new Rect();
        C0367a c0367a = new C0367a(this);
        this.f407j = c0367a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0366e.CardView, i2, AbstractC0365d.CardView);
        int i3 = AbstractC0366e.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f399b);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i = AbstractC0363b.cardview_light_background;
            } else {
                resources = getResources();
                i = AbstractC0363b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(AbstractC0366e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(AbstractC0366e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(AbstractC0366e.CardView_cardMaxElevation, 0.0f);
        this.f401d = obtainStyledAttributes.getBoolean(AbstractC0366e.CardView_cardUseCompatPadding, false);
        this.f402e = obtainStyledAttributes.getBoolean(AbstractC0366e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC0366e.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(AbstractC0366e.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(AbstractC0366e.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(AbstractC0366e.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(AbstractC0366e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f403f = obtainStyledAttributes.getDimensionPixelSize(AbstractC0366e.CardView_android_minWidth, 0);
        this.f404g = obtainStyledAttributes.getDimensionPixelSize(AbstractC0366e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f400c.mo2677f(c0367a, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return f400c.mo2675h(this.f407j);
    }

    public float getCardElevation() {
        return f400c.mo2680c(this.f407j);
    }

    public int getContentPaddingBottom() {
        return this.f405h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f405h.left;
    }

    public int getContentPaddingRight() {
        return this.f405h.right;
    }

    public int getContentPaddingTop() {
        return this.f405h.top;
    }

    public float getMaxCardElevation() {
        return f400c.mo2669n(this.f407j);
    }

    public boolean getPreventCornerOverlap() {
        return this.f402e;
    }

    public float getRadius() {
        return f400c.mo2671l(this.f407j);
    }

    public boolean getUseCompatPadding() {
        return this.f401d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC0373g interfaceC0373g = f400c;
        if (!(interfaceC0373g instanceof C0370d)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC0373g.mo2676g(this.f407j)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC0373g.mo2679d(this.f407j)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f400c.mo2673j(this.f407j, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f400c.mo2673j(this.f407j, colorStateList);
    }

    public void setCardElevation(float f) {
        f400c.mo2682a(this.f407j, f);
    }

    public void setMaxCardElevation(float f) {
        f400c.mo2672k(this.f407j, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f404g = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f403f = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f402e) {
            this.f402e = z;
            f400c.mo2678e(this.f407j);
        }
    }

    public void setRadius(float f) {
        f400c.mo2674i(this.f407j, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f401d != z) {
            this.f401d = z;
            f400c.mo2681b(this.f407j);
        }
    }
}