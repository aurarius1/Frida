package p010b.p083u.p084e;

import p010b.p036g.C0382f;
import p010b.p036g.C0390n;

/* renamed from: b.u.e.v2 */
/* loaded from: classes.dex */
public class C1001v2 {

    /* renamed from: a */
    public final C0390n f3872a = new C0390n();

    /* renamed from: b */
    public final C0382f f3873b = new C0382f();

    /* renamed from: a */
    public void m1430a(AbstractC0941g2 abstractC0941g2) {
        C0997u2 c0997u2 = (C0997u2) this.f3872a.getOrDefault(abstractC0941g2, null);
        if (c0997u2 == null) {
            c0997u2 = C0997u2.m1451a();
            this.f3872a.put(abstractC0941g2, c0997u2);
        }
        c0997u2.f3858b |= 1;
    }

    /* renamed from: b */
    public void m1429b(AbstractC0941g2 abstractC0941g2, C0952j1 c0952j1) {
        C0997u2 c0997u2 = (C0997u2) this.f3872a.getOrDefault(abstractC0941g2, null);
        if (c0997u2 == null) {
            c0997u2 = C0997u2.m1451a();
            this.f3872a.put(abstractC0941g2, c0997u2);
        }
        c0997u2.f3860d = c0952j1;
        c0997u2.f3858b |= 8;
    }

    /* renamed from: c */
    public void m1428c(AbstractC0941g2 abstractC0941g2, C0952j1 c0952j1) {
        C0997u2 c0997u2 = (C0997u2) this.f3872a.getOrDefault(abstractC0941g2, null);
        if (c0997u2 == null) {
            c0997u2 = C0997u2.m1451a();
            this.f3872a.put(abstractC0941g2, c0997u2);
        }
        c0997u2.f3859c = c0952j1;
        c0997u2.f3858b |= 4;
    }

    /* renamed from: d */
    public boolean m1427d(AbstractC0941g2 abstractC0941g2) {
        C0997u2 c0997u2 = (C0997u2) this.f3872a.getOrDefault(abstractC0941g2, null);
        return (c0997u2 == null || (c0997u2.f3858b & 1) == 0) ? false : true;
    }

    /* renamed from: e */
    public final C0952j1 m1426e(AbstractC0941g2 abstractC0941g2, int i) {
        C0997u2 c0997u2;
        C0952j1 c0952j1;
        int m2619e = this.f3872a.m2619e(abstractC0941g2);
        if (m2619e >= 0 && (c0997u2 = (C0997u2) this.f3872a.m2613k(m2619e)) != null) {
            int i2 = c0997u2.f3858b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                c0997u2.f3858b = i3;
                if (i == 4) {
                    c0952j1 = c0997u2.f3859c;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    c0952j1 = c0997u2.f3860d;
                }
                if ((i3 & 12) == 0) {
                    this.f3872a.m2615i(m2619e);
                    C0997u2.m1450b(c0997u2);
                }
                return c0952j1;
            }
        }
        return null;
    }

    /* renamed from: f */
    public void m1425f(AbstractC0941g2 abstractC0941g2) {
        C0997u2 c0997u2 = (C0997u2) this.f3872a.getOrDefault(abstractC0941g2, null);
        if (c0997u2 == null) {
            return;
        }
        c0997u2.f3858b &= -2;
    }

    /* renamed from: g */
    public void m1424g(AbstractC0941g2 abstractC0941g2) {
        int m2641h = this.f3873b.m2641h() - 1;
        while (true) {
            if (m2641h < 0) {
                break;
            } else if (abstractC0941g2 == this.f3873b.m2640i(m2641h)) {
                C0382f c0382f = this.f3873b;
                Object[] objArr = c0382f.f1913e;
                Object obj = objArr[m2641h];
                Object obj2 = C0382f.f1910b;
                if (obj != obj2) {
                    objArr[m2641h] = obj2;
                    c0382f.f1911c = true;
                }
            } else {
                m2641h--;
            }
        }
        C0997u2 c0997u2 = (C0997u2) this.f3872a.remove(abstractC0941g2);
        if (c0997u2 != null) {
            C0997u2.m1450b(c0997u2);
        }
    }
}