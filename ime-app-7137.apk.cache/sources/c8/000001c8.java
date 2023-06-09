package p010b.p016c.p026q;

import android.view.ViewTreeObserver;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.q.v0 */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC0324v0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ C0334x0 f1780b;

    public ViewTreeObserver$OnGlobalLayoutListenerC0324v0(C0334x0 c0334x0) {
        this.f1780b = c0334x0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C0334x0 c0334x0 = this.f1780b;
        C0212a1 c0212a1 = c0334x0.f1809I;
        c0334x0.getClass();
        if (!(AbstractC0605j0.m2233y(c0212a1) && c0212a1.getGlobalVisibleRect(c0334x0.f1807G))) {
            this.f1780b.dismiss();
            return;
        }
        this.f1780b.m2719t();
        this.f1780b.mo2833f();
    }
}