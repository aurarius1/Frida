package p010b.p016c.p024p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.C0203t;
import p010b.p016c.p024p.p025m.MenuItemC0208y;
import p010b.p046j.p052g.p053a.InterfaceMenuItemC0527b;

/* renamed from: b.c.p.i */
/* loaded from: classes.dex */
public class C0168i {

    /* renamed from: A */
    public C0203t f1214A;

    /* renamed from: B */
    public CharSequence f1215B;

    /* renamed from: C */
    public CharSequence f1216C;

    /* renamed from: F */
    public final /* synthetic */ C0169j f1219F;

    /* renamed from: a */
    public Menu f1220a;

    /* renamed from: h */
    public boolean f1227h;

    /* renamed from: i */
    public int f1228i;

    /* renamed from: j */
    public int f1229j;

    /* renamed from: k */
    public CharSequence f1230k;

    /* renamed from: l */
    public CharSequence f1231l;

    /* renamed from: m */
    public int f1232m;

    /* renamed from: n */
    public char f1233n;

    /* renamed from: o */
    public int f1234o;

    /* renamed from: p */
    public char f1235p;

    /* renamed from: q */
    public int f1236q;

    /* renamed from: r */
    public int f1237r;

    /* renamed from: s */
    public boolean f1238s;

    /* renamed from: t */
    public boolean f1239t;

    /* renamed from: u */
    public boolean f1240u;

    /* renamed from: v */
    public int f1241v;

    /* renamed from: w */
    public int f1242w;

    /* renamed from: x */
    public String f1243x;

    /* renamed from: y */
    public String f1244y;

    /* renamed from: z */
    public String f1245z;

    /* renamed from: D */
    public ColorStateList f1217D = null;

    /* renamed from: E */
    public PorterDuff.Mode f1218E = null;

    /* renamed from: b */
    public int f1221b = 0;

    /* renamed from: c */
    public int f1222c = 0;

    /* renamed from: d */
    public int f1223d = 0;

    /* renamed from: e */
    public int f1224e = 0;

    /* renamed from: f */
    public boolean f1225f = true;

    /* renamed from: g */
    public boolean f1226g = true;

    public C0168i(C0169j c0169j, Menu menu) {
        this.f1219F = c0169j;
        this.f1220a = menu;
    }

    /* renamed from: a */
    public SubMenu m2959a() {
        this.f1227h = true;
        SubMenu addSubMenu = this.f1220a.addSubMenu(this.f1221b, this.f1228i, this.f1229j, this.f1230k);
        m2957c(addSubMenu.getItem());
        return addSubMenu;
    }

    /* renamed from: b */
    public final Object m2958b(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1219F.f1250e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void m2957c(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f1238s).setVisible(this.f1239t).setEnabled(this.f1240u).setCheckable(this.f1237r >= 1).setTitleCondensed(this.f1231l).setIcon(this.f1232m);
        int i = this.f1241v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f1245z != null) {
            if (this.f1219F.f1250e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            C0169j c0169j = this.f1219F;
            if (c0169j.f1251f == null) {
                c0169j.f1251f = c0169j.m2956a(c0169j.f1250e);
            }
            menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0167h(c0169j.f1251f, this.f1245z));
        }
        if (this.f1237r >= 2) {
            if (menuItem instanceof C0202s) {
                ((C0202s) menuItem).m2904k(true);
            } else if (menuItem instanceof MenuItemC0208y) {
                MenuItemC0208y menuItemC0208y = (MenuItemC0208y) menuItem;
                try {
                    if (menuItemC0208y.f1440d == null) {
                        menuItemC0208y.f1440d = menuItemC0208y.f1439c.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0208y.f1440d.invoke(menuItemC0208y.f1439c, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str = this.f1243x;
        if (str != null) {
            menuItem.setActionView((View) m2958b(str, C0169j.f1246a, this.f1219F.f1248c));
            z = true;
        }
        int i2 = this.f1242w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        C0203t c0203t = this.f1214A;
        if (c0203t != null && (menuItem instanceof InterfaceMenuItemC0527b)) {
            ((InterfaceMenuItemC0527b) menuItem).mo2352a(c0203t);
        }
        CharSequence charSequence = this.f1215B;
        boolean z2 = menuItem instanceof InterfaceMenuItemC0527b;
        if (z2) {
            ((InterfaceMenuItemC0527b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1216C;
        if (z2) {
            ((InterfaceMenuItemC0527b) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f1233n;
        int i3 = this.f1234o;
        if (z2) {
            ((InterfaceMenuItemC0527b) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.f1235p;
        int i4 = this.f1236q;
        if (z2) {
            ((InterfaceMenuItemC0527b) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.f1218E;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC0527b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f1217D;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC0527b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}