package p010b.p016c.p026q;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: b.c.q.u0 */
/* loaded from: classes.dex */
public class C0319u0 implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0334x0 f1774b;

    public C0319u0(C0334x0 c0334x0, C0212a1 c0212a1) {
        this.f1774b = c0334x0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1774b.f1809I.setSelection(i);
        if (this.f1774b.f1809I.getOnItemClickListener() != null) {
            C0334x0 c0334x0 = this.f1774b;
            c0334x0.f1809I.performItemClick(view, i, c0334x0.f1806F.getItemId(i));
        }
        this.f1774b.dismiss();
    }
}