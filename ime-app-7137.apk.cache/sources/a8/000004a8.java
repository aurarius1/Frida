package p010b.p086w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.w.n */
/* loaded from: classes.dex */
public class C1060n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final View f4006a;

    /* renamed from: b */
    public boolean f4007b = false;

    public C1060n(View view) {
        this.f4006a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        AbstractC1023a1.f3914a.mo1366e(this.f4006a, 1.0f);
        if (this.f4007b) {
            this.f4006a.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        View view = this.f4006a;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if ((Build.VERSION.SDK_INT >= 16 ? view.hasOverlappingRendering() : true) && this.f4006a.getLayerType() == 0) {
            this.f4007b = true;
            this.f4006a.setLayerType(2, null);
        }
    }
}