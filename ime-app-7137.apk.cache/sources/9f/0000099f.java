package p183e.p184a.p190p.p195e.p197b;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2148n;

/* renamed from: e.a.p.e.b.b */
/* loaded from: classes.dex */
public final class C2226b implements InterfaceC2103k {

    /* renamed from: b */
    public final InterfaceC2103k f7275b;

    /* renamed from: c */
    public final InterfaceC2127i f7276c;

    public C2226b(InterfaceC2103k interfaceC2103k, InterfaceC2127i interfaceC2127i) {
        this.f7275b = interfaceC2103k;
        this.f7276c = interfaceC2127i;
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: a */
    public void mo73a(Object obj) {
        try {
            Object mo24a = this.f7276c.mo24a(obj);
            AbstractC2148n.m110a(mo24a, "The mapper function returned a null value.");
            this.f7275b.mo73a(mo24a);
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            mo72b(th);
        }
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: b */
    public void mo72b(Throwable th) {
        this.f7275b.mo72b(th);
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: c */
    public void mo71c(InterfaceC2112c interfaceC2112c) {
        this.f7275b.mo71c(interfaceC2112c);
    }
}