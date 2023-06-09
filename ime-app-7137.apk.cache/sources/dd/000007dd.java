package p093c.p145g.p146a.p147a.p156i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: c.g.a.a.i0.b0 */
/* loaded from: classes.dex */
public class C1881b0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f5759a;

    /* renamed from: b */
    public final /* synthetic */ TextView f5760b;

    /* renamed from: c */
    public final /* synthetic */ int f5761c;

    /* renamed from: d */
    public final /* synthetic */ TextView f5762d;

    /* renamed from: e */
    public final /* synthetic */ C1883c0 f5763e;

    public C1881b0(C1883c0 c1883c0, int i, TextView textView, int i2, TextView textView2) {
        this.f5763e = c1883c0;
        this.f5759a = i;
        this.f5760b = textView;
        this.f5761c = i2;
        this.f5762d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        TextView textView;
        C1883c0 c1883c0 = this.f5763e;
        c1883c0.f5772h = this.f5759a;
        c1883c0.f5770f = null;
        TextView textView2 = this.f5760b;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.f5761c == 1 && (textView = this.f5763e.f5776l) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.f5762d;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            this.f5762d.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        TextView textView = this.f5762d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}