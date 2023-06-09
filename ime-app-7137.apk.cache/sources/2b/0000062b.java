package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import p093c.p097b.p130z.p132r0.GestureDetector$OnGestureListenerC1724h0;

@TargetApi(8)
/* renamed from: c.b.t.d */
/* loaded from: classes.dex */
public class C1447d extends GestureDetector {

    /* renamed from: a */
    public final ScaleGestureDetector f4745a;

    /* renamed from: b */
    public final GestureDetector$OnGestureListenerC1724h0 f4746b;

    /* renamed from: c */
    public int f4747c;

    public C1447d(Context context, GestureDetector$OnGestureListenerC1724h0 gestureDetector$OnGestureListenerC1724h0) {
        super(context, gestureDetector$OnGestureListenerC1724h0, null, true);
        this.f4747c = -1;
        this.f4746b = gestureDetector$OnGestureListenerC1724h0;
        this.f4745a = new ScaleGestureDetector(context, new C1446c(this));
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = this.f4747c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && motionEvent.getPointerCount() == 1) {
                this.f4747c = -1;
            }
        } else if (motionEvent.getPointerCount() == 1) {
            i = motionEvent.getPointerId(0);
            this.f4747c = i;
        }
        try {
            this.f4745a.onTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
        }
        if (motionEvent.getPointerCount() == 1 && motionEvent.getPointerId(0) == i) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}