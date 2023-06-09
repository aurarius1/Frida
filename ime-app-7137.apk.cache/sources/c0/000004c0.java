package p010b.p086w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p010b.p036g.C0378b;

/* renamed from: b.w.z */
/* loaded from: classes.dex */
public class C1084z extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0378b f4049a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1034e0 f4050b;

    public C1084z(AbstractC1034e0 abstractC1034e0, C0378b c0378b) {
        this.f4050b = abstractC1034e0;
        this.f4049a = c0378b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f4049a.remove(animator);
        this.f4050b.f3941q.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f4050b.f3941q.add(animator);
    }
}