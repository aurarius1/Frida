package p010b.p072o;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b.o.a */
/* loaded from: classes.dex */
public class C0770a {

    /* renamed from: a */
    public final Map f3267a = new HashMap();

    /* renamed from: b */
    public final Map f3268b;

    public C0770a(Map map) {
        this.f3268b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0777f enumC0777f = (EnumC0777f) entry.getValue();
            List list = (List) this.f3267a.get(enumC0777f);
            if (list == null) {
                list = new ArrayList();
                this.f3267a.put(enumC0777f, list);
            }
            list.add(entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m1840a(List list, InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0772b c0772b = (C0772b) list.get(size);
                c0772b.getClass();
                try {
                    int i = c0772b.f3269a;
                    if (i == 0) {
                        c0772b.f3270b.invoke(obj, new Object[0]);
                    } else if (i == 1) {
                        c0772b.f3270b.invoke(obj, interfaceC0782k);
                    } else if (i == 2) {
                        c0772b.f3270b.invoke(obj, interfaceC0782k, enumC0777f);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}