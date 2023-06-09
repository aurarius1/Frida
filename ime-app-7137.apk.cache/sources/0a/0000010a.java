package p010b.p016c.p017k;

/* renamed from: b.c.k.w0 */
/* loaded from: classes.dex */
public class C0134w0 {

    /* renamed from: a */
    public static C0134w0 f1105a;

    /* renamed from: b */
    public long f1106b;

    /* renamed from: c */
    public long f1107c;

    /* renamed from: d */
    public int f1108d;

    /* renamed from: a */
    public void m3002a(long j, double d, double d2) {
        float f;
        float f2 = ((float) (j - 946728000000L)) / 8.64E7f;
        double d3 = (0.01720197f * f2) + 6.24006f;
        Double.isNaN(d3);
        double sin = (Math.sin(f * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = f2 - 9.0E-4f;
        Double.isNaN(d5);
        double round = ((float) Math.round(d5 - d4)) + 9.0E-4f;
        Double.isNaN(round);
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + round + d4;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d6 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d6))) / (Math.cos(asin) * Math.cos(d6));
        if (sin3 >= 1.0d) {
            this.f1108d = 1;
        } else if (sin3 > -1.0d) {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            Double.isNaN(acos);
            this.f1106b = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f1107c = round2;
            if (round2 >= j || this.f1106b <= j) {
                this.f1108d = 1;
                return;
            } else {
                this.f1108d = 0;
                return;
            }
        } else {
            this.f1108d = 0;
        }
        this.f1106b = -1L;
        this.f1107c = -1L;
    }
}