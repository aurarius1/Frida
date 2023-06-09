package p010b.p072o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b.o.n */
/* loaded from: classes.dex */
public abstract class AbstractC0785n {

    /* renamed from: a */
    public static Map f3290a = new HashMap();

    /* renamed from: b */
    public static Map f3291b = new HashMap();

    /* renamed from: a */
    public static InterfaceC0776e m1816a(Constructor constructor, Object obj) {
        try {
            return (InterfaceC0776e) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static String m1815b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static int m1814c(Class cls) {
        Constructor constructor;
        boolean z;
        List arrayList;
        Map map;
        Integer num = (Integer) f3290a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String m1815b = m1815b(canonicalName);
                if (!name.isEmpty()) {
                    m1815b = name + "." + m1815b;
                }
                constructor = Class.forName(m1815b).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                map = f3291b;
                arrayList = Collections.singletonList(constructor);
            } else {
                C0774c c0774c = C0774c.f3271a;
                Boolean bool = (Boolean) c0774c.f3273c.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                c0774c.f3273c.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((InterfaceC0790s) declaredMethods[i2].getAnnotation(InterfaceC0790s.class)) != null) {
                                c0774c.m1839a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0781j.class.isAssignableFrom(superclass)) {
                        arrayList = m1814c(superclass) != 1 ? new ArrayList((Collection) f3291b.get(superclass)) : null;
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && InterfaceC0781j.class.isAssignableFrom(cls2)) {
                                if (m1814c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) f3291b.get(cls2));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            map = f3291b;
                        }
                    }
                }
            }
            map.put(cls, arrayList);
            i = 2;
        }
        f3290a.put(cls, Integer.valueOf(i));
        return i;
    }
}