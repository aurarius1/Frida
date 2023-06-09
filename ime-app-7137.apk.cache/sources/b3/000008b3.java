package com.anysoftkeyboard.ime;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.anysoftkeyboard.ime.AnySoftKeyboardClipboard;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p121t.C1448e;
import p093c.p097b.p128x.C1575f2;
import p093c.p097b.p128x.C1587i2;
import p093c.p097b.p130z.Key;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardClipboard extends AnySoftKeyboardSwipeListener {

    /* renamed from: O0 */
    public boolean f6315O0;

    /* renamed from: P0 */
    public C1448e f6316P0;

    /* renamed from: R0 */
    public CharSequence f6318R0;

    /* renamed from: S0 */
    public boolean f6319S0;

    /* renamed from: U0 */
    public C1587i2 f6321U0;

    /* renamed from: Q0 */
    public long f6317Q0 = Long.MIN_VALUE;

    /* renamed from: T0 */
    public final C1575f2 f6320T0 = new C1575f2(this);

    /* renamed from: l0 */
    public static boolean m488l0(EditorInfo editorInfo) {
        int i = editorInfo.inputType;
        if ((i & 1) == 0) {
            return false;
        }
        int i2 = i & 4080;
        return i2 == 128 || i2 == 144 || i2 == 224;
    }

    /* renamed from: k0 */
    public boolean m489k0(int i, InputConnection inputConnection) {
        if (this.f6315O0 && inputConnection != null) {
            int m491w = m491w();
            int i2 = this.f6311g;
            m456V();
            if (i == 21) {
                String charSequence = inputConnection.getTextBeforeCursor(2, 0).toString();
                if (charSequence.length() != 0) {
                    i2 -= Character.charCount(charSequence.codePointBefore(charSequence.length()));
                }
                inputConnection.setSelection(i2, m491w);
                return true;
            } else if (i == 22) {
                String charSequence2 = inputConnection.getTextAfterCursor(2, 0).toString();
                if (charSequence2.length() == 0) {
                    inputConnection.setSelection(i2, m491w);
                } else {
                    inputConnection.setSelection(i2, Character.charCount(charSequence2.codePointAt(0)) + m491w);
                }
                return true;
            } else {
                this.f6315O0 = false;
            }
        }
        return false;
    }

    /* renamed from: m0 */
    public void m487m0(int i, int i2) {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        currentInputConnection.sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, i, 0, i2, -1, 0, 6));
        currentInputConnection.sendKeyEvent(new KeyEvent(uptimeMillis, SystemClock.uptimeMillis(), 1, i, 0, i2, -1, 0, 6));
    }

    /* renamed from: n */
    public void mo472n(int i) {
        if (!this.f6315O0 || i == -20 || i == -21) {
            return;
        }
        this.f6315O0 = false;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6316P0 = AnyApplication.f6979b.mo1024a(getApplicationContext());
        this.f6321U0 = new C1587i2(this.f6320T0);
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_os_clipboard_sync, R.bool.settings_default_os_clipboard_sync)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.e
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardClipboard anySoftKeyboardClipboard = AnySoftKeyboardClipboard.this;
                anySoftKeyboardClipboard.f6317Q0 = Long.MIN_VALUE;
                C1448e c1448e = anySoftKeyboardClipboard.f6316P0;
                C1572f c1572f = ((Boolean) obj).booleanValue() ? new C1572f(anySoftKeyboardClipboard) : null;
                if (c1448e.f4750c != c1572f) {
                    c1448e.f4748a.clear();
                }
                c1448e.f4750c = c1572f;
                if (c1572f == null) {
                    c1448e.f4749b.removePrimaryClipChangedListener(c1448e.f4751d);
                } else {
                    c1448e.f4749b.addPrimaryClipChangedListener(c1448e.f4751d);
                }
            }
        }, new C1215b("settings_key_os_clipboard_sync"), AbstractC2146l.f7038c, AbstractC2146l.f7039d));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardInlineSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z) {
        super.onFinishInputView(z);
        this.f6307c.m381e(this.f6321U0);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        super.onStartInputView(editorInfo, z);
        if (this.f6317Q0 + 15000 < SystemClock.uptimeMillis() || TextUtils.isEmpty(this.f6318R0)) {
            return;
        }
        this.f6307c.m382d(this.f6321U0);
        this.f6307c.setActionsStripVisibility(true);
        C1587i2 c1587i2 = this.f6321U0;
        CharSequence charSequence = this.f6318R0;
        boolean z2 = this.f6319S0 || m488l0(editorInfo);
        c1587i2.f5014b = charSequence;
        c1587i2.f5015c.setSelected(true);
        if (z2) {
            c1587i2.f5015c.setText("**********");
        } else {
            c1587i2.f5015c.setText(charSequence);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: s */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        C1587i2 c1587i2 = this.f6321U0;
        if (c1587i2.f5015c != null) {
            this.f6307c.m381e(c1587i2);
        }
        super.mo379s(i, key, i2, iArr, z);
    }
}