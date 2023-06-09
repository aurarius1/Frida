package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p200h.AbstractC2262d;
import p183e.p184a.p201q.AbstractC2266a;

/* renamed from: e.a.p.e.a.r0 */
/* loaded from: classes.dex */
public final class C2208r0 extends AbstractC2266a {

    /* renamed from: b */
    public final InterfaceC2097e f7213b;

    /* renamed from: c */
    public final AtomicReference f7214c;

    /* renamed from: d */
    public final InterfaceC2097e f7215d;

    public C2208r0(InterfaceC2097e interfaceC2097e, InterfaceC2097e interfaceC2097e2, AtomicReference atomicReference) {
        this.f7215d = interfaceC2097e;
        this.f7213b = interfaceC2097e2;
        this.f7214c = atomicReference;
    }

    /* renamed from: V */
    public static AbstractC2266a m87V(InterfaceC2097e interfaceC2097e) {
        AtomicReference atomicReference = new AtomicReference();
        return new C2208r0(new C2206q0(atomicReference), interfaceC2097e, atomicReference);
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        this.f7215d.mo89a(interfaceC2098f);
    }

    @Override // p183e.p184a.p201q.AbstractC2266a
    /* renamed from: T */
    public void mo42T(InterfaceC2123e interfaceC2123e) {
        C2204p0 c2204p0;
        boolean z;
        while (true) {
            c2204p0 = (C2204p0) this.f7214c.get();
            z = true;
            if (c2204p0 != null) {
                if (!(c2204p0.f7203e.get() == C2204p0.f7201c)) {
                    break;
                }
            }
            C2204p0 c2204p02 = new C2204p0(this.f7214c);
            if (this.f7214c.compareAndSet(c2204p0, c2204p02)) {
                c2204p0 = c2204p02;
                break;
            }
        }
        z = (c2204p0.f7204f.get() || !c2204p0.f7204f.compareAndSet(false, true)) ? false : false;
        try {
            ((RunnableC2216v0) interfaceC2123e).accept(c2204p0);
            if (z) {
                this.f7213b.mo89a(c2204p0);
            }
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            throw AbstractC2262d.m53a(th);
        }
    }
}