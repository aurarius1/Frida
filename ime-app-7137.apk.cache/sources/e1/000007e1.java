package p093c.p145g.p146a.p147a.p156i0;

import android.view.View;
import android.widget.AdapterView;
import p010b.p016c.p026q.C0243f2;

/* renamed from: c.g.a.a.i0.d0 */
/* loaded from: classes.dex */
public class C1885d0 implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1887e0 f5788b;

    public C1885d0(C1887e0 c1887e0) {
        this.f5788b = c1887e0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        C1887e0 c1887e0 = this.f5788b;
        if (i < 0) {
            C0243f2 c0243f2 = c1887e0.f5790e;
            item = !c0243f2.mo2835b() ? null : c0243f2.f1561g.getSelectedItem();
        } else {
            item = c1887e0.getAdapter().getItem(i);
        }
        C1887e0.m693a(this.f5788b, item);
        AdapterView.OnItemClickListener onItemClickListener = this.f5788b.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                C0243f2 c0243f22 = this.f5788b.f5790e;
                view = !c0243f22.mo2835b() ? null : c0243f22.f1561g.getSelectedView();
                C0243f2 c0243f23 = this.f5788b.f5790e;
                i = !c0243f23.mo2835b() ? -1 : c0243f23.f1561g.getSelectedItemPosition();
                C0243f2 c0243f24 = this.f5788b.f5790e;
                j = !c0243f24.mo2835b() ? Long.MIN_VALUE : c0243f24.f1561g.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f5788b.f5790e.f1561g, view, i, j);
        }
        this.f5788b.f5790e.dismiss();
    }
}