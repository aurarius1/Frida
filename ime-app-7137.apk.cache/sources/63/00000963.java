package p183e.p184a.p190p.p195e.p196a;

import p093c.p094a.p095a.p096a.AbstractC1124a;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2098f;

/* renamed from: e.a.p.e.a.b0 */
/* loaded from: classes.dex */
public final class C2166b0 extends AbstractC2094b {

    /* renamed from: b */
    public final Object[] f7080b;

    public C2166b0(Object[] objArr) {
        this.f7080b = objArr;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        Object[] objArr = this.f7080b;
        C2163a0 c2163a0 = new C2163a0(interfaceC2098f, objArr);
        interfaceC2098f.mo27c(c2163a0);
        if (c2163a0.f7071e) {
            return;
        }
        int length = objArr.length;
        for (int i = 0; i < length && !c2163a0.f7072f; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                c2163a0.f7068b.mo28b(new NullPointerException(AbstractC1124a.m1192d("The element at index ", i, " is null")));
                return;
            }
            c2163a0.f7068b.mo25g(obj);
        }
        if (c2163a0.f7072f) {
            return;
        }
        c2163a0.f7068b.mo26d();
    }
}