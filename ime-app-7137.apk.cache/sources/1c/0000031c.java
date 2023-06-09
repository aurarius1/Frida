package p010b.p064l.p066b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.l.b.i */
/* loaded from: classes.dex */
public class C0664i {

    /* renamed from: a */
    public static final Interpolator f2875a = new animationInterpolatorC0661f();

    /* renamed from: b */
    public int f2876b;

    /* renamed from: c */
    public int f2877c;

    /* renamed from: e */
    public float[] f2879e;

    /* renamed from: f */
    public float[] f2880f;

    /* renamed from: g */
    public float[] f2881g;

    /* renamed from: h */
    public float[] f2882h;

    /* renamed from: i */
    public int[] f2883i;

    /* renamed from: j */
    public int[] f2884j;

    /* renamed from: k */
    public int[] f2885k;

    /* renamed from: l */
    public int f2886l;

    /* renamed from: m */
    public VelocityTracker f2887m;

    /* renamed from: n */
    public float f2888n;

    /* renamed from: o */
    public float f2889o;

    /* renamed from: p */
    public int f2890p;

    /* renamed from: q */
    public OverScroller f2891q;

    /* renamed from: r */
    public final AbstractC0663h f2892r;

    /* renamed from: s */
    public View f2893s;

    /* renamed from: t */
    public boolean f2894t;

    /* renamed from: u */
    public final ViewGroup f2895u;

    /* renamed from: d */
    public int f2878d = -1;

    /* renamed from: v */
    public final Runnable f2896v = new RunnableC0662g(this);

