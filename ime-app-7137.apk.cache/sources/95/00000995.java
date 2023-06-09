package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.v0 */
/* loaded from: classes.dex */
public final class RunnableC2216v0 extends AtomicReference implements Runnable, InterfaceC2123e {

    /* renamed from: b */
    public final C2220x0 f7230b;

    /* renamed from: c */
    public long f7231c;

    /* renamed from: d */
    public boolean f7232d;

    /* renamed from: e */
    public boolean f7233e;

    public RunnableC2216v0(C2220x0 c2220x0) {
        this.f7230b = c2220x0;
    }

    @Override // p183e.p184a.p189o.InterfaceC2123e
    public void accept(Object obj) {
        InterfaceC2112c interfaceC2112c = (InterfaceC2112c) obj;
        EnumC2131c.m123b(this, interfaceC2112c);
        synchronized (this.f7230b) {
            if (this.f7233e) {
                ((C2214u0) this.f7230b.f7244b).f7228c.compareAndSet((C2212t0) interfaceC2112c, null);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7230b.m82V(this);
    }
}