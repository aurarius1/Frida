package p183e.p184a.p190p.p195e.p197b;

import p183e.p184a.AbstractC2101i;
import p183e.p184a.AbstractC2102j;
import p183e.p184a.InterfaceC2103k;

/* renamed from: e.a.p.e.b.e */
/* loaded from: classes.dex */
public final class C2229e extends AbstractC2102j {

    /* renamed from: a */
    public final AbstractC2102j f7283a;

    /* renamed from: b */
    public final AbstractC2101i f7284b;

    public C2229e(AbstractC2102j abstractC2102j, AbstractC2101i abstractC2101i) {
        this.f7283a = abstractC2102j;
        this.f7284b = abstractC2101i;
    }

    @Override // p183e.p184a.AbstractC2102j
    /* renamed from: e */
    public void mo70e(InterfaceC2103k interfaceC2103k) {
        this.f7283a.m133d(new RunnableC2228d(interfaceC2103k, this.f7284b));
    }
}