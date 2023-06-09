package p010b.p046j.p047d;

import android.app.Application;

/* renamed from: b.j.d.g */
/* loaded from: classes.dex */
public class RunnableC0474g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Application f2460b;

    /* renamed from: c */
    public final /* synthetic */ C0476i f2461c;

    public RunnableC0474g(Application application, C0476i c0476i) {
        this.f2460b = application;
        this.f2461c = c0476i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2460b.unregisterActivityLifecycleCallbacks(this.f2461c);
    }
}