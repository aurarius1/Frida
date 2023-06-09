package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.view.MenuItem;
import p010b.p036g.C0390n;
import p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b;

/* renamed from: b.c.p.m.d */
/* loaded from: classes.dex */
public abstract class AbstractC0178d {

    /* renamed from: a */
    public final Context f1291a;

    /* renamed from: b */
    public C0390n f1292b;

    public AbstractC0178d(Context context) {
        this.f1291a = context;
    }

    /* renamed from: c */
    public final MenuItem m2946c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC0527b) {
            InterfaceMenuItemC0527b interfaceMenuItemC0527b = (InterfaceMenuItemC0527b) menuItem;
            if (this.f1292b == null) {
                this.f1292b = new C0390n();
            }
            MenuItem menuItem2 = (MenuItem) this.f1292b.getOrDefault(menuItem, null);
            if (menuItem2 == null) {
                MenuItemC0208y menuItemC0208y = new MenuItemC0208y(this.f1291a, interfaceMenuItemC0527b);
                this.f1292b.put(interfaceMenuItemC0527b, menuItemC0208y);
                return menuItemC0208y;
            }
            return menuItem2;
        }
        return menuItem;
    }
}