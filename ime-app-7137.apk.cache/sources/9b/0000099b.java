package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicInteger;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p190p.p193c.InterfaceC2149a;

/* renamed from: e.a.p.e.a.y0 */
/* loaded from: classes.dex */
public final class RunnableC2222y0 extends AtomicInteger implements InterfaceC2149a, Runnable {

    /* renamed from: b */
    public final InterfaceC2098f f7266b;

    /* renamed from: c */
    public final Object f7267c;

    public RunnableC2222y0(InterfaceC2098f interfaceC2098f, Object obj) {
        this.f7266b = interfaceC2098f;
        this.f7267c = obj;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        if (get() == 1) {
            lazySet(3);
            return this.f7267c;
        }
        return null;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
        lazySet(3);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        set(3);
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: f */
    public boolean mo68f(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2149a
    /* renamed from: h */
    public int mo74h(int i) {
        if ((i & 1) != 0) {
            lazySet(1);
            return 1;
        }
        return 0;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return get() != 1;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.f7266b.mo25g(this.f7267c);
            if (get() == 2) {
                lazySet(3);
                this.f7266b.mo26d();
            }
        }
    }
}