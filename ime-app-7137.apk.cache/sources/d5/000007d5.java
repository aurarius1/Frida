package p093c.p145g.p146a.p147a.p155h0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;

/* renamed from: c.g.a.a.h0.e */
/* loaded from: classes.dex */
public abstract class AbstractC1873e extends FrameLayout {

    /* renamed from: b */
    public static final View.OnTouchListener f5742b = new View$OnTouchListenerC1872d();

    /* renamed from: c */
    public InterfaceC1871c f5743c;

    /* renamed from: d */
    public InterfaceC1870b f5744d;

    /* renamed from: e */
    public int f5745e;

    /* renamed from: f */
    public final float f5746f;

    /* renamed from: g */
    public final float f5747g;

    /* renamed from: h */
    public ColorStateList f5748h;

    /* renamed from: i */
    public PorterDuff.Mode f5749i;

    public AbstractC1873e(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, 0, 0), attributeSet);
        Drawable m3466u0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1940l.SnackbarLayout);
        int i = AbstractC1940l.SnackbarLayout_elevation;
        if (obtainStyledAttributes.hasValue(i)) {
            AbstractC0605j0.m2265R(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
        }
        this.f5745e = obtainStyledAttributes.getInt(AbstractC1940l.SnackbarLayout_animationMode, 0);
        this.f5746f = obtainStyledAttributes.getFloat(AbstractC1940l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(AbstractC1077v0.m1262q(context2, obtainStyledAttributes, AbstractC1940l.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(AbstractC1077v0.m1291M(obtainStyledAttributes.getInt(AbstractC1940l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.f5747g = obtainStyledAttributes.getFloat(AbstractC1940l.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f5742b);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(AbstractC1829d.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            int i2 = AbstractC1804b.colorSurface;
            int i3 = AbstractC1804b.colorOnSurface;
            gradientDrawable.setColor(AbstractC1077v0.m1297G(AbstractC1077v0.m1263p(this, i2), AbstractC1077v0.m1263p(this, i3), getBackgroundOverlayColorAlpha()));
            if (this.f5748h != null) {
                m3466u0 = AbstractC0022t.m3466u0(gradientDrawable);
                AbstractC0022t.m3480n0(m3466u0, this.f5748h);
            } else {
                m3466u0 = AbstractC0022t.m3466u0(gradientDrawable);
            }
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(m3466u0);
            } else {
                setBackgroundDrawable(m3466u0);
            }
        }
    }

    public float getActionTextColorAlpha() {
        return this.f5747g;
    }

    public int getAnimationMode() {
        return this.f5745e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f5746f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1870b interfaceC1870b = this.f5744d;
        if (interfaceC1870b != null) {
            interfaceC1870b.onViewAttachedToWindow(this);
        }
        AbstractC0605j0.m2271L(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1870b interfaceC1870b = this.f5744d;
        if (interfaceC1870b != null) {
            interfaceC1870b.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC1871c interfaceC1871c = this.f5743c;
        if (interfaceC1871c != null) {
            interfaceC1871c.m706a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f5745e = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f5748h != null) {
            drawable = AbstractC0022t.m3466u0(drawable.mutate());
            AbstractC0022t.m3480n0(drawable, this.f5748h);
            AbstractC0022t.m3478o0(drawable, this.f5749i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f5748h = colorStateList;
        if (getBackground() != null) {
            Drawable m3466u0 = AbstractC0022t.m3466u0(getBackground().mutate());
            AbstractC0022t.m3480n0(m3466u0, colorStateList);
            AbstractC0022t.m3478o0(m3466u0, this.f5749i);
            if (m3466u0 != getBackground()) {
                super.setBackgroundDrawable(m3466u0);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f5749i = mode;
        if (getBackground() != null) {
            Drawable m3466u0 = AbstractC0022t.m3466u0(getBackground().mutate());
            AbstractC0022t.m3478o0(m3466u0, mode);
            if (m3466u0 != getBackground()) {
                super.setBackgroundDrawable(m3466u0);
            }
        }
    }

    public void setOnAttachStateChangeListener(InterfaceC1870b interfaceC1870b) {
        this.f5744d = interfaceC1870b;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f5742b);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(InterfaceC1871c interfaceC1871c) {
        this.f5743c = interfaceC1871c;
    }
}