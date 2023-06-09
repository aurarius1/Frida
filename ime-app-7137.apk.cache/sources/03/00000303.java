package p010b.p046j.p061m;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.j.m.b */
/* loaded from: classes.dex */
public class RunnableC0639b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View$OnTouchListenerC0641d f2819b;

    public RunnableC0639b(View$OnTouchListenerC0641d view$OnTouchListenerC0641d) {
        this.f2819b = view$OnTouchListenerC0641d;
    }

    @Override // java.lang.Runnable
    public void run() {
        View childAt;
        View$OnTouchListenerC0641d view$OnTouchListenerC0641d = this.f2819b;
        if (view$OnTouchListenerC0641d.f2836q) {
            if (view$OnTouchListenerC0641d.f2834o) {
                view$OnTouchListenerC0641d.f2834o = false;
                C0638a c0638a = view$OnTouchListenerC0641d.f2822c;
                c0638a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0638a.f2812e = currentAnimationTimeMillis;
                c0638a.f2816i = -1L;
                c0638a.f2813f = currentAnimationTimeMillis;
                c0638a.f2817j = 0.5f;
                c0638a.f2814g = 0;
                c0638a.f2815h = 0;
            }
            C0638a c0638a2 = this.f2819b.f2822c;
            if (!(c0638a2.f2816i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0638a2.f2816i + ((long) c0638a2.f2818k)) && this.f2819b.m2165f()) {
                View$OnTouchListenerC0641d view$OnTouchListenerC0641d2 = this.f2819b;
                if (view$OnTouchListenerC0641d2.f2835p) {
                    view$OnTouchListenerC0641d2.f2835p = false;
                    view$OnTouchListenerC0641d2.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view$OnTouchListenerC0641d2.f2824e.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0638a2.f2813f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float m2171a = c0638a2.m2171a(currentAnimationTimeMillis2);
                    c0638a2.f2813f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - c0638a2.f2813f)) * ((m2171a * 4.0f) + ((-4.0f) * m2171a * m2171a));
                    c0638a2.f2814g = (int) (c0638a2.f2810c * f);
                    int i = (int) (f * c0638a2.f2811d);
                    c0638a2.f2815h = i;
                    ListView listView = this.f2819b.f2838s;
                    if (Build.VERSION.SDK_INT >= 19) {
                        listView.scrollListBy(i);
                    } else {
                        int firstVisiblePosition = listView.getFirstVisiblePosition();
                        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
                            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
                        }
                    }
                    AbstractC0605j0.m2276G(this.f2819b.f2824e, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            this.f2819b.f2836q = false;
        }
    }
}