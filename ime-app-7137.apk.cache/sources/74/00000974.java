package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.e.a.h */
/* loaded from: classes.dex */
public final class C2183h extends AbstractC2094b {

    /* renamed from: b */
    public final InterfaceC2097e[] f7130b;

    /* renamed from: c */
    public final InterfaceC2127i f7131c;

    /* renamed from: d */
    public final int f7132d;

    public C2183h(InterfaceC2097e[] interfaceC2097eArr, Iterable iterable, InterfaceC2127i interfaceC2127i, int i, boolean z) {
        this.f7130b = interfaceC2097eArr;
        this.f7131c = interfaceC2127i;
        this.f7132d = i;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        InterfaceC2097e[] interfaceC2097eArr = this.f7130b;
        interfaceC2097eArr.getClass();
        int length = interfaceC2097eArr.length;
        if (length == 0) {
            interfaceC2098f.mo27c(EnumC2132d.INSTANCE);
            interfaceC2098f.mo26d();
            return;
        }
        C2180g c2180g = new C2180g(interfaceC2098f, this.f7131c, length, this.f7132d, false);
        C2177f[] c2177fArr = c2180g.f7112d;
        int length2 = c2177fArr.length;
        c2180g.f7110b.mo27c(c2180g);
        for (int i = 0; i < length2 && !c2180g.f7117i && !c2180g.f7116h; i++) {
            interfaceC2097eArr[i].mo89a(c2177fArr[i]);
        }
    }
}