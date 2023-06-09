package p010b.p077q;

import android.os.IBinder;

/* renamed from: b.q.w */
/* loaded from: classes.dex */
public class RunnableC0837w implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3381b;

    /* renamed from: c */
    public final /* synthetic */ C0840z f3382c;

    public RunnableC0837w(C0840z c0840z, C0804a0 c0804a0) {
        this.f3382c = c0840z;
        this.f3381b = c0804a0;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder m1797a = this.f3381b.m1797a();
        C0813f c0813f = (C0813f) this.f3382c.f3393a.f569d.remove(m1797a);
        if (c0813f != null) {
            m1797a.unlinkToDeath(c0813f, 0);
        }
    }
}