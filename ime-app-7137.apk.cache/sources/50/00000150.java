package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: b.c.p.m.u */
/* loaded from: classes.dex */
public class ActionProvider$VisibilityListenerC0204u extends C0203t implements ActionProvider.VisibilityListener {

    /* renamed from: d */
    public C0201r f1433d;

    public ActionProvider$VisibilityListenerC0204u(MenuItemC0208y menuItemC0208y, Context context, ActionProvider actionProvider) {
        super(menuItemC0208y, context, actionProvider);
    }

    @Override // p010b.p016c.p024p.p025m.C0203t
    /* renamed from: a */
    public boolean mo2900a() {
        return this.f1431b.isVisible();
    }

    @Override // p010b.p016c.p024p.p025m.C0203t
    /* renamed from: b */
    public View mo2899b(MenuItem menuItem) {
        return this.f1431b.onCreateActionView(menuItem);
    }

    @Override // p010b.p016c.p024p.p025m.C0203t
    /* renamed from: c */
    public boolean mo2898c() {
        return this.f1431b.overridesItemVisibility();
    }

    @Override // p010b.p016c.p024p.p025m.C0203t
    /* renamed from: d */
    public void mo2897d(C0201r c0201r) {
        this.f1433d = c0201r;
        this.f1431b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z) {
        C0201r c0201r = this.f1433d;
        if (c0201r != null) {
            C0199p c0199p = c0201r.f1399a.f1417n;
            c0199p.f1379i = true;
            c0199p.m2922q(true);
        }
    }
}