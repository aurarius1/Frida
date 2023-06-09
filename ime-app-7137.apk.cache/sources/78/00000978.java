package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p194d.AbstractC2153a;

/* renamed from: e.a.p.e.a.i0 */
/* loaded from: classes.dex */
public final class C2187i0 extends AbstractC2153a {

    /* renamed from: g */
    public final InterfaceC2127i f7141g;

    public C2187i0(InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i) {
        super(interfaceC2098f);
        this.f7141g = interfaceC2127i;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        Object mo69a = this.f7044d.mo69a();
        if (mo69a != null) {
            Object mo24a = this.f7141g.mo24a(mo69a);
            AbstractC2148n.m110a(mo24a, "The mapper function returned a null value.");
            return mo24a;
        }
        return null;
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
            Object mo24a = this.f7141g.mo24a(obj);
            AbstractC2148n.m110a(mo24a, "The mapper function returned a null value.");
            this.f7042b.mo25g(mo24a);
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