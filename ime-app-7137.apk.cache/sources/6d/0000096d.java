package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicBoolean;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.e1 */
/* loaded from: classes.dex */
public final class C2176e1 extends AtomicBoolean implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7103b;

    /* renamed from: c */
    public final AbstractC2101i f7104c;

    /* renamed from: d */
    public InterfaceC2112c f7105d;

    public C2176e1(InterfaceC2098f interfaceC2098f, AbstractC2101i abstractC2101i) {
        this.f7103b = interfaceC2098f;
        this.f7104c = abstractC2101i;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (get()) {
            AbstractC1438d.m1044f(th);
        } else {
            this.f7103b.mo28b(th);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7105d, interfaceC2112c)) {
            this.f7105d = interfaceC2112c;
            this.f7103b.mo27c(this);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (get()) {
            return;
        }
        this.f7103b.mo26d();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (compareAndSet(false, true)) {
            this.f7104c.mo58b(new RunnableC2173d1(this));
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (get()) {
            return;
        }
        this.f7103b.mo25g(obj);
    }
}