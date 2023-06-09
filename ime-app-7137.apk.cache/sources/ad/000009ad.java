package p183e.p184a.p190p.p199g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p183e.p184a.p187m.C2111b;

/* renamed from: e.a.p.g.e */
/* loaded from: classes.dex */
public final class RunnableC2240e implements Runnable {

    /* renamed from: b */
    public final long f7324b;

    /* renamed from: c */
    public final ConcurrentLinkedQueue f7325c;

    /* renamed from: d */
    public final C2111b f7326d;

    /* renamed from: e */
    public final ScheduledExecutorService f7327e;

    /* renamed from: f */
    public final Future f7328f;

    /* renamed from: g */
    public final ThreadFactory f7329g;

    public RunnableC2240e(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFuture;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.f7324b = nanos;
        this.f7325c = new ConcurrentLinkedQueue();
        this.f7326d = new C2111b();
        this.f7329g = threadFactory;
        ScheduledExecutorService scheduledExecutorService = null;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, C2243h.f7336c);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledFuture = null;
        }
        this.f7327e = scheduledExecutorService;
        this.f7328f = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7325c.isEmpty()) {
            return;
        }
        long nanoTime = System.nanoTime();
        Iterator it = this.f7325c.iterator();
        while (it.hasNext()) {
            C2242g c2242g = (C2242g) it.next();
            if (c2242g.f7334d > nanoTime) {
                return;
            }
            if (this.f7325c.remove(c2242g) && this.f7326d.mo119a(c2242g)) {
                c2242g.mo35e();
            }
        }
    }
}