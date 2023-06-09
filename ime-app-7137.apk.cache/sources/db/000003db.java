package p010b.p080s.p081a;

import android.graphics.Color;
import java.util.Arrays;
import p010b.p046j.p050f.AbstractC0506a;

/* renamed from: b.s.a.e */
/* loaded from: classes.dex */
public final class C0855e {

    /* renamed from: a */
    public final int f3424a;

    /* renamed from: b */
    public final int f3425b;

    /* renamed from: c */
    public final int f3426c;

    /* renamed from: d */
    public final int f3427d;

    /* renamed from: e */
    public final int f3428e;

    /* renamed from: f */
    public boolean f3429f;

    /* renamed from: g */
    public int f3430g;

    /* renamed from: h */
    public int f3431h;

    /* renamed from: i */
    public float[] f3432i;

    public C0855e(int i, int i2) {
        this.f3424a = Color.red(i);
        this.f3425b = Color.green(i);
        this.f3426c = Color.blue(i);
        this.f3427d = i;
        this.f3428e = i2;
    }

    /* renamed from: a */
    public final void m1763a() {
        int m2386h;
        if (this.f3429f) {
            return;
        }
        int m2390d = AbstractC0506a.m2390d(-1, this.f3427d, 4.5f);
        int m2390d2 = AbstractC0506a.m2390d(-1, this.f3427d, 3.0f);
        if (m2390d == -1 || m2390d2 == -1) {
            int m2390d3 = AbstractC0506a.m2390d(-16777216, this.f3427d, 4.5f);
            int m2390d4 = AbstractC0506a.m2390d(-16777216, this.f3427d, 3.0f);
            if (m2390d3 == -1 || m2390d4 == -1) {
                this.f3431h = m2390d != -1 ? AbstractC0506a.m2386h(-1, m2390d) : AbstractC0506a.m2386h(-16777216, m2390d3);
                this.f3430g = m2390d2 != -1 ? AbstractC0506a.m2386h(-1, m2390d2) : AbstractC0506a.m2386h(-16777216, m2390d4);
                this.f3429f = true;
                return;
            }
            this.f3431h = AbstractC0506a.m2386h(-16777216, m2390d3);
            m2386h = AbstractC0506a.m2386h(-16777216, m2390d4);
        } else {
            this.f3431h = AbstractC0506a.m2386h(-1, m2390d);
            m2386h = AbstractC0506a.m2386h(-1, m2390d2);
        }
        this.f3430g = m2386h;
        this.f3429f = true;
    }

    /* renamed from: b */
    public float[] m1762b() {
        if (this.f3432i == null) {
            this.f3432i = new float[3];
        }
        AbstractC0506a.m2393a(this.f3424a, this.f3425b, this.f3426c, this.f3432i);
        return this.f3432i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0855e.class != obj.getClass()) {
            return false;
        }
        C0855e c0855e = (C0855e) obj;
        return this.f3428e == c0855e.f3428e && this.f3427d == c0855e.f3427d;
    }

    public int hashCode() {
        return (this.f3427d * 31) + this.f3428e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0855e.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f3427d));
        sb.append(']');
        sb.append(" [HSL: ");
        sb.append(Arrays.toString(m1762b()));
        sb.append(']');
        sb.append(" [Population: ");
        sb.append(this.f3428e);
        sb.append(']');
        sb.append(" [Title Text: #");
        m1763a();
        sb.append(Integer.toHexString(this.f3430g));
        sb.append(']');
        sb.append(" [Body Text: #");
        m1763a();
        sb.append(Integer.toHexString(this.f3431h));
        sb.append(']');
        return sb.toString();
    }
}