package p010b.p083u.p084e;

import androidx.recyclerview.widget.RecyclerView;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.u.e.z1 */
/* loaded from: classes.dex */
public class C1013z1 {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3904a;

    public C1013z1(RecyclerView recyclerView) {
        this.f3904a = recyclerView;
    }

    /* renamed from: a */
    public void m1392a() {
        if (RecyclerView.f702e) {
            RecyclerView recyclerView = this.f3904a;
            if (recyclerView.f714D && recyclerView.f712C) {
                AbstractC0605j0.m2276G(recyclerView, recyclerView.f767r);
                return;
            }
        }
        RecyclerView recyclerView2 = this.f3904a;
        recyclerView2.f730L = true;
        recyclerView2.requestLayout();
    }
}