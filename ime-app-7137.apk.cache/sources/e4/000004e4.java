package p010b.p091z.p092a;

import android.database.DataSetObserver;

/* renamed from: b.z.a.k */
/* loaded from: classes.dex */
public class C1120k extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1123n f4175a;

    public C1120k(AbstractC1123n abstractC1123n) {
        this.f4175a = abstractC1123n;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f4175a.m1214e();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f4175a.m1214e();
    }
}