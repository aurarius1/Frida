package p093c.p097b.p130z;

/* renamed from: c.b.z.c0 */
/* loaded from: classes.dex */
public class C1663c0 {

    /* renamed from: a */
    public C1661b0[] f5111a = new C1661b0[30];

    /* renamed from: b */
    public int f5112b = 0;

    /* renamed from: c */
    public int f5113c = 0;

    /* renamed from: d */
    public int f5114d = 0;

    /* renamed from: a */
    public C1661b0 m932a() {
        C1661b0[] c1661b0Arr = this.f5111a;
        int i = this.f5112b;
        C1661b0 c1661b0 = c1661b0Arr[i];
        c1661b0Arr[i] = null;
        this.f5112b = (i + 1) % 30;
        this.f5114d--;
        return c1661b0;
    }

    /* renamed from: b */
    public boolean m931b() {
        return this.f5114d > 0;
    }

    /* renamed from: c */
    public void m930c(C1661b0 c1661b0) {
        C1661b0[] c1661b0Arr = this.f5111a;
        int i = this.f5113c;
        c1661b0Arr[i] = c1661b0;
        this.f5113c = (i + 1) % 30;
        this.f5114d++;
    }
}