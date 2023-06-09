package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.i */
/* loaded from: classes.dex */
public final class C2186i extends AtomicReference implements InterfaceC2098f {

    /* renamed from: b */
    public final InterfaceC2098f f7139b;

    /* renamed from: c */
    public final C2189j f7140c;

    public C2186i(InterfaceC2098f interfaceC2098f, C2189j c2189j) {
        this.f7139b = interfaceC2098f;
        this.f7140c = c2189j;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        C2189j c2189j = this.f7140c;
        if (!c2189j.f7151e.m55a(th)) {
            AbstractC1438d.m1044f(th);
            return;
        }
        if (!c2189j.f7153g) {
            c2189j.f7155i.mo35e();
        }
        c2189j.f7156j = false;
        c2189j.m97a();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m123b(this, interfaceC2112c);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        C2189j c2189j = this.f7140c;
        c2189j.f7156j = false;
        c2189j.m97a();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7139b.mo25g(obj);
    }
}