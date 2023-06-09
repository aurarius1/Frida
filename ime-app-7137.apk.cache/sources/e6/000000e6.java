package p010b.p016c.p017k;

import android.view.Window;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0177c0;

/* renamed from: b.c.k.e0 */
/* loaded from: classes.dex */
public final class C0098e0 implements InterfaceC0177c0 {

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f910b;

    public C0098e0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0) {
        this.f910b = layoutInflater$Factory2C0120p0;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0177c0
    /* renamed from: a */
    public void mo2734a(C0199p c0199p, boolean z) {
        this.f910b.m3037t(c0199p);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0177c0
    /* renamed from: b */
    public boolean mo2733b(C0199p c0199p) {
        Window.Callback m3050E = this.f910b.m3050E();
        if (m3050E != null) {
            m3050E.onMenuOpened(108, c0199p);
            return true;
        }
        return true;
    }
}