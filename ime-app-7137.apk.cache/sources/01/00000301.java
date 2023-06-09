package p010b.p046j.p058l;

import android.graphics.Insets;
import android.view.WindowInsets;
import p010b.p046j.p050f.C0507b;

/* renamed from: b.j.l.z0 */
/* loaded from: classes.dex */
public class C0637z0 extends C0635y0 {

    /* renamed from: n */
    public C0507b f2807n;

    public C0637z0(C0573c1 c0573c1, WindowInsets windowInsets) {
        super(c0573c1, windowInsets);
        this.f2807n = null;
    }

    @Override // p010b.p046j.p058l.C0570b1
    /* renamed from: f */
    public C0507b mo2174f() {
        if (this.f2807n == null) {
            Insets mandatorySystemGestureInsets = this.f2802i.getMandatorySystemGestureInsets();
            this.f2807n = C0507b.m2385a(mandatorySystemGestureInsets.left, mandatorySystemGestureInsets.top, mandatorySystemGestureInsets.right, mandatorySystemGestureInsets.bottom);
        }
        return this.f2807n;
    }

    @Override // p010b.p046j.p058l.C0631w0, p010b.p046j.p058l.C0570b1
    /* renamed from: i */
    public C0573c1 mo2173i(int i, int i2, int i3, int i4) {
        return C0573c1.m2318i(this.f2802i.inset(i, i2, i3, i4));
    }

    @Override // p010b.p046j.p058l.C0633x0, p010b.p046j.p058l.C0570b1
    /* renamed from: n */
    public void mo2172n(C0507b c0507b) {
    }
}