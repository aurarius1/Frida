package p010b.p046j.p047d;

import android.content.Intent;
import androidx.core.app.JobIntentService;

/* renamed from: b.j.d.o */
/* loaded from: classes.dex */
public final class C0482o implements InterfaceC0483p {

    /* renamed from: a */
    public final Intent f2481a;

    /* renamed from: b */
    public final int f2482b;

    /* renamed from: c */
    public final /* synthetic */ JobIntentService f2483c;

    public C0482o(JobIntentService jobIntentService, Intent intent, int i) {
        this.f2483c = jobIntentService;
        this.f2481a = intent;
        this.f2482b = i;
    }

    @Override // p010b.p046j.p047d.InterfaceC0483p
    /* renamed from: a */
    public void mo2423a() {
        this.f2483c.stopSelf(this.f2482b);
    }

    @Override // p010b.p046j.p047d.InterfaceC0483p
    public Intent getIntent() {
        return this.f2481a;
    }
}