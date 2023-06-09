package p010b.p046j.p061m;

/* renamed from: b.j.m.a */
/* loaded from: classes.dex */
public class C0638a {

    /* renamed from: a */
    public int f2808a;

    /* renamed from: b */
    public int f2809b;

    /* renamed from: c */
    public float f2810c;

    /* renamed from: d */
    public float f2811d;

    /* renamed from: j */
    public float f2817j;

    /* renamed from: k */
    public int f2818k;

    /* renamed from: e */
    public long f2812e = Long.MIN_VALUE;

    /* renamed from: i */
    public long f2816i = -1;

    /* renamed from: f */
    public long f2813f = 0;

    /* renamed from: g */
    public int f2814g = 0;

    /* renamed from: h */
    public int f2815h = 0;

    /* renamed from: a */
    public final float m2171a(long j) {
        long j2 = this.f2812e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f2816i;
        if (j3 < 0 || j < j3) {
            return View$OnTouchListenerC0641d.m2169b(((float) (j - j2)) / this.f2808a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f2817j;
        return (View$OnTouchListenerC0641d.m2169b(((float) (j - j3)) / this.f2818k, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}