package p093c.p145g.p146a.p147a.p162n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.lang.ref.WeakReference;

/* renamed from: c.g.a.a.n.c */
/* loaded from: classes.dex */
public abstract class AbstractC1953c extends AbstractC1954d {

    /* renamed from: c */
    public OverScroller f5907c;

    /* renamed from: d */
    public boolean f5908d;

    /* renamed from: e */
    public int f5909e;

    /* renamed from: f */
    public int f5910f;

    /* renamed from: g */
    public int f5911g;

    /* renamed from: h */
    public VelocityTracker f5912h;

    public AbstractC1953c() {
        this.f5909e = -1;
        this.f5911g = -1;
    }

    public AbstractC1953c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5909e = -1;
        this.f5911g = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo208A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f5912h;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f5912h.computeCurrentVelocity(1000);
                this.f5912h.getYVelocity(this.f5909e);
                AbstractC1952b abstractC1952b = (AbstractC1952b) view;
                throw null;
            }
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5909e);
            if (findPointerIndex == -1) {
                return false;
            }
            this.f5910f = (int) motionEvent.getY(findPointerIndex);
            AbstractC1952b abstractC1952b2 = (AbstractC1952b) view;
            throw null;
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f5909e = motionEvent.getPointerId(i);
                this.f5910f = (int) (motionEvent.getY(i) + 0.5f);
            }
            velocityTracker = this.f5912h;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return !this.f5908d;
        }
        this.f5908d = false;
        this.f5909e = -1;
        VelocityTracker velocityTracker3 = this.f5912h;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f5912h = null;
        }
        velocityTracker = this.f5912h;
        if (velocityTracker != null) {
        }
        if (!this.f5908d) {
        }
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: j */
    public boolean mo272j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int findPointerIndex;
        if (this.f5911g < 0) {
            this.f5911g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f5908d) {
            int i = this.f5909e;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f5910f) > this.f5911g) {
                this.f5910f = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f5909e = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            AbstractC1952b abstractC1952b = (AbstractC1952b) view;
            WeakReference weakReference = ((AppBarLayout$BaseBehavior) this).f6644m;
            boolean z = (weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) && coordinatorLayout.m3354o(view, x, y2);
            this.f5908d = z;
            if (z) {
                this.f5910f = y2;
                this.f5909e = motionEvent.getPointerId(0);
                if (this.f5912h == null) {
                    this.f5912h = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f5907c;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f5907c.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f5912h;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}