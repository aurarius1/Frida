package p093c.p145g.p146a.p147a.p166r;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;

/* renamed from: c.g.a.a.r.c */
/* loaded from: classes.dex */
public final class C1968c extends C0199p {
    public C1968c(Context context) {
        super(context);
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: a */
    public MenuItem mo653a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            m2938A();
            MenuItem mo653a = super.mo653a(i, i2, i3, charSequence);
            ((C0202s) mo653a).m2904k(true);
            m2913z();
            return mo653a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    @Override // p010b.p016c.p024p.p025m.C0199p, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}