package p010b.p016c.p026q;

/* renamed from: b.c.q.q2 */
/* loaded from: classes.dex */
public class C0301q2 {

    /* renamed from: a */
    public int f1731a = 0;

    /* renamed from: b */
    public int f1732b = 0;

    /* renamed from: c */
    public int f1733c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1734d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1735e = 0;

    /* renamed from: f */
    public int f1736f = 0;

    /* renamed from: g */
    public boolean f1737g = false;

    /* renamed from: h */
    public boolean f1738h = false;

    /* renamed from: a */
    public void m2758a(int i, int i2) {
        this.f1733c = i;
        this.f1734d = i2;
        this.f1738h = true;
        if (this.f1737g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1731a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1732b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1731a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1732b = i2;
        }
    }
}