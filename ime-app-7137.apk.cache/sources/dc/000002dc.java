package p010b.p046j.p058l;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: b.j.l.h */
/* loaded from: classes.dex */
public class C0600h implements InterfaceC0596f {

    /* renamed from: a */
    public static final int f2718a = ViewConfiguration.getLongPressTimeout();

    /* renamed from: b */
    public static final int f2719b = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    public static final int f2720c = ViewConfiguration.getDoubleTapTimeout();

    /* renamed from: d */
    public int f2721d;

    /* renamed from: e */
    public int f2722e;

    /* renamed from: f */
    public int f2723f;

    /* renamed from: g */
    public int f2724g;

    /* renamed from: h */
    public final Handler f2725h;

    /* renamed from: i */
    public final GestureDetector.OnGestureListener f2726i;

    /* renamed from: j */
    public GestureDetector.OnDoubleTapListener f2727j;

    /* renamed from: k */
    public boolean f2728k;

    /* renamed from: l */
    public boolean f2729l;

    /* renamed from: m */
    public boolean f2730m;

    /* renamed from: n */
    public boolean f2731n;

    /* renamed from: o */
    public boolean f2732o;

    /* renamed from: p */
    public MotionEvent f2733p;

    /* renamed from: q */
    public MotionEvent f2734q;

    /* renamed from: r */
    public boolean f2735r;

    /* renamed from: s */
    public float f2736s;

    /* renamed from: t */
    public float f2737t;

    /* renamed from: u */
    public float f2738u;

    /* renamed from: v */
    public float f2739v;

    /* renamed from: w */
    public boolean f2740w;

    /* renamed from: x */
    public VelocityTracker f2741x;

