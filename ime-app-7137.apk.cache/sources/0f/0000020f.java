package p010b.p037h.p040b;

import java.util.ArrayList;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.c */
/* loaded from: classes.dex */
public class C0395c {

    /* renamed from: d */
    public InterfaceC0394b f1962d;

    /* renamed from: a */
    public C0404l f1959a = null;

    /* renamed from: b */
    public float f1960b = 0.0f;

    /* renamed from: c */
    public ArrayList f1961c = new ArrayList();

    /* renamed from: e */
    public boolean f1963e = false;

    public C0395c() {
    }

    public C0395c(C0396d c0396d) {
        this.f1962d = new C0393a(this, c0396d);
    }

    /* renamed from: a */
    public C0395c m2604a(C0398f c0398f, int i) {
        this.f1962d.mo2558c(c0398f.m2585k(i, "ep"), 1.0f);
        this.f1962d.mo2558c(c0398f.m2585k(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: b */
    public void mo2573b(C0404l c0404l) {
        float f;
        int i = c0404l.f2010e;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
            this.f1962d.mo2558c(c0404l, f);
        }
        f = 1.0f;
        this.f1962d.mo2558c(c0404l, f);
    }

    /* renamed from: c */
    public void mo2572c() {
        this.f1962d.clear();
        this.f1959a = null;
        this.f1960b = 0.0f;
    }

    /* renamed from: d */
    public C0395c m2603d(C0404l c0404l, C0404l c0404l2, C0404l c0404l3, C0404l c0404l4, float f) {
        this.f1962d.mo2558c(c0404l, -1.0f);
        this.f1962d.mo2558c(c0404l2, 1.0f);
        this.f1962d.mo2558c(c0404l3, f);
        this.f1962d.mo2558c(c0404l4, -f);
        return this;
    }

    /* renamed from: e */
    public C0395c m2602e(C0404l c0404l, C0404l c0404l2, C0404l c0404l3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1960b = i;
        }
        if (z) {
            this.f1962d.mo2558c(c0404l, 1.0f);
            this.f1962d.mo2558c(c0404l2, -1.0f);
            this.f1962d.mo2558c(c0404l3, -1.0f);
        } else {
            this.f1962d.mo2558c(c0404l, -1.0f);
            this.f1962d.mo2558c(c0404l2, 1.0f);
            this.f1962d.mo2558c(c0404l3, 1.0f);
        }
        return this;
    }

    /* renamed from: f */
    public C0395c m2601f(C0404l c0404l, C0404l c0404l2, C0404l c0404l3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1960b = i;
        }
        if (z) {
            this.f1962d.mo2558c(c0404l, 1.0f);
            this.f1962d.mo2558c(c0404l2, -1.0f);
            this.f1962d.mo2558c(c0404l3, 1.0f);
        } else {
            this.f1962d.mo2558c(c0404l, -1.0f);
            this.f1962d.mo2558c(c0404l2, 1.0f);
            this.f1962d.mo2558c(c0404l3, -1.0f);
        }
        return this;
    }

    /* renamed from: g */
    public C0395c m2600g(C0404l c0404l, C0404l c0404l2, C0404l c0404l3, C0404l c0404l4, float f) {
        this.f1962d.mo2558c(c0404l3, 0.5f);
        this.f1962d.mo2558c(c0404l4, 0.5f);
        this.f1962d.mo2558c(c0404l, -0.5f);
        this.f1962d.mo2558c(c0404l2, -0.5f);
        this.f1960b = -f;
        return this;
    }

    /* renamed from: h */
    public C0404l mo2571h(C0398f c0398f, boolean[] zArr) {
        return m2598j(zArr, null);
    }

    /* renamed from: i */
    public final boolean m2599i(C0404l c0404l) {
        return c0404l.f2018m <= 1;
    }

