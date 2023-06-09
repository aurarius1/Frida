package p093c.p145g.p146a.p147a.p152e0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p010b.p046j.p050f.p051p.InterfaceC0521a;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p154g0.InterfaceC1867y;

/* renamed from: c.g.a.a.e0.c */
/* loaded from: classes.dex */
public class C1838c extends Drawable implements InterfaceC1867y, InterfaceC0521a {

    /* renamed from: b */
    public C1837b f5602b;

    public C1838c(C1837b c1837b, AbstractC1836a abstractC1836a) {
        this.f5602b = c1837b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C1837b c1837b = this.f5602b;
        if (c1837b.f5601b) {
            c1837b.f5600a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5602b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5602b.f5600a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5602b = new C1837b(this.f5602b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5602b.f5600a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f5602b.f5600a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m753c = AbstractC1839d.m753c(iArr);
        C1837b c1837b = this.f5602b;
        if (c1837b.f5601b != m753c) {
            c1837b.f5601b = m753c;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5602b.f5600a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5602b.f5600a.setColorFilter(colorFilter);
    }

    @Override // p093c.p145g.p146a.p147a.p154g0.InterfaceC1867y
    public void setShapeAppearanceModel(C1856n c1856n) {
        C1851i c1851i = this.f5602b.f5600a;
        c1851i.f5657d.f5633a = c1856n;
        c1851i.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTint(int i) {
        this.f5602b.f5600a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintList(ColorStateList colorStateList) {
        this.f5602b.f5600a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5602b.f5600a.setTintMode(mode);
    }

    public C1838c(C1856n c1856n) {
        this.f5602b = new C1837b(new C1851i(c1856n));
    }
}