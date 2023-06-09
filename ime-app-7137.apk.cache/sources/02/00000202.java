package p010b.p036g;

/* renamed from: b.g.f */
/* loaded from: classes.dex */
public class C0382f implements Cloneable {

    /* renamed from: b */
    public static final Object f1910b = new Object();

    /* renamed from: c */
    public boolean f1911c = false;

    /* renamed from: d */
    public long[] f1912d;

    /* renamed from: e */
    public Object[] f1913e;

    /* renamed from: f */
    public int f1914f;

    public C0382f() {
        int m2649f = AbstractC0381e.m2649f(10);
        this.f1912d = new long[m2649f];
        this.f1913e = new Object[m2649f];
    }

    /* renamed from: a */
    public void m2648a(long j, Object obj) {
        int i = this.f1914f;
        if (i != 0 && j <= this.f1912d[i - 1]) {
            m2642g(j, obj);
            return;
        }
        if (this.f1911c && i >= this.f1912d.length) {
            m2645d();
        }
        int i2 = this.f1914f;
        if (i2 >= this.f1912d.length) {
            int m2649f = AbstractC0381e.m2649f(i2 + 1);
            long[] jArr = new long[m2649f];
            Object[] objArr = new Object[m2649f];
            long[] jArr2 = this.f1912d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1913e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1912d = jArr;
            this.f1913e = objArr;
        }
        this.f1912d[i2] = j;
        this.f1913e[i2] = obj;
        this.f1914f = i2 + 1;
    }

    /* renamed from: b */
    public void m2647b() {
        int i = this.f1914f;
        Object[] objArr = this.f1913e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1914f = 0;
        this.f1911c = false;
    }

    /* JADX DEBUG: Method merged with bridge method */
    /* renamed from: c */
    public C0382f clone() {
        try {
            C0382f c0382f = (C0382f) super.clone();
            c0382f.f1912d = (long[]) this.f1912d.clone();
            c0382f.f1913e = (Object[]) this.f1913e.clone();
            return c0382f;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void m2645d() {
        int i = this.f1914f;
        long[] jArr = this.f1912d;
        Object[] objArr = this.f1913e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1910b) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1911c = false;
        this.f1914f = i2;
    }

    /* renamed from: e */
    public Object m2644e(long j) {
        return m2643f(j, null);
    }

    /* renamed from: f */
    public Object m2643f(long j, Object obj) {
        int m2653b = AbstractC0381e.m2653b(this.f1912d, this.f1914f, j);
        if (m2653b >= 0) {
            Object[] objArr = this.f1913e;
            if (objArr[m2653b] != f1910b) {
                return objArr[m2653b];
            }
        }
        return obj;
    }

    /* renamed from: g */
    public void m2642g(long j, Object obj) {
        int m2653b = AbstractC0381e.m2653b(this.f1912d, this.f1914f, j);
        if (m2653b >= 0) {
            this.f1913e[m2653b] = obj;
            return;
        }
        int i = m2653b ^ (-1);
        int i2 = this.f1914f;
        if (i < i2) {
            Object[] objArr = this.f1913e;
            if (objArr[i] == f1910b) {
                this.f1912d[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f1911c && i2 >= this.f1912d.length) {
            m2645d();
            i = AbstractC0381e.m2653b(this.f1912d, this.f1914f, j) ^ (-1);
        }
        int i3 = this.f1914f;
        if (i3 >= this.f1912d.length) {
            int m2649f = AbstractC0381e.m2649f(i3 + 1);
            long[] jArr = new long[m2649f];
            Object[] objArr2 = new Object[m2649f];
            long[] jArr2 = this.f1912d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1913e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1912d = jArr;
            this.f1913e = objArr2;
        }
        int i4 = this.f1914f;
        if (i4 - i != 0) {
            long[] jArr3 = this.f1912d;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f1913e;
            System.arraycopy(objArr4, i, objArr4, i5, this.f1914f - i);
        }
        this.f1912d[i] = j;
        this.f1913e[i] = obj;
        this.f1914f++;
    }

    /* renamed from: h */
    public int m2641h() {
        if (this.f1911c) {
            m2645d();
        }
        return this.f1914f;
    }

    /* renamed from: i */
    public Object m2640i(int i) {
        if (this.f1911c) {
            m2645d();
        }
        return this.f1913e[i];
    }

    public String toString() {
        if (m2641h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1914f * 28);
        sb.append('{');
        for (int i = 0; i < this.f1914f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f1911c) {
                m2645d();
            }
            sb.append(this.f1912d[i]);
            sb.append('=');
            Object m2640i = m2640i(i);
            if (m2640i != this) {
                sb.append(m2640i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}