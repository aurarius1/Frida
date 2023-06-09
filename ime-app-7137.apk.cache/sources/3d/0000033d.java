package p010b.p067m.p068d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p010b.p046j.p054h.C0529b;

/* renamed from: b.m.d.h0 */
/* loaded from: classes.dex */
public class C0697h0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f3005a;

    /* renamed from: b */
    public final /* synthetic */ View f3006b;

    /* renamed from: c */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f3007c;

    /* renamed from: d */
    public final /* synthetic */ C0749u0 f3008d;

    /* renamed from: e */
    public final /* synthetic */ C0529b f3009e;

    public C0697h0(ViewGroup viewGroup, View view, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, C0749u0 c0749u0, C0529b c0529b) {
        this.f3005a = viewGroup;
        this.f3006b = view;
        this.f3007c = abstractComponentCallbacksC0763z;
        this.f3008d = c0749u0;
        this.f3009e = c0529b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3005a.endViewTransition(this.f3006b);
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f3007c;
        C0757x c0757x = abstractComponentCallbacksC0763z.f3219L;
        Animator animator2 = c0757x == null ? null : c0757x.f3187b;
        abstractComponentCallbacksC0763z.m1903F0(null);
        if (animator2 == null || this.f3005a.indexOfChild(this.f3006b) >= 0) {
            return;
        }
        this.f3008d.m1941a(this.f3007c, this.f3009e);
    }
}