package p093c.p145g.p146a.p147a.p156i0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: c.g.a.a.i0.w */
/* loaded from: classes.dex */
public class View$OnTouchListenerC1920w implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f5832b;

    /* renamed from: c */
    public final /* synthetic */ C1923z f5833c;

    public View$OnTouchListenerC1920w(C1923z c1923z, AutoCompleteTextView autoCompleteTextView) {
        this.f5833c = c1923z;
        this.f5832b = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f5833c.m677i()) {
                this.f5833c.f5842j = false;
            }
            C1923z.m679g(this.f5833c, this.f5832b);
        }
        return false;
    }
}