package p010b.p067m.p068d;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p010b.p046j.p058l.ViewTreeObserver$OnPreDrawListenerC0626u;

/* renamed from: b.m.d.j0 */
/* loaded from: classes.dex */
public class RunnableC0705j0 extends AnimationSet implements Runnable {

    /* renamed from: b */
    public final ViewGroup f3030b;

    /* renamed from: c */
    public final View f3031c;

    /* renamed from: d */
    public boolean f3032d;

    /* renamed from: e */
    public boolean f3033e;

    /* renamed from: f */
    public boolean f3034f;

    public RunnableC0705j0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3034f = true;
        this.f3030b = viewGroup;
        this.f3031c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation) {
        this.f3034f = true;
        if (this.f3032d) {
            return !this.f3033e;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f3032d = true;
            ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(this.f3030b, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation, float f) {
        this.f3034f = true;
        if (this.f3032d) {
            return !this.f3033e;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f3032d = true;
            ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(this.f3030b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f3032d || !this.f3034f) {
            this.f3030b.endViewTransition(this.f3031c);
            this.f3033e = true;
            return;
        }
        this.f3034f = false;
        this.f3030b.post(this);
    }
}