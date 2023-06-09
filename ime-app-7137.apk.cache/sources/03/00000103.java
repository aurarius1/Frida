package p010b.p016c.p017k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p011a.p012k.C0061a;
import p010b.p016c.AbstractC0076b;
import p010b.p016c.AbstractC0083i;
import p010b.p016c.p024p.AbstractC0161b;
import p010b.p016c.p024p.C0163d;
import p010b.p016c.p024p.C0169j;
import p010b.p016c.p024p.InterfaceC0160a;
import p010b.p016c.p026q.AbstractC0245f4;
import p010b.p016c.p026q.C0215a4;
import p010b.p016c.p026q.C0229d0;
import p010b.p016c.p026q.C0296p2;
import p010b.p036g.C0382f;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p048e.p049b.AbstractC0504j;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p072o.p073a0.AbstractC0771a;
import p010b.p072o.p074b0.AbstractC0773a;
import p010b.p085v.AbstractC1014a;

/* renamed from: b.c.k.t */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0127t extends AbstractActivityC0681d0 implements InterfaceC0129u {

    /* renamed from: n */
    public AbstractC0131v f1090n;

    public AbstractActivityC0127t() {
        this.f849e.f3912b.m1389b("androidx:appcompat", new C0123r(this));
        C0125s c0125s = new C0125s(this);
        C0061a c0061a = this.f847c;
        if (c0061a.f858b != null) {
            c0125s.mo2107a(c0061a.f858b);
        }
        c0061a.f857a.add(c0125s);
    }

    /* renamed from: k */
    private void m3027k() {
        getWindow().getDecorView().setTag(AbstractC0771a.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(AbstractC0773a.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(AbstractC1014a.view_tree_saved_state_registry_owner, this);
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3027k();
        m3026p().mo3016c(view, layoutParams);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:25|(2:27|(9:29|(41:31|(1:33)|34|(1:36)|37|(1:39)|40|(2:42|(1:44))(2:102|(1:104))|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(1:68)|69|(1:71)|72|(1:74)|75|(4:77|(1:79)|80|(1:82))|83|(1:85)|86|(1:88)|89|(1:91)|92|(1:94)|95|(1:97)|(2:99|(1:101)))|105|106|107|(3:109|(2:111|(1:113)(2:114|(3:116|1c1|124)))|138)|139|(0)|138))|142|105|106|107|(0)|139|(0)|138) */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ad  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        Configuration configuration;
        boolean z;
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = (LayoutInflater$Factory2C0120p0) m3026p();
        layoutInflater$Factory2C0120p0.f1050Q = true;
        int i = layoutInflater$Factory2C0120p0.f1054U;
        if (i == -100) {
            i = AbstractC0131v.f1100b;
        }
        int m3047H = layoutInflater$Factory2C0120p0.m3047H(context, i);
        if (LayoutInflater$Factory2C0120p0.f1032i && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(layoutInflater$Factory2C0120p0.m3035v(context, m3047H, null));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0163d) {
            try {
                ((C0163d) context).m2981a(layoutInflater$Factory2C0120p0.m3035v(context, m3047H, null));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflater$Factory2C0120p0.f1031h) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 17) {
                Configuration configuration2 = new Configuration();
                configuration2.uiMode = -1;
                configuration2.fontScale = 0.0f;
                Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
                Configuration configuration4 = context.getResources().getConfiguration();
                configuration3.uiMode = configuration4.uiMode;
                if (!configuration3.equals(configuration4)) {
                    configuration = new Configuration();
                    configuration.fontScale = 0.0f;
                    if (configuration3.diff(configuration4) != 0) {
                        float f = configuration3.fontScale;
                        float f2 = configuration4.fontScale;
                        if (f != f2) {
                            configuration.fontScale = f2;
                        }
                        int i3 = configuration3.mcc;
                        int i4 = configuration4.mcc;
                        if (i3 != i4) {
                            configuration.mcc = i4;
                        }
                        int i5 = configuration3.mnc;
                        int i6 = configuration4.mnc;
                        if (i5 != i6) {
                            configuration.mnc = i6;
                        }
                        if (i2 >= 24) {
                            LocaleList locales = configuration3.getLocales();
                            LocaleList locales2 = configuration4.getLocales();
                            if (!locales.equals(locales2)) {
                                configuration.setLocales(locales2);
                                configuration.locale = configuration4.locale;
                            }
                        } else if (!AbstractC0022t.m3463w(configuration3.locale, configuration4.locale)) {
                            configuration.locale = configuration4.locale;
                        }
                        int i7 = configuration3.touchscreen;
                        int i8 = configuration4.touchscreen;
                        if (i7 != i8) {
                            configuration.touchscreen = i8;
                        }
                        int i9 = configuration3.keyboard;
                        int i10 = configuration4.keyboard;
                        if (i9 != i10) {
                            configuration.keyboard = i10;
                        }
                        int i11 = configuration3.keyboardHidden;
                        int i12 = configuration4.keyboardHidden;
                        if (i11 != i12) {
                            configuration.keyboardHidden = i12;
                        }
                        int i13 = configuration3.navigation;
                        int i14 = configuration4.navigation;
                        if (i13 != i14) {
                            configuration.navigation = i14;
                        }
                        int i15 = configuration3.navigationHidden;
                        int i16 = configuration4.navigationHidden;
                        if (i15 != i16) {
                            configuration.navigationHidden = i16;
                        }
                        int i17 = configuration3.orientation;
                        int i18 = configuration4.orientation;
                        if (i17 != i18) {
                            configuration.orientation = i18;
                        }
                        int i19 = configuration3.screenLayout & 15;
                        int i20 = configuration4.screenLayout & 15;
                        if (i19 != i20) {
                            configuration.screenLayout |= i20;
                        }
                        int i21 = configuration3.screenLayout & 192;
                        int i22 = configuration4.screenLayout & 192;
                        if (i21 != i22) {
                            configuration.screenLayout |= i22;
                        }
                        int i23 = configuration3.screenLayout & 48;
                        int i24 = configuration4.screenLayout & 48;
                        if (i23 != i24) {
                            configuration.screenLayout |= i24;
                        }
                        int i25 = configuration3.screenLayout & 768;
                        int i26 = configuration4.screenLayout & 768;
                        if (i25 != i26) {
                            configuration.screenLayout |= i26;
                        }
                        if (i2 >= 26) {
                            int i27 = configuration3.colorMode & 3;
                            int i28 = configuration4.colorMode & 3;
                            if (i27 != i28) {
                                configuration.colorMode |= i28;
                            }
                            int i29 = configuration3.colorMode & 12;
                            int i30 = configuration4.colorMode & 12;
                            if (i29 != i30) {
                                configuration.colorMode |= i30;
                            }
                        }
                        int i31 = configuration3.uiMode & 15;
                        int i32 = configuration4.uiMode & 15;
                        if (i31 != i32) {
                            configuration.uiMode |= i32;
                        }
                        int i33 = configuration3.uiMode & 48;
                        int i34 = configuration4.uiMode & 48;
                        if (i33 != i34) {
                            configuration.uiMode |= i34;
                        }
                        int i35 = configuration3.screenWidthDp;
                        int i36 = configuration4.screenWidthDp;
                        if (i35 != i36) {
                            configuration.screenWidthDp = i36;
                        }
                        int i37 = configuration3.screenHeightDp;
                        int i38 = configuration4.screenHeightDp;
                        if (i37 != i38) {
                            configuration.screenHeightDp = i38;
                        }
                        int i39 = configuration3.smallestScreenWidthDp;
                        int i40 = configuration4.smallestScreenWidthDp;
                        if (i39 != i40) {
                            configuration.smallestScreenWidthDp = i40;
                        }
                        if (i2 >= 17) {
                            int i41 = configuration3.densityDpi;
                            int i42 = configuration4.densityDpi;
                            if (i41 != i42) {
                                configuration.densityDpi = i42;
                            }
                        }
                    }
                    Configuration m3035v = layoutInflater$Factory2C0120p0.m3035v(context, m3047H, configuration);
                    C0163d c0163d = new C0163d(context, AbstractC0083i.Theme_AppCompat_Empty);
                    c0163d.m2981a(m3035v);
                    if (context.getTheme() != null) {
                        z = true;
                        if (z) {
                            Resources.Theme theme = c0163d.getTheme();
                            int i43 = Build.VERSION.SDK_INT;
                            if (i43 >= 29) {
                                theme.rebase();
                            } else if (i43 >= 23) {
                                synchronized (AbstractC0504j.f2537a) {
                                    if (!AbstractC0504j.f2539c) {
                                        try {
                                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                            AbstractC0504j.f2538b = declaredMethod;
                                            declaredMethod.setAccessible(true);
                                        } catch (NoSuchMethodException unused3) {
                                        }
                                        AbstractC0504j.f2539c = true;
                                    }
                                    Method method = AbstractC0504j.f2538b;
                                    if (method != null) {
                                        try {
                                            method.invoke(theme, new Object[0]);
                                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                                            AbstractC0504j.f2538b = null;
                                        }
                                    }
                                }
                            }
                        }
                        context = c0163d;
                    }
                    z = false;
                    if (z) {
                    }
                    context = c0163d;
                }
            }
            configuration = null;
            Configuration m3035v2 = layoutInflater$Factory2C0120p0.m3035v(context, m3047H, configuration);
            C0163d c0163d2 = new C0163d(context, AbstractC0083i.Theme_AppCompat_Empty);
            c0163d2.m2981a(m3035v2);
            if (context.getTheme() != null) {
            }
            z = false;
            if (z) {
            }
            context = c0163d2;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        m3025q();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p010b.p016c.p017k.InterfaceC0129u
    /* renamed from: d */
    public void mo3022d(AbstractC0161b abstractC0161b) {
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        m3025q();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p010b.p016c.p017k.InterfaceC0129u
    /* renamed from: f */
    public void mo3021f(AbstractC0161b abstractC0161b) {
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = (LayoutInflater$Factory2C0120p0) m3026p();
        layoutInflater$Factory2C0120p0.m3031z();
        return layoutInflater$Factory2C0120p0.f1070m.findViewById(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = (LayoutInflater$Factory2C0120p0) m3026p();
        if (layoutInflater$Factory2C0120p0.f1074q == null) {
            layoutInflater$Factory2C0120p0.m3049F();
            AbstractC0091c abstractC0091c = layoutInflater$Factory2C0120p0.f1073p;
            layoutInflater$Factory2C0120p0.f1074q = new C0169j(abstractC0091c != null ? abstractC0091c.mo3083b() : layoutInflater$Factory2C0120p0.f1069l);
        }
        return layoutInflater$Factory2C0120p0.f1074q;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = AbstractC0245f4.f1584a;
        return super.getResources();
    }

    @Override // p010b.p016c.p017k.InterfaceC0129u
    /* renamed from: h */
    public AbstractC0161b mo3020h(InterfaceC0160a interfaceC0160a) {
        return null;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m3026p().mo3013f();
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0
    /* renamed from: o */
    public void mo2099o() {
        m3026p().mo3013f();
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = (LayoutInflater$Factory2C0120p0) m3026p();
        if (layoutInflater$Factory2C0120p0.f1041H && layoutInflater$Factory2C0120p0.f1035B) {
            layoutInflater$Factory2C0120p0.m3049F();
            AbstractC0091c abstractC0091c = layoutInflater$Factory2C0120p0.f1073p;
            if (abstractC0091c != null) {
                C0096d1 c0096d1 = (C0096d1) abstractC0091c;
                c0096d1.m3078g(c0096d1.f884c.getResources().getBoolean(AbstractC0076b.abc_action_bar_embed_tabs));
            }
        }
        C0229d0 m2865a = C0229d0.m2865a();
        Context context = layoutInflater$Factory2C0120p0.f1069l;
        synchronized (m2865a) {
            C0296p2 c0296p2 = m2865a.f1502c;
            synchronized (c0296p2) {
                C0382f c0382f = (C0382f) c0296p2.f1696g.get(context);
                if (c0382f != null) {
                    c0382f.m2647b();
                }
            }
        }
        layoutInflater$Factory2C0120p0.m3040q(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m3026p().mo3011h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent m3527G;
        boolean z;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0091c m3025q = m3025q();
        if (menuItem.getItemId() != 16908332 || m3025q == null || (((C0215a4) ((C0096d1) m3025q).f888g).f1459b & 4) == 0 || (m3527G = AbstractC0022t.m3527G(this)) == null) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16) {
            z = shouldUpRecreateTask(m3527G);
        } else {
            String action = getIntent().getAction();
            z = (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
        }
        if (!z) {
            if (i2 >= 16) {
                navigateUpTo(m3527G);
                return true;
            }
            m3527G.addFlags(67108864);
            startActivity(m3527G);
            finish();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent m3527G2 = AbstractC0022t.m3527G(this);
        if (m3527G2 == null) {
            m3527G2 = AbstractC0022t.m3527G(this);
        }
        if (m3527G2 != null) {
            ComponentName component = m3527G2.getComponent();
            if (component == null) {
                component = m3527G2.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            while (true) {
                try {
                    Intent m3526H = AbstractC0022t.m3526H(this, component);
                    if (m3526H == null) {
                        break;
                    }
                    arrayList.add(size, m3526H);
                    component = m3526H.getComponent();
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(m3527G2);
        }
        m3023s();
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = AbstractC0472e.f2456a;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 16) {
                startActivities(intentArr, null);
            } else {
                startActivities(intentArr);
            }
            try {
                if (i3 >= 16) {
                    finishAffinity();
                } else {
                    finish();
                }
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflater$Factory2C0120p0) m3026p()).m3031z();
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = (LayoutInflater$Factory2C0120p0) m3026p();
        layoutInflater$Factory2C0120p0.m3049F();
        AbstractC0091c abstractC0091c = layoutInflater$Factory2C0120p0.f1073p;
        if (abstractC0091c != null) {
            ((C0096d1) abstractC0091c).f904w = true;
        }
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onStart() {
        super.onStart();
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = (LayoutInflater$Factory2C0120p0) m3026p();
        layoutInflater$Factory2C0120p0.f1052S = true;
        layoutInflater$Factory2C0120p0.mo3015d();
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onStop() {
        super.onStop();
        m3026p().mo3010i();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m3026p().mo3003p(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        m3025q();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public AbstractC0131v m3026p() {
        if (this.f1090n == null) {
            int i = AbstractC0131v.f1100b;
            this.f1090n = new LayoutInflater$Factory2C0120p0(this, null, this, this);
        }
        return this.f1090n;
    }

    /* renamed from: q */
    public AbstractC0091c m3025q() {
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = (LayoutInflater$Factory2C0120p0) m3026p();
        layoutInflater$Factory2C0120p0.m3049F();
        return layoutInflater$Factory2C0120p0.f1073p;
    }

    /* renamed from: r */
    public void m3024r() {
    }

    /* renamed from: s */
    public void m3023s() {
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void setContentView(int i) {
        m3027k();
        m3026p().mo3007l(i);
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void setContentView(View view) {
        m3027k();
        m3026p().mo3006m(view);
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3027k();
        m3026p().mo3005n(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflater$Factory2C0120p0) m3026p()).f1055V = i;
    }
}