package p010b.p046j.p047d;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: b.j.d.q */
/* loaded from: classes.dex */
public final class C0484q implements InterfaceC0483p {

    /* renamed from: a */
    public final JobWorkItem f2484a;

    /* renamed from: b */
    public final /* synthetic */ jobJobServiceEngineC0485r f2485b;

    public C0484q(jobJobServiceEngineC0485r jobjobserviceenginec0485r, JobWorkItem jobWorkItem) {
        this.f2485b = jobjobserviceenginec0485r;
        this.f2484a = jobWorkItem;
    }

    @Override // p010b.p046j.p047d.InterfaceC0483p
    /* renamed from: a */
    public void mo2423a() {
        synchronized (this.f2485b.f2487b) {
            JobParameters jobParameters = this.f2485b.f2488c;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f2484a);
            }
        }
    }

    @Override // p010b.p046j.p047d.InterfaceC0483p
    public Intent getIntent() {
        return this.f2484a.getIntent();
    }
}