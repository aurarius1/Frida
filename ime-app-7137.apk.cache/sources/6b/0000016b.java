package p010b.p016c.p026q;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: b.c.q.d2 */
/* loaded from: classes.dex */
public class View$OnTouchListenerC0231d2 implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ C0243f2 f1506b;

    public View$OnTouchListenerC0231d2(C0243f2 c0243f2) {
        this.f1506b = c0243f2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (popupWindow = this.f1506b.f1558D) != null && popupWindow.isShowing() && x >= 0 && x < this.f1506b.f1558D.getWidth() && y >= 0 && y < this.f1506b.f1558D.getHeight()) {
            C0243f2 c0243f2 = this.f1506b;
            c0243f2.f1580z.postDelayed(c0243f2.f1576v, 250L);
            return false;
        } else if (action == 1) {
            C0243f2 c0243f22 = this.f1506b;
            c0243f22.f1580z.removeCallbacks(c0243f22.f1576v);
            return false;
        } else {
            return false;
        }
    }
}