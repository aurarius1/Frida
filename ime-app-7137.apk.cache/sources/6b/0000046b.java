package p010b.p083u.p084e;

import android.graphics.Rect;
import android.view.View;

/* renamed from: b.u.e.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC0999v0 {

    /* renamed from: a */
    public final AbstractC0980q1 f3865a;

    /* renamed from: b */
    public int f3866b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f3867c = new Rect();

    public AbstractC0999v0(AbstractC0980q1 abstractC0980q1, C0991t0 c0991t0) {
        this.f3865a = abstractC0980q1;
    }

    /* renamed from: a */
    public static AbstractC0999v0 m1446a(AbstractC0980q1 abstractC0980q1, int i) {
        if (i != 0) {
            if (i == 1) {
                return new C0995u0(abstractC0980q1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C0991t0(abstractC0980q1);
    }

    /* renamed from: b */
    public abstract int mo1445b(View view);

    /* renamed from: c */
    public abstract int mo1444c(View view);

    /* renamed from: d */
    public abstract int mo1443d(View view);

    /* renamed from: e */
    public abstract int mo1442e(View view);

    /* renamed from: f */
    public abstract int mo1441f();

    /* renamed from: g */
    public abstract int mo1440g();

    /* renamed from: h */
    public abstract int mo1439h();

    /* renamed from: i */
    public abstract int mo1438i();

    /* renamed from: j */
    public abstract int mo1437j();

    /* renamed from: k */
    public abstract int mo1436k();

    /* renamed from: l */
    public abstract int mo1435l();

    /* renamed from: m */
    public int m1434m() {
        if (Integer.MIN_VALUE == this.f3866b) {
            return 0;
        }
        return mo1435l() - this.f3866b;
    }

    /* renamed from: n */
    public abstract int mo1433n(View view);

    /* renamed from: o */
    public abstract int mo1432o(View view);

    /* renamed from: p */
    public abstract void mo1431p(int i);
}