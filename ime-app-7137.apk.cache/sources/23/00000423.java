package p010b.p083u.p084e;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: b.u.e.d0 */
/* loaded from: classes.dex */
public class C0927d0 implements Animator.AnimatorListener {

    /* renamed from: a */
    public final float f3553a;

    /* renamed from: b */
    public final float f3554b;

    /* renamed from: c */
    public final float f3555c;

    /* renamed from: d */
    public final float f3556d;

    /* renamed from: e */
    public final AbstractC0941g2 f3557e;

    /* renamed from: f */
    public final int f3558f;

    /* renamed from: g */
    public final ValueAnimator f3559g;

    /* renamed from: h */
    public boolean f3560h;

    /* renamed from: i */
    public float f3561i;

    /* renamed from: j */
    public float f3562j;

    /* renamed from: k */
    public boolean f3563k = false;

    /* renamed from: l */
    public boolean f3564l = false;

    /* renamed from: m */
    public float f3565m;

    /* renamed from: n */
    public final /* synthetic */ int f3566n;

    /* renamed from: o */
    public final /* synthetic */ AbstractC0941g2 f3567o;

    /* renamed from: p */
    public final /* synthetic */ C0959l0 f3568p;

    public C0927d0(C0959l0 c0959l0, AbstractC0941g2 abstractC0941g2, int i, int i2, float f, float f2, float f3, float f4, int i3, AbstractC0941g2 abstractC0941g22) {
        this.f3568p = c0959l0;
        this.f3566n = i3;
        this.f3567o = abstractC0941g22;
        this.f3558f = i2;
        this.f3557e = abstractC0941g2;
        this.f3553a = f;
        this.f3554b = f2;
        this.f3555c = f3;
        this.f3556d = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3559g = ofFloat;
        ofFloat.addUpdateListener(new C0951j0(this));
        ofFloat.setTarget(abstractC0941g2.f3605c);
        ofFloat.addListener(this);
        this.f3565m = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3565m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f3564l) {
            this.f3557e.m1652u(true);
        }
        this.f3564l = true;
        if (this.f3563k) {
            return;
        }
        if (this.f3566n <= 0) {
            C0959l0 c0959l0 = this.f3568p;
            c0959l0.f3685m.m1640a(c0959l0.f3690r, this.f3567o);
        } else {
            this.f3568p.f3673a.add(this.f3567o.f3605c);
            this.f3560h = true;
            int i = this.f3566n;
            if (i > 0) {
                C0959l0 c0959l02 = this.f3568p;
                c0959l02.f3690r.post(new RunnableC0931e0(c0959l02, this, i));
            }
        }
        C0959l0 c0959l03 = this.f3568p;
        View view = c0959l03.f3696x;
        View view2 = this.f3567o.f3605c;
        if (view == view2) {
            c0959l03.m1620o(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}