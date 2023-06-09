package p010b.p080s.p081a;

/* renamed from: b.s.a.b */
/* loaded from: classes.dex */
public class C0852b {

    /* renamed from: a */
    public int f3408a;

    /* renamed from: b */
    public int f3409b;

    /* renamed from: c */
    public int f3410c;

    /* renamed from: d */
    public int f3411d;

    /* renamed from: e */
    public int f3412e;

    /* renamed from: f */
    public int f3413f;

    /* renamed from: g */
    public int f3414g;

    /* renamed from: h */
    public int f3415h;

    /* renamed from: i */
    public int f3416i;

    /* renamed from: j */
    public final /* synthetic */ C0853c f3417j;

    public C0852b(C0853c c0853c, int i, int i2) {
        this.f3417j = c0853c;
        this.f3408a = i;
        this.f3409b = i2;
        m1769a();
    }

    /* renamed from: a */
    public final void m1769a() {
        C0853c c0853c = this.f3417j;
        int[] iArr = c0853c.f3419b;
        int[] iArr2 = c0853c.f3420c;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f3408a; i8 <= this.f3409b; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i4) {
                i4 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
        }
        this.f3411d = i;
        this.f3412e = i4;
        this.f3413f = i2;
        this.f3414g = i5;
        this.f3415h = i3;
        this.f3416i = i6;
        this.f3410c = i7;
    }

    /* renamed from: b */
    public final int m1768b() {
        return ((this.f3416i - this.f3415h) + 1) * ((this.f3414g - this.f3413f) + 1) * ((this.f3412e - this.f3411d) + 1);
    }
}