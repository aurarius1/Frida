package p010b.p046j.p057k;

import p000a.p001a.p002a.p004b.AbstractC0022t;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.k.b */
/* loaded from: classes.dex */
public class C0561b {

    /* renamed from: a */
    public final Object f2654a;

    /* renamed from: b */
    public final Object f2655b;

    public C0561b(Object obj, Object obj2) {
        this.f2654a = obj;
        this.f2655b = obj2;
    }

    /* renamed from: a */
    public static C0561b m2332a(Object obj, Object obj2) {
        return new C0561b(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0561b) {
            C0561b c0561b = (C0561b) obj;
            return AbstractC0022t.m3463w(c0561b.f2654a, this.f2654a) && AbstractC0022t.m3463w(c0561b.f2655b, this.f2655b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f2654a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2655b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("Pair{");
        m1187i.append(this.f2654a);
        m1187i.append(" ");
        m1187i.append(this.f2655b);
        m1187i.append("}");
        return m1187i.toString();
    }
}