package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.e.a.k1 */
/* loaded from: classes.dex */
public final class C2194k1 extends AbstractC2094b {

    /* renamed from: b */
    public final InterfaceC2097e[] f7179b;

    /* renamed from: c */
    public final InterfaceC2127i f7180c;

    /* renamed from: d */
    public final int f7181d;

    /* renamed from: e */
    public final boolean f7182e;

    public C2194k1(InterfaceC2097e[] interfaceC2097eArr, Iterable iterable, InterfaceC2127i interfaceC2127i, int i, boolean z) {
        this.f7179b = interfaceC2097eArr;
        this.f7180c = interfaceC2127i;
        this.f7181d = i;
        this.f7182e = z;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        InterfaceC2097e[] interfaceC2097eArr = this.f7179b;
        interfaceC2097eArr.getClass();
        int length = interfaceC2097eArr.length;
        if (length == 0) {
            interfaceC2098f.mo27c(EnumC2132d.INSTANCE);
            interfaceC2098f.mo26d();
            return;
        }
        C2188i1 c2188i1 = new C2188i1(interfaceC2098f, this.f7180c, length, this.f7182e);
        int i = this.f7181d;
        C2191j1[] c2191j1Arr = c2188i1.f7144d;
        int length2 = c2191j1Arr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            c2191j1Arr[i2] = new C2191j1(c2188i1, i);
        }
        c2188i1.lazySet(0);
        c2188i1.f7142b.mo27c(c2188i1);
        for (int i3 = 0; i3 < length2 && !c2188i1.f7147g; i3++) {
            interfaceC2097eArr[i3].mo89a(c2191j1Arr[i3]);
        }
    }
}