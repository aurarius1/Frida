package p010b.p037h.p040b;

/* renamed from: b.h.b.g */
/* loaded from: classes.dex */
public class C0399g {

    /* renamed from: a */
    public final Object[] f1986a;

    /* renamed from: b */
    public int f1987b;

    public C0399g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1986a = new Object[i];
    }

    /* renamed from: a */
    public Object m2575a() {
        int i = this.f1987b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f1986a;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.f1987b = i - 1;
            return obj;
        }
        return null;
    }

    /* renamed from: b */
    public boolean m2574b(Object obj) {
        int i = this.f1987b;
        Object[] objArr = this.f1986a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.f1987b = i + 1;
            return true;
        }
        return false;
    }
}