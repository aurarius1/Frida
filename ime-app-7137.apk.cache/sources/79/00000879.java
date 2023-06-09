package p093c.p145g.p146a.p147a.p171w;

import android.view.View;
import java.util.Iterator;

/* renamed from: c.g.a.a.w.t */
/* loaded from: classes.dex */
public class View$OnClickListenerC2037t implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C2040w f6190b;

    public View$OnClickListenerC2037t(C2040w c2040w) {
        this.f6190b = c2040w;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Iterator it = this.f6190b.f6199o0.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        this.f6190b.m1939Q0(false, false);
    }
}