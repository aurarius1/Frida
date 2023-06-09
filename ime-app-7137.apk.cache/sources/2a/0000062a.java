package p093c.p097b.p121t;

import android.view.ScaleGestureDetector;
import p093c.p097b.p130z.p132r0.GestureDetector$OnGestureListenerC1724h0;

/* renamed from: c.b.t.c */
/* loaded from: classes.dex */
public class C1446c extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a */
    public final /* synthetic */ C1447d f4744a;

    public C1446c(C1447d c1447d) {
        this.f4744a = c1447d;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        double scaleFactor = scaleGestureDetector.getScaleFactor();
        if (scaleFactor > 1.1d) {
            GestureDetector$OnGestureListenerC1724h0 gestureDetector$OnGestureListenerC1724h0 = this.f4744a.f4746b;
            gestureDetector$OnGestureListenerC1724h0.getClass();
            if (scaleFactor > 1.35d) {
                gestureDetector$OnGestureListenerC1724h0.f5316a.mo405h();
                gestureDetector$OnGestureListenerC1724h0.f5316a.f6523u.mo444j();
                return true;
            }
            return false;
        } else if (scaleFactor < 0.9d) {
            GestureDetector$OnGestureListenerC1724h0 gestureDetector$OnGestureListenerC1724h02 = this.f4744a.f4746b;
            gestureDetector$OnGestureListenerC1724h02.getClass();
            if (scaleFactor < 0.65d) {
                gestureDetector$OnGestureListenerC1724h02.f5316a.mo405h();
                gestureDetector$OnGestureListenerC1724h02.f5316a.f6523u.mo442l();
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}