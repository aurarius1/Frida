package p010b.p016c.p024p;

import android.view.View;
import p010b.p046j.p058l.AbstractC0619q0;
import p010b.p046j.p058l.InterfaceC0617p0;

/* renamed from: b.c.p.k */
/* loaded from: classes.dex */
public class C0170k extends AbstractC0619q0 {

    /* renamed from: a */
    public boolean f1252a = false;

    /* renamed from: b */
    public int f1253b = 0;

    /* renamed from: c */
    public final /* synthetic */ C0171l f1254c;

    public C0170k(C0171l c0171l) {
        this.f1254c = c0171l;
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: a */
    public void mo2203a(View view) {
        int i = this.f1253b + 1;
        this.f1253b = i;
        if (i == this.f1254c.f1255a.size()) {
            InterfaceC0617p0 interfaceC0617p0 = this.f1254c.f1258d;
            if (interfaceC0617p0 != null) {
                interfaceC0617p0.mo2203a(null);
            }
            this.f1253b = 0;
            this.f1252a = false;
            this.f1254c.f1259e = false;
        }
    }

    @Override // p010b.p046j.p058l.AbstractC0619q0, p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: b */
    public void mo2202b(View view) {
        if (this.f1252a) {
            return;
        }
        this.f1252a = true;
        InterfaceC0617p0 interfaceC0617p0 = this.f1254c.f1258d;
        if (interfaceC0617p0 != null) {
            interfaceC0617p0.mo2202b(null);
        }
    }
}