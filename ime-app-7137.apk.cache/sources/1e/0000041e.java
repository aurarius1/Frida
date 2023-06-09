package p010b.p083u.p084e;

/* renamed from: b.u.e.c */
/* loaded from: classes.dex */
public class C0922c {

    /* renamed from: a */
    public long f3546a = 0;

    /* renamed from: b */
    public C0922c f3547b;

    /* renamed from: a */
    public void m1714a(int i) {
        if (i < 64) {
            this.f3546a &= (1 << i) ^ (-1);
            return;
        }
        C0922c c0922c = this.f3547b;
        if (c0922c != null) {
            c0922c.m1714a(i - 64);
        }
    }

    /* renamed from: b */
    public int m1713b(int i) {
        long j;
        C0922c c0922c = this.f3547b;
        if (c0922c == null) {
            if (i >= 64) {
                j = this.f3546a;
                return Long.bitCount(j);
            }
        } else if (i >= 64) {
            return Long.bitCount(this.f3546a) + c0922c.m1713b(i - 64);
        }
        j = this.f3546a & ((1 << i) - 1);
        return Long.bitCount(j);
    }

    /* renamed from: c */
    public final void m1712c() {
        if (this.f3547b == null) {
            this.f3547b = new C0922c();
        }
    }

    /* renamed from: d */
    public boolean m1711d(int i) {
        if (i < 64) {
            return (this.f3546a & (1 << i)) != 0;
        }
        m1712c();
        return this.f3547b.m1711d(i - 64);
    }

    /* renamed from: e */
    public void m1710e(int i, boolean z) {
        if (i >= 64) {
            m1712c();
            this.f3547b.m1710e(i - 64, z);
            return;
        }
        long j = this.f3546a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f3546a = ((j & (j2 ^ (-1))) << 1) | (j & j2);
        if (z) {
            m1707h(i);
        } else {
            m1714a(i);
        }
        if (z2 || this.f3547b != null) {
            m1712c();
            this.f3547b.m1710e(0, z2);
        }
    }

    /* renamed from: f */
    public boolean m1709f(int i) {
        if (i >= 64) {
            m1712c();
            return this.f3547b.m1709f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f3546a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (j ^ (-1));
        this.f3546a = j3;
        long j4 = j - 1;
        this.f3546a = (j3 & j4) | Long.rotateRight((j4 ^ (-1)) & j3, 1);
        C0922c c0922c = this.f3547b;
        if (c0922c != null) {
            if (c0922c.m1711d(0)) {
                m1707h(63);
            }
            this.f3547b.m1709f(0);
        }
        return z;
    }

    /* renamed from: g */
    public void m1708g() {
        this.f3546a = 0L;
        C0922c c0922c = this.f3547b;
        if (c0922c != null) {
            c0922c.m1708g();
        }
    }

    /* renamed from: h */
    public void m1707h(int i) {
        if (i < 64) {
            this.f3546a |= 1 << i;
            return;
        }
        m1712c();
        this.f3547b.m1707h(i - 64);
    }

    public String toString() {
        if (this.f3547b == null) {
            return Long.toBinaryString(this.f3546a);
        }
        return this.f3547b.toString() + "xx" + Long.toBinaryString(this.f3546a);
    }
}