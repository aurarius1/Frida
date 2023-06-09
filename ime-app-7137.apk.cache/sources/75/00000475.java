package p010b.p083u.p084e;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.y0 */
/* loaded from: classes.dex */
public class RunnableC1009y0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RecyclerView f3900b;

    public RunnableC1009y0(RecyclerView recyclerView) {
        this.f3900b = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f3900b;
        if (!recyclerView.f718F || recyclerView.isLayoutRequested()) {
            return;
        }
        RecyclerView recyclerView2 = this.f3900b;
        if (!recyclerView2.f712C) {
            recyclerView2.requestLayout();
        } else if (recyclerView2.f724I) {
            recyclerView2.f722H = true;
        } else {
            recyclerView2.m3148n();
        }
    }
}