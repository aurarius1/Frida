package p010b.p083u.p084e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.u.e.i0 */
/* loaded from: classes.dex */
public class C0947i0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public boolean f3634a = true;

    /* renamed from: b */
    public final /* synthetic */ C0959l0 f3635b;

    public C0947i0(C0959l0 c0959l0) {
        this.f3635b = c0959l0;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        View m1624k;
        AbstractC0941g2 m3190J;
        if (!this.f3634a || (m1624k = this.f3635b.m1624k(motionEvent)) == null || (m3190J = this.f3635b.f3690r.m3190J(m1624k)) == null) {
            return;
        }
        C0959l0 c0959l0 = this.f3635b;
        AbstractC0955k0 abstractC0955k0 = c0959l0.f3685m;
        RecyclerView recyclerView = c0959l0.f3690r;
        if ((abstractC0955k0.m1639b(abstractC0955k0.m1635f(recyclerView, m3190J), AbstractC0605j0.m2241q(recyclerView)) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = this.f3635b.f3684l;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                C0959l0 c0959l02 = this.f3635b;
                c0959l02.f3676d = x;
                c0959l02.f3677e = y;
                c0959l02.f3681i = 0.0f;
                c0959l02.f3680h = 0.0f;
                c0959l02.f3685m.getClass();
                this.f3635b.m1619p(m3190J, 2);
            }
        }
    }
}