package p010b.p083u.p084e;

/* renamed from: b.u.e.r2 */
/* loaded from: classes.dex */
public class C0985r2 {

    /* renamed from: a */
    public int f3817a = 0;

    /* renamed from: b */
    public int f3818b;

    /* renamed from: c */
    public int f3819c;

    /* renamed from: d */
    public int f3820d;

    /* renamed from: e */
    public int f3821e;

    /* renamed from: a */
    public boolean m1470a() {
        int i = this.f3817a;
        if ((i & 7) == 0 || (i & (m1469b(this.f3820d, this.f3818b) << 0)) != 0) {
            int i2 = this.f3817a;
            if ((i2 & 112) == 0 || (i2 & (m1469b(this.f3820d, this.f3819c) << 4)) != 0) {
                int i3 = this.f3817a;
                if ((i3 & 1792) == 0 || (i3 & (m1469b(this.f3821e, this.f3818b) << 8)) != 0) {
                    int i4 = this.f3817a;
                    return (i4 & 28672) == 0 || (i4 & (m1469b(this.f3821e, this.f3819c) << 12)) != 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public int m1469b(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }
}