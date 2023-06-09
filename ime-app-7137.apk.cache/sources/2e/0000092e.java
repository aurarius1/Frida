package p183e.p184a.p187m;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.a.m.d */
/* loaded from: classes.dex */
public abstract class AbstractC2113d extends AtomicReference implements InterfaceC2112c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2113d(Object obj) {
        super(obj);
        if (obj == null) {
            throw new NullPointerException("value is null");
        }
    }

    /* renamed from: a */
    public abstract void mo130a(Object obj);

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public final void mo35e() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo130a(andSet);
    }
}