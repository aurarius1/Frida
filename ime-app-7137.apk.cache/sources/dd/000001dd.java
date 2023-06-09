package p010b.p016c.p026q;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: b.c.q.z1 */
/* loaded from: classes.dex */
public class C0345z1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ C0243f2 f1834b;

    public C0345z1(C0243f2 c0243f2) {
        this.f1834b = c0243f2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0305r1 c0305r1;
        if (i == -1 || (c0305r1 = this.f1834b.f1561g) == null) {
            return;
        }
        c0305r1.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}