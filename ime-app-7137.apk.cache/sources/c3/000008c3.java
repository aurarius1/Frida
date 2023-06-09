package com.anysoftkeyboard.ime;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.animationAnimation$AnimationListenerC1422o;
import p093c.p097b.p100c0.EnumC1178v;
import p093c.p097b.p105f0.C1215b;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardSwipeListener extends AnySoftKeyboardPopText {

    /* renamed from: A0 */
    public static final /* synthetic */ int f6410A0 = 0;

    /* renamed from: B0 */
    public int f6411B0;

    /* renamed from: C0 */
    public animationAnimation$AnimationListenerC1422o f6412C0;

    /* renamed from: D0 */
    public int f6413D0;

    /* renamed from: E0 */
    public int f6414E0;

    /* renamed from: F0 */
    public int f6415F0;

    /* renamed from: G0 */
    public int f6416G0;

    /* renamed from: H0 */
    public int f6417H0;

    /* renamed from: I0 */
    public int f6418I0;

    /* renamed from: J0 */
    public int f6419J0;

    /* renamed from: K0 */
    public int f6420K0;

    /* renamed from: L0 */
    public int f6421L0;

    /* renamed from: M0 */
    public int f6422M0;

    /* renamed from: N0 */
    public int f6423N0;

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: g */
    public void mo445g(int i) {
        this.f6411B0 = i;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: j */
    public void mo444j() {
        int i = this.f6423N0;
        if (i != 0) {
            mo379s(i, null, -1, new int[]{i}, false);
        }
    }

    /* renamed from: j0 */
    public final void m443j0(int i, int i2, InterfaceC2123e interfaceC2123e) {
        this.f6371n.mo117c(((C1785g) this.f6370m.m1170c(i, i2)).f5459e.m172F(new InterfaceC2127i() { // from class: c.b.x.o1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                char c;
                String str = (String) obj;
                int i3 = AnySoftKeyboardSwipeListener.f6410A0;
                str.hashCode();
                int i4 = 0;
                switch (str.hashCode()) {
                    case -1775568652:
                        if (str.equals("compact_to_right")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1570213909:
                        if (str.equals("cursor_down")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1569985712:
                        if (str.equals("cursor_left")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1419255821:
                        if (str.equals("cursor_right")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1252211880:
                        if (str.equals("clear_input")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1085220362:
                        if (str.equals("reverse_cycle_keyboards")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -911485766:
                        if (str.equals("next_inside_mode")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -801331951:
                        if (str.equals("merge_layout")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -492581745:
                        if (str.equals("next_symbols")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -449465040:
                        if (str.equals("switch_keyboard_mode")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -381940753:
                        if (str.equals("split_layout")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -196006353:
                        if (str.equals("compact_to_left")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3202370:
                        if (str.equals("hide")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 93271379:
                        if (str.equals("cycle_keyboards")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 109407362:
                        if (str.equals("shift")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109637894:
                        if (str.equals("space")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 695572516:
                        if (str.equals("cursor_up")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1274342746:
                        if (str.equals("utility_keyboard")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1353507967:
                        if (str.equals("backspace")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2042375743:
                        if (str.equals("next_alphabet")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2121990257:
                        if (str.equals("backword")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i4 = -113;
                        break;
                    case 1:
                        i4 = -23;
                        break;
                    case 2:
                        i4 = -20;
                        break;
                    case 3:
                        i4 = -21;
                        break;
                    case 4:
                        i4 = -13;
                        break;
                    case 5:
                        i4 = -96;
                        break;
                    case 6:
                        i4 = -95;
                        break;
                    case 7:
                        i4 = -111;
                        break;
                    case '\b':
                        i4 = -2;
                        break;
                    case '\t':
                        i4 = -94;
                        break;
                    case '\n':
                        i4 = -110;
                        break;
                    case 11:
                        i4 = -112;
                        break;
                    case '\f':
                        i4 = -3;
                        break;
                    case '\r':
                        i4 = -97;
                        break;
                    case 14:
                        i4 = -1;
                        break;
                    case 15:
                        i4 = 32;
                        break;
                    case 16:
                        i4 = -22;
                        break;
                    case 17:
                        i4 = -120;
                        break;
                    case 18:
                        i4 = -5;
                        break;
                    case 19:
                        i4 = -99;
                        break;
                    case 20:
                        i4 = -7;
                        break;
                }
                return Integer.valueOf(i4);
            }
        }).m164N(interfaceC2123e, new C1215b("getIntFromSwipeConfiguration"), AbstractC2146l.f7038c, AbstractC2146l.f7039d));
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: l */
    public void mo442l() {
        int i = this.f6422M0;
        if (i != 0) {
            mo379s(i, null, -1, new int[]{i}, false);
        }
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: m */
    public void mo441m() {
        int i = this.f6415F0;
        if (i != 0) {
            mo379s(i, null, -1, new int[]{i}, false);
        }
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: o */
    public void mo440o(boolean z) {
        int i = this.f6411B0;
        int i2 = i == -5 ? -7 : i == 32 ? this.f6418I0 : z ? this.f6420K0 : this.f6416G0;
        if (i2 != 0) {
            this.f6412C0.m1066a(2, i2);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6412C0 = new animationAnimation$AnimationListenerC1422o(this);
        this.f6371n.mo117c(EnumC1178v.m1160a(this).m164N(new InterfaceC2123e() { // from class: c.b.x.c1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                EnumC1178v enumC1178v = (EnumC1178v) obj;
                animationAnimation$AnimationListenerC1422o animationanimation_animationlistenerc1422o = AnySoftKeyboardSwipeListener.this.f6412C0;
                boolean z = enumC1178v == EnumC1178v.Full;
                animationanimation_animationlistenerc1422o.getClass();
                if (z && animationanimation_animationlistenerc1422o.f4692c == null) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(animationanimation_animationlistenerc1422o.f4691b, R.anim.layout_switch_fadeout);
                    animationanimation_animationlistenerc1422o.f4692c = loadAnimation;
                    loadAnimation.setAnimationListener(animationanimation_animationlistenerc1422o);
                    animationanimation_animationlistenerc1422o.f4693d = AnimationUtils.loadAnimation(animationanimation_animationlistenerc1422o.f4691b, R.anim.layout_switch_fadein);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(animationanimation_animationlistenerc1422o.f4691b, R.anim.layout_switch_slide_out_left);
                    animationanimation_animationlistenerc1422o.f4694e = loadAnimation2;
                    loadAnimation2.setAnimationListener(animationanimation_animationlistenerc1422o);
                    animationanimation_animationlistenerc1422o.f4695f = AnimationUtils.loadAnimation(animationanimation_animationlistenerc1422o.f4691b, R.anim.layout_switch_slide_in_right);
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(animationanimation_animationlistenerc1422o.f4691b, R.anim.layout_switch_slide_out_right);
                    animationanimation_animationlistenerc1422o.f4696g = loadAnimation3;
                    loadAnimation3.setAnimationListener(animationanimation_animationlistenerc1422o);
                    animationanimation_animationlistenerc1422o.f4697h = AnimationUtils.loadAnimation(animationanimation_animationlistenerc1422o.f4691b, R.anim.layout_switch_slide_in_left);
                } else if (z || animationanimation_animationlistenerc1422o.f4692c == null) {
                } else {
                    animationanimation_animationlistenerc1422o.f4692c = null;
                    animationanimation_animationlistenerc1422o.f4693d = null;
                    animationanimation_animationlistenerc1422o.f4694e = null;
                    animationanimation_animationlistenerc1422o.f4695f = null;
                    animationanimation_animationlistenerc1422o.f4696g = null;
                    animationanimation_animationlistenerc1422o.f4697h = null;
                }
            }
        }, new C1215b("mSwitchAnimator.setAnimations"), AbstractC2146l.f7038c, AbstractC2146l.f7039d));
        m443j0(R.string.settings_key_swipe_up_action, R.string.swipe_action_value_shift, new InterfaceC2123e() { // from class: c.b.x.k1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6413D0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_swipe_up_from_spacebar_action, R.string.swipe_action_value_utility_keyboard, new InterfaceC2123e() { // from class: c.b.x.h1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6414E0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_swipe_down_action, R.string.swipe_action_value_hide, new InterfaceC2123e() { // from class: c.b.x.j1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6415F0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_swipe_left_action, R.string.swipe_action_value_next_symbols, new InterfaceC2123e() { // from class: c.b.x.l1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6416G0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_swipe_right_action, R.string.swipe_action_value_next_alphabet, new InterfaceC2123e() { // from class: c.b.x.g1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6417H0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_pinch_gesture_action, R.string.swipe_action_value_merge_layout, new InterfaceC2123e() { // from class: c.b.x.d1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6422M0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_separate_gesture_action, R.string.swipe_action_value_split_layout, new InterfaceC2123e() { // from class: c.b.x.i1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6423N0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_swipe_left_space_bar_action, R.string.swipe_action_value_next_symbols, new InterfaceC2123e() { // from class: c.b.x.m1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6418I0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_swipe_right_space_bar_action, R.string.swipe_action_value_next_alphabet, new InterfaceC2123e() { // from class: c.b.x.e1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6419J0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_swipe_left_two_fingers_action, R.string.swipe_action_value_compact_layout_to_left, new InterfaceC2123e() { // from class: c.b.x.n1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6420K0 = ((Integer) obj).intValue();
            }
        });
        m443j0(R.string.settings_key_swipe_right_two_fingers_action, R.string.swipe_action_value_compact_layout_to_right, new InterfaceC2123e() { // from class: c.b.x.f1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSwipeListener anySoftKeyboardSwipeListener = AnySoftKeyboardSwipeListener.this;
                anySoftKeyboardSwipeListener.getClass();
                anySoftKeyboardSwipeListener.f6421L0 = ((Integer) obj).intValue();
            }
        });
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        animationAnimation$AnimationListenerC1422o animationanimation_animationlistenerc1422o = this.f6412C0;
        animationanimation_animationlistenerc1422o.f4692c = null;
        animationanimation_animationlistenerc1422o.f4693d = null;
        animationanimation_animationlistenerc1422o.f4694e = null;
        animationanimation_animationlistenerc1422o.f4695f = null;
        animationanimation_animationlistenerc1422o.f4696g = null;
        animationanimation_animationlistenerc1422o.f4697h = null;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: q */
    public void mo439q() {
        int i = this.f6411B0 == 32 ? this.f6414E0 : this.f6413D0;
        if (i != 0) {
            mo379s(i, null, -1, new int[]{i}, false);
        }
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: r */
    public void mo438r(boolean z) {
        int i = this.f6411B0;
        int i2 = i == -5 ? -7 : i == 32 ? this.f6419J0 : z ? this.f6421L0 : this.f6417H0;
        if (i2 != 0) {
            this.f6412C0.m1066a(3, i2);
        }
    }
}