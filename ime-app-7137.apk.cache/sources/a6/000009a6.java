package p183e.p184a.p190p.p195e.p197b;

import p183e.p184a.AbstractC2101i;
import p183e.p184a.AbstractC2102j;
import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.b.i */
/* loaded from: classes.dex */
public final class C2233i extends AbstractC2102j {

    /* renamed from: a */
    public final AbstractC2102j f7292a;

    /* renamed from: b */
    public final AbstractC2101i f7293b;

    public C2233i(AbstractC2102j abstractC2102j, AbstractC2101i abstractC2101i) {
        this.f7292a = abstractC2102j;
        this.f7293b = abstractC2101i;
    }

    @Override // p183e.p184a.AbstractC2102j
    /* renamed from: e */
    public void mo70e(InterfaceC2103k interfaceC2103k) {
        RunnableC2232h runnableC2232h = new RunnableC2232h(interfaceC2103k, this.f7292a);
        interfaceC2103k.mo71c(runnableC2232h);
        EnumC2131c.m123b(runnableC2232h.f7290c, this.f7293b.mo58b(runnableC2232h));
    }
}