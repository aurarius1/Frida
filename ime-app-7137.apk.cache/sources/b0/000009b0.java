package p183e.p184a.p190p.p199g;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.AbstractC2101i;

/* renamed from: e.a.p.g.h */
/* loaded from: classes.dex */
public final class C2243h extends AbstractC2101i {

    /* renamed from: b */
    public static final ThreadFactoryC2247l f7335b;

    /* renamed from: c */
    public static final ThreadFactoryC2247l f7336c;

    /* renamed from: f */
    public static final C2242g f7339f;

    /* renamed from: g */
    public static boolean f7340g;

    /* renamed from: h */
    public static final RunnableC2240e f7341h;

    /* renamed from: i */
    public final ThreadFactory f7342i;

    /* renamed from: j */
    public final AtomicReference f7343j;

    /* renamed from: e */
    public static final TimeUnit f7338e = TimeUnit.SECONDS;

    /* renamed from: d */
    public static final long f7337d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        C2242g c2242g = new C2242g(new ThreadFactoryC2247l("RxCachedThreadSchedulerShutdown"));
        f7339f = c2242g;
        c2242g.mo35e();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC2247l threadFactoryC2247l = new ThreadFactoryC2247l("RxCachedThreadScheduler", max);
        f7335b = threadFactoryC2247l;
        f7336c = new ThreadFactoryC2247l("RxCachedWorkerPoolEvictor", max);
        f7340g = Boolean.getBoolean("rx2.io-scheduled-release");
        RunnableC2240e runnableC2240e = new RunnableC2240e(0L, null, threadFactoryC2247l);
        f7341h = runnableC2240e;
        runnableC2240e.f7326d.mo35e();
        Future future = runnableC2240e.f7328f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = runnableC2240e.f7327e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C2243h() {
        ThreadFactoryC2247l threadFactoryC2247l = f7335b;
        this.f7342i = threadFactoryC2247l;
        RunnableC2240e runnableC2240e = f7341h;
        AtomicReference atomicReference = new AtomicReference(runnableC2240e);
        this.f7343j = atomicReference;
        RunnableC2240e runnableC2240e2 = new RunnableC2240e(f7337d, f7338e, threadFactoryC2247l);
        if (atomicReference.compareAndSet(runnableC2240e, runnableC2240e2)) {
            return;
        }
        runnableC2240e2.f7326d.mo35e();
        Future future = runnableC2240e2.f7328f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = runnableC2240e2.f7327e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: a */
    public AbstractC2100h mo59a() {
        return new RunnableC2241f((RunnableC2240e) this.f7343j.get());
    }
}