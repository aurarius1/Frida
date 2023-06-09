package p093c.p145g.p146a.p147a.p168t;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.p152e0.AbstractC1839d;
import p093c.p145g.p146a.p147a.p152e0.C1838c;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p154g0.InterfaceC1867y;

/* renamed from: c.g.a.a.t.c */
/* loaded from: classes.dex */
public class C1988c {

    /* renamed from: a */
    public static final boolean f6014a;

    /* renamed from: b */
    public final MaterialButton f6015b;

    /* renamed from: c */
    public C1856n f6016c;

    /* renamed from: d */
    public int f6017d;

    /* renamed from: e */
    public int f6018e;

    /* renamed from: f */
    public int f6019f;

    /* renamed from: g */
    public int f6020g;

    /* renamed from: h */
    public int f6021h;

    /* renamed from: i */
    public int f6022i;

    /* renamed from: j */
    public PorterDuff.Mode f6023j;

    /* renamed from: k */
    public ColorStateList f6024k;

    /* renamed from: l */
    public ColorStateList f6025l;

    /* renamed from: m */
    public ColorStateList f6026m;

    /* renamed from: n */
    public Drawable f6027n;

    /* renamed from: o */
    public boolean f6028o = false;

    /* renamed from: p */
    public boolean f6029p = false;

    /* renamed from: q */
    public boolean f6030q = false;

    /* renamed from: r */
    public boolean f6031r;

    /* renamed from: s */
    public LayerDrawable f6032s;

    /* renamed from: t */
    public int f6033t;

    static {
        f6014a = Build.VERSION.SDK_INT >= 21;
    }

    public C1988c(MaterialButton materialButton, C1856n c1856n) {
        this.f6015b = materialButton;
        this.f6016c = c1856n;
    }

    /* renamed from: a */
    public InterfaceC1867y m627a() {
        LayerDrawable layerDrawable = this.f6032s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC1867y) (this.f6032s.getNumberOfLayers() > 2 ? this.f6032s.getDrawable(2) : this.f6032s.getDrawable(1));
    }

    /* renamed from: b */
    public C1851i m626b() {
        return m625c(false);
    }

    /* renamed from: c */
    public final C1851i m625c(boolean z) {
        LayerDrawable layerDrawable = this.f6032s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1851i) (f6014a ? (LayerDrawable) ((InsetDrawable) this.f6032s.getDrawable(0)).getDrawable() : this.f6032s).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: d */
    public final C1851i m624d() {
        return m625c(true);
    }

    /* renamed from: e */
    public void m623e(C1856n c1856n) {
        this.f6016c = c1856n;
        if (m626b() != null) {
            C1851i m626b = m626b();
            m626b.f5657d.f5633a = c1856n;
            m626b.invalidateSelf();
        }
        if (m624d() != null) {
            C1851i m624d = m624d();
            m624d.f5657d.f5633a = c1856n;
            m624d.invalidateSelf();
        }
        if (m627a() != null) {
            m627a().setShapeAppearanceModel(c1856n);
        }
    }

    /* renamed from: f */
    public final void m622f(int i, int i2) {
        int m2237u = AbstractC0605j0.m2237u(this.f6015b);
        int paddingTop = this.f6015b.getPaddingTop();
        int m2238t = AbstractC0605j0.m2238t(this.f6015b);
        int paddingBottom = this.f6015b.getPaddingBottom();
        int i3 = this.f6019f;
        int i4 = this.f6020g;
        this.f6020g = i2;
        this.f6019f = i;
        if (!this.f6029p) {
            m621g();
        }
        AbstractC0605j0.m2261V(this.f6015b, m2237u, (paddingTop + i) - i3, m2238t, (paddingBottom + i2) - i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* renamed from: g */
    public final void m621g() {
        InsetDrawable insetDrawable;
        MaterialButton materialButton = this.f6015b;
        C1851i c1851i = new C1851i(this.f6016c);
        c1851i.m739n(this.f6015b.getContext());
        AbstractC0022t.m3480n0(c1851i, this.f6024k);
        PorterDuff.Mode mode = this.f6023j;
        if (mode != null) {
            AbstractC0022t.m3478o0(c1851i, mode);
        }
        c1851i.m734s(this.f6022i, this.f6025l);
        C1851i c1851i2 = new C1851i(this.f6016c);
        c1851i2.setTint(0);
        c1851i2.m735r(this.f6022i, this.f6028o ? AbstractC1077v0.m1263p(this.f6015b, AbstractC1804b.colorSurface) : 0);
        if (f6014a) {
            C1851i c1851i3 = new C1851i(this.f6016c);
            this.f6027n = c1851i3;
            AbstractC0022t.m3482m0(c1851i3, -1);
            ?? rippleDrawable = new RippleDrawable(AbstractC1839d.m754b(this.f6026m), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c1851i2, c1851i}), this.f6017d, this.f6019f, this.f6018e, this.f6020g), this.f6027n);
            this.f6032s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            C1838c c1838c = new C1838c(this.f6016c);
            this.f6027n = c1838c;
            AbstractC0022t.m3480n0(c1838c, AbstractC1839d.m754b(this.f6026m));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c1851i2, c1851i, this.f6027n});
            this.f6032s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f6017d, this.f6019f, this.f6018e, this.f6020g);
        }
        materialButton.setInternalBackground(insetDrawable);
        C1851i m626b = m626b();
        if (m626b != null) {
            m626b.m738o(this.f6033t);
        }
    }

    /* renamed from: h */
    public final void m620h() {
        C1851i m626b = m626b();
        C1851i m624d = m624d();
        if (m626b != null) {
            m626b.m734s(this.f6022i, this.f6025l);
            if (m624d != null) {
                m624d.m735r(this.f6022i, this.f6028o ? AbstractC1077v0.m1263p(this.f6015b, AbstractC1804b.colorSurface) : 0);
            }
        }
    }
}