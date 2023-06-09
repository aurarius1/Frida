package p183e.p184a.p190p.p199g;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.g.r */
/* loaded from: classes.dex */
public final class C2253r extends AbstractC2101i {

    /* renamed from: b */
    public static final ThreadFactoryC2247l f7367b;

    /* renamed from: c */
    public static final ScheduledExecutorService f7368c;

    /* renamed from: d */
    public final AtomicReference f7369d;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f7368c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f7367b = new ThreadFactoryC2247l("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C2253r() {
        ThreadFactoryC2247l threadFactoryC2247l = f7367b;
        AtomicReference atomicReference = new AtomicReference();
        this.f7369d = atomicReference;
        atomicReference.lazySet(AbstractC2251p.m63a(threadFactoryC2247l));
    }

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: a */
    public AbstractC2100h mo59a() {
        return new C2252q((ScheduledExecutorService) this.f7369d.get());
    }

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: c */
    public InterfaceC2112c mo57c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            CallableC2248m callableC2248m = new CallableC2248m(runnable);
            try {
                callableC2248m.m65a(j <= 0 ? ((ScheduledExecutorService) this.f7369d.get()).submit(callableC2248m) : ((ScheduledExecutorService) this.f7369d.get()).schedule(callableC2248m, j, timeUnit));
                return callableC2248m;
            } catch (RejectedExecutionException e) {
                AbstractC1438d.m1044f(e);
                return EnumC2132d.INSTANCE;
            }
        }
        throw new NullPointerException("run is null");
    }
}