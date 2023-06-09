package p010b.p016c.p026q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p010b.p016c.p024p.p025m.InterfaceC0187h0;

/* renamed from: b.c.q.w1 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0330w1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f1789b;

    /* renamed from: c */
    public final int f1790c;

    /* renamed from: d */
    public final int f1791d;

    /* renamed from: e */
    public final View f1792e;

    /* renamed from: f */
    public Runnable f1793f;

    /* renamed from: g */
    public Runnable f1794g;

    /* renamed from: h */
    public boolean f1795h;

    /* renamed from: i */
    public int f1796i;

    /* renamed from: j */
    public final int[] f1797j = new int[2];

    public AbstractView$OnTouchListenerC0330w1(View view) {
        this.f1792e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1789b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1790c = tapTimeout;
        this.f1791d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m2732a() {
        Runnable runnable = this.f1794g;
        if (runnable != null) {
            this.f1792e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1793f;
        if (runnable2 != null) {
            this.f1792e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC0187h0 mo2731b();

    /* renamed from: c */
    public abstract boolean mo2730c();

    /* renamed from: d */
    public boolean mo2729d() {
        InterfaceC0187h0 mo2731b = mo2731b();
        if (mo2731b == null || !mo2731b.mo2835b()) {
            return true;
        }
        mo2731b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r4 != 3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        C0305r1 c0305r1;
        boolean z4 = this.f1795h;
        if (z4) {
            View view2 = this.f1792e;
            InterfaceC0187h0 mo2731b = mo2731b();
            if (mo2731b != null && mo2731b.mo2835b() && (c0305r1 = (C0305r1) mo2731b.mo2830k()) != null && c0305r1.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1797j;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                int[] iArr2 = this.f1797j;
                c0305r1.getLocationOnScreen(iArr2);
                obtainNoHistory.offsetLocation(-iArr2[0], -iArr2[1]);
                boolean m2736b = c0305r1.m2736b(obtainNoHistory, this.f1796i);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (m2736b && z5) {
                    z3 = true;
                    z2 = (z3 && mo2729d()) ? false : true;
                }
            }
            z3 = false;
            if (z3) {
            }
        } else {
            View view3 = this.f1792e;
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f1796i);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.f1789b;
                                float f2 = -f;
                                if (!(x >= f2 && y >= f2 && x < ((float) (view3.getRight() - view3.getLeft())) + f && y < ((float) (view3.getBottom() - view3.getTop())) + f)) {
                                    m2732a();
                                    view3.getParent().requestDisallowInterceptTouchEvent(true);
                                    z = true;
                                    z2 = !z && mo2730c();
                                    if (z2) {
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                        this.f1792e.onTouchEvent(obtain);
                                        obtain.recycle();
                                    }
                                }
                            }
                        }
                    }
                    m2732a();
                } else {
                    this.f1796i = motionEvent.getPointerId(0);
                    if (this.f1793f == null) {
                        this.f1793f = new RunnableC0320u1(this);
                    }
                    view3.postDelayed(this.f1793f, this.f1790c);
                    if (this.f1794g == null) {
                        this.f1794g = new RunnableC0325v1(this);
                    }
                    view3.postDelayed(this.f1794g, this.f1791d);
                }
            }
            z = false;
            if (z) {
            }
            if (z2) {
            }
        }
        this.f1795h = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1795h = false;
        this.f1796i = -1;
        Runnable runnable = this.f1793f;
        if (runnable != null) {
            this.f1792e.removeCallbacks(runnable);
        }
    }
}