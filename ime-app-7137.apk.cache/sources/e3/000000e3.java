package p010b.p016c.p017k;

import android.view.View;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.AbstractC0619q0;

/* renamed from: b.c.k.d0 */
/* loaded from: classes.dex */
public class C0095d0 extends AbstractC0619q0 {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f880a;

    public C0095d0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0) {
        this.f880a = layoutInflater$Factory2C0120p0;
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: a */
    public void mo2203a(View view) {
        this.f880a.f1080w.setAlpha(1.0f);
        this.f880a.f1083z.m2208d(null);
        this.f880a.f1083z = null;
    }

    @Override // p010b.p046j.p058l.AbstractC0619q0, p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: b */
    public void mo2202b(View view) {
        this.f880a.f1080w.setVisibility(0);
        this.f880a.f1080w.sendAccessibilityEvent(32);
        if (this.f880a.f1080w.getParent() instanceof View) {
            AbstractC0605j0.m2271L((View) this.f880a.f1080w.getParent());
        }
    }
}