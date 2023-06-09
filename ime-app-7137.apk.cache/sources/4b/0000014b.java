package p010b.p016c.p024p.p025m;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ActionProvider;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p052g.p053a.InterfaceMenuC0526a;
import p010b.p046j.p058l.AbstractC0607k0;

/* renamed from: b.c.p.m.p */
/* loaded from: classes.dex */
public class C0199p implements InterfaceMenuC0526a {

    /* renamed from: a */
    public static final int[] f1371a = {1, 4, 5, 3, 2, 0};

    /* renamed from: b */
    public final Context f1372b;

    /* renamed from: c */
    public final Resources f1373c;

    /* renamed from: d */
    public boolean f1374d;

    /* renamed from: e */
    public boolean f1375e;

    /* renamed from: f */
    public InterfaceC0197n f1376f;

    /* renamed from: g */
    public ArrayList f1377g;

    /* renamed from: h */
    public ArrayList f1378h;

    /* renamed from: i */
    public boolean f1379i;

    /* renamed from: j */
    public ArrayList f1380j;

    /* renamed from: k */
    public ArrayList f1381k;

    /* renamed from: l */
    public boolean f1382l;

    /* renamed from: n */
    public CharSequence f1384n;

    /* renamed from: o */
    public Drawable f1385o;

    /* renamed from: p */
    public View f1386p;

    /* renamed from: w */
    public C0202s f1393w;

    /* renamed from: y */
    public boolean f1395y;

    /* renamed from: m */
    public int f1383m = 0;

    /* renamed from: q */
    public boolean f1387q = false;

    /* renamed from: r */
    public boolean f1388r = false;

    /* renamed from: s */
    public boolean f1389s = false;

    /* renamed from: t */
    public boolean f1390t = false;

    /* renamed from: u */
    public ArrayList f1391u = new ArrayList();

    /* renamed from: v */
    public CopyOnWriteArrayList f1392v = new CopyOnWriteArrayList();

    /* renamed from: x */
    public boolean f1394x = false;

    public C0199p(Context context) {
        boolean z;
        boolean z2 = false;
        this.f1372b = context;
        Resources resources = context.getResources();
        this.f1373c = resources;
        this.f1377g = new ArrayList();
        this.f1378h = new ArrayList();
        this.f1379i = true;
        this.f1380j = new ArrayList();
        this.f1381k = new ArrayList();
        this.f1382l = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0607k0.f2760a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f1375e = z2;
    }

    /* renamed from: A */
    public void m2938A() {
        if (this.f1387q) {
            return;
        }
        this.f1387q = true;
        this.f1388r = false;
        this.f1389s = false;
    }

