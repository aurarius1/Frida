package p183e.p184a.p190p.p192b;

import p093c.p094a.p095a.p096a.AbstractC1124a;
import p183e.p184a.p189o.InterfaceC2125g;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: e.a.p.b.c */
/* loaded from: classes.dex */
public final class C2137c implements InterfaceC2127i {

    /* renamed from: b */
    public final InterfaceC2125g f7031b;

    public C2137c(InterfaceC2125g interfaceC2125g) {
        this.f7031b = interfaceC2125g;
    }

    @Override // p183e.p184a.p189o.InterfaceC2127i
    /* renamed from: a */
    public Object mo24a(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 5) {
            return this.f7031b.mo125a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Array of size 5 expected but got ");
        m1187i.append(objArr.length);
        throw new IllegalArgumentException(m1187i.toString());
    }
}