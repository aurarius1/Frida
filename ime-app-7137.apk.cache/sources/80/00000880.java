package p093c.p145g.p146a.p147a.p172x;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: c.g.a.a.x.a */
/* loaded from: classes.dex */
public class View$OnTouchListenerC2044a implements View.OnTouchListener {

    /* renamed from: b */
    public final Dialog f6215b;

    /* renamed from: c */
    public final int f6216c;

    /* renamed from: d */
    public final int f6217d;

    /* renamed from: e */
    public final int f6218e;

    public View$OnTouchListenerC2044a(Dialog dialog, Rect rect) {
        this.f6215b = dialog;
        this.f6216c = rect.left;
        this.f6217d = rect.top;
        this.f6218e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f6216c;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f6217d;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f6218e;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f6215b.onTouchEvent(obtain);
    }
}