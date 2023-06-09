package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: b.c.q.d0 */
/* loaded from: classes.dex */
public final class C0229d0 {

    /* renamed from: a */
    public static final PorterDuff.Mode f1500a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public static C0229d0 f1501b;

    /* renamed from: c */
    public C0296p2 f1502c;

    /* renamed from: a */
    public static synchronized C0229d0 m2865a() {
        C0229d0 c0229d0;
        synchronized (C0229d0.class) {
            if (f1501b == null) {
                m2861e();
            }
            c0229d0 = f1501b;
        }
        return c0229d0;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m2863c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m2771h;
        synchronized (C0229d0.class) {
            m2771h = C0296p2.m2771h(i, mode);
        }
        return m2771h;
    }

    /* renamed from: e */
    public static synchronized void m2861e() {
        synchronized (C0229d0.class) {
            if (f1501b == null) {
                C0229d0 c0229d0 = new C0229d0();
                f1501b = c0229d0;
                c0229d0.f1502c = C0296p2.m2775d();
                C0296p2 c0296p2 = f1501b.f1502c;
                C0223c0 c0223c0 = new C0223c0();
                synchronized (c0296p2) {
                    c0296p2.f1699j = c0223c0;
                }
            }
        }
    }

    /* renamed from: f */
    public static void m2860f(Drawable drawable, C0292o3 c0292o3, int[] iArr) {
        PorterDuff.Mode mode = C0296p2.f1690a;
        if (!AbstractC0290o1.m2786a(drawable) || drawable.mutate() == drawable) {
            boolean z = c0292o3.f1681d;
            if (z || c0292o3.f1680c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? c0292o3.f1678a : null;
                PorterDuff.Mode mode2 = c0292o3.f1680c ? c0292o3.f1679b : C0296p2.f1690a;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilter = C0296p2.m2771h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: b */
    public synchronized Drawable m2864b(Context context, int i) {
        return this.f1502c.m2773f(context, i);
    }

    /* renamed from: d */
    public synchronized ColorStateList m2862d(Context context, int i) {
        return this.f1502c.m2770i(context, i);
    }
}