package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.p.e.a.s0 */
/* loaded from: classes.dex */
public final class C2210s0 extends AtomicReference implements InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7217b;

    public C2210s0(InterfaceC2098f interfaceC2098f, C2212t0 c2212t0) {
        this.f7217b = interfaceC2098f;
        lazySet(c2212t0);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        C2212t0 c2212t0 = (C2212t0) getAndSet(null);
        if (c2212t0 != null) {
            c2212t0.m86a(this);
        }
    }
}