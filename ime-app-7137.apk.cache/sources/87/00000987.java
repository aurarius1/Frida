package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.p.e.a.o0 */
/* loaded from: classes.dex */
public final class C2202o0 extends AtomicReference implements InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7196b;

    public C2202o0(InterfaceC2098f interfaceC2098f) {
        this.f7196b = interfaceC2098f;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((C2204p0) andSet).m90a(this);
    }
}