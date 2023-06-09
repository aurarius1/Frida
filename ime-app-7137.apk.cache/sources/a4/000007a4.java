package p093c.p145g.p146a.p147a.p149b0;

import android.view.View;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: c.g.a.a.b0.t */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC1824t implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        AbstractC0605j0.m2271L(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}