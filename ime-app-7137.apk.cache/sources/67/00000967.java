package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.AbstractC2101i;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.c1 */
/* loaded from: classes.dex */
public final class C2170c1 extends AbstractC2162a {

    /* renamed from: c */
    public final AbstractC2101i f7091c;

    public C2170c1(InterfaceC2097e interfaceC2097e, AbstractC2101i abstractC2101i) {
        super(interfaceC2097e);
        this.f7091c = abstractC2101i;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        C2164a1 c2164a1 = new C2164a1(interfaceC2098f);
        interfaceC2098f.mo27c(c2164a1);
        EnumC2131c.m122c(c2164a1, this.f7091c.mo58b(new RunnableC2167b1(this, c2164a1)));
    }
}