package p010b.p082t;

import android.content.DialogInterface;

/* renamed from: b.t.j */
/* loaded from: classes.dex */
public class DialogInterface$OnClickListenerC0876j implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0878k f3478b;

    public DialogInterface$OnClickListenerC0876j(C0878k c0878k) {
        this.f3478b = c0878k;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        C0878k c0878k = this.f3478b;
        c0878k.f3480u0 = i;
        c0878k.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}