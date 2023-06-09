package p000a.p001a.p002a.p004b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: a.a.a.b.k */
/* loaded from: classes.dex */
public class ServiceConnectionC0013k implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C0014l f20a;

    public ServiceConnectionC0013k(C0014l c0014l) {
        this.f20a = c0014l;
    }

    /* renamed from: a */
    public boolean m3547a(String str) {
        int i;
        C0014l c0014l = this.f20a;
        if (c0014l.f28h != this || (i = c0014l.f27g) == 0 || i == 1) {
            int i2 = c0014l.f27g;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            String str2 = str + " for " + this.f20a.f22b + " with mServiceConnection=" + this.f20a.f28h + " this=" + this;
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m3546b(Runnable runnable) {
        if (Thread.currentThread() == this.f20a.f25e.getLooper().getThread()) {
            runnable.run();
        } else {
            this.f20a.f25e.post(runnable);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m3546b(new RunnableC0011i(this, componentName, iBinder));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        m3546b(new RunnableC0012j(this, componentName));
    }
}