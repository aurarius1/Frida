package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.Callable;
import p183e.p184a.AbstractC2102j;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p189o.InterfaceC2120b;
import p183e.p184a.p190p.p191a.EnumC2132d;
import p183e.p184a.p190p.p192b.AbstractC2148n;

/* renamed from: e.a.p.e.a.e */
/* loaded from: classes.dex */
public final class C2174e extends AbstractC2102j {

    /* renamed from: a */
    public final InterfaceC2097e f7099a;

    /* renamed from: b */
    public final Callable f7100b;

    /* renamed from: c */
    public final InterfaceC2120b f7101c;

    public C2174e(InterfaceC2097e interfaceC2097e, Callable callable, InterfaceC2120b interfaceC2120b) {
        this.f7099a = interfaceC2097e;
        this.f7100b = callable;
        this.f7101c = interfaceC2120b;
    }

    @Override // p183e.p184a.AbstractC2102j
    /* renamed from: e */
    public void mo70e(InterfaceC2103k interfaceC2103k) {
        try {
            Object call = this.f7100b.call();
            AbstractC2148n.m110a(call, "The initialSupplier returned a null value");
            this.f7099a.mo89a(new C2171d(interfaceC2103k, call, this.f7101c));
        } catch (Throwable th) {
            interfaceC2103k.mo71c(EnumC2132d.INSTANCE);
            interfaceC2103k.mo72b(th);
        }
    }
}