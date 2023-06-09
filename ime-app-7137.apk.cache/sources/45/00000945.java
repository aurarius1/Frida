package p183e.p184a.p190p.p192b;

import p093c.p094a.p095a.p096a.AbstractC1124a;
import p183e.p184a.p189o.InterfaceC2124f;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: e.a.p.b.b */
/* loaded from: classes.dex */
public final class C2136b implements InterfaceC2127i {

    /* renamed from: b */
    public final InterfaceC2124f f7030b;

    public C2136b(InterfaceC2124f interfaceC2124f) {
        this.f7030b = interfaceC2124f;
    }

    @Override // p183e.p184a.p189o.InterfaceC2127i
    /* renamed from: a */
    public Object mo24a(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 3) {
            return this.f7030b.mo126a(objArr[0], objArr[1], objArr[2]);
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Array of size 3 expected but got ");
        m1187i.append(objArr.length);
        throw new IllegalArgumentException(m1187i.toString());
    }
}