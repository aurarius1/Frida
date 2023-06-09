package p010b.p016c.p024p.p025m;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: b.c.p.m.e */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC0180e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ View$OnKeyListenerC0190j f1293b;

    public ViewTreeObserver$OnGlobalLayoutListenerC0180e(View$OnKeyListenerC0190j view$OnKeyListenerC0190j) {
        this.f1293b = view$OnKeyListenerC0190j;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f1293b.mo2835b() || this.f1293b.f1316k.size() <= 0 || ((C0188i) this.f1293b.f1316k.get(0)).f1301a.f1557C) {
            return;
        }
        View view = this.f1293b.f1323r;
        if (view == null || !view.isShown()) {
            this.f1293b.dismiss();
            return;
        }
        for (C0188i c0188i : this.f1293b.f1316k) {
            c0188i.f1301a.mo2833f();
        }
    }
}