package p010b.p016c.p017k;

import android.app.Dialog;
import android.os.Bundle;
import p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v;

/* renamed from: b.c.k.s0 */
/* loaded from: classes.dex */
public class C0126s0 extends DialogInterface$OnCancelListenerC0751v {
    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v
    /* renamed from: R0 */
    public Dialog mo14R0(Bundle bundle) {
        return new DialogC0124r0(m1866k(), this.f3163b0);
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v
    /* renamed from: T0 */
    public void mo1937T0(Dialog dialog, int i) {
        if (dialog instanceof DialogC0124r0) {
            DialogC0124r0 dialogC0124r0 = (DialogC0124r0) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            dialogC0124r0.m3029a().mo3008k(1);
            return;
        }
        super.mo1937T0(dialog, i);
    }
}