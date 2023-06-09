package p210g.p211a.p212a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.C0126s0;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;

/* renamed from: g.a.a.k */
/* loaded from: classes.dex */
public class C2312k extends C0126s0 {
    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Q */
    public void mo15Q(Context context) {
        super.mo15Q(context);
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3251x;
    }

    @Override // p010b.p016c.p017k.C0126s0, p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v
    /* renamed from: R0 */
    public Dialog mo14R0(Bundle bundle) {
        this.f3164c0 = false;
        Dialog dialog = this.f3169h0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        C2310i c2310i = new C2310i(this.f3236i);
        DialogInterface$OnClickListenerC2309h dialogInterface$OnClickListenerC2309h = new DialogInterface$OnClickListenerC2309h(this, c2310i, (InterfaceC2304c) null, (InterfaceC2305d) null);
        Context m1866k = m1866k();
        int i = c2310i.f7465c;
        C0119p c0119p = i > 0 ? new C0119p(m1866k, i) : new C0119p(m1866k);
        c0119p.f1026a.f949n = false;
        c0119p.m3057g(c2310i.f7463a, dialogInterface$OnClickListenerC2309h);
        c0119p.m3059e(c2310i.f7464b, dialogInterface$OnClickListenerC2309h);
        c0119p.f1026a.f942g = c2310i.f7467e;
        return c0119p.m3063a();
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: a0 */
    public void mo13a0() {
        super.mo13a0();
    }
}