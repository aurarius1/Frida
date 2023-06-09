package p010b.p067m.p068d;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: b.m.d.s */
/* loaded from: classes.dex */
public class DialogInterface$OnDismissListenerC0740s implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0751v f3117b;

    public DialogInterface$OnDismissListenerC0740s(DialogInterface$OnCancelListenerC0751v dialogInterface$OnCancelListenerC0751v) {
        this.f3117b = dialogInterface$OnCancelListenerC0751v;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @SuppressLint({"SyntheticAccessor"})
    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface$OnCancelListenerC0751v dialogInterface$OnCancelListenerC0751v = this.f3117b;
        Dialog dialog = dialogInterface$OnCancelListenerC0751v.f3169h0;
        if (dialog != null) {
            dialogInterface$OnCancelListenerC0751v.onDismiss(dialog);
        }
    }
}