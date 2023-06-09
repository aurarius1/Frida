package p010b.p046j.p058l;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: b.j.l.u */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0626u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f2791b;

    /* renamed from: c */
    public ViewTreeObserver f2792c;

    /* renamed from: d */
    public final Runnable f2793d;

    public ViewTreeObserver$OnPreDrawListenerC0626u(View view, Runnable runnable) {
        this.f2791b = view;
        this.f2792c = view.getViewTreeObserver();
        this.f2793d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC0626u m2198a(View view, Runnable runnable) {
        if (view != null) {
            ViewTreeObserver$OnPreDrawListenerC0626u viewTreeObserver$OnPreDrawListenerC0626u = new ViewTreeObserver$OnPreDrawListenerC0626u(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0626u);
            view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC0626u);
            return viewTreeObserver$OnPreDrawListenerC0626u;
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: b */
    public void m2197b() {
        (this.f2792c.isAlive() ? this.f2792c : this.f2791b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2791b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2197b();
        this.f2793d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2792c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2197b();
    }
}