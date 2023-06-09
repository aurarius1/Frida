package p183e.p184a.p190p.p195e.p196a;

import io.reactivex.exceptions.CompositeException;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.m0 */
/* loaded from: classes.dex */
public final class C2198m0 implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7188b;

    /* renamed from: c */
    public final InterfaceC2127i f7189c;

    /* renamed from: d */
    public InterfaceC2112c f7190d;

    public C2198m0(InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i) {
        this.f7188b = interfaceC2098f;
        this.f7189c = interfaceC2127i;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        try {
            Object mo24a = this.f7189c.mo24a(th);
            if (mo24a != null) {
                this.f7188b.mo25g(mo24a);
                this.f7188b.mo26d();
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
            nullPointerException.initCause(th);
            this.f7188b.mo28b(nullPointerException);
        } catch (Throwable th2) {
            AbstractC1438d.m1039k(th2);
            this.f7188b.mo28b(new CompositeException(th, th2));
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7190d, interfaceC2112c)) {
            this.f7190d = interfaceC2112c;
            this.f7188b.mo27c(this);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7188b.mo26d();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7190d.mo35e();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7188b.mo25g(obj);
    }
}