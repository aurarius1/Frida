package p093c.p145g.p146a.p147a.p149b0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p010b.p016c.p026q.AbstractC0340y1;
import p093c.p145g.p146a.p147a.AbstractC1940l;

/* renamed from: c.g.a.a.b0.g */
/* loaded from: classes.dex */
public abstract class AbstractC1811g extends AbstractC0340y1 {

    /* renamed from: q */
    public Drawable f5539q;

    /* renamed from: r */
    public final Rect f5540r;

    /* renamed from: s */
    public final Rect f5541s;

    /* renamed from: t */
    public int f5542t;

    /* renamed from: u */
    public boolean f5543u;

    /* renamed from: v */
    public boolean f5544v;

    public AbstractC1811g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5540r = new Rect();
        this.f5541s = new Rect();
        this.f5542t = 119;
        this.f5543u = true;
        this.f5544v = false;
        int[] iArr = AbstractC1940l.ForegroundLinearLayout;
        AbstractC1822r.m767a(context, attributeSet, i, 0);
        AbstractC1822r.m766b(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f5542t = obtainStyledAttributes.getInt(AbstractC1940l.ForegroundLinearLayout_android_foregroundGravity, this.f5542t);
        Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC1940l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f5543u = obtainStyledAttributes.getBoolean(AbstractC1940l.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f5539q;
        if (drawable != null) {
            if (this.f5544v) {
                this.f5544v = false;
                Rect rect = this.f5540r;
                Rect rect2 = this.f5541s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f5543u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f5542t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f5539q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5539q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f5539q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f5539q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f5542t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5539q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5544v = z | this.f5544v;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5544v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f5539q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f5539q);
            }
            this.f5539q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f5542t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f5542t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f5542t = i;
            if (i == 119 && this.f5539q != null) {
                this.f5539q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5539q;
    }
}