    /* renamed from: a */
    public MenuItem mo653a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f1371a;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C0202s c0202s = new C0202s(this, i, i2, i3, i6, charSequence, this.f1383m);
                ArrayList arrayList = this.f1377g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    } else if (((C0202s) arrayList.get(size)).f1407d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, c0202s);
                m2922q(true);
                return c0202s;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo653a(0, 0, 0, this.f1373c.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo653a(i, i2, i3, this.f1373c.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo653a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo653a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1372b.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = mo653a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1373c.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1373c.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0202s c0202s = (C0202s) mo653a(i, i2, i3, charSequence);
        SubMenuC0195l0 subMenuC0195l0 = new SubMenuC0195l0(this.f1372b, this, c0202s);
        c0202s.f1418o = subMenuC0195l0;
        subMenuC0195l0.setHeaderTitle(c0202s.f1408e);
        return subMenuC0195l0;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m2937b(InterfaceC0179d0 interfaceC0179d0, Context context) {
        this.f1392v.add(new WeakReference(interfaceC0179d0));
        interfaceC0179d0.mo645g(context, this);
        this.f1382l = true;
    }

    /* renamed from: c */
    public final void m2936c(boolean z) {
        if (this.f1390t) {
            return;
        }
        this.f1390t = true;
        Iterator it = this.f1392v.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0179d0 interfaceC0179d0 = (InterfaceC0179d0) weakReference.get();
            if (interfaceC0179d0 == null) {
                this.f1392v.remove(weakReference);
            } else {
                interfaceC0179d0.mo649a(this, z);
            }
        }
        this.f1390t = false;
    }

    @Override // android.view.Menu
    public void clear() {
        C0202s c0202s = this.f1393w;
        if (c0202s != null) {
            mo2935d(c0202s);
        }
        this.f1377g.clear();
        m2922q(true);
    }

    public void clearHeader() {
        this.f1385o = null;
        this.f1384n = null;
        this.f1386p = null;
        m2922q(false);
    }

    @Override // android.view.Menu
    public void close() {
        m2936c(true);
    }

    /* renamed from: d */
    public boolean mo2935d(C0202s c0202s) {
        boolean z = false;
        if (!this.f1392v.isEmpty() && this.f1393w == c0202s) {
            m2938A();
            Iterator it = this.f1392v.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0179d0 interfaceC0179d0 = (InterfaceC0179d0) weakReference.get();
                if (interfaceC0179d0 == null) {
                    this.f1392v.remove(weakReference);
                } else {
                    z = interfaceC0179d0.mo643i(this, c0202s);
                    if (z) {
                        break;
                    }
                }
            }
            m2913z();
            if (z) {
                this.f1393w = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo2934e(C0199p c0199p, MenuItem menuItem) {
        InterfaceC0197n interfaceC0197n = this.f1376f;
        return interfaceC0197n != null && interfaceC0197n.mo639a(c0199p, menuItem);
    }

    /* renamed from: f */
    public boolean mo2933f(C0202s c0202s) {
        boolean z = false;
        if (this.f1392v.isEmpty()) {
            return false;
        }
        m2938A();
        Iterator it = this.f1392v.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0179d0 interfaceC0179d0 = (InterfaceC0179d0) weakReference.get();
            if (interfaceC0179d0 == null) {
                this.f1392v.remove(weakReference);
            } else {
                z = interfaceC0179d0.mo642j(this, c0202s);
                if (z) {
                    break;
                }
            }
        }
        m2913z();
        if (z) {
            this.f1393w = c0202s;
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0202s c0202s = (C0202s) this.f1377g.get(i2);
            if (c0202s.f1404a == i) {
                return c0202s;
            }
            if (c0202s.hasSubMenu() && (findItem = c0202s.f1418o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public C0202s m2932g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.f1391u;
        arrayList.clear();
        m2931h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0202s) arrayList.get(0);
        }
        boolean mo2925n = mo2925n();
        for (int i2 = 0; i2 < size; i2++) {
            C0202s c0202s = (C0202s) arrayList.get(i2);
            if (mo2925n) {
                c = c0202s.f1413j;
            } else {
                c = c0202s.f1411h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (mo2925n && c == '\b' && i == 67))) {
                return c0202s;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.f1377g.get(i);
    }

    /* renamed from: h */
    public void m2931h(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean mo2925n = mo2925n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1377g.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0202s c0202s = (C0202s) this.f1377g.get(i3);
                if (c0202s.hasSubMenu()) {
                    c0202s.f1418o.m2931h(list, i, keyEvent);
                }
                if (mo2925n) {
                    c = c0202s.f1413j;
                } else {
                    c = c0202s.f1411h;
                }
                if (mo2925n) {
                    i2 = c0202s.f1414k;
                } else {
                    i2 = c0202s.f1412i;
                }
                if (((modifiers & 69647) == (i2 & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (mo2925n && c == '\b' && i == 67)) && c0202s.isEnabled()) {
                        list.add(c0202s);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1395y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0202s) this.f1377g.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m2930i() {
        ArrayList m2927l = m2927l();
        if (this.f1382l) {
            Iterator it = this.f1392v.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0179d0 interfaceC0179d0 = (InterfaceC0179d0) weakReference.get();
                if (interfaceC0179d0 == null) {
                    this.f1392v.remove(weakReference);
                } else {
                    z |= interfaceC0179d0.mo647d();
                }
            }
            if (z) {
                this.f1380j.clear();
                this.f1381k.clear();
                int size = m2927l.size();
                for (int i = 0; i < size; i++) {
                    C0202s c0202s = (C0202s) m2927l.get(i);
                    (c0202s.m2908g() ? this.f1380j : this.f1381k).add(c0202s);
                }
            } else {
                this.f1380j.clear();
                this.f1381k.clear();
                this.f1381k.addAll(m2927l());
            }
            this.f1382l = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2932g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo2929j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public C0199p mo2928k() {
        return this;
    }

    /* renamed from: l */
    public ArrayList m2927l() {
        if (this.f1379i) {
            this.f1378h.clear();
            int size = this.f1377g.size();
            for (int i = 0; i < size; i++) {
                C0202s c0202s = (C0202s) this.f1377g.get(i);
                if (c0202s.isVisible()) {
                    this.f1378h.add(c0202s);
                }
            }
            this.f1379i = false;
            this.f1382l = true;
            return this.f1378h;
        }
        return this.f1378h;
    }

    /* renamed from: m */
    public boolean mo2926m() {
        return this.f1394x;
    }

    /* renamed from: n */
    public boolean mo2925n() {
        return this.f1374d;
    }

    /* renamed from: o */
    public boolean mo2924o() {
        return this.f1375e;
    }

    /* renamed from: p */
    public void m2923p() {
        this.f1382l = true;
        m2922q(true);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m2921r(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0202s m2932g = m2932g(i, keyEvent);
        boolean m2920s = m2932g != null ? m2920s(m2932g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m2936c(true);
        }
        return m2920s;
    }

    /* renamed from: q */
    public void m2922q(boolean z) {
        if (!this.f1387q) {
            if (z) {
                this.f1379i = true;
                this.f1382l = true;
            }
            if (this.f1392v.isEmpty()) {
                return;
            }
            m2938A();
            Iterator it = this.f1392v.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0179d0 interfaceC0179d0 = (InterfaceC0179d0) weakReference.get();
                if (interfaceC0179d0 == null) {
                    this.f1392v.remove(weakReference);
                } else {
                    interfaceC0179d0.mo640n(z);
                }
            }
            m2913z();
            return;
        }
        this.f1388r = true;
        if (z) {
            this.f1389s = true;
        }
    }

    /* renamed from: r */
    public boolean m2921r(MenuItem menuItem, int i) {
        return m2920s(menuItem, null, i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0202s) this.f1377g.get(i2)).f1405b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f1377g.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((C0202s) this.f1377g.get(i2)).f1405b != i) {
                    break;
                }
                m2919t(i2, false);
                i3 = i4;
            }
            m2922q(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0202s) this.f1377g.get(i2)).f1404a == i) {
                break;
            } else {
                i2++;
            }
        }
        m2919t(i2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
        if ((r9 & 1) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
        m2936c(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2920s(MenuItem menuItem, InterfaceC0179d0 interfaceC0179d0, int i) {
        boolean z;
        C0202s c0202s = (C0202s) menuItem;
        if (c0202s == null || !c0202s.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0202s.f1419p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0202s)) {
            C0199p c0199p = c0202s.f1417n;
            if (!c0199p.mo2934e(c0199p, c0202s)) {
                Intent intent = c0202s.f1410g;
                if (intent != null) {
                    try {
                        c0202s.f1417n.f1372b.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                C0203t c0203t = c0202s.f1400A;
                if (c0203t == null || !c0203t.f1431b.onPerformDefaultAction()) {
                    z = false;
                    C0203t c0203t2 = c0202s.f1400A;
                    boolean z2 = c0203t2 == null && c0203t2.f1431b.hasSubMenu();
                    if (!c0202s.m2909f()) {
                        z |= c0202s.expandActionView();
                    } else if (c0202s.hasSubMenu() || z2) {
                        if ((i & 4) == 0) {
                            m2936c(false);
                        }
                        if (!c0202s.hasSubMenu()) {
                            SubMenuC0195l0 subMenuC0195l0 = new SubMenuC0195l0(this.f1372b, this, c0202s);
                            c0202s.f1418o = subMenuC0195l0;
                            subMenuC0195l0.setHeaderTitle(c0202s.f1408e);
                        }
                        SubMenuC0195l0 subMenuC0195l02 = c0202s.f1418o;
                        if (z2) {
                            ActionProvider actionProvider = c0203t2.f1431b;
                            c0203t2.f1432c.getClass();
                            actionProvider.onPrepareSubMenu(subMenuC0195l02);
                        }
                        if (!this.f1392v.isEmpty()) {
                            r0 = interfaceC0179d0 != null ? interfaceC0179d0.mo641m(subMenuC0195l02) : false;
                            Iterator it = this.f1392v.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0179d0 interfaceC0179d02 = (InterfaceC0179d0) weakReference.get();
                                if (interfaceC0179d02 == null) {
                                    this.f1392v.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0179d02.mo641m(subMenuC0195l02);
                                }
                            }
                        }
                        z |= r0;
                    }
                    return z;
                }
            }
        }
        z = true;
        C0203t c0203t22 = c0202s.f1400A;
        if (c0203t22 == null) {
        }
        if (!c0202s.m2909f()) {
        }
        return z;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1377g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0202s c0202s = (C0202s) this.f1377g.get(i2);
            if (c0202s.f1405b == i) {
                c0202s.m2904k(z2);
                c0202s.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1394x = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1377g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0202s c0202s = (C0202s) this.f1377g.get(i2);
            if (c0202s.f1405b == i) {
                c0202s.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1377g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0202s c0202s = (C0202s) this.f1377g.get(i2);
            if (c0202s.f1405b == i && c0202s.m2902m(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m2922q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1374d = z;
        m2922q(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1377g.size();
    }

    /* renamed from: t */
    public final void m2919t(int i, boolean z) {
        if (i < 0 || i >= this.f1377g.size()) {
            return;
        }
        this.f1377g.remove(i);
        if (z) {
            m2922q(true);
        }
    }

    /* renamed from: u */
    public void m2918u(InterfaceC0179d0 interfaceC0179d0) {
        Iterator it = this.f1392v.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0179d0 interfaceC0179d02 = (InterfaceC0179d0) weakReference.get();
            if (interfaceC0179d02 == null || interfaceC0179d02 == interfaceC0179d0) {
                this.f1392v.remove(weakReference);
            }
        }
    }

    /* renamed from: v */
    public void m2917v(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2929j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0195l0) item.getSubMenu()).m2917v(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: w */
    public void m2916w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0195l0) item.getSubMenu()).m2916w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2929j(), sparseArray);
        }
    }

    /* renamed from: x */
    public void mo2915x(InterfaceC0197n interfaceC0197n) {
        this.f1376f = interfaceC0197n;
    }

    /* renamed from: y */
    public final void m2914y(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f1373c;
        if (view != null) {
            this.f1386p = view;
            this.f1384n = null;
            this.f1385o = null;
        } else {
            if (i > 0) {
                this.f1384n = resources.getText(i);
            } else if (charSequence != null) {
                this.f1384n = charSequence;
            }
            if (i2 > 0) {
                this.f1385o = AbstractC0472e.m2430c(this.f1372b, i2);
            } else if (drawable != null) {
                this.f1385o = drawable;
            }
            this.f1386p = null;
        }
        m2922q(false);
    }

    /* renamed from: z */
    public void m2913z() {
        this.f1387q = false;
        if (this.f1388r) {
            this.f1388r = false;
            m2922q(this.f1389s);
        }
    }
}