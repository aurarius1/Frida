package p010b.p046j.p058l;

import p000a.p001a.p002a.p004b.AbstractC0022t;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.l.e */
/* loaded from: classes.dex */
public final class C0587e {

    /* renamed from: a */
    public final Object f2708a;

    public C0587e(Object obj) {
        this.f2708a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0587e.class != obj.getClass()) {
            return false;
        }
        return AbstractC0022t.m3463w(this.f2708a, ((C0587e) obj).f2708a);
    }

    public int hashCode() {
        Object obj = this.f2708a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("DisplayCutoutCompat{");
        m1187i.append(this.f2708a);
        m1187i.append("}");
        return m1187i.toString();
    }
}