package p010b.p083u.p084e;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.u.e.t */
/* loaded from: classes.dex */
public class C0990t extends AbstractC0964m1 implements InterfaceC0992t1 {

    /* renamed from: a */
    public static final int[] f3824a = {16842919};

    /* renamed from: b */
    public static final int[] f3825b = new int[0];

    /* renamed from: B */
    public final ValueAnimator f3827B;

    /* renamed from: C */
    public int f3828C;

    /* renamed from: D */
    public final Runnable f3829D;

    /* renamed from: E */
    public final AbstractC0996u1 f3830E;

    /* renamed from: c */
    public final int f3831c;

    /* renamed from: d */
    public final int f3832d;

    /* renamed from: e */
    public final StateListDrawable f3833e;

    /* renamed from: f */
    public final Drawable f3834f;

    /* renamed from: g */
    public final int f3835g;

    /* renamed from: h */
    public final int f3836h;

    /* renamed from: i */
    public final StateListDrawable f3837i;

    /* renamed from: j */
    public final Drawable f3838j;

    /* renamed from: k */
    public final int f3839k;

    /* renamed from: l */
    public final int f3840l;

    /* renamed from: m */
    public int f3841m;

    /* renamed from: n */
    public int f3842n;

    /* renamed from: o */
    public float f3843o;

    /* renamed from: p */
    public int f3844p;

    /* renamed from: q */
    public int f3845q;

    /* renamed from: r */
    public float f3846r;

    /* renamed from: u */
    public RecyclerView f3849u;

    /* renamed from: s */
    public int f3847s = 0;

    /* renamed from: t */
    public int f3848t = 0;

    /* renamed from: v */
    public boolean f3850v = false;

    /* renamed from: w */
    public boolean f3851w = false;

    /* renamed from: x */
    public int f3852x = 0;

    /* renamed from: y */
    public int f3853y = 0;

    /* renamed from: z */
    public final int[] f3854z = new int[2];

    /* renamed from: A */
    public final int[] f3826A = new int[2];

