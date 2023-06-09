package p010b.p016c.p026q;

import android.view.View;
import p010b.p046j.p058l.AbstractC0619q0;

/* renamed from: b.c.q.z3 */
/* loaded from: classes.dex */
public class C0347z3 extends AbstractC0619q0 {

    /* renamed from: a */
    public boolean f1836a = false;

    /* renamed from: b */
    public final /* synthetic */ int f1837b;

    /* renamed from: c */
    public final /* synthetic */ C0215a4 f1838c;

    public C0347z3(C0215a4 c0215a4, int i) {
        this.f1838c = c0215a4;
        this.f1837b = i;
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: a */
    public void mo2203a(View view) {
        if (this.f1836a) {
            return;
        }
        this.f1838c.f1458a.setVisibility(this.f1837b);
    }

    @Override // p010b.p046j.p058l.AbstractC0619q0, p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: b */
    public void mo2202b(View view) {
        this.f1838c.f1458a.setVisibility(0);
    }

    @Override // p010b.p046j.p058l.AbstractC0619q0, p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: c */
    public void mo2201c(View view) {
        this.f1836a = true;
    }
}