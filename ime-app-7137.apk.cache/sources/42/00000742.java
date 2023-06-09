package p093c.p097b.p130z.p132r0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.anysoftkeyboard.keyboards.views.CandidateView;

/* renamed from: c.b.z.r0.i0 */
/* loaded from: classes.dex */
public class C1726i0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final int f5318a;

    /* renamed from: b */
    public final /* synthetic */ CandidateView f5319b;

    public C1726i0(CandidateView candidateView, int i) {
        this.f5319b = candidateView;
        this.f5318a = i * i;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f5319b.f6551v = false;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f5319b.f6551v) {
            int x = (int) (motionEvent2.getX() - motionEvent.getX());
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            if ((y * y) + (x * x) < this.f5318a) {
                return true;
            }
            this.f5319b.f6551v = true;
        }
        int width = this.f5319b.getWidth();
        CandidateView candidateView = this.f5319b;
        candidateView.f6551v = true;
        int i = (int) f;
        int scrollX = candidateView.getScrollX() + i;
        if (scrollX < 0) {
            scrollX = 0;
        }
        if (f > 0.0f && width + scrollX > this.f5319b.f6555z) {
            scrollX -= i;
        }
        CandidateView candidateView2 = this.f5319b;
        candidateView2.f6554y = scrollX;
        candidateView2.scrollTo(scrollX, candidateView2.getScrollY());
        this.f5319b.invalidate();
        return true;
    }
}