package com.menny.android.anysoftkeyboard;

import android.content.ComponentName;
import com.anysoftkeyboard.saywhat.PublicNotices;

/* loaded from: classes.dex */
public class SoftKeyboard extends PublicNotices {
    @Override // com.anysoftkeyboard.saywhat.PublicNotices, com.anysoftkeyboard.AnySoftKeyboard, com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar, com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping, com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.anysoftkeyboard.AnySoftKeyboard, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        super.onUpdateSelection(i, i2, i3, i4, i5, i6);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: y */
    public String mo179y() {
        return new ComponentName(getApplication(), SoftKeyboard.class).flattenToShortString();
    }
}