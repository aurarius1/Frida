package p010b.p016c.p017k;

import android.view.View;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0573c1;
import p010b.p046j.p058l.InterfaceC0622s;

/* renamed from: b.c.k.y */
/* loaded from: classes.dex */
public class C0137y implements InterfaceC0622s {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f1112a;

    public C0137y(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0) {
        this.f1112a = layoutInflater$Factory2C0120p0;
    }

    @Override // p010b.p046j.p058l.InterfaceC0622s
    /* renamed from: a */
    public C0573c1 mo763a(View view, C0573c1 c0573c1) {
        int m2323d = c0573c1.m2323d();
        int m3041N = this.f1112a.m3041N(c0573c1, null);
        if (m2323d != m3041N) {
            c0573c1 = c0573c1.m2320g(c0573c1.m2325b(), m3041N, c0573c1.m2324c(), c0573c1.m2326a());
        }
        return AbstractC0605j0.m2279D(view, c0573c1);
    }
}