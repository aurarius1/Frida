package p010b.p016c.p026q;

import android.content.Context;
import android.view.View;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.p024p.p025m.C0175b0;
import p010b.p016c.p024p.p025m.C0199p;

/* renamed from: b.c.q.n */
/* loaded from: classes.dex */
public class C0283n extends C0175b0 {

    /* renamed from: m */
    public final /* synthetic */ C0298q f1667m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283n(C0298q c0298q, Context context, C0199p c0199p, View view, boolean z) {
        super(context, c0199p, view, z, AbstractC0075a.actionOverflowMenuStyle, 0);
        this.f1667m = c0298q;
        this.f1285g = 8388613;
        m2949d(c0298q.f1727z);
    }

    @Override // p010b.p016c.p024p.p025m.C0175b0
    /* renamed from: c */
    public void mo2789c() {
        C0199p c0199p = this.f1667m.f1705d;
        if (c0199p != null) {
            c0199p.m2936c(true);
        }
        this.f1667m.f1723v = null;
        super.mo2789c();
    }
}