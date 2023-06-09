package p010b.p083u.p084e;

import android.animation.ValueAnimator;

/* renamed from: b.u.e.p */
/* loaded from: classes.dex */
public class RunnableC0974p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0990t f3754b;

    public RunnableC0974p(C0990t c0990t) {
        this.f3754b = c0990t;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0990t c0990t = this.f3754b;
        int i = c0990t.f3828C;
        if (i == 1) {
            c0990t.f3827B.cancel();
        } else if (i != 2) {
            return;
        }
        c0990t.f3828C = 3;
        ValueAnimator valueAnimator = c0990t.f3827B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        c0990t.f3827B.setDuration(500);
        c0990t.f3827B.start();
    }
}