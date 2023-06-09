package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0084j;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.q.p0 */
/* loaded from: classes.dex */
public class C0294p0 extends C0269k0 {

    /* renamed from: d */
    public final SeekBar f1682d;

    /* renamed from: e */
    public Drawable f1683e;

    /* renamed from: f */
    public ColorStateList f1684f;

    /* renamed from: g */
    public PorterDuff.Mode f1685g;

    /* renamed from: h */
    public boolean f1686h;

    /* renamed from: i */
    public boolean f1687i;

    public C0294p0(SeekBar seekBar) {
        super(seekBar);
        this.f1684f = null;
        this.f1685g = null;
        this.f1686h = false;
        this.f1687i = false;
        this.f1682d = seekBar;
    }

    @Override // p010b.p016c.p026q.C0269k0
    /* renamed from: a */
    public void mo2781a(AttributeSet attributeSet, int i) {
        super.mo2781a(attributeSet, i);
        Context context = this.f1682d.getContext();
        int[] iArr = AbstractC0084j.AppCompatSeekBar;
        C0302q3 m2740r = C0302q3.m2740r(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1682d;
        AbstractC0605j0.m2270M(seekBar, seekBar.getContext(), iArr, attributeSet, m2740r.f1740b, i, 0);
        Drawable m2750h = m2740r.m2750h(AbstractC0084j.AppCompatSeekBar_android_thumb);
        if (m2750h != null) {
            this.f1682d.setThumb(m2750h);
        }
        Drawable m2751g = m2740r.m2751g(AbstractC0084j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f1683e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1683e = m2751g;
        if (m2751g != null) {
            m2751g.setCallback(this.f1682d);
            AbstractC0022t.m3494g0(m2751g, AbstractC0605j0.m2241q(this.f1682d));
            if (m2751g.isStateful()) {
                m2751g.setState(this.f1682d.getDrawableState());
            }
            m2780c();
        }
        this.f1682d.invalidate();
        int i2 = AbstractC0084j.AppCompatSeekBar_tickMarkTintMode;
        if (m2740r.m2742p(i2)) {
            this.f1685g = AbstractC0290o1.m2783d(m2740r.m2748j(i2, -1), this.f1685g);
            this.f1687i = true;
        }
        int i3 = AbstractC0084j.AppCompatSeekBar_tickMarkTint;
        if (m2740r.m2742p(i3)) {
            this.f1684f = m2740r.m2755c(i3);
            this.f1686h = true;
        }
        m2740r.f1740b.recycle();
        m2780c();
    }

    /* renamed from: c */
    public final void m2780c() {
        Drawable drawable = this.f1683e;
        if (drawable != null) {
            if (this.f1686h || this.f1687i) {
                Drawable m3466u0 = AbstractC0022t.m3466u0(drawable.mutate());
                this.f1683e = m3466u0;
                if (this.f1686h) {
                    AbstractC0022t.m3480n0(m3466u0, this.f1684f);
                }
                if (this.f1687i) {
                    AbstractC0022t.m3478o0(this.f1683e, this.f1685g);
                }
                if (this.f1683e.isStateful()) {
                    this.f1683e.setState(this.f1682d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public void m2779d(Canvas canvas) {
        if (this.f1683e != null) {
            int max = this.f1682d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1683e.getIntrinsicWidth();
                int intrinsicHeight = this.f1683e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1683e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1682d.getWidth() - this.f1682d.getPaddingLeft()) - this.f1682d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1682d.getPaddingLeft(), this.f1682d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1683e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}