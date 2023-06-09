package p010b.p046j.p058l;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: b.j.l.i */
/* loaded from: classes.dex */
public class C0602i implements InterfaceC0596f {

    /* renamed from: a */
    public final GestureDetector f2742a;

    public C0602i(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f2742a = new GestureDetector(context, onGestureListener, handler);
    }

    @Override // p010b.p046j.p058l.InterfaceC0596f
    /* renamed from: a */
    public boolean mo2285a(MotionEvent motionEvent) {
        return this.f2742a.onTouchEvent(motionEvent);
    }
}