package p093c.p145g.p146a.p147a.p154g0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import java.util.BitSet;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p050f.AbstractC0506a;
import p010b.p046j.p050f.p051p.InterfaceC0521a;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.p153f0.C1841a;
import p093c.p145g.p146a.p147a.p173y.C2045a;

/* renamed from: c.g.a.a.g0.i */
/* loaded from: classes.dex */
public class C1851i extends Drawable implements InterfaceC0521a, InterfaceC1867y {

    /* renamed from: b */
    public static final String f5655b = C1851i.class.getSimpleName();

    /* renamed from: c */
    public static final Paint f5656c = new Paint(1);

    /* renamed from: d */
    public C1850h f5657d;

    /* renamed from: e */
    public final AbstractC1865w[] f5658e;

    /* renamed from: f */
    public final AbstractC1865w[] f5659f;

    /* renamed from: g */
    public final BitSet f5660g;

    /* renamed from: h */
    public boolean f5661h;

    /* renamed from: i */
    public final Matrix f5662i;

    /* renamed from: j */
    public final Path f5663j;

    /* renamed from: k */
    public final Path f5664k;

    /* renamed from: l */
    public final RectF f5665l;

    /* renamed from: m */
    public final RectF f5666m;

    /* renamed from: n */
    public final Region f5667n;

    /* renamed from: o */
    public final Region f5668o;

    /* renamed from: p */
    public C1856n f5669p;

    /* renamed from: q */
    public final Paint f5670q;

    /* renamed from: r */
    public final Paint f5671r;

    /* renamed from: s */
    public final C1841a f5672s;

    /* renamed from: t */
    public final C1849g f5673t;

    /* renamed from: u */
    public final C1858p f5674u;

    /* renamed from: v */
    public PorterDuffColorFilter f5675v;

    /* renamed from: w */
    public PorterDuffColorFilter f5676w;

    /* renamed from: x */
    public final RectF f5677x;

    /* renamed from: y */
    public boolean f5678y;

    public C1851i() {
        this(new C1856n());
    }

