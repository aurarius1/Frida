package p010b.p036g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: b.g.m */
/* loaded from: classes.dex */
public abstract class AbstractC0389m {

    /* renamed from: a */
    public C0385i f1934a;

    /* renamed from: b */
    public C0386j f1935b;

    /* renamed from: c */
    public C0388l f1936c;

    /* renamed from: j */
    public static boolean m2627j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m2626k(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo2636a();

    /* renamed from: b */
    public abstract Object mo2635b(int i, int i2);

    /* renamed from: c */
    public abstract Map mo2634c();

    /* renamed from: d */
    public abstract int mo2633d();

    /* renamed from: e */
    public abstract int mo2632e(Object obj);

    /* renamed from: f */
    public abstract int mo2631f(Object obj);

    /* renamed from: g */
    public abstract void mo2630g(Object obj, Object obj2);

    /* renamed from: h */
    public abstract void mo2629h(int i);

    /* renamed from: i */
    public abstract Object mo2628i(int i, Object obj);

    /* renamed from: l */
    public Object[] m2625l(int i) {
        int mo2633d = mo2633d();
        Object[] objArr = new Object[mo2633d];
        for (int i2 = 0; i2 < mo2633d; i2++) {
            objArr[i2] = mo2635b(i2, i);
        }
        return objArr;
    }

    /* renamed from: m */
    public Object[] m2624m(Object[] objArr, int i) {
        int mo2633d = mo2633d();
        if (objArr.length < mo2633d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), mo2633d);
        }
        for (int i2 = 0; i2 < mo2633d; i2++) {
            objArr[i2] = mo2635b(i2, i);
        }
        if (objArr.length > mo2633d) {
            objArr[mo2633d] = null;
        }
        return objArr;
    }
}