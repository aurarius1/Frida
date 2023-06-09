package p093c.p097b.p127w;

/* renamed from: c.b.w.i */
/* loaded from: classes.dex */
public class C1543i {

    /* renamed from: a */
    public int f4928a = 0;

    /* renamed from: b */
    public final int[] f4929b = new int[2048];

    /* renamed from: c */
    public final int[] f4930c = new int[2048];

    /* renamed from: d */
    public int f4931d = 0;

    /* renamed from: e */
    public final int[] f4932e = new int[8192];

    public C1543i(AbstractC1540f abstractC1540f) {
    }

    /* renamed from: a */
    public void m950a(int i) {
        int[] iArr = this.f4932e;
        int i2 = this.f4931d;
        iArr[i2] = this.f4929b[i];
        int i3 = i2 + 1;
        this.f4931d = i3;
        iArr[i3] = this.f4930c[i];
        this.f4931d = i3 + 1;
    }

    /* renamed from: b */
    public void m949b(int i, int i2) {
        int i3 = this.f4928a;
        if (2048 == i3) {
            return;
        }
        this.f4929b[i3] = i;
        this.f4930c[i3] = i2;
        this.f4928a = i3 + 1;
    }

    /* renamed from: c */
    public void m948c() {
        this.f4928a = 0;
        this.f4931d = 0;
    }
}