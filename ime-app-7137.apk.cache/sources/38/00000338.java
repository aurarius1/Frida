package p010b.p067m.p068d;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: b.m.d.g  reason: invalid class name */
/* loaded from: classes.dex */
public class animationAnimation$AnimationListenerC0692g implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2995a;

    /* renamed from: b */
    public final /* synthetic */ View f2996b;

    /* renamed from: c */
    public final /* synthetic */ C0716m f2997c;

    public animationAnimation$AnimationListenerC0692g(C0728p c0728p, ViewGroup viewGroup, View view, C0716m c0716m) {
        this.f2995a = viewGroup;
        this.f2996b = view;
        this.f2997c = c0716m;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f2995a.post(new RunnableC0688f(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}