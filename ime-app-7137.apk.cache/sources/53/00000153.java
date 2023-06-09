package p010b.p016c.p024p.p025m;

import android.view.MenuItem;

/* renamed from: b.c.p.m.x */
/* loaded from: classes.dex */
public class MenuItem$OnMenuItemClickListenerC0207x implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b */
    public final MenuItem.OnMenuItemClickListener f1437b;

    /* renamed from: c */
    public final /* synthetic */ MenuItemC0208y f1438c;

    public MenuItem$OnMenuItemClickListenerC0207x(MenuItemC0208y menuItemC0208y, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1438c = menuItemC0208y;
        this.f1437b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.f1437b.onMenuItemClick(this.f1438c.m2946c(menuItem));
    }
}