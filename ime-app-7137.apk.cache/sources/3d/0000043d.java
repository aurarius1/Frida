package p010b.p083u.p084e;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.j2 */
/* loaded from: classes.dex */
public class C0953j2 extends AbstractC0996u1 {

    /* renamed from: a */
    public boolean f3647a = false;

    /* renamed from: b */
    public final /* synthetic */ C1006x0 f3648b;

    public C0953j2(C1006x0 c1006x0) {
        this.f3648b = c1006x0;
    }

    @Override // p010b.p083u.p084e.AbstractC0996u1
    /* renamed from: a */
    public void mo545a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f3647a) {
            this.f3647a = false;
            this.f3648b.m1408i();
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0996u1
    /* renamed from: b */
    public void mo544b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f3647a = true;
    }
}