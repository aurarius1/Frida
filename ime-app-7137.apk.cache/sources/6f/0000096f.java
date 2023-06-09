package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p190p.p193c.InterfaceCallableC2150b;

/* renamed from: e.a.p.e.a.f0 */
/* loaded from: classes.dex */
public final class C2178f0 extends AbstractC2094b implements InterfaceCallableC2150b {

    /* renamed from: b */
    public final Object f7108b;

    public C2178f0(Object obj) {
        this.f7108b = obj;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        RunnableC2222y0 runnableC2222y0 = new RunnableC2222y0(interfaceC2098f, this.f7108b);
        interfaceC2098f.mo27c(runnableC2222y0);
        runnableC2222y0.run();
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceCallableC2150b, java.util.concurrent.Callable
    public Object call() {
        return this.f7108b;
    }
}