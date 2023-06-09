package p010b.p086w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.w.i1 */
/* loaded from: classes.dex */
public class C1047i1 extends AnimatorListenerAdapter implements InterfaceC1031d0, InterfaceC1021a {

    /* renamed from: a */
    public final View f3966a;

    /* renamed from: b */
    public final int f3967b;

    /* renamed from: c */
    public final ViewGroup f3968c;

    /* renamed from: d */
    public final boolean f3969d;

    /* renamed from: e */
    public boolean f3970e;

    /* renamed from: f */
    public boolean f3971f = false;

    public C1047i1(View view, int i, boolean z) {
        this.f3966a = view;
        this.f3967b = i;
        this.f3968c = (ViewGroup) view.getParent();
        this.f3969d = z;
        m1359g(true);
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: a */
    public void mo1329a(AbstractC1034e0 abstractC1034e0) {
        m1359g(false);
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: b */
    public void mo1328b(AbstractC1034e0 abstractC1034e0) {
        m1359g(true);
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: c */
    public void mo1326c(AbstractC1034e0 abstractC1034e0) {
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: d */
    public void mo1327d(AbstractC1034e0 abstractC1034e0) {
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: e */
    public void mo1325e(AbstractC1034e0 abstractC1034e0) {
        m1360f();
        abstractC1034e0.mo1340v(this);
    }

    /* renamed from: f */
    public final void m1360f() {
        if (!this.f3971f) {
            AbstractC1023a1.f3914a.mo1365f(this.f3966a, this.f3967b);
            ViewGroup viewGroup = this.f3968c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1359g(false);
    }

    /* renamed from: g */
    public final void m1359g(boolean z) {
        ViewGroup viewGroup;
        if (!this.f3969d || this.f3970e == z || (viewGroup = this.f3968c) == null) {
            return;
        }
        this.f3970e = z;
        AbstractC1073t0.m1304b(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3971f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        m1360f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        if (this.f3971f) {
            return;
        }
        AbstractC1023a1.f3914a.mo1365f(this.f3966a, this.f3967b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        if (this.f3971f) {
            return;
        }
        AbstractC1023a1.f3914a.mo1365f(this.f3966a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}