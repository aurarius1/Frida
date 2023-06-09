package p010b.p083u.p084e;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.r0 */
/* loaded from: classes.dex */
public class C0983r0 {

    /* renamed from: b */
    public RecyclerView f3798b;

    /* renamed from: c */
    public AbstractC0980q1 f3799c;

    /* renamed from: d */
    public boolean f3800d;

    /* renamed from: e */
    public boolean f3801e;

    /* renamed from: f */
    public View f3802f;

    /* renamed from: h */
    public boolean f3804h;

    /* renamed from: k */
    public PointF f3807k;

    /* renamed from: l */
    public final DisplayMetrics f3808l;

    /* renamed from: n */
    public float f3810n;

    /* renamed from: a */
    public int f3797a = -1;

    /* renamed from: g */
    public final C0921b2 f3803g = new C0921b2(0, 0);

    /* renamed from: i */
    public final LinearInterpolator f3805i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f3806j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f3809m = false;

    /* renamed from: o */
    public int f3811o = 0;

    /* renamed from: p */
    public int f3812p = 0;

    public C0983r0(Context context) {
        this.f3808l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public int m1476a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    /* renamed from: b */
    public float mo555b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: c */
    public int mo1423c(int i) {
        float abs = Math.abs(i);
        if (!this.f3809m) {
            this.f3810n = mo555b(this.f3808l);
            this.f3809m = true;
        }
        return (int) Math.ceil(abs * this.f3810n);
    }

    /* renamed from: d */
    public void m1475d(int i, int i2) {
        AbstractC0980q1 abstractC0980q1;
        RecyclerView recyclerView = this.f3798b;
        if (this.f3797a == -1 || recyclerView == null) {
            m1474f();
        }
        if (this.f3800d && this.f3802f == null && (abstractC0980q1 = this.f3799c) != null) {
            PointF mo1703a = abstractC0980q1 instanceof InterfaceC0925c2 ? ((InterfaceC0925c2) abstractC0980q1).mo1703a(this.f3797a) : null;
            if (mo1703a != null) {
                float f = mo1703a.x;
                if (f != 0.0f || mo1703a.y != 0.0f) {
                    recyclerView.m3155j0((int) Math.signum(f), (int) Math.signum(mo1703a.y), null);
                }
            }
        }
        this.f3800d = false;
        View view = this.f3802f;
        if (view != null) {
            this.f3798b.getClass();
            AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
            if ((m3189K != null ? m3189K.m1666g() : -1) == this.f3797a) {
                mo1422e(this.f3802f, recyclerView.f770s0, this.f3803g);
                this.f3803g.m1716a(recyclerView);
                m1474f();
            } else {
                this.f3802f = null;
            }
        }
        if (this.f3801e) {
            C0929d2 c0929d2 = recyclerView.f770s0;
            C0921b2 c0921b2 = this.f3803g;
            if (this.f3798b.f777w.m1492z() == 0) {
                m1474f();
            } else {
                int i3 = this.f3811o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f3811o = i4;
                int i5 = this.f3812p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f3812p = i6;
                if (i4 == 0 && i6 == 0) {
                    int i7 = this.f3797a;
                    AbstractC0980q1 abstractC0980q12 = this.f3799c;
                    PointF mo1703a2 = abstractC0980q12 instanceof InterfaceC0925c2 ? ((InterfaceC0925c2) abstractC0980q12).mo1703a(i7) : null;
                    if (mo1703a2 != null) {
                        float f2 = mo1703a2.x;
                        if (f2 != 0.0f || mo1703a2.y != 0.0f) {
                            float f3 = mo1703a2.y;
                            float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = mo1703a2.x / sqrt;
                            mo1703a2.x = f4;
                            float f5 = mo1703a2.y / sqrt;
                            mo1703a2.y = f5;
                            this.f3807k = mo1703a2;
                            this.f3811o = (int) (f4 * 10000.0f);
                            this.f3812p = (int) (f5 * 10000.0f);
                            c0921b2.m1715b((int) (this.f3811o * 1.2f), (int) (this.f3812p * 1.2f), (int) (mo1423c(10000) * 1.2f), this.f3805i);
                        }
                    }
                    c0921b2.f3542d = this.f3797a;
                    m1474f();
                }
            }
            C0921b2 c0921b22 = this.f3803g;
            boolean z = c0921b22.f3542d >= 0;
            c0921b22.m1716a(recyclerView);
            if (z && this.f3801e) {
                this.f3800d = true;
                recyclerView.f764p0.m1675a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1422e(View view, C0929d2 c0929d2, C0921b2 c0921b2) {
        int i;
        AbstractC0980q1 abstractC0980q1;
        int i2;
        PointF pointF;
        int i3;
        AbstractC0980q1 abstractC0980q12;
        int ceil;
        PointF pointF2 = this.f3807k;
        int i4 = 0;
        if (pointF2 != null) {
            float f = pointF2.x;
            if (f != 0.0f) {
                i = f > 0.0f ? 1 : -1;
                abstractC0980q1 = this.f3799c;
                if (abstractC0980q1 == null && abstractC0980q1.mo1532f()) {
                    C0984r1 c0984r1 = (C0984r1) view.getLayoutParams();
                    i2 = m1476a(abstractC0980q1.m1584E(view) - ((ViewGroup.MarginLayoutParams) c0984r1).leftMargin, abstractC0980q1.m1578H(view) + ((ViewGroup.MarginLayoutParams) c0984r1).rightMargin, abstractC0980q1.m1562P(), abstractC0980q1.f3787p - abstractC0980q1.m1560Q(), i);
                } else {
                    i2 = 0;
                }
                pointF = this.f3807k;
                if (pointF != null) {
                    float f2 = pointF.y;
                    if (f2 != 0.0f) {
                        i3 = f2 > 0.0f ? 1 : -1;
                        abstractC0980q12 = this.f3799c;
                        if (abstractC0980q12 != null && abstractC0980q12.mo1530g()) {
                            C0984r1 c0984r12 = (C0984r1) view.getLayoutParams();
                            i4 = m1476a(abstractC0980q12.m1576I(view) - ((ViewGroup.MarginLayoutParams) c0984r12).topMargin, abstractC0980q12.m1588C(view) + ((ViewGroup.MarginLayoutParams) c0984r12).bottomMargin, abstractC0980q12.m1558R(), abstractC0980q12.f3788q - abstractC0980q12.m1564O(), i3);
                        }
                        double mo1423c = mo1423c((int) Math.sqrt((i4 * i4) + (i2 * i2)));
                        Double.isNaN(mo1423c);
                        Double.isNaN(mo1423c);
                        Double.isNaN(mo1423c);
                        ceil = (int) Math.ceil(mo1423c / 0.3356d);
                        if (ceil > 0) {
                            c0921b2.m1715b(-i2, -i4, ceil, this.f3806j);
                            return;
                        }
                        return;
                    }
                }
                i3 = 0;
                abstractC0980q12 = this.f3799c;
                if (abstractC0980q12 != null) {
                    C0984r1 c0984r122 = (C0984r1) view.getLayoutParams();
                    i4 = m1476a(abstractC0980q12.m1576I(view) - ((ViewGroup.MarginLayoutParams) c0984r122).topMargin, abstractC0980q12.m1588C(view) + ((ViewGroup.MarginLayoutParams) c0984r122).bottomMargin, abstractC0980q12.m1558R(), abstractC0980q12.f3788q - abstractC0980q12.m1564O(), i3);
                }
                double mo1423c2 = mo1423c((int) Math.sqrt((i4 * i4) + (i2 * i2)));
                Double.isNaN(mo1423c2);
                Double.isNaN(mo1423c2);
                Double.isNaN(mo1423c2);
                ceil = (int) Math.ceil(mo1423c2 / 0.3356d);
                if (ceil > 0) {
                }
            }
        }
        i = 0;
        abstractC0980q1 = this.f3799c;
        if (abstractC0980q1 == null) {
        }
        i2 = 0;
        pointF = this.f3807k;
        if (pointF != null) {
        }
        i3 = 0;
        abstractC0980q12 = this.f3799c;
        if (abstractC0980q12 != null) {
        }
        double mo1423c22 = mo1423c((int) Math.sqrt((i4 * i4) + (i2 * i2)));
        Double.isNaN(mo1423c22);
        Double.isNaN(mo1423c22);
        Double.isNaN(mo1423c22);
        ceil = (int) Math.ceil(mo1423c22 / 0.3356d);
        if (ceil > 0) {
        }
    }

    /* renamed from: f */
    public final void m1474f() {
        if (this.f3801e) {
            this.f3801e = false;
            this.f3812p = 0;
            this.f3811o = 0;
            this.f3807k = null;
            this.f3798b.f770s0.f3570a = -1;
            this.f3802f = null;
            this.f3797a = -1;
            this.f3800d = false;
            AbstractC0980q1 abstractC0980q1 = this.f3799c;
            if (abstractC0980q1.f3778g == this) {
                abstractC0980q1.f3778g = null;
            }
            this.f3799c = null;
            this.f3798b = null;
        }
    }
}