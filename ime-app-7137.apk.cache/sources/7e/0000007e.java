package androidx.lifecycle;

import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0775d;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC0780i {

    /* renamed from: a */
    public final InterfaceC0775d f551a;

    /* renamed from: b */
    public final InterfaceC0780i f552b;

    @Override // p010b.p072o.InterfaceC0780i
    /* renamed from: d */
    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        switch (enumC0777f.ordinal()) {
            case 0:
                this.f551a.m1834c(interfaceC0782k);
                break;
            case 1:
                this.f551a.m1831g(interfaceC0782k);
                break;
            case 2:
                this.f551a.m1836a(interfaceC0782k);
                break;
            case 3:
                this.f551a.m1833e(interfaceC0782k);
                break;
            case 4:
                this.f551a.m1832f(interfaceC0782k);
                break;
            case 5:
                this.f551a.m1835b(interfaceC0782k);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0780i interfaceC0780i = this.f552b;
        if (interfaceC0780i != null) {
            interfaceC0780i.mo1827d(interfaceC0782k, enumC0777f);
        }
    }
}