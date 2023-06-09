package p093c.p097b.p128x;

import android.view.animation.Animation;

/* renamed from: c.b.x.v2  reason: invalid class name */
/* loaded from: classes.dex */
public class animationAnimation$AnimationListenerC1639v2 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C1647x2 f5071a;

    public animationAnimation$AnimationListenerC1639v2(C1647x2 c1647x2) {
        this.f5071a = c1647x2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f5071a.f5084f.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}