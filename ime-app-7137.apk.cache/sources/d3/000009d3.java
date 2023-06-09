package p183e.p184a.p203s;

import java.util.concurrent.atomic.AtomicBoolean;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.s.c */
/* loaded from: classes.dex */
public final class C2278c extends AtomicBoolean implements InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7418b;

    /* renamed from: c */
    public final C2279d f7419c;

    public C2278c(InterfaceC2098f interfaceC2098f, C2279d c2279d) {
        this.f7418b = interfaceC2098f;
        this.f7419c = c2279d;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (compareAndSet(false, true)) {
            this.f7419c.m36T(this);
        }
    }
}