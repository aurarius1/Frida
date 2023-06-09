package p010b.p016c.p024p.p025m;

import androidx.appcompat.view.menu.ActionMenuItemView;
import p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1;
import p010b.p016c.p026q.C0258i;
import p010b.p016c.p026q.C0263j;

/* renamed from: b.c.p.m.b */
/* loaded from: classes.dex */
public class C0174b extends AbstractView$OnTouchListenerC0330w1 {

    /* renamed from: k */
    public final /* synthetic */ ActionMenuItemView f1278k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1278k = actionMenuItemView;
    }

    @Override // p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1
    /* renamed from: b */
    public InterfaceC0187h0 mo2731b() {
        C0258i c0258i;
        AbstractC0176c abstractC0176c = this.f1278k.f142l;
        if (abstractC0176c == null || (c0258i = ((C0263j) abstractC0176c).f1608a.f1724w) == null) {
            return null;
        }
        return c0258i.m2951a();
    }

    @Override // p010b.p016c.p026q.AbstractView$OnTouchListenerC0330w1
    /* renamed from: c */
    public boolean mo2730c() {
        InterfaceC0187h0 mo2731b;
        ActionMenuItemView actionMenuItemView = this.f1278k;
        InterfaceC0198o interfaceC0198o = actionMenuItemView.f140j;
        return interfaceC0198o != null && interfaceC0198o.mo2939a(actionMenuItemView.f137g) && (mo2731b = mo2731b()) != null && mo2731b.mo2835b();
    }
}