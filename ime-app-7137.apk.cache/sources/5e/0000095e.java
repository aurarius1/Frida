package p183e.p184a.p190p.p194d;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.d.i */
/* loaded from: classes.dex */
public final class C2161i extends AtomicReference implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2123e f7063b;

    /* renamed from: c */
    public final InterfaceC2123e f7064c;

    /* renamed from: d */
    public final InterfaceC2119a f7065d;

    /* renamed from: e */
    public final InterfaceC2123e f7066e;

    public C2161i(InterfaceC2123e interfaceC2123e, InterfaceC2123e interfaceC2123e2, InterfaceC2119a interfaceC2119a, InterfaceC2123e interfaceC2123e3) {
        this.f7063b = interfaceC2123e;
        this.f7064c = interfaceC2123e2;
        this.f7065d = interfaceC2119a;
        this.f7066e = interfaceC2123e3;
    }

    /* renamed from: a */
    public boolean m105a() {
        return get() == EnumC2131c.DISPOSED;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (m105a()) {
            AbstractC1438d.m1044f(th);
            return;
        }
        lazySet(EnumC2131c.DISPOSED);
        try {
            this.f7064c.accept(th);
        } catch (Throwable th2) {
            AbstractC1438d.m1039k(th2);
            AbstractC1438d.m1044f(new CompositeException(th, th2));
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m122c(this, interfaceC2112c)) {
            try {
                this.f7066e.accept(this);
            } catch (Throwable th) {
                AbstractC1438d.m1039k(th);
                interfaceC2112c.mo35e();
                mo28b(th);
            }
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (m105a()) {
            return;
        }
        lazySet(EnumC2131c.DISPOSED);
        try {
            this.f7065d.run();
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            AbstractC1438d.m1044f(th);
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        EnumC2131c.m124a(this);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (m105a()) {
            return;
        }
        try {
            this.f7063b.accept(obj);
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            ((InterfaceC2112c) get()).mo35e();
            mo28b(th);
        }
    }
}