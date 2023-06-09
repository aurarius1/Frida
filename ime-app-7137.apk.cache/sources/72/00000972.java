package p183e.p184a.p190p.p195e.p196a;

import java.util.NoSuchElementException;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.g0 */
/* loaded from: classes.dex */
public final class C2181g0 implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2103k f7121b;

    /* renamed from: c */
    public final Object f7122c;

    /* renamed from: d */
    public InterfaceC2112c f7123d;

    /* renamed from: e */
    public Object f7124e;

    public C2181g0(InterfaceC2103k interfaceC2103k, Object obj) {
        this.f7121b = interfaceC2103k;
        this.f7122c = obj;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        this.f7123d = EnumC2131c.DISPOSED;
        this.f7124e = null;
        this.f7121b.mo72b(th);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7123d, interfaceC2112c)) {
            this.f7123d = interfaceC2112c;
            this.f7121b.mo71c(this);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7123d = EnumC2131c.DISPOSED;
        Object obj = this.f7124e;
        if (obj != null) {
            this.f7124e = null;
        } else {
            obj = this.f7122c;
            if (obj == null) {
                this.f7121b.mo72b(new NoSuchElementException());
                return;
            }
        }
        this.f7121b.mo73a(obj);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7123d.mo35e();
        this.f7123d = EnumC2131c.DISPOSED;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        this.f7124e = obj;
    }
}