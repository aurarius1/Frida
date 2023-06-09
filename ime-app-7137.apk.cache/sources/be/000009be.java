package p183e.p184a.p190p.p199g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.p187m.C2114e;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.g.v */
/* loaded from: classes.dex */
public final class C2257v extends AbstractC2100h implements InterfaceC2112c {

    /* renamed from: b */
    public final PriorityBlockingQueue f7379b = new PriorityBlockingQueue();

    /* renamed from: c */
    public final AtomicInteger f7380c = new AtomicInteger();

    /* renamed from: d */
    public final AtomicInteger f7381d = new AtomicInteger();

    /* renamed from: e */
    public volatile boolean f7382e;

    @Override // p183e.p184a.AbstractC2100h
    /* renamed from: b */
    public InterfaceC2112c mo62b(Runnable runnable) {
        return m60d(runnable, m137a(TimeUnit.MILLISECONDS));
    }

    @Override // p183e.p184a.AbstractC2100h
    /* renamed from: c */
    public InterfaceC2112c mo61c(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + m137a(TimeUnit.MILLISECONDS);
        return m60d(new RunnableC2254s(runnable, this, millis), millis);
    }

    /* renamed from: d */
    public InterfaceC2112c m60d(Runnable runnable, long j) {
        EnumC2132d enumC2132d = EnumC2132d.INSTANCE;
        if (this.f7382e) {
            return enumC2132d;
        }
        C2255t c2255t = new C2255t(runnable, Long.valueOf(j), this.f7381d.incrementAndGet());
        this.f7379b.add(c2255t);
        if (this.f7380c.getAndIncrement() == 0) {
            int i = 1;
            while (!this.f7382e) {
                C2255t c2255t2 = (C2255t) this.f7379b.poll();
                if (c2255t2 == null) {
                    i = this.f7380c.addAndGet(-i);
                    if (i == 0) {
                        return enumC2132d;
                    }
                } else if (!c2255t2.f7376e) {
                    c2255t2.f7373b.run();
                }
            }
            this.f7379b.clear();
            return enumC2132d;
        }
        return new C2114e(new RunnableC2256u(this, c2255t));
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7382e = true;
    }
}