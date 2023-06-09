package com.anysoftkeyboard.saywhat;

import android.graphics.Point;
import android.view.inputmethod.EditorInfo;
import com.anysoftkeyboard.AnySoftKeyboard;
import com.menny.android.anysoftkeyboard.AnyApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p093c.p097b.p106g0.AbstractC1228k;
import p093c.p097b.p106g0.C1220c;
import p093c.p097b.p106g0.InterfaceC1230m;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.AbstractC1718e0;
import p093c.p097b.p130z.p132r0.p133a1.C1699e;

/* loaded from: classes.dex */
public abstract class PublicNotices extends AnySoftKeyboard {

    /* renamed from: V1 */
    public final List f6586V1 = new ArrayList();

    /* renamed from: W1 */
    public final List f6587W1 = new ArrayList();

    @Override // com.anysoftkeyboard.AnySoftKeyboard, com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar, com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping, com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        for (InterfaceC1230m interfaceC1230m : Collections.unmodifiableList(((AnyApplication) getApplication()).f6990m)) {
            boolean z = interfaceC1230m instanceof AbstractC1228k;
            if (z) {
                this.f6586V1.add((AbstractC1228k) interfaceC1230m);
            }
            if (z) {
                this.f6587W1.add((AbstractC1228k) interfaceC1230m);
            }
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar, com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardInlineSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z) {
        super.onFinishInputView(z);
        for (AbstractC1228k abstractC1228k : this.f6587W1) {
            abstractC1228k.getClass();
            this.f6307c.m381e(abstractC1228k.f4404c);
        }
    }

    @Override // com.anysoftkeyboard.AnySoftKeyboard, com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar, com.anysoftkeyboard.ime.AnySoftKeyboardIncognito, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        super.onStartInputView(editorInfo, z);
        for (AbstractC1228k abstractC1228k : this.f6587W1) {
            abstractC1228k.getClass();
        }
    }

    @Override // com.anysoftkeyboard.AnySoftKeyboard, com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: s */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        super.mo379s(i, key, i2, iArr, z);
        for (AbstractC1228k abstractC1228k : this.f6586V1) {
            if (abstractC1228k.f4402a.m1144a(i)) {
                InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
                if (interfaceC1566d3 instanceof AbstractC1718e0) {
                    AbstractC1718e0 abstractC1718e0 = (AbstractC1718e0) interfaceC1566d3;
                    abstractC1718e0.m873J(new C1699e(abstractC1228k.f4403b.mo1145a(), new Point(abstractC1718e0.getWidth() / 2, abstractC1718e0.getHeight() / 2), 120L, new C1220c(abstractC1228k)));
                    this.f6307c.m382d(abstractC1228k.f4404c);
                }
            }
        }
    }
}