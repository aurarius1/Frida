package p010b.p067m.p068d;

import android.view.View;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.m.d.l1 */
/* loaded from: classes.dex */
public class View$OnAttachStateChangeListenerC0714l1 implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final /* synthetic */ View f3052b;

    public View$OnAttachStateChangeListenerC0714l1(C0718m1 c0718m1, View view) {
        this.f3052b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3052b.removeOnAttachStateChangeListener(this);
        AbstractC0605j0.m2271L(this.f3052b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}