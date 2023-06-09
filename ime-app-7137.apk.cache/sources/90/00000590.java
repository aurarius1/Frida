package p093c.p097b.p108i0.p110p.p112b2;

import android.view.View;

/* renamed from: c.b.i0.p.b2.l0 */
/* loaded from: classes.dex */
public class View$OnClickListenerC1292l0 extends AbstractC1290k0 implements View.OnClickListener {

    /* renamed from: x */
    public final /* synthetic */ C1298o0 f4500x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC1292l0(C1298o0 c1298o0, View view) {
        super(c1298o0, view);
        this.f4500x = c1298o0;
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m1136y = m1136y();
        if (m1136y == -1) {
            return;
        }
        this.f4500x.f4510d.remove(m1136y);
        C1298o0 c1298o0 = this.f4500x;
        c1298o0.f4510d.add(m1136y, c1298o0.mo1132j());
        this.f4500x.m1683d(m1136y);
    }
}