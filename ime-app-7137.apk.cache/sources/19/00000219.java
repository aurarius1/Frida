package p010b.p037h.p040b;

import java.util.Arrays;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.m */
/* loaded from: classes.dex */
public class C0405m implements InterfaceC0394b {

    /* renamed from: a */
    public int f2019a = 16;

    /* renamed from: b */
    public int[] f2020b = new int[16];

    /* renamed from: c */
    public int[] f2021c = new int[16];

    /* renamed from: d */
    public int[] f2022d = new int[16];

    /* renamed from: e */
    public float[] f2023e = new float[16];

    /* renamed from: f */
    public int[] f2024f = new int[16];

    /* renamed from: g */
    public int[] f2025g = new int[16];

    /* renamed from: h */
    public int f2026h = 0;

    /* renamed from: i */
    public int f2027i = -1;

    /* renamed from: j */
    public final C0395c f2028j;

    /* renamed from: k */
    public final C0396d f2029k;

    public C0405m(C0395c c0395c, C0396d c0396d) {
        this.f2028j = c0395c;
        this.f2029k = c0396d;
        clear();
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: a */
    public float mo2560a(int i) {
        int i2 = this.f2026h;
        int i3 = this.f2027i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f2023e[i3];
            }
            i3 = this.f2025g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: b */
    public float mo2559b(C0395c c0395c, boolean z) {
        float mo2554g = mo2554g(c0395c.f1959a);
        mo2557d(c0395c.f1959a, z);
        C0405m c0405m = (C0405m) c0395c.f1962d;
        int i = c0405m.f2026h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = c0405m.f2022d;
            if (iArr[i3] != -1) {
                mo2556e(this.f2029k.f1967d[iArr[i3]], c0405m.f2023e[i3] * mo2554g, z);
                i2++;
            }
            i3++;
        }
        return mo2554g;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: c */
    public void mo2558c(C0404l c0404l, float f) {
        if (f > -0.001f && f < 0.001f) {
            mo2557d(c0404l, true);
            return;
        }
        int i = 0;
        if (this.f2026h == 0) {
            m2548m(0, c0404l, f);
            m2549l(c0404l, 0);
            this.f2027i = 0;
            return;
        }
        int m2547n = m2547n(c0404l);
        if (m2547n != -1) {
            this.f2023e[m2547n] = f;
            return;
        }
        int i2 = this.f2026h + 1;
        int i3 = this.f2019a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.f2022d = Arrays.copyOf(this.f2022d, i4);
            this.f2023e = Arrays.copyOf(this.f2023e, i4);
            this.f2024f = Arrays.copyOf(this.f2024f, i4);
            this.f2025g = Arrays.copyOf(this.f2025g, i4);
            this.f2021c = Arrays.copyOf(this.f2021c, i4);
            for (int i5 = this.f2019a; i5 < i4; i5++) {
                this.f2022d[i5] = -1;
                this.f2021c[i5] = -1;
            }
            this.f2019a = i4;
        }
        int i6 = this.f2026h;
        int i7 = this.f2027i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int[] iArr = this.f2022d;
            int i10 = iArr[i7];
            int i11 = c0404l.f2008c;
            if (i10 == i11) {
                this.f2023e[i7] = f;
                return;
            }
            if (iArr[i7] < i11) {
                i8 = i7;
            }
            i7 = this.f2025g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f2019a) {
                i = -1;
                break;
            } else if (this.f2022d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m2548m(i, c0404l, f);
        int[] iArr2 = this.f2024f;
        if (i8 != -1) {
            iArr2[i] = i8;
            int[] iArr3 = this.f2025g;
            iArr3[i] = iArr3[i8];
            iArr3[i8] = i;
        } else {
            iArr2[i] = -1;
            if (this.f2026h > 0) {
                this.f2025g[i] = this.f2027i;
                this.f2027i = i;
            } else {
                this.f2025g[i] = -1;
            }
        }
        int[] iArr4 = this.f2025g;
        if (iArr4[i] != -1) {
            this.f2024f[iArr4[i]] = i;
        }
        m2549l(c0404l, i);
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    public void clear() {
        int i = this.f2026h;
        for (int i2 = 0; i2 < i; i2++) {
            C0404l mo2555f = mo2555f(i2);
            if (mo2555f != null) {
                mo2555f.m2564b(this.f2028j);
            }
        }
        for (int i3 = 0; i3 < this.f2019a; i3++) {
            this.f2022d[i3] = -1;
            this.f2021c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.f2020b[i4] = -1;
        }
        this.f2026h = 0;
        this.f2027i = -1;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: d */
    public float mo2557d(C0404l c0404l, boolean z) {
        int[] iArr;
        int m2547n = m2547n(c0404l);
        if (m2547n == -1) {
            return 0.0f;
        }
        int i = c0404l.f2008c;
        int i2 = i % 16;
        int[] iArr2 = this.f2020b;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            if (this.f2022d[i3] == i) {
                int[] iArr3 = this.f2021c;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
            } else {
                while (true) {
                    iArr = this.f2021c;
                    if (iArr[i3] == -1 || this.f2022d[iArr[i3]] == i) {
                        break;
                    }
                    i3 = iArr[i3];
                }
                int i4 = iArr[i3];
                if (i4 != -1 && this.f2022d[i4] == i) {
                    iArr[i3] = iArr[i4];
                    iArr[i4] = -1;
                }
            }
        }
        float f = this.f2023e[m2547n];
        if (this.f2027i == m2547n) {
            this.f2027i = this.f2025g[m2547n];
        }
        this.f2022d[m2547n] = -1;
        int[] iArr4 = this.f2024f;
        if (iArr4[m2547n] != -1) {
            int[] iArr5 = this.f2025g;
            iArr5[iArr4[m2547n]] = iArr5[m2547n];
        }
        int[] iArr6 = this.f2025g;
        if (iArr6[m2547n] != -1) {
            iArr4[iArr6[m2547n]] = iArr4[m2547n];
        }
        this.f2026h--;
        c0404l.f2018m--;
        if (z) {
            c0404l.m2564b(this.f2028j);
        }
        return f;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: e */
    public void mo2556e(C0404l c0404l, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int m2547n = m2547n(c0404l);
            if (m2547n == -1) {
                mo2558c(c0404l, f);
                return;
            }
            float[] fArr = this.f2023e;
            fArr[m2547n] = fArr[m2547n] + f;
            if (fArr[m2547n] <= -0.001f || fArr[m2547n] >= 0.001f) {
                return;
            }
            fArr[m2547n] = 0.0f;
            mo2557d(c0404l, z);
        }
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: f */
    public C0404l mo2555f(int i) {
        int i2 = this.f2026h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f2027i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f2029k.f1967d[this.f2022d[i3]];
            }
            i3 = this.f2025g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: g */
    public float mo2554g(C0404l c0404l) {
        int m2547n = m2547n(c0404l);
        if (m2547n != -1) {
            return this.f2023e[m2547n];
        }
        return 0.0f;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: h */
    public boolean mo2553h(C0404l c0404l) {
        return m2547n(c0404l) != -1;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: i */
    public void mo2552i(float f) {
        int i = this.f2026h;
        int i2 = this.f2027i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2023e;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f2025g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: j */
    public void mo2551j() {
        int i = this.f2026h;
        int i2 = this.f2027i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2023e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2025g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: k */
    public int mo2550k() {
        return this.f2026h;
    }

    /* renamed from: l */
    public final void m2549l(C0404l c0404l, int i) {
        int[] iArr;
        int i2 = c0404l.f2008c % 16;
        int[] iArr2 = this.f2020b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f2021c;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f2021c[i] = -1;
    }

    /* renamed from: m */
    public final void m2548m(int i, C0404l c0404l, float f) {
        this.f2022d[i] = c0404l.f2008c;
        this.f2023e[i] = f;
        this.f2024f[i] = -1;
        this.f2025g[i] = -1;
        c0404l.m2565a(this.f2028j);
        c0404l.f2018m++;
        this.f2026h++;
    }

    /* renamed from: n */
    public int m2547n(C0404l c0404l) {
        int[] iArr;
        if (this.f2026h == 0) {
            return -1;
        }
        int i = c0404l.f2008c;
        int i2 = this.f2020b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.f2022d[i2] == i) {
            return i2;
        }
        while (true) {
            iArr = this.f2021c;
            if (iArr[i2] == -1 || this.f2022d[iArr[i2]] == i) {
                break;
            }
            i2 = iArr[i2];
        }
        if (iArr[i2] != -1 && this.f2022d[iArr[i2]] == i) {
            return iArr[i2];
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String m1190f;
        String str = hashCode() + " { ";
        int i = this.f2026h;
        for (int i2 = 0; i2 < i; i2++) {
            C0404l mo2555f = mo2555f(i2);
            if (mo2555f != null) {
                String str2 = str + mo2555f + " = " + mo2560a(i2) + " ";
                int m2547n = m2547n(mo2555f);
                String m1190f2 = AbstractC1124a.m1190f(str2, "[p: ");
                if (this.f2024f[m2547n] != -1) {
                    sb = AbstractC1124a.m1187i(m1190f2);
                    sb.append(this.f2029k.f1967d[this.f2022d[this.f2024f[m2547n]]]);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m1190f2);
                    sb2.append("none");
                    sb = sb2;
                }
                String m1190f3 = AbstractC1124a.m1190f(sb.toString(), ", n: ");
                if (this.f2025g[m2547n] != -1) {
                    StringBuilder m1187i = AbstractC1124a.m1187i(m1190f3);
                    m1187i.append(this.f2029k.f1967d[this.f2022d[this.f2025g[m2547n]]]);
                    m1190f = m1187i.toString();
                } else {
                    m1190f = AbstractC1124a.m1190f(m1190f3, "none");
                }
                str = AbstractC1124a.m1190f(m1190f, "]");
            }
        }
        return AbstractC1124a.m1190f(str, " }");
    }
}