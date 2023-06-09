package p010b.p037h.p040b.p041n;

import p010b.p037h.p040b.C0395c;
import p010b.p037h.p040b.C0398f;
import p010b.p037h.p040b.C0404l;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.n.a */
/* loaded from: classes.dex */
public class C0406a extends AbstractC0414i {

    /* renamed from: g0 */
    public int f2030g0 = 0;

    /* renamed from: h0 */
    public boolean f2031h0 = true;

    /* renamed from: i0 */
    public int f2032i0 = 0;

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: a */
    public void mo2507a(C0398f c0398f) {
        Object[] objArr;
        boolean z;
        C0404l c0404l;
        C0409d c0409d;
        int i;
        int i2;
        int i3;
        C0409d[] c0409dArr = this.f2076G;
        c0409dArr[0] = this.f2124y;
        c0409dArr[2] = this.f2125z;
        c0409dArr[1] = this.f2070A;
        c0409dArr[3] = this.f2071B;
        int i4 = 0;
        while (true) {
            objArr = this.f2076G;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].f2069g = c0398f.m2584l(objArr[i4]);
            i4++;
        }
        int i5 = this.f2030g0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C0409d c0409d2 = objArr[i5];
        for (int i6 = 0; i6 < this.f2147f0; i6++) {
            C0410e c0410e = this.f2146e0[i6];
            if ((this.f2031h0 || c0410e.mo2506b()) && ((((i2 = this.f2030g0) == 0 || i2 == 1) && c0410e.m2534i() == 3 && c0410e.f2124y.f2066d != null && c0410e.f2070A.f2066d != null) || (((i3 = this.f2030g0) == 2 || i3 == 3) && c0410e.m2530m() == 3 && c0410e.f2125z.f2066d != null && c0410e.f2071B.f2066d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = this.f2124y.m2544c() || this.f2070A.m2544c();
        boolean z3 = this.f2125z.m2544c() || this.f2071B.m2544c();
        int i7 = !z && (((i = this.f2030g0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3)))) ? 5 : 4;
        for (int i8 = 0; i8 < this.f2147f0; i8++) {
            C0410e c0410e2 = this.f2146e0[i8];
            if (this.f2031h0 || c0410e2.mo2506b()) {
                C0404l m2584l = c0398f.m2584l(c0410e2.f2076G[this.f2030g0]);
                C0409d[] c0409dArr2 = c0410e2.f2076G;
                int i9 = this.f2030g0;
                c0409dArr2[i9].f2069g = m2584l;
                int i10 = (c0409dArr2[i9].f2066d == null || c0409dArr2[i9].f2066d.f2064b != this) ? 0 : c0409dArr2[i9].f2067e + 0;
                if (i9 != 0 && i9 != 2) {
                    C0395c m2583m = c0398f.m2583m();
                    C0404l m2582n = c0398f.m2582n();
                    m2582n.f2010e = 0;
                    m2583m.m2602e(c0409d2.f2069g, m2584l, m2582n, this.f2032i0 + i10);
                    c0398f.m2593c(m2583m);
                } else {
                    C0395c m2583m2 = c0398f.m2583m();
                    C0404l m2582n2 = c0398f.m2582n();
                    m2582n2.f2010e = 0;
                    m2583m2.m2601f(c0409d2.f2069g, m2584l, m2582n2, this.f2032i0 - i10);
                    c0398f.m2593c(m2583m2);
                }
                c0398f.m2592d(c0409d2.f2069g, m2584l, this.f2032i0 + i10, i7);
            }
        }
        int i11 = this.f2030g0;
        if (i11 == 0) {
            c0398f.m2592d(this.f2070A.f2069g, this.f2124y.f2069g, 0, 8);
            c0398f.m2592d(this.f2124y.f2069g, this.f2080K.f2070A.f2069g, 0, 4);
            c0404l = this.f2124y.f2069g;
            c0409d = this.f2080K.f2124y;
        } else if (i11 == 1) {
            c0398f.m2592d(this.f2124y.f2069g, this.f2070A.f2069g, 0, 8);
            c0398f.m2592d(this.f2124y.f2069g, this.f2080K.f2124y.f2069g, 0, 4);
            c0404l = this.f2124y.f2069g;
            c0409d = this.f2080K.f2070A;
        } else if (i11 == 2) {
            c0398f.m2592d(this.f2071B.f2069g, this.f2125z.f2069g, 0, 8);
            c0398f.m2592d(this.f2125z.f2069g, this.f2080K.f2071B.f2069g, 0, 4);
            c0404l = this.f2125z.f2069g;
            c0409d = this.f2080K.f2125z;
        } else if (i11 != 3) {
            return;
        } else {
            c0398f.m2592d(this.f2125z.f2069g, this.f2071B.f2069g, 0, 8);
            c0398f.m2592d(this.f2125z.f2069g, this.f2080K.f2125z.f2069g, 0, 4);
            c0404l = this.f2125z.f2069g;
            c0409d = this.f2080K.f2071B;
        }
        c0398f.m2592d(c0404l, c0409d.f2069g, 0, 0);
    }

    @Override // p010b.p037h.p040b.p041n.C0410e
    /* renamed from: b */
    public boolean mo2506b() {
        return true;
    }

    @Override // p010b.p037h.p040b.p041n.C0410e
    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("[Barrier] ");
        m1187i.append(this.f2094Y);
        m1187i.append(" {");
        String sb = m1187i.toString();
        for (int i = 0; i < this.f2147f0; i++) {
            C0410e c0410e = this.f2146e0[i];
            if (i > 0) {
                sb = AbstractC1124a.m1190f(sb, ", ");
            }
            StringBuilder m1187i2 = AbstractC1124a.m1187i(sb);
            m1187i2.append(c0410e.f2094Y);
            sb = m1187i2.toString();
        }
        return AbstractC1124a.m1190f(sb, "}");
    }
}