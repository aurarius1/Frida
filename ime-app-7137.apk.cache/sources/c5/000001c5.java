package p010b.p016c.p026q;

import androidx.appcompat.widget.SearchView;
import p010b.p062k.p063a.AbstractC0652c;

/* renamed from: b.c.q.u2 */
/* loaded from: classes.dex */
public class RunnableC0321u2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SearchView f1776b;

    public RunnableC0321u2(SearchView searchView) {
        this.f1776b = searchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0652c abstractC0652c = this.f1776b.f276T;
        if (abstractC0652c instanceof View$OnClickListenerC0272k3) {
            abstractC0652c.mo2159b(null);
        }
    }
}