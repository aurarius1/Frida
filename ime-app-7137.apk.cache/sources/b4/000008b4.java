package com.anysoftkeyboard.ime;

import android.content.res.Configuration;
import android.os.Build;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p105f0.C1215b;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardColorizeNavBar extends AnySoftKeyboardIncognito {

    /* renamed from: C1 */
    public int f6322C1 = 0;

    /* renamed from: D1 */
    public int f6323D1 = 0;

    /* renamed from: E1 */
    public boolean f6324E1;

    /* renamed from: F1 */
    public int f6325F1;

    /* renamed from: A0 */
    public final void m486A0(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.clearFlags(512);
            if (i >= 30) {
                window.setDecorFitsSystemWindows(true);
            }
            this.f6307c.setBottomPadding(0);
        }
    }

    /* renamed from: B0 */
    public final boolean m485B0() {
        return getResources().getConfiguration().orientation != 2;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, android.inputmethodservice.InputMethodService, android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6325F1 = getResources().getDimensionPixelOffset(R.dimen.navigation_bar_min_height);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping, com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6325F1 = getResources().getDimensionPixelOffset(R.dimen.navigation_bar_min_height);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6322C1 = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            this.f6323D1 = getResources().getIdentifier("config_showNavigationBar", "bool", "android");
            this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_colorize_nav_bar, R.bool.settings_default_colorize_nav_bar)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.g
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AnySoftKeyboardColorizeNavBar anySoftKeyboardColorizeNavBar = AnySoftKeyboardColorizeNavBar.this;
                    anySoftKeyboardColorizeNavBar.getClass();
                    anySoftKeyboardColorizeNavBar.f6324E1 = ((Boolean) obj).booleanValue();
                }
            }, new C1215b("settings_key_colorize_nav_bar"), AbstractC2146l.f7038c, AbstractC2146l.f7039d));
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardInlineSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z) {
        Window window;
        super.onFinishInputView(z);
        if (!z || (window = getWindow().getWindow()) == null) {
            return;
        }
        m486A0(window);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardIncognito, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        super.onStartInputView(editorInfo, z);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (m485B0()) {
                if (this.f6323D1 != 0 ? getResources().getBoolean(this.f6323D1) : false) {
                    Window window = getWindow().getWindow();
                    if (window != null) {
                        int dimensionPixelSize = this.f6322C1 != 0 ? getResources().getDimensionPixelSize(this.f6322C1) : 0;
                        if (dimensionPixelSize <= 0 || !this.f6324E1) {
                            m486A0(window);
                            return;
                        }
                        window.addFlags(512);
                        window.setNavigationBarColor(0);
                        if (i >= 30) {
                            window.setDecorFitsSystemWindows(false);
                        }
                        this.f6307c.setBottomPadding(Math.max(dimensionPixelSize, this.f6325F1));
                        return;
                    }
                    return;
                }
            }
            m485B0();
            if (this.f6323D1 != 0) {
                getResources().getBoolean(this.f6323D1);
            }
        }
    }
}