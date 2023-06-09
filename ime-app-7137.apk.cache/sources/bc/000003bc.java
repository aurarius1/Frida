package p010b.p077q;

import android.media.session.MediaSessionManager;
import p000a.p001a.p002a.p004b.AbstractC0022t;

/* renamed from: b.q.k0 */
/* loaded from: classes.dex */
public final class C0824k0 {

    /* renamed from: a */
    public final MediaSessionManager.RemoteUserInfo f3339a;

    public C0824k0(String str, int i, int i2) {
        this.f3339a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0824k0) {
            return this.f3339a.equals(((C0824k0) obj).f3339a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0022t.m3522L(this.f3339a);
    }
}