package p010b.p016c.p024p.p025m;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: b.c.p.m.f */
/* loaded from: classes.dex */
public class View$OnAttachStateChangeListenerC0182f implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final /* synthetic */ View$OnKeyListenerC0190j f1294b;

    public View$OnAttachStateChangeListenerC0182f(View$OnKeyListenerC0190j view$OnKeyListenerC0190j) {
        this.f1294b = view$OnKeyListenerC0190j;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f1294b.f1306A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1294b.f1306A = view.getViewTreeObserver();
            }
            View$OnKeyListenerC0190j view$OnKeyListenerC0190j = this.f1294b;
            view$OnKeyListenerC0190j.f1306A.removeGlobalOnLayoutListener(view$OnKeyListenerC0190j.f1317l);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}