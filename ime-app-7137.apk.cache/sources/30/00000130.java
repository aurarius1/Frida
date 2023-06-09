package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b;

/* renamed from: b.c.p.m.a */
/* loaded from: classes.dex */
public class C0172a implements InterfaceMenuItemC0527b {

    /* renamed from: a */
    public CharSequence f1261a;

    /* renamed from: b */
    public CharSequence f1262b;

    /* renamed from: c */
    public Intent f1263c;

    /* renamed from: d */
    public char f1264d;

    /* renamed from: f */
    public char f1266f;

    /* renamed from: h */
    public Drawable f1268h;

    /* renamed from: i */
    public Context f1269i;

    /* renamed from: j */
    public CharSequence f1270j;

    /* renamed from: k */
    public CharSequence f1271k;

    /* renamed from: e */
    public int f1265e = 4096;

    /* renamed from: g */
    public int f1267g = 4096;

    /* renamed from: l */
    public ColorStateList f1272l = null;

    /* renamed from: m */
    public PorterDuff.Mode f1273m = null;

    /* renamed from: n */
    public boolean f1274n = false;

    /* renamed from: o */
    public boolean f1275o = false;

    /* renamed from: p */
    public int f1276p = 16;

    public C0172a(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.f1269i = context;
        this.f1261a = charSequence;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b
    /* renamed from: a */
    public InterfaceMenuItemC0527b mo2352a(C0203t c0203t) {
        throw new UnsupportedOperationException();
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b
    /* renamed from: b */
    public C0203t mo2351b() {
        return null;
    }

    /* renamed from: c */
    public final void m2952c() {
        Drawable drawable = this.f1268h;
        if (drawable != null) {
            if (this.f1274n || this.f1275o) {
                Drawable m3466u0 = AbstractC0022t.m3466u0(drawable);
                this.f1268h = m3466u0;
                Drawable mutate = m3466u0.mutate();
                this.f1268h = mutate;
                if (this.f1274n) {
                    AbstractC0022t.m3480n0(mutate, this.f1272l);
                }
                if (this.f1275o) {
                    AbstractC0022t.m3478o0(this.f1268h, this.f1273m);
                }
            }
        }
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1267g;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1266f;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1270j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1268h;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1272l;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1273m;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1263c;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1265e;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1264d;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1261a;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1262b;
        return charSequence != null ? charSequence : this.f1261a;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1271k;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1276p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1276p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1276p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1276p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f1266f = Character.toLowerCase(c);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1266f = Character.toLowerCase(c);
        this.f1267g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1276p = (z ? 1 : 0) | (this.f1276p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1276p = (z ? 2 : 0) | (this.f1276p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1270j = charSequence;
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public InterfaceMenuItemC0527b setContentDescription(CharSequence charSequence) {
        this.f1270j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1276p = (z ? 16 : 0) | (this.f1276p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1268h = AbstractC0472e.m2430c(this.f1269i, i);
        m2952c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1268h = drawable;
        m2952c();
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1272l = colorStateList;
        this.f1274n = true;
        m2952c();
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1273m = mode;
        this.f1275o = true;
        m2952c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1263c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f1264d = c;
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f1264d = c;
        this.f1265e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1264d = c;
        this.f1266f = Character.toLowerCase(c2);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1264d = c;
        this.f1265e = KeyEvent.normalizeMetaState(i);
        this.f1266f = Character.toLowerCase(c2);
        this.f1267g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1261a = this.f1269i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1261a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1262b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1271k = charSequence;
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public InterfaceMenuItemC0527b setTooltipText(CharSequence charSequence) {
        this.f1271k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f1276p = (this.f1276p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}