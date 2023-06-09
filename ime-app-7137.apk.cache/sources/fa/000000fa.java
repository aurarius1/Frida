package p010b.p016c.p017k;

import android.view.Window;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0177c0;

/* renamed from: b.c.k.o0 */
/* loaded from: classes.dex */
public final class C0118o0 implements InterfaceC0177c0 {

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f1025b;

    public C0118o0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0) {
        this.f1025b = layoutInflater$Factory2C0120p0;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0177c0
    /* renamed from: a */
    public void mo2734a(C0199p c0199p, boolean z) {
        C0199p mo2928k = c0199p.mo2928k();
        boolean z2 = mo2928k != c0199p;
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f1025b;
        if (z2) {
            c0199p = mo2928k;
        }
        C0116n0 m3053B = layoutInflater$Factory2C0120p0.m3053B(c0199p);
        if (m3053B != null) {
            if (!z2) {
                this.f1025b.m3036u(m3053B, z);
                return;
            }
            this.f1025b.m3038s(m3053B.f964a, m3053B, mo2928k);
            this.f1025b.m3036u(m3053B, true);
        }
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0177c0
    /* renamed from: b */
    public boolean mo2733b(C0199p c0199p) {
        Window.Callback m3050E;
        if (c0199p == c0199p.mo2928k()) {
            LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f1025b;
            if (!layoutInflater$Factory2C0120p0.f1041H || (m3050E = layoutInflater$Factory2C0120p0.m3050E()) == null || this.f1025b.f1053T) {
                return true;
            }
            m3050E.onMenuOpened(108, c0199p);
            return true;
        }
        return true;
    }
}