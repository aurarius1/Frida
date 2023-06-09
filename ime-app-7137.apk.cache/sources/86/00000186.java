package p010b.p016c.p026q;

import android.content.Context;
import android.view.View;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.p024p.p025m.C0175b0;
import p010b.p016c.p024p.p025m.SubMenuC0195l0;

/* renamed from: b.c.q.i */
/* loaded from: classes.dex */
public class C0258i extends C0175b0 {

    /* renamed from: m */
    public final /* synthetic */ C0298q f1596m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0258i(C0298q c0298q, Context context, SubMenuC0195l0 subMenuC0195l0, View view) {
        super(context, subMenuC0195l0, view, false, AbstractC0075a.actionOverflowMenuStyle, 0);
        this.f1596m = c0298q;
        if (!subMenuC0195l0.f1363A.m2908g()) {
            View view2 = c0298q.f1712k;
            this.f1284f = view2 == null ? (View) c0298q.f1710i : view2;
        }
        m2949d(c0298q.f1727z);
    }

    @Override // p010b.p016c.p024p.p025m.C0175b0
    /* renamed from: c */
    public void mo2789c() {
        C0298q c0298q = this.f1596m;
        c0298q.f1724w = null;
        c0298q.f1702A = 0;
        super.mo2789c();
    }
}