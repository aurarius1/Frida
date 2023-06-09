package p183e.p184a.p190p.p195e.p196a;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2120b;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.d */
/* loaded from: classes.dex */
public final class C2171d implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2103k f7092b;

    /* renamed from: c */
    public final InterfaceC2120b f7093c;

    /* renamed from: d */
    public final Object f7094d;

    /* renamed from: e */
    public InterfaceC2112c f7095e;

    /* renamed from: f */
    public boolean f7096f;

    public C2171d(InterfaceC2103k interfaceC2103k, Object obj, InterfaceC2120b interfaceC2120b) {
        this.f7092b = interfaceC2103k;
        this.f7093c = interfaceC2120b;
        this.f7094d = obj;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (this.f7096f) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7096f = true;
        this.f7092b.mo72b(th);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7095e, interfaceC2112c)) {
            this.f7095e = interfaceC2112c;
            this.f7092b.mo71c(this);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (this.f7096f) {
            return;
        }
        this.f7096f = true;
        this.f7092b.mo73a(this.f7094d);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7095e.mo35e();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7096f) {
            return;
        }
        try {
            this.f7093c.mo128a(this.f7094d, obj);
        } catch (Throwable th) {
            this.f7095e.mo35e();
            mo28b(th);
        }
    }
}