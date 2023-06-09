package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p010b.p016c.AbstractC0084j;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.InterfaceC0630w;

/* renamed from: b.c.q.x */
/* loaded from: classes.dex */
public class C0333x {

    /* renamed from: a */
    public final View f1799a;

    /* renamed from: d */
    public C0292o3 f1802d;

    /* renamed from: e */
    public C0292o3 f1803e;

    /* renamed from: f */
    public C0292o3 f1804f;

    /* renamed from: c */
    public int f1801c = -1;

    /* renamed from: b */
    public final C0229d0 f1800b = C0229d0.m2865a();

    public C0333x(View view) {
        this.f1799a = view;
    }

    /* renamed from: a */
    public void m2728a() {
        Drawable background = this.f1799a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f1802d != null) {
                if (this.f1804f == null) {
                    this.f1804f = new C0292o3();
                }
                C0292o3 c0292o3 = this.f1804f;
                PorterDuff.Mode mode = null;
                c0292o3.f1678a = null;
                c0292o3.f1681d = false;
                c0292o3.f1679b = null;
                c0292o3.f1680c = false;
                ColorStateList m2246l = AbstractC0605j0.m2246l(this.f1799a);
                if (m2246l != null) {
                    c0292o3.f1681d = true;
                    c0292o3.f1678a = m2246l;
                }
                View view = this.f1799a;
                if (i >= 21) {
                    mode = view.getBackgroundTintMode();
                } else if (view instanceof InterfaceC0630w) {
                    mode = ((InterfaceC0630w) view).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    c0292o3.f1680c = true;
                    c0292o3.f1679b = mode;
                }
                if (c0292o3.f1681d || c0292o3.f1680c) {
                    C0229d0.m2860f(background, c0292o3, this.f1799a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0292o3 c0292o32 = this.f1803e;
            if (c0292o32 != null) {
                C0229d0.m2860f(background, c0292o32, this.f1799a.getDrawableState());
                return;
            }
            C0292o3 c0292o33 = this.f1802d;
            if (c0292o33 != null) {
                C0229d0.m2860f(background, c0292o33, this.f1799a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public ColorStateList m2727b() {
        C0292o3 c0292o3 = this.f1803e;
        if (c0292o3 != null) {
            return c0292o3.f1678a;
        }
        return null;
    }

    /* renamed from: c */
    public PorterDuff.Mode m2726c() {
        C0292o3 c0292o3 = this.f1803e;
        if (c0292o3 != null) {
            return c0292o3.f1679b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:3:0x001b, B:5:0x0024, B:7:0x003a, B:8:0x003d, B:10:0x0048, B:12:0x0052, B:14:0x0057, B:16:0x0061, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:29:0x0083, B:31:0x0087, B:32:0x008c, B:34:0x0094, B:36:0x00a3, B:38:0x00a8, B:40:0x00b2, B:45:0x00bd, B:47:0x00c3, B:48:0x00ca, B:49:0x00ce, B:51:0x00d2), top: B:56:0x001b }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2725d(AttributeSet attributeSet, int i) {
        boolean z;
        Context context = this.f1799a.getContext();
        int[] iArr = AbstractC0084j.ViewBackgroundHelper;
        boolean z2 = false;
        C0302q3 m2740r = C0302q3.m2740r(context, attributeSet, iArr, i, 0);
        View view = this.f1799a;
        AbstractC0605j0.m2270M(view, view.getContext(), iArr, attributeSet, m2740r.f1740b, i, 0);
        try {
            int i2 = AbstractC0084j.ViewBackgroundHelper_android_background;
            if (m2740r.m2742p(i2)) {
                this.f1801c = m2740r.m2745m(i2, -1);
                ColorStateList m2862d = this.f1800b.m2862d(this.f1799a.getContext(), this.f1801c);
                if (m2862d != null) {
                    m2722g(m2862d);
                }
            }
            int i3 = AbstractC0084j.ViewBackgroundHelper_backgroundTint;
            if (m2740r.m2742p(i3)) {
                View view2 = this.f1799a;
                ColorStateList m2755c = m2740r.m2755c(i3);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 21) {
                    view2.setBackgroundTintList(m2755c);
                    if (i4 == 21) {
                        Drawable background = view2.getBackground();
                        if (view2.getBackgroundTintList() == null && view2.getBackgroundTintMode() == null) {
                            z = false;
                            if (background != null && z) {
                                if (background.isStateful()) {
                                    background.setState(view2.getDrawableState());
                                }
                                view2.setBackground(background);
                            }
                        }
                        z = true;
                        if (background != null) {
                            if (background.isStateful()) {
                            }
                            view2.setBackground(background);
                        }
                    }
                } else if (view2 instanceof InterfaceC0630w) {
                    ((InterfaceC0630w) view2).setSupportBackgroundTintList(m2755c);
                }
            }
            int i5 = AbstractC0084j.ViewBackgroundHelper_backgroundTintMode;
            if (m2740r.m2742p(i5)) {
                View view3 = this.f1799a;
                PorterDuff.Mode m2783d = AbstractC0290o1.m2783d(m2740r.m2748j(i5, -1), null);
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 21) {
                    view3.setBackgroundTintMode(m2783d);
                    if (i6 == 21) {
                        Drawable background2 = view3.getBackground();
                        z2 = (view3.getBackgroundTintList() == null && view3.getBackgroundTintMode() == null) ? true : true;
                        if (background2 != null && z2) {
                            if (background2.isStateful()) {
                                background2.setState(view3.getDrawableState());
                            }
                            view3.setBackground(background2);
                        }
                    }
                } else if (view3 instanceof InterfaceC0630w) {
                    ((InterfaceC0630w) view3).setSupportBackgroundTintMode(m2783d);
                }
            }
            m2740r.f1740b.recycle();
        } catch (Throwable th) {
            m2740r.f1740b.recycle();
            throw th;
        }
    }

    /* renamed from: e */
    public void m2724e() {
        this.f1801c = -1;
        m2722g(null);
        m2728a();
    }

    /* renamed from: f */
    public void m2723f(int i) {
        this.f1801c = i;
        C0229d0 c0229d0 = this.f1800b;
        m2722g(c0229d0 != null ? c0229d0.m2862d(this.f1799a.getContext(), i) : null);
        m2728a();
    }

    /* renamed from: g */
    public void m2722g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1802d == null) {
                this.f1802d = new C0292o3();
            }
            C0292o3 c0292o3 = this.f1802d;
            c0292o3.f1678a = colorStateList;
            c0292o3.f1681d = true;
        } else {
            this.f1802d = null;
        }
        m2728a();
    }

    /* renamed from: h */
    public void m2721h(ColorStateList colorStateList) {
        if (this.f1803e == null) {
            this.f1803e = new C0292o3();
        }
        C0292o3 c0292o3 = this.f1803e;
        c0292o3.f1678a = colorStateList;
        c0292o3.f1681d = true;
        m2728a();
    }

    /* renamed from: i */
    public void m2720i(PorterDuff.Mode mode) {
        if (this.f1803e == null) {
            this.f1803e = new C0292o3();
        }
        C0292o3 c0292o3 = this.f1803e;
        c0292o3.f1679b = mode;
        c0292o3.f1680c = true;
        m2728a();
    }
}