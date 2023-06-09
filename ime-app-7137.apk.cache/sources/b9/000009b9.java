package p183e.p184a.p190p.p199g;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.g.q */
/* loaded from: classes.dex */
public final class C2252q extends AbstractC2100h {

    /* renamed from: b */
    public final ScheduledExecutorService f7364b;

    /* renamed from: c */
    public final C2111b f7365c = new C2111b();

    /* renamed from: d */
    public volatile boolean f7366d;

    public C2252q(ScheduledExecutorService scheduledExecutorService) {
        this.f7364b = scheduledExecutorService;
    }

    @Override // p183e.p184a.AbstractC2100h
    /* renamed from: c */
    public InterfaceC2112c mo61c(Runnable runnable, long j, TimeUnit timeUnit) {
        EnumC2132d enumC2132d = EnumC2132d.INSTANCE;
        if (this.f7366d) {
            return enumC2132d;
        }
        if (runnable != null) {
            RunnableC2249n runnableC2249n = new RunnableC2249n(runnable, this.f7365c);
            this.f7365c.mo117c(runnableC2249n);
            try {
                runnableC2249n.m64a(j <= 0 ? this.f7364b.submit((Callable) runnableC2249n) : this.f7364b.schedule((Callable) runnableC2249n, j, timeUnit));
                return runnableC2249n;
            } catch (RejectedExecutionException e) {
                mo35e();
                AbstractC1438d.m1044f(e);
                return enumC2132d;
            }
        }
        throw new NullPointerException("run is null");
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7366d) {
            return;
        }
        this.f7366d = true;
        this.f7365c.mo35e();
    }
}