package p010b.p072o;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

/* renamed from: b.o.l */
/* loaded from: classes.dex */
public class C0783l {

    /* renamed from: a */
    public EnumC0778g f3280a;

    /* renamed from: b */
    public InterfaceC0780i f3281b;

    public C0783l(InterfaceC0781j interfaceC0781j, EnumC0778g enumC0778g) {
        InterfaceC0780i reflectiveGenericLifecycleObserver;
        InterfaceC0780i interfaceC0780i;
        Map map = AbstractC0785n.f3290a;
        if (interfaceC0781j instanceof InterfaceC0780i) {
            interfaceC0780i = (InterfaceC0780i) interfaceC0781j;
        } else {
            Class<?> cls = interfaceC0781j.getClass();
            if (AbstractC0785n.m1814c(cls) == 2) {
                List list = (List) AbstractC0785n.f3291b.get(cls);
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(AbstractC0785n.m1816a((Constructor) list.get(0), interfaceC0781j));
                } else {
                    InterfaceC0776e[] interfaceC0776eArr = new InterfaceC0776e[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        interfaceC0776eArr[i] = AbstractC0785n.m1816a((Constructor) list.get(i), interfaceC0781j);
                    }
                    interfaceC0780i = new CompositeGeneratedAdaptersObserver(interfaceC0776eArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0781j);
            }
            interfaceC0780i = reflectiveGenericLifecycleObserver;
        }
        this.f3281b = interfaceC0780i;
        this.f3280a = enumC0778g;
    }

    /* renamed from: a */
    public void m1825a(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        EnumC0778g m1829a = enumC0777f.m1829a();
        this.f3280a = C0784m.m1820e(this.f3280a, m1829a);
        this.f3281b.mo1827d(interfaceC0782k, enumC0777f);
        this.f3280a = m1829a;
    }
}