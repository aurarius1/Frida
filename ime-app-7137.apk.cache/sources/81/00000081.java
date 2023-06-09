package androidx.lifecycle;

import java.util.List;
import p010b.p072o.C0770a;
import p010b.p072o.C0774c;
import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0780i {

    /* renamed from: a */
    public final Object f553a;

    /* renamed from: b */
    public final C0770a f554b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f553a = obj;
        this.f554b = C0774c.f3271a.m1838b(obj.getClass());
    }

    @Override // p010b.p072o.InterfaceC0780i
    /* renamed from: d */
    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        C0770a c0770a = this.f554b;
        Object obj = this.f553a;
        C0770a.m1840a((List) c0770a.f3267a.get(enumC0777f), interfaceC0782k, enumC0777f, obj);
        C0770a.m1840a((List) c0770a.f3267a.get(EnumC0777f.ON_ANY), interfaceC0782k, enumC0777f, obj);
    }
}