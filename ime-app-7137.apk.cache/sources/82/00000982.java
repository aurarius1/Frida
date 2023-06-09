package p183e.p184a.p190p.p195e.p196a;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2096d;
import p183e.p184a.InterfaceC2098f;

/* renamed from: e.a.p.e.a.m */
/* loaded from: classes.dex */
public final class C2197m extends AbstractC2094b {

    /* renamed from: b */
    public final InterfaceC2096d f7187b;

    public C2197m(InterfaceC2096d interfaceC2096d) {
        this.f7187b = interfaceC2096d;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        C2195l c2195l = new C2195l(interfaceC2098f);
        interfaceC2098f.mo27c(c2195l);
        try {
            this.f7187b.mo138a(c2195l);
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            c2195l.m93b(th);
        }
    }
}