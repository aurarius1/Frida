package p183e.p184a.p190p.p199g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: e.a.p.g.m */
/* loaded from: classes.dex */
public final class CallableC2248m extends AtomicReference implements Callable, InterfaceC2112c {

    /* renamed from: b */
    public static final FutureTask f7351b;

    /* renamed from: c */
    public static final FutureTask f7352c;

    /* renamed from: d */
    public final Runnable f7353d;

    /* renamed from: e */
    public Thread f7354e;

    static {
        Runnable runnable = AbstractC2146l.f7037b;
        f7351b = new FutureTask(runnable, null);
        f7352c = new FutureTask(runnable, null);
    }

    public CallableC2248m(Runnable runnable) {
        this.f7353d = runnable;
    }

    /* renamed from: a */
    public final void m65a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f7351b) {
                return;
            }
            if (future2 == f7352c) {
                future.cancel(this.f7354e != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        this.f7354e = Thread.currentThread();
        try {
            this.f7353d.run();
            return null;
        } finally {
            lazySet(f7351b);
            this.f7354e = null;
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public final void mo35e() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f7351b || future == (futureTask = f7352c) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f7354e != Thread.currentThread());
    }
}