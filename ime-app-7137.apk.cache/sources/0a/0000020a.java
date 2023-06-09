package p010b.p036g;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: b.g.n */
/* loaded from: classes.dex */
public class C0390n {

    /* renamed from: b */
    public static Object[] f1937b;

    /* renamed from: c */
    public static int f1938c;

    /* renamed from: d */
    public static Object[] f1939d;

    /* renamed from: e */
    public static int f1940e;

    /* renamed from: f */
    public int[] f1941f;

    /* renamed from: g */
    public Object[] f1942g;

    /* renamed from: h */
    public int f1943h;

    public C0390n() {
        this.f1941f = AbstractC0381e.f1907a;
        this.f1942g = AbstractC0381e.f1909c;
        this.f1943h = 0;
    }

    public C0390n(int i) {
        if (i == 0) {
            this.f1941f = AbstractC0381e.f1907a;
            this.f1942g = AbstractC0381e.f1909c;
        } else {
            m2623a(i);
        }
        this.f1943h = 0;
    }

    /* renamed from: c */
    public static void m2621c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0390n.class) {
                if (f1940e < 10) {
                    objArr[0] = f1939d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1939d = objArr;
                    f1940e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0390n.class) {
                if (f1938c < 10) {
                    objArr[0] = f1937b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1937b = objArr;
                    f1938c++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2623a(int i) {
        if (i == 8) {
            synchronized (C0390n.class) {
                Object[] objArr = f1939d;
                if (objArr != null) {
                    this.f1942g = objArr;
                    f1939d = (Object[]) objArr[0];
                    this.f1941f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1940e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0390n.class) {
                Object[] objArr2 = f1937b;
                if (objArr2 != null) {
                    this.f1942g = objArr2;
                    f1937b = (Object[]) objArr2[0];
                    this.f1941f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1938c--;
                    return;
                }
            }
        }
        this.f1941f = new int[i];
        this.f1942g = new Object[i << 1];
    }

    /* renamed from: b */
    public void m2622b(int i) {
        int i2 = this.f1943h;
        int[] iArr = this.f1941f;
        if (iArr.length < i) {
            Object[] objArr = this.f1942g;
            m2623a(i);
            if (this.f1943h > 0) {
                System.arraycopy(iArr, 0, this.f1941f, 0, i2);
                System.arraycopy(objArr, 0, this.f1942g, 0, i2 << 1);
            }
            m2621c(iArr, objArr, i2);
        }
        if (this.f1943h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f1943h;
        if (i > 0) {
            int[] iArr = this.f1941f;
            Object[] objArr = this.f1942g;
            this.f1941f = AbstractC0381e.f1907a;
            this.f1942g = AbstractC0381e.f1909c;
            this.f1943h = 0;
            m2621c(iArr, objArr, i);
        }
        if (this.f1943h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m2619e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m2617g(obj) >= 0;
    }

    /* renamed from: d */
    public int m2620d(Object obj, int i) {
        int i2 = this.f1943h;
        if (i2 == 0) {
            return -1;
        }
        try {
            int m2654a = AbstractC0381e.m2654a(this.f1941f, i2, i);
            if (m2654a >= 0 && !obj.equals(this.f1942g[m2654a << 1])) {
                int i3 = m2654a + 1;
                while (i3 < i2 && this.f1941f[i3] == i) {
                    if (obj.equals(this.f1942g[i3 << 1])) {
                        return i3;
                    }
                    i3++;
                }
                for (int i4 = m2654a - 1; i4 >= 0 && this.f1941f[i4] == i; i4--) {
                    if (obj.equals(this.f1942g[i4 << 1])) {
                        return i4;
                    }
                }
                return i3 ^ (-1);
            }
            return m2654a;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public int m2619e(Object obj) {
        return obj == null ? m2618f() : m2620d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0390n) {
            C0390n c0390n = (C0390n) obj;
            if (this.f1943h != c0390n.f1943h) {
                return false;
            }
            for (int i = 0; i < this.f1943h; i++) {
                try {
                    Object m2616h = m2616h(i);
                    Object m2613k = m2613k(i);
                    Object obj2 = c0390n.get(m2616h);
                    if (m2613k == null) {
                        if (obj2 != null || !c0390n.containsKey(m2616h)) {
                            return false;
                        }
                    } else if (!m2613k.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f1943h != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1943h; i2++) {
                try {
                    Object m2616h2 = m2616h(i2);
                    Object m2613k2 = m2613k(i2);
                    Object obj3 = map.get(m2616h2);
                    if (m2613k2 == null) {
                        if (obj3 != null || !map.containsKey(m2616h2)) {
                            return false;
                        }
                    } else if (!m2613k2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m2618f() {
        int i = this.f1943h;
        if (i == 0) {
            return -1;
        }
        try {
            int m2654a = AbstractC0381e.m2654a(this.f1941f, i, 0);
            if (m2654a >= 0 && this.f1942g[m2654a << 1] != null) {
                int i2 = m2654a + 1;
                while (i2 < i && this.f1941f[i2] == 0) {
                    if (this.f1942g[i2 << 1] == null) {
                        return i2;
                    }
                    i2++;
                }
                for (int i3 = m2654a - 1; i3 >= 0 && this.f1941f[i3] == 0; i3--) {
                    if (this.f1942g[i3 << 1] == null) {
                        return i3;
                    }
                }
                return i2 ^ (-1);
            }
            return m2654a;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public int m2617g(Object obj) {
        int i = this.f1943h * 2;
        Object[] objArr = this.f1942g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int m2619e = m2619e(obj);
        return m2619e >= 0 ? this.f1942g[(m2619e << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public Object m2616h(int i) {
        return this.f1942g[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f1941f;
        Object[] objArr = this.f1942g;
        int i = this.f1943h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public Object m2615i(int i) {
        Object[] objArr = this.f1942g;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f1943h;
        int i4 = 0;
        if (i3 <= 1) {
            m2621c(this.f1941f, objArr, i3);
            this.f1941f = AbstractC0381e.f1907a;
            this.f1942g = AbstractC0381e.f1909c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f1941f;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f1942g;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f1942g;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m2623a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f1943h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1941f, 0, i);
                    System.arraycopy(objArr, 0, this.f1942g, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f1941f, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f1942g, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f1943h) {
            this.f1943h = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public boolean isEmpty() {
        return this.f1943h <= 0;
    }

    /* renamed from: j */
    public Object m2614j(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1942g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* renamed from: k */
    public Object m2613k(int i) {
        return this.f1942g[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int m2620d;
        int i2 = this.f1943h;
        if (obj == null) {
            m2620d = m2618f();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            m2620d = m2620d(obj, hashCode);
        }
        if (m2620d >= 0) {
            int i3 = (m2620d << 1) + 1;
            Object[] objArr = this.f1942g;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = m2620d ^ (-1);
        int[] iArr = this.f1941f;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f1942g;
            m2623a(i5);
            if (i2 != this.f1943h) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1941f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1942g, 0, objArr2.length);
            }
            m2621c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f1941f;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f1942g;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f1943h - i4) << 1);
        }
        int i7 = this.f1943h;
        if (i2 == i7) {
            int[] iArr4 = this.f1941f;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f1942g;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f1943h = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public Object remove(Object obj) {
        int m2619e = m2619e(obj);
        if (m2619e >= 0) {
            return m2615i(m2619e);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int m2619e = m2619e(obj);
        if (m2619e >= 0) {
            Object m2613k = m2613k(m2619e);
            if (obj2 == m2613k || (obj2 != null && obj2.equals(m2613k))) {
                m2615i(m2619e);
                return true;
            }
            return false;
        }
        return false;
    }

    public Object replace(Object obj, Object obj2) {
        int m2619e = m2619e(obj);
        if (m2619e >= 0) {
            return m2614j(m2619e, obj2);
        }
        return null;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int m2619e = m2619e(obj);
        if (m2619e >= 0) {
            Object m2613k = m2613k(m2619e);
            if (m2613k == obj2 || (obj2 != null && obj2.equals(m2613k))) {
                m2614j(m2619e, obj3);
                return true;
            }
            return false;
        }
        return false;
    }

    public int size() {
        return this.f1943h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1943h * 28);
        sb.append('{');
        for (int i = 0; i < this.f1943h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object m2616h = m2616h(i);
            if (m2616h != this) {
                sb.append(m2616h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m2613k = m2613k(i);
            if (m2613k != this) {
                sb.append(m2613k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}