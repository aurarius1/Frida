package p010b.p016c.p026q;

import android.os.Build;
import android.view.ViewTreeObserver;

/* renamed from: b.c.q.r0 */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC0304r0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ C0212a1 f1742b;

    public ViewTreeObserver$OnGlobalLayoutListenerC0304r0(C0212a1 c0212a1) {
        this.f1742b = c0212a1;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f1742b.getInternalPopup().mo2706b()) {
            this.f1742b.m2883b();
        }
        ViewTreeObserver viewTreeObserver = this.f1742b.getViewTreeObserver();
        if (viewTreeObserver != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }
}