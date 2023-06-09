package p010b.p046j.p047d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: b.j.d.i */
/* loaded from: classes.dex */
public final class C0476i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Object f2464a;

    /* renamed from: b */
    public Activity f2465b;

    /* renamed from: c */
    public final int f2466c;

    /* renamed from: d */
    public boolean f2467d = false;

    /* renamed from: e */
    public boolean f2468e = false;

    /* renamed from: f */
    public boolean f2469f = false;

    public C0476i(Activity activity) {
        this.f2465b = activity;
        this.f2466c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f2465b == activity) {
            this.f2465b = null;
            this.f2468e = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r5.f2469f = true;
        r5.f2464a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        return;
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityPaused(Activity activity) {
        if (!this.f2468e || this.f2469f || this.f2467d) {
            return;
        }
        Object obj = this.f2464a;
        int i = this.f2466c;
        boolean z = false;
        try {
            Object obj2 = AbstractC0477j.f2472c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                AbstractC0477j.f2476g.postAtFrontOfQueue(new RunnableC0475h(AbstractC0477j.f2471b.get(activity), obj2));
                z = true;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.f2465b == activity) {
            this.f2467d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}