package p010b.p046j.p058l;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import p000a.p001a.p002a.p004b.C0021s;

/* renamed from: b.j.l.y0 */
/* loaded from: classes.dex */
public class C0635y0 extends C0633x0 {
    public C0635y0(C0573c1 c0573c1, WindowInsets windowInsets) {
        super(c0573c1, windowInsets);
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: a */
    public C0573c1 mo2179a() {
        return C0573c1.m2318i(this.f2802i.consumeDisplayCutout());
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: e */
    public C0587e mo2178e() {
        DisplayCutout displayCutout = this.f2802i.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0587e(displayCutout);
    }

    @Override // p010b.p046j.p058l.C0631w0, p010b.p046j.p058l.C0570b1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0635y0) {
            C0635y0 c0635y0 = (C0635y0) obj;
            return C0021s.m3534a(this.f2802i, c0635y0.f2802i) && C0021s.m3534a(this.f2805l, c0635y0.f2805l);
        }
        return false;
    }

    @Override // p010b.p046j.p058l.C0570b1
    public int hashCode() {
        return this.f2802i.hashCode();
    }
}