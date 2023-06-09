package com.anysoftkeyboard.ime;

import android.view.inputmethod.EditorInfo;
import p093c.p097b.p122u.C1487n0;
import p093c.p097b.p122u.InterfaceC1481k0;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardIncognito extends AnySoftKeyboardWithGestureTyping {

    /* renamed from: B1 */
    public boolean f6335B1 = false;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        super.onStartInputView(editorInfo, z);
        if (!((editorInfo.imeOptions & 16777216) != 0) && !AnySoftKeyboardClipboard.m488l0(editorInfo)) {
            if (!((editorInfo.inputType & 18) == 18)) {
                m480z0(this.f6335B1, false);
                return;
            }
        }
        m480z0(true, false);
    }

    /* renamed from: z0 */
    public void m480z0(boolean z, boolean z2) {
        InterfaceC1481k0 interfaceC1481k0 = this.f6391N;
        ((C1487n0) interfaceC1481k0).f4785a.f4829u = z;
        this.f6345i0.f4321c = ((C1487n0) interfaceC1481k0).f4785a.f4829u;
        m495C();
        if (z2) {
            this.f6335B1 = z;
        }
    }
}