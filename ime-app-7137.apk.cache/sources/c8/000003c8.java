package p010b.p077q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: b.q.v */
/* loaded from: classes.dex */
public class RunnableC0836v implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3375b;

    /* renamed from: c */
    public final /* synthetic */ String f3376c;

    /* renamed from: d */
    public final /* synthetic */ int f3377d;

    /* renamed from: e */
    public final /* synthetic */ int f3378e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f3379f;

    /* renamed from: g */
    public final /* synthetic */ C0840z f3380g;

    public RunnableC0836v(C0840z c0840z, C0804a0 c0804a0, String str, int i, int i2, Bundle bundle) {
        this.f3380g = c0840z;
        this.f3375b = c0804a0;
        this.f3376c = str;
        this.f3377d = i;
        this.f3378e = i2;
        this.f3379f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder m1797a = this.f3375b.m1797a();
        this.f3380g.f3393a.f569d.remove(m1797a);
        C0813f c0813f = new C0813f(this.f3380g.f3393a, this.f3376c, this.f3377d, this.f3378e, this.f3379f, this.f3375b);
        this.f3380g.f3393a.f569d.put(m1797a, c0813f);
        try {
            m1797a.linkToDeath(c0813f, 0);
        } catch (RemoteException unused) {
        }
    }
}