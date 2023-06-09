package androidx.lifecycle;

import p010b.p072o.C0788q;
import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0776e;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC0780i {

    /* renamed from: a */
    public final InterfaceC0776e[] f550a;

    public CompositeGeneratedAdaptersObserver(InterfaceC0776e[] interfaceC0776eArr) {
        this.f550a = interfaceC0776eArr;
    }

    @Override // p010b.p072o.InterfaceC0780i
    /* renamed from: d */
    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        C0788q c0788q = new C0788q();
        for (InterfaceC0776e interfaceC0776e : this.f550a) {
            interfaceC0776e.m1830a(interfaceC0782k, enumC0777f, false, c0788q);
        }
        for (InterfaceC0776e interfaceC0776e2 : this.f550a) {
            interfaceC0776e2.m1830a(interfaceC0782k, enumC0777f, true, c0788q);
        }
    }
}