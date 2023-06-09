package com.anysoftkeyboard.ime;

import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;
import com.anysoftkeyboard.keyboards.views.KeyboardViewContainerView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p100c0.EnumC1178v;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p117q.AbstractC1438d;
import p093c.p097b.p121t.C1457n;
import p093c.p097b.p128x.C1548a0;
import p093c.p097b.p128x.C1640w;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.p134b1.C1702a;
import p093c.p097b.p130z.p132r0.p134b1.C1703b;
import p093c.p097b.p130z.p132r0.p134b1.C1709h;
import p093c.p097b.p130z.p132r0.p134b1.C1710i;
import p093c.p097b.p130z.p132r0.p134b1.InterfaceC1706e;
import p093c.p097b.p130z.p132r0.p134b1.InterfaceC1711j;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p142f.p143a.p144a.C1800b;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2124f;
import p183e.p184a.p189o.InterfaceC2125g;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p183e.p184a.p203s.C2279d;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardPressEffects extends AnySoftKeyboardClipboard {

    /* renamed from: V0 */
    public static final /* synthetic */ int f6363V0 = 0;

    /* renamed from: W0 */
    public AudioManager f6364W0;

    /* renamed from: Y0 */
    public C1457n f6366Y0;

    /* renamed from: X0 */
    public float f6365X0 = 0.0f;

    /* renamed from: Z0 */
    public InterfaceC1706e f6367Z0 = new C1710i();

    /* renamed from: a1 */
    public final C2279d f6368a1 = new C2279d();

    /* renamed from: b1 */
    public final C2279d f6369b1 = new C2279d();

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: b */
    public void mo473b(Key key) {
        m470o0(key.getPrimaryCode(), true);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: c */
    public void mo450c(Key key, CharSequence charSequence) {
        super.mo450c(key, charSequence);
        m471n0(-10);
        m470o0(-10, false);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay
    /* renamed from: h0 */
    public void mo435h0(C1237f c1237f) {
        this.f6427o0 = c1237f;
        KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
        if (keyboardViewContainerView != null) {
            keyboardViewContainerView.setKeyboardTheme(c1237f);
            keyboardViewContainerView.setThemeOverlay(this.f6429q0);
        }
        this.f6368a1.mo25g(Long.valueOf(SystemClock.uptimeMillis()));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: n */
    public void mo472n(int i) {
        super.mo472n(i);
        m471n0(i);
        m470o0(i, false);
    }

    /* renamed from: n0 */
    public final void m471n0(int i) {
        int i2;
        float f = this.f6365X0;
        if (f == 0.0f || i == 0) {
            return;
        }
        if (i != -99 && i != -11) {
            if (i == 10 || i == 13) {
                i2 = 8;
            } else if (i == 32) {
                i2 = 6;
            } else if (i != -95 && i != -94 && i != -15 && i != -14 && i != -6) {
                if (i == -5) {
                    i2 = 7;
                } else if (i != -2 && i != -1) {
                    i2 = 5;
                }
            }
            this.f6364W0.playSoundEffect(i2, f);
        }
        i2 = 0;
        this.f6364W0.playSoundEffect(i2, f);
    }

    /* renamed from: o0 */
    public final void m470o0(int i, boolean z) {
        if (i != 0) {
            try {
                this.f6366Y0.mo1021d(z);
            } catch (Exception unused) {
                this.f6366Y0.mo1018c(false);
                this.f6366Y0.mo1020a(0);
                this.f6366Y0.mo1019b(0);
            }
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6364W0 = (AudioManager) getSystemService("audio");
        this.f6366Y0 = AnyApplication.f6979b.mo1023d((Vibrator) getSystemService("vibrator"));
        AbstractC2094b m1295I = AbstractC1077v0.m1295I(getApplicationContext(), R.string.settings_key_power_save_mode_sound_control);
        AbstractC2094b m1045e = AbstractC1438d.m1045e(getApplicationContext(), R.string.settings_key_night_mode_sound_control, R.bool.settings_default_true);
        AbstractC2094b m168J = new C1800b(getApplicationContext(), new IntentFilter("android.media.RINGER_MODE_CHANGED")).m168J(new Intent());
        AbstractC2094b abstractC2094b = ((C1785g) this.f6370m.m1172a(R.string.settings_key_sound_on, R.bool.settings_default_sound_on)).f5459e;
        AbstractC2094b abstractC2094b2 = ((C1785g) this.f6370m.m1172a(R.string.settings_key_use_custom_sound_volume, R.bool.settings_default_false)).f5459e;
        AbstractC2094b abstractC2094b3 = ((C1785g) this.f6370m.m1171b(R.string.settings_key_custom_sound_volume, R.integer.settings_default_zero_value)).f5459e;
        C1548a0 c1548a0 = new C1548a0(this);
        if (abstractC2094b == null) {
            throw new NullPointerException("source4 is null");
        }
        if (abstractC2094b2 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (abstractC2094b3 != null) {
            AbstractC2094b m149p = AbstractC2094b.m149p(AbstractC2146l.m111f(c1548a0), AbstractC2094b.m155j(), m1295I, m1045e, m168J, abstractC2094b, abstractC2094b2, abstractC2094b3);
            InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.x.e0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AnySoftKeyboardPressEffects anySoftKeyboardPressEffects = AnySoftKeyboardPressEffects.this;
                    Float f = (Float) obj;
                    if (anySoftKeyboardPressEffects.f6365X0 != f.floatValue()) {
                        if (f.floatValue() == 0.0f) {
                            anySoftKeyboardPressEffects.f6364W0.unloadSoundEffects();
                        } else if (anySoftKeyboardPressEffects.f6365X0 == 0.0f) {
                            anySoftKeyboardPressEffects.f6364W0.loadSoundEffects();
                        }
                    }
                    anySoftKeyboardPressEffects.f6365X0 = f.floatValue();
                    anySoftKeyboardPressEffects.m471n0(32);
                }
            };
            C1640w c1640w = new InterfaceC2123e() { // from class: c.b.x.w
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    int i = AnySoftKeyboardPressEffects.f6363V0;
                }
            };
            InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
            InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
            this.f6371n.mo117c(m149p.m164N(interfaceC2123e, c1640w, interfaceC2119a, interfaceC2123e2));
            this.f6371n.mo117c(AbstractC2094b.m151n(AbstractC1077v0.m1295I(getApplicationContext(), R.string.settings_key_power_save_mode_vibration_control), AbstractC1438d.m1045e(getApplicationContext(), R.string.settings_key_night_mode_vibration_control, R.bool.settings_default_true), ((C1785g) this.f6370m.m1171b(R.string.settings_key_vibrate_on_key_press_duration_int, R.integer.settings_default_vibrate_on_key_press_duration_int)).f5459e, new InterfaceC2124f() { // from class: c.b.x.t
                @Override // p183e.p184a.p189o.InterfaceC2124f
                /* renamed from: a */
                public final Object mo126a(Object obj, Object obj2, Object obj3) {
                    Boolean bool = (Boolean) obj2;
                    Integer num = (Integer) obj3;
                    int i = AnySoftKeyboardPressEffects.f6363V0;
                    int i2 = 0;
                    if (!((Boolean) obj).booleanValue() && !bool.booleanValue()) {
                        i2 = num.intValue();
                    }
                    return Integer.valueOf(i2);
                }
            }).m164N(new InterfaceC2123e() { // from class: c.b.x.b0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AnySoftKeyboardPressEffects anySoftKeyboardPressEffects = AnySoftKeyboardPressEffects.this;
                    anySoftKeyboardPressEffects.f6366Y0.mo1020a(((Integer) obj).intValue());
                    anySoftKeyboardPressEffects.m470o0(32, false);
                }
            }, new InterfaceC2123e() { // from class: c.b.x.v
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    int i = AnySoftKeyboardPressEffects.f6363V0;
                }
            }, interfaceC2119a, interfaceC2123e2));
            this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_vibrate_on_long_press, R.bool.settings_default_vibrate_on_long_press)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.s
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AnySoftKeyboardPressEffects anySoftKeyboardPressEffects = AnySoftKeyboardPressEffects.this;
                    anySoftKeyboardPressEffects.f6366Y0.mo1019b(((Boolean) obj).booleanValue() ? 7 : 0);
                    anySoftKeyboardPressEffects.m470o0(32, true);
                }
            }, new InterfaceC2123e() { // from class: c.b.x.x
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    int i = AnySoftKeyboardPressEffects.f6363V0;
                }
            }, interfaceC2119a, interfaceC2123e2));
            this.f6371n.mo117c(AbstractC2094b.m151n(AbstractC1077v0.m1295I(getApplicationContext(), R.string.settings_key_power_save_mode_vibration_control), AbstractC1438d.m1045e(getApplicationContext(), R.string.settings_key_night_mode_vibration_control, R.bool.settings_default_true), ((C1785g) this.f6370m.m1172a(R.string.settings_key_use_system_vibration, R.bool.settings_default_use_system_vibration)).f5459e, new InterfaceC2124f() { // from class: c.b.x.y
                @Override // p183e.p184a.p189o.InterfaceC2124f
                /* renamed from: a */
                public final Object mo126a(Object obj, Object obj2, Object obj3) {
                    Boolean bool = (Boolean) obj2;
                    Boolean bool2 = (Boolean) obj3;
                    int i = AnySoftKeyboardPressEffects.f6363V0;
                    return Boolean.valueOf((((Boolean) obj).booleanValue() || bool.booleanValue() || !bool2.booleanValue()) ? false : true);
                }
            }).m164N(new InterfaceC2123e() { // from class: c.b.x.c0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AnySoftKeyboardPressEffects anySoftKeyboardPressEffects = AnySoftKeyboardPressEffects.this;
                    anySoftKeyboardPressEffects.f6366Y0.mo1018c(((Boolean) obj).booleanValue());
                    anySoftKeyboardPressEffects.m470o0(32, false);
                }
            }, new InterfaceC2123e() { // from class: c.b.x.d0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    int i = AnySoftKeyboardPressEffects.f6363V0;
                }
            }, interfaceC2119a, interfaceC2123e2));
            this.f6371n.mo117c(AbstractC2094b.m152m(((C1785g) this.f6370m.m1172a(R.string.settings_key_key_press_shows_preview_popup, R.bool.settings_default_key_press_shows_preview_popup)).f5459e, EnumC1178v.m1160a(this), ((C1785g) this.f6370m.m1170c(R.string.settings_key_key_press_preview_popup_position, R.string.settings_default_key_press_preview_popup_position)).f5459e, this.f6368a1.m168J(0L), this.f6369b1.m168J(Boolean.FALSE).m143v(), new InterfaceC2125g() { // from class: c.b.x.z
                @Override // p183e.p184a.p189o.InterfaceC2125g
                /* renamed from: a */
                public final Object mo125a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    InterfaceC1711j c1703b;
                    int i;
                    AnySoftKeyboardPressEffects anySoftKeyboardPressEffects = AnySoftKeyboardPressEffects.this;
                    EnumC1178v enumC1178v = (EnumC1178v) obj2;
                    String str = (String) obj3;
                    Long l = (Long) obj4;
                    Boolean bool = (Boolean) obj5;
                    int i2 = AnySoftKeyboardPressEffects.f6363V0;
                    anySoftKeyboardPressEffects.getClass();
                    if (((Boolean) obj).booleanValue() && enumC1178v != EnumC1178v.None && Boolean.FALSE.equals(bool)) {
                        if ("above_key".equals(str)) {
                            c1703b = new C1702a();
                            i = anySoftKeyboardPressEffects.getResources().getInteger(R.integer.maximum_instances_of_preview_popups);
                        } else {
                            c1703b = new C1703b();
                            i = 1;
                        }
                        return new C1709h(anySoftKeyboardPressEffects, c1703b, i);
                    }
                    return new C1710i();
                }
            }).m164N(new InterfaceC2123e() { // from class: c.b.x.u
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AnySoftKeyboardPressEffects anySoftKeyboardPressEffects = AnySoftKeyboardPressEffects.this;
                    InterfaceC1706e interfaceC1706e = (InterfaceC1706e) obj;
                    InterfaceC1566d3 interfaceC1566d3 = anySoftKeyboardPressEffects.f6308d;
                    anySoftKeyboardPressEffects.f6367Z0.mo879a();
                    anySoftKeyboardPressEffects.f6367Z0 = interfaceC1706e;
                    if (interfaceC1566d3 instanceof AnyKeyboardViewBase) {
                        ((AnyKeyboardViewBase) interfaceC1566d3).setKeyPreviewController(interfaceC1706e);
                    }
                }
            }, new C1215b("key-preview-controller-setup"), interfaceC2119a, interfaceC2123e2));
            return;
        }
        throw new NullPointerException("source6 is null");
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public View onCreateInputView() {
        View onCreateInputView = super.onCreateInputView();
        this.f6368a1.mo25g(Long.valueOf(SystemClock.uptimeMillis()));
        return onCreateInputView;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f6368a1.mo26d();
        this.f6367Z0.mo879a();
        this.f6364W0.unloadSoundEffects();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        super.onStartInputView(editorInfo, z);
        C2279d c2279d = this.f6369b1;
        boolean z2 = true;
        if (!AnySoftKeyboardClipboard.m488l0(editorInfo)) {
            if (!((editorInfo.inputType & 18) == 18)) {
                z2 = false;
            }
        }
        c2279d.mo25g(Boolean.valueOf(z2));
    }
}