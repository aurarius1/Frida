package p010b.p016c.p024p.p025m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b;

/* renamed from: b.c.p.m.s */
/* loaded from: classes.dex */
public final class C0202s implements InterfaceMenuItemC0527b {

    /* renamed from: A */
    public C0203t f1400A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f1401B;

    /* renamed from: D */
    public ContextMenu.ContextMenuInfo f1403D;

    /* renamed from: a */
    public final int f1404a;

    /* renamed from: b */
    public final int f1405b;

    /* renamed from: c */
    public final int f1406c;

    /* renamed from: d */
    public final int f1407d;

    /* renamed from: e */
    public CharSequence f1408e;

    /* renamed from: f */
    public CharSequence f1409f;

    /* renamed from: g */
    public Intent f1410g;

    /* renamed from: h */
    public char f1411h;

    /* renamed from: j */
    public char f1413j;

    /* renamed from: l */
    public Drawable f1415l;

    /* renamed from: n */
    public C0199p f1417n;

    /* renamed from: o */
    public SubMenuC0195l0 f1418o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f1419p;

    /* renamed from: q */
    public CharSequence f1420q;

    /* renamed from: r */
    public CharSequence f1421r;

    /* renamed from: y */
    public int f1428y;

    /* renamed from: z */
    public View f1429z;

    /* renamed from: i */
    public int f1412i = 4096;

    /* renamed from: k */
    public int f1414k = 4096;

    /* renamed from: m */
    public int f1416m = 0;

    /* renamed from: s */
    public ColorStateList f1422s = null;

    /* renamed from: t */
    public PorterDuff.Mode f1423t = null;

    /* renamed from: u */
    public boolean f1424u = false;

    /* renamed from: v */
    public boolean f1425v = false;

    /* renamed from: w */
    public boolean f1426w = false;

    /* renamed from: x */
    public int f1427x = 16;

    /* renamed from: C */
    public boolean f1402C = false;

    public C0202s(C0199p c0199p, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1428y = 0;
        this.f1417n = c0199p;
        this.f1404a = i2;
        this.f1405b = i;
        this.f1406c = i3;
        this.f1407d = i4;
        this.f1408e = charSequence;
        this.f1428y = i5;
    }

