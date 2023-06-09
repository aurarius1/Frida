package p183e.p184a;

import java.util.concurrent.TimeUnit;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.i */
/* loaded from: classes.dex */
public abstract class AbstractC2101i {

    /* renamed from: a */
    public static boolean f7008a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    /* renamed from: a */
    public abstract AbstractC2100h mo59a();

    /* renamed from: b */
    public InterfaceC2112c mo58b(Runnable runnable) {
        return mo57c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public InterfaceC2112c mo57c(Runnable runnable, long j, TimeUnit timeUnit) {
        AbstractC2100h mo59a = mo59a();
        if (runnable != null) {
            RunnableC2099g runnableC2099g = new RunnableC2099g(runnable, mo59a);
            mo59a.mo61c(runnableC2099g, j, timeUnit);
            return runnableC2099g;
        }
        throw new NullPointerException("run is null");
    }
}