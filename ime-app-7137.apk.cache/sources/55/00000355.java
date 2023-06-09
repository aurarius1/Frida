package p010b.p067m.p068d;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.m.d.n0 */
/* loaded from: classes.dex */
public class View$OnAttachStateChangeListenerC0721n0 implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C0718m1 f3068b;

    /* renamed from: c */
    public final /* synthetic */ LayoutInflater$Factory2C0725o0 f3069c;

    public View$OnAttachStateChangeListenerC0721n0(LayoutInflater$Factory2C0725o0 layoutInflater$Factory2C0725o0, C0718m1 c0718m1) {
        this.f3069c = layoutInflater$Factory2C0725o0;
        this.f3068b = c0718m1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        C0718m1 c0718m1 = this.f3068b;
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
        c0718m1.m1997k();
        AbstractC0743s2.m1944g((ViewGroup) abstractComponentCallbacksC0763z.f3216I.getParent(), this.f3069c.f3078b).m1946e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}