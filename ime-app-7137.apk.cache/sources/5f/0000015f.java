package p010b.p016c.p026q;

import android.database.DataSetObserver;

/* renamed from: b.c.q.b2 */
/* loaded from: classes.dex */
public class C0219b2 extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ C0243f2 f1483a;

    public C0219b2(C0243f2 c0243f2) {
        this.f1483a = c0243f2;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        if (this.f1483a.mo2835b()) {
            this.f1483a.mo2833f();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f1483a.dismiss();
    }
}