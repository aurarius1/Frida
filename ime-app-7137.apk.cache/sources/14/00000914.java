package com.menny.android.anysoftkeyboard;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.multidex.MultiDexApplication;
import com.anysoftkeyboard.AnySoftKeyboard;
import com.menny.android.anysoftkeyboard.AnyApplication;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010b.p016c.p017k.AbstractC0131v;
import p010b.p046j.p057k.C0561b;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p100c0.C1179w;
import p093c.p097b.p102d0.C1189f;
import p093c.p097b.p107h0.C1238g;
import p093c.p097b.p116p.AbstractC1432j;
import p093c.p097b.p117q.AbstractC1438d;
import p093c.p097b.p119s.p120b.AbstractC1442b;
import p093c.p097b.p119s.p120b.C1443c;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p121t.C1451h;
import p093c.p097b.p121t.C1452i;
import p093c.p097b.p121t.C1453j;
import p093c.p097b.p121t.C1454k;
import p093c.p097b.p121t.C1455l;
import p093c.p097b.p121t.C1456m;
import p093c.p097b.p122u.C1475h0;
import p093c.p097b.p129y.C1657b;
import p093c.p097b.p130z.C1679k0;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p176h.p177a.p178a.C2067e;
import p093c.p176h.p177a.p178a.C2070h;
import p093c.p176h.p177a.p178a.C2072j;
import p093c.p176h.p177a.p178a.C2073k;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2120b;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p203s.AbstractC2285j;
import p183e.p184a.p203s.C2283h;
import p183e.p184a.p203s.C2284i;

/* loaded from: classes.dex */
public class AnyApplication extends MultiDexApplication {

    /* renamed from: b */
    public static C1450g f6979b;

    /* renamed from: c */
    public final C2111b f6980c = new C2111b();

    /* renamed from: d */
    public final AbstractC2285j f6981d = new C2284i(new C2283h(1));

    /* renamed from: e */
    public C1679k0 f6982e;

    /* renamed from: f */
    public C1475h0 f6983f;

    /* renamed from: g */
    public C1657b f6984g;

    /* renamed from: h */
    public C1657b f6985h;

    /* renamed from: i */
    public C1657b f6986i;

    /* renamed from: j */
    public C1238g f6987j;

    /* renamed from: k */
    public C1189f f6988k;

    /* renamed from: l */
    public C1151a0 f6989l;

    /* renamed from: m */
    public ArrayList f6990m;

    /* renamed from: b */
    public static C1450g m200b(int i) {
        return i < 16 ? new C1450g() : i < 19 ? new C1451h() : i < 24 ? new C1452i() : i < 26 ? new C1453j() : i < 28 ? new C1454k() : i < 29 ? new C1455l() : new C1456m();
    }

    /* renamed from: i */
    public static C1657b m193i(Context context) {
        return ((AnyApplication) context.getApplicationContext()).f6984g;
    }

    /* renamed from: j */
    public static C1475h0 m192j(Context context) {
        return ((AnyApplication) context.getApplicationContext()).f6983f;
    }

    /* renamed from: k */
    public static C1679k0 m191k(Context context) {
        return ((AnyApplication) context.getApplicationContext()).f6982e;
    }

    /* renamed from: l */
    public static C1238g m190l(Context context) {
        return ((AnyApplication) context.getApplicationContext()).f6987j;
    }

    /* renamed from: m */
    public static C1189f m189m(Context context) {
        return ((AnyApplication) context.getApplicationContext()).f6988k;
    }

    /* renamed from: n */
    public static C1657b m188n(Context context) {
        return ((AnyApplication) context.getApplicationContext()).f6985h;
    }

    /* JADX DEBUG: Method merged with bridge method */
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m186p(Boolean bool) {
        getPackageManager().setComponentEnabledSetting(new ComponentName(getApplicationContext(), LauncherSettingsActivity.class), bool.booleanValue() ? 1 : 2, 1);
    }

    /* JADX DEBUG: Method merged with bridge method */
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m184r(C1179w c1179w) {
        getString(c1179w.f4309b);
    }

    /* renamed from: t */
    public static C1151a0 m182t(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof AnyApplication) {
            return ((AnyApplication) applicationContext).f6989l;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("What? expected 'context.getApplicationContext()' to be AnyApplication, but was '");
        m1187i.append(applicationContext.getClass());
        m1187i.append("'!!");
        throw new IllegalStateException(m1187i.toString());
    }

    /* renamed from: a */
    public C1657b m201a() {
        return new C1657b(this, R.string.settings_default_ext_kbd_bottom_row_key, "ext_kbd_enabled_1_", 1);
    }

    /* renamed from: c */
    public C1475h0 m199c() {
        return new C1475h0(this);
    }

    /* renamed from: d */
    public C1679k0 m198d() {
        return new C1679k0(this);
    }

    /* renamed from: e */
    public C1238g m197e() {
        return new C1238g(this);
    }

    /* renamed from: f */
    public C1189f m196f() {
        return new C1189f(this);
    }

    /* renamed from: g */
    public C1657b m195g() {
        return new C1657b(this, R.string.settings_default_ext_keyboard_key, "ext_kbd_enabled_3_", 3);
    }

