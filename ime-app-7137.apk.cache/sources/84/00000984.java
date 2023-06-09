package p183e.p184a.p190p.p195e.p196a;

import java.util.Collection;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p194d.AbstractC2153a;

/* renamed from: e.a.p.e.a.n */
/* loaded from: classes.dex */
public final class C2199n extends AbstractC2153a {

    /* renamed from: g */
    public final Collection f7191g;

    /* renamed from: h */
    public final InterfaceC2127i f7192h;

    public C2199n(InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i, Collection collection) {
        super(interfaceC2098f);
        this.f7192h = interfaceC2127i;
        this.f7191g = collection;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        Object mo69a;
        Collection collection;
        Object mo24a;
        do {
            mo69a = this.f7044d.mo69a();
            if (mo69a == null) {
                break;
            }
            collection = this.f7191g;
            mo24a = this.f7192h.mo24a(mo69a);
            AbstractC2148n.m110a(mo24a, "The keySelector returned a null key");
        } while (!collection.add(mo24a));
        return mo69a;
    }

    @Override // p183e.p184a.p190p.p194d.AbstractC2153a, p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (this.f7045e) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7045e = true;
        this.f7191g.clear();
        this.f7042b.mo28b(th);
    }

    @Override // p183e.p184a.p190p.p194d.AbstractC2153a, p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
        this.f7191g.clear();
        super.clear();
    }

    @Override // p183e.p184a.p190p.p194d.AbstractC2153a, p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (this.f7045e) {
            return;
        }
        this.f7045e = true;
        this.f7191g.clear();
        this.f7042b.mo26d();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7045e) {
            return;
        }
        if (this.f7046f != 0) {
            this.f7042b.mo25g(null);
            return;
        }
        try {
            Object mo24a = this.f7192h.mo24a(obj);
            AbstractC2148n.m110a(mo24a, "The keySelector returned a null key");
            if (this.f7191g.add(mo24a)) {
                this.f7042b.mo25g(obj);
            }
        } catch (Throwable th) {
            m108i(th);
        }
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2149a
    /* renamed from: h */
    public int mo74h(int i) {
        return m107j(i);
    }
}