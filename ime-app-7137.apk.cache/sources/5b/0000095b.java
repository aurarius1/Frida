package p183e.p184a.p190p.p194d;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p200h.C2263e;
import p183e.p184a.p190p.p200h.EnumC2264f;

/* renamed from: e.a.p.d.f */
/* loaded from: classes.dex */
public final class C2158f extends AtomicReference implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public static final Object f7055b = new Object();

    /* renamed from: c */
    public final Queue f7056c;

    public C2158f(Queue queue) {
        this.f7056c = queue;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        this.f7056c.offer(new C2263e(th));
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m122c(this, interfaceC2112c);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7056c.offer(EnumC2264f.COMPLETE);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (EnumC2131c.m124a(this)) {
            this.f7056c.offer(f7055b);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7056c.offer(obj);
    }
}