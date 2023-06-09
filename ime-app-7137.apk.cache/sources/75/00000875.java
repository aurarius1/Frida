package p093c.p145g.p146a.p147a.p171w;

import android.view.View;

/* renamed from: c.g.a.a.w.p */
/* loaded from: classes.dex */
public class View$OnClickListenerC2033p implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C2014e0 f6176b;

    /* renamed from: c */
    public final /* synthetic */ C2034q f6177c;

    public View$OnClickListenerC2033p(C2034q c2034q, C2014e0 c2014e0) {
        this.f6177c = c2034q;
        this.f6176b = c2014e0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m3215l1 = this.f6177c.m538R0().m3215l1() - 1;
        if (m3215l1 >= 0) {
            this.f6177c.m536T0(this.f6176b.m557h(m3215l1));
        }
    }
}