    /* renamed from: c */
    public static void m2912c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b
    /* renamed from: a */
    public InterfaceMenuItemC0527b mo2352a(C0203t c0203t) {
        C0203t c0203t2 = this.f1400A;
        if (c0203t2 != null) {
            c0203t2.f1430a = null;
        }
        this.f1429z = null;
        this.f1400A = c0203t;
        this.f1417n.m2922q(true);
        C0203t c0203t3 = this.f1400A;
        if (c0203t3 != null) {
            c0203t3.mo2897d(new C0201r(this));
        }
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b
    /* renamed from: b */
    public C0203t mo2351b() {
        return this.f1400A;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1428y & 8) == 0) {
            return false;
        }
        if (this.f1429z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1401B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1417n.mo2935d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m2911d(Drawable drawable) {
        if (drawable != null && this.f1426w && (this.f1424u || this.f1425v)) {
            drawable = AbstractC0022t.m3466u0(drawable).mutate();
            if (this.f1424u) {
                AbstractC0022t.m3480n0(drawable, this.f1422s);
            }
            if (this.f1425v) {
                AbstractC0022t.m3478o0(drawable, this.f1423t);
            }
            this.f1426w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public char m2910e() {
        return this.f1417n.mo2925n() ? this.f1413j : this.f1411h;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public boolean expandActionView() {
        if (m2909f()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f1401B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f1417n.mo2933f(this);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m2909f() {
        C0203t c0203t;
        if ((this.f1428y & 8) != 0) {
            if (this.f1429z == null && (c0203t = this.f1400A) != null) {
                this.f1429z = c0203t.mo2899b(this);
            }
            return this.f1429z != null;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m2908g() {
        return (this.f1427x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1429z;
        if (view != null) {
            return view;
        }
        C0203t c0203t = this.f1400A;
        if (c0203t != null) {
            View mo2899b = c0203t.mo2899b(this);
            this.f1429z = mo2899b;
            return mo2899b;
        }
        return null;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1414k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1413j;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1420q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1405b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1415l;
        if (drawable != null) {
            return m2911d(drawable);
        }
        int i = this.f1416m;
        if (i != 0) {
            Drawable m3000b = AbstractC0142b.m3000b(this.f1417n.f1372b, i);
            this.f1416m = 0;
            this.f1415l = m3000b;
            return m2911d(m3000b);
        }
        return null;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1422s;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1423t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1410g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1404a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1403D;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1412i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1411h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1406c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1418o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1408e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1409f;
        if (charSequence == null) {
            charSequence = this.f1408e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1421r;
    }

    /* renamed from: h */
    public boolean m2907h() {
        return (this.f1427x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1418o != null;
    }

    /* renamed from: i */
    public InterfaceMenuItemC0527b m2906i(View view) {
        int i;
        this.f1429z = view;
        this.f1400A = null;
        if (view != null && view.getId() == -1 && (i = this.f1404a) > 0) {
            view.setId(i);
        }
        this.f1417n.m2923p();
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1402C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1427x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1427x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1427x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        C0203t c0203t = this.f1400A;
        return (c0203t == null || !c0203t.mo2898c()) ? (this.f1427x & 8) == 0 : (this.f1427x & 8) == 0 && this.f1400A.mo2900a();
    }

    /* renamed from: j */
    public void m2905j(boolean z) {
        int i = this.f1427x;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f1427x = i2;
        if (i != i2) {
            this.f1417n.m2922q(false);
        }
    }

    /* renamed from: k */
    public void m2904k(boolean z) {
        this.f1427x = (z ? 4 : 0) | (this.f1427x & (-5));
    }

    /* renamed from: l */
    public void m2903l(boolean z) {
        this.f1427x = z ? this.f1427x | 32 : this.f1427x & (-33);
    }

    /* renamed from: m */
    public boolean m2902m(boolean z) {
        int i = this.f1427x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f1427x = i2;
        return i != i2;
    }

    /* renamed from: n */
    public boolean m2901n() {
        return this.f1417n.mo2924o() && m2910e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.f1417n.f1372b;
        m2906i(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m2906i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1413j == c) {
            return this;
        }
        this.f1413j = Character.toLowerCase(c);
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1413j == c && this.f1414k == i) {
            return this;
        }
        this.f1413j = Character.toLowerCase(c);
        this.f1414k = KeyEvent.normalizeMetaState(i);
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1427x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f1427x = i2;
        if (i != i2) {
            this.f1417n.m2922q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1427x & 4) != 0) {
            C0199p c0199p = this.f1417n;
            c0199p.getClass();
            int groupId = getGroupId();
            int size = c0199p.f1377g.size();
            c0199p.m2938A();
            for (int i = 0; i < size; i++) {
                C0202s c0202s = (C0202s) c0199p.f1377g.get(i);
                if (c0202s.f1405b == groupId && c0202s.m2907h() && c0202s.isCheckable()) {
                    c0202s.m2905j(c0202s == this);
                }
            }
            c0199p.m2913z();
        } else {
            m2905j(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1420q = charSequence;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public InterfaceMenuItemC0527b setContentDescription(CharSequence charSequence) {
        this.f1420q = charSequence;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1427x = z ? this.f1427x | 16 : this.f1427x & (-17);
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1415l = null;
        this.f1416m = i;
        this.f1426w = true;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1416m = 0;
        this.f1415l = drawable;
        this.f1426w = true;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1422s = colorStateList;
        this.f1424u = true;
        this.f1426w = true;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1423t = mode;
        this.f1425v = true;
        this.f1426w = true;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1410g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f1411h == c) {
            return this;
        }
        this.f1411h = c;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1411h == c && this.f1412i == i) {
            return this;
        }
        this.f1411h = c;
        this.f1412i = KeyEvent.normalizeMetaState(i);
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1401B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1419p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1411h = c;
        this.f1413j = Character.toLowerCase(c2);
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1411h = c;
        this.f1412i = KeyEvent.normalizeMetaState(i);
        this.f1413j = Character.toLowerCase(c2);
        this.f1414k = KeyEvent.normalizeMetaState(i2);
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1428y = i;
        this.f1417n.m2923p();
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f1417n.f1372b.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1408e = charSequence;
        this.f1417n.m2922q(false);
        SubMenuC0195l0 subMenuC0195l0 = this.f1418o;
        if (subMenuC0195l0 != null) {
            subMenuC0195l0.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1409f = charSequence;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1421r = charSequence;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b, android.view.MenuItem
    public InterfaceMenuItemC0527b setTooltipText(CharSequence charSequence) {
        this.f1421r = charSequence;
        this.f1417n.m2922q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m2902m(z)) {
            C0199p c0199p = this.f1417n;
            c0199p.f1379i = true;
            c0199p.m2922q(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1408e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}