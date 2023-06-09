package p010b.p083u.p084e;

/* renamed from: b.u.e.a */
/* loaded from: classes.dex */
public final class C0914a {

    /* renamed from: a */
    public int f3525a;

    /* renamed from: b */
    public int f3526b;

    /* renamed from: c */
    public Object f3527c;

    /* renamed from: d */
    public int f3528d;

    public C0914a(int i, int i2, int i3, Object obj) {
        this.f3525a = i;
        this.f3526b = i2;
        this.f3528d = i3;
        this.f3527c = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0914a) {
            C0914a c0914a = (C0914a) obj;
            int i = this.f3525a;
            if (i != c0914a.f3525a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3528d - this.f3526b) == 1 && this.f3528d == c0914a.f3526b && this.f3526b == c0914a.f3528d) {
                return true;
            }
            if (this.f3528d == c0914a.f3528d && this.f3526b == c0914a.f3526b) {
                Object obj2 = this.f3527c;
                Object obj3 = c0914a.f3527c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f3525a * 31) + this.f3526b) * 31) + this.f3528d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f3525a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3526b);
        sb.append("c:");
        sb.append(this.f3528d);
        sb.append(",p:");
        sb.append(this.f3527c);
        sb.append("]");
        return sb.toString();
    }
}