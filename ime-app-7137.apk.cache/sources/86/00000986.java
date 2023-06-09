package p183e.p184a.p190p.p195e.p196a;

import java.util.Collection;
import java.util.concurrent.Callable;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2132d;
import p183e.p184a.p190p.p192b.AbstractC2148n;

/* renamed from: e.a.p.e.a.o */
/* loaded from: classes.dex */
public final class C2201o extends AbstractC2162a {

    /* renamed from: c */
    public final InterfaceC2127i f7194c;

    /* renamed from: d */
    public final Callable f7195d;

    public C2201o(InterfaceC2097e interfaceC2097e, InterfaceC2127i interfaceC2127i, Callable callable) {
        super(interfaceC2097e);
        this.f7194c = interfaceC2127i;
        this.f7195d = callable;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        try {
            Object call = this.f7195d.call();
            AbstractC2148n.m110a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f7067b.mo89a(new C2199n(interfaceC2098f, this.f7194c, (Collection) call));
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            interfaceC2098f.mo27c(EnumC2132d.INSTANCE);
            interfaceC2098f.mo28b(th);
        }
    }
}