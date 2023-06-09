package p093c.p097b.p130z.p132r0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;

/* renamed from: c.b.z.r0.h0 */
/* loaded from: classes.dex */
public final class GestureDetector$OnGestureListenerC1724h0 implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    public final AnyKeyboardViewBase f5316a;

    public GestureDetector$OnGestureListenerC1724h0(AnyKeyboardViewBase anyKeyboardViewBase) {
        this.f5316a = anyKeyboardViewBase;
    }

    /* renamed from: a */
    public static int m870a(MotionEvent motionEvent, MotionEvent motionEvent2, int i) {
        int findPointerIndex = motionEvent2.findPointerIndex(motionEvent.getPointerId(i));
        if (findPointerIndex == -1) {
            return -1;
        }
        float x = motionEvent2.getX(findPointerIndex) - motionEvent.getX(i);
        float y = motionEvent2.getY(findPointerIndex) - motionEvent.getY(i);
        if (Math.abs(x - y) < 1.0f) {
            return -1;
        }
        return Math.abs(x) > Math.abs(y) ? x > 0.0f ? 3 : 2 : y > 0.0f ? 1 : 0;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f5316a.m393t()) {
            return false;
        }
        boolean z = Math.abs(f) > Math.abs(f2);
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        int i = this.f5316a.mo392u() ? this.f5316a.f6468E : this.f5316a.f6466C;
        AnyKeyboardViewBase anyKeyboardViewBase = this.f5316a;
        int i2 = anyKeyboardViewBase.f6465B;
        if (f > i2 && z && x > i) {
            this.f5316a.mo405h();
            AnyKeyboardViewBase anyKeyboardViewBase2 = this.f5316a;
            anyKeyboardViewBase2.f6523u.mo438r(anyKeyboardViewBase2.m393t());
            return true;
        } else if (f < (-i2) && z && x < (-i)) {
            this.f5316a.mo405h();
            AnyKeyboardViewBase anyKeyboardViewBase3 = this.f5316a;
            anyKeyboardViewBase3.f6523u.mo440o(anyKeyboardViewBase3.m393t());
            return true;
        } else if (f2 < (-i2) && !z && y < (-anyKeyboardViewBase.f6467D)) {
            this.f5316a.mo405h();
            this.f5316a.f6523u.mo439q();
            return true;
        } else if (f2 <= i2 || z || y <= anyKeyboardViewBase.f6467D) {
            return false;
        } else {
            this.f5316a.mo405h();
            this.f5316a.f6523u.mo441m();
            return true;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        if (this.f5316a.m393t()) {
            int m870a = m870a(motionEvent, motionEvent2, 0);
            int i = 1;
            while (true) {
                if (i >= motionEvent2.getPointerCount()) {
                    z = true;
                    break;
                } else if (m870a(motionEvent, motionEvent2, i) != m870a) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                return false;
            }
        }
        float abs = Math.abs(motionEvent2.getX() - motionEvent.getX());
        float abs2 = Math.abs(motionEvent2.getY() - motionEvent.getY());
        float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
        float abs3 = Math.abs(abs / eventTime) * 1000.0f;
        if (abs3 > Math.abs(abs2 / eventTime) * 1000.0f && abs3 > this.f5316a.f6465B) {
            if (abs > (this.f5316a.mo392u() ? this.f5316a.f6468E : this.f5316a.f6466C)) {
                this.f5316a.mo405h();
                if (motionEvent2.getX() > motionEvent.getX()) {
                    AnyKeyboardViewBase anyKeyboardViewBase = this.f5316a;
                    anyKeyboardViewBase.f6523u.mo438r(anyKeyboardViewBase.m393t());
                } else {
                    AnyKeyboardViewBase anyKeyboardViewBase2 = this.f5316a;
                    anyKeyboardViewBase2.f6523u.mo440o(anyKeyboardViewBase2.m393t());
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}