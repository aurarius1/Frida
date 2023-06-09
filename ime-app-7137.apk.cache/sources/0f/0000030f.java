package p010b.p062k.p063a;

import android.database.DataSetObserver;

/* renamed from: b.k.a.b */
/* loaded from: classes.dex */
public class C0651b extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0652c f2846a;

    public C0651b(AbstractC0652c abstractC0652c) {
        this.f2846a = abstractC0652c;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        AbstractC0652c abstractC0652c = this.f2846a;
        abstractC0652c.f2847b = true;
        abstractC0652c.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        AbstractC0652c abstractC0652c = this.f2846a;
        abstractC0652c.f2847b = false;
        abstractC0652c.notifyDataSetInvalidated();
    }
}