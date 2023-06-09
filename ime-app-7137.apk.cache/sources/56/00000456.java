package p010b.p083u.p084e;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.q */
/* loaded from: classes.dex */
public class C0978q extends AbstractC0996u1 {

    /* renamed from: a */
    public final /* synthetic */ C0990t f3771a;

    public C0978q(C0990t c0990t) {
        this.f3771a = c0990t;
    }

    @Override // p010b.p083u.p084e.AbstractC0996u1
    /* renamed from: b */
    public void mo544b(RecyclerView recyclerView, int i, int i2) {
        C0990t c0990t = this.f3771a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = c0990t.f3849u.computeVerticalScrollRange();
        int i3 = c0990t.f3848t;
        c0990t.f3850v = computeVerticalScrollRange - i3 > 0 && i3 >= c0990t.f3831c;
        int computeHorizontalScrollRange = c0990t.f3849u.computeHorizontalScrollRange();
        int i4 = c0990t.f3847s;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= c0990t.f3831c;
        c0990t.f3851w = z;
        boolean z2 = c0990t.f3850v;
        if (!z2 && !z) {
            if (c0990t.f3852x != 0) {
                c0990t.m1458k(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            c0990t.f3842n = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            c0990t.f3841m = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0990t.f3851w) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i4;
            c0990t.f3845q = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            c0990t.f3844p = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = c0990t.f3852x;
        if (i5 == 0 || i5 == 1) {
            c0990t.m1458k(1);
        }
    }
}