    public C0990t(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3827B = ofFloat;
        this.f3828C = 0;
        this.f3829D = new RunnableC0974p(this);
        C0978q c0978q = new C0978q(this);
        this.f3830E = c0978q;
        this.f3833e = stateListDrawable;
        this.f3834f = drawable;
        this.f3837i = stateListDrawable2;
        this.f3838j = drawable2;
        this.f3835g = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3836h = Math.max(i, drawable.getIntrinsicWidth());
        this.f3839k = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3840l = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3831c = i2;
        this.f3832d = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0982r(this));
        ofFloat.addUpdateListener(new C0986s(this));
        RecyclerView recyclerView2 = this.f3849u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m3163f0(this);
            RecyclerView recyclerView3 = this.f3849u;
            recyclerView3.f708A.remove(this);
            if (recyclerView3.f710B == this) {
                recyclerView3.f710B = null;
            }
            List list = this.f3849u.f774u0;
            if (list != null) {
                list.remove(c0978q);
            }
            m1462g();
        }
        this.f3849u = recyclerView;
        recyclerView.m3162g(this);
        this.f3849u.f708A.add(this);
        this.f3849u.m3160h(c0978q);
    }

    @Override // p010b.p083u.p084e.InterfaceC0992t1
    /* renamed from: a */
    public boolean mo1456a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3852x;
        if (i == 1) {
            boolean m1460i = m1460i(motionEvent.getX(), motionEvent.getY());
            boolean m1461h = m1461h(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (m1460i || m1461h)) {
                if (m1461h) {
                    this.f3853y = 1;
                    this.f3846r = (int) motionEvent.getX();
                } else if (m1460i) {
                    this.f3853y = 2;
                    this.f3843o = (int) motionEvent.getY();
                }
                m1458k(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // p010b.p083u.p084e.InterfaceC0992t1
    /* renamed from: b */
    public void mo1455b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3852x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m1460i = m1460i(motionEvent.getX(), motionEvent.getY());
            boolean m1461h = m1461h(motionEvent.getX(), motionEvent.getY());
            if (m1460i || m1461h) {
                if (m1461h) {
                    this.f3853y = 1;
                    this.f3846r = (int) motionEvent.getX();
                } else if (m1460i) {
                    this.f3853y = 2;
                    this.f3843o = (int) motionEvent.getY();
                }
                m1458k(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f3852x == 2) {
            this.f3843o = 0.0f;
            this.f3846r = 0.0f;
            m1458k(1);
            this.f3853y = 0;
        } else if (motionEvent.getAction() == 2 && this.f3852x == 2) {
            m1457l();
            if (this.f3853y == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f3826A;
                int i = this.f3832d;
                iArr[0] = i;
                iArr[1] = this.f3847s - i;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f3845q - max) >= 2.0f) {
                    int m1459j = m1459j(this.f3846r, max, iArr, this.f3849u.computeHorizontalScrollRange(), this.f3849u.computeHorizontalScrollOffset(), this.f3847s);
                    if (m1459j != 0) {
                        this.f3849u.scrollBy(m1459j, 0);
                    }
                    this.f3846r = max;
                }
            }
            if (this.f3853y == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f3854z;
                int i2 = this.f3832d;
                iArr2[0] = i2;
                iArr2[1] = this.f3848t - i2;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f3842n - max2) < 2.0f) {
                    return;
                }
                int m1459j2 = m1459j(this.f3843o, max2, iArr2, this.f3849u.computeVerticalScrollRange(), this.f3849u.computeVerticalScrollOffset(), this.f3848t);
                if (m1459j2 != 0) {
                    this.f3849u.scrollBy(0, m1459j2);
                }
                this.f3843o = max2;
            }
        }
    }

    @Override // p010b.p083u.p084e.InterfaceC0992t1
    /* renamed from: c */
    public void mo1454c(boolean z) {
    }

    @Override // p010b.p083u.p084e.AbstractC0964m1
    /* renamed from: f */
    public void mo1463f(Canvas canvas, RecyclerView recyclerView, C0929d2 c0929d2) {
        if (this.f3847s != this.f3849u.getWidth() || this.f3848t != this.f3849u.getHeight()) {
            this.f3847s = this.f3849u.getWidth();
            this.f3848t = this.f3849u.getHeight();
            m1458k(0);
        } else if (this.f3828C != 0) {
            if (this.f3850v) {
                int i = this.f3847s;
                int i2 = this.f3835g;
                int i3 = i - i2;
                int i4 = this.f3842n;
                int i5 = this.f3841m;
                int i6 = i4 - (i5 / 2);
                this.f3833e.setBounds(0, 0, i2, i5);
                this.f3834f.setBounds(0, 0, this.f3836h, this.f3848t);
                if (AbstractC0605j0.m2241q(this.f3849u) == 1) {
                    this.f3834f.draw(canvas);
                    canvas.translate(this.f3835g, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f3833e.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i3 = this.f3835g;
                } else {
                    canvas.translate(i3, 0.0f);
                    this.f3834f.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.f3833e.draw(canvas);
                }
                canvas.translate(-i3, -i6);
            }
            if (this.f3851w) {
                int i7 = this.f3848t;
                int i8 = this.f3839k;
                int i9 = i7 - i8;
                int i10 = this.f3845q;
                int i11 = this.f3844p;
                int i12 = i10 - (i11 / 2);
                this.f3837i.setBounds(0, 0, i11, i8);
                this.f3838j.setBounds(0, 0, this.f3847s, this.f3840l);
                canvas.translate(0.0f, i9);
                this.f3838j.draw(canvas);
                canvas.translate(i12, 0.0f);
                this.f3837i.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }

    /* renamed from: g */
    public final void m1462g() {
        this.f3849u.removeCallbacks(this.f3829D);
    }

    /* renamed from: h */
    public boolean m1461h(float f, float f2) {
        if (f2 >= this.f3848t - this.f3839k) {
            int i = this.f3845q;
            int i2 = this.f3844p;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean m1460i(float f, float f2) {
        if (AbstractC0605j0.m2241q(this.f3849u) == 1) {
            if (f > this.f3835g) {
                return false;
            }
        } else if (f < this.f3847s - this.f3835g) {
            return false;
        }
        int i = this.f3842n;
        int i2 = this.f3841m / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    /* renamed from: j */
    public final int m1459j(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: k */
    public void m1458k(int i) {
        int i2;
        if (i == 2 && this.f3852x != 2) {
            this.f3833e.setState(f3824a);
            m1462g();
        }
        if (i == 0) {
            this.f3849u.invalidate();
        } else {
            m1457l();
        }
        if (this.f3852x != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1500;
            this.f3852x = i;
        }
        this.f3833e.setState(f3825b);
        i2 = 1200;
        m1462g();
        this.f3849u.postDelayed(this.f3829D, i2);
        this.f3852x = i;
    }

    /* renamed from: l */
    public void m1457l() {
        int i = this.f3828C;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.f3827B.cancel();
        }
        this.f3828C = 1;
        ValueAnimator valueAnimator = this.f3827B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3827B.setDuration(500L);
        this.f3827B.setStartDelay(0L);
        this.f3827B.start();
    }
}