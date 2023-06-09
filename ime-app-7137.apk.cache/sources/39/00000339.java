package p010b.p067m.p068d;

import android.view.ViewGroup;
import android.view.animation.Animation;
import p010b.p046j.p054h.C0529b;

/* renamed from: b.m.d.g0  reason: invalid class name */
/* loaded from: classes.dex */
public class animationAnimation$AnimationListenerC0693g0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2998a;

    /* renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f2999b;

    /* renamed from: c */
    public final /* synthetic */ C0749u0 f3000c;

    /* renamed from: d */
    public final /* synthetic */ C0529b f3001d;

    public animationAnimation$AnimationListenerC0693g0(ViewGroup viewGroup, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, C0749u0 c0749u0, C0529b c0529b) {
        this.f2998a = viewGroup;
        this.f2999b = abstractComponentCallbacksC0763z;
        this.f3000c = c0749u0;
        this.f3001d = c0529b;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f2998a.post(new RunnableC0689f0(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}