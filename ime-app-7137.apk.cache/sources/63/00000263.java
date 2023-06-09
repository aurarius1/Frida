package p010b.p046j.p047d;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* renamed from: b.j.d.l */
/* loaded from: classes.dex */
public final class AsyncTaskC0479l extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ JobIntentService f2477a;

    public AsyncTaskC0479l(JobIntentService jobIntentService) {
        this.f2477a = jobIntentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[LOOP:0: B:3:0x0002->B:28:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doInBackground(Object[] objArr) {
        InterfaceC0483p interfaceC0483p;
        Void[] voidArr = (Void[]) objArr;
        while (true) {
            JobIntentService jobIntentService = this.f2477a;
            InterfaceC0480m interfaceC0480m = jobIntentService.f455c;
            if (interfaceC0480m != null) {
                jobJobServiceEngineC0485r jobjobserviceenginec0485r = (jobJobServiceEngineC0485r) interfaceC0480m;
                synchronized (jobjobserviceenginec0485r.f2487b) {
                    JobParameters jobParameters = jobjobserviceenginec0485r.f2488c;
                    if (jobParameters != null) {
                        JobWorkItem dequeueWork = jobParameters.dequeueWork();
                        if (dequeueWork != null) {
                            dequeueWork.getIntent().setExtrasClassLoader(jobjobserviceenginec0485r.f2486a.getClassLoader());
                            interfaceC0483p = new C0484q(jobjobserviceenginec0485r, dequeueWork);
                            if (interfaceC0483p == null) {
                                return null;
                            }
                            this.f2477a.m3344b(interfaceC0483p.getIntent());
                            interfaceC0483p.mo2423a();
                        }
                    }
                }
                if (interfaceC0483p == null) {
                }
            } else {
                synchronized (jobIntentService.f459g) {
                    interfaceC0483p = jobIntentService.f459g.size() > 0 ? (InterfaceC0483p) jobIntentService.f459g.remove(0) : null;
                }
                if (interfaceC0483p == null) {
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled(Object obj) {
        Void r1 = (Void) obj;
        this.f2477a.m3343c();
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        Void r1 = (Void) obj;
        this.f2477a.m3343c();
    }
}