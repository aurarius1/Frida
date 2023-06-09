package p093c.p097b.p100c0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.menny.android.anysoftkeyboard.AnyApplication;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p010b.p046j.p047d.AbstractC0472e;
import p093c.p097b.p121t.C1450g;
import p093c.p137d.p138a.p139a.C1779a;
import p093c.p137d.p138a.p139a.C1780b;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p137d.p138a.p139a.C1789k;
import p093c.p137d.p138a.p139a.C1791m;
import p093c.p137d.p138a.p139a.InterfaceC1781c;
import p093c.p176h.p177a.p178a.C2067e;
import p183e.p184a.p189o.InterfaceC2123e;

/* renamed from: c.b.c0.a0 */
/* loaded from: classes.dex */
public class C1151a0 {

    /* renamed from: a */
    public final Resources f4273a;

    /* renamed from: b */
    public final C1789k f4274b;

    public C1151a0(Context context, SharedPreferences sharedPreferences, InterfaceC2123e interfaceC2123e) {
        this.f4273a = context.getResources();
        if (AbstractC0472e.m2432a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            File file = new File(context.getExternalFilesDir(null), "STARTUP_PREFS_APPLY.xml");
            if (file.isFile()) {
                file.getAbsolutePath();
                try {
                    AnyApplication anyApplication = ((C2067e) interfaceC2123e).f6253b;
                    C1450g c1450g = AnyApplication.f6979b;
                    anyApplication.m181u(file);
                    file.getAbsolutePath();
                    File file2 = new File(file.getParent(), "STARTUP_PREFS_APPLIED_[DATETIME].xml".replace("[DATETIME]", DateFormat.format("yyyy-MM-dd__HH_mm_ss_zzz", Calendar.getInstance())));
                    file.getAbsolutePath();
                    file2.getAbsolutePath();
                    file.renameTo(file2.getAbsoluteFile());
                } catch (Exception unused) {
                }
            }
            file.getAbsolutePath();
        }
        m1168e(sharedPreferences);
        this.f4274b = new C1789k(sharedPreferences);
    }

    /* renamed from: e */
    public static void m1168e(SharedPreferences sharedPreferences) {
        String[] split;
        int i = sharedPreferences.getInt("configurationVersion", 12);
        if (i < 12) {
            Map<String, ?> all = sharedPreferences.getAll();
            if (!all.containsKey("settings_key_always_use_fallback_user_dictionary")) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("settings_key_always_use_fallback_user_dictionary", false);
                edit.apply();
            }
            if (all.containsKey("vibrate_on_key_press_duration")) {
                try {
                    int parseInt = Integer.parseInt(sharedPreferences.getString("vibrate_on_key_press_duration", "0"));
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("settings_key_vibrate_on_key_press_duration_int", parseInt);
                    edit2.remove("vibrate_on_key_press_duration");
                    edit2.apply();
                } catch (Exception unused) {
                }
            }
        }
        if (i < 11) {
            SharedPreferences.Editor edit3 = sharedPreferences.edit();
            Map<String, ?> all2 = sharedPreferences.getAll();
            if (all2.containsKey("settings_key_ordered_active_quick_text_keys")) {
                String obj = all2.get("settings_key_ordered_active_quick_text_keys").toString();
                edit3.putString("quick_text_AddOnsFactory_order_key", obj);
                for (String str : obj.split(",", -1)) {
                    edit3.putBoolean("quick_text_" + str, true);
                }
            }
            if (all2.containsKey("settings_key_keyboard_theme_key")) {
                edit3.putBoolean("theme_" + all2.get("settings_key_keyboard_theme_key").toString(), true);
            }
            if (all2.containsKey("settings_key_ext_kbd_bottom_row_key")) {
                edit3.putBoolean("ext_kbd_enabled_1_" + all2.get("settings_key_ext_kbd_bottom_row_key").toString(), true);
            }
            if (all2.containsKey("settings_key_ext_kbd_top_row_key")) {
                edit3.putBoolean("ext_kbd_enabled_2_" + all2.get("settings_key_ext_kbd_top_row_key").toString(), true);
            }
            if (all2.containsKey("settings_key_ext_kbd_ext_ketboard_key")) {
                edit3.putBoolean("ext_kbd_enabled_3_" + all2.get("settings_key_ext_kbd_ext_ketboard_key").toString(), true);
            }
            edit3.apply();
        }
        SharedPreferences.Editor edit4 = sharedPreferences.edit();
        edit4.putInt("configurationVersion", 12);
        edit4.apply();
    }

    /* renamed from: a */
    public InterfaceC1781c m1172a(int i, int i2) {
        C1789k c1789k = this.f4274b;
        String string = this.f4273a.getString(i);
        Boolean valueOf = Boolean.valueOf(this.f4273a.getBoolean(i2));
        if (string != null) {
            if (valueOf != null) {
                return new C1785g(c1789k.f5464a, string, valueOf, C1779a.f5451a, c1789k.f5465b);
            }
            throw new NullPointerException("defaultValue == null");
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public InterfaceC1781c m1171b(int i, int i2) {
        String string = this.f4273a.getString(i);
        C1789k c1789k = this.f4274b;
        Integer valueOf = Integer.valueOf(this.f4273a.getInteger(i2));
        if (string != null) {
            if (valueOf != null) {
                return new C1785g(c1789k.f5464a, string, valueOf, C1780b.f5452a, c1789k.f5465b);
            }
            throw new NullPointerException("defaultValue == null");
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: c */
    public InterfaceC1781c m1170c(int i, int i2) {
        return this.f4274b.m807a(this.f4273a.getString(i), this.f4273a.getString(i2));
    }

    /* renamed from: d */
    public InterfaceC1781c m1169d(int i) {
        C1789k c1789k = this.f4274b;
        String string = this.f4273a.getString(i);
        c1789k.getClass();
        Set emptySet = Collections.emptySet();
        if (string != null) {
            if (emptySet != null) {
                return new C1785g(c1789k.f5464a, string, emptySet, C1791m.f5467a, c1789k.f5465b);
            }
            throw new NullPointerException("defaultValue == null");
        }
        throw new NullPointerException("key == null");
    }
}