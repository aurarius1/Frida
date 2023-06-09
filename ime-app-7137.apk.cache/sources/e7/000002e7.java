package p010b.p046j.p058l;

import android.animation.ValueAnimator;
import android.view.View;
import p010b.p016c.p017k.C0090b1;

/* renamed from: b.j.l.m0 */
/* loaded from: classes.dex */
public class C0611m0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0090b1 f2767a;

    /* renamed from: b */
    public final /* synthetic */ View f2768b;

    public C0611m0(C0615o0 c0615o0, C0090b1 c0090b1, View view) {
        this.f2767a = c0090b1;
        this.f2768b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.f2767a.f872a.f887f.getParent()).invalidate();
    }
}