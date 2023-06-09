package p010b.p016c.p026q;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: b.c.q.a3 */
/* loaded from: classes.dex */
public class C0214a3 implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ SearchView f1457b;

    public C0214a3(SearchView searchView) {
        this.f1457b = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1457b.m3405v(i);
    }
}