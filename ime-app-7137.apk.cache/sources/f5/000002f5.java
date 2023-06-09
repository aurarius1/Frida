package p010b.p046j.p058l;

import android.view.WindowInsets;
import p010b.p046j.p050f.C0507b;

/* renamed from: b.j.l.t0 */
/* loaded from: classes.dex */
public class C0625t0 extends C0629v0 {

    /* renamed from: b */
    public final WindowInsets.Builder f2790b;

    public C0625t0() {
        this.f2790b = new WindowInsets.Builder();
    }

    public C0625t0(C0573c1 c0573c1) {
        WindowInsets m2319h = c0573c1.m2319h();
        this.f2790b = m2319h != null ? new WindowInsets.Builder(m2319h) : new WindowInsets.Builder();
    }

    @Override // p010b.p046j.p058l.C0629v0
    /* renamed from: b */
    public C0573c1 mo2195b() {
        m2196a();
        C0573c1 m2318i = C0573c1.m2318i(this.f2790b.build());
        m2318i.f2676b.mo2189l(null);
        return m2318i;
    }

    @Override // p010b.p046j.p058l.C0629v0
    /* renamed from: c */
    public void mo2194c(C0507b c0507b) {
        this.f2790b.setStableInsets(c0507b.m2384b());
    }

    @Override // p010b.p046j.p058l.C0629v0
    /* renamed from: d */
    public void mo2193d(C0507b c0507b) {
        this.f2790b.setSystemWindowInsets(c0507b.m2384b());
    }
}