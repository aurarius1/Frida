package p010b.p034f.p035f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: b.f.f.h */
/* loaded from: classes.dex */
public class C0374h extends Drawable {

    /* renamed from: a */
    public float f1865a;

    /* renamed from: c */
    public final RectF f1867c;

    /* renamed from: d */
    public final Rect f1868d;

    /* renamed from: e */
    public float f1869e;

    /* renamed from: h */
    public ColorStateList f1872h;

    /* renamed from: i */
    public PorterDuffColorFilter f1873i;

    /* renamed from: j */
    public ColorStateList f1874j;

    /* renamed from: f */
    public boolean f1870f = false;

    /* renamed from: g */
    public boolean f1871g = true;

    /* renamed from: k */
    public PorterDuff.Mode f1875k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f1866b = new Paint(5);

    public C0374h(ColorStateList colorStateList, float f) {
        this.f1865a = f;
        m2667b(colorStateList);
        this.f1867c = new RectF();
        this.f1868d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m2668a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void m2667b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1872h = colorStateList;
        this.f1866b.setColor(colorStateList.getColorForState(getState(), this.f1872h.getDefaultColor()));
    }

    /* renamed from: c */
    public final void m2666c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1867c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1868d.set(rect);
        if (this.f1870f) {
            float m2663b = C0376j.m2663b(this.f1869e, this.f1865a, this.f1871g);
            this.f1868d.inset((int) Math.ceil(C0376j.m2664a(this.f1869e, this.f1865a, this.f1871g)), (int) Math.ceil(m2663b));
            this.f1867c.set(this.f1868d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1866b;
        if (this.f1873i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1873i);
            z = true;
        }
        RectF rectF = this.f1867c;
        float f = this.f1865a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1868d, this.f1865a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1874j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1872h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2666c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1872h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1866b.getColor();
        if (z) {
            this.f1866b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1874j;
        if (colorStateList2 == null || (mode = this.f1875k) == null) {
            return z;
        }
        this.f1873i = m2668a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1866b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1866b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1874j = colorStateList;
        this.f1873i = m2668a(colorStateList, this.f1875k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1875k = mode;
        this.f1873i = m2668a(this.f1874j, mode);
        invalidateSelf();
    }
}