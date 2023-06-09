package p183e.p184a.p187m;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p190p.p191a.InterfaceC2130b;
import p183e.p184a.p190p.p199g.RunnableC2249n;
import p183e.p184a.p190p.p200h.AbstractC2262d;
import p183e.p184a.p190p.p200h.C2265g;

/* renamed from: e.a.m.b */
/* loaded from: classes.dex */
public final class C2111b implements InterfaceC2112c, InterfaceC2130b {

    /* renamed from: b */
    public C2265g f7018b;

    /* renamed from: c */
    public volatile boolean f7019c;

    @Override // p183e.p184a.p190p.p191a.InterfaceC2130b
    /* renamed from: a */
    public boolean mo119a(InterfaceC2112c interfaceC2112c) {
        if (interfaceC2112c != null) {
            if (this.f7019c) {
                return false;
            }
            synchronized (this) {
                if (this.f7019c) {
                    return false;
                }
                C2265g c2265g = this.f7018b;
                if (c2265g != null && c2265g.m44d(interfaceC2112c)) {
                    return true;
                }
                return false;
            }
        }
        throw new NullPointerException("disposables is null");
    }

    @Override // p183e.p184a.p190p.p191a.InterfaceC2130b
    /* renamed from: b */
    public boolean mo118b(InterfaceC2112c interfaceC2112c) {
        if (mo119a(interfaceC2112c)) {
            ((RunnableC2249n) interfaceC2112c).mo35e();
            return true;
        }
        return false;
    }

    @Override // p183e.p184a.p190p.p191a.InterfaceC2130b
    /* renamed from: c */
    public boolean mo117c(InterfaceC2112c interfaceC2112c) {
        if (interfaceC2112c != null) {
            if (!this.f7019c) {
                synchronized (this) {
                    if (!this.f7019c) {
                        C2265g c2265g = this.f7018b;
                        if (c2265g == null) {
                            c2265g = new C2265g();
                            this.f7018b = c2265g;
                        }
                        c2265g.m47a(interfaceC2112c);
                        return true;
                    }
                }
            }
            interfaceC2112c.mo35e();
            return false;
        }
        throw new NullPointerException("disposable is null");
    }

    /* renamed from: d */
    public void m132d() {
        if (this.f7019c) {
            return;
        }
        synchronized (this) {
            if (this.f7019c) {
                return;
            }
            C2265g c2265g = this.f7018b;
            this.f7018b = null;
            m131f(c2265g);
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7019c) {
            return;
        }
        synchronized (this) {
            if (this.f7019c) {
                return;
            }
            this.f7019c = true;
            C2265g c2265g = this.f7018b;
            this.f7018b = null;
            m131f(c2265g);
        }
    }

    /* renamed from: f */
    public void m131f(C2265g c2265g) {
        Object[] m46b;
        if (c2265g == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c2265g.m46b()) {
            if (obj instanceof InterfaceC2112c) {
                try {
                    ((InterfaceC2112c) obj).mo35e();
                } catch (Throwable th) {
                    AbstractC1438d.m1039k(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw AbstractC2262d.m53a((Throwable) arrayList.get(0));
        }
    }
}