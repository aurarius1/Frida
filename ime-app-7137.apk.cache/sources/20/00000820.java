package p093c.p145g.p146a.p147a.p161m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p010b.p036g.C0390n;

/* renamed from: c.g.a.a.m.c */
/* loaded from: classes.dex */
public class C1948c {

    /* renamed from: a */
    public final C0390n f5900a = new C0390n();

    /* renamed from: b */
    public final C0390n f5901b = new C0390n();

    /* renamed from: a */
    public static C1948c m674a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m673b(context, resourceId);
    }

    /* renamed from: b */
    public static C1948c m673b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m672c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return m672c(arrayList);
            }
            return null;
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* renamed from: c */
    public static C1948c m672c(List list) {
        C1948c c1948c = new C1948c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                c1948c.f5901b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = AbstractC1946a.f5895b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = AbstractC1946a.f5896c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = AbstractC1946a.f5897d;
                }
                C1949d c1949d = new C1949d(startDelay, duration, interpolator);
                c1949d.f5905d = objectAnimator.getRepeatCount();
                c1949d.f5906e = objectAnimator.getRepeatMode();
                c1948c.f5900a.put(propertyName, c1949d);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return c1948c;
    }

    /* renamed from: d */
    public C1949d m671d(String str) {
        if (this.f5900a.getOrDefault(str, null) != null) {
            return (C1949d) this.f5900a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1948c) {
            return this.f5900a.equals(((C1948c) obj).f5900a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5900a.hashCode();
    }

    public String toString() {
        return '\n' + C1948c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f5900a + "}\n";
    }
}