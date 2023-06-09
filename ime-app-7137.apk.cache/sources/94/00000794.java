package p093c.p145g.p146a.p147a.p149b0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p056j.AbstractC0558j;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p145g.p146a.p147a.p151d0.C1830a;
import p093c.p145g.p146a.p147a.p161m.AbstractC1946a;

/* renamed from: c.g.a.a.b0.d */
/* loaded from: classes.dex */
public final class C1808d {

    /* renamed from: a */
    public static final boolean f5486a;

    /* renamed from: A */
    public boolean f5487A;

    /* renamed from: B */
    public Bitmap f5488B;

    /* renamed from: C */
    public Paint f5489C;

    /* renamed from: D */
    public float f5490D;

    /* renamed from: E */
    public float f5491E;

    /* renamed from: F */
    public int[] f5492F;

    /* renamed from: G */
    public boolean f5493G;

    /* renamed from: H */
    public final TextPaint f5494H;

    /* renamed from: I */
    public final TextPaint f5495I;

    /* renamed from: J */
    public TimeInterpolator f5496J;

    /* renamed from: K */
    public TimeInterpolator f5497K;

    /* renamed from: L */
    public float f5498L;

    /* renamed from: M */
    public float f5499M;

    /* renamed from: N */
    public float f5500N;

    /* renamed from: O */
    public ColorStateList f5501O;

    /* renamed from: P */
    public float f5502P;

    /* renamed from: Q */
    public StaticLayout f5503Q;

    /* renamed from: R */
    public float f5504R;

    /* renamed from: S */
    public float f5505S;

    /* renamed from: T */
    public float f5506T;

    /* renamed from: U */
    public CharSequence f5507U;

    /* renamed from: b */
    public final View f5508b;

    /* renamed from: c */
    public boolean f5509c;

    /* renamed from: d */
    public float f5510d;

    /* renamed from: e */
    public final Rect f5511e;

    /* renamed from: f */
    public final Rect f5512f;

    /* renamed from: g */
    public final RectF f5513g;

    /* renamed from: h */
    public int f5514h = 16;

    /* renamed from: i */
    public int f5515i = 16;

    /* renamed from: j */
    public float f5516j = 15.0f;

    /* renamed from: k */
    public float f5517k = 15.0f;

    /* renamed from: l */
    public ColorStateList f5518l;

    /* renamed from: m */
    public ColorStateList f5519m;

    /* renamed from: n */
    public float f5520n;

    /* renamed from: o */
    public float f5521o;

    /* renamed from: p */
    public float f5522p;

    /* renamed from: q */
    public float f5523q;

    /* renamed from: r */
    public float f5524r;

    /* renamed from: s */
    public float f5525s;

    /* renamed from: t */
    public Typeface f5526t;

    /* renamed from: u */
    public Typeface f5527u;

    /* renamed from: v */
    public Typeface f5528v;

    /* renamed from: w */
    public C1830a f5529w;

    /* renamed from: x */
    public CharSequence f5530x;

    /* renamed from: y */
    public CharSequence f5531y;

    /* renamed from: z */
    public boolean f5532z;

    static {
        f5486a = Build.VERSION.SDK_INT < 18;
    }

    public C1808d(View view) {
        this.f5508b = view;
        TextPaint textPaint = new TextPaint(129);
        this.f5494H = textPaint;
        this.f5495I = new TextPaint(textPaint);
        this.f5512f = new Rect();
        this.f5511e = new Rect();
        this.f5513g = new RectF();
    }

    /* renamed from: a */
    public static int m793a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* renamed from: i */
    public static float m785i(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = AbstractC1946a.f5894a;
        return AbstractC1124a.m1195a(f2, f, f3, f);
    }

