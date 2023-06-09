package p010b.p034f.p035f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p010b.p034f.AbstractC0363b;
import p010b.p034f.AbstractC0364c;

/* renamed from: b.f.f.j */
/* loaded from: classes.dex */
public class C0376j extends Drawable {

    /* renamed from: a */
    public static final double f1876a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public static InterfaceC0375i f1877b;

    /* renamed from: c */
    public final int f1878c;

    /* renamed from: e */
    public Paint f1880e;

    /* renamed from: f */
    public Paint f1881f;

    /* renamed from: g */
    public final RectF f1882g;

    /* renamed from: h */
    public float f1883h;

    /* renamed from: i */
    public Path f1884i;

    /* renamed from: j */
    public float f1885j;

    /* renamed from: k */
    public float f1886k;

    /* renamed from: l */
    public float f1887l;

    /* renamed from: m */
    public ColorStateList f1888m;

    /* renamed from: o */
    public final int f1890o;

    /* renamed from: p */
    public final int f1891p;

    /* renamed from: n */
    public boolean f1889n = true;

    /* renamed from: q */
    public boolean f1892q = true;

    /* renamed from: r */
    public boolean f1893r = false;

    /* renamed from: d */
    public Paint f1879d = new Paint(5);

    public C0376j(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1890o = resources.getColor(AbstractC0363b.cardview_shadow_start_color);
        this.f1891p = resources.getColor(AbstractC0363b.cardview_shadow_end_color);
        this.f1878c = resources.getDimensionPixelSize(AbstractC0364c.cardview_compat_inset_shadow);
        m2662c(colorStateList);
        Paint paint = new Paint(5);
        this.f1880e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1883h = (int) (f + 0.5f);
        this.f1882g = new RectF();
        Paint paint2 = new Paint(this.f1880e);
        this.f1881f = paint2;
        paint2.setAntiAlias(false);
        m2661d(f2, f3);
    }

    /* renamed from: a */
    public static float m2664a(float f, float f2, boolean z) {
        if (z) {
            double d = f;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (((1.0d - f1876a) * d2) + d);
        }
        return f;
    }

    /* renamed from: b */
    public static float m2663b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (z) {
            double d = f3;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (((1.0d - f1876a) * d2) + d);
        }
        return f3;
    }

    /* renamed from: c */
    public final void m2662c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1888m = colorStateList;
        this.f1879d.setColor(colorStateList.getColorForState(getState(), this.f1888m.getDefaultColor()));
    }

    /* renamed from: d */
    public final void m2661d(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            int i = (int) (f + 0.5f);
            if (i % 2 == 1) {
                i--;
            }
            float f3 = i;
            int i2 = (int) (f2 + 0.5f);
            if (i2 % 2 == 1) {
                i2--;
            }
            float f4 = i2;
            if (f3 > f4) {
                if (!this.f1893r) {
                    this.f1893r = true;
                }
                f3 = f4;
            }
            if (this.f1887l == f3 && this.f1885j == f4) {
                return;
            }
            this.f1887l = f3;
            this.f1885j = f4;
            this.f1886k = (int) ((f3 * 1.5f) + this.f1878c + 0.5f);
            this.f1889n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f1889n) {
            Rect bounds = getBounds();
            float f = this.f1885j;
            float f2 = 1.5f * f;
            this.f1882g.set(bounds.left + f, bounds.top + f2, bounds.right - f, bounds.bottom - f2);
            float f3 = this.f1883h;
            float f4 = -f3;
            RectF rectF = new RectF(f4, f4, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f5 = -this.f1886k;
            rectF2.inset(f5, f5);
            Path path = this.f1884i;
            if (path == null) {
                this.f1884i = new Path();
            } else {
                path.reset();
            }
            this.f1884i.setFillType(Path.FillType.EVEN_ODD);
            this.f1884i.moveTo(-this.f1883h, 0.0f);
            this.f1884i.rLineTo(-this.f1886k, 0.0f);
            this.f1884i.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f1884i.arcTo(rectF, 270.0f, -90.0f, false);
            this.f1884i.close();
            float f6 = this.f1883h;
            float f7 = f6 / (this.f1886k + f6);
            Paint paint = this.f1880e;
            float f8 = this.f1883h + this.f1886k;
            int i2 = this.f1890o;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{i2, i2, this.f1891p}, new float[]{0.0f, f7, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f1881f;
            float f9 = -this.f1883h;
            float f10 = this.f1886k;
            float f11 = f9 + f10;
            float f12 = f9 - f10;
            int i3 = this.f1890o;
            paint2.setShader(new LinearGradient(0.0f, f11, 0.0f, f12, new int[]{i3, i3, this.f1891p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f1881f.setAntiAlias(false);
            this.f1889n = false;
        }
        canvas.translate(0.0f, this.f1887l / 2.0f);
        float f13 = this.f1883h;
        float f14 = (-f13) - this.f1886k;
        float f15 = (this.f1887l / 2.0f) + f13 + this.f1878c;
        float f16 = f15 * 2.0f;
        boolean z = this.f1882g.width() - f16 > 0.0f;
        boolean z2 = this.f1882g.height() - f16 > 0.0f;
        int save = canvas.save();
        RectF rectF3 = this.f1882g;
        canvas.translate(rectF3.left + f15, rectF3.top + f15);
        canvas.drawPath(this.f1884i, this.f1880e);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f14, this.f1882g.width() - f16, -this.f1883h, this.f1881f);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        RectF rectF4 = this.f1882g;
        canvas.translate(rectF4.right - f15, rectF4.bottom - f15);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1884i, this.f1880e);
        if (z) {
            canvas.drawRect(0.0f, f14, this.f1882g.width() - f16, (-this.f1883h) + this.f1886k, this.f1881f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF5 = this.f1882g;
        canvas.translate(rectF5.left + f15, rectF5.bottom - f15);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1884i, this.f1880e);
        if (z2) {
            canvas.drawRect(0.0f, f14, this.f1882g.height() - f16, -this.f1883h, this.f1881f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF6 = this.f1882g;
        canvas.translate(rectF6.right - f15, rectF6.top + f15);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1884i, this.f1880e);
        if (z2) {
            canvas.drawRect(0.0f, f14, this.f1882g.height() - f16, -this.f1883h, this.f1881f);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f1887l) / 2.0f);
        f1877b.mo2665a(canvas, this.f1882g, this.f1883h, this.f1879d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m2663b(this.f1885j, this.f1883h, this.f1892q));
        int ceil2 = (int) Math.ceil(m2664a(this.f1885j, this.f1883h, this.f1892q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1888m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1889n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1888m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1879d.getColor() == colorForState) {
            return false;
        }
        this.f1879d.setColor(colorForState);
        this.f1889n = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1879d.setAlpha(i);
        this.f1880e.setAlpha(i);
        this.f1881f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1879d.setColorFilter(colorFilter);
    }
}