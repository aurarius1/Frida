package p183e.p184a.p190p.p194d;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.d.h */
/* loaded from: classes.dex */
public final class C2160h implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7059b;

    /* renamed from: c */
    public final InterfaceC2123e f7060c;

    /* renamed from: d */
    public final InterfaceC2119a f7061d;

    /* renamed from: e */
    public InterfaceC2112c f7062e;

    public C2160h(InterfaceC2098f interfaceC2098f, InterfaceC2123e interfaceC2123e, InterfaceC2119a interfaceC2119a) {
        this.f7059b = interfaceC2098f;
        this.f7060c = interfaceC2123e;
        this.f7061d = interfaceC2119a;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        InterfaceC2112c interfaceC2112c = this.f7062e;
        EnumC2131c enumC2131c = EnumC2131c.DISPOSED;
        if (interfaceC2112c == enumC2131c) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7062e = enumC2131c;
        this.f7059b.mo28b(th);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        try {
            this.f7060c.accept(interfaceC2112c);
            if (EnumC2131c.m121d(this.f7062e, interfaceC2112c)) {
                this.f7062e = interfaceC2112c;
                this.f7059b.mo27c(this);
            }
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            interfaceC2112c.mo35e();
            this.f7062e = EnumC2131c.DISPOSED;
            EnumC2132d.m120b(th, this.f7059b);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        InterfaceC2112c interfaceC2112c = this.f7062e;
        EnumC2131c enumC2131c = EnumC2131c.DISPOSED;
        if (interfaceC2112c != enumC2131c) {
            this.f7062e = enumC2131c;
            this.f7059b.mo26d();
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        InterfaceC2112c interfaceC2112c = this.f7062e;
        EnumC2131c enumC2131c = EnumC2131c.DISPOSED;
        if (interfaceC2112c != enumC2131c) {
            this.f7062e = enumC2131c;
            try {
                this.f7061d.run();
            } catch (Throwable th) {
                AbstractC1438d.m1039k(th);
                AbstractC1438d.m1044f(th);
            }
            interfaceC2112c.mo35e();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7059b.mo25g(obj);
    }
}