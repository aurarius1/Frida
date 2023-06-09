package p010b.p016c.p024p.p025m;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: b.c.p.m.j0 */
/* loaded from: classes.dex */
public class View$OnAttachStateChangeListenerC0191j0 implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final /* synthetic */ View$OnKeyListenerC0193k0 f1332b;

    public View$OnAttachStateChangeListenerC0191j0(View$OnKeyListenerC0193k0 view$OnKeyListenerC0193k0) {
        this.f1332b = view$OnKeyListenerC0193k0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f1332b.f1350r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1332b.f1350r = view.getViewTreeObserver();
            }
            View$OnKeyListenerC0193k0 view$OnKeyListenerC0193k0 = this.f1332b;
            view$OnKeyListenerC0193k0.f1350r.removeGlobalOnLayoutListener(view$OnKeyListenerC0193k0.f1344l);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}