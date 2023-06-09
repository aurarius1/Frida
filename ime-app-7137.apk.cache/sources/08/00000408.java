package p010b.p082t;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.t.v */
/* loaded from: classes.dex */
public class RunnableC0900v implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0904x f3508b;

    public RunnableC0900v(AbstractC0904x abstractC0904x) {
        this.f3508b = abstractC0904x;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f3508b.f3516Y;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}