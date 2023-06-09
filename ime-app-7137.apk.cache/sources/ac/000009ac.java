package p183e.p184a.p190p.p199g;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.g.d */
/* loaded from: classes.dex */
public final class C2239d extends AbstractC2101i {

    /* renamed from: b */
    public static final C2237b f7318b;

    /* renamed from: c */
    public static final ThreadFactoryC2247l f7319c;

    /* renamed from: d */
    public static final int f7320d;

    /* renamed from: e */
    public static final C2238c f7321e;

    /* renamed from: f */
    public final ThreadFactory f7322f;

    /* renamed from: g */
    public final AtomicReference f7323g;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f7320d = availableProcessors;
        C2238c c2238c = new C2238c(new ThreadFactoryC2247l("RxComputationShutdown"));
        f7321e = c2238c;
        c2238c.mo35e();
        ThreadFactoryC2247l threadFactoryC2247l = new ThreadFactoryC2247l("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f7319c = threadFactoryC2247l;
        C2237b c2237b = new C2237b(0, threadFactoryC2247l);
        f7318b = c2237b;
        for (C2238c c2238c2 : c2237b.f7316b) {
            c2238c2.mo35e();
        }
    }

    public C2239d() {
        ThreadFactoryC2247l threadFactoryC2247l = f7319c;
        this.f7322f = threadFactoryC2247l;
        C2237b c2237b = f7318b;
        AtomicReference atomicReference = new AtomicReference(c2237b);
        this.f7323g = atomicReference;
        C2237b c2237b2 = new C2237b(f7320d, threadFactoryC2247l);
        if (atomicReference.compareAndSet(c2237b, c2237b2)) {
            return;
        }
        for (C2238c c2238c : c2237b2.f7316b) {
            c2238c.mo35e();
        }
    }

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: a */
    public AbstractC2100h mo59a() {
        return new C2236a(((C2237b) this.f7323g.get()).m67a());
    }

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: c */
    public InterfaceC2112c mo57c(Runnable runnable, long j, TimeUnit timeUnit) {
        C2238c m67a = ((C2237b) this.f7323g.get()).m67a();
        m67a.getClass();
        if (runnable != null) {
            CallableC2248m callableC2248m = new CallableC2248m(runnable);
            try {
                callableC2248m.m65a(j <= 0 ? m67a.f7346b.submit(callableC2248m) : m67a.f7346b.schedule(callableC2248m, j, timeUnit));
                return callableC2248m;
            } catch (RejectedExecutionException e) {
                AbstractC1438d.m1044f(e);
                return EnumC2132d.INSTANCE;
            }
        }
        throw new NullPointerException("run is null");
    }
}