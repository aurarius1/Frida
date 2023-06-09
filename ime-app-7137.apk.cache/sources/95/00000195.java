package p010b.p016c.p026q;

import android.view.View;
import p010b.p016c.p024p.p025m.InterfaceC0187h0;

/* renamed from: b.c.q.l */
/* loaded from: classes.dex */
public class C0273l extends AbstractView$OnTouchListenerC0330w1 {

    /* renamed from: k */
    public final /* synthetic */ C0278m f1654k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0273l(C0278m c0278m, View view, C0298q c0298q) {
        super(view);
        this.f1654k = c0278m;
    }

    @Override // p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1
    /* renamed from: b */
    public InterfaceC0187h0 mo2731b() {
        C0283n c0283n = this.f1654k.f1658d.f1723v;
        if (c0283n == null) {
            return null;
        }
        return c0283n.m2951a();
    }

    @Override // p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1
    /* renamed from: c */
    public boolean mo2730c() {
        this.f1654k.f1658d.m2759q();
        return true;
    }

    @Override // p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1
    /* renamed from: d */
    public boolean mo2729d() {
        C0298q c0298q = this.f1654k.f1658d;
        if (c0298q.f1725x != null) {
            return false;
        }
        c0298q.m2763k();
        return true;
    }
}