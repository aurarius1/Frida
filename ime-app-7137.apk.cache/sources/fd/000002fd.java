package p010b.p046j.p058l;

import android.view.WindowInsets;
import p010b.p046j.p050f.C0507b;

/* renamed from: b.j.l.x0 */
/* loaded from: classes.dex */
public class C0633x0 extends C0631w0 {

    /* renamed from: m */
    public C0507b f2806m;

    public C0633x0(C0573c1 c0573c1, WindowInsets windowInsets) {
        super(c0573c1, windowInsets);
        this.f2806m = null;
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: b */
    public C0573c1 mo2183b() {
        return C0573c1.m2318i(this.f2802i.consumeStableInsets());
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: c */
    public C0573c1 mo2182c() {
        return C0573c1.m2318i(this.f2802i.consumeSystemWindowInsets());
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: g */
    public final C0507b mo2181g() {
        if (this.f2806m == null) {
            this.f2806m = C0507b.m2385a(this.f2802i.getStableInsetLeft(), this.f2802i.getStableInsetTop(), this.f2802i.getStableInsetRight(), this.f2802i.getStableInsetBottom());
        }
        return this.f2806m;
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: j */
    public boolean mo2180j() {
        return this.f2802i.isConsumed();
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: n */
    public void mo2172n(C0507b c0507b) {
        this.f2806m = c0507b;
    }
}