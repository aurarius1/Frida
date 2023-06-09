package p010b.p044i.p045d;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p010b.p046j.p058l.C0573c1;

/* renamed from: b.i.d.b */
/* loaded from: classes.dex */
public abstract class AbstractC0452b {
    public AbstractC0452b() {
    }

    public AbstractC0452b(Context context, AttributeSet attributeSet) {
    }

    /* renamed from: A */
    public boolean mo208A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo276a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    /* renamed from: b */
    public int m2448b() {
        return -16777216;
    }

    /* renamed from: c */
    public float m2447c() {
        return 0.0f;
    }

    /* renamed from: d */
    public boolean mo210d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    /* renamed from: e */
    public C0573c1 m2446e(C0573c1 c0573c1) {
        return c0573c1;
    }

    /* renamed from: f */
    public void mo209f(C0455e c0455e) {
    }

    /* renamed from: g */
    public boolean mo222g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    /* renamed from: h */
    public void mo353h(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    /* renamed from: i */
    public void mo330i() {
    }

    /* renamed from: j */
    public boolean mo272j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: k */
    public abstract boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i);

    /* renamed from: l */
    public boolean mo352l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    /* renamed from: m */
    public boolean m2445m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo329n(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    @Deprecated
    /* renamed from: o */
    public void m2444o() {
    }

    /* renamed from: p */
    public void mo328p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            m2444o();
        }
    }

    @Deprecated
    /* renamed from: q */
    public void m2443q() {
    }

    /* renamed from: r */
    public void mo327r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (i5 == 0) {
            m2443q();
        }
    }

    @Deprecated
    /* renamed from: s */
    public void m2442s() {
    }

    /* renamed from: t */
    public boolean mo351t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    /* renamed from: u */
    public void mo326u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    /* renamed from: v */
    public Parcelable mo325v(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    @Deprecated
    /* renamed from: w */
    public boolean m2441w() {
        return false;
    }

    /* renamed from: x */
    public boolean mo324x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return m2441w();
        }
        return false;
    }

    @Deprecated
    /* renamed from: y */
    public void m2440y() {
    }

    /* renamed from: z */
    public void mo323z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (i == 0) {
            m2440y();
        }
    }
}