package p183e.p184a.p190p.p200h;

import p010b.p086w.AbstractC1077v0;

/* renamed from: e.a.p.h.g */
/* loaded from: classes.dex */
public final class C2265g {

    /* renamed from: a */
    public int f7391a;

    /* renamed from: b */
    public int f7392b;

    /* renamed from: c */
    public int f7393c;

    /* renamed from: d */
    public Object[] f7394d;

    public C2265g() {
        int m1282V = AbstractC1077v0.m1282V(16);
        this.f7391a = m1282V - 1;
        this.f7393c = (int) (m1282V * 0.75f);
        this.f7394d = new Object[m1282V];
    }

    /* renamed from: c */
    public static int m45c(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean m47a(Object obj) {
        Object obj2;
        Object[] objArr = this.f7394d;
        int i = this.f7391a;
        int m45c = m45c(obj.hashCode()) & i;
        Object obj3 = objArr[m45c];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                m45c = (m45c + 1) & i;
                obj2 = objArr[m45c];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[m45c] = obj;
        int i2 = this.f7392b + 1;
        this.f7392b = i2;
        if (i2 >= this.f7393c) {
            Object[] objArr2 = this.f7394d;
            int length = objArr2.length;
            int i3 = length << 1;
            int i4 = i3 - 1;
            Object[] objArr3 = new Object[i3];
            while (true) {
                int i5 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                do {
                    length--;
                } while (objArr2[length] == null);
                int m45c2 = m45c(objArr2[length].hashCode()) & i4;
                if (objArr3[m45c2] != null) {
                    do {
                        m45c2 = (m45c2 + 1) & i4;
                    } while (objArr3[m45c2] != null);
                }
                objArr3[m45c2] = objArr2[length];
                i2 = i5;
            }
            this.f7391a = i4;
            this.f7393c = (int) (i3 * 0.75f);
            this.f7394d = objArr3;
        }
        return true;
    }

    /* renamed from: b */
    public Object[] m46b() {
        return this.f7394d;
    }

    /* renamed from: d */
    public boolean m44d(Object obj) {
        Object obj2;
        Object[] objArr = this.f7394d;
        int i = this.f7391a;
        int m45c = m45c(obj.hashCode()) & i;
        Object obj3 = objArr[m45c];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            m43e(m45c, objArr, i);
            return true;
        }
        do {
            m45c = (m45c + 1) & i;
            obj2 = objArr[m45c];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        m43e(m45c, objArr, i);
        return true;
    }

    /* renamed from: e */
    public boolean m43e(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.f7392b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return true;
                }
                int m45c = m45c(obj.hashCode()) & i2;
                if (i > i3) {
                    if (i >= m45c && m45c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < m45c && m45c <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}