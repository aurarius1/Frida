package p010b.p083u.p084e;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.u.e.f2 */
/* loaded from: classes.dex */
public class RunnableC0937f2 implements Runnable {

    /* renamed from: b */
    public int f3595b;

    /* renamed from: c */
    public int f3596c;

    /* renamed from: d */
    public OverScroller f3597d;

    /* renamed from: e */
    public Interpolator f3598e;

    /* renamed from: f */
    public boolean f3599f;

    /* renamed from: g */
    public boolean f3600g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f3601h;

    public RunnableC0937f2(RecyclerView recyclerView) {
        this.f3601h = recyclerView;
        Interpolator interpolator = RecyclerView.f707j;
        this.f3598e = interpolator;
        this.f3599f = false;
        this.f3600g = false;
        this.f3597d = new OverScroller(recyclerView.getContext(), interpolator);
    }

    /* renamed from: a */
    public void m1675a() {
        if (this.f3599f) {
            this.f3600g = true;
            return;
        }
        this.f3601h.removeCallbacks(this);
        AbstractC0605j0.m2276G(this.f3601h, this);
    }

    /* renamed from: b */
    public void m1674b(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = this.f3601h;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f707j;
        }
        if (this.f3598e != interpolator) {
            this.f3598e = interpolator;
            this.f3597d = new OverScroller(this.f3601h.getContext(), interpolator);
        }
        this.f3596c = 0;
        this.f3595b = 0;
        this.f3601h.setScrollState(2);
        this.f3597d.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.f3597d.computeScrollOffset();
        }
        m1675a();
    }

    /* renamed from: c */
    public void m1673c() {
        this.f3601h.removeCallbacks(this);
        this.f3597d.abortAnimation();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int i2;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3601h;
        if (recyclerView.f777w == null) {
            m1673c();
            return;
        }
        this.f3600g = false;
        this.f3599f = true;
        recyclerView.m3148n();
        OverScroller overScroller = this.f3597d;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.f3595b;
            int i4 = currY - this.f3596c;
            this.f3595b = currX;
            this.f3596c = currY;
            RecyclerView recyclerView2 = this.f3601h;
            int[] iArr = recyclerView2.f719F0;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView2.m3137t(i3, i4, iArr, null, 1)) {
                int[] iArr2 = this.f3601h.f719F0;
                i3 -= iArr2[0];
                i4 -= iArr2[1];
            }
            if (this.f3601h.getOverScrollMode() != 2) {
                this.f3601h.m3150m(i3, i4);
            }
            RecyclerView recyclerView3 = this.f3601h;
            if (recyclerView3.f775v != null) {
                int[] iArr3 = recyclerView3.f719F0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.m3155j0(i3, i4, iArr3);
                RecyclerView recyclerView4 = this.f3601h;
                int[] iArr4 = recyclerView4.f719F0;
                i2 = iArr4[0];
                i = iArr4[1];
                i3 -= i2;
                i4 -= i;
                C0983r0 c0983r0 = recyclerView4.f777w.f3778g;
                if (c0983r0 != null && !c0983r0.f3800d && c0983r0.f3801e) {
                    int m1684b = recyclerView4.f770s0.m1684b();
                    if (m1684b == 0) {
                        c0983r0.m1474f();
                    } else {
                        if (c0983r0.f3797a >= m1684b) {
                            c0983r0.f3797a = m1684b - 1;
                        }
                        c0983r0.m1475d(i2, i);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!this.f3601h.f783z.isEmpty()) {
                this.f3601h.invalidate();
            }
            RecyclerView recyclerView5 = this.f3601h;
            int[] iArr5 = recyclerView5.f719F0;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView5.m3136u(i2, i, i3, i4, null, 1, iArr5);
            RecyclerView recyclerView6 = this.f3601h;
            int[] iArr6 = recyclerView6.f719F0;
            int i5 = i3 - iArr6[0];
            int i6 = i4 - iArr6[1];
            if (i2 != 0 || i != 0) {
                recyclerView6.m3135v(i2, i);
            }
            awakenScrollBars = this.f3601h.awakenScrollBars();
            if (!awakenScrollBars) {
                this.f3601h.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
            RecyclerView recyclerView7 = this.f3601h;
            C0983r0 c0983r02 = recyclerView7.f777w.f3778g;
            if (!(c0983r02 != null && c0983r02.f3800d) && z) {
                if (recyclerView7.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                    if (i6 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i6 <= 0) {
                        currVelocity = 0;
                    }
                    RecyclerView recyclerView8 = this.f3601h;
                    recyclerView8.getClass();
                    if (i7 < 0) {
                        recyclerView8.m3133x();
                        if (recyclerView8.f739T.isFinished()) {
                            recyclerView8.f739T.onAbsorb(-i7);
                        }
                    } else if (i7 > 0) {
                        recyclerView8.m3132y();
                        if (recyclerView8.f741V.isFinished()) {
                            recyclerView8.f741V.onAbsorb(i7);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView8.m3131z();
                        if (recyclerView8.f740U.isFinished()) {
                            recyclerView8.f740U.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView8.m3134w();
                        if (recyclerView8.f742W.isFinished()) {
                            recyclerView8.f742W.onAbsorb(currVelocity);
                        }
                    }
                    if (i7 != 0 || currVelocity != 0) {
                        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                        if (Build.VERSION.SDK_INT >= 16) {
                            recyclerView8.postInvalidateOnAnimation();
                        } else {
                            recyclerView8.postInvalidate();
                        }
                    }
                }
                if (RecyclerView.f703f) {
                    C0998v c0998v = this.f3601h.f768r0;
                    int[] iArr7 = c0998v.f3863c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    c0998v.f3864d = 0;
                }
            } else {
                m1675a();
                RecyclerView recyclerView9 = this.f3601h;
                RunnableC1005x runnableC1005x = recyclerView9.f766q0;
                if (runnableC1005x != null) {
                    runnableC1005x.m1419a(recyclerView9, i2, i);
                }
            }
        }
        C0983r0 c0983r03 = this.f3601h.f777w.f3778g;
        if (c0983r03 != null && c0983r03.f3800d) {
            c0983r03.m1475d(0, 0);
        }
        this.f3599f = false;
        if (this.f3600g) {
            this.f3601h.removeCallbacks(this);
            AbstractC0605j0.m2276G(this.f3601h, this);
            return;
        }
        this.f3601h.setScrollState(0);
        this.f3601h.m3141q0(1);
    }
}