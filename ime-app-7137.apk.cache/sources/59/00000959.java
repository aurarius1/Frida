package p183e.p184a.p190p.p194d;

import java.util.concurrent.CountDownLatch;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p200h.AbstractC2262d;

/* renamed from: e.a.p.d.d */
/* loaded from: classes.dex */
public final class C2156d extends CountDownLatch implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public Object f7047b;

    /* renamed from: c */
    public Throwable f7048c;

    /* renamed from: d */
    public InterfaceC2112c f7049d;

    /* renamed from: e */
    public volatile boolean f7050e;

    public C2156d() {
        super(1);
    }

    /* renamed from: a */
    public final Object m106a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                mo35e();
                throw AbstractC2262d.m53a(e);
            }
        }
        Throwable th = this.f7048c;
        if (th == null) {
            return this.f7047b;
        }
        throw AbstractC2262d.m53a(th);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (this.f7047b == null) {
            this.f7048c = th;
        }
        countDown();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public final void mo27c(InterfaceC2112c interfaceC2112c) {
        this.f7049d = interfaceC2112c;
        if (this.f7050e) {
            interfaceC2112c.mo35e();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public final void mo26d() {
        countDown();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public final void mo35e() {
        this.f7050e = true;
        InterfaceC2112c interfaceC2112c = this.f7049d;
        if (interfaceC2112c != null) {
            interfaceC2112c.mo35e();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7047b == null) {
            this.f7047b = obj;
            this.f7049d.mo35e();
            countDown();
        }
    }
}