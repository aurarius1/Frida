package p010b.p046j.p047d;

import android.app.Activity;

/* renamed from: b.j.d.b */
/* loaded from: classes.dex */
public class RunnableC0466b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Activity f2443b;

    public RunnableC0466b(Activity activity) {
        this.f2443b = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2443b.isFinishing() || AbstractC0477j.m2426b(this.f2443b)) {
            return;
        }
        this.f2443b.recreate();
    }
}