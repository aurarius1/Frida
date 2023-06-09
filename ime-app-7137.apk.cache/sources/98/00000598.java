package p093c.p097b.p108i0.p110p.p112b2;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: c.b.i0.p.b2.p0 */
/* loaded from: classes.dex */
public class C1300p0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ C1314w0 f4514b;

    public C1300p0(C1314w0 c1314w0) {
        this.f4514b = c1314w0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f4514b.f4531a0 = ((C1282g0) adapterView.getItemAtPosition(i)).f4491a;
        this.f4514b.m1125S0();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
        this.f4514b.f4531a0 = null;
    }
}