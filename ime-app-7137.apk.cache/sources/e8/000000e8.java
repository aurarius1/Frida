package p010b.p016c.p017k;

import android.view.View;
import android.widget.PopupWindow;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.AbstractC0619q0;

/* renamed from: b.c.k.f0 */
/* loaded from: classes.dex */
public class C0100f0 extends AbstractC0619q0 {

    /* renamed from: a */
    public final /* synthetic */ C0102g0 f914a;

    public C0100f0(C0102g0 c0102g0) {
        this.f914a = c0102g0;
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: a */
    public void mo2203a(View view) {
        this.f914a.f918b.f1080w.setVisibility(8);
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f914a.f918b;
        PopupWindow popupWindow = layoutInflater$Factory2C0120p0.f1081x;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (layoutInflater$Factory2C0120p0.f1080w.getParent() instanceof View) {
            AbstractC0605j0.m2271L((View) this.f914a.f918b.f1080w.getParent());
        }
        this.f914a.f918b.f1080w.m3439e();
        this.f914a.f918b.f1083z.m2208d(null);
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p02 = this.f914a.f918b;
        layoutInflater$Factory2C0120p02.f1083z = null;
        AbstractC0605j0.m2271L(layoutInflater$Factory2C0120p02.f1036C);
    }
}