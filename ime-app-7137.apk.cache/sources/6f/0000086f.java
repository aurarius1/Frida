package p093c.p145g.p146a.p147a.p171w;

import android.view.View;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0580e;
import p093c.p145g.p146a.p147a.AbstractC1924j;

/* renamed from: c.g.a.a.w.l */
/* loaded from: classes.dex */
public class C2027l extends C0568b {

    /* renamed from: d */
    public final /* synthetic */ C2034q f6167d;

    public C2027l(C2034q c2034q) {
        this.f6167d = c2034q;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        C2034q c2034q;
        int i;
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        if (this.f6167d.f6188h0.getVisibility() == 0) {
            c2034q = this.f6167d;
            i = AbstractC1924j.mtrl_picker_toggle_to_year_selection;
        } else {
            c2034q = this.f6167d;
            i = AbstractC1924j.mtrl_picker_toggle_to_day_selection;
        }
        c0580e.m2303k(c2034q.m1908D(i));
    }
}