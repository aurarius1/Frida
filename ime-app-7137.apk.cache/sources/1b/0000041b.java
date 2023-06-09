package p010b.p083u.p084e;

import android.graphics.Rect;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.u.e.b0 */
/* loaded from: classes.dex */
public class RunnableC0919b0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0959l0 f3537b;

    public RunnableC0919b0(C0959l0 c0959l0) {
        this.f3537b = c0959l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int i;
        int i2;
        int i3;
        C0959l0 c0959l0 = this.f3537b;
        AbstractC0941g2 abstractC0941g2 = c0959l0.f3675c;
        if (abstractC0941g2 == null) {
            return;
        }
        boolean z = false;
        if (abstractC0941g2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = c0959l0.f3672D;
            long j2 = j == Long.MIN_VALUE ? 0L : currentTimeMillis - j;
            AbstractC0980q1 layoutManager = c0959l0.f3690r.getLayoutManager();
            if (c0959l0.f3671C == null) {
                c0959l0.f3671C = new Rect();
            }
            layoutManager.m1534e(c0959l0.f3675c.f3605c, c0959l0.f3671C);
            if (layoutManager.mo1532f()) {
                int i4 = (int) (c0959l0.f3682j + c0959l0.f3680h);
                int paddingLeft = (i4 - c0959l0.f3671C.left) - c0959l0.f3690r.getPaddingLeft();
                float f = c0959l0.f3680h;
                if ((f < 0.0f && paddingLeft < 0) || (f > 0.0f && (paddingLeft = ((c0959l0.f3675c.f3605c.getWidth() + i4) + c0959l0.f3671C.right) - (c0959l0.f3690r.getWidth() - c0959l0.f3690r.getPaddingRight())) > 0)) {
                    i = paddingLeft;
                    if (layoutManager.mo1530g()) {
                        int i5 = (int) (c0959l0.f3683k + c0959l0.f3681i);
                        int paddingTop = (i5 - c0959l0.f3671C.top) - c0959l0.f3690r.getPaddingTop();
                        float f2 = c0959l0.f3681i;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((c0959l0.f3675c.f3605c.getHeight() + i5) + c0959l0.f3671C.bottom) - (c0959l0.f3690r.getHeight() - c0959l0.f3690r.getPaddingBottom())) > 0)) {
                            i2 = paddingTop;
                            if (i != 0) {
                                i = c0959l0.f3685m.m1634g(c0959l0.f3690r, c0959l0.f3675c.f3605c.getWidth(), i, c0959l0.f3690r.getWidth(), j2);
                            }
                            int i6 = i;
                            if (i2 != 0) {
                                i3 = i6;
                                i2 = c0959l0.f3685m.m1634g(c0959l0.f3690r, c0959l0.f3675c.f3605c.getHeight(), i2, c0959l0.f3690r.getHeight(), j2);
                            } else {
                                i3 = i6;
                            }
                            if (i3 == 0 || i2 != 0) {
                                if (c0959l0.f3672D == Long.MIN_VALUE) {
                                    c0959l0.f3672D = currentTimeMillis;
                                }
                                c0959l0.f3690r.scrollBy(i3, i2);
                                z = true;
                                if (z) {
                                    return;
                                }
                                C0959l0 c0959l02 = this.f3537b;
                                AbstractC0941g2 abstractC0941g22 = c0959l02.f3675c;
                                if (abstractC0941g22 != null) {
                                    c0959l02.m1621n(abstractC0941g22);
                                }
                                C0959l0 c0959l03 = this.f3537b;
                                c0959l03.f3690r.removeCallbacks(c0959l03.f3691s);
                                AbstractC0605j0.m2276G(this.f3537b.f3690r, this);
                                return;
                            }
                        }
                    }
                    i2 = 0;
                    if (i != 0) {
                    }
                    int i62 = i;
                    if (i2 != 0) {
                    }
                    if (i3 == 0) {
                    }
                    if (c0959l0.f3672D == Long.MIN_VALUE) {
                    }
                    c0959l0.f3690r.scrollBy(i3, i2);
                    z = true;
                    if (z) {
                    }
                }
            }
            i = 0;
            if (layoutManager.mo1530g()) {
            }
            i2 = 0;
            if (i != 0) {
            }
            int i622 = i;
            if (i2 != 0) {
            }
            if (i3 == 0) {
            }
            if (c0959l0.f3672D == Long.MIN_VALUE) {
            }
            c0959l0.f3690r.scrollBy(i3, i2);
            z = true;
            if (z) {
            }
        }
        c0959l0.f3672D = Long.MIN_VALUE;
        if (z) {
        }
    }
}