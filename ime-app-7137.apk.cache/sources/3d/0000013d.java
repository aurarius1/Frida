package p010b.p016c.p024p.p025m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p010b.p036g.C0390n;
import p010b.p046j.p052g.p053a.InterfaceMenuC0526a;
import p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b;

/* renamed from: b.c.p.m.g0 */
/* loaded from: classes.dex */
public class MenuC0185g0 extends AbstractC0178d implements Menu {

    /* renamed from: c */
    public final InterfaceMenuC0526a f1299c;

    public MenuC0185g0(Context context, InterfaceMenuC0526a interfaceMenuC0526a) {
        super(context);
        if (interfaceMenuC0526a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1299c = interfaceMenuC0526a;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m2946c(((C0199p) this.f1299c).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2946c(((C0199p) this.f1299c).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2946c(((C0199p) this.f1299c).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m2946c(((C0199p) this.f1299c).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((C0199p) this.f1299c).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m2946c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return ((C0199p) this.f1299c).addSubMenu(i);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((C0199p) this.f1299c).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f1299c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return ((C0199p) this.f1299c).addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        C0390n c0390n = this.f1292b;
        if (c0390n != null) {
            c0390n.clear();
        }
        ((C0199p) this.f1299c).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((C0199p) this.f1299c).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m2946c(((C0199p) this.f1299c).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m2946c((MenuItem) ((C0199p) this.f1299c).f1377g.get(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((C0199p) this.f1299c).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0199p) this.f1299c).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((C0199p) this.f1299c).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0199p) this.f1299c).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        if (this.f1292b != null) {
            int i2 = 0;
            while (true) {
                C0390n c0390n = this.f1292b;
                if (i2 >= c0390n.f1943h) {
                    break;
                }
                if (((InterfaceMenuItemC0527b) c0390n.m2616h(i2)).getGroupId() == i) {
                    this.f1292b.m2615i(i2);
                    i2--;
                }
                i2++;
            }
        }
        ((C0199p) this.f1299c).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        if (this.f1292b != null) {
            int i2 = 0;
            while (true) {
                C0390n c0390n = this.f1292b;
                if (i2 >= c0390n.f1943h) {
                    break;
                } else if (((InterfaceMenuItemC0527b) c0390n.m2616h(i2)).getItemId() == i) {
                    this.f1292b.m2615i(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        ((C0199p) this.f1299c).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0199p) this.f1299c).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((C0199p) this.f1299c).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((C0199p) this.f1299c).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1299c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((C0199p) this.f1299c).size();
    }
}