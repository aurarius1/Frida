package p010b.p016c.p026q;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: b.c.q.b3 */
/* loaded from: classes.dex */
public class C0220b3 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ SearchView f1484b;

    public C0220b3(SearchView searchView) {
        this.f1484b = searchView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f1484b.m3404w(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}