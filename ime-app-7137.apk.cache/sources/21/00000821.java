package p093c.p145g.p146a.p147a.p161m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: c.g.a.a.m.d */
/* loaded from: classes.dex */
public class C1949d {

    /* renamed from: a */
    public long f5902a;

    /* renamed from: b */
    public long f5903b;

    /* renamed from: c */
    public TimeInterpolator f5904c;

    /* renamed from: d */
    public int f5905d;

    /* renamed from: e */
    public int f5906e;

    public C1949d(long j, long j2) {
        this.f5902a = 0L;
        this.f5903b = 300L;
        this.f5904c = null;
        this.f5905d = 0;
        this.f5906e = 1;
        this.f5902a = j;
        this.f5903b = j2;
    }

    public C1949d(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f5902a = 0L;
        this.f5903b = 300L;
        this.f5904c = null;
        this.f5905d = 0;
        this.f5906e = 1;
        this.f5902a = j;
        this.f5903b = j2;
        this.f5904c = timeInterpolator;
    }

    /* renamed from: a */
    public void m670a(Animator animator) {
        animator.setStartDelay(this.f5902a);
        animator.setDuration(this.f5903b);
        animator.setInterpolator(m669b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f5905d);
            valueAnimator.setRepeatMode(this.f5906e);
        }
    }

    /* renamed from: b */
    public TimeInterpolator m669b() {
        TimeInterpolator timeInterpolator = this.f5904c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1946a.f5895b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1949d) {
            C1949d c1949d = (C1949d) obj;
            if (this.f5902a == c1949d.f5902a && this.f5903b == c1949d.f5903b && this.f5905d == c1949d.f5905d && this.f5906e == c1949d.f5906e) {
                return m669b().getClass().equals(c1949d.m669b().getClass());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5902a;
        long j2 = this.f5903b;
        return ((((m669b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.f5905d) * 31) + this.f5906e;
    }

    public String toString() {
        return '\n' + C1949d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f5902a + " duration: " + this.f5903b + " interpolator: " + m669b().getClass() + " repeatCount: " + this.f5905d + " repeatMode: " + this.f5906e + "}\n";
    }
}