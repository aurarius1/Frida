package com.anysoftkeyboard.ime;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.preference.PreferenceManager;
import com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.Locale;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p128x.C1560c2;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardRxPrefs extends AnySoftKeyboardDialogProvider {

    /* renamed from: m */
    public C1151a0 f6370m;

    /* renamed from: o */
    public SharedPreferences f6372o;

    /* renamed from: q */
    public boolean f6374q;

    /* renamed from: r */
    public boolean f6375r;

    /* renamed from: s */
    public boolean f6376s;

    /* renamed from: t */
    public boolean f6377t;

    /* renamed from: u */
    public boolean f6378u;

    /* renamed from: v */
    public boolean f6379v;

    /* renamed from: w */
    public int f6380w;

    /* renamed from: x */
    public int f6381x;

    /* renamed from: y */
    public boolean f6382y;

    /* renamed from: n */
    public final C2111b f6371n = new C2111b();

    /* renamed from: p */
    public final SharedPreferences.OnSharedPreferenceChangeListener f6373p = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: c.b.x.n0
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            AnySoftKeyboardRxPrefs.this.mo469G(str);
        }
    };

    /* renamed from: G */
    public void mo469G(String str) {
        if (str.equals("zoom_factor_keys_in_portrait") || str.equals("zoom_factor_keys_in_landscape") || str.equals(getString(R.string.settings_key_smiley_icon_on_smileys_key)) || str.equals(getString(R.string.settings_key_always_hide_language_key)) || str.startsWith("keyboard_") || str.startsWith("quick_text_") || str.startsWith("ext_kbd_enabled_3_") || str.startsWith("ext_kbd_enabled_1_") || str.startsWith("ext_kbd_enabled_2_")) {
            mo434B();
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6370m = AnyApplication.m182t(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f6372o = defaultSharedPreferences;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.f6373p);
        AbstractC2094b abstractC2094b = ((C1785g) this.f6370m.m1170c(R.string.settings_key_force_locale, R.string.settings_default_force_locale_setting)).f5459e;
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.x.l0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                Context applicationContext = AnySoftKeyboardRxPrefs.this.getApplicationContext();
                Locale m1259t = AbstractC1077v0.m1259t((String) obj);
                Configuration configuration = applicationContext.getResources().getConfiguration();
                if (Build.VERSION.SDK_INT >= 17) {
                    configuration.setLocale(m1259t);
                } else {
                    configuration.locale = m1259t;
                }
                applicationContext.getResources().updateConfiguration(configuration, null);
            }
        };
        C1215b c1215b = new C1215b("settings_key_force_locale");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        this.f6371n.mo117c(abstractC2094b.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_auto_space, R.bool.settings_default_auto_space)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.h0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6374q = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_auto_space"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_hide_soft_when_physical, R.bool.settings_default_hide_soft_when_physical)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.k0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6375r = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_hide_soft_when_physical"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_landscape_fullscreen, R.bool.settings_default_landscape_fullscreen)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.p0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6376s = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_landscape_fullscreen"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_portrait_fullscreen, R.bool.settings_default_portrait_fullscreen)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.f0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6377t = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_portrait_fullscreen"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_switch_keyboard_on_space, R.bool.settings_default_switch_to_alphabet_on_space)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.g0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6378u = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_switch_keyboard_on_space"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_double_space_to_period, R.bool.settings_default_double_space_to_period)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.j0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6379v = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_double_space_to_period"), interfaceC2119a, interfaceC2123e2));
        AbstractC2094b abstractC2094b2 = ((C1785g) this.f6370m.m1170c(R.string.settings_key_multitap_timeout, R.string.settings_default_multitap_timeout)).f5459e;
        C1560c2 c1560c2 = new InterfaceC2127i() { // from class: c.b.x.c2
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        };
        this.f6371n.mo117c(abstractC2094b2.m172F(c1560c2).m164N(new InterfaceC2123e() { // from class: c.b.x.i0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6380w = ((Integer) obj).intValue();
            }
        }, new C1215b("settings_key_multitap_timeout"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_bool_should_swap_punctuation_and_space, R.bool.settings_default_bool_should_swap_punctuation_and_space)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.o0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6382y = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_bool_should_swap_punctuation_and_space"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1170c(R.string.settings_key_long_press_timeout, R.string.settings_default_long_press_timeout)).f5459e.m172F(c1560c2).m164N(new InterfaceC2123e() { // from class: c.b.x.m0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardRxPrefs anySoftKeyboardRxPrefs = AnySoftKeyboardRxPrefs.this;
                anySoftKeyboardRxPrefs.getClass();
                anySoftKeyboardRxPrefs.f6381x = ((Integer) obj).intValue();
            }
        }, new C1215b("settings_key_long_press_timeout"), interfaceC2119a, interfaceC2123e2));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f6371n.mo35e();
        this.f6372o.unregisterOnSharedPreferenceChangeListener(this.f6373p);
    }
}