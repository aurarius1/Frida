package com.anysoftkeyboard.ime;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardView;
import com.anysoftkeyboard.keyboards.views.KeyboardViewContainerView;
import com.anysoftkeyboard.quicktextkeys.p179ui.QuickTextPagerView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.Set;
import p093c.p097b.p099b0.C1146i;
import p093c.p097b.p102d0.C1187d;
import p093c.p097b.p102d0.C1188e;
import p093c.p097b.p102d0.p103k.C1196c;
import p093c.p097b.p102d0.p103k.C1197d;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p130z.Key;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardWithQuickText extends AnySoftKeyboardMediaInsertion {

    /* renamed from: q1 */
    public boolean f6437q1;

    /* renamed from: r1 */
    public String f6438r1 = "";

    /* renamed from: s1 */
    public C1197d f6439s1;

    /* renamed from: t1 */
    public C1196c f6440t1;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC2094b abstractC2094b = ((C1785g) this.f6370m.m1172a(R.string.settings_key_do_not_flip_quick_key_codes_functionality, R.bool.settings_default_do_not_flip_quick_keys_functionality)).f5459e;
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.x.y1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardWithQuickText anySoftKeyboardWithQuickText = AnySoftKeyboardWithQuickText.this;
                anySoftKeyboardWithQuickText.getClass();
                anySoftKeyboardWithQuickText.f6437q1 = ((Boolean) obj).booleanValue();
            }
        };
        C1215b c1215b = new C1215b("settings_key_do_not_flip_quick_key_codes_functionality");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        this.f6371n.mo117c(abstractC2094b.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1170c(R.string.settings_key_emoticon_default_text, R.string.settings_default_empty)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.z1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardWithQuickText.this.f6438r1 = (String) obj;
            }
        }, new C1215b("settings_key_emoticon_default_text"), interfaceC2119a, interfaceC2123e2));
        C1197d c1197d = new C1197d(this.f6370m);
        this.f6439s1 = c1197d;
        this.f6371n.mo117c(c1197d);
        C1196c c1196c = new C1196c(this.f6370m);
        this.f6440t1 = c1196c;
        this.f6371n.mo117c(c1196c);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardInlineSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z) {
        super.onFinishInputView(z);
        if (z) {
            m422t0(true);
        }
    }

    /* renamed from: t0 */
    public final boolean m422t0(boolean z) {
        View view;
        KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
        if (keyboardViewContainerView == null) {
            return false;
        }
        if (z && (view = (View) this.f6308d) != null) {
            view.setVisibility(0);
        }
        QuickTextPagerView quickTextPagerView = (QuickTextPagerView) keyboardViewContainerView.findViewById(R.id.quick_text_pager_root);
        if (quickTextPagerView != null) {
            keyboardViewContainerView.removeView(quickTextPagerView);
            return true;
        }
        return false;
    }

    /* renamed from: u0 */
    public final void m421u0(Key key) {
        CharSequence charSequence;
        C1450g c1450g = AnyApplication.f6979b;
        C1188e c1188e = (C1188e) ((AnyApplication) getApplicationContext()).f6988k.m1058f();
        if (TextUtils.isEmpty(this.f6438r1)) {
            charSequence = c1188e.f4326o;
        } else {
            charSequence = this.f6438r1;
        }
        mo450c(key, charSequence);
    }

    /* renamed from: v0 */
    public final void m420v0() {
        KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
        m467J(false);
        m422t0(false);
        AnyKeyboardView anyKeyboardView = (AnyKeyboardView) this.f6308d;
        Context applicationContext = getApplicationContext();
        C1187d c1187d = this.f6345i0;
        C1197d c1197d = this.f6439s1;
        C1196c c1196c = this.f6440t1;
        QuickTextPagerView quickTextPagerView = (QuickTextPagerView) LayoutInflater.from(applicationContext).inflate(R.layout.quick_text_popup_root_view, (ViewGroup) keyboardViewContainerView, false);
        ViewGroup.LayoutParams layoutParams = quickTextPagerView.getLayoutParams();
        layoutParams.height = keyboardViewContainerView.getHeight();
        quickTextPagerView.setLayoutParams(layoutParams);
        quickTextPagerView.setQuickKeyHistoryRecords(c1187d);
        quickTextPagerView.f6580l = c1197d;
        quickTextPagerView.f6581m = c1196c;
        anyKeyboardView.mo410c();
        C1237f c1237f = this.f6427o0;
        float labelTextSize = anyKeyboardView.getLabelTextSize();
        ColorStateList colorStateList = ((C1146i) anyKeyboardView.getCurrentResourcesHolder()).f4262a;
        Drawable m403j = anyKeyboardView.m403j(-3);
        Drawable m403j2 = anyKeyboardView.m403j(-5);
        Drawable m403j3 = anyKeyboardView.m403j(-100);
        Drawable background = anyKeyboardView.getBackground();
        Drawable m403j4 = anyKeyboardView.m403j(-140);
        Drawable m403j5 = anyKeyboardView.m403j(-103);
        int paddingBottom = anyKeyboardView.getPaddingBottom();
        Set set = this.f6349l1;
        quickTextPagerView.f6570b = c1237f;
        quickTextPagerView.f6571c = labelTextSize;
        quickTextPagerView.f6572d = colorStateList;
        quickTextPagerView.f6573e = m403j;
        quickTextPagerView.f6574f = m403j2;
        quickTextPagerView.f6575g = m403j3;
        quickTextPagerView.f6576h = m403j4;
        quickTextPagerView.f6577i = m403j5;
        quickTextPagerView.f6578j = paddingBottom;
        quickTextPagerView.findViewById(R.id.quick_keys_popup_quick_keys_insert_media).setVisibility(set.isEmpty() ? 8 : 0);
        if (Build.VERSION.SDK_INT >= 16) {
            quickTextPagerView.setBackground(background);
        } else {
            quickTextPagerView.setBackgroundDrawable(background);
        }
        anyKeyboardView.setVisibility(8);
        keyboardViewContainerView.addView(quickTextPagerView);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: z */
    public boolean mo419z() {
        return super.mo419z() || m422t0(true);
    }
}