package p183e.p184a.p190p.p199g;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.g.f */
/* loaded from: classes.dex */
public final class RunnableC2241f extends AbstractC2100h implements Runnable {

    /* renamed from: c */
    public final RunnableC2240e f7331c;

    /* renamed from: d */
    public final C2242g f7332d;

    /* renamed from: e */
    public final AtomicBoolean f7333e = new AtomicBoolean();

    /* renamed from: b */
    public final C2111b f7330b = new C2111b();

    public RunnableC2241f(RunnableC2240e runnableC2240e) {
        C2242g c2242g;
        C2242g c2242g2;
        this.f7331c = runnableC2240e;
        if (runnableC2240e.f7326d.f7019c) {
            c2242g2 = C2243h.f7339f;
        } else {
            while (true) {
                if (!runnableC2240e.f7325c.isEmpty()) {
                    c2242g = (C2242g) runnableC2240e.f7325c.poll();
                    if (c2242g != null) {
                        break;
                    }
                } else {
                    c2242g = new C2242g(runnableC2240e.f7329g);
                    runnableC2240e.f7326d.mo117c(c2242g);
                    break;
                }
            }
            c2242g2 = c2242g;
        }
        this.f7332d = c2242g2;
    }

    @Override // p183e.p184a.AbstractC2100h
    /* renamed from: c */
    public InterfaceC2112c mo61c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f7330b.f7019c ? EnumC2132d.INSTANCE : this.f7332d.m66d(runnable, j, timeUnit, this.f7330b);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7333e.compareAndSet(false, true)) {
            this.f7330b.mo35e();
            if (C2243h.f7340g) {
                this.f7332d.m66d(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            RunnableC2240e runnableC2240e = this.f7331c;
            C2242g c2242g = this.f7332d;
            runnableC2240e.getClass();
            c2242g.f7334d = System.nanoTime() + runnableC2240e.f7324b;
            runnableC2240e.f7325c.offer(c2242g);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        RunnableC2240e runnableC2240e = this.f7331c;
        C2242g c2242g = this.f7332d;
        runnableC2240e.getClass();
        c2242g.f7334d = System.nanoTime() + runnableC2240e.f7324b;
        runnableC2240e.f7325c.offer(c2242g);
    }
}