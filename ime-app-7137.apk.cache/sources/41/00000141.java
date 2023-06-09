package p010b.p016c.p024p.p025m;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: b.c.p.m.i0 */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC0189i0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ View$OnKeyListenerC0193k0 f1304b;

    public ViewTreeObserver$OnGlobalLayoutListenerC0189i0(View$OnKeyListenerC0193k0 view$OnKeyListenerC0193k0) {
        this.f1304b = view$OnKeyListenerC0193k0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f1304b.mo2835b()) {
            View$OnKeyListenerC0193k0 view$OnKeyListenerC0193k0 = this.f1304b;
            if (view$OnKeyListenerC0193k0.f1343k.f1557C) {
                return;
            }
            View view = view$OnKeyListenerC0193k0.f1348p;
            if (view == null || !view.isShown()) {
                this.f1304b.dismiss();
            } else {
                this.f1304b.f1343k.mo2833f();
            }
        }
    }
}