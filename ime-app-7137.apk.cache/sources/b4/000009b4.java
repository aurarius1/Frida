package p183e.p184a.p190p.p199g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: e.a.p.g.l */
/* loaded from: classes.dex */
public final class ThreadFactoryC2247l extends AtomicLong implements ThreadFactory {

    /* renamed from: b */
    public final String f7348b;

    /* renamed from: c */
    public final int f7349c;

    /* renamed from: d */
    public final boolean f7350d;

    public ThreadFactoryC2247l(String str) {
        this.f7348b = str;
        this.f7349c = 5;
        this.f7350d = false;
    }

    public ThreadFactoryC2247l(String str, int i, boolean z) {
        this.f7348b = str;
        this.f7349c = i;
        this.f7350d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f7348b + '-' + incrementAndGet();
        Thread c2246k = this.f7350d ? new C2246k(runnable, str) : new Thread(runnable, str);
        c2246k.setPriority(this.f7349c);
        c2246k.setDaemon(true);
        return c2246k;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("RxThreadFactory[");
        m1187i.append(this.f7348b);
        m1187i.append("]");
        return m1187i.toString();
    }

    public ThreadFactoryC2247l(String str, int i) {
        this.f7348b = str;
        this.f7349c = i;
        this.f7350d = false;
    }
}