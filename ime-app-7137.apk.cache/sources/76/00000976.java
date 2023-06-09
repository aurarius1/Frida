package p183e.p184a.p190p.p195e.p196a;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2132d;
import p183e.p184a.p190p.p192b.AbstractC2148n;

/* renamed from: e.a.p.e.a.h1 */
/* loaded from: classes.dex */
public final class C2185h1 extends AbstractC2094b {

    /* renamed from: b */
    public final Callable f7135b;

    /* renamed from: c */
    public final InterfaceC2127i f7136c;

    /* renamed from: d */
    public final InterfaceC2123e f7137d;

    /* renamed from: e */
    public final boolean f7138e;

    public C2185h1(Callable callable, InterfaceC2127i interfaceC2127i, InterfaceC2123e interfaceC2123e, boolean z) {
        this.f7135b = callable;
        this.f7136c = interfaceC2127i;
        this.f7137d = interfaceC2123e;
        this.f7138e = z;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        EnumC2132d enumC2132d = EnumC2132d.INSTANCE;
        try {
            Object call = this.f7135b.call();
            try {
                Object mo24a = this.f7136c.mo24a(call);
                AbstractC2148n.m110a(mo24a, "The sourceSupplier returned a null ObservableSource");
                ((InterfaceC2097e) mo24a).mo89a(new C2182g1(interfaceC2098f, call, this.f7137d, this.f7138e));
            } catch (Throwable th) {
                AbstractC1438d.m1039k(th);
                try {
                    this.f7137d.accept(call);
                    interfaceC2098f.mo27c(enumC2132d);
                    interfaceC2098f.mo28b(th);
                } catch (Throwable th2) {
                    AbstractC1438d.m1039k(th2);
                    CompositeException compositeException = new CompositeException(th, th2);
                    interfaceC2098f.mo27c(enumC2132d);
                    interfaceC2098f.mo28b(compositeException);
                }
            }
        } catch (Throwable th3) {
            AbstractC1438d.m1039k(th3);
            interfaceC2098f.mo27c(enumC2132d);
            interfaceC2098f.mo28b(th3);
        }
    }
}