package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.a1 */
/* loaded from: classes.dex */
public final class C2164a1 extends AtomicReference implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7073b;

    /* renamed from: c */
    public final AtomicReference f7074c = new AtomicReference();

    public C2164a1(InterfaceC2098f interfaceC2098f) {
        this.f7073b = interfaceC2098f;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        this.f7073b.mo28b(th);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m122c(this.f7074c, interfaceC2112c);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7073b.mo26d();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        EnumC2131c.m124a(this.f7074c);
        EnumC2131c.m124a(this);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7073b.mo25g(obj);
    }
}