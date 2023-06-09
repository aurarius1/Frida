package p183e.p184a.p190p.p195e.p196a;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: e.a.p.e.a.k */
/* loaded from: classes.dex */
public final class C2192k extends AbstractC2162a {

    /* renamed from: c */
    public final int f7166c;

    /* renamed from: d */
    public final int f7167d;

    public C2192k(InterfaceC2097e interfaceC2097e, InterfaceC2127i interfaceC2127i, int i, int i2) {
        super(interfaceC2097e);
        this.f7167d = i2;
        this.f7166c = Math.max(8, i);
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        InterfaceC2097e interfaceC2097e = this.f7067b;
        InterfaceC2127i interfaceC2127i = AbstractC2146l.f7036a;
        if (AbstractC1438d.m1038l(interfaceC2097e, interfaceC2098f, interfaceC2127i)) {
            return;
        }
        this.f7067b.mo89a(new C2189j(interfaceC2098f, interfaceC2127i, this.f7166c, false));
    }
}