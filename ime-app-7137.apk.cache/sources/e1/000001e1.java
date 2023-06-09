package p010b.p027d.p028a.p029a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b.d.a.a.b */
/* loaded from: classes.dex */
public class ThreadFactoryC0349b implements ThreadFactory {

    /* renamed from: b */
    public final AtomicInteger f1842b = new AtomicInteger(0);

    public ThreadFactoryC0349b(C0350c c0350c) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f1842b.getAndIncrement())));
        return thread;
    }
}