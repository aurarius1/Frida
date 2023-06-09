package p010b.p037h.p040b.p041n.p042k;

import java.util.ArrayList;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.C0411f;
import p010b.p037h.p043c.C0435e;

/* renamed from: b.h.b.n.k.c */
/* loaded from: classes.dex */
public class C0418c {

    /* renamed from: a */
    public final ArrayList f2159a = new ArrayList();

    /* renamed from: b */
    public C0417b f2160b = new C0417b();

    /* renamed from: c */
    public C0411f f2161c;

    public C0418c(C0411f c0411f) {
        this.f2161c = c0411f;
    }

    /* renamed from: a */
    public final boolean m2503a(C0435e c0435e, C0410e c0410e, boolean z) {
        this.f2160b.f2149a = c0410e.m2534i();
        this.f2160b.f2150b = c0410e.m2530m();
        this.f2160b.f2151c = c0410e.m2529n();
        this.f2160b.f2152d = c0410e.m2535h();
        C0417b c0417b = this.f2160b;
        c0417b.f2157i = false;
        c0417b.f2158j = z;
        boolean z2 = c0417b.f2149a == 3;
        boolean z3 = c0417b.f2150b == 3;
        boolean z4 = z2 && c0410e.f2083N > 0.0f;
        boolean z5 = z3 && c0410e.f2083N > 0.0f;
        if (z4 && c0410e.f2111l[0] == 4) {
            c0417b.f2149a = 1;
        }
        if (z5 && c0410e.f2111l[1] == 4) {
            c0417b.f2150b = 1;
        }
        c0435e.m2460a(c0410e, c0417b);
        c0410e.m2540A(this.f2160b.f2153e);
        c0410e.m2523v(this.f2160b.f2154f);
        C0417b c0417b2 = this.f2160b;
        c0410e.f2122w = c0417b2.f2156h;
        int i = c0417b2.f2155g;
        c0410e.f2087R = i;
        c0410e.f2122w = i > 0;
        c0417b2.f2158j = false;
        return c0417b2.f2157i;
    }

    /* renamed from: b */
    public final void m2502b(C0411f c0411f, int i, int i2) {
        int i3 = c0411f.f2088S;
        int i4 = c0411f.f2089T;
        c0411f.m2520y(0);
        c0411f.m2521x(0);
        c0411f.f2081L = i;
        int i5 = c0411f.f2088S;
        if (i < i5) {
            c0411f.f2081L = i5;
        }
        c0411f.f2082M = i2;
        int i6 = c0411f.f2089T;
        if (i2 < i6) {
            c0411f.f2082M = i6;
        }
        c0411f.m2520y(i3);
        c0411f.m2521x(i4);
        this.f2161c.m2513H();
    }
}