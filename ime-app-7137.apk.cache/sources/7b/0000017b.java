package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p061m.InterfaceC0649l;

/* renamed from: b.c.q.g0 */
/* loaded from: classes.dex */
public class C0247g0 {

    /* renamed from: a */
    public final ImageView f1585a;

    /* renamed from: b */
    public C0292o3 f1586b;

    /* renamed from: c */
    public C0292o3 f1587c;

    public C0247g0(ImageView imageView) {
        this.f1585a = imageView;
    }

    /* renamed from: a */
    public void m2824a() {
        ColorStateList supportImageTintList;
        Drawable drawable = this.f1585a.getDrawable();
        if (drawable != null) {
            AbstractC0290o1.m2785b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f1587c == null) {
                    this.f1587c = new C0292o3();
                }
                C0292o3 c0292o3 = this.f1587c;
                PorterDuff.Mode mode = null;
                c0292o3.f1678a = null;
                c0292o3.f1681d = false;
                c0292o3.f1679b = null;
                c0292o3.f1680c = false;
                ImageView imageView = this.f1585a;
                if (i >= 21) {
                    supportImageTintList = imageView.getImageTintList();
                } else {
                    supportImageTintList = imageView instanceof InterfaceC0649l ? ((InterfaceC0649l) imageView).getSupportImageTintList() : null;
                }
                if (supportImageTintList != null) {
                    c0292o3.f1681d = true;
                    c0292o3.f1678a = supportImageTintList;
                }
                ImageView imageView2 = this.f1585a;
                if (i >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof InterfaceC0649l) {
                    mode = ((InterfaceC0649l) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    c0292o3.f1680c = true;
                    c0292o3.f1679b = mode;
                }
                if (c0292o3.f1681d || c0292o3.f1680c) {
                    C0229d0.m2860f(drawable, c0292o3, this.f1585a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0292o3 c0292o32 = this.f1586b;
            if (c0292o32 != null) {
                C0229d0.m2860f(drawable, c0292o32, this.f1585a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public boolean m2823b() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1585a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: c */
    public void m2822c(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int m2745m;
        Context context = this.f1585a.getContext();
        int[] iArr = AbstractC0084j.AppCompatImageView;
        C0302q3 m2740r = C0302q3.m2740r(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1585a;
        AbstractC0605j0.m2270M(imageView, imageView.getContext(), iArr, attributeSet, m2740r.f1740b, i, 0);
        try {
            Drawable drawable3 = this.f1585a.getDrawable();
            if (drawable3 == null && (m2745m = m2740r.m2745m(AbstractC0084j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable3 = AbstractC0142b.m3000b(this.f1585a.getContext(), m2745m)) != null) {
                this.f1585a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC0290o1.m2785b(drawable3);
            }
            int i2 = AbstractC0084j.AppCompatImageView_tint;
            if (m2740r.m2742p(i2)) {
                ImageView imageView2 = this.f1585a;
                ColorStateList m2755c = m2740r.m2755c(i2);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 21) {
                    imageView2.setImageTintList(m2755c);
                    if (i3 == 21 && (drawable2 = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable2);
                    }
                } else if (imageView2 instanceof InterfaceC0649l) {
                    ((InterfaceC0649l) imageView2).setSupportImageTintList(m2755c);
                }
            }
            int i4 = AbstractC0084j.AppCompatImageView_tintMode;
            if (m2740r.m2742p(i4)) {
                ImageView imageView3 = this.f1585a;
                PorterDuff.Mode m2783d = AbstractC0290o1.m2783d(m2740r.m2748j(i4, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 21) {
                    imageView3.setImageTintMode(m2783d);
                    if (i5 == 21 && (drawable = imageView3.getDrawable()) != null && imageView3.getImageTintList() != null) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView3.getDrawableState());
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                } else if (imageView3 instanceof InterfaceC0649l) {
                    ((InterfaceC0649l) imageView3).setSupportImageTintMode(m2783d);
                }
            }
            m2740r.f1740b.recycle();
        } catch (Throwable th) {
            m2740r.f1740b.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void m2821d(int i) {
        if (i != 0) {
            Drawable m3000b = AbstractC0142b.m3000b(this.f1585a.getContext(), i);
            if (m3000b != null) {
                AbstractC0290o1.m2785b(m3000b);
            }
            this.f1585a.setImageDrawable(m3000b);
        } else {
            this.f1585a.setImageDrawable(null);
        }
        m2824a();
    }

    /* renamed from: e */
    public void m2820e(ColorStateList colorStateList) {
        if (this.f1586b == null) {
            this.f1586b = new C0292o3();
        }
        C0292o3 c0292o3 = this.f1586b;
        c0292o3.f1678a = colorStateList;
        c0292o3.f1681d = true;
        m2824a();
    }

    /* renamed from: f */
    public void m2819f(PorterDuff.Mode mode) {
        if (this.f1586b == null) {
            this.f1586b = new C0292o3();
        }
        C0292o3 c0292o3 = this.f1586b;
        c0292o3.f1679b = mode;
        c0292o3.f1680c = true;
        m2824a();
    }
}