    public C0600h(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (handler != null) {
            this.f2725h = new HandlerC0598g(this, handler);
        } else {
            this.f2725h = new HandlerC0598g(this);
        }
        this.f2726i = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.f2727j = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        if (onGestureListener == null) {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        }
        this.f2740w = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        this.f2723f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2724g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2721d = scaledTouchSlop * scaledTouchSlop;
        this.f2722e = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0290  */
    @Override // p010b.p046j.p058l.InterfaceC0596f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo2285a(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean z2;
        boolean onFling;
        GestureDetector.OnDoubleTapListener onDoubleTapListener;
        int action = motionEvent.getAction();
        if (this.f2741x == null) {
            this.f2741x = VelocityTracker.obtain();
        }
        this.f2741x.addMovement(motionEvent);
        int i = action & 255;
        boolean z3 = i == 6;
        int actionIndex = z3 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (actionIndex != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        float f3 = z3 ? pointerCount - 1 : pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        if (i == 0) {
            if (this.f2727j != null) {
                boolean hasMessages = this.f2725h.hasMessages(3);
                if (hasMessages) {
                    this.f2725h.removeMessages(3);
                }
                MotionEvent motionEvent4 = this.f2733p;
                if (motionEvent4 != null && (motionEvent3 = this.f2734q) != null && hasMessages) {
                    if (this.f2732o && motionEvent.getEventTime() - motionEvent3.getEventTime() <= f2720c) {
                        int x = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                        int y = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                        if ((y * y) + (x * x) < this.f2722e) {
                            z2 = true;
                            if (z2) {
                                this.f2735r = true;
                                z = this.f2727j.onDoubleTap(this.f2733p) | false | this.f2727j.onDoubleTapEvent(motionEvent);
                                this.f2736s = f4;
                                this.f2738u = f4;
                                this.f2737t = f5;
                                this.f2739v = f5;
                                motionEvent2 = this.f2733p;
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                this.f2733p = MotionEvent.obtain(motionEvent);
                                this.f2731n = true;
                                this.f2732o = true;
                                this.f2728k = true;
                                this.f2730m = false;
                                this.f2729l = false;
                                if (this.f2740w) {
                                    this.f2725h.removeMessages(2);
                                    this.f2725h.sendEmptyMessageAtTime(2, this.f2733p.getDownTime() + f2719b + f2718a);
                                }
                                this.f2725h.sendEmptyMessageAtTime(1, this.f2733p.getDownTime() + f2719b);
                                return z | this.f2726i.onDown(motionEvent);
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                this.f2725h.sendEmptyMessageDelayed(3, f2720c);
            }
            z = false;
            this.f2736s = f4;
            this.f2738u = f4;
            this.f2737t = f5;
            this.f2739v = f5;
            motionEvent2 = this.f2733p;
            if (motionEvent2 != null) {
            }
            this.f2733p = MotionEvent.obtain(motionEvent);
            this.f2731n = true;
            this.f2732o = true;
            this.f2728k = true;
            this.f2730m = false;
            this.f2729l = false;
            if (this.f2740w) {
            }
            this.f2725h.sendEmptyMessageAtTime(1, this.f2733p.getDownTime() + f2719b);
            return z | this.f2726i.onDown(motionEvent);
        }
        if (i == 1) {
            this.f2728k = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (this.f2735r) {
                onFling = this.f2727j.onDoubleTapEvent(motionEvent) | false;
            } else {
                if (this.f2730m) {
                    this.f2725h.removeMessages(3);
                    this.f2730m = false;
                } else if (this.f2731n) {
                    boolean onSingleTapUp = this.f2726i.onSingleTapUp(motionEvent);
                    if (this.f2729l && (onDoubleTapListener = this.f2727j) != null) {
                        onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = this.f2741x;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, this.f2724g);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > this.f2723f || Math.abs(xVelocity) > this.f2723f) {
                        onFling = this.f2726i.onFling(this.f2733p, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = this.f2734q;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            this.f2734q = obtain;
            VelocityTracker velocityTracker2 = this.f2741x;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f2741x = null;
            }
            this.f2735r = false;
            this.f2729l = false;
            this.f2725h.removeMessages(1);
            this.f2725h.removeMessages(2);
        } else if (i != 2) {
            if (i == 3) {
                this.f2725h.removeMessages(1);
                this.f2725h.removeMessages(2);
                this.f2725h.removeMessages(3);
                this.f2741x.recycle();
                this.f2741x = null;
                this.f2735r = false;
                this.f2728k = false;
                this.f2731n = false;
                this.f2732o = false;
                this.f2729l = false;
                if (this.f2730m) {
                    this.f2730m = false;
                    return false;
                }
                return false;
            } else if (i == 5) {
                this.f2736s = f4;
                this.f2738u = f4;
                this.f2737t = f5;
                this.f2739v = f5;
                this.f2725h.removeMessages(1);
                this.f2725h.removeMessages(2);
                this.f2725h.removeMessages(3);
                this.f2735r = false;
                this.f2731n = false;
                this.f2732o = false;
                this.f2729l = false;
                if (this.f2730m) {
                    this.f2730m = false;
                    return false;
                }
                return false;
            } else if (i != 6) {
                return false;
            } else {
                this.f2736s = f4;
                this.f2738u = f4;
                this.f2737t = f5;
                this.f2739v = f5;
                this.f2741x.computeCurrentVelocity(1000, this.f2724g);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = this.f2741x.getXVelocity(pointerId2);
                float yVelocity2 = this.f2741x.getYVelocity(pointerId2);
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (i3 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i3);
                        if ((this.f2741x.getYVelocity(pointerId3) * yVelocity2) + (this.f2741x.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            this.f2741x.clear();
                            return false;
                        }
                    }
                }
                return false;
            }
        } else if (this.f2730m) {
            return false;
        } else {
            float f6 = this.f2736s - f4;
            float f7 = this.f2737t - f5;
            if (this.f2735r) {
                return false | this.f2727j.onDoubleTapEvent(motionEvent);
            }
            if (!this.f2731n) {
                if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                    boolean onScroll = this.f2726i.onScroll(this.f2733p, motionEvent, f6, f7);
                    this.f2736s = f4;
                    this.f2737t = f5;
                    return onScroll;
                }
                return false;
            }
            int i4 = (int) (f4 - this.f2738u);
            int i5 = (int) (f5 - this.f2739v);
            int i6 = (i5 * i5) + (i4 * i4);
            if (i6 > this.f2721d) {
                onFling = this.f2726i.onScroll(this.f2733p, motionEvent, f6, f7);
                this.f2736s = f4;
                this.f2737t = f5;
                this.f2731n = false;
                this.f2725h.removeMessages(3);
                this.f2725h.removeMessages(1);
                this.f2725h.removeMessages(2);
            } else {
                onFling = false;
            }
            if (i6 > this.f2721d) {
                this.f2732o = false;
            }
        }
        return onFling;
    }
}