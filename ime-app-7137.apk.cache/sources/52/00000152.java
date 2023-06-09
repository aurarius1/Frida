package p010b.p016c.p024p.p025m;

import android.view.MenuItem;

/* renamed from: b.c.p.m.w */
/* loaded from: classes.dex */
public class MenuItem$OnActionExpandListenerC0206w implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    public final MenuItem.OnActionExpandListener f1435a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC0208y f1436b;

    public MenuItem$OnActionExpandListenerC0206w(MenuItemC0208y menuItemC0208y, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1436b = menuItemC0208y;
        this.f1435a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f1435a.onMenuItemActionCollapse(this.f1436b.m2946c(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f1435a.onMenuItemActionExpand(this.f1436b.m2946c(menuItem));
    }
}