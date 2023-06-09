package p010b.p046j.p057k;

/* renamed from: b.j.k.c */
/* loaded from: classes.dex */
public class C0562c {

    /* renamed from: a */
    public final Object[] f2656a;

    /* renamed from: b */
    public int f2657b;

    public C0562c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2656a = new Object[i];
    }

    /* renamed from: a */
    public Object mo2331a() {
        int i = this.f2657b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f2656a;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.f2657b = i - 1;
            return obj;
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo2330b(Object obj) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f2657b;
            if (i2 >= i) {
                z = false;
                break;
            } else if (this.f2656a[i2] == obj) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.f2656a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.f2657b = i + 1;
            return true;
        }
        return false;
    }
}