    public C0664i(Context context, ViewGroup viewGroup, AbstractC0663h abstractC0663h) {
        if (abstractC0663h == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2895u = viewGroup;
        this.f2892r = abstractC0663h;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2890p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2877c = viewConfiguration.getScaledTouchSlop();
        this.f2888n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2889o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2891q = new OverScroller(context, f2875a);
    }

    /* renamed from: a */
    public void m2144a() {
        this.f2878d = -1;
        float[] fArr = this.f2879e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2880f, 0.0f);
            Arrays.fill(this.f2881g, 0.0f);
            Arrays.fill(this.f2882h, 0.0f);
            Arrays.fill(this.f2883i, 0);
            Arrays.fill(this.f2884j, 0);
            Arrays.fill(this.f2885k, 0);
            this.f2886l = 0;
        }
        VelocityTracker velocityTracker = this.f2887m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2887m = null;
        }
    }

    /* renamed from: b */
    public void m2143b(View view, int i) {
        if (view.getParent() != this.f2895u) {
            StringBuilder m1187i = AbstractC1124a.m1187i("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            m1187i.append(this.f2895u);
            m1187i.append(")");
            throw new IllegalArgumentException(m1187i.toString());
        }
        this.f2893s = view;
        this.f2878d = i;
        this.f2892r.mo659e(view, i);
        m2126s(1);
    }

    /* renamed from: c */
    public final boolean m2142c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f2883i[i] & i2) != i2 || (0 & i2) == 0 || (this.f2885k[i] & i2) == i2 || (this.f2884j[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f2877c;
        if (abs > i3 || abs2 > i3) {
            if (abs < abs2 * 0.5f) {
                this.f2892r.getClass();
            }
            return (this.f2884j[i] & i2) == 0 && abs > ((float) this.f2877c);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m2141d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f2892r.mo660c(view) > 0;
        boolean z2 = this.f2892r.mo633d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f2877c) : z2 && Math.abs(f2) > ((float) this.f2877c);
        }
        float f3 = f2 * f2;
        int i = this.f2877c;
        return f3 + (f * f) > ((float) (i * i));
    }

    /* renamed from: e */
    public final float m2140e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: f */
    public final int m2139f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: g */
    public final void m2138g(int i) {
        float[] fArr = this.f2879e;
        if (fArr != null) {
            int i2 = this.f2886l;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.f2880f[i] = 0.0f;
                this.f2881g[i] = 0.0f;
                this.f2882h[i] = 0.0f;
                this.f2883i[i] = 0;
                this.f2884j[i] = 0;
                this.f2885k[i] = 0;
                this.f2886l = (i3 ^ (-1)) & i2;
            }
        }
    }

    /* renamed from: h */
    public final int m2137h(int i, int i2, int i3) {
        int width;
        if (i == 0) {
            return 0;
        }
        float width2 = this.f2895u.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: i */
    public boolean m2136i(boolean z) {
        if (this.f2876b == 2) {
            boolean computeScrollOffset = this.f2891q.computeScrollOffset();
            int currX = this.f2891q.getCurrX();
            int currY = this.f2891q.getCurrY();
            int left = currX - this.f2893s.getLeft();
            int top = currY - this.f2893s.getTop();
            if (left != 0) {
                AbstractC0605j0.m2281B(this.f2893s, left);
            }
            if (top != 0) {
                AbstractC0605j0.m2280C(this.f2893s, top);
            }
            if (left != 0 || top != 0) {
                this.f2892r.mo631g(this.f2893s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f2891q.getFinalX() && currY == this.f2891q.getFinalY()) {
                this.f2891q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f2895u.post(this.f2896v);
                } else {
                    m2126s(0);
                }
            }
        }
        return this.f2876b == 2;
    }

    /* renamed from: j */
    public final void m2135j(float f, float f2) {
        this.f2894t = true;
        this.f2892r.mo630h(this.f2893s, f, f2);
        this.f2894t = false;
        if (this.f2876b == 1) {
            m2126s(0);
        }
    }

    /* renamed from: k */
    public View m2134k(int i, int i2) {
        for (int childCount = this.f2895u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f2895u;
            this.f2892r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: l */
    public final boolean m2133l(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f2893s.getLeft();
        int top = this.f2893s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f2891q.abortAnimation();
            m2126s(0);
            return false;
        }
        View view = this.f2893s;
        int m2139f = m2139f(i3, (int) this.f2889o, (int) this.f2888n);
        int m2139f2 = m2139f(i4, (int) this.f2889o, (int) this.f2888n);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(m2139f);
        int abs4 = Math.abs(m2139f2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (m2139f != 0) {
            f = abs3;
            f2 = i7;
        } else {
            f = abs;
            f2 = i8;
        }
        float f5 = f / f2;
        if (m2139f2 != 0) {
            f3 = abs4;
            f4 = i7;
        } else {
            f3 = abs2;
            f4 = i8;
        }
        int m2137h = m2137h(i5, m2139f, this.f2892r.mo660c(view));
        this.f2891q.startScroll(left, top, i5, i6, (int) ((m2137h(i6, m2139f2, this.f2892r.mo633d(view)) * (f3 / f4)) + (m2137h * f5)));
        m2126s(2);
        return true;
    }

    /* renamed from: m */
    public final boolean m2132m(int i) {
        return ((1 << i) & this.f2886l) != 0;
    }

    /* renamed from: n */
    public void m2131n(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2144a();
        }
        if (this.f2887m == null) {
            this.f2887m = VelocityTracker.obtain();
        }
        this.f2887m.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2876b != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m2132m(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f2879e[pointerId];
                                float f2 = y - this.f2880f[pointerId];
                                m2129p(f, f2, pointerId);
                                if (this.f2876b != 1) {
                                    View m2134k = m2134k((int) x, (int) y);
                                    if (m2141d(m2134k, f, f2) && m2123v(m2134k, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (!m2132m(this.f2878d)) {
                        return;
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2878d);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f2881g;
                        int i3 = this.f2878d;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f2882h[i3]);
                        int left = this.f2893s.getLeft() + i4;
                        int top = this.f2893s.getTop() + i5;
                        int left2 = this.f2893s.getLeft();
                        int top2 = this.f2893s.getTop();
                        if (i4 != 0) {
                            left = this.f2892r.mo635a(this.f2893s, left, i4);
                            AbstractC0605j0.m2281B(this.f2893s, left - left2);
                        }
                        int i6 = left;
                        if (i5 != 0) {
                            top = this.f2892r.mo634b(this.f2893s, top, i5);
                            AbstractC0605j0.m2280C(this.f2893s, top - top2);
                        }
                        int i7 = top;
                        if (i4 != 0 || i5 != 0) {
                            this.f2892r.mo631g(this.f2893s, i6, i7, i6 - left2, i7 - top2);
                        }
                    }
                    m2127r(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (this.f2876b == 1 && pointerId2 == this.f2878d) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId3 = motionEvent.getPointerId(i2);
                                if (pointerId3 != this.f2878d) {
                                    View m2134k2 = m2134k((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f2893s;
                                    if (m2134k2 == view && m2123v(view, pointerId3)) {
                                        i = this.f2878d;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m2130o();
                            }
                        }
                        m2138g(pointerId2);
                        return;
                    }
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    float x3 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    m2128q(x3, y3, pointerId4);
                    if (this.f2876b != 0) {
                        int i8 = (int) x3;
                        int i9 = (int) y3;
                        View view2 = this.f2893s;
                        if (view2 != null && i8 >= view2.getLeft() && i8 < view2.getRight() && i9 >= view2.getTop() && i9 < view2.getBottom()) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            m2123v(this.f2893s, pointerId4);
                            return;
                        }
                        return;
                    }
                    m2123v(m2134k((int) x3, (int) y3), pointerId4);
                    if ((this.f2883i[pointerId4] & 0) == 0) {
                        return;
                    }
                } else if (this.f2876b == 1) {
                    m2135j(0.0f, 0.0f);
                }
            } else if (this.f2876b == 1) {
                m2130o();
            }
            m2144a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View m2134k3 = m2134k((int) x4, (int) y4);
        m2128q(x4, y4, pointerId5);
        m2123v(m2134k3, pointerId5);
        if ((this.f2883i[pointerId5] & 0) == 0) {
            return;
        }
        this.f2892r.getClass();
    }

    /* renamed from: o */
    public final void m2130o() {
        this.f2887m.computeCurrentVelocity(1000, this.f2888n);
        m2135j(m2140e(this.f2887m.getXVelocity(this.f2878d), this.f2889o, this.f2888n), m2140e(this.f2887m.getYVelocity(this.f2878d), this.f2889o, this.f2888n));
    }

    /* renamed from: p */
    public final void m2129p(float f, float f2, int i) {
        int i2 = m2142c(f, f2, i, 1) ? 1 : 0;
        if (m2142c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2142c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2142c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f2884j;
            iArr[i] = iArr[i] | i2;
            this.f2892r.getClass();
        }
    }

    /* renamed from: q */
    public final void m2128q(float f, float f2, int i) {
        float[] fArr = this.f2879e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2880f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2881g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2882h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2883i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2884j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2885k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2879e = fArr2;
            this.f2880f = fArr3;
            this.f2881g = fArr4;
            this.f2882h = fArr5;
            this.f2883i = iArr;
            this.f2884j = iArr2;
            this.f2885k = iArr3;
        }
        float[] fArr9 = this.f2879e;
        this.f2881g[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f2880f;
        this.f2882h[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f2883i;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.f2895u.getLeft() + this.f2890p ? 1 : 0;
        if (i4 < this.f2895u.getTop() + this.f2890p) {
            i5 |= 4;
        }
        if (i3 > this.f2895u.getRight() - this.f2890p) {
            i5 |= 2;
        }
        if (i4 > this.f2895u.getBottom() - this.f2890p) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f2886l |= 1 << i;
    }

    /* renamed from: r */
    public final void m2127r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2132m(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2881g[pointerId] = x;
                this.f2882h[pointerId] = y;
            }
        }
    }

    /* renamed from: s */
    public void m2126s(int i) {
        this.f2895u.removeCallbacks(this.f2896v);
        if (this.f2876b != i) {
            this.f2876b = i;
            this.f2892r.mo632f(i);
            if (this.f2876b == 0) {
                this.f2893s = null;
            }
        }
    }

    /* renamed from: t */
    public boolean m2125t(int i, int i2) {
        if (this.f2894t) {
            return m2133l(i, i2, (int) this.f2887m.getXVelocity(this.f2878d), (int) this.f2887m.getYVelocity(this.f2878d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2124u(MotionEvent motionEvent) {
        View m2134k;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2144a();
        }
        if (this.f2887m == null) {
            this.f2887m = VelocityTracker.obtain();
        }
        this.f2887m.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            m2128q(x, y, pointerId);
                            int i = this.f2876b;
                            if (i == 0) {
                                if ((this.f2883i[pointerId] & 0) != 0) {
                                    this.f2892r.getClass();
                                }
                            } else if (i == 2 && (m2134k = m2134k((int) x, (int) y)) == this.f2893s) {
                                m2123v(m2134k, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            m2138g(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f2879e != null && this.f2880f != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m2132m(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f2879e[pointerId2];
                            float f2 = y2 - this.f2880f[pointerId2];
                            View m2134k2 = m2134k((int) x2, (int) y2);
                            boolean z = m2134k2 != null && m2141d(m2134k2, f, f2);
                            if (z) {
                                int left = m2134k2.getLeft();
                                int i3 = (int) f;
                                int mo635a = this.f2892r.mo635a(m2134k2, left + i3, i3);
                                int top = m2134k2.getTop();
                                int i4 = (int) f2;
                                int mo634b = this.f2892r.mo634b(m2134k2, top + i4, i4);
                                int mo660c = this.f2892r.mo660c(m2134k2);
                                int mo633d = this.f2892r.mo633d(m2134k2);
                                if (mo660c != 0) {
                                    if (mo660c > 0) {
                                    }
                                }
                                if (mo633d == 0) {
                                    break;
                                } else if (mo633d > 0 && mo634b == top) {
                                    break;
                                }
                            }
                            m2129p(f, f2, pointerId2);
                            if (this.f2876b != 1) {
                                if (z && m2123v(m2134k2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    m2127r(motionEvent);
                }
            }
            m2144a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            m2128q(x3, y3, pointerId3);
            View m2134k3 = m2134k((int) x3, (int) y3);
            if (m2134k3 == this.f2893s && this.f2876b == 2) {
                m2123v(m2134k3, pointerId3);
            }
            if ((this.f2883i[pointerId3] & 0) != 0) {
                this.f2892r.getClass();
            }
        }
        return this.f2876b == 1;
    }

    /* renamed from: v */
    public boolean m2123v(View view, int i) {
        if (view == this.f2893s && this.f2878d == i) {
            return true;
        }
        if (view == null || !this.f2892r.mo629i(view, i)) {
            return false;
        }
        this.f2878d = i;
        m2143b(view, i);
        return true;
    }
}