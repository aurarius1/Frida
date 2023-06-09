package p093c.p145g.p146a.p147a.p159k0;

import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* renamed from: c.g.a.a.k0.c */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnPreDrawListenerC1929c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final /* synthetic */ ClockFaceView f5871b;

    public ViewTreeObserver$OnPreDrawListenerC1929c(ClockFaceView clockFaceView) {
        this.f5871b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (this.f5871b.isShown()) {
            this.f5871b.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView clockFaceView = this.f5871b;
            int height = ((this.f5871b.getHeight() / 2) - clockFaceView.f6939v.f6951i) - clockFaceView.f6935C;
            if (height != clockFaceView.f5876t) {
                clockFaceView.f5876t = height;
                clockFaceView.m675h();
                ClockHandView clockHandView = clockFaceView.f6939v;
                clockHandView.f6959q = clockFaceView.f5876t;
                clockHandView.invalidate();
            }
            return true;
        }
        return true;
    }
}