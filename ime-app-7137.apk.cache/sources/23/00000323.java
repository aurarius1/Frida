package p010b.p067m.p068d;

import android.transition.Transition;

/* renamed from: b.m.d.a2 */
/* loaded from: classes.dex */
public class C0671a2 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f2917a;

    public C0671a2(C0679c2 c0679c2, Runnable runnable) {
        this.f2917a = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.f2917a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }
}