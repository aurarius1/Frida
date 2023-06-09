package p093c.p145g.p146a.p147a.p159k0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.TimePickerView;

/* renamed from: c.g.a.a.k0.l */
/* loaded from: classes.dex */
public class C1938l extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f5880a;

    public C1938l(TimePickerView timePickerView) {
        this.f5880a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        TimePickerView timePickerView = this.f5880a;
        int i = TimePickerView.f6960s;
        timePickerView.getClass();
        return onDoubleTap;
    }
}