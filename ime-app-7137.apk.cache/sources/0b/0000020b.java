package p010b.p036g;

/* renamed from: b.g.o */
/* loaded from: classes.dex */
public class C0391o implements Cloneable {

    /* renamed from: b */
    public static final Object f1944b = new Object();

    /* renamed from: c */
    public int[] f1945c;

    /* renamed from: d */
    public Object[] f1946d;

    /* renamed from: e */
    public int f1947e;

    public C0391o() {
        int m2650e = AbstractC0381e.m2650e(10);
        this.f1945c = new int[m2650e];
        this.f1946d = new Object[m2650e];
    }

    /* renamed from: a */
    public void m2612a(int i, Object obj) {
        int i2 = this.f1947e;
        if (i2 != 0 && i <= this.f1945c[i2 - 1]) {
            m2607f(i, obj);
            return;
        }
        if (i2 >= this.f1945c.length) {
            int m2650e = AbstractC0381e.m2650e(i2 + 1);
            int[] iArr = new int[m2650e];
            Object[] objArr = new Object[m2650e];
            int[] iArr2 = this.f1945c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1946d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1945c = iArr;
            this.f1946d = objArr;
        }
        this.f1945c[i2] = i;
        this.f1946d[i2] = obj;
        this.f1947e = i2 + 1;
    }

    /* JADX DEBUG: Method merged with bridge method */
    /* renamed from: b */
    public C0391o clone() {
        try {
            C0391o c0391o = (C0391o) super.clone();
            c0391o.f1945c = (int[]) this.f1945c.clone();
            c0391o.f1946d = (Object[]) this.f1946d.clone();
            return c0391o;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public Object m2610c(int i) {
        return m2609d(i, null);
    }

    /* renamed from: d */
    public Object m2609d(int i, Object obj) {
        int m2654a = AbstractC0381e.m2654a(this.f1945c, this.f1947e, i);
        if (m2654a >= 0) {
            Object[] objArr = this.f1946d;
            if (objArr[m2654a] != f1944b) {
                return objArr[m2654a];
            }
        }
        return obj;
    }

    /* renamed from: e */
    public int m2608e(int i) {
        return this.f1945c[i];
    }

    /* renamed from: f */
    public void m2607f(int i, Object obj) {
        int m2654a = AbstractC0381e.m2654a(this.f1945c, this.f1947e, i);
        if (m2654a >= 0) {
            this.f1946d[m2654a] = obj;
            return;
        }
        int i2 = m2654a ^ (-1);
        int i3 = this.f1947e;
        if (i2 < i3) {
            Object[] objArr = this.f1946d;
            if (objArr[i2] == f1944b) {
                this.f1945c[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f1945c.length) {
            int m2650e = AbstractC0381e.m2650e(i3 + 1);
            int[] iArr = new int[m2650e];
            Object[] objArr2 = new Object[m2650e];
            int[] iArr2 = this.f1945c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1946d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1945c = iArr;
            this.f1946d = objArr2;
        }
        int i4 = this.f1947e - i2;
        if (i4 != 0) {
            int[] iArr3 = this.f1945c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4);
            Object[] objArr4 = this.f1946d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f1947e - i2);
        }
        this.f1945c[i2] = i;
        this.f1946d[i2] = obj;
        this.f1947e++;
    }

    /* renamed from: g */
    public int m2606g() {
        return this.f1947e;
    }

    /* renamed from: h */
    public Object m2605h(int i) {
        return this.f1946d[i];
    }

    public String toString() {
        if (m2606g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1947e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1947e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m2608e(i));
            sb.append('=');
            Object m2605h = m2605h(i);
            if (m2605h != this) {
                sb.append(m2605h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}