package p010b.p046j.p050f.p051p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p000a.p001a.p002a.p004b.AbstractC0022t;

/* renamed from: b.j.f.p.c */
/* loaded from: classes.dex */
public class C0523c extends Drawable implements Drawable.Callback, InterfaceC0522b, InterfaceC0521a {

    /* renamed from: b */
    public static final PorterDuff.Mode f2569b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public int f2570c;

    /* renamed from: d */
    public PorterDuff.Mode f2571d;

    /* renamed from: e */
    public boolean f2572e;

    /* renamed from: f */
    public C0525e f2573f;

    /* renamed from: g */
    public boolean f2574g;

    /* renamed from: h */
    public Drawable f2575h;

    public C0523c(Drawable drawable) {
        this.f2573f = new C0525e(this.f2573f);
        m2355b(drawable);
    }

    /* renamed from: a */
    public boolean mo2353a() {
        return true;
    }

    /* renamed from: b */
    public final void m2355b(Drawable drawable) {
        Drawable drawable2 = this.f2575h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2575h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0525e c0525e = this.f2573f;
            if (c0525e != null) {
                c0525e.f2578b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public final boolean m2354c(int[] iArr) {
        if (mo2353a()) {
            C0525e c0525e = this.f2573f;
            ColorStateList colorStateList = c0525e.f2579c;
            PorterDuff.Mode mode = c0525e.f2580d;
            if (colorStateList == null || mode == null) {
                this.f2572e = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f2572e || colorForState != this.f2570c || mode != this.f2571d) {
                    setColorFilter(colorForState, mode);
                    this.f2570c = colorForState;
                    this.f2571d = mode;
                    this.f2572e = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2575h.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0525e c0525e = this.f2573f;
        return changingConfigurations | (c0525e != null ? c0525e.getChangingConfigurations() : 0) | this.f2575h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C0525e c0525e = this.f2573f;
        if (c0525e != null) {
            if (c0525e.f2578b != null) {
                c0525e.f2577a = getChangingConfigurations();
                return this.f2573f;
            }
            return null;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2575h.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2575h.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2575h.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return AbstractC0022t.m3529E(this.f2575h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2575h.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2575h.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2575h.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2575h.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2575h.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2575h.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return AbstractC0022t.m3521M(this.f2575h);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0525e c0525e;
        ColorStateList colorStateList = (!mo2353a() || (c0525e = this.f2573f) == null) ? null : c0525e.f2579c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2575h.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2575h.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2574g && super.mutate() == this) {
            this.f2573f = new C0525e(this.f2573f);
            Drawable drawable = this.f2575h;
            if (drawable != null) {
                drawable.mutate();
            }
            C0525e c0525e = this.f2573f;
            if (c0525e != null) {
                Drawable drawable2 = this.f2575h;
                c0525e.f2578b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2574g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2575h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return AbstractC0022t.m3494g0(this.f2575h, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f2575h.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2575h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC0022t.m3509Y(this.f2575h, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f2575h.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2575h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2575h.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2575h.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m2354c(iArr) || this.f2575h.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintList(ColorStateList colorStateList) {
        this.f2573f.f2579c = colorStateList;
        m2354c(getState());
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2573f.f2580d = mode;
        m2354c(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2575h.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C0523c(C0525e c0525e, Resources resources) {
        Drawable.ConstantState constantState;
        this.f2573f = c0525e;
        if (c0525e == null || (constantState = c0525e.f2578b) == null) {
            return;
        }
        m2355b(constantState.newDrawable(resources));
    }
}