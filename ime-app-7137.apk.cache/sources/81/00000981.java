package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.AbstractC2101i;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p190p.p199g.C2258w;

/* renamed from: e.a.p.e.a.l0 */
/* loaded from: classes.dex */
public final class C2196l0 extends AbstractC2162a {

    /* renamed from: c */
    public final AbstractC2101i f7184c;

    /* renamed from: d */
    public final boolean f7185d;

    /* renamed from: e */
    public final int f7186e;

    public C2196l0(InterfaceC2097e interfaceC2097e, AbstractC2101i abstractC2101i, boolean z, int i) {
        super(interfaceC2097e);
        this.f7184c = abstractC2101i;
        this.f7185d = z;
        this.f7186e = i;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        AbstractC2101i abstractC2101i = this.f7184c;
        if (abstractC2101i instanceof C2258w) {
            this.f7067b.mo89a(interfaceC2098f);
            return;
        }
        this.f7067b.mo89a(new RunnableC2193k0(interfaceC2098f, abstractC2101i.mo59a(), this.f7185d, this.f7186e));
    }
}