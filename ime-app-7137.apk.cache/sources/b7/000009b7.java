package p183e.p184a.p190p.p199g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: e.a.p.g.o */
/* loaded from: classes.dex */
public final class RunnableC2250o implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Iterator it = new ArrayList(AbstractC2251p.f7363d.keySet()).iterator();
        while (it.hasNext()) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
            if (scheduledThreadPoolExecutor.isShutdown()) {
                AbstractC2251p.f7363d.remove(scheduledThreadPoolExecutor);
            } else {
                scheduledThreadPoolExecutor.purge();
            }
        }
    }
}