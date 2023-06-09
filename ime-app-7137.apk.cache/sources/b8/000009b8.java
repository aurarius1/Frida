package p183e.p184a.p190p.p199g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.a.p.g.p */
/* loaded from: classes.dex */
public abstract class AbstractC2251p {

    /* renamed from: a */
    public static final boolean f7360a;

    /* renamed from: b */
    public static final int f7361b;

    /* renamed from: c */
    public static final AtomicReference f7362c = new AtomicReference();

    /* renamed from: d */
    public static final Map f7363d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[LOOP:0: B:19:0x0039->B:25:0x0064, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        boolean z;
        String property;
        int parseInt;
        String property2;
        try {
            property2 = System.getProperty("rx2.purge-enabled");
        } catch (Throwable unused) {
        }
        if (property2 != null) {
            z = "true".equals(property2);
            f7360a = z;
            if (z) {
            }
            parseInt = 1;
            f7361b = parseInt;
            if (!f7360a) {
            }
        } else {
            z = true;
            f7360a = z;
            if (z) {
                try {
                    property = System.getProperty("rx2.purge-period-seconds");
                } catch (Throwable unused2) {
                }
                if (property != null) {
                    parseInt = Integer.parseInt(property);
                    f7361b = parseInt;
                    if (!f7360a) {
                        return;
                    }
                    while (true) {
                        AtomicReference atomicReference = f7362c;
                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
                        if (scheduledExecutorService != null) {
                            return;
                        }
                        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC2247l("RxSchedulerPurge"));
                        if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                            RunnableC2250o runnableC2250o = new RunnableC2250o();
                            long j = f7361b;
                            newScheduledThreadPool.scheduleAtFixedRate(runnableC2250o, j, j, TimeUnit.SECONDS);
                            return;
                        }
                        newScheduledThreadPool.shutdownNow();
                    }
                }
            }
            parseInt = 1;
            f7361b = parseInt;
            if (!f7360a) {
            }
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m63a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f7360a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f7363d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}