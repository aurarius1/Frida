package p093c.p145g.p146a.p147a.p159k0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;

/* renamed from: c.g.a.a.k0.m */
/* loaded from: classes.dex */
public class View$OnTouchListenerC1939m implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ GestureDetector f5881b;

    public View$OnTouchListenerC1939m(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.f5881b = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f5881b.onTouchEvent(motionEvent);
        }
        return false;
    }
}