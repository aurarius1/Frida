package p010b.p016c.p026q;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: b.c.q.w0 */
/* loaded from: classes.dex */
public class C0329w0 implements PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1787b;

    /* renamed from: c */
    public final /* synthetic */ C0334x0 f1788c;

    public C0329w0(C0334x0 c0334x0, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f1788c = c0334x0;
        this.f1787b = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f1788c.f1809I.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1787b);
        }
    }
}