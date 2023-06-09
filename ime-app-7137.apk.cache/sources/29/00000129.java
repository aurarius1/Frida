package p010b.p016c.p024p;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import p010b.p016c.p024p.p025m.MenuC0185g0;
import p010b.p016c.p024p.p025m.MenuItemC0208y;
import p010b.p036g.C0390n;
import p010b.p046j.p052g.p053a.InterfaceMenuC0526a;
import p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b;

/* renamed from: b.c.p.f */
/* loaded from: classes.dex */
public class C0165f implements InterfaceC0160a {

    /* renamed from: a */
    public final ActionMode.Callback f1205a;

    /* renamed from: b */
    public final Context f1206b;

    /* renamed from: c */
    public final ArrayList f1207c = new ArrayList();

    /* renamed from: d */
    public final C0390n f1208d = new C0390n();

    public C0165f(Context context, ActionMode.Callback callback) {
        this.f1206b = context;
        this.f1205a = callback;
    }

    @Override // p010b.p016c.p024p.InterfaceC0160a
    /* renamed from: a */
    public boolean mo2965a(AbstractC0161b abstractC0161b, Menu menu) {
        return this.f1205a.onPrepareActionMode(m2961e(abstractC0161b), m2960f(menu));
    }

    @Override // p010b.p016c.p024p.InterfaceC0160a
    /* renamed from: b */
    public boolean mo2964b(AbstractC0161b abstractC0161b, MenuItem menuItem) {
        return this.f1205a.onActionItemClicked(m2961e(abstractC0161b), new MenuItemC0208y(this.f1206b, (InterfaceMenuItemC0527b) menuItem));
    }

    @Override // p010b.p016c.p024p.InterfaceC0160a
    /* renamed from: c */
    public boolean mo2963c(AbstractC0161b abstractC0161b, Menu menu) {
        return this.f1205a.onCreateActionMode(m2961e(abstractC0161b), m2960f(menu));
    }

    @Override // p010b.p016c.p024p.InterfaceC0160a
    /* renamed from: d */
    public void mo2962d(AbstractC0161b abstractC0161b) {
        this.f1205a.onDestroyActionMode(m2961e(abstractC0161b));
    }

    /* renamed from: e */
    public ActionMode m2961e(AbstractC0161b abstractC0161b) {
        int size = this.f1207c.size();
        for (int i = 0; i < size; i++) {
            C0166g c0166g = (C0166g) this.f1207c.get(i);
            if (c0166g != null && c0166g.f1210b == abstractC0161b) {
                return c0166g;
            }
        }
        C0166g c0166g2 = new C0166g(this.f1206b, abstractC0161b);
        this.f1207c.add(c0166g2);
        return c0166g2;
    }

    /* renamed from: f */
    public final Menu m2960f(Menu menu) {
        Menu menu2 = (Menu) this.f1208d.getOrDefault(menu, null);
        if (menu2 == null) {
            MenuC0185g0 menuC0185g0 = new MenuC0185g0(this.f1206b, (InterfaceMenuC0526a) menu);
            this.f1208d.put(menu, menuC0185g0);
            return menuC0185g0;
        }
        return menu2;
    }
}