    /* renamed from: h */
    public C1657b m194h() {
        return new C1657b(this, R.string.settings_default_top_row_key, "ext_kbd_enabled_2_", 2);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6981d.mo25g(Boolean.valueOf((configuration.uiMode & 48) == 32));
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        m180v(defaultSharedPreferences);
        C1450g m200b = m200b(Build.VERSION.SDK_INT);
        f6979b = m200b;
        m200b.mo1022f();
        f6979b.getClass().getName();
        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this);
        boolean z = !defaultSharedPreferences2.contains("settings_key_first_app_version_installed");
        boolean z2 = defaultSharedPreferences2.getInt("settings_key_last_app_version_installed", 0) != 7137;
        if (z || z2) {
            SharedPreferences.Editor edit = defaultSharedPreferences2.edit();
            long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                edit.putInt("settings_key_first_app_version_installed", 7137);
                edit.putLong("settings_key_first_time_app_installed", currentTimeMillis);
            }
            if (z2) {
                edit.putInt("settings_key_last_app_version_installed", 7137);
                edit.putLong("settings_key_first_time_current_version_installed", currentTimeMillis);
            }
            edit.apply();
        }
        this.f6989l = new C1151a0(this, defaultSharedPreferences, new C2067e(this));
        this.f6982e = m198d();
        this.f6983f = m199c();
        this.f6984g = m201a();
        this.f6985h = m194h();
        this.f6986i = m195g();
        this.f6987j = m197e();
        this.f6988k = m196f();
        getApplicationContext();
        this.f6980c.mo117c(((C1785g) this.f6989l.m1172a(R.string.settings_key_show_settings_app, R.bool.settings_default_show_settings_app)).m810a().m167K(new InterfaceC2123e() { // from class: c.h.a.a.g
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyApplication.this.m186p((Boolean) obj);
            }
        }));
        this.f6980c.mo117c(AbstractC1438d.m1045e(this, R.string.settings_key_night_mode_app_theme_control, R.bool.settings_default_true).m167K(new InterfaceC2123e() { // from class: c.h.a.a.b
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1450g c1450g = AnyApplication.f6979b;
                AbstractC0131v.m3004o(((Boolean) obj).booleanValue() ? 2 : 1);
            }
        }));
        this.f6981d.mo25g(Boolean.valueOf((getResources().getConfiguration().uiMode & 48) == 32));
        ArrayList arrayList = new ArrayList(AbstractC1438d.m1048b());
        this.f6990m = arrayList;
        arrayList.addAll(Collections.emptyList());
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        this.f6981d.mo26d();
    }

    /* renamed from: s */
    public void m183s(Intent intent, AnySoftKeyboard anySoftKeyboard) {
        anySoftKeyboard.getClass();
        AbstractC1432j.m1052o(intent, new C2070h(anySoftKeyboard), this.f6985h, this.f6984g, this.f6986i, this.f6983f, this.f6982e, this.f6987j, this.f6988k);
    }

    /* renamed from: u */
    public final void m181u(File file) {
        file.getAbsolutePath();
        AbstractC1438d.m1043g((C0561b) AbstractC2094b.m174D(AbstractC1438d.m1046d(this)).m172F(new InterfaceC2127i() { // from class: c.h.a.a.c
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C1450g c1450g = AnyApplication.f6979b;
                return C0561b.m2332a((C1179w) obj, Boolean.TRUE);
            }
        }).m153l(C0561b.m2332a(new ArrayList(), new ArrayList()), new InterfaceC2120b() { // from class: c.h.a.a.d
            @Override // p183e.p184a.p189o.InterfaceC2120b
            /* renamed from: a */
            public final void mo128a(Object obj, Object obj2) {
                C0561b c0561b = (C0561b) obj;
                C0561b c0561b2 = (C0561b) obj2;
                C1450g c1450g = AnyApplication.f6979b;
                ((ArrayList) c0561b.f2654a).add((C1179w) c0561b2.f2654a);
                ((ArrayList) c0561b.f2655b).add((Boolean) c0561b2.f2655b);
            }
        }).m135b(new InterfaceC2127i() { // from class: c.h.a.a.a
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C0561b c0561b = (C0561b) obj;
                C1450g c1450g = AnyApplication.f6979b;
                return C0561b.m2332a((List) c0561b.f2654a, (Boolean[]) ((ArrayList) c0561b.f2655b).toArray(new Boolean[0]));
            }
        }).m136a(), file).m159e(new InterfaceC2123e() { // from class: c.h.a.a.f
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyApplication.this.m184r((C1179w) obj);
            }
        });
    }

    /* renamed from: v */
    public void m180v(SharedPreferences sharedPreferences) {
        C2072j c2072j = new C2072j(null);
        AbstractC1438d.m1041i(c2072j);
        Thread.setDefaultUncaughtExceptionHandler(c2072j);
        Resources resources = getResources();
        if (sharedPreferences.getBoolean(resources.getString(R.string.settings_key_show_chewbacca), resources.getBoolean(R.bool.settings_default_show_chewbacca))) {
            C2073k c2073k = new C2073k(this, c2072j);
            Thread.setDefaultUncaughtExceptionHandler(c2073k);
            AbstractC1438d.m1041i(c2073k);
        }
        AbstractC1442b.m1031d(new C1443c());
    }
}