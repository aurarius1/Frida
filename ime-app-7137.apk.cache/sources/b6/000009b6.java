package p183e.p184a.p190p.p199g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.InterfaceC2130b;

/* renamed from: e.a.p.g.n */
/* loaded from: classes.dex */
public final class RunnableC2249n extends AtomicReferenceArray implements Runnable, Callable, InterfaceC2112c {

    /* renamed from: b */
    public static final Object f7355b = new Object();

    /* renamed from: c */
    public static final Object f7356c = new Object();

    /* renamed from: d */
    public static final Object f7357d = new Object();

    /* renamed from: e */
    public static final Object f7358e = new Object();

    /* renamed from: f */
    public final Runnable f7359f;

    public RunnableC2249n(Runnable runnable, InterfaceC2130b interfaceC2130b) {
        super(3);
        this.f7359f = runnable;
        lazySet(0, interfaceC2130b);
    }

    /* renamed from: a */
    public void m64a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f7358e) {
                return;
            }
            if (obj == f7356c) {
                future.cancel(false);
                return;
            } else if (obj == f7357d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f7358e || obj5 == (obj3 = f7356c) || obj5 == (obj4 = f7357d)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f7358e || obj == (obj2 = f7355b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC2130b) obj).mo119a(this);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[IF, SGET, INVOKE, IF, SGET, IF, INVOKE, SGET, CHECK_CAST, INVOKE, IF, SGET, INVOKE, IF, SGET, IF, INVOKE, SGET, IF, IF, SGET, INVOKE, IF, SGET, IF, INVOKE, SGET, IF, SGET, INVOKE, IF, SGET, INVOKE, IF, SGET, IF, INVOKE, SGET, IF, INVOKE, INVOKE, SGET, MOVE_EXCEPTION, INVOKE, IF, SGET, INVOKE, IF, SGET, IF, INVOKE, SGET, CHECK_CAST, INVOKE, IF, SGET, INVOKE, IF, SGET, IF, INVOKE, SGET, IF, IF, SGET, INVOKE, IF, SGET, IF, INVOKE, SGET, IF, SGET, INVOKE, IF, SGET, INVOKE, IF, SGET, IF, INVOKE, SGET, IF, INVOKE, INVOKE, SGET, MOVE_EXCEPTION] complete} */
    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f7359f.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f7355b) {
                    ((InterfaceC2130b) obj4).mo119a(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f7356c) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj5, f7358e));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f7355b && compareAndSet(0, obj4, f7358e) && obj4 != null) {
            ((InterfaceC2130b) obj4).mo119a(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f7356c || obj5 == f7357d) {
                return;
            }
        } while (!compareAndSet(1, obj5, f7358e));
    }
}