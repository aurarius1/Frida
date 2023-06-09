package p093c.p145g.p146a.p147a.p171w;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p010b.p083u.p084e.C0929d2;

/* renamed from: c.g.a.a.w.i */
/* loaded from: classes.dex */
public class C2021i extends LinearLayoutManager {

    /* renamed from: G */
    public final /* synthetic */ int f6158G;

    /* renamed from: H */
    public final /* synthetic */ C2034q f6159H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2021i(C2034q c2034q, Context context, int i, boolean z, int i2) {
        super(i, z);
        this.f6159H = c2034q;
        this.f6158G = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p010b.p083u.p084e.AbstractC0980q1
    /* renamed from: X0 */
    public void mo554X0(RecyclerView recyclerView, C0929d2 c0929d2, int i) {
        C2020h0 c2020h0 = new C2020h0(this, recyclerView.getContext());
        c2020h0.f3797a = i;
        m1544Y0(c2020h0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a1 */
    public void mo553a1(C0929d2 c0929d2, int[] iArr) {
        if (this.f6158G == 0) {
            iArr[0] = this.f6159H.f6186f0.getWidth();
            iArr[1] = this.f6159H.f6186f0.getWidth();
            return;
        }
        iArr[0] = this.f6159H.f6186f0.getHeight();
        iArr[1] = this.f6159H.f6186f0.getHeight();
    }
}