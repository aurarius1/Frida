package p093c.p145g.p146a.p147a.p171w;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* renamed from: c.g.a.a.w.c0 */
/* loaded from: classes.dex */
public class C2010c0 implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ MaterialCalendarGridView f6134b;

    /* renamed from: c */
    public final /* synthetic */ C2014e0 f6135c;

    public C2010c0(C2014e0 c2014e0, MaterialCalendarGridView materialCalendarGridView) {
        this.f6135c = c2014e0;
        this.f6134b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2008b0 adapter2 = this.f6134b.getAdapter2();
        if (i >= adapter2.m565b() && i <= adapter2.m563d()) {
            C2023j c2023j = this.f6135c.f6149g;
            long longValue = this.f6134b.getAdapter2().getItem(i).longValue();
            C2034q c2034q = c2023j.f6160a;
            if (longValue >= ((DateValidatorPointForward) c2034q.f6181a0.f6798d).f6802b) {
                c2034q.f6180Z.m288g(longValue);
                Iterator it = c2023j.f6160a.f6157W.iterator();
                while (it.hasNext()) {
                    ((AbstractC2016f0) it.next()).mo524a(c2023j.f6160a.f6180Z.m293a());
                }
                c2023j.f6160a.f6186f0.getAdapter().f3589a.m1680b();
                RecyclerView recyclerView = c2023j.f6160a.f6185e0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f3589a.m1680b();
                }
            }
        }
    }
}