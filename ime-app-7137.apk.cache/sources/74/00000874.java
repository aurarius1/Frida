package p093c.p145g.p146a.p147a.p171w;

import android.view.View;

/* renamed from: c.g.a.a.w.o */
/* loaded from: classes.dex */
public class View$OnClickListenerC2032o implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C2014e0 f6174b;

    /* renamed from: c */
    public final /* synthetic */ C2034q f6175c;

    public View$OnClickListenerC2032o(C2034q c2034q, C2014e0 c2014e0) {
        this.f6175c = c2034q;
        this.f6174b = c2014e0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m3216k1 = this.f6175c.m538R0().m3216k1() + 1;
        if (m3216k1 < this.f6175c.f6186f0.getAdapter().mo543a()) {
            this.f6175c.m536T0(this.f6174b.m557h(m3216k1));
        }
    }
}