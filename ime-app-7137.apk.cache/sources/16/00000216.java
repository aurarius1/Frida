package p010b.p037h.p040b;

import java.util.Arrays;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.j */
/* loaded from: classes.dex */
public class C0402j extends C0395c {

    /* renamed from: f */
    public int f1990f;

    /* renamed from: g */
    public C0404l[] f1991g;

    /* renamed from: h */
    public C0404l[] f1992h;

    /* renamed from: i */
    public int f1993i;

    /* renamed from: j */
    public C0401i f1994j;

    public C0402j(C0396d c0396d) {
        super(c0396d);
        this.f1990f = 128;
        this.f1991g = new C0404l[128];
        this.f1992h = new C0404l[128];
        this.f1993i = 0;
        this.f1994j = new C0401i(this, this);
    }

    @Override // p010b.p037h.p040b.C0395c
    /* renamed from: b */
    public void mo2573b(C0404l c0404l) {
        this.f1994j.f1988b = c0404l;
        Arrays.fill(c0404l.f2014i, 0.0f);
        c0404l.f2014i[c0404l.f2010e] = 1.0f;
        m2569n(c0404l);
    }

    @Override // p010b.p037h.p040b.C0395c
    /* renamed from: c */
    public void mo2572c() {
        this.f1993i = 0;
        this.f1960b = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r8 < r7) goto L33;
     */
    @Override // p010b.p037h.p040b.C0395c
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0404l mo2571h(C0398f c0398f, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f1993i; i2++) {
            C0404l[] c0404lArr = this.f1991g;
            C0404l c0404l = c0404lArr[i2];
            if (!zArr[c0404l.f2008c]) {
                C0401i c0401i = this.f1994j;
                c0401i.f1988b = c0404l;
                int i3 = 8;
                boolean z = true;
                if (i == -1) {
                    c0401i.getClass();
                    while (i3 >= 0) {
                        float f = c0401i.f1988b.f2014i[i3];
                        if (f > 0.0f) {
                            break;
                        } else if (f < 0.0f) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                    i = i2;
                } else {
                    C0404l c0404l2 = c0404lArr[i];
                    c0401i.getClass();
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        float f2 = c0404l2.f2014i[i3];
                        float f3 = c0401i.f1988b.f2014i[i3];
                        if (f3 == f2) {
                            i3--;
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f1991g[i];
    }

    @Override // p010b.p037h.p040b.C0395c
    /* renamed from: m */
    public void mo2570m(C0395c c0395c, boolean z) {
        C0404l c0404l = c0395c.f1959a;
        if (c0404l == null) {
            return;
        }
        InterfaceC0394b interfaceC0394b = c0395c.f1962d;
        int mo2550k = interfaceC0394b.mo2550k();
        for (int i = 0; i < mo2550k; i++) {
            C0404l mo2555f = interfaceC0394b.mo2555f(i);
            float mo2560a = interfaceC0394b.mo2560a(i);
            C0401i c0401i = this.f1994j;
            c0401i.f1988b = mo2555f;
            boolean z2 = true;
            if (mo2555f.f2007b) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = c0401i.f1988b.f2014i;
                    fArr[i2] = (c0404l.f2014i[i2] * mo2560a) + fArr[i2];
                    if (Math.abs(fArr[i2]) < 1.0E-4f) {
                        c0401i.f1988b.f2014i[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c0401i.f1989c.m2568o(c0401i.f1988b);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f = c0404l.f2014i[i3];
                    if (f != 0.0f) {
                        float f2 = f * mo2560a;
                        if (Math.abs(f2) < 1.0E-4f) {
                            f2 = 0.0f;
                        }
                        c0401i.f1988b.f2014i[i3] = f2;
                    } else {
                        c0401i.f1988b.f2014i[i3] = 0.0f;
                    }
                }
            }
            if (z2) {
                m2569n(mo2555f);
            }
            this.f1960b = (c0395c.f1960b * mo2560a) + this.f1960b;
        }
        m2568o(c0404l);
    }

    /* renamed from: n */
    public final void m2569n(C0404l c0404l) {
        int i;
        int i2 = this.f1993i + 1;
        C0404l[] c0404lArr = this.f1991g;
        if (i2 > c0404lArr.length) {
            C0404l[] c0404lArr2 = (C0404l[]) Arrays.copyOf(c0404lArr, c0404lArr.length * 2);
            this.f1991g = c0404lArr2;
            this.f1992h = (C0404l[]) Arrays.copyOf(c0404lArr2, c0404lArr2.length * 2);
        }
        C0404l[] c0404lArr3 = this.f1991g;
        int i3 = this.f1993i;
        c0404lArr3[i3] = c0404l;
        int i4 = i3 + 1;
        this.f1993i = i4;
        if (i4 > 1 && c0404lArr3[i4 - 1].f2008c > c0404l.f2008c) {
            int i5 = 0;
            while (true) {
                i = this.f1993i;
                if (i5 >= i) {
                    break;
                }
                this.f1992h[i5] = this.f1991g[i5];
                i5++;
            }
            Arrays.sort(this.f1992h, 0, i, new C0400h(this));
            for (int i6 = 0; i6 < this.f1993i; i6++) {
                this.f1991g[i6] = this.f1992h[i6];
            }
        }
        c0404l.f2007b = true;
        c0404l.m2565a(this);
    }

    /* renamed from: o */
    public final void m2568o(C0404l c0404l) {
        int i = 0;
        while (i < this.f1993i) {
            if (this.f1991g[i] == c0404l) {
                while (true) {
                    int i2 = this.f1993i;
                    if (i >= i2 - 1) {
                        this.f1993i = i2 - 1;
                        c0404l.f2007b = false;
                        return;
                    }
                    C0404l[] c0404lArr = this.f1991g;
                    int i3 = i + 1;
                    c0404lArr[i] = c0404lArr[i3];
                    i = i3;
                }
            } else {
                i++;
            }
        }
    }

    @Override // p010b.p037h.p040b.C0395c
    public String toString() {
        String str = " goal -> (" + this.f1960b + ") : ";
        for (int i = 0; i < this.f1993i; i++) {
            this.f1994j.f1988b = this.f1991g[i];
            StringBuilder m1187i = AbstractC1124a.m1187i(str);
            m1187i.append(this.f1994j);
            m1187i.append(" ");
            str = m1187i.toString();
        }
        return str;
    }
}