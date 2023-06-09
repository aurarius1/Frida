package p010b.p067m.p068d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.m.d.d */
/* loaded from: classes.dex */
public class C0680d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2928a;

    /* renamed from: b */
    public final /* synthetic */ View f2929b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2930c;

    /* renamed from: d */
    public final /* synthetic */ C0727o2 f2931d;

    /* renamed from: e */
    public final /* synthetic */ C0716m f2932e;

    public C0680d(C0728p c0728p, ViewGroup viewGroup, View view, boolean z, C0727o2 c0727o2, C0716m c0716m) {
        this.f2928a = viewGroup;
        this.f2929b = view;
        this.f2930c = z;
        this.f2931d = c0727o2;
        this.f2932e = c0716m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2928a.endViewTransition(this.f2929b);
        if (this.f2930c) {
            this.f2931d.f3087a.m1953a(this.f2929b);
        }
        this.f2932e.m1990a();
    }
}