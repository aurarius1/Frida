package p010b.p036g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: b.g.d */
/* loaded from: classes.dex */
public final class C0380d implements Collection, Set {

    /* renamed from: b */
    public static final int[] f1897b = new int[0];

    /* renamed from: c */
    public static final Object[] f1898c = new Object[0];

    /* renamed from: d */
    public static Object[] f1899d;

    /* renamed from: e */
    public static int f1900e;

    /* renamed from: f */
    public static Object[] f1901f;

    /* renamed from: g */
    public static int f1902g;

    /* renamed from: h */
    public int[] f1903h;

    /* renamed from: i */
    public Object[] f1904i;

    /* renamed from: j */
    public int f1905j;

    /* renamed from: k */
    public AbstractC0389m f1906k;

    public C0380d(int i) {
        if (i == 0) {
            this.f1903h = f1897b;
            this.f1904i = f1898c;
        } else {
            m2659a(i);
        }
        this.f1905j = 0;
    }

    /* renamed from: b */
    public static void m2658b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0380d.class) {
                if (f1902g < 10) {
                    objArr[0] = f1901f;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1901f = objArr;
                    f1902g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0380d.class) {
                if (f1900e < 10) {
                    objArr[0] = f1899d;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1899d = objArr;
                    f1900e++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2659a(int i) {
        if (i == 8) {
            synchronized (C0380d.class) {
                Object[] objArr = f1901f;
                if (objArr != null) {
                    this.f1904i = objArr;
                    f1901f = (Object[]) objArr[0];
                    this.f1903h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1902g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0380d.class) {
                Object[] objArr2 = f1899d;
                if (objArr2 != null) {
                    this.f1904i = objArr2;
                    f1899d = (Object[]) objArr2[0];
                    this.f1903h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1900e--;
                    return;
                }
            }
        }
        this.f1903h = new int[i];
        this.f1904i = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i;
        int m2657c;
        if (obj == null) {
            m2657c = m2656d();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            m2657c = m2657c(obj, hashCode);
        }
        if (m2657c >= 0) {
            return false;
        }
        int i2 = m2657c ^ (-1);
        int i3 = this.f1905j;
        int[] iArr = this.f1903h;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f1904i;
            m2659a(i4);
            int[] iArr2 = this.f1903h;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1904i, 0, objArr.length);
            }
            m2658b(iArr, objArr, this.f1905j);
        }
        int i5 = this.f1905j;
        if (i2 < i5) {
            int[] iArr3 = this.f1903h;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f1904i;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f1905j - i2);
        }
        this.f1903h[i2] = i;
        this.f1904i[i2] = obj;
        this.f1905j++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        int size = collection.size() + this.f1905j;
        int[] iArr = this.f1903h;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1904i;
            m2659a(size);
            int i = this.f1905j;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f1903h, 0, i);
                System.arraycopy(objArr, 0, this.f1904i, 0, this.f1905j);
            }
            m2658b(iArr, objArr, this.f1905j);
        }
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    /* renamed from: c */
    public final int m2657c(Object obj, int i) {
        int i2 = this.f1905j;
        if (i2 == 0) {
            return -1;
        }
        int m2654a = AbstractC0381e.m2654a(this.f1903h, i2, i);
        if (m2654a >= 0 && !obj.equals(this.f1904i[m2654a])) {
            int i3 = m2654a + 1;
            while (i3 < i2 && this.f1903h[i3] == i) {
                if (obj.equals(this.f1904i[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m2654a - 1; i4 >= 0 && this.f1903h[i4] == i; i4--) {
                if (obj.equals(this.f1904i[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m2654a;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f1905j;
        if (i != 0) {
            m2658b(this.f1903h, this.f1904i, i);
            this.f1903h = f1897b;
            this.f1904i = f1898c;
            this.f1905j = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m2656d() {
        int i = this.f1905j;
        if (i == 0) {
            return -1;
        }
        int m2654a = AbstractC0381e.m2654a(this.f1903h, i, 0);
        if (m2654a >= 0 && this.f1904i[m2654a] != null) {
            int i2 = m2654a + 1;
            while (i2 < i && this.f1903h[i2] == 0) {
                if (this.f1904i[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m2654a - 1; i3 >= 0 && this.f1903h[i3] == 0; i3--) {
                if (this.f1904i[i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m2654a;
    }

    /* renamed from: e */
    public Object m2655e(int i) {
        Object[] objArr = this.f1904i;
        Object obj = objArr[i];
        int i2 = this.f1905j;
        if (i2 <= 1) {
            m2658b(this.f1903h, objArr, i2);
            this.f1903h = f1897b;
            this.f1904i = f1898c;
            this.f1905j = 0;
        } else {
            int[] iArr = this.f1903h;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f1905j = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f1904i;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f1905j - i);
                }
                this.f1904i[this.f1905j] = null;
            } else {
                m2659a(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f1905j--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1903h, 0, i);
                    System.arraycopy(objArr, 0, this.f1904i, 0, i);
                }
                int i5 = this.f1905j;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f1903h, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f1904i, i, this.f1905j - i);
                }
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1905j != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f1905j; i++) {
                try {
                    if (!set.contains(this.f1904i[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1903h;
        int i = this.f1905j;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m2656d() : m2657c(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1905j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (this.f1906k == null) {
            this.f1906k = new C0379c(this);
        }
        AbstractC0389m abstractC0389m = this.f1906k;
        if (abstractC0389m.f1935b == null) {
            abstractC0389m.f1935b = new C0386j(abstractC0389m);
        }
        return abstractC0389m.f1935b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m2655e(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f1905j - 1; i >= 0; i--) {
            if (!collection.contains(this.f1904i[i])) {
                m2655e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1905j;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f1905j;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1904i, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f1905j) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f1905j);
        }
        System.arraycopy(this.f1904i, 0, objArr, 0, this.f1905j);
        int length = objArr.length;
        int i = this.f1905j;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1905j * 14);
        sb.append('{');
        for (int i = 0; i < this.f1905j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f1904i[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}