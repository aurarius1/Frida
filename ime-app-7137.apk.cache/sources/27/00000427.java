package p010b.p083u.p084e;

import androidx.recyclerview.widget.RecyclerView;
import p093c.p097b.p108i0.p110p.C1379w0;

/* renamed from: b.u.e.e0 */
/* loaded from: classes.dex */
public class RunnableC0931e0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0927d0 f3586b;

    /* renamed from: c */
    public final /* synthetic */ int f3587c;

    /* renamed from: d */
    public final /* synthetic */ C0959l0 f3588d;

    public RunnableC0931e0(C0959l0 c0959l0, C0927d0 c0927d0, int i) {
        this.f3588d = c0959l0;
        this.f3586b = c0927d0;
        this.f3587c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f3588d.f3690r;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        C0927d0 c0927d0 = this.f3586b;
        if (c0927d0.f3563k || c0927d0.f3557e.m1668e() == -1) {
            return;
        }
        AbstractC0956k1 itemAnimator = this.f3588d.f3690r.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.mo1608g()) {
            C0959l0 c0959l0 = this.f3588d;
            int size = c0959l0.f3688p.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (!((C0927d0) c0959l0.f3688p.get(i)).f3564l) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                AbstractC0955k0 abstractC0955k0 = this.f3588d.f3685m;
                AbstractC0941g2 abstractC0941g2 = this.f3586b.f3557e;
                ((C1379w0) abstractC0955k0).getClass();
                return;
            }
        }
        this.f3588d.f3690r.post(this);
    }
}