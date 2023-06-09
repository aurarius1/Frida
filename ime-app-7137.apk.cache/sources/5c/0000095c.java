package p183e.p184a.p190p.p194d;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.d.g */
/* loaded from: classes.dex */
public final class C2159g extends AtomicReference implements InterfaceC2103k, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2123e f7057b;

    /* renamed from: c */
    public final InterfaceC2123e f7058c;

    public C2159g(InterfaceC2123e interfaceC2123e, InterfaceC2123e interfaceC2123e2) {
        this.f7057b = interfaceC2123e;
        this.f7058c = interfaceC2123e2;
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: a */
    public void mo73a(Object obj) {
        lazySet(EnumC2131c.DISPOSED);
        try {
            this.f7057b.accept(obj);
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            AbstractC1438d.m1044f(th);
        }
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: b */
    public void mo72b(Throwable th) {
        lazySet(EnumC2131c.DISPOSED);
        try {
            this.f7058c.accept(th);
        } catch (Throwable th2) {
            AbstractC1438d.m1039k(th2);
            AbstractC1438d.m1044f(new CompositeException(th, th2));
        }
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: c */
    public void mo71c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m122c(this, interfaceC2112c);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        EnumC2131c.m124a(this);
    }
}