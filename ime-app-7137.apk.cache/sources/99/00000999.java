package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.TimeUnit;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p201q.AbstractC2266a;

/* renamed from: e.a.p.e.a.x0 */
/* loaded from: classes.dex */
public final class C2220x0 extends AbstractC2094b {

    /* renamed from: b */
    public final AbstractC2266a f7244b;

    /* renamed from: c */
    public final int f7245c;

    /* renamed from: d */
    public final TimeUnit f7246d;

    /* renamed from: e */
    public RunnableC2216v0 f7247e;

    public C2220x0(AbstractC2266a abstractC2266a) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f7244b = abstractC2266a;
        this.f7245c = 1;
        this.f7246d = timeUnit;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        RunnableC2216v0 runnableC2216v0;
        boolean z;
        synchronized (this) {
            runnableC2216v0 = this.f7247e;
            if (runnableC2216v0 == null) {
                runnableC2216v0 = new RunnableC2216v0(this);
                this.f7247e = runnableC2216v0;
            }
            long j = runnableC2216v0.f7231c;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            long j2 = j + 1;
            runnableC2216v0.f7231c = j2;
            z = true;
            if (runnableC2216v0.f7232d || j2 != this.f7245c) {
                z = false;
            } else {
                runnableC2216v0.f7232d = true;
            }
        }
        this.f7244b.mo89a(new C2218w0(interfaceC2098f, this, runnableC2216v0));
        if (z) {
            this.f7244b.mo42T(runnableC2216v0);
        }
    }

    /* renamed from: T */
    public void m84T(RunnableC2216v0 runnableC2216v0) {
        AbstractC2266a abstractC2266a = this.f7244b;
        if (abstractC2266a instanceof InterfaceC2112c) {
            ((InterfaceC2112c) abstractC2266a).mo35e();
        } else if (abstractC2266a instanceof C2214u0) {
            ((C2214u0) abstractC2266a).m85V((InterfaceC2112c) runnableC2216v0.get());
        }
    }

    /* renamed from: U */
    public void m83U(RunnableC2216v0 runnableC2216v0) {
        synchronized (this) {
            if (this.f7244b instanceof C2208r0) {
                RunnableC2216v0 runnableC2216v02 = this.f7247e;
                if (runnableC2216v02 != null && runnableC2216v02 == runnableC2216v0) {
                    this.f7247e = null;
                    runnableC2216v0.getClass();
                }
                long j = runnableC2216v0.f7231c - 1;
                runnableC2216v0.f7231c = j;
                if (j == 0) {
                    m84T(runnableC2216v0);
                }
            } else {
                RunnableC2216v0 runnableC2216v03 = this.f7247e;
                if (runnableC2216v03 != null && runnableC2216v03 == runnableC2216v0) {
                    runnableC2216v0.getClass();
                    long j2 = runnableC2216v0.f7231c - 1;
                    runnableC2216v0.f7231c = j2;
                    if (j2 == 0) {
                        this.f7247e = null;
                        m84T(runnableC2216v0);
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public void m82V(RunnableC2216v0 runnableC2216v0) {
        synchronized (this) {
            if (runnableC2216v0.f7231c == 0 && runnableC2216v0 == this.f7247e) {
                this.f7247e = null;
                InterfaceC2112c interfaceC2112c = (InterfaceC2112c) runnableC2216v0.get();
                EnumC2131c.m124a(runnableC2216v0);
                AbstractC2266a abstractC2266a = this.f7244b;
                if (abstractC2266a instanceof InterfaceC2112c) {
                    ((InterfaceC2112c) abstractC2266a).mo35e();
                } else if (abstractC2266a instanceof C2214u0) {
                    if (interfaceC2112c == null) {
                        runnableC2216v0.f7233e = true;
                    } else {
                        ((C2214u0) abstractC2266a).f7228c.compareAndSet((C2212t0) interfaceC2112c, null);
                    }
                }
            }
        }
    }
}