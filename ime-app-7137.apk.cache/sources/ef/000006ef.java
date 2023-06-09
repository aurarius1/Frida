package p093c.p097b.p128x;

import android.view.animation.Animation;

/* renamed from: c.b.x.w2  reason: invalid class name */
/* loaded from: classes.dex */
public class animationAnimation$AnimationListenerC1643w2 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C1647x2 f5075a;

    public animationAnimation$AnimationListenerC1643w2(C1647x2 c1647x2) {
        this.f5075a = c1647x2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f5075a.f5085g.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}