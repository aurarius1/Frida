package p183e.p184a.p190p.p192b;

import p093c.p094a.p095a.p096a.AbstractC1124a;
import p183e.p184a.p189o.InterfaceC2121c;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: e.a.p.b.a */
/* loaded from: classes.dex */
public final class C2135a implements InterfaceC2127i {

    /* renamed from: b */
    public final InterfaceC2121c f7029b;

    public C2135a(InterfaceC2121c interfaceC2121c) {
        this.f7029b = interfaceC2121c;
    }

    @Override // p183e.p184a.p189o.InterfaceC2127i
    /* renamed from: a */
    public Object mo24a(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2) {
            return this.f7029b.mo127a(objArr[0], objArr[1]);
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Array of size 2 expected but got ");
        m1187i.append(objArr.length);
        throw new IllegalArgumentException(m1187i.toString());
    }
}