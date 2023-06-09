package p183e.p184a.p190p.p199g;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;
import p183e.p184a.p190p.p191a.InterfaceC2130b;

/* renamed from: e.a.p.g.j */
/* loaded from: classes.dex */
public class C2245j extends AbstractC2100h implements InterfaceC2112c {

    /* renamed from: b */
    public final ScheduledExecutorService f7346b;

    /* renamed from: c */
    public volatile boolean f7347c;

    public C2245j(ThreadFactory threadFactory) {
        this.f7346b = AbstractC2251p.m63a(threadFactory);
    }

    @Override // p183e.p184a.AbstractC2100h
    /* renamed from: b */
    public InterfaceC2112c mo62b(Runnable runnable) {
        return mo61c(runnable, 0L, null);
    }

    @Override // p183e.p184a.AbstractC2100h
    /* renamed from: c */
    public InterfaceC2112c mo61c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f7347c ? EnumC2132d.INSTANCE : m66d(runnable, j, timeUnit, null);
    }

    /* renamed from: d */
    public RunnableC2249n m66d(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC2130b interfaceC2130b) {
        if (runnable != null) {
            RunnableC2249n runnableC2249n = new RunnableC2249n(runnable, interfaceC2130b);
            if (interfaceC2130b == null || interfaceC2130b.mo117c(runnableC2249n)) {
                try {
                    runnableC2249n.m64a(j <= 0 ? this.f7346b.submit((Callable) runnableC2249n) : this.f7346b.schedule((Callable) runnableC2249n, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    if (interfaceC2130b != null) {
                        interfaceC2130b.mo118b(runnableC2249n);
                    }
                    AbstractC1438d.m1044f(e);
                }
                return runnableC2249n;
            }
            return runnableC2249n;
        }
        throw new NullPointerException("run is null");
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7347c) {
            return;
        }
        this.f7347c = true;
        this.f7346b.shutdownNow();
    }
}