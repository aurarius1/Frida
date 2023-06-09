package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p193c.InterfaceC2149a;
import p183e.p184a.p190p.p193c.InterfaceC2152d;
import p183e.p184a.p190p.p198f.C2235b;

/* renamed from: e.a.p.e.a.x */
/* loaded from: classes.dex */
public final class C2219x extends AtomicReference implements InterfaceC2098f {

    /* renamed from: b */
    public final long f7239b;

    /* renamed from: c */
    public final C2221y f7240c;

    /* renamed from: d */
    public volatile boolean f7241d;

    /* renamed from: e */
    public volatile InterfaceC2152d f7242e;

    /* renamed from: f */
    public int f7243f;

    public C2219x(C2221y c2221y, long j) {
        this.f7239b = j;
        this.f7240c = c2221y;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (!this.f7240c.f7257k.m55a(th)) {
            AbstractC1438d.m1044f(th);
            return;
        }
        C2221y c2221y = this.f7240c;
        if (!c2221y.f7252f) {
            c2221y.m80f();
        }
        this.f7241d = true;
        this.f7240c.m79i();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m122c(this, interfaceC2112c) && (interfaceC2112c instanceof InterfaceC2149a)) {
            InterfaceC2149a interfaceC2149a = (InterfaceC2149a) interfaceC2112c;
            int mo74h = interfaceC2149a.mo74h(7);
            if (mo74h == 1) {
                this.f7243f = mo74h;
                this.f7242e = interfaceC2149a;
                this.f7241d = true;
                this.f7240c.m79i();
            } else if (mo74h == 2) {
                this.f7243f = mo74h;
                this.f7242e = interfaceC2149a;
            }
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7241d = true;
        this.f7240c.m79i();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7243f == 0) {
            C2221y c2221y = this.f7240c;
            if (c2221y.get() == 0 && c2221y.compareAndSet(0, 1)) {
                c2221y.f7250d.mo25g(obj);
                if (c2221y.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC2152d interfaceC2152d = this.f7242e;
                if (interfaceC2152d == null) {
                    interfaceC2152d = new C2235b(c2221y.f7254h);
                    this.f7242e = interfaceC2152d;
                }
                interfaceC2152d.mo68f(obj);
                if (c2221y.getAndIncrement() != 0) {
                    return;
                }
            }
            c2221y.m78j();
            return;
        }
        this.f7240c.m79i();
    }
}