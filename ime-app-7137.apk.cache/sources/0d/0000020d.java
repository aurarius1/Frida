package p010b.p037h.p040b;

import java.util.Arrays;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.a */
/* loaded from: classes.dex */
public class C0393a implements InterfaceC0394b {

    /* renamed from: b */
    public final C0395c f1950b;

    /* renamed from: c */
    public final C0396d f1951c;

    /* renamed from: a */
    public int f1949a = 0;

    /* renamed from: d */
    public int f1952d = 8;

    /* renamed from: e */
    public int[] f1953e = new int[8];

    /* renamed from: f */
    public int[] f1954f = new int[8];

    /* renamed from: g */
    public float[] f1955g = new float[8];

    /* renamed from: h */
    public int f1956h = -1;

    /* renamed from: i */
    public int f1957i = -1;

    /* renamed from: j */
    public boolean f1958j = false;

    public C0393a(C0395c c0395c, C0396d c0396d) {
        this.f1950b = c0395c;
        this.f1951c = c0396d;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: a */
    public float mo2560a(int i) {
        int i2 = this.f1956h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1949a; i3++) {
            if (i3 == i) {
                return this.f1955g[i2];
            }
            i2 = this.f1954f[i2];
        }
        return 0.0f;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: b */
    public float mo2559b(C0395c c0395c, boolean z) {
        float mo2554g = mo2554g(c0395c.f1959a);
        mo2557d(c0395c.f1959a, z);
        InterfaceC0394b interfaceC0394b = c0395c.f1962d;
        int mo2550k = interfaceC0394b.mo2550k();
        for (int i = 0; i < mo2550k; i++) {
            C0404l mo2555f = interfaceC0394b.mo2555f(i);
            mo2556e(mo2555f, interfaceC0394b.mo2554g(mo2555f) * mo2554g, z);
        }
        return mo2554g;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: c */
    public final void mo2558c(C0404l c0404l, float f) {
        if (f == 0.0f) {
            mo2557d(c0404l, true);
            return;
        }
        int i = this.f1956h;
        if (i == -1) {
            this.f1956h = 0;
            this.f1955g[0] = f;
            this.f1953e[0] = c0404l.f2008c;
            this.f1954f[0] = -1;
            c0404l.f2018m++;
            c0404l.m2565a(this.f1950b);
            this.f1949a++;
            if (this.f1958j) {
                return;
            }
            int i2 = this.f1957i + 1;
            this.f1957i = i2;
            int[] iArr = this.f1953e;
            if (i2 >= iArr.length) {
                this.f1958j = true;
                this.f1957i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f1949a; i4++) {
            int[] iArr2 = this.f1953e;
            int i5 = iArr2[i];
            int i6 = c0404l.f2008c;
            if (i5 == i6) {
                this.f1955g[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f1954f[i];
        }
        int i7 = this.f1957i;
        int i8 = i7 + 1;
        if (this.f1958j) {
            int[] iArr3 = this.f1953e;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f1953e;
        if (i7 >= iArr4.length && this.f1949a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f1953e;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f1953e;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f1952d * 2;
            this.f1952d = i10;
            this.f1958j = false;
            this.f1957i = i7 - 1;
            this.f1955g = Arrays.copyOf(this.f1955g, i10);
            this.f1953e = Arrays.copyOf(this.f1953e, this.f1952d);
            this.f1954f = Arrays.copyOf(this.f1954f, this.f1952d);
        }
        this.f1953e[i7] = c0404l.f2008c;
        this.f1955g[i7] = f;
        int[] iArr7 = this.f1954f;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.f1956h;
            this.f1956h = i7;
        }
        c0404l.f2018m++;
        c0404l.m2565a(this.f1950b);
        int i11 = this.f1949a + 1;
        this.f1949a = i11;
        if (!this.f1958j) {
            this.f1957i++;
        }
        int[] iArr8 = this.f1953e;
        if (i11 >= iArr8.length) {
            this.f1958j = true;
        }
        if (this.f1957i >= iArr8.length) {
            this.f1958j = true;
            this.f1957i = iArr8.length - 1;
        }
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    public final void clear() {
        int i = this.f1956h;
        for (int i2 = 0; i != -1 && i2 < this.f1949a; i2++) {
            C0404l c0404l = this.f1951c.f1967d[this.f1953e[i]];
            if (c0404l != null) {
                c0404l.m2564b(this.f1950b);
            }
            i = this.f1954f[i];
        }
        this.f1956h = -1;
        this.f1957i = -1;
        this.f1958j = false;
        this.f1949a = 0;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: d */
    public final float mo2557d(C0404l c0404l, boolean z) {
        int i = this.f1956h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1949a) {
            if (this.f1953e[i] == c0404l.f2008c) {
                if (i == this.f1956h) {
                    this.f1956h = this.f1954f[i];
                } else {
                    int[] iArr = this.f1954f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0404l.m2564b(this.f1950b);
                }
                c0404l.f2018m--;
                this.f1949a--;
                this.f1953e[i] = -1;
                if (this.f1958j) {
                    this.f1957i = i;
                }
                return this.f1955g[i];
            }
            i2++;
            i3 = i;
            i = this.f1954f[i];
        }
        return 0.0f;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: e */
    public void mo2556e(C0404l c0404l, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f1956h;
            if (i == -1) {
                this.f1956h = 0;
                this.f1955g[0] = f;
                this.f1953e[0] = c0404l.f2008c;
                this.f1954f[0] = -1;
                c0404l.f2018m++;
                c0404l.m2565a(this.f1950b);
                this.f1949a++;
                if (this.f1958j) {
                    return;
                }
                int i2 = this.f1957i + 1;
                this.f1957i = i2;
                int[] iArr = this.f1953e;
                if (i2 >= iArr.length) {
                    this.f1958j = true;
                    this.f1957i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f1949a; i4++) {
                int[] iArr2 = this.f1953e;
                int i5 = iArr2[i];
                int i6 = c0404l.f2008c;
                if (i5 == i6) {
                    float[] fArr = this.f1955g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f1956h) {
                            this.f1956h = this.f1954f[i];
                        } else {
                            int[] iArr3 = this.f1954f;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            c0404l.m2564b(this.f1950b);
                        }
                        if (this.f1958j) {
                            this.f1957i = i;
                        }
                        c0404l.f2018m--;
                        this.f1949a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f1954f[i];
            }
            int i7 = this.f1957i;
            int i8 = i7 + 1;
            if (this.f1958j) {
                int[] iArr4 = this.f1953e;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f1953e;
            if (i7 >= iArr5.length && this.f1949a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f1953e;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f1953e;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f1952d * 2;
                this.f1952d = i10;
                this.f1958j = false;
                this.f1957i = i7 - 1;
                this.f1955g = Arrays.copyOf(this.f1955g, i10);
                this.f1953e = Arrays.copyOf(this.f1953e, this.f1952d);
                this.f1954f = Arrays.copyOf(this.f1954f, this.f1952d);
            }
            this.f1953e[i7] = c0404l.f2008c;
            this.f1955g[i7] = f;
            int[] iArr8 = this.f1954f;
            if (i3 != -1) {
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                iArr8[i7] = this.f1956h;
                this.f1956h = i7;
            }
            c0404l.f2018m++;
            c0404l.m2565a(this.f1950b);
            this.f1949a++;
            if (!this.f1958j) {
                this.f1957i++;
            }
            int i11 = this.f1957i;
            int[] iArr9 = this.f1953e;
            if (i11 >= iArr9.length) {
                this.f1958j = true;
                this.f1957i = iArr9.length - 1;
            }
        }
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: f */
    public C0404l mo2555f(int i) {
        int i2 = this.f1956h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1949a; i3++) {
            if (i3 == i) {
                return this.f1951c.f1967d[this.f1953e[i2]];
            }
            i2 = this.f1954f[i2];
        }
        return null;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: g */
    public final float mo2554g(C0404l c0404l) {
        int i = this.f1956h;
        for (int i2 = 0; i != -1 && i2 < this.f1949a; i2++) {
            if (this.f1953e[i] == c0404l.f2008c) {
                return this.f1955g[i];
            }
            i = this.f1954f[i];
        }
        return 0.0f;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: h */
    public boolean mo2553h(C0404l c0404l) {
        int i = this.f1956h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f1949a; i2++) {
            if (this.f1953e[i] == c0404l.f2008c) {
                return true;
            }
            i = this.f1954f[i];
        }
        return false;
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: i */
    public void mo2552i(float f) {
        int i = this.f1956h;
        for (int i2 = 0; i != -1 && i2 < this.f1949a; i2++) {
            float[] fArr = this.f1955g;
            fArr[i] = fArr[i] / f;
            i = this.f1954f[i];
        }
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: j */
    public void mo2551j() {
        int i = this.f1956h;
        for (int i2 = 0; i != -1 && i2 < this.f1949a; i2++) {
            float[] fArr = this.f1955g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f1954f[i];
        }
    }

    @Override // p010b.p037h.p040b.InterfaceC0394b
    /* renamed from: k */
    public int mo2550k() {
        return this.f1949a;
    }

    public String toString() {
        int i = this.f1956h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f1949a; i2++) {
            StringBuilder m1187i = AbstractC1124a.m1187i(AbstractC1124a.m1190f(str, " -> "));
            m1187i.append(this.f1955g[i]);
            m1187i.append(" : ");
            StringBuilder m1187i2 = AbstractC1124a.m1187i(m1187i.toString());
            m1187i2.append(this.f1951c.f1967d[this.f1953e[i]]);
            str = m1187i2.toString();
            i = this.f1954f[i];
        }
        return str;
    }
}