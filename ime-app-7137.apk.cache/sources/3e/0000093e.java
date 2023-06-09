package p183e.p184a.p190p.p191a;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2122d;

/* renamed from: e.a.p.a.a */
/* loaded from: classes.dex */
public final class C2129a extends AtomicReference implements InterfaceC2112c {
    public C2129a(InterfaceC2122d interfaceC2122d) {
        super(interfaceC2122d);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        InterfaceC2122d interfaceC2122d;
        if (get() == null || (interfaceC2122d = (InterfaceC2122d) getAndSet(null)) == null) {
            return;
        }
        try {
            interfaceC2122d.cancel();
        } catch (Exception e) {
            AbstractC1438d.m1039k(e);
            AbstractC1438d.m1044f(e);
        }
    }
}