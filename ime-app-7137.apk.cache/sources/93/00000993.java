package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p200h.AbstractC2262d;
import p183e.p184a.p201q.AbstractC2266a;

/* renamed from: e.a.p.e.a.u0 */
/* loaded from: classes.dex */
public final class C2214u0 extends AbstractC2266a {

    /* renamed from: b */
    public final InterfaceC2097e f7227b;

    /* renamed from: c */
    public final AtomicReference f7228c = new AtomicReference();

    public C2214u0(InterfaceC2097e interfaceC2097e) {
        this.f7227b = interfaceC2097e;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        C2212t0 c2212t0;
        boolean z;
        while (true) {
            c2212t0 = (C2212t0) this.f7228c.get();
            if (c2212t0 != null) {
                break;
            }
            C2212t0 c2212t02 = new C2212t0(this.f7228c);
            if (this.f7228c.compareAndSet(c2212t0, c2212t02)) {
                c2212t0 = c2212t02;
                break;
            }
        }
        C2210s0 c2210s0 = new C2210s0(interfaceC2098f, c2212t0);
        interfaceC2098f.mo27c(c2210s0);
        while (true) {
            C2210s0[] c2210s0Arr = (C2210s0[]) c2212t0.get();
            if (c2210s0Arr != C2212t0.f7221c) {
                int length = c2210s0Arr.length;
                C2210s0[] c2210s0Arr2 = new C2210s0[length + 1];
                System.arraycopy(c2210s0Arr, 0, c2210s0Arr2, 0, length);
                c2210s0Arr2[length] = c2210s0;
                if (c2212t0.compareAndSet(c2210s0Arr, c2210s0Arr2)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            if (c2210s0.get() == null) {
                c2212t0.m86a(c2210s0);
                return;
            }
            return;
        }
        Throwable th = c2212t0.f7225g;
        if (th != null) {
            interfaceC2098f.mo28b(th);
        } else {
            interfaceC2098f.mo26d();
        }
    }

    @Override // p183e.p184a.p201q.AbstractC2266a
    /* renamed from: T */
    public void mo42T(InterfaceC2123e interfaceC2123e) {
        C2212t0 c2212t0;
        boolean z;
        while (true) {
            c2212t0 = (C2212t0) this.f7228c.get();
            z = true;
            if (c2212t0 != null) {
                if (!(c2212t0.get() == C2212t0.f7221c)) {
                    break;
                }
            }
            C2212t0 c2212t02 = new C2212t0(this.f7228c);
            if (this.f7228c.compareAndSet(c2212t0, c2212t02)) {
                c2212t0 = c2212t02;
                break;
            }
        }
        z = (c2212t0.f7222d.get() || !c2212t0.f7222d.compareAndSet(false, true)) ? false : false;
        try {
            ((RunnableC2216v0) interfaceC2123e).accept(c2212t0);
            if (z) {
                this.f7227b.mo89a(c2212t0);
            }
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            throw AbstractC2262d.m53a(th);
        }
    }

    /* renamed from: V */
    public void m85V(InterfaceC2112c interfaceC2112c) {
        this.f7228c.compareAndSet((C2212t0) interfaceC2112c, null);
    }
}