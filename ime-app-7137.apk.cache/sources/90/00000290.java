package p010b.p046j.p050f.p051p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: b.j.f.p.d */
/* loaded from: classes.dex */
public class C0524d extends C0523c {

    /* renamed from: i */
    public static Method f2576i;

    public C0524d(Drawable drawable) {
        super(drawable);
        if (f2576i == null) {
            try {
                f2576i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // p010b.p046j.p050f.p051p.C0523c
    /* renamed from: a */
    public boolean mo2353a() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f2575h;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2575h.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2575h.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2575h;
        if (drawable != null && (method = f2576i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f2575h.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2575h.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p010b.p046j.p050f.p051p.C0523c, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // p010b.p046j.p050f.p051p.C0523c, android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTint(int i) {
        if (mo2353a()) {
            super.setTint(i);
        } else {
            this.f2575h.setTint(i);
        }
    }

    @Override // p010b.p046j.p050f.p051p.C0523c, android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintList(ColorStateList colorStateList) {
        if (mo2353a()) {
            this.f2573f.f2579c = colorStateList;
            m2354c(getState());
            return;
        }
        this.f2575h.setTintList(colorStateList);
    }

    @Override // p010b.p046j.p050f.p051p.C0523c, android.graphics.drawable.Drawable, p010b.p046j.p050f.p051p.InterfaceC0521a
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo2353a()) {
            this.f2573f.f2580d = mode;
            m2354c(getState());
            return;
        }
        this.f2575h.setTintMode(mode);
    }

    public C0524d(C0525e c0525e, Resources resources) {
        super(c0525e, resources);
        if (f2576i == null) {
            try {
                f2576i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }
}