    /* renamed from: j */
    public final C0404l m2598j(boolean[] zArr, C0404l c0404l) {
        int i;
        int mo2550k = this.f1962d.mo2550k();
        C0404l c0404l2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < mo2550k; i2++) {
            float mo2560a = this.f1962d.mo2560a(i2);
            if (mo2560a < 0.0f) {
                C0404l mo2555f = this.f1962d.mo2555f(i2);
                if ((zArr == null || !zArr[mo2555f.f2008c]) && mo2555f != c0404l && (((i = mo2555f.f2015j) == 3 || i == 4) && mo2560a < f)) {
                    f = mo2560a;
                    c0404l2 = mo2555f;
                }
            }
        }
        return c0404l2;
    }

    /* renamed from: k */
    public void m2597k(C0404l c0404l) {
        C0404l c0404l2 = this.f1959a;
        if (c0404l2 != null) {
            this.f1962d.mo2558c(c0404l2, -1.0f);
            this.f1959a = null;
        }
        float mo2557d = this.f1962d.mo2557d(c0404l, true) * (-1.0f);
        this.f1959a = c0404l;
        if (mo2557d == 1.0f) {
            return;
        }
        this.f1960b /= mo2557d;
        this.f1962d.mo2552i(mo2557d);
    }

    /* renamed from: l */
    public void m2596l(C0404l c0404l, boolean z) {
        if (c0404l.f2012g) {
            float mo2554g = this.f1962d.mo2554g(c0404l);
            this.f1960b = (c0404l.f2011f * mo2554g) + this.f1960b;
            this.f1962d.mo2557d(c0404l, z);
            if (z) {
                c0404l.m2564b(this);
            }
        }
    }

    /* renamed from: m */
    public void mo2570m(C0395c c0395c, boolean z) {
        float mo2559b = this.f1962d.mo2559b(c0395c, z);
        this.f1960b = (c0395c.f1960b * mo2559b) + this.f1960b;
        if (z) {
            c0395c.f1959a.m2564b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String sb;
        boolean z;
        StringBuilder m1187i;
        String str;
        StringBuilder sb2;
        if (this.f1959a == null) {
            sb = "0";
        } else {
            StringBuilder m1187i2 = AbstractC1124a.m1187i("");
            m1187i2.append(this.f1959a);
            sb = m1187i2.toString();
        }
        String m1190f = AbstractC1124a.m1190f(sb, " = ");
        if (this.f1960b != 0.0f) {
            StringBuilder m1187i3 = AbstractC1124a.m1187i(m1190f);
            m1187i3.append(this.f1960b);
            m1190f = m1187i3.toString();
            z = true;
        } else {
            z = false;
        }
        int mo2550k = this.f1962d.mo2550k();
        for (int i = 0; i < mo2550k; i++) {
            C0404l mo2555f = this.f1962d.mo2555f(i);
            if (mo2555f != null) {
                float mo2560a = this.f1962d.mo2560a(i);
                if (mo2560a != 0.0f) {
                    String c0404l = mo2555f.toString();
                    if (!z) {
                        if (mo2560a < 0.0f) {
                            m1187i = AbstractC1124a.m1187i(m1190f);
                            str = "- ";
                            m1187i.append(str);
                            m1190f = m1187i.toString();
                            mo2560a *= -1.0f;
                        }
                        if (mo2560a == 1.0f) {
                            sb2 = new StringBuilder();
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(m1190f);
                            sb2.append(mo2560a);
                            m1190f = " ";
                        }
                        sb2.append(m1190f);
                        sb2.append(c0404l);
                        m1190f = sb2.toString();
                        z = true;
                    } else if (mo2560a > 0.0f) {
                        m1190f = AbstractC1124a.m1190f(m1190f, " + ");
                        if (mo2560a == 1.0f) {
                        }
                        sb2.append(m1190f);
                        sb2.append(c0404l);
                        m1190f = sb2.toString();
                        z = true;
                    } else {
                        m1187i = AbstractC1124a.m1187i(m1190f);
                        str = " - ";
                        m1187i.append(str);
                        m1190f = m1187i.toString();
                        mo2560a *= -1.0f;
                        if (mo2560a == 1.0f) {
                        }
                        sb2.append(m1190f);
                        sb2.append(c0404l);
                        m1190f = sb2.toString();
                        z = true;
                    }
                }
            }
        }
        return !z ? AbstractC1124a.m1190f(m1190f, "0.0") : m1190f;
    }
}