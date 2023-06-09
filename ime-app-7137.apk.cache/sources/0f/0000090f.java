package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.List;
import p010b.p044i.p045d.C0455e;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.p160l0.C1943c;
import p093c.p145g.p146a.p147a.p160l0.C1944d;
import p093c.p145g.p146a.p147a.p161m.AbstractC1946a;
import p093c.p145g.p146a.p147a.p161m.C1947b;
import p093c.p145g.p146a.p147a.p161m.C1948c;
import p093c.p145g.p146a.p147a.p161m.C1949d;
import p093c.p145g.p146a.p147a.p161m.C1950e;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f6967c;

    /* renamed from: d */
    public final RectF f6968d;

    /* renamed from: e */
    public final RectF f6969e;

    /* renamed from: f */
    public final int[] f6970f;

    /* renamed from: g */
    public float f6971g;

    /* renamed from: h */
    public float f6972h;

    public FabTransformationBehavior() {
        this.f6967c = new Rect();
        this.f6968d = new RectF();
        this.f6969e = new RectF();
        this.f6970f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6967c = new Rect();
        this.f6968d = new RectF();
        this.f6969e = new RectF();
        this.f6970f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: D */
    public AnimatorSet mo207D(View view, View view2, boolean z, boolean z2) {
        C1944d mo204N = mo204N(view2.getContext(), z);
        if (z) {
            this.f6971g = view.getTranslationX();
            this.f6972h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m213L(view, view2, z, z2, mo204N, arrayList);
        }
        RectF rectF = this.f6968d;
        m212M(view, view2, z, z2, mo204N, arrayList, rectF);
        rectF.width();
        rectF.height();
        float m219F = m219F(view, view2, mo204N.f5891b);
        float m218G = m218G(view, view2, mo204N.f5891b);
        Pair m220E = m220E(m219F, m218G, z, mo204N);
        C1949d c1949d = (C1949d) m220E.first;
        C1949d c1949d2 = (C1949d) m220E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m219F = this.f6971g;
        }
        fArr[0] = m219F;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m218G = this.f6972h;
        }
        fArr2[0] = m218G;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        c1949d.m670a(ofFloat);
        c1949d2.m670a(ofFloat2);
        arrayList.add(ofFloat);
        arrayList.add(ofFloat2);
        m214K(view, view2, z, z2, mo204N, arrayList);
        m215J(view2, z, z2, mo204N, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC1077v0.m1290N(animatorSet, arrayList);
        animatorSet.addListener(new C1943c(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: E */
    public final Pair m220E(float f, float f2, boolean z, C1944d c1944d) {
        C1949d m671d;
        C1948c c1948c;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            m671d = c1944d.f5890a.m671d("translationXLinear");
            c1948c = c1944d.f5890a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            m671d = c1944d.f5890a.m671d("translationXCurveDownwards");
            c1948c = c1944d.f5890a;
            str = "translationYCurveDownwards";
        } else {
            m671d = c1944d.f5890a.m671d("translationXCurveUpwards");
            c1948c = c1944d.f5890a;
            str = "translationYCurveUpwards";
        }
        return new Pair(m671d, c1948c.m671d(str));
    }

    /* renamed from: F */
    public final float m219F(View view, View view2, C1950e c1950e) {
        RectF rectF = this.f6968d;
        RectF rectF2 = this.f6969e;
        m216I(view, rectF);
        rectF.offset(this.f6971g, this.f6972h);
        m216I(view2, rectF2);
        c1950e.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* renamed from: G */
    public final float m218G(View view, View view2, C1950e c1950e) {
        RectF rectF = this.f6968d;
        RectF rectF2 = this.f6969e;
        m216I(view, rectF);
        rectF.offset(this.f6971g, this.f6972h);
        m216I(view2, rectF2);
        c1950e.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* renamed from: H */
    public final float m217H(C1944d c1944d, C1949d c1949d, float f, float f2) {
        long j = c1949d.f5902a;
        long j2 = c1949d.f5903b;
        C1949d m671d = c1944d.f5890a.m671d("expansion");
        float interpolation = c1949d.m669b().getInterpolation(((float) (((m671d.f5902a + m671d.f5903b) + 17) - j)) / ((float) j2));
        TimeInterpolator timeInterpolator = AbstractC1946a.f5894a;
        return AbstractC1124a.m1195a(f2, f, interpolation, f);
    }

    /* renamed from: I */
    public final void m216I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f6970f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: J */
    public final void m215J(View view, boolean z, boolean z2, C1944d c1944d, List list) {
        ObjectAnimator ofFloat;
        if (view instanceof ViewGroup) {
            View findViewById = view.findViewById(AbstractC1840f.mtrl_child_content_container);
            ViewGroup m211O = findViewById != null ? m211O(findViewById) : m211O(view);
            if (m211O == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C1947b.f5899a.set(m211O, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m211O, C1947b.f5899a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m211O, C1947b.f5899a, 0.0f);
            }
            c1944d.f5890a.m671d("contentFade").m670a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* renamed from: K */
    public final void m214K(View view, View view2, boolean z, boolean z2, C1944d c1944d, List list) {
    }

    @TargetApi(21)
    /* renamed from: L */
    public final void m213L(View view, View view2, boolean z, boolean z2, C1944d c1944d, List list) {
        ObjectAnimator ofFloat;
        float m2245m = AbstractC0605j0.m2245m(view2) - AbstractC0605j0.m2245m(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m2245m);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m2245m);
        }
        c1944d.f5890a.m671d("elevation").m670a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: M */
    public final void m212M(View view, View view2, boolean z, boolean z2, C1944d c1944d, List list, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m219F = m219F(view, view2, c1944d.f5891b);
        float m218G = m218G(view, view2, c1944d.f5891b);
        Pair m220E = m220E(m219F, m218G, z, c1944d);
        C1949d c1949d = (C1949d) m220E.first;
        C1949d c1949d2 = (C1949d) m220E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m219F);
                view2.setTranslationY(-m218G);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float m217H = m217H(c1944d, c1949d, -m219F, 0.0f);
            float m217H2 = m217H(c1944d, c1949d2, -m218G, 0.0f);
            Rect rect = this.f6967c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f6968d;
            rectF2.set(rect);
            RectF rectF3 = this.f6969e;
            m216I(view2, rectF3);
            rectF3.offset(m217H, m217H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m219F);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -m218G);
        }
        c1949d.m670a(ofFloat);
        c1949d2.m670a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: N */
    public abstract C1944d mo204N(Context context, boolean z);

    /* renamed from: O */
    public final ViewGroup m211O(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: d */
    public boolean mo210d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: f */
    public void mo209f(C0455e c0455e) {
        if (c0455e.f2418h == 0) {
            c0455e.f2418h = 80;
        }
    }
}