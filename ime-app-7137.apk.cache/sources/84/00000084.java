package androidx.lifecycle;

import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0776e;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;

/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements InterfaceC0780i {

    /* renamed from: a */
    public final InterfaceC0776e f558a;

    public SingleGeneratedAdapterObserver(InterfaceC0776e interfaceC0776e) {
        this.f558a = interfaceC0776e;
    }

    @Override // p010b.p072o.InterfaceC0780i
    /* renamed from: d */
    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        this.f558a.m1830a(interfaceC0782k, enumC0777f, false, null);
        this.f558a.m1830a(interfaceC0782k, enumC0777f, true, null);
    }
}