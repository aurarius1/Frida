package p183e.p184a.p190p.p195e.p196a;

import java.util.Iterator;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;
import p183e.p184a.p190p.p192b.AbstractC2148n;

/* renamed from: e.a.p.e.a.d0 */
/* loaded from: classes.dex */
public final class C2172d0 extends AbstractC2094b {

    /* renamed from: b */
    public final Iterable f7097b;

    public C2172d0(Iterable iterable) {
        this.f7097b = iterable;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        InterfaceC2112c interfaceC2112c = EnumC2132d.INSTANCE;
        try {
            Iterator it = this.f7097b.iterator();
            try {
                if (!it.hasNext()) {
                    interfaceC2098f.mo27c(interfaceC2112c);
                    interfaceC2098f.mo26d();
                    return;
                }
                C2169c0 c2169c0 = new C2169c0(interfaceC2098f, it);
                interfaceC2098f.mo27c(c2169c0);
                if (c2169c0.f7088e) {
                    return;
                }
                while (!c2169c0.f7087d) {
                    try {
                        Object next = c2169c0.f7086c.next();
                        AbstractC2148n.m110a(next, "The iterator returned a null value");
                        c2169c0.f7085b.mo25g(next);
                        if (c2169c0.f7087d) {
                            return;
                        }
                        if (!c2169c0.f7086c.hasNext()) {
                            if (c2169c0.f7087d) {
                                return;
                            }
                            c2169c0.f7085b.mo26d();
                            return;
                        }
                    } catch (Throwable th) {
                        AbstractC1438d.m1039k(th);
                        c2169c0.f7085b.mo28b(th);
                        return;
                    }
                }
            } catch (Throwable th2) {
                AbstractC1438d.m1039k(th2);
                interfaceC2098f.mo27c(interfaceC2112c);
                interfaceC2098f.mo28b(th2);
            }
        } catch (Throwable th3) {
            AbstractC1438d.m1039k(th3);
            interfaceC2098f.mo27c(interfaceC2112c);
            interfaceC2098f.mo28b(th3);
        }
    }
}