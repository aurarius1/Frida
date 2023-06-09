package p010b.p044i.p045d;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: b.i.d.f */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnPreDrawListenerC0456f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final /* synthetic */ CoordinatorLayout f2428b;

    public ViewTreeObserver$OnPreDrawListenerC0456f(CoordinatorLayout coordinatorLayout) {
        this.f2428b = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f2428b.m3353p(0);
        return true;
    }
}