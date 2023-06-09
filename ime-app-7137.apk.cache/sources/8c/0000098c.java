package p183e.p184a.p190p.p195e.p196a;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p193c.InterfaceC2149a;
import p183e.p184a.p190p.p194d.AbstractC2154b;

/* renamed from: e.a.p.e.a.r */
/* loaded from: classes.dex */
public final class C2207r extends AbstractC2154b implements InterfaceC2098f {

    /* renamed from: b */
    public final InterfaceC2098f f7208b;

    /* renamed from: c */
    public final InterfaceC2119a f7209c;

    /* renamed from: d */
    public InterfaceC2112c f7210d;

    /* renamed from: e */
    public InterfaceC2149a f7211e;

    /* renamed from: f */
    public boolean f7212f;

    public C2207r(InterfaceC2098f interfaceC2098f, InterfaceC2119a interfaceC2119a) {
        this.f7208b = interfaceC2098f;
        this.f7209c = interfaceC2119a;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        Object mo69a = this.f7211e.mo69a();
        if (mo69a == null && this.f7212f) {
            m88i();
        }
        return mo69a;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        this.f7208b.mo28b(th);
        m88i();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7210d, interfaceC2112c)) {
            this.f7210d = interfaceC2112c;
            if (interfaceC2112c instanceof InterfaceC2149a) {
                this.f7211e = (InterfaceC2149a) interfaceC2112c;
            }
            this.f7208b.mo27c(this);
        }
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
        this.f7211e.clear();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7208b.mo26d();
        m88i();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7210d.mo35e();
        m88i();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7208b.mo25g(obj);
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2149a
    /* renamed from: h */
    public int mo74h(int i) {
        InterfaceC2149a interfaceC2149a = this.f7211e;
        if (interfaceC2149a == null || (i & 4) != 0) {
            return 0;
        }
        int mo74h = interfaceC2149a.mo74h(i);
        if (mo74h != 0) {
            this.f7212f = mo74h == 1;
        }
        return mo74h;
    }

    /* renamed from: i */
    public void m88i() {
        if (compareAndSet(0, 1)) {
            try {
                this.f7209c.run();
            } catch (Throwable th) {
                AbstractC1438d.m1039k(th);
                AbstractC1438d.m1044f(th);
            }
        }
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return this.f7211e.isEmpty();
    }
}