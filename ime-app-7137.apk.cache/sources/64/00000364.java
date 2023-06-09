package p010b.p067m.p068d;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: b.m.d.r */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC0736r implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0751v f3107b;

    public DialogInterface$OnCancelListenerC0736r(DialogInterface$OnCancelListenerC0751v dialogInterface$OnCancelListenerC0751v) {
        this.f3107b = dialogInterface$OnCancelListenerC0751v;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    @SuppressLint({"SyntheticAccessor"})
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface$OnCancelListenerC0751v dialogInterface$OnCancelListenerC0751v = this.f3107b;
        Dialog dialog = dialogInterface$OnCancelListenerC0751v.f3169h0;
        if (dialog != null) {
            dialogInterface$OnCancelListenerC0751v.onCancel(dialog);
        }
    }
}