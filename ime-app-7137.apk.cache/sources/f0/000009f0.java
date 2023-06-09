package p210g.p211a.p212a;

import java.util.Arrays;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p210g.p211a.p212a.p213l.AbstractC2317e;

/* renamed from: g.a.a.f */
/* loaded from: classes.dex */
public final class C2307f {

    /* renamed from: a */
    public final AbstractC2317e f7452a;

    /* renamed from: b */
    public final String[] f7453b;

    /* renamed from: c */
    public final int f7454c;

    /* renamed from: d */
    public final String f7455d;

    /* renamed from: e */
    public final String f7456e;

    /* renamed from: f */
    public final String f7457f;

    /* renamed from: g */
    public final int f7458g;

    public C2307f(AbstractC2317e abstractC2317e, String[] strArr, int i, String str, String str2, String str3, int i2, AbstractC2306e abstractC2306e) {
        this.f7452a = abstractC2317e;
        this.f7453b = (String[]) strArr.clone();
        this.f7454c = i;
        this.f7455d = str;
        this.f7456e = str2;
        this.f7457f = str3;
        this.f7458g = i2;
    }

    /* renamed from: a */
    public String[] m16a() {
        return (String[]) this.f7453b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2307f.class != obj.getClass()) {
            return false;
        }
        C2307f c2307f = (C2307f) obj;
        return Arrays.equals(this.f7453b, c2307f.f7453b) && this.f7454c == c2307f.f7454c;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f7453b) * 31) + this.f7454c;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("PermissionRequest{mHelper=");
        m1187i.append(this.f7452a);
        m1187i.append(", mPerms=");
        m1187i.append(Arrays.toString(this.f7453b));
        m1187i.append(", mRequestCode=");
        m1187i.append(this.f7454c);
        m1187i.append(", mRationale='");
        m1187i.append(this.f7455d);
        m1187i.append('\'');
        m1187i.append(", mPositiveButtonText='");
        m1187i.append(this.f7456e);
        m1187i.append('\'');
        m1187i.append(", mNegativeButtonText='");
        m1187i.append(this.f7457f);
        m1187i.append('\'');
        m1187i.append(", mTheme=");
        m1187i.append(this.f7458g);
        m1187i.append('}');
        return m1187i.toString();
    }
}