    /* renamed from: l */
    public static boolean m782l(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    public float m792b() {
        if (this.f5530x == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.f5495I;
        textPaint.setTextSize(this.f5517k);
        textPaint.setTypeface(this.f5526t);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f5502P);
        }
        TextPaint textPaint2 = this.f5495I;
        CharSequence charSequence = this.f5530x;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    public final boolean m791c(CharSequence charSequence) {
        return (AbstractC0605j0.m2241q(this.f5508b) == 1 ? AbstractC0558j.f2652d : AbstractC0558j.f2651c).m2335b(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public final void m790d(float f) {
        TextPaint textPaint;
        int m787g;
        TextPaint textPaint2;
        this.f5513g.left = m785i(this.f5511e.left, this.f5512f.left, f, this.f5496J);
        this.f5513g.top = m785i(this.f5520n, this.f5521o, f, this.f5496J);
        this.f5513g.right = m785i(this.f5511e.right, this.f5512f.right, f, this.f5496J);
        this.f5513g.bottom = m785i(this.f5511e.bottom, this.f5512f.bottom, f, this.f5496J);
        this.f5524r = m785i(this.f5522p, this.f5523q, f, this.f5496J);
        this.f5525s = m785i(this.f5520n, this.f5521o, f, this.f5496J);
        m778p(m785i(this.f5516j, this.f5517k, f, this.f5497K));
        TimeInterpolator timeInterpolator = AbstractC1946a.f5895b;
        this.f5504R = 1.0f - m785i(0.0f, 1.0f, 1.0f - f, timeInterpolator);
        AbstractC0605j0.m2277F(this.f5508b);
        this.f5505S = m785i(1.0f, 0.0f, f, timeInterpolator);
        AbstractC0605j0.m2277F(this.f5508b);
        ColorStateList colorStateList = this.f5519m;
        ColorStateList colorStateList2 = this.f5518l;
        if (colorStateList != colorStateList2) {
            textPaint = this.f5494H;
            m787g = m793a(m786h(colorStateList2), m787g(), f);
        } else {
            textPaint = this.f5494H;
            m787g = m787g();
        }
        textPaint.setColor(m787g);
        if (Build.VERSION.SDK_INT >= 21) {
            float f2 = this.f5502P;
            if (f2 != 0.0f) {
                textPaint2 = this.f5494H;
                f2 = m785i(0.0f, f2, f, timeInterpolator);
            } else {
                textPaint2 = this.f5494H;
            }
            textPaint2.setLetterSpacing(f2);
        }
        this.f5494H.setShadowLayer(m785i(0.0f, this.f5498L, f, null), m785i(0.0f, this.f5499M, f, null), m785i(0.0f, this.f5500N, f, null), m793a(m786h(null), m786h(this.f5501O), f));
        AbstractC0605j0.m2277F(this.f5508b);
    }

    /* renamed from: e */
    public final void m789e(float f) {
        boolean z;
        float f2;
        StaticLayout staticLayout;
        if (this.f5530x == null) {
            return;
        }
        float width = this.f5512f.width();
        float width2 = this.f5511e.width();
        if (Math.abs(f - this.f5517k) < 0.001f) {
            f2 = this.f5517k;
            this.f5490D = 1.0f;
            Typeface typeface = this.f5528v;
            Typeface typeface2 = this.f5526t;
            if (typeface != typeface2) {
                this.f5528v = typeface2;
                z = true;
            } else {
                z = false;
            }
        } else {
            float f3 = this.f5516j;
            Typeface typeface3 = this.f5528v;
            Typeface typeface4 = this.f5527u;
            if (typeface3 != typeface4) {
                this.f5528v = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f - f3) < 0.001f) {
                this.f5490D = 1.0f;
            } else {
                this.f5490D = f / this.f5516j;
            }
            float f4 = this.f5517k / this.f5516j;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
        }
        if (width > 0.0f) {
            z = this.f5491E != f2 || this.f5493G || z;
            this.f5491E = f2;
            this.f5493G = false;
        }
        if (this.f5531y == null || z) {
            this.f5494H.setTextSize(this.f5491E);
            this.f5494H.setTypeface(this.f5528v);
            this.f5494H.setLinearText(this.f5490D != 1.0f);
            boolean m791c = m791c(this.f5530x);
            this.f5532z = m791c;
            try {
                C1815k c1815k = new C1815k(this.f5530x, this.f5494H, (int) width);
                c1815k.f5557l = TextUtils.TruncateAt.END;
                c1815k.f5556k = m791c;
                c1815k.f5553h = Layout.Alignment.ALIGN_NORMAL;
                c1815k.f5555j = false;
                c1815k.f5554i = 1;
                staticLayout = c1815k.m774a();
            } catch (C1814j e) {
                e.getCause().getMessage();
                staticLayout = null;
            }
            staticLayout.getClass();
            this.f5503Q = staticLayout;
            this.f5531y = staticLayout.getText();
        }
    }

    /* renamed from: f */
    public float m788f() {
        TextPaint textPaint = this.f5495I;
        textPaint.setTextSize(this.f5517k);
        textPaint.setTypeface(this.f5526t);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f5502P);
        }
        return -this.f5495I.ascent();
    }

    /* renamed from: g */
    public int m787g() {
        return m786h(this.f5519m);
    }