    public C1851i(C1850h c1850h) {
        C1858p c1858p;
        this.f5658e = new AbstractC1865w[4];
        this.f5659f = new AbstractC1865w[4];
        this.f5660g = new BitSet(8);
        this.f5662i = new Matrix();
        this.f5663j = new Path();
        this.f5664k = new Path();
        this.f5665l = new RectF();
        this.f5666m = new RectF();
        this.f5667n = new Region();
        this.f5668o = new Region();
        Paint paint = new Paint(1);
        this.f5670q = paint;
        Paint paint2 = new Paint(1);
        this.f5671r = paint2;
        this.f5672s = new C1841a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c1858p = AbstractC1857o.f5704a;
        } else {
            c1858p = new C1858p();
        }
        this.f5674u = c1858p;
        this.f5677x = new RectF();
        this.f5678y = true;
        this.f5657d = c1850h;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f5656c;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m731v();
        m732u(getState());
        this.f5673t = new C1849g(this);
    }

    public C1851i(C1856n c1856n) {
        this(new C1850h(c1856n, null));
    }

    /* renamed from: b */
    public final void m751b(RectF rectF, Path path) {
        m750c(rectF, path);
        if (this.f5657d.f5642j != 1.0f) {
            this.f5662i.reset();
            Matrix matrix = this.f5662i;
            float f = this.f5657d.f5642j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f5662i);
        }
        path.computeBounds(this.f5677x, true);
    }

    /* renamed from: c */
    public final void m750c(RectF rectF, Path path) {
        C1858p c1858p = this.f5674u;
        C1850h c1850h = this.f5657d;
        c1858p.m715a(c1850h.f5633a, c1850h.f5643k, rectF, this.f5673t, path);
    }

    /* renamed from: d */
    public final PorterDuffColorFilter m749d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int m748e;
        if (colorStateList == null || mode == null) {
            return (!z || (m748e = m748e((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(m748e, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m748e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f6, code lost:
        if ((r4 < 21 || !(r2.f5633a.m717d(m745h()) || r12.f5663j.isConvex() || r4 >= 29)) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean z;
        Paint.Style style;
        this.f5670q.setColorFilter(this.f5675v);
        int alpha = this.f5670q.getAlpha();
        Paint paint = this.f5670q;
        int i = this.f5657d.f5645m;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.f5671r.setColorFilter(this.f5676w);
        this.f5671r.setStrokeWidth(this.f5657d.f5644l);
        int alpha2 = this.f5671r.getAlpha();
        Paint paint2 = this.f5671r;
        int i2 = this.f5657d.f5645m;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = false;
        if (this.f5661h) {
            float f = -m742k();
            C1856n c1856n = this.f5657d.f5633a;
            c1856n.getClass();
            C1855m c1855m = new C1855m(c1856n);
            InterfaceC1845c interfaceC1845c = c1856n.f5696e;
            if (!(interfaceC1845c instanceof C1852j)) {
                interfaceC1845c = new C1844b(f, interfaceC1845c);
            }
            c1855m.f5684e = interfaceC1845c;
            InterfaceC1845c interfaceC1845c2 = c1856n.f5697f;
            if (!(interfaceC1845c2 instanceof C1852j)) {
                interfaceC1845c2 = new C1844b(f, interfaceC1845c2);
            }
            c1855m.f5685f = interfaceC1845c2;
            InterfaceC1845c interfaceC1845c3 = c1856n.f5699h;
            if (!(interfaceC1845c3 instanceof C1852j)) {
                interfaceC1845c3 = new C1844b(f, interfaceC1845c3);
            }
            c1855m.f5687h = interfaceC1845c3;
            InterfaceC1845c interfaceC1845c4 = c1856n.f5698g;
            if (!(interfaceC1845c4 instanceof C1852j)) {
                interfaceC1845c4 = new C1844b(f, interfaceC1845c4);
            }
            c1855m.f5686g = interfaceC1845c4;
            C1856n m727a = c1855m.m727a();
            this.f5669p = m727a;
            C1858p c1858p = this.f5674u;
            float f2 = this.f5657d.f5643k;
            this.f5666m.set(m745h());
            float m742k = m742k();
            this.f5666m.inset(m742k, m742k);
            c1858p.m715a(m727a, f2, this.f5666m, null, this.f5664k);
            m751b(m745h(), this.f5663j);
            this.f5661h = false;
        }
        C1850h c1850h = this.f5657d;
        int i3 = c1850h.f5649q;
        if (i3 != 1 && c1850h.f5650r > 0) {
            if (i3 != 2) {
                int i4 = Build.VERSION.SDK_INT;
            }
            z = true;
            if (z) {
                canvas.save();
                int m744i = m744i();
                int m743j = m743j();
                if (Build.VERSION.SDK_INT < 21 && this.f5678y) {
                    Rect clipBounds = canvas.getClipBounds();
                    int i5 = -this.f5657d.f5650r;
                    clipBounds.inset(i5, i5);
                    clipBounds.offset(m744i, m743j);
                    canvas.clipRect(clipBounds, Region.Op.REPLACE);
                }
                canvas.translate(m744i, m743j);
                if (this.f5678y) {
                    int width = (int) (this.f5677x.width() - getBounds().width());
                    int height = (int) (this.f5677x.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f5657d.f5650r * 2) + ((int) this.f5677x.width()) + width, (this.f5657d.f5650r * 2) + ((int) this.f5677x.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (getBounds().left - this.f5657d.f5650r) - width;
                    float f4 = (getBounds().top - this.f5657d.f5650r) - height;
                    canvas2.translate(-f3, -f4);
                    m747f(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                } else {
                    m747f(canvas);
                }
                canvas.restore();
            }
            C1850h c1850h2 = this.f5657d;
            style = c1850h2.f5654v;
            if ((style != Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) ? true : true) {
                m746g(canvas, this.f5670q, this.f5663j, c1850h2.f5633a, m745h());
            }
            if (m740m()) {
                Paint paint3 = this.f5671r;
                Path path = this.f5664k;
                C1856n c1856n2 = this.f5669p;
                this.f5666m.set(m745h());
                float m742k2 = m742k();
                this.f5666m.inset(m742k2, m742k2);
                m746g(canvas, paint3, path, c1856n2, this.f5666m);
            }
            this.f5670q.setAlpha(alpha);
            this.f5671r.setAlpha(alpha2);
        }
        z = false;
        if (z) {
        }
        C1850h c1850h22 = this.f5657d;
        style = c1850h22.f5654v;
        if ((style != Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) ? true : true) {
        }
        if (m740m()) {
        }
        this.f5670q.setAlpha(alpha);
        this.f5671r.setAlpha(alpha2);
    }

    /* renamed from: e */
    public int m748e(int i) {
        C1850h c1850h = this.f5657d;
        float f = c1850h.f5647o + c1850h.f5648p + c1850h.f5646n;
        C2045a c2045a = c1850h.f5634b;
        if (c2045a == null || !c2045a.f6219a) {
            return i;
        }
        if (AbstractC0506a.m2386h(i, 255) == c2045a.f6221c) {
            float f2 = c2045a.f6222d;
            float f3 = 0.0f;
            if (f2 > 0.0f && f > 0.0f) {
                f3 = Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            }
            return AbstractC0506a.m2386h(AbstractC1077v0.m1297G(AbstractC0506a.m2386h(i, 255), c2045a.f6220b, f3), Color.alpha(i));
        }
        return i;
    }

    /* renamed from: f */
    public final void m747f(Canvas canvas) {
        this.f5660g.cardinality();
        if (this.f5657d.f5651s != 0) {
            canvas.drawPath(this.f5663j, this.f5672s.f5621e);
        }
        for (int i = 0; i < 4; i++) {
            AbstractC1865w abstractC1865w = this.f5658e[i];
            C1841a c1841a = this.f5672s;
            int i2 = this.f5657d.f5650r;
            Matrix matrix = AbstractC1865w.f5733a;
            abstractC1865w.mo711a(matrix, c1841a, i2, canvas);
            this.f5659f[i].mo711a(matrix, this.f5672s, this.f5657d.f5650r, canvas);
        }
        if (this.f5678y) {
            int m744i = m744i();
            int m743j = m743j();
            canvas.translate(-m744i, -m743j);
            canvas.drawPath(this.f5663j, f5656c);
            canvas.translate(m744i, m743j);
        }
    }

    /* renamed from: g */
    public final void m746g(Canvas canvas, Paint paint, Path path, C1856n c1856n, RectF rectF) {
        if (!c1856n.m717d(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float mo729a = c1856n.f5697f.mo729a(rectF) * this.f5657d.f5643k;
        canvas.drawRoundRect(rectF, mo729a, mo729a, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5657d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        C1850h c1850h = this.f5657d;
        if (c1850h.f5649q == 2) {
            return;
        }
        if (c1850h.f5633a.m717d(m745h())) {
            outline.setRoundRect(getBounds(), m741l() * this.f5657d.f5643k);
            return;
        }
        m751b(m745h(), this.f5663j);
        if (this.f5663j.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f5663j);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f5657d.f5641i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f5667n.set(getBounds());
        m751b(m745h(), this.f5663j);
        this.f5668o.setPath(this.f5663j, this.f5667n);
        this.f5667n.op(this.f5668o, Region.Op.DIFFERENCE);
        return this.f5667n;
    }

    /* renamed from: h */
    public RectF m745h() {
        this.f5665l.set(getBounds());
        return this.f5665l;
    }

    /* renamed from: i */
    public int m744i() {
        C1850h c1850h;
        double d = this.f5657d.f5651s;
        double sin = Math.sin(Math.toRadians(c1850h.f5652t));
        Double.isNaN(d);
        return (int) (sin * d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5661h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f5657d.f5639g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f5657d.f5638f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f5657d.f5637e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f5657d.f5636d) != null && colorStateList4.isStateful())));
    }

    /* renamed from: j */
    public int m743j() {
        C1850h c1850h;
        double d = this.f5657d.f5651s;
        double cos = Math.cos(Math.toRadians(c1850h.f5652t));
        Double.isNaN(d);
        return (int) (cos * d);
    }

    /* renamed from: k */
    public final float m742k() {
        if (m740m()) {
            return this.f5671r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: l */
    public float m741l() {
        return this.f5657d.f5633a.f5696e.mo729a(m745h());
    }

    /* renamed from: m */
    public final boolean m740m() {
        Paint.Style style = this.f5657d.f5654v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f5671r.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5657d = new C1850h(this.f5657d);
        return this;
    }

    /* renamed from: n */
    public void m739n(Context context) {
        this.f5657d.f5634b = new C2045a(context);
        m730w();
    }

    /* renamed from: o */
    public void m738o(float f) {
        C1850h c1850h = this.f5657d;
        if (c1850h.f5647o != f) {
            c1850h.f5647o = f;
            m730w();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f5661h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m732u(iArr) || m731v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public void m737p(ColorStateList colorStateList) {
        C1850h c1850h = this.f5657d;
        if (c1850h.f5636d != colorStateList) {
            c1850h.f5636d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: q */
    public void m736q(float f) {
        C1850h c1850h = this.f5657d;
        if (c1850h.f5643k != f) {
            c1850h.f5643k = f;
            this.f5661h = true;
            invalidateSelf();
        }
    }

    /* renamed from: r */
    public void m735r(float f, int i) {
        this.f5657d.f5644l = f;
        invalidateSelf();
        m733t(ColorStateList.valueOf(i));
    }

    /* renamed from: s */
    public void m734s(float f, ColorStateList colorStateList) {
        this.f5657d.f5644l = f;
        invalidateSelf();
        m733t(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C1850h c1850h = this.f5657d;
        if (c1850h.f5645m != i) {
            c1850h.f5645m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5657d.f5635c = colorFilter;
        super.invalidateSelf();
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.InterfaceC1867y
    public void setShapeAppearanceModel(C1856n c1856n) {
        this.f5657d.f5633a = c1856n;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintList(ColorStateList colorStateList) {
        this.f5657d.f5639g = colorStateList;
        m731v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintMode(PorterDuff.Mode mode) {
        C1850h c1850h = this.f5657d;
        if (c1850h.f5640h != mode) {
            c1850h.f5640h = mode;
            m731v();
            super.invalidateSelf();
        }
    }

    /* renamed from: t */
    public void m733t(ColorStateList colorStateList) {
        C1850h c1850h = this.f5657d;
        if (c1850h.f5637e != colorStateList) {
            c1850h.f5637e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: u */
    public final boolean m732u(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f5657d.f5636d == null || color2 == (colorForState2 = this.f5657d.f5636d.getColorForState(iArr, (color2 = this.f5670q.getColor())))) {
            z = false;
        } else {
            this.f5670q.setColor(colorForState2);
            z = true;
        }
        if (this.f5657d.f5637e == null || color == (colorForState = this.f5657d.f5637e.getColorForState(iArr, (color = this.f5671r.getColor())))) {
            return z;
        }
        this.f5671r.setColor(colorForState);
        return true;
    }

    /* renamed from: v */
    public final boolean m731v() {
        PorterDuffColorFilter porterDuffColorFilter = this.f5675v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f5676w;
        C1850h c1850h = this.f5657d;
        this.f5675v = m749d(c1850h.f5639g, c1850h.f5640h, this.f5670q, true);
        C1850h c1850h2 = this.f5657d;
        this.f5676w = m749d(c1850h2.f5638f, c1850h2.f5640h, this.f5671r, false);
        C1850h c1850h3 = this.f5657d;
        if (c1850h3.f5653u) {
            this.f5672s.m752a(c1850h3.f5639g.getColorForState(getState(), 0));
        }
        return (AbstractC0022t.m3463w(porterDuffColorFilter, this.f5675v) && AbstractC0022t.m3463w(porterDuffColorFilter2, this.f5676w)) ? false : true;
    }

    /* renamed from: w */
    public final void m730w() {
        C1850h c1850h = this.f5657d;
        float f = c1850h.f5647o + c1850h.f5648p;
        c1850h.f5650r = (int) Math.ceil(0.75f * f);
        this.f5657d.f5651s = (int) Math.ceil(f * 0.25f);
        m731v();
        super.invalidateSelf();
    }
}