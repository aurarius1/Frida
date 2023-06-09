package p093c.p097b.p122u;

/* renamed from: c.b.u.v */
/* loaded from: classes.dex */
public class C1503v {

    /* renamed from: a */
    public C1500u[] f4862a;

    /* renamed from: b */
    public int f4863b;

    public C1503v() {
        this.f4863b = 0;
        this.f4862a = new C1500u[2];
    }

    public C1503v(int i) {
        this.f4863b = 0;
        this.f4862a = new C1500u[i];
    }

    /* renamed from: a */
    public void m982a(int i) {
        int i2 = this.f4863b - 1;
        this.f4863b = i2;
        if (i2 > 0) {
            while (i < this.f4863b) {
                C1500u[] c1500uArr = this.f4862a;
                int i3 = i + 1;
                c1500uArr[i] = c1500uArr[i3];
                i = i3;
            }
        }
    }
}