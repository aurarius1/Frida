package p183e.p184a.p190p.p200h;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.a.p.h.b */
/* loaded from: classes.dex */
public final class C2260b extends AtomicReference {
    /* renamed from: a */
    public boolean m55a(Throwable th) {
        Throwable th2;
        Throwable th3 = AbstractC2262d.f7387a;
        do {
            th2 = (Throwable) get();
            if (th2 == AbstractC2262d.f7387a) {
                return false;
            }
        } while (!compareAndSet(th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    /* renamed from: b */
    public Throwable m54b() {
        Throwable th = AbstractC2262d.f7387a;
        Throwable th2 = (Throwable) get();
        Throwable th3 = AbstractC2262d.f7387a;
        return th2 != th3 ? (Throwable) getAndSet(th3) : th2;
    }
}