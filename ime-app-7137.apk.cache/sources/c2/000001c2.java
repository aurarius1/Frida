package p010b.p016c.p026q;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0197n;

/* renamed from: b.c.q.u */
/* loaded from: classes.dex */
public class C0318u implements InterfaceC0197n {

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f1773b;

    public C0318u(ActionMenuView actionMenuView) {
        this.f1773b = actionMenuView;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: a */
    public boolean mo639a(C0199p c0199p, MenuItem menuItem) {
        InterfaceC0323v interfaceC0323v = this.f1773b.f231B;
        if (interfaceC0323v != null) {
            InterfaceC0332w3 interfaceC0332w3 = ((C0307r3) interfaceC0323v).f1756a.f360H;
            return interfaceC0332w3 != null ? interfaceC0332w3.onMenuItemClick(menuItem) : false;
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: b */
    public void mo638b(C0199p c0199p) {
        InterfaceC0197n interfaceC0197n = this.f1773b.f238w;
        if (interfaceC0197n != null) {
            interfaceC0197n.mo638b(c0199p);
        }
    }
}