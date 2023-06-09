package p010b.p037h.p040b.p041n.p042k;

import java.util.ArrayList;

/* renamed from: b.h.b.n.k.m */
/* loaded from: classes.dex */
public class C0428m {

    /* renamed from: a */
    public static int f2195a;

    /* renamed from: b */
    public AbstractC0430o f2196b;

    /* renamed from: c */
    public ArrayList f2197c = new ArrayList();

    public C0428m(AbstractC0430o abstractC0430o, int i) {
        this.f2196b = null;
        f2195a++;
        this.f2196b = abstractC0430o;
    }

    /* renamed from: a */
    public final long m2486a(C0423h c0423h, long j) {
        AbstractC0430o abstractC0430o = c0423h.f2184d;
        if (abstractC0430o instanceof C0426k) {
            return j;
        }
        int size = c0423h.f2191k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0420e interfaceC0420e = (InterfaceC0420e) c0423h.f2191k.get(i);
            if (interfaceC0420e instanceof C0423h) {
                C0423h c0423h2 = (C0423h) interfaceC0420e;
                if (c0423h2.f2184d != abstractC0430o) {
                    j2 = Math.min(j2, m2486a(c0423h2, c0423h2.f2186f + j));
                }
            }
        }
        if (c0423h == abstractC0430o.f2208i) {
            long mo2474j = j - abstractC0430o.mo2474j();
            return Math.min(Math.min(j2, m2486a(abstractC0430o.f2207h, mo2474j)), mo2474j - abstractC0430o.f2207h.f2186f);
        }
        return j2;
    }

    /* renamed from: b */
    public final long m2485b(C0423h c0423h, long j) {
        AbstractC0430o abstractC0430o = c0423h.f2184d;
        if (abstractC0430o instanceof C0426k) {
            return j;
        }
        int size = c0423h.f2191k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0420e interfaceC0420e = (InterfaceC0420e) c0423h.f2191k.get(i);
            if (interfaceC0420e instanceof C0423h) {
                C0423h c0423h2 = (C0423h) interfaceC0420e;
                if (c0423h2.f2184d != abstractC0430o) {
                    j2 = Math.max(j2, m2485b(c0423h2, c0423h2.f2186f + j));
                }
            }
        }
        if (c0423h == abstractC0430o.f2207h) {
            long mo2474j = j + abstractC0430o.mo2474j();
            return Math.max(Math.max(j2, m2485b(abstractC0430o.f2208i, mo2474j)), mo2474j - abstractC0430o.f2208i.f2186f);
        }
        return j2;
    }
}