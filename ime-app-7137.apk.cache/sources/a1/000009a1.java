package p183e.p184a.p190p.p195e.p197b;

import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.b.d */
/* loaded from: classes.dex */
public final class RunnableC2228d extends AtomicReference implements InterfaceC2103k, InterfaceC2112c, Runnable {

    /* renamed from: b */
    public final InterfaceC2103k f7279b;

    /* renamed from: c */
    public final AbstractC2101i f7280c;

    /* renamed from: d */
    public Object f7281d;

    /* renamed from: e */
    public Throwable f7282e;

    public RunnableC2228d(InterfaceC2103k interfaceC2103k, AbstractC2101i abstractC2101i) {
        this.f7279b = interfaceC2103k;
        this.f7280c = abstractC2101i;
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: a */
    public void mo73a(Object obj) {
        this.f7281d = obj;
        EnumC2131c.m123b(this, this.f7280c.mo58b(this));
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: b */
    public void mo72b(Throwable th) {
        this.f7282e = th;
        EnumC2131c.m123b(this, this.f7280c.mo58b(this));
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: c */
    public void mo71c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m122c(this, interfaceC2112c)) {
            this.f7279b.mo71c(this);
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        EnumC2131c.m124a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.f7282e;
        if (th != null) {
            this.f7279b.mo72b(th);
        } else {
            this.f7279b.mo73a(this.f7281d);
        }
    }
}