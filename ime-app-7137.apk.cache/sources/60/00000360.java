package p010b.p067m.p068d;

import android.annotation.SuppressLint;

/* renamed from: b.m.d.q */
/* loaded from: classes.dex */
public class RunnableC0732q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0751v f3099b;

    public RunnableC0732q(DialogInterface$OnCancelListenerC0751v dialogInterface$OnCancelListenerC0751v) {
        this.f3099b = dialogInterface$OnCancelListenerC0751v;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        DialogInterface$OnCancelListenerC0751v dialogInterface$OnCancelListenerC0751v = this.f3099b;
        dialogInterface$OnCancelListenerC0751v.f3161Z.onDismiss(dialogInterface$OnCancelListenerC0751v.f3169h0);
    }
}