    /* renamed from: h */
    public final int m786h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f5492F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: j */
    public void m784j() {
        this.f5509c = this.f5512f.width() > 0 && this.f5512f.height() > 0 && this.f5511e.width() > 0 && this.f5511e.height() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m783k() {
        float centerX;
        StaticLayout staticLayout;
        int i;
        float f;
        int i2;
        float centerX2;
        float f2;
        Bitmap bitmap;
        StaticLayout staticLayout2;
        if (this.f5508b.getHeight() <= 0 || this.f5508b.getWidth() <= 0) {
            return;
        }
        float f3 = this.f5491E;
        m789e(this.f5517k);
        CharSequence charSequence = this.f5531y;
        if (charSequence != null && (staticLayout2 = this.f5503Q) != null) {
            this.f5507U = TextUtils.ellipsize(charSequence, this.f5494H, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f5507U;
        float measureText = charSequence2 != null ? this.f5494H.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int m3460z = AbstractC0022t.m3460z(this.f5515i, this.f5532z ? 1 : 0);
        int i3 = m3460z & 112;
        if (i3 != 48) {
            this.f5521o = i3 != 80 ? this.f5512f.centerY() - ((this.f5494H.descent() - this.f5494H.ascent()) / 2.0f) : this.f5494H.ascent() + this.f5512f.bottom;
        } else {
            this.f5521o = this.f5512f.top;
        }
        int i4 = m3460z & 8388615;
        if (i4 == 1) {
            centerX = this.f5512f.centerX();
            measureText /= 2.0f;
        } else if (i4 != 5) {
            this.f5523q = this.f5512f.left;
            m789e(this.f5516j);
            float height = this.f5503Q == null ? staticLayout.getHeight() : 0.0f;
            CharSequence charSequence3 = this.f5531y;
            float measureText2 = charSequence3 == null ? this.f5494H.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            StaticLayout staticLayout3 = this.f5503Q;
            this.f5506T = staticLayout3 != null ? staticLayout3.getLineLeft(0) : 0.0f;
            int m3460z2 = AbstractC0022t.m3460z(this.f5514h, this.f5532z ? 1 : 0);
            i = m3460z2 & 112;
            if (i != 48) {
                f = this.f5511e.top;
            } else if (i != 80) {
                this.f5520n = this.f5511e.centerY() - (height / 2.0f);
                i2 = m3460z2 & 8388615;
                if (i2 == 1) {
                    centerX2 = this.f5511e.centerX();
                    measureText2 /= 2.0f;
                } else if (i2 != 5) {
                    f2 = this.f5511e.left;
                    this.f5522p = f2;
                    bitmap = this.f5488B;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.f5488B = null;
                    }
                    m778p(f3);
                    m790d(this.f5510d);
                } else {
                    centerX2 = this.f5511e.right;
                }
                f2 = centerX2 - measureText2;
                this.f5522p = f2;
                bitmap = this.f5488B;
                if (bitmap != null) {
                }
                m778p(f3);
                m790d(this.f5510d);
            } else {
                f = this.f5494H.descent() + (this.f5511e.bottom - height);
            }
            this.f5520n = f;
            i2 = m3460z2 & 8388615;
            if (i2 == 1) {
            }
            f2 = centerX2 - measureText2;
            this.f5522p = f2;
            bitmap = this.f5488B;
            if (bitmap != null) {
            }
            m778p(f3);
            m790d(this.f5510d);
        } else {
            centerX = this.f5512f.right;
        }
        this.f5523q = centerX - measureText;
        m789e(this.f5516j);
        if (this.f5503Q == null) {
        }
        CharSequence charSequence32 = this.f5531y;
        if (charSequence32 == null) {
        }
        StaticLayout staticLayout32 = this.f5503Q;
        this.f5506T = staticLayout32 != null ? staticLayout32.getLineLeft(0) : 0.0f;
        int m3460z22 = AbstractC0022t.m3460z(this.f5514h, this.f5532z ? 1 : 0);
        i = m3460z22 & 112;
        if (i != 48) {
        }
        this.f5520n = f;
        i2 = m3460z22 & 8388615;
        if (i2 == 1) {
        }
        f2 = centerX2 - measureText2;
        this.f5522p = f2;
        bitmap = this.f5488B;
        if (bitmap != null) {
        }
        m778p(f3);
        m790d(this.f5510d);
    }

    /* renamed from: m */
    public void m781m(ColorStateList colorStateList) {
        if (this.f5519m != colorStateList) {
            this.f5519m = colorStateList;
            m783k();
        }
    }

    /* renamed from: n */
    public void m780n(int i) {
        if (this.f5515i != i) {
            this.f5515i = i;
            m783k();
        }
    }

    /* renamed from: o */
    public void m779o(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f5510d) {
            this.f5510d = f;
            m790d(f);
        }
    }

    /* renamed from: p */
    public final void m778p(float f) {
        m789e(f);
        boolean z = f5486a && this.f5490D != 1.0f;
        this.f5487A = z;
        if (z && this.f5488B == null && !this.f5511e.isEmpty() && !TextUtils.isEmpty(this.f5531y)) {
            m790d(0.0f);
            int width = this.f5503Q.getWidth();
            int height = this.f5503Q.getHeight();
            if (width > 0 && height > 0) {
                this.f5488B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f5503Q.draw(new Canvas(this.f5488B));
                if (this.f5489C == null) {
                    this.f5489C = new Paint(3);
                }
            }
        }
        AbstractC0605j0.m2277F(this.f5508b);
    }

    /* renamed from: q */
    public void m777q(Typeface typeface) {
        boolean z;
        C1830a c1830a = this.f5529w;
        boolean z2 = true;
        if (c1830a != null) {
            c1830a.f5580c = true;
        }
        if (this.f5526t != typeface) {
            this.f5526t = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.f5527u != typeface) {
            this.f5527u = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            m783k();
        }
    }
}