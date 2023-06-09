package p010b.p046j.p047d;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import androidx.core.app.JobIntentService;

/* renamed from: b.j.d.r  reason: invalid class name */
/* loaded from: classes.dex */
public final class jobJobServiceEngineC0485r extends JobServiceEngine implements InterfaceC0480m {

    /* renamed from: a */
    public final JobIntentService f2486a;

    /* renamed from: b */
    public final Object f2487b;

    /* renamed from: c */
    public JobParameters f2488c;

    public jobJobServiceEngineC0485r(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.f2487b = new Object();
        this.f2486a = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(JobParameters jobParameters) {
        this.f2488c = jobParameters;
        this.f2486a.m3345a(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(JobParameters jobParameters) {
        AsyncTaskC0479l asyncTaskC0479l = this.f2486a.f457e;
        if (asyncTaskC0479l != null) {
            asyncTaskC0479l.cancel(false);
        }
        synchronized (this.f2487b) {
            this.f2488c = null;
        }
        return true;
    }
}