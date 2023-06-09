package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2095c;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2122d;
import p183e.p184a.p190p.p191a.C2129a;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.l */
/* loaded from: classes.dex */
public final class C2195l extends AtomicReference implements InterfaceC2095c, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7183b;

    public C2195l(InterfaceC2098f interfaceC2098f) {
        this.f7183b = interfaceC2098f;
    }

    /* renamed from: a */
    public boolean m94a() {
        return ((InterfaceC2112c) get()) == EnumC2131c.DISPOSED;
    }

    /* renamed from: b */
    public void m93b(Throwable th) {
        boolean z;
        if (m94a()) {
            z = false;
        } else {
            try {
                this.f7183b.mo28b(th);
                EnumC2131c.m124a(this);
                z = true;
            } catch (Throwable th2) {
                EnumC2131c.m124a(this);
                throw th2;
            }
        }
        if (z) {
            return;
        }
        AbstractC1438d.m1044f(th);
    }

    /* renamed from: c */
    public void m92c(Object obj) {
        if (obj == null) {
            m93b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (m94a()) {
        } else {
            this.f7183b.mo25g(obj);
        }
    }

    /* renamed from: d */
    public void m91d(InterfaceC2122d interfaceC2122d) {
        InterfaceC2112c interfaceC2112c;
        C2129a c2129a = new C2129a(interfaceC2122d);
        do {
            interfaceC2112c = (InterfaceC2112c) get();
            if (interfaceC2112c == EnumC2131c.DISPOSED) {
                c2129a.mo35e();
                return;
            }
        } while (!compareAndSet(interfaceC2112c, c2129a));
        if (interfaceC2112c != null) {
            interfaceC2112c.mo35e();
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        EnumC2131c.m124a(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return String.format("%s{%s}", C2195l.class.getSimpleName(), super.toString());
    }
}