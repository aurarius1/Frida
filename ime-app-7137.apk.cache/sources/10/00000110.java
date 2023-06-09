package p010b.p016c.p017k;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import p010b.p016c.p024p.InterfaceC0160a;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.AbstractC0619q0;

/* renamed from: b.c.k.z0 */
/* loaded from: classes.dex */
public class C0140z0 extends AbstractC0619q0 {

    /* renamed from: a */
    public final /* synthetic */ C0096d1 f1118a;

    public C0140z0(C0096d1 c0096d1) {
        this.f1118a = c0096d1;
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: a */
    public void mo2203a(View view) {
        View view2;
        C0096d1 c0096d1 = this.f1118a;
        if (c0096d1.f899r && (view2 = c0096d1.f890i) != null) {
            view2.setTranslationY(0.0f);
            this.f1118a.f887f.setTranslationY(0.0f);
        }
        this.f1118a.f887f.setVisibility(8);
        this.f1118a.f887f.setTransitioning(false);
        C0096d1 c0096d12 = this.f1118a;
        c0096d12.f903v = null;
        InterfaceC0160a interfaceC0160a = c0096d12.f894m;
        if (interfaceC0160a != null) {
            interfaceC0160a.mo2962d(c0096d12.f893l);
            c0096d12.f893l = null;
            c0096d12.f894m = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1118a.f886e;
        if (actionBarOverlayLayout != null) {
            AbstractC0605j0.m2271L(actionBarOverlayLayout);
        }
    }
}