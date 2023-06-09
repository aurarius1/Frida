package p010b.p046j.p061m;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.j.m.d */
/* loaded from: classes.dex */
public class View$OnTouchListenerC0641d implements View.OnTouchListener {

    /* renamed from: b */
    public static final int f2821b = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    public final C0638a f2822c;

    /* renamed from: d */
    public final Interpolator f2823d;

    /* renamed from: e */
    public final View f2824e;

    /* renamed from: f */
    public Runnable f2825f;

    /* renamed from: g */
    public float[] f2826g;

    /* renamed from: h */
    public float[] f2827h;

    /* renamed from: i */
    public int f2828i;

    /* renamed from: j */
    public int f2829j;

    /* renamed from: k */
    public float[] f2830k;

    /* renamed from: l */
    public float[] f2831l;

    /* renamed from: m */
    public float[] f2832m;

    /* renamed from: n */
    public boolean f2833n;

    /* renamed from: o */
    public boolean f2834o;

    /* renamed from: p */
    public boolean f2835p;

    /* renamed from: q */
    public boolean f2836q;

    /* renamed from: r */
    public boolean f2837r;

    /* renamed from: s */
    public final ListView f2838s;

    public View$OnTouchListenerC0641d(ListView listView) {
        C0638a c0638a = new C0638a();
        this.f2822c = c0638a;
        this.f2823d = new AccelerateInterpolator();
        this.f2826g = new float[]{0.0f, 0.0f};
        this.f2827h = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2830k = new float[]{0.0f, 0.0f};
        this.f2831l = new float[]{0.0f, 0.0f};
        this.f2832m = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2824e = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f2832m;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f2831l;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f2828i = 1;
        float[] fArr3 = this.f2827h;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f2826g;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f2830k;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f2829j = f2821b;
        c0638a.f2808a = 500;
        c0638a.f2809b = 500;
        this.f2838s = listView;
    }

    /* renamed from: b */
    public static float m2169b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    public final float m2170a(int i, float f, float f2, float f3) {
        float m2167d = m2167d(this.f2826g[i], f2, this.f2827h[i], f);
        if (m2167d == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f2830k[i];
        float f5 = this.f2831l[i];
        float f6 = this.f2832m[i];
        float f7 = f4 * f3;
        return m2167d > 0.0f ? m2169b(m2167d * f7, f5, f6) : -m2169b((-m2167d) * f7, f5, f6);
    }

    /* renamed from: c */
    public final float m2168c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2828i;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (this.f2836q && i == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        } else {
            return 0.0f;
        }
    }

    /* renamed from: d */
    public final float m2167d(float f, float f2, float f3, float f4) {
        float interpolation;
        float m2169b = m2169b(f * f2, 0.0f, f3);
        float m2168c = m2168c(f2 - f4, m2169b) - m2168c(f4, m2169b);
        if (m2168c < 0.0f) {
            interpolation = -this.f2823d.getInterpolation(-m2168c);
        } else if (m2168c <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f2823d.getInterpolation(m2168c);
        }
        return m2169b(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: e */
    public final void m2166e() {
        int i = 0;
        if (this.f2834o) {
            this.f2836q = false;
            return;
        }
        C0638a c0638a = this.f2822c;
        c0638a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c0638a.f2812e);
        int i3 = c0638a.f2809b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0638a.f2818k = i;
        c0638a.f2817j = c0638a.m2171a(currentAnimationTimeMillis);
        c0638a.f2816i = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2165f() {
        boolean z;
        C0638a c0638a = this.f2822c;
        float f = c0638a.f2811d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c0638a.f2810c);
        if (abs != 0) {
            ListView listView = this.f2838s;
            int count = listView.getCount();
            if (count != 0) {
                int childCount = listView.getChildCount();
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int i = firstVisiblePosition + childCount;
                if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0)) : !(i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight())) {
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m2164g() {
        int i;
        if (this.f2825f == null) {
            this.f2825f = new RunnableC0639b(this);
        }
        this.f2836q = true;
        this.f2834o = true;
        if (this.f2833n || (i = this.f2829j) <= 0) {
            this.f2825f.run();
        } else {
            AbstractC0605j0.m2275H(this.f2824e, this.f2825f, i);
        }
        this.f2833n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f2837r) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m2166e();
            } else {
                this.f2835p = true;
                this.f2833n = false;
            }
            float m2170a = m2170a(0, motionEvent.getX(), view.getWidth(), this.f2824e.getWidth());
            float m2170a2 = m2170a(1, motionEvent.getY(), view.getHeight(), this.f2824e.getHeight());
            C0638a c0638a = this.f2822c;
            c0638a.f2810c = m2170a;
            c0638a.f2811d = m2170a2;
            if (!this.f2836q && m2165f()) {
                m2164g();
            }
        }
        return false;
    }
}