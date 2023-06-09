package p093c.p145g.p146a.p147a.p171w;

import androidx.recyclerview.widget.RecyclerView;
import p010b.p083u.p084e.AbstractC0980q1;

/* renamed from: c.g.a.a.w.g */
/* loaded from: classes.dex */
public class RunnableC2017g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6155b;

    /* renamed from: c */
    public final /* synthetic */ C2034q f6156c;

    public RunnableC2017g(C2034q c2034q, int i) {
        this.f6156c = c2034q;
        this.f6155b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0980q1 abstractC0980q1;
        RecyclerView recyclerView = this.f6156c.f6186f0;
        int i = this.f6155b;
        if (recyclerView.f724I || (abstractC0980q1 = recyclerView.f777w) == null) {
            return;
        }
        abstractC0980q1.mo554X0(recyclerView, recyclerView.f770s0, i);
    }
}