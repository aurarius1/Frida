package p010b.p083u.p084e;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.c0 */
/* loaded from: classes.dex */
public class C0923c0 implements InterfaceC0992t1 {

    /* renamed from: a */
    public final /* synthetic */ C0959l0 f3548a;

    public C0923c0(C0959l0 c0959l0) {
        this.f3548a = c0959l0;
    }

    @Override // p010b.p083u.p084e.InterfaceC0992t1
    /* renamed from: a */
    public boolean mo1456a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        this.f3548a.f3698z.f2747a.mo2285a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0927d0 c0927d0 = null;
        if (actionMasked == 0) {
            this.f3548a.f3684l = motionEvent.getPointerId(0);
            this.f3548a.f3676d = motionEvent.getX();
            this.f3548a.f3677e = motionEvent.getY();
            C0959l0 c0959l0 = this.f3548a;
            VelocityTracker velocityTracker = c0959l0.f3692t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c0959l0.f3692t = VelocityTracker.obtain();
            C0959l0 c0959l02 = this.f3548a;
            if (c0959l02.f3675c == null) {
                if (!c0959l02.f3688p.isEmpty()) {
                    View m1624k = c0959l02.m1624k(motionEvent);
                    int size = c0959l02.f3688p.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C0927d0 c0927d02 = (C0927d0) c0959l02.f3688p.get(size);
                        if (c0927d02.f3557e.f3605c == m1624k) {
                            c0927d0 = c0927d02;
                            break;
                        }
                        size--;
                    }
                }
                if (c0927d0 != null) {
                    C0959l0 c0959l03 = this.f3548a;
                    c0959l03.f3676d -= c0927d0.f3561i;
                    c0959l03.f3677e -= c0927d0.f3562j;
                    c0959l03.m1625j(c0927d0.f3557e, true);
                    if (this.f3548a.f3673a.remove(c0927d0.f3557e.f3605c)) {
                        C0959l0 c0959l04 = this.f3548a;
                        c0959l04.f3685m.m1640a(c0959l04.f3690r, c0927d0.f3557e);
                    }
                    this.f3548a.m1619p(c0927d0.f3557e, c0927d0.f3558f);
                    C0959l0 c0959l05 = this.f3548a;
                    c0959l05.m1618q(motionEvent, c0959l05.f3687o, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            C0959l0 c0959l06 = this.f3548a;
            c0959l06.f3684l = -1;
            c0959l06.m1619p(null, 0);
        } else {
            int i = this.f3548a.f3684l;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                this.f3548a.m1627h(actionMasked, motionEvent, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker2 = this.f3548a.f3692t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.f3548a.f3675c != null;
    }

    @Override // p010b.p083u.p084e.InterfaceC0992t1
    /* renamed from: b */
    public void mo1455b(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f3548a.f3698z.f2747a.mo2285a(motionEvent);
        VelocityTracker velocityTracker = this.f3548a.f3692t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.f3548a.f3684l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(this.f3548a.f3684l);
        if (findPointerIndex >= 0) {
            this.f3548a.m1627h(actionMasked, motionEvent, findPointerIndex);
        }
        C0959l0 c0959l0 = this.f3548a;
        AbstractC0941g2 abstractC0941g2 = c0959l0.f3675c;
        if (abstractC0941g2 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    c0959l0.m1618q(motionEvent, c0959l0.f3687o, findPointerIndex);
                    this.f3548a.m1621n(abstractC0941g2);
                    C0959l0 c0959l02 = this.f3548a;
                    c0959l02.f3690r.removeCallbacks(c0959l02.f3691s);
                    this.f3548a.f3691s.run();
                    this.f3548a.f3690r.invalidate();
                    return;
                }
                return;
            } else if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                C0959l0 c0959l03 = this.f3548a;
                if (pointerId == c0959l03.f3684l) {
                    c0959l03.f3684l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    C0959l0 c0959l04 = this.f3548a;
                    c0959l04.m1618q(motionEvent, c0959l04.f3687o, actionIndex);
                    return;
                }
                return;
            } else {
                VelocityTracker velocityTracker2 = c0959l0.f3692t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
        }
        this.f3548a.m1619p(null, 0);
        this.f3548a.f3684l = -1;
    }

    @Override // p010b.p083u.p084e.InterfaceC0992t1
    /* renamed from: c */
    public void mo1454c(boolean z) {
        if (z) {
            this.f3548a.m1619p(null, 0);
        }
    }
}