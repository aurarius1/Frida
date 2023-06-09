package p010b.p072o;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.o.c */
/* loaded from: classes.dex */
public final class C0774c {

    /* renamed from: a */
    public static C0774c f3271a = new C0774c();

    /* renamed from: b */
    public final Map f3272b = new HashMap();

    /* renamed from: c */
    public final Map f3273c = new HashMap();

    /* renamed from: a */
    public final C0770a m1839a(Class cls, Method[] methodArr) {
        int i;
        C0770a m1838b;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m1838b = m1838b(superclass)) != null) {
            hashMap.putAll(m1838b.f3268b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m1838b(cls2).f3268b.entrySet()) {
                m1837c(hashMap, (C0772b) entry.getKey(), (EnumC0777f) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0790s interfaceC0790s = (InterfaceC0790s) method.getAnnotation(InterfaceC0790s.class);
            if (interfaceC0790s != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(InterfaceC0782k.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                EnumC0777f value = interfaceC0790s.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(EnumC0777f.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0777f.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1837c(hashMap, new C0772b(i, method), value, cls);
                z = true;
            }
        }
        C0770a c0770a = new C0770a(hashMap);
        this.f3272b.put(cls, c0770a);
        this.f3273c.put(cls, Boolean.valueOf(z));
        return c0770a;
    }

    /* renamed from: b */
    public C0770a m1838b(Class cls) {
        C0770a c0770a = (C0770a) this.f3272b.get(cls);
        return c0770a != null ? c0770a : m1839a(cls, null);
    }

    /* renamed from: c */
    public final void m1837c(Map map, C0772b c0772b, EnumC0777f enumC0777f, Class cls) {
        EnumC0777f enumC0777f2 = (EnumC0777f) map.get(c0772b);
        if (enumC0777f2 == null || enumC0777f == enumC0777f2) {
            if (enumC0777f2 == null) {
                map.put(c0772b, enumC0777f);
                return;
            }
            return;
        }
        Method method = c0772b.f3270b;
        StringBuilder m1187i = AbstractC1124a.m1187i("Method ");
        m1187i.append(method.getName());
        m1187i.append(" in ");
        m1187i.append(cls.getName());
        m1187i.append(" already declared with different @OnLifecycleEvent value: previous value ");
        m1187i.append(enumC0777f2);
        m1187i.append(", new value ");
        m1187i.append(enumC0777f);
        throw new IllegalArgumentException(m1187i.toString());
    }
}