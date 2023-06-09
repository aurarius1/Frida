package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: b.c.p.m.l0 */
/* loaded from: classes.dex */
public class SubMenuC0195l0 extends C0199p implements SubMenu {

    /* renamed from: A */
    public C0202s f1363A;

    /* renamed from: z */
    public C0199p f1364z;

    public SubMenuC0195l0(Context context, C0199p c0199p, C0202s c0202s) {
        super(context);
        this.f1364z = c0199p;
        this.f1363A = c0202s;
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: d */
    public boolean mo2935d(C0202s c0202s) {
        return this.f1364z.mo2935d(c0202s);
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: e */
    public boolean mo2934e(C0199p c0199p, MenuItem menuItem) {
        return super.mo2934e(c0199p, menuItem) || this.f1364z.mo2934e(c0199p, menuItem);
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: f */
    public boolean mo2933f(C0202s c0202s) {
        return this.f1364z.mo2933f(c0202s);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1363A;
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: j */
    public String mo2929j() {
        C0202s c0202s = this.f1363A;
        int i = c0202s != null ? c0202s.f1404a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: k */
    public C0199p mo2928k() {
        return this.f1364z.mo2928k();
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: m */
    public boolean mo2926m() {
        return this.f1364z.mo2926m();
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: n */
    public boolean mo2925n() {
        return this.f1364z.mo2925n();
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: o */
    public boolean mo2924o() {
        return this.f1364z.mo2924o();
    }

    @Override // p010b.p016c.p024p.p025m.C0199p, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1364z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m2914y(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m2914y(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m2914y(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1363A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1363A.setIcon(drawable);
        return this;
    }

    @Override // p010b.p016c.p024p.p025m.C0199p, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1364z.setQwertyMode(z);
    }

    @Override // p010b.p016c.p024p.p025m.C0199p
    /* renamed from: x */
    public void mo2915x(InterfaceC0197n interfaceC0197n) {
        this.f1364z.mo2915x(interfaceC0197n);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m2914y(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m2914y(0, charSequence, 0, null, null);
        return this;
    }
}