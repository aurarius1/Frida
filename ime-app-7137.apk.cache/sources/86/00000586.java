package p093c.p097b.p108i0.p110p.p112b2;

/* renamed from: c.b.i0.p.b2.g0 */
/* loaded from: classes.dex */
public final class C1282g0 {

    /* renamed from: a */
    public final String f4491a;

    /* renamed from: b */
    public final CharSequence f4492b;

    public C1282g0(String str, CharSequence charSequence) {
        this.f4491a = str;
        this.f4492b = charSequence;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj instanceof C1282g0) {
            String str2 = ((C1282g0) obj).f4491a;
            if (str2 == null && this.f4491a == null) {
                return true;
            }
            if (str2 == null || (str = this.f4491a) == null) {
                return false;
            }
            return str.equals(str2);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4491a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return String.format("%s - (%s)", this.f4492b, this.f4491a);
    }
}