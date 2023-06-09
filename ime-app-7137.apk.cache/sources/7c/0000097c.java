package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p198f.C2235b;

/* renamed from: e.a.p.e.a.j1 */
/* loaded from: classes.dex */
public final class C2191j1 implements InterfaceC2098f {

    /* renamed from: b */
    public final C2188i1 f7161b;

    /* renamed from: c */
    public final C2235b f7162c;

    /* renamed from: d */
    public volatile boolean f7163d;

    /* renamed from: e */
    public Throwable f7164e;

    /* renamed from: f */
    public final AtomicReference f7165f = new AtomicReference();

    public C2191j1(C2188i1 c2188i1, int i) {
        this.f7161b = c2188i1;
        this.f7162c = new C2235b(i);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        this.f7164e = th;
        this.f7163d = true;
        this.f7161b.m98b();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m122c(this.f7165f, interfaceC2112c);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7163d = true;
        this.f7161b.m98b();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7162c.mo68f(obj);
        this.f7161b.m98b();
    }
}