package p093c.p097b.p130z;

/* renamed from: c.b.z.b0 */
/* loaded from: classes.dex */
public class C1661b0 {

    /* renamed from: a */
    public C1768z f5103a;

    /* renamed from: b */
    public int f5104b;

    /* renamed from: c */
    public int f5105c;

    /* renamed from: d */
    public int f5106d;

    /* renamed from: e */
    public int f5107e;

    /* renamed from: f */
    public int f5108f;

    /* renamed from: g */
    public final /* synthetic */ C1665d0 f5109g;

    public C1661b0(C1665d0 c1665d0) {
        this.f5109g = c1665d0;
        m934b();
    }

    /* renamed from: a */
    public static int m935a(C1661b0 c1661b0, int i) {
        C1768z m815a = c1661b0.f5103a.m815a(i);
        c1661b0.f5103a = m815a;
        if (m815a == null) {
            c1661b0.m934b();
            return 1;
        }
        if (i > 0) {
            c1661b0.f5104b++;
        }
        int i2 = c1661b0.f5105c + 1;
        c1661b0.f5105c = i2;
        int i3 = m815a.f5444b;
        if (i3 != 0) {
            c1661b0.f5106d = i3;
            c1661b0.f5107e = i2;
            c1661b0.f5108f = c1661b0.f5104b;
            if (i3 == -4097) {
                return 2;
            }
            if (m815a.f5443a != null) {
                return 4;
            }
            c1661b0.m934b();
            return 5;
        }
        return 3;
    }

    /* renamed from: b */
    public final void m934b() {
        this.f5103a = this.f5109g.f5116a;
        this.f5105c = 0;
        this.f5104b = 0;
    }
}