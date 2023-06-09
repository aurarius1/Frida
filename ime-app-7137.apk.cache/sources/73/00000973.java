package p183e.p184a.p190p.p195e.p196a;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicBoolean;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.g1 */
/* loaded from: classes.dex */
public final class C2182g1 extends AtomicBoolean implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7125b;

    /* renamed from: c */
    public final Object f7126c;

    /* renamed from: d */
    public final InterfaceC2123e f7127d;

    /* renamed from: e */
    public final boolean f7128e;

    /* renamed from: f */
    public InterfaceC2112c f7129f;

    public C2182g1(InterfaceC2098f interfaceC2098f, Object obj, InterfaceC2123e interfaceC2123e, boolean z) {
        this.f7125b = interfaceC2098f;
        this.f7126c = obj;
        this.f7127d = interfaceC2123e;
        this.f7128e = z;
    }

    /* renamed from: a */
    public void m100a() {
        if (compareAndSet(false, true)) {
            try {
                this.f7127d.accept(this.f7126c);
            } catch (Throwable th) {
                AbstractC1438d.m1039k(th);
                AbstractC1438d.m1044f(th);
            }
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (!this.f7128e) {
            this.f7125b.mo28b(th);
            this.f7129f.mo35e();
            m100a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f7127d.accept(this.f7126c);
            } catch (Throwable th2) {
                AbstractC1438d.m1039k(th2);
                th = new CompositeException(th, th2);
            }
        }
        this.f7129f.mo35e();
        this.f7125b.mo28b(th);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7129f, interfaceC2112c)) {
            this.f7129f = interfaceC2112c;
            this.f7125b.mo27c(this);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (!this.f7128e) {
            this.f7125b.mo26d();
            this.f7129f.mo35e();
            m100a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f7127d.accept(this.f7126c);
            } catch (Throwable th) {
                AbstractC1438d.m1039k(th);
                this.f7125b.mo28b(th);
                return;
            }
        }
        this.f7129f.mo35e();
        this.f7125b.mo26d();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        m100a();
        this.f7129f.mo35e();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7125b.mo25g(obj);
    }
}