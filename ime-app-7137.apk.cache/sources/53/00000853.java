package p093c.p145g.p146a.p147a.p170v;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p050f.AbstractC0506a;
import p010b.p046j.p050f.p051p.InterfaceC0521a;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.p149b0.C1818n;
import p093c.p145g.p146a.p147a.p149b0.InterfaceC1817m;
import p093c.p145g.p146a.p147a.p151d0.C1833d;
import p093c.p145g.p146a.p147a.p152e0.AbstractC1839d;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p161m.C1948c;
import p093c.p145g.p146a.p147a.p173y.C2045a;

/* renamed from: c.g.a.a.v.e */
/* loaded from: classes.dex */
public class C1999e extends C1851i implements InterfaceC0521a, Drawable.Callback, InterfaceC1817m {

    /* renamed from: A0 */
    public ColorStateList f6052A0;

    /* renamed from: B */
    public ColorStateList f6053B;

    /* renamed from: B0 */
    public PorterDuff.Mode f6054B0;

    /* renamed from: C */
    public ColorStateList f6055C;

    /* renamed from: C0 */
    public int[] f6056C0;

    /* renamed from: D */
    public float f6057D;

    /* renamed from: D0 */
    public boolean f6058D0;

    /* renamed from: E */
    public float f6059E;

    /* renamed from: E0 */
    public ColorStateList f6060E0;

    /* renamed from: F */
    public ColorStateList f6061F;

    /* renamed from: F0 */
    public WeakReference f6062F0;

    /* renamed from: G */
    public float f6063G;

    /* renamed from: G0 */
    public TextUtils.TruncateAt f6064G0;

    /* renamed from: H */
    public ColorStateList f6065H;

    /* renamed from: H0 */
    public boolean f6066H0;

    /* renamed from: I */
    public CharSequence f6067I;

    /* renamed from: I0 */
    public int f6068I0;

    /* renamed from: J */
    public boolean f6069J;

    /* renamed from: J0 */
    public boolean f6070J0;

    /* renamed from: K */
    public Drawable f6071K;

    /* renamed from: L */
    public ColorStateList f6072L;

    /* renamed from: M */
    public float f6073M;

    /* renamed from: N */
    public boolean f6074N;

    /* renamed from: O */
    public boolean f6075O;

    /* renamed from: P */
    public Drawable f6076P;

    /* renamed from: Q */
    public Drawable f6077Q;

    /* renamed from: R */
    public ColorStateList f6078R;

    /* renamed from: S */
    public float f6079S;

    /* renamed from: T */
    public CharSequence f6080T;

    /* renamed from: U */
    public boolean f6081U;

    /* renamed from: V */
    public boolean f6082V;

    /* renamed from: W */
    public Drawable f6083W;

    /* renamed from: X */
    public ColorStateList f6084X;

    /* renamed from: Y */
    public C1948c f6085Y;

    /* renamed from: Z */
    public C1948c f6086Z;

    /* renamed from: a0 */
    public float f6087a0;

    /* renamed from: b0 */
    public float f6088b0;

    /* renamed from: c0 */
    public float f6089c0;

    /* renamed from: d0 */
    public float f6090d0;

    /* renamed from: e0 */
    public float f6091e0;

    /* renamed from: f0 */
    public float f6092f0;

    /* renamed from: g0 */
    public float f6093g0;

    /* renamed from: h0 */
    public float f6094h0;

    /* renamed from: i0 */
    public final Context f6095i0;

    /* renamed from: j0 */
    public final Paint f6096j0;

    /* renamed from: k0 */
    public final Paint.FontMetrics f6097k0;

    /* renamed from: l0 */
    public final RectF f6098l0;

    /* renamed from: m0 */
    public final PointF f6099m0;

    /* renamed from: n0 */
    public final Path f6100n0;

    /* renamed from: o0 */
    public final C1818n f6101o0;

    /* renamed from: p0 */
    public int f6102p0;

    /* renamed from: q0 */
    public int f6103q0;

    /* renamed from: r0 */
    public int f6104r0;

    /* renamed from: s0 */
    public int f6105s0;

    /* renamed from: t0 */
    public int f6106t0;

    /* renamed from: u0 */
    public int f6107u0;

    /* renamed from: v0 */
    public boolean f6108v0;

    /* renamed from: w0 */
    public int f6109w0;

    /* renamed from: x0 */
    public int f6110x0;

    /* renamed from: y0 */
    public ColorFilter f6111y0;

    /* renamed from: z0 */
    public PorterDuffColorFilter f6112z0;

    /* renamed from: z */
    public static final int[] f6051z = {16842910};

    /* renamed from: A */
    public static final ShapeDrawable f6050A = new ShapeDrawable(new OvalShape());

    public C1999e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C1856n.m719b(context, attributeSet, i, i2).m727a());
        this.f6059E = -1.0f;
        this.f6096j0 = new Paint(1);
        this.f6097k0 = new Paint.FontMetrics();
        this.f6098l0 = new RectF();
        this.f6099m0 = new PointF();
        this.f6100n0 = new Path();
        this.f6110x0 = 255;
        this.f6054B0 = PorterDuff.Mode.SRC_IN;
        this.f6062F0 = new WeakReference(null);
        this.f5657d.f5634b = new C2045a(context);
        m730w();
        this.f6095i0 = context;
        C1818n c1818n = new C1818n(this);
        this.f6101o0 = c1818n;
        this.f6067I = "";
        c1818n.f5559a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f6051z;
        setState(iArr);
        m584d0(iArr);
        this.f6066H0 = true;
        if (AbstractC1839d.f5603a) {
            f6050A.setTint(-1);
        }
    }

    /* renamed from: G */
    public static boolean m608G(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: H */
    public static boolean m607H(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m614A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m572p0()) {
            float f = this.f6094h0 + this.f6093g0;
            if (AbstractC0022t.m3529E(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f6079S;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f6079S;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f6079S;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: B */
    public final void m613B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m572p0()) {
            float f = this.f6094h0 + this.f6093g0 + this.f6079S + this.f6092f0 + this.f6091e0;
            if (AbstractC0022t.m3529E(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: C */
    public float m612C() {
        if (m572p0()) {
            return this.f6092f0 + this.f6079S + this.f6093g0;
        }
        return 0.0f;
    }

    /* renamed from: D */
    public float m611D() {
        return this.f6070J0 ? m741l() : this.f6059E;
    }

    /* renamed from: E */
    public Drawable m610E() {
        Drawable drawable = this.f6076P;
        if (drawable != null) {
            return AbstractC0022t.m3468t0(drawable);
        }
        return null;
    }

    /* renamed from: F */
    public final float m609F() {
        Drawable drawable = this.f6108v0 ? this.f6083W : this.f6071K;
        float f = this.f6073M;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    /* renamed from: I */
    public void m606I() {
        InterfaceC1998d interfaceC1998d = (InterfaceC1998d) this.f6062F0.get();
        if (interfaceC1998d != null) {
            Chip chip = (Chip) interfaceC1998d;
            chip.m305c(chip.f6781t);
            chip.requestLayout();
            if (Build.VERSION.SDK_INT >= 21) {
                chip.invalidateOutline();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m605J(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        int colorForState;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f6053B;
        int m748e = m748e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f6102p0) : 0);
        boolean z3 = true;
        if (this.f6102p0 != m748e) {
            this.f6102p0 = m748e;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f6055C;
        int m748e2 = m748e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f6103q0) : 0);
        if (this.f6103q0 != m748e2) {
            this.f6103q0 = m748e2;
            onStateChange = true;
        }
        int m2389e = AbstractC0506a.m2389e(m748e2, m748e);
        if ((this.f6104r0 != m2389e) | (this.f5657d.f5636d == null)) {
            this.f6104r0 = m2389e;
            m737p(ColorStateList.valueOf(m2389e));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f6061F;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f6105s0) : 0;
        if (this.f6105s0 != colorForState2) {
            this.f6105s0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f6060E0 == null || !AbstractC1839d.m753c(iArr)) ? 0 : this.f6060E0.getColorForState(iArr, this.f6106t0);
        if (this.f6106t0 != colorForState3) {
            this.f6106t0 = colorForState3;
            if (this.f6058D0) {
                onStateChange = true;
            }
        }
        C1833d c1833d = this.f6101o0.f5564f;
        int colorForState4 = (c1833d == null || (colorStateList = c1833d.f5586a) == null) ? 0 : colorStateList.getColorForState(iArr, this.f6107u0);
        if (this.f6107u0 != colorForState4) {
            this.f6107u0 = colorForState4;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i : state) {
                if (i == 16842912) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z4 = z && this.f6081U;
        if (this.f6108v0 != z4 && this.f6083W != null) {
            float m568z = m568z();
            this.f6108v0 = z4;
            if (m568z != m568z()) {
                onStateChange = true;
                z2 = true;
                ColorStateList colorStateList5 = this.f6052A0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f6109w0) : 0;
                if (this.f6109w0 == colorForState) {
                    this.f6109w0 = colorForState;
                    this.f6112z0 = AbstractC1077v0.m1279Y(this, this.f6052A0, this.f6054B0);
                } else {
                    z3 = onStateChange;
                }
                if (m607H(this.f6071K)) {
                    z3 |= this.f6071K.setState(iArr);
                }
                if (m607H(this.f6083W)) {
                    z3 |= this.f6083W.setState(iArr);
                }
                if (m607H(this.f6076P)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z3 |= this.f6076P.setState(iArr3);
                }
                if (AbstractC1839d.f5603a && m607H(this.f6077Q)) {
                    z3 |= this.f6077Q.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    m606I();
                }
                return z3;
            }
            onStateChange = true;
        }
        z2 = false;
        ColorStateList colorStateList52 = this.f6052A0;
        if (colorStateList52 == null) {
        }
        if (this.f6109w0 == colorForState) {
        }
        if (m607H(this.f6071K)) {
        }
        if (m607H(this.f6083W)) {
        }
        if (m607H(this.f6076P)) {
        }
        if (AbstractC1839d.f5603a) {
            z3 |= this.f6077Q.setState(iArr2);
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    /* renamed from: K */
    public void m604K(boolean z) {
        if (this.f6081U != z) {
            this.f6081U = z;
            float m568z = m568z();
            if (!z && this.f6108v0) {
                this.f6108v0 = false;
            }
            float m568z2 = m568z();
            invalidateSelf();
            if (m568z != m568z2) {
                m606I();
            }
        }
    }

    /* renamed from: L */
    public void m603L(Drawable drawable) {
        if (this.f6083W != drawable) {
            float m568z = m568z();
            this.f6083W = drawable;
            float m568z2 = m568z();
            m571q0(this.f6083W);
            m570x(this.f6083W);
            invalidateSelf();
            if (m568z != m568z2) {
                m606I();
            }
        }
    }

    /* renamed from: M */
    public void m602M(ColorStateList colorStateList) {
        if (this.f6084X != colorStateList) {
            this.f6084X = colorStateList;
            if (this.f6082V && this.f6083W != null && this.f6081U) {
                AbstractC0022t.m3480n0(this.f6083W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: N */
    public void m601N(boolean z) {
        if (this.f6082V != z) {
            boolean m574n0 = m574n0();
            this.f6082V = z;
            boolean m574n02 = m574n0();
            if (m574n0 != m574n02) {
                if (m574n02) {
                    m570x(this.f6083W);
                } else {
                    m571q0(this.f6083W);
                }
                invalidateSelf();
                m606I();
            }
        }
    }

    /* renamed from: O */
    public void m600O(ColorStateList colorStateList) {
        if (this.f6055C != colorStateList) {
            this.f6055C = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    /* renamed from: P */
    public void m599P(float f) {
        if (this.f6059E != f) {
            this.f6059E = f;
            this.f5657d.f5633a = this.f5657d.f5633a.m716e(f);
            invalidateSelf();
        }
    }

    /* renamed from: Q */
    public void m598Q(float f) {
        if (this.f6094h0 != f) {
            this.f6094h0 = f;
            invalidateSelf();
            m606I();
        }
    }

    /* renamed from: R */
    public void m597R(Drawable drawable) {
        Drawable drawable2 = this.f6071K;
        Drawable m3468t0 = drawable2 != null ? AbstractC0022t.m3468t0(drawable2) : null;
        if (m3468t0 != drawable) {
            float m568z = m568z();
            this.f6071K = drawable != null ? AbstractC0022t.m3466u0(drawable).mutate() : null;
            float m568z2 = m568z();
            m571q0(m3468t0);
            if (m573o0()) {
                m570x(this.f6071K);
            }
            invalidateSelf();
            if (m568z != m568z2) {
                m606I();
            }
        }
    }

    /* renamed from: S */
    public void m596S(float f) {
        if (this.f6073M != f) {
            float m568z = m568z();
            this.f6073M = f;
            float m568z2 = m568z();
            invalidateSelf();
            if (m568z != m568z2) {
                m606I();
            }
        }
    }

    /* renamed from: T */
    public void m595T(ColorStateList colorStateList) {
        this.f6074N = true;
        if (this.f6072L != colorStateList) {
            this.f6072L = colorStateList;
            if (m573o0()) {
                AbstractC0022t.m3480n0(this.f6071K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: U */
    public void m594U(boolean z) {
        if (this.f6069J != z) {
            boolean m573o0 = m573o0();
            this.f6069J = z;
            boolean m573o02 = m573o0();
            if (m573o0 != m573o02) {
                if (m573o02) {
                    m570x(this.f6071K);
                } else {
                    m571q0(this.f6071K);
                }
                invalidateSelf();
                m606I();
            }
        }
    }

    /* renamed from: V */
    public void m593V(float f) {
        if (this.f6057D != f) {
            this.f6057D = f;
            invalidateSelf();
            m606I();
        }
    }

    /* renamed from: W */
    public void m592W(float f) {
        if (this.f6087a0 != f) {
            this.f6087a0 = f;
            invalidateSelf();
            m606I();
        }
    }

    /* renamed from: X */
    public void m591X(ColorStateList colorStateList) {
        if (this.f6061F != colorStateList) {
            this.f6061F = colorStateList;
            if (this.f6070J0) {
                m733t(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void m590Y(float f) {
        if (this.f6063G != f) {
            this.f6063G = f;
            this.f6096j0.setStrokeWidth(f);
            if (this.f6070J0) {
                this.f5657d.f5644l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void m589Z(Drawable drawable) {
        Drawable m610E = m610E();
        if (m610E != drawable) {
            float m612C = m612C();
            this.f6076P = drawable != null ? AbstractC0022t.m3466u0(drawable).mutate() : null;
            if (AbstractC1839d.f5603a) {
                this.f6077Q = new RippleDrawable(AbstractC1839d.m754b(this.f6065H), this.f6076P, f6050A);
            }
            float m612C2 = m612C();
            m571q0(m610E);
            if (m572p0()) {
                m570x(this.f6076P);
            }
            invalidateSelf();
            if (m612C != m612C2) {
                m606I();
            }
        }
    }

    @Override // p093c.p145g.p146a.p147a.p149b0.InterfaceC1817m
    /* renamed from: a */
    public void mo588a() {
        m606I();
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void m587a0(float f) {
        if (this.f6093g0 != f) {
            this.f6093g0 = f;
            invalidateSelf();
            if (m572p0()) {
                m606I();
            }
        }
    }

    /* renamed from: b0 */
    public void m586b0(float f) {
        if (this.f6079S != f) {
            this.f6079S = f;
            invalidateSelf();
            if (m572p0()) {
                m606I();
            }
        }
    }

    /* renamed from: c0 */
    public void m585c0(float f) {
        if (this.f6092f0 != f) {
            this.f6092f0 = f;
            invalidateSelf();
            if (m572p0()) {
                m606I();
            }
        }
    }

    /* renamed from: d0 */
    public boolean m584d0(int[] iArr) {
        if (Arrays.equals(this.f6056C0, iArr)) {
            return false;
        }
        this.f6056C0 = iArr;
        if (m572p0()) {
            return m605J(getState(), iArr);
        }
        return false;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Drawable drawable;
        int i7;
        float f;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f6110x0) == 0) {
            return;
        }
        if (i < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            i2 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i) : canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
        } else {
            i2 = 0;
        }
        if (!this.f6070J0) {
            this.f6096j0.setColor(this.f6102p0);
            this.f6096j0.setStyle(Paint.Style.FILL);
            this.f6098l0.set(bounds);
            canvas.drawRoundRect(this.f6098l0, m611D(), m611D(), this.f6096j0);
        }
        if (!this.f6070J0) {
            this.f6096j0.setColor(this.f6103q0);
            this.f6096j0.setStyle(Paint.Style.FILL);
            Paint paint = this.f6096j0;
            ColorFilter colorFilter = this.f6111y0;
            if (colorFilter == null) {
                colorFilter = this.f6112z0;
            }
            paint.setColorFilter(colorFilter);
            this.f6098l0.set(bounds);
            canvas.drawRoundRect(this.f6098l0, m611D(), m611D(), this.f6096j0);
        }
        if (this.f6070J0) {
            super.draw(canvas);
        }
        if (this.f6063G > 0.0f && !this.f6070J0) {
            this.f6096j0.setColor(this.f6105s0);
            this.f6096j0.setStyle(Paint.Style.STROKE);
            if (!this.f6070J0) {
                Paint paint2 = this.f6096j0;
                ColorFilter colorFilter2 = this.f6111y0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f6112z0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f6098l0;
            float f6 = this.f6063G / 2.0f;
            rectF.set(bounds.left + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.f6059E - (this.f6063G / 2.0f);
            canvas.drawRoundRect(this.f6098l0, f7, f7, this.f6096j0);
        }
        this.f6096j0.setColor(this.f6106t0);
        this.f6096j0.setStyle(Paint.Style.FILL);
        this.f6098l0.set(bounds);
        if (this.f6070J0) {
            m750c(new RectF(bounds), this.f6100n0);
            i3 = 0;
            m746g(canvas, this.f6096j0, this.f6100n0, this.f5657d.f5633a, m745h());
        } else {
            canvas.drawRoundRect(this.f6098l0, m611D(), m611D(), this.f6096j0);
            i3 = 0;
        }
        if (m573o0()) {
            m569y(bounds, this.f6098l0);
            RectF rectF2 = this.f6098l0;
            float f8 = rectF2.left;
            float f9 = rectF2.top;
            canvas.translate(f8, f9);
            this.f6071K.setBounds(i3, i3, (int) this.f6098l0.width(), (int) this.f6098l0.height());
            this.f6071K.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (m574n0()) {
            m569y(bounds, this.f6098l0);
            RectF rectF3 = this.f6098l0;
            float f10 = rectF3.left;
            float f11 = rectF3.top;
            canvas.translate(f10, f11);
            this.f6083W.setBounds(i3, i3, (int) this.f6098l0.width(), (int) this.f6098l0.height());
            this.f6083W.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (!this.f6066H0 || this.f6067I == null) {
            i4 = i2;
            i5 = 255;
            i6 = 0;
        } else {
            PointF pointF = this.f6099m0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.f6067I != null) {
                float m568z = m568z() + this.f6087a0 + this.f6090d0;
                if (AbstractC0022t.m3529E(this) == 0) {
                    pointF.x = bounds.left + m568z;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - m568z;
                    align = Paint.Align.RIGHT;
                }
                this.f6101o0.f5559a.getFontMetrics(this.f6097k0);
                Paint.FontMetrics fontMetrics = this.f6097k0;
                pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.f6098l0;
            rectF4.setEmpty();
            if (this.f6067I != null) {
                float m568z2 = m568z() + this.f6087a0 + this.f6090d0;
                float m612C = m612C() + this.f6094h0 + this.f6091e0;
                if (AbstractC0022t.m3529E(this) == 0) {
                    rectF4.left = bounds.left + m568z2;
                    f = bounds.right - m612C;
                } else {
                    rectF4.left = bounds.left + m612C;
                    f = bounds.right - m568z2;
                }
                rectF4.right = f;
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            C1818n c1818n = this.f6101o0;
            if (c1818n.f5564f != null) {
                c1818n.f5559a.drawableState = getState();
                C1818n c1818n2 = this.f6101o0;
                c1818n2.f5564f.m757c(this.f6095i0, c1818n2.f5559a, c1818n2.f5560b);
            }
            this.f6101o0.f5559a.setTextAlign(align);
            boolean z = Math.round(this.f6101o0.m773a(this.f6067I.toString())) > Math.round(this.f6098l0.width());
            if (z) {
                i7 = canvas.save();
                canvas.clipRect(this.f6098l0);
            } else {
                i7 = 0;
            }
            CharSequence charSequence = this.f6067I;
            if (z && this.f6064G0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f6101o0.f5559a, this.f6098l0.width(), this.f6064G0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.f6099m0;
            i6 = 0;
            i5 = 255;
            i4 = i2;
            canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.f6101o0.f5559a);
            if (z) {
                canvas.restoreToCount(i7);
            }
        }
        if (m572p0()) {
            m614A(bounds, this.f6098l0);
            RectF rectF5 = this.f6098l0;
            float f12 = rectF5.left;
            float f13 = rectF5.top;
            canvas.translate(f12, f13);
            this.f6076P.setBounds(i6, i6, (int) this.f6098l0.width(), (int) this.f6098l0.height());
            if (AbstractC1839d.f5603a) {
                this.f6077Q.setBounds(this.f6076P.getBounds());
                this.f6077Q.jumpToCurrentState();
                drawable = this.f6077Q;
            } else {
                drawable = this.f6076P;
            }
            drawable.draw(canvas);
            canvas.translate(-f12, -f13);
        }
        if (this.f6110x0 < i5) {
            canvas.restoreToCount(i4);
        }
    }

    /* renamed from: e0 */
    public void m583e0(ColorStateList colorStateList) {
        if (this.f6078R != colorStateList) {
            this.f6078R = colorStateList;
            if (m572p0()) {
                AbstractC0022t.m3480n0(this.f6076P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: f0 */
    public void m582f0(boolean z) {
        if (this.f6075O != z) {
            boolean m572p0 = m572p0();
            this.f6075O = z;
            boolean m572p02 = m572p0();
            if (m572p0 != m572p02) {
                if (m572p02) {
                    m570x(this.f6076P);
                } else {
                    m571q0(this.f6076P);
                }
                invalidateSelf();
                m606I();
            }
        }
    }

    /* renamed from: g0 */
    public void m581g0(float f) {
        if (this.f6089c0 != f) {
            float m568z = m568z();
            this.f6089c0 = f;
            float m568z2 = m568z();
            invalidateSelf();
            if (m568z != m568z2) {
                m606I();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6110x0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f6111y0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f6057D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(m612C() + this.f6101o0.m773a(this.f6067I.toString()) + m568z() + this.f6087a0 + this.f6090d0 + this.f6091e0 + this.f6094h0), this.f6068I0);
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f6070J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f6057D, this.f6059E);
        } else {
            outline.setRoundRect(bounds, this.f6059E);
        }
        outline.setAlpha(this.f6110x0 / 255.0f);
    }

    /* renamed from: h0 */
    public void m580h0(float f) {
        if (this.f6088b0 != f) {
            float m568z = m568z();
            this.f6088b0 = f;
            float m568z2 = m568z();
            invalidateSelf();
            if (m568z != m568z2) {
                m606I();
            }
        }
    }

    /* renamed from: i0 */
    public void m579i0(ColorStateList colorStateList) {
        if (this.f6065H != colorStateList) {
            this.f6065H = colorStateList;
            this.f6060E0 = this.f6058D0 ? AbstractC1839d.m754b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (m608G(this.f6053B) || m608G(this.f6055C) || m608G(this.f6061F)) {
            return true;
        }
        if (this.f6058D0 && m608G(this.f6060E0)) {
            return true;
        }
        C1833d c1833d = this.f6101o0.f5564f;
        if ((c1833d == null || (colorStateList = c1833d.f5586a) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f6082V && this.f6083W != null && this.f6081U) || m607H(this.f6071K) || m607H(this.f6083W) || m608G(this.f6052A0);
    }

    /* renamed from: j0 */
    public void m578j0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f6067I, charSequence)) {
            return;
        }
        this.f6067I = charSequence;
        this.f6101o0.f5562d = true;
        invalidateSelf();
        m606I();
    }

    /* renamed from: k0 */
    public void m577k0(float f) {
        if (this.f6091e0 != f) {
            this.f6091e0 = f;
            invalidateSelf();
            m606I();
        }
    }

    /* renamed from: l0 */
    public void m576l0(float f) {
        if (this.f6090d0 != f) {
            this.f6090d0 = f;
            invalidateSelf();
            m606I();
        }
    }

    /* renamed from: m0 */
    public void m575m0(boolean z) {
        if (this.f6058D0 != z) {
            this.f6058D0 = z;
            this.f6060E0 = z ? AbstractC1839d.m754b(this.f6065H) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: n0 */
    public final boolean m574n0() {
        return this.f6082V && this.f6083W != null && this.f6108v0;
    }

    /* renamed from: o0 */
    public final boolean m573o0() {
        return this.f6069J && this.f6071K != null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m573o0()) {
            onLayoutDirectionChanged |= AbstractC0022t.m3494g0(this.f6071K, i);
        }
        if (m574n0()) {
            onLayoutDirectionChanged |= AbstractC0022t.m3494g0(this.f6083W, i);
        }
        if (m572p0()) {
            onLayoutDirectionChanged |= AbstractC0022t.m3494g0(this.f6076P, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m573o0()) {
            onLevelChange |= this.f6071K.setLevel(i);
        }
        if (m574n0()) {
            onLevelChange |= this.f6083W.setLevel(i);
        }
        if (m572p0()) {
            onLevelChange |= this.f6076P.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f6070J0) {
            super.onStateChange(iArr);
        }
        return m605J(iArr, this.f6056C0);
    }

    /* renamed from: p0 */
    public final boolean m572p0() {
        return this.f6075O && this.f6076P != null;
    }

    /* renamed from: q0 */
    public final void m571q0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f6110x0 != i) {
            this.f6110x0 = i;
            invalidateSelf();
        }
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f6111y0 != colorFilter) {
            this.f6111y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintList(ColorStateList colorStateList) {
        if (this.f6052A0 != colorStateList) {
            this.f6052A0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.C1851i, android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f6054B0 != mode) {
            this.f6054B0 = mode;
            this.f6112z0 = AbstractC1077v0.m1279Y(this, this.f6052A0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m573o0()) {
            visible |= this.f6071K.setVisible(z, z2);
        }
        if (m574n0()) {
            visible |= this.f6083W.setVisible(z, z2);
        }
        if (m572p0()) {
            visible |= this.f6076P.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: x */
    public final void m570x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0022t.m3494g0(drawable, AbstractC0022t.m3529E(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f6076P) {
            if (drawable.isStateful()) {
                drawable.setState(this.f6056C0);
            }
            AbstractC0022t.m3480n0(drawable, this.f6078R);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f6071K;
        if (drawable == drawable2 && this.f6074N) {
            AbstractC0022t.m3480n0(drawable2, this.f6072L);
        }
    }

    /* renamed from: y */
    public final void m569y(Rect rect, RectF rectF) {
        float f;
        rectF.setEmpty();
        if (m573o0() || m574n0()) {
            float f2 = this.f6087a0 + this.f6088b0;
            float m609F = m609F();
            if (AbstractC0022t.m3529E(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + m609F;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - m609F;
            }
            Drawable drawable = this.f6108v0 ? this.f6083W : this.f6071K;
            float f5 = this.f6073M;
            if (f5 <= 0.0f && drawable != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f6095i0.getResources().getDisplayMetrics()));
                if (drawable.getIntrinsicHeight() <= f5) {
                    f = drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f5;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    /* renamed from: z */
    public float m568z() {
        if (m573o0() || m574n0()) {
            return m609F() + this.f6088b0 + this.f6089c0;
        }
        return 0.0f;
    }
}