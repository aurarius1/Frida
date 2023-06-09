package p010b.p083u.p084e;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p083u.AbstractC0911b;
import p010b.p083u.AbstractC0912c;
import p093c.p097b.p108i0.p110p.C1379w0;

/* renamed from: b.u.e.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC0955k0 {

    /* renamed from: a */
    public static final Interpolator f3653a = new animationInterpolatorC0939g0();

    /* renamed from: b */
    public static final Interpolator f3654b = new animationInterpolatorC0943h0();

    /* renamed from: c */
    public int f3655c = -1;

    /* renamed from: d */
    public int f3656d;

    /* renamed from: e */
    public int f3657e;

    public AbstractC0955k0(int i, int i2) {
        this.f3656d = i2;
        this.f3657e = i;
    }

    /* renamed from: c */
    public static int m1638c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (i4 ^ (-1));
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* renamed from: a */
    public void m1640a(RecyclerView recyclerView, AbstractC0941g2 abstractC0941g2) {
        View view = abstractC0941g2.f3605c;
        if (Build.VERSION.SDK_INT >= 21) {
            int i = AbstractC0912c.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                AbstractC0605j0.m2265R(view, ((Float) tag).floatValue());
            }
            view.setTag(i, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: b */
    public int m1639b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (i4 ^ (-1));
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* renamed from: d */
    public final int m1637d(RecyclerView recyclerView, AbstractC0941g2 abstractC0941g2) {
        return m1639b(m1635f(recyclerView, abstractC0941g2), AbstractC0605j0.m2241q(recyclerView));
    }

    /* renamed from: e */
    public final int m1636e(RecyclerView recyclerView) {
        if (this.f3655c == -1) {
            this.f3655c = recyclerView.getResources().getDimensionPixelSize(AbstractC0911b.item_touch_helper_max_drag_scroll_per_frame);
        }
        return this.f3655c;
    }

    /* renamed from: f */
    public int m1635f(RecyclerView recyclerView, AbstractC0941g2 abstractC0941g2) {
        C1379w0 c1379w0 = (C1379w0) this;
        int i = abstractC0941g2.m1667f() >= c1379w0.f4610f.f4472d0.size() ? 0 : c1379w0.f3657e;
        int i2 = this.f3656d;
        return (i << 16) | (i2 << 8) | ((i2 | i) << 0);
    }

    /* renamed from: g */
    public int m1634g(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        int interpolation = (int) (f3653a.getInterpolation(j <= 2000 ? ((float) j) / 2000.0f : 1.0f) * ((int) (f3654b.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * m1636e(recyclerView))));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    /* renamed from: h */
    public void m1633h(Canvas canvas, RecyclerView recyclerView, AbstractC0941g2 abstractC0941g2, float f, float f2, int i, boolean z) {
        View view = abstractC0941g2.f3605c;
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(AbstractC0912c.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(AbstractC0605j0.m2245m(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float m2245m = AbstractC0605j0.m2245m(childAt);
                    if (m2245m > f3) {
                        f3 = m2245m;
                    }
                }
            }
            AbstractC0605j0.m2265R(view, f3 + 1.0f);
            view.setTag(AbstractC0912c.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}