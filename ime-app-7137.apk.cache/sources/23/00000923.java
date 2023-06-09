package p183e.p184a;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p194d.C2157e;
import p183e.p184a.p190p.p194d.C2159g;
import p183e.p184a.p190p.p195e.p197b.C2227c;
import p183e.p184a.p190p.p200h.AbstractC2262d;

/* renamed from: e.a.j */
/* loaded from: classes.dex */
public abstract class AbstractC2102j {
    /* renamed from: a */
    public final Object m136a() {
        C2157e c2157e = new C2157e();
        m133d(c2157e);
        if (c2157e.getCount() != 0) {
            try {
                c2157e.await();
            } catch (InterruptedException e) {
                c2157e.f7054e = true;
                InterfaceC2112c interfaceC2112c = c2157e.f7053d;
                if (interfaceC2112c != null) {
                    interfaceC2112c.mo35e();
                }
                throw AbstractC2262d.m53a(e);
            }
        }
        Throwable th = c2157e.f7052c;
        if (th == null) {
            return c2157e.f7051b;
        }
        throw AbstractC2262d.m53a(th);
    }

    /* renamed from: b */
    public final AbstractC2102j m135b(InterfaceC2127i interfaceC2127i) {
        return new C2227c(this, interfaceC2127i);
    }

    /* renamed from: c */
    public final InterfaceC2112c m134c(InterfaceC2123e interfaceC2123e, InterfaceC2123e interfaceC2123e2) {
        C2159g c2159g = new C2159g(interfaceC2123e, interfaceC2123e2);
        m133d(c2159g);
        return c2159g;
    }

    /* renamed from: d */
    public final void m133d(InterfaceC2103k interfaceC2103k) {
        try {
            mo70e(interfaceC2103k);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public abstract void mo70e(InterfaceC2103k interfaceC2103k);
}