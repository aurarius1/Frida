package p183e.p184a.p190p.p199g;

import java.util.concurrent.TimeUnit;
import p093c.p097b.p117q.AbstractC1438d;

/* renamed from: e.a.p.g.s */
/* loaded from: classes.dex */
public final class RunnableC2254s implements Runnable {

    /* renamed from: b */
    public final Runnable f7370b;

    /* renamed from: c */
    public final C2257v f7371c;

    /* renamed from: d */
    public final long f7372d;

    public RunnableC2254s(Runnable runnable, C2257v c2257v, long j) {
        this.f7370b = runnable;
        this.f7371c = c2257v;
        this.f7372d = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7371c.f7382e) {
            return;
        }
        long m137a = this.f7371c.m137a(TimeUnit.MILLISECONDS);
        long j = this.f7372d;
        if (j > m137a) {
            try {
                Thread.sleep(j - m137a);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                AbstractC1438d.m1044f(e);
                return;
            }
        }
        if (this.f7371c.f7382e) {
            return;
        }
        this.f7370b.run();
    }
}