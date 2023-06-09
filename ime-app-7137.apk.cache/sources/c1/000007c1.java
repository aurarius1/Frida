package p093c.p145g.p146a.p147a.p154g0;

/* renamed from: c.g.a.a.g0.k */
/* loaded from: classes.dex */
public class C1853k extends AbstractC1846d {
    @Override // p093c.p145g.p146a.p147a.p154g0.AbstractC1846d
    /* renamed from: a */
    public void mo728a(C1866x c1866x, float f, float f2, float f3) {
        c1866x.m707d(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        C1862t c1862t = new C1862t(0.0f, 0.0f, f4, f4);
        c1862t.f5728g = 180.0f;
        c1862t.f5729h = f;
        c1866x.f5740g.add(c1862t);
        C1860r c1860r = new C1860r(c1862t);
        float f5 = 180.0f + f;
        boolean z = f < 0.0f;
        float f6 = z ? 0.0f : 180.0f;
        float f7 = z ? (180.0f + f5) % 360.0f : f5;
        c1866x.m710a(f6);
        c1866x.f5741h.add(c1860r);
        c1866x.f5738e = f7;
        float f8 = (0.0f + f4) * 0.5f;
        float f9 = (f4 - 0.0f) / 2.0f;
        double d = f5;
        c1866x.f5736c = (((float) Math.cos(Math.toRadians(d))) * f9) + f8;
        c1866x.f5737d = (f9 * ((float) Math.sin(Math.toRadians(d)))) + f8;
    }
}