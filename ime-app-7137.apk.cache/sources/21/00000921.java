package p183e.p184a;

import java.util.concurrent.TimeUnit;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.h */
/* loaded from: classes.dex */
public abstract class AbstractC2100h implements InterfaceC2112c {
    /* renamed from: a */
    public long m137a(TimeUnit timeUnit) {
        long nanoTime;
        TimeUnit timeUnit2;
        if (AbstractC2101i.f7008a) {
            nanoTime = System.nanoTime();
            timeUnit2 = TimeUnit.NANOSECONDS;
        } else {
            nanoTime = System.currentTimeMillis();
            timeUnit2 = TimeUnit.MILLISECONDS;
        }
        return timeUnit.convert(nanoTime, timeUnit2);
    }

    /* renamed from: b */
    public InterfaceC2112c mo62b(Runnable runnable) {
        return mo61c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public abstract InterfaceC2112c mo61c(Runnable runnable, long j, TimeUnit timeUnit);
}