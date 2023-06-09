package p010b.p083u.p084e;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: b.u.e.w0 */
/* loaded from: classes.dex */
public class C1003w0 extends C0983r0 {

    /* renamed from: q */
    public final /* synthetic */ C1006x0 f3879q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003w0(C1006x0 c1006x0, Context context) {
        super(context);
        this.f3879q = c1006x0;
    }

    @Override // p010b.p083u.p084e.C0983r0
    /* renamed from: b */
    public float mo555b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // p010b.p083u.p084e.C0983r0
    /* renamed from: c */
    public int mo1423c(int i) {
        return Math.min(100, super.mo1423c(i));
    }

    @Override // p010b.p083u.p084e.C0983r0
    /* renamed from: e */
    public void mo1422e(View view, C0929d2 c0929d2, C0921b2 c0921b2) {
        C1006x0 c1006x0 = this.f3879q;
        int[] m1416a = c1006x0.m1416a(c1006x0.f3888a.getLayoutManager(), view);
        int i = m1416a[0];
        int i2 = m1416a[1];
        double mo1423c = mo1423c(Math.max(Math.abs(i), Math.abs(i2)));
        Double.isNaN(mo1423c);
        Double.isNaN(mo1423c);
        Double.isNaN(mo1423c);
        int ceil = (int) Math.ceil(mo1423c / 0.3356d);
        if (ceil > 0) {
            c0921b2.m1715b(i, i2, ceil, this.f3806j);
        }
    }
}