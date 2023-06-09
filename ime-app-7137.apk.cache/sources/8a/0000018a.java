package p010b.p016c.p026q;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: b.c.q.i3 */
/* loaded from: classes.dex */
public class C0262i3 extends TouchDelegate {

    /* renamed from: a */
    public final View f1602a;

    /* renamed from: b */
    public final Rect f1603b;

    /* renamed from: c */
    public final Rect f1604c;

    /* renamed from: d */
    public final Rect f1605d;

    /* renamed from: e */
    public final int f1606e;

    /* renamed from: f */
    public boolean f1607f;

    public C0262i3(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.f1606e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1603b = new Rect();
        this.f1605d = new Rect();
        this.f1604c = new Rect();
        m2811a(rect, rect2);
        this.f1602a = view;
    }

    /* renamed from: a */
    public void m2811a(Rect rect, Rect rect2) {
        this.f1603b.set(rect);
        this.f1605d.set(rect);
        Rect rect3 = this.f1605d;
        int i = this.f1606e;
        rect3.inset(-i, -i);
        this.f1604c.set(rect2);
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        int i;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f1607f;
                if (z2 && !this.f1605d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f1607f;
                    this.f1607f = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else {
            if (this.f1603b.contains(x, y)) {
                this.f1607f = true;
                z = true;
            }
            z = true;
            z3 = false;
        }
        if (z3) {
            if (!z || this.f1604c.contains(x, y)) {
                Rect rect = this.f1604c;
                f = x - rect.left;
                i = y - rect.top;
            } else {
                f = this.f1602a.getWidth() / 2;
                i = this.f1602a.getHeight() / 2;
            }
            motionEvent.setLocation(f, i);
            return this.f1602a.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}