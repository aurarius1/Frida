package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2128j;
import p183e.p184a.p190p.p194d.AbstractC2153a;

/* renamed from: e.a.p.e.a.v */
/* loaded from: classes.dex */
public final class C2215v extends AbstractC2153a {

    /* renamed from: g */
    public final InterfaceC2128j f7229g;

    public C2215v(InterfaceC2098f interfaceC2098f, InterfaceC2128j interfaceC2128j) {
        super(interfaceC2098f);
        this.f7229g = interfaceC2128j;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        Object mo69a;
        do {
            mo69a = this.f7044d.mo69a();
            if (mo69a == null) {
                break;
            }
        } while (!this.f7229g.mo40a(mo69a));
        return mo69a;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7046f != 0) {
            this.f7042b.mo25g(null);
            return;
        }
        try {
            if (this.f7229g.mo40a(obj)) {
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