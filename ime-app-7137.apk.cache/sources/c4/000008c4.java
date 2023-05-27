package com.anysoftkeyboard.ime;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay;
import com.anysoftkeyboard.keyboards.views.KeyboardViewContainerView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p082t.C0875i0;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p099b0.C1144g;
import p093c.p097b.p099b0.InterfaceC1141d;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p107h0.C1238g;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p128x.C1614p1;
import p093c.p097b.p128x.C1651y2;
import p093c.p097b.p128x.C1655z2;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2095c;
import p183e.p184a.InterfaceC2096d;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2122d;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p189o.InterfaceC2128j;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p183e.p184a.p190p.p195e.p196a.C2195l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardThemeOverlay extends AnySoftKeyboardKeyboardTagsSearcher {

    /* renamed from: l0 */
    public static final C1138a f6424l0 = new C1655z2(null);

    /* renamed from: m0 */
    public InterfaceC1141d f6425m0;

    /* renamed from: o0 */
    public C1237f f6427o0;

    /* renamed from: p0 */
    public boolean f6428p0;

    /* renamed from: n0 */
    public String f6426n0 = "";

    /* renamed from: q0 */
    public C1138a f6429q0 = f6424l0;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: B */
    public void mo434B() {
        this.f6426n0 = "";
        super.mo434B();
    }

    /* renamed from: f0 */
    public void m437f0(EditorInfo editorInfo) {
        Intent launchIntentForPackage = editorInfo.packageName == null ? null : getPackageManager().getLaunchIntentForPackage(editorInfo.packageName);
        if (launchIntentForPackage != null) {
            this.f6429q0 = this.f6425m0.mo937a(launchIntentForPackage.getComponent());
        } else {
            this.f6429q0 = f6424l0;
            this.f6426n0 = "";
        }
        KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
        if (keyboardViewContainerView != null) {
            keyboardViewContainerView.setThemeOverlay(this.f6429q0);
        }
    }

    /* renamed from: g0 */
    public InterfaceC1141d mo436g0() {
        return C1144g.f4258a ? new C1651y2(this) : C1614p1.f5045a;
    }

    /* renamed from: h0 */
    public void mo435h0(C1237f c1237f) {
        this.f6427o0 = c1237f;
        KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
        if (keyboardViewContainerView != null) {
            keyboardViewContainerView.setKeyboardTheme(c1237f);
            keyboardViewContainerView.setThemeOverlay(this.f6429q0);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6425m0 = mo436g0();
        final Context applicationContext = getApplicationContext();
        C1450g c1450g = AnyApplication.f6979b;
        final C1238g c1238g = ((AnyApplication) applicationContext.getApplicationContext()).f6987j;
        AbstractC2094b m143v = AbstractC2094b.m146s(new InterfaceC2096d() { // from class: c.b.h0.c
            @Override // p183e.p184a.InterfaceC2096d
            /* renamed from: a */
            public final void mo138a(final InterfaceC2095c interfaceC2095c) {
                final SharedPreferences m1746a = C0875i0.m1746a(applicationContext);
                final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: c.b.h0.e
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        ((C2195l) InterfaceC2095c.this).m92c(str);
                    }
                };
                ((C2195l) interfaceC2095c).m91d(new InterfaceC2122d() { // from class: c.b.h0.b
                    @Override // p183e.p184a.p189o.InterfaceC2122d
                    public final void cancel() {
                        m1746a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    }
                });
                m1746a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        }).m140y(new InterfaceC2128j() { // from class: c.b.h0.a
            @Override // p183e.p184a.p189o.InterfaceC2128j
            /* renamed from: a */
            public final boolean mo40a(Object obj) {
                return ((String) obj).startsWith("theme_");
            }
        }).m172F(new InterfaceC2127i() { // from class: c.b.h0.d
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                String str = (String) obj;
                return (C1237f) C1238g.this.m1058f();
            }
        }).m168J((C1237f) c1238g.m1058f()).m143v();
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.x.a2
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardThemeOverlay.this.mo435h0((C1237f) obj);
            }
        };
        C1215b c1215b = new C1215b("KeyboardThemeFactory.observeCurrentTheme");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        this.f6371n.mo117c(m143v.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_apply_remote_app_colors, R.bool.settings_default_apply_remote_app_colors)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.q1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardThemeOverlay anySoftKeyboardThemeOverlay = AnySoftKeyboardThemeOverlay.this;
                anySoftKeyboardThemeOverlay.getClass();
                anySoftKeyboardThemeOverlay.f6428p0 = ((Boolean) obj).booleanValue();
                anySoftKeyboardThemeOverlay.f6429q0 = AnySoftKeyboardThemeOverlay.f6424l0;
                anySoftKeyboardThemeOverlay.f6426n0 = "";
                anySoftKeyboardThemeOverlay.hideWindow();
            }
        }, new C1215b("settings_key_apply_remote_app_colors"), interfaceC2119a, interfaceC2123e2));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public View onCreateInputView() {
        this.f6426n0 = "";
        View onCreateInputView = super.onCreateInputView();
        KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
        keyboardViewContainerView.setKeyboardTheme(this.f6427o0);
        keyboardViewContainerView.setThemeOverlay(this.f6429q0);
        return onCreateInputView;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        super.onStartInputView(editorInfo, z);
        m437f0(editorInfo);
    }
}