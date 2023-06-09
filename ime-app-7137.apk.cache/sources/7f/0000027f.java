package p010b.p046j.p050f;

import android.graphics.Insets;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.f.b */
/* loaded from: classes.dex */
public final class C0507b {

    /* renamed from: a */
    public static final C0507b f2541a = new C0507b(0, 0, 0, 0);

    /* renamed from: b */
    public final int f2542b;

    /* renamed from: c */
    public final int f2543c;

    /* renamed from: d */
    public final int f2544d;

    /* renamed from: e */
    public final int f2545e;

    public C0507b(int i, int i2, int i3, int i4) {
        this.f2542b = i;
        this.f2543c = i2;
        this.f2544d = i3;
        this.f2545e = i4;
    }

    /* renamed from: a */
    public static C0507b m2385a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f2541a : new C0507b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public Insets m2384b() {
        return Insets.of(this.f2542b, this.f2543c, this.f2544d, this.f2545e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0507b.class != obj.getClass()) {
            return false;
        }
        C0507b c0507b = (C0507b) obj;
        return this.f2545e == c0507b.f2545e && this.f2542b == c0507b.f2542b && this.f2544d == c0507b.f2544d && this.f2543c == c0507b.f2543c;
    }

    public int hashCode() {
        return (((((this.f2542b * 31) + this.f2543c) * 31) + this.f2544d) * 31) + this.f2545e;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("Insets{left=");
        m1187i.append(this.f2542b);
        m1187i.append(", top=");
        m1187i.append(this.f2543c);
        m1187i.append(", right=");
        m1187i.append(this.f2544d);
        m1187i.append(", bottom=");
        m1187i.append(this.f2545e);
        m1187i.append('}');
        return m1187i.toString();
    }
}