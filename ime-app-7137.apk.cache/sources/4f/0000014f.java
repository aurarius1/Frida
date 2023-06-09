package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: b.c.p.m.t */
/* loaded from: classes.dex */
public class C0203t {

    /* renamed from: a */
    public C0201r f1430a;

    /* renamed from: b */
    public final ActionProvider f1431b;

    /* renamed from: c */
    public final /* synthetic */ MenuItemC0208y f1432c;

    public C0203t(MenuItemC0208y menuItemC0208y, Context context, ActionProvider actionProvider) {
        this.f1432c = menuItemC0208y;
        this.f1431b = actionProvider;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo2900a() {
        return true;
    }

    /* renamed from: b */
    public View mo2899b(MenuItem menuItem) {
        return this.f1431b.onCreateActionView();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo2898c() {
        return false;
    }

    /* renamed from: d */
    public void mo2897d(C0201r c0201r) {
        if (this.f1430a != null) {
            getClass().getSimpleName();
        }
        this.f1430a = c0201r;
    }
}