package p183e.p184a.p190p.p200h;

import java.io.Serializable;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: e.a.p.h.e */
/* loaded from: classes.dex */
public final class C2263e implements Serializable {

    /* renamed from: b */
    public final Throwable f7388b;

    public C2263e(Throwable th) {
        this.f7388b = th;
    }

    public boolean equals(Object obj) {
        Throwable th;
        Throwable th2;
        return (obj instanceof C2263e) && ((th = this.f7388b) == (th2 = ((C2263e) obj).f7388b) || (th != null && th.equals(th2)));
    }

    public int hashCode() {
        return this.f7388b.hashCode();
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("NotificationLite.Error[");
        m1187i.append(this.f7388b);
        m1187i.append("]");
        return m1187i.toString();
    }
}