package p183e.p184a.p187m;

import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p190p.p200h.AbstractC2262d;

/* renamed from: e.a.m.a */
/* loaded from: classes.dex */
public final class C2110a extends AbstractC2113d {
    public C2110a(InterfaceC2119a interfaceC2119a) {
        super(interfaceC2119a);
    }

    @Override // p183e.p184a.p187m.AbstractC2113d
    /* renamed from: a */
    public void mo130a(Object obj) {
        try {
            ((InterfaceC2119a) obj).run();
        } catch (Throwable th) {
            throw AbstractC2262d.m53a(th);
        }
    }
}