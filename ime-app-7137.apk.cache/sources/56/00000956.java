package p183e.p184a.p190p.p194d;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p193c.InterfaceC2149a;

/* renamed from: e.a.p.d.a */
/* loaded from: classes.dex */
public abstract class AbstractC2153a implements InterfaceC2098f, InterfaceC2149a {

    /* renamed from: b */
    public final InterfaceC2098f f7042b;

    /* renamed from: c */
    public InterfaceC2112c f7043c;

    /* renamed from: d */
    public InterfaceC2149a f7044d;

    /* renamed from: e */
    public boolean f7045e;

    /* renamed from: f */
    public int f7046f;

    public AbstractC2153a(InterfaceC2098f interfaceC2098f) {
        this.f7042b = interfaceC2098f;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (this.f7045e) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7045e = true;
        this.f7042b.mo28b(th);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public final void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7043c, interfaceC2112c)) {
            this.f7043c = interfaceC2112c;
            if (interfaceC2112c instanceof InterfaceC2149a) {
                this.f7044d = (InterfaceC2149a) interfaceC2112c;
            }
            this.f7042b.mo27c(this);
        }
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
        this.f7044d.clear();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (this.f7045e) {
            return;
        }
        this.f7045e = true;
        this.f7042b.mo26d();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7043c.mo35e();
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: f */
    public final boolean mo68f(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* renamed from: i */
    public final void m108i(Throwable th) {
        AbstractC1438d.m1039k(th);
        this.f7043c.mo35e();
        mo28b(th);
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return this.f7044d.isEmpty();
    }

    /* renamed from: j */
    public final int m107j(int i) {
        InterfaceC2149a interfaceC2149a = this.f7044d;
        if (interfaceC2149a == null || (i & 4) != 0) {
            return 0;
        }
        int mo74h = interfaceC2149a.mo74h(i);
        if (mo74h != 0) {
            this.f7046f = mo74h;
        }
        return mo74h;
    }
}