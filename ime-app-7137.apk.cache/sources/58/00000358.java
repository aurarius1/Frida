package p010b.p067m.p068d;

import p010b.p046j.p054h.C0529b;

/* renamed from: b.m.d.o */
/* loaded from: classes.dex */
public class C0724o extends AbstractC0720n {

    /* renamed from: c */
    public final Object f3075c;

    /* renamed from: d */
    public final boolean f3076d;

    /* renamed from: e */
    public final Object f3077e;

    public C0724o(C0727o2 c0727o2, C0529b c0529b, boolean z, boolean z2) {
        super(c0727o2, c0529b);
        Object obj;
        Object obj2;
        if (c0727o2.f3087a == EnumC0739r2.VISIBLE) {
            if (z) {
                obj2 = c0727o2.f3089c.m1845y();
            } else {
                c0727o2.f3089c.m1863m();
                obj2 = null;
            }
            this.f3075c = obj2;
            if (z) {
                C0757x c0757x = c0727o2.f3089c.f3219L;
            } else {
                C0757x c0757x2 = c0727o2.f3089c.f3219L;
            }
        } else {
            if (z) {
                obj = c0727o2.f3089c.m1914A();
            } else {
                c0727o2.f3089c.m1860p();
                obj = null;
            }
            this.f3075c = obj;
        }
        this.f3076d = true;
        if (z2) {
            if (z) {
                this.f3077e = c0727o2.f3089c.m1910C();
                return;
            }
            c0727o2.f3089c.m1912B();
        }
        this.f3077e = null;
    }

    /* renamed from: c */
    public final AbstractC0695g2 m1976c(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC0695g2 abstractC0695g2 = AbstractC0756w1.f3184b;
        if (abstractC0695g2 == null || !abstractC0695g2.mo1319e(obj)) {
            AbstractC0695g2 abstractC0695g22 = AbstractC0756w1.f3185c;
            if (abstractC0695g22 == null || !abstractC0695g22.mo1319e(obj)) {
                throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f3066a.f3089c + " is not a valid framework Transition or AndroidX Transition");
            }
            return abstractC0695g22;
        }
        return abstractC0695g2;
    }
}