package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.C2147m;
import p183e.p184a.p190p.p194d.AbstractC2153a;

/* renamed from: e.a.p.e.a.p */
/* loaded from: classes.dex */
public final class C2203p extends AbstractC2153a {

    /* renamed from: g */
    public final InterfaceC2127i f7197g;

    /* renamed from: h */
    public Object f7198h;

    /* renamed from: i */
    public boolean f7199i;

    public C2203p(InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i, C2147m c2147m) {
        super(interfaceC2098f);
        this.f7197g = interfaceC2127i;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        Object mo69a;
        boolean z;
        do {
            mo69a = this.f7044d.mo69a();
            if (mo69a == null) {
                return null;
            }
            Object mo24a = this.f7197g.mo24a(mo69a);
            z = true;
            if (!this.f7199i) {
                this.f7199i = true;
                this.f7198h = mo24a;
                return mo69a;
            }
            Object obj = this.f7198h;
            if (obj != mo24a && (obj == null || !obj.equals(mo24a))) {
                z = false;
            }
            this.f7198h = mo24a;
        } while (z);
        return mo69a;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7045e) {
            return;
        }
        if (this.f7046f == 0) {
            try {
                Object mo24a = this.f7197g.mo24a(obj);
                boolean z = true;
                if (this.f7199i) {
                    Object obj2 = this.f7198h;
                    if (obj2 != mo24a && (obj2 == null || !obj2.equals(mo24a))) {
                        z = false;
                    }
                    this.f7198h = mo24a;
                    if (z) {
                        return;
                    }
                } else {
                    this.f7199i = true;
                    this.f7198h = mo24a;
                }
            } catch (Throwable th) {
                m108i(th);
                return;
            }
        }
        this.f7042b.mo25g(obj);
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2149a
    /* renamed from: h */
    public int mo74h(int i) {
        return m107j(i);
    }
}