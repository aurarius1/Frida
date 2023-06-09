package p093c.p145g.p146a.p147a.p154g0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.g.a.a.g0.x */
/* loaded from: classes.dex */
public class C1866x {
    @Deprecated

    /* renamed from: a */
    public float f5734a;
    @Deprecated

    /* renamed from: b */
    public float f5735b;
    @Deprecated

    /* renamed from: c */
    public float f5736c;
    @Deprecated

    /* renamed from: d */
    public float f5737d;
    @Deprecated

    /* renamed from: e */
    public float f5738e;
    @Deprecated

    /* renamed from: f */
    public float f5739f;

    /* renamed from: g */
    public final List f5740g = new ArrayList();

    /* renamed from: h */
    public final List f5741h = new ArrayList();

    public C1866x() {
        m707d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m710a(float f) {
        float f2 = this.f5738e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f5736c;
        float f5 = this.f5737d;
        C1862t c1862t = new C1862t(f4, f5, f4, f5);
        c1862t.f5728g = this.f5738e;
        c1862t.f5729h = f3;
        this.f5741h.add(new C1860r(c1862t));
        this.f5738e = f;
    }

    /* renamed from: b */
    public void m709b(Matrix matrix, Path path) {
        int size = this.f5740g.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1864v) this.f5740g.get(i)).mo712a(matrix, path);
        }
    }

    /* renamed from: c */
    public void m708c(float f, float f2) {
        C1863u c1863u = new C1863u();
        c1863u.f5730b = f;
        c1863u.f5731c = f2;
        this.f5740g.add(c1863u);
        C1861s c1861s = new C1861s(c1863u, this.f5736c, this.f5737d);
        m710a(c1861s.m713b() + 270.0f);
        this.f5741h.add(c1861s);
        this.f5738e = c1861s.m713b() + 270.0f;
        this.f5736c = f;
        this.f5737d = f2;
    }

    /* renamed from: d */
    public void m707d(float f, float f2, float f3, float f4) {
        this.f5734a = f;
        this.f5735b = f2;
        this.f5736c = f;
        this.f5737d = f2;
        this.f5738e = f3;
        this.f5739f = (f3 + f4) % 360.0f;
        this.f5740g.clear();
        this.f5741h.clear();
    }
}