package p093c.p145g.p146a.p147a.p171w;

import android.view.View;
import java.util.Iterator;

/* renamed from: c.g.a.a.w.s */
/* loaded from: classes.dex */
public class View$OnClickListenerC2036s implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C2040w f6189b;

    public View$OnClickListenerC2036s(C2040w c2040w) {
        this.f6189b = c2040w;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Iterator it = this.f6189b.f6198n0.iterator();
        while (it.hasNext()) {
            ((InterfaceC2041x) it.next()).m525a(this.f6189b.f6203s0.m293a());
        }
        this.f6189b.m1939Q0(false, false);
    }
}