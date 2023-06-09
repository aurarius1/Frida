package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicBoolean;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.w0 */
/* loaded from: classes.dex */
public final class C2218w0 extends AtomicBoolean implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7235b;

    /* renamed from: c */
    public final C2220x0 f7236c;

    /* renamed from: d */
    public final RunnableC2216v0 f7237d;

    /* renamed from: e */
    public InterfaceC2112c f7238e;

    public C2218w0(InterfaceC2098f interfaceC2098f, C2220x0 c2220x0, RunnableC2216v0 runnableC2216v0) {
        this.f7235b = interfaceC2098f;
        this.f7236c = c2220x0;
        this.f7237d = runnableC2216v0;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (!compareAndSet(false, true)) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7236c.m83U(this.f7237d);
        this.f7235b.mo28b(th);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7238e, interfaceC2112c)) {
            this.f7238e = interfaceC2112c;
            this.f7235b.mo27c(this);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (compareAndSet(false, true)) {
            this.f7236c.m83U(this.f7237d);
            this.f7235b.mo26d();
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7238e.mo35e();
        if (compareAndSet(false, true)) {
            C2220x0 c2220x0 = this.f7236c;
            RunnableC2216v0 runnableC2216v0 = this.f7237d;
            synchronized (c2220x0) {
                RunnableC2216v0 runnableC2216v02 = c2220x0.f7247e;
                if (runnableC2216v02 != null && runnableC2216v02 == runnableC2216v0) {
                    long j = runnableC2216v0.f7231c - 1;
                    runnableC2216v0.f7231c = j;
                    if (j == 0 && runnableC2216v0.f7232d) {
                        c2220x0.m82V(runnableC2216v0);
                    }
                }
            }
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7235b.mo25g(obj);
    }
}