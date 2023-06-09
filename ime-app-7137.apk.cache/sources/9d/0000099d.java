package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.Callable;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2132d;
import p183e.p184a.p190p.p192b.AbstractC2148n;

/* renamed from: e.a.p.e.a.z0 */
/* loaded from: classes.dex */
public final class C2224z0 extends AbstractC2094b {

    /* renamed from: b */
    public final Object f7272b;

    /* renamed from: c */
    public final InterfaceC2127i f7273c;

    public C2224z0(Object obj, InterfaceC2127i interfaceC2127i) {
        this.f7272b = obj;
        this.f7273c = interfaceC2127i;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        InterfaceC2112c interfaceC2112c = EnumC2132d.INSTANCE;
        try {
            Object mo24a = this.f7273c.mo24a(this.f7272b);
            AbstractC2148n.m110a(mo24a, "The mapper returned a null ObservableSource");
            InterfaceC2097e interfaceC2097e = (InterfaceC2097e) mo24a;
            if (interfaceC2097e instanceof Callable) {
                try {
                    Object call = ((Callable) interfaceC2097e).call();
                    if (call == null) {
                        interfaceC2098f.mo27c(interfaceC2112c);
                        interfaceC2098f.mo26d();
                        return;
                    }
                    RunnableC2222y0 runnableC2222y0 = new RunnableC2222y0(interfaceC2098f, call);
                    interfaceC2098f.mo27c(runnableC2222y0);
                    runnableC2222y0.run();
                    return;
                } catch (Throwable th) {
                    AbstractC1438d.m1039k(th);
                    interfaceC2098f.mo27c(interfaceC2112c);
                    interfaceC2098f.mo28b(th);
                    return;
                }
            }
            interfaceC2097e.mo89a(interfaceC2098f);
        } catch (Throwable th2) {
            interfaceC2098f.mo27c(interfaceC2112c);
            interfaceC2098f.mo28b(th2);
        }
    }
}