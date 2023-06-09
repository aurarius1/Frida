package com.anysoftkeyboard.ime;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.anysoftkeyboard.ime.AnySoftKeyboardHardware;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1765w;
import p093c.p097b.p130z.InterfaceC1692r;
import p093c.p097b.p130z.p131q0.C1691a;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardHardware extends AnySoftKeyboardPressEffects {

    /* renamed from: d1 */
    public long f6328d1;

    /* renamed from: f1 */
    public boolean f6330f1;

    /* renamed from: g1 */
    public boolean f6331g1;

    /* renamed from: h1 */
    public boolean f6332h1;

    /* renamed from: i1 */
    public boolean f6333i1;

    /* renamed from: j1 */
    public boolean f6334j1;

    /* renamed from: c1 */
    public final C1691a f6327c1 = new C1691a();

    /* renamed from: e1 */
    public int f6329e1 = 0;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC2094b abstractC2094b = ((C1785g) this.f6370m.m1172a(R.string.settings_key_use_volume_key_for_left_right, R.bool.settings_default_use_volume_key_for_left_right)).f5459e;
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.x.i
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardHardware anySoftKeyboardHardware = AnySoftKeyboardHardware.this;
                anySoftKeyboardHardware.getClass();
                anySoftKeyboardHardware.f6330f1 = ((Boolean) obj).booleanValue();
            }
        };
        C1215b c1215b = new C1215b("settings_key_use_volume_key_for_left_right");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        this.f6371n.mo117c(abstractC2094b.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_use_key_repeat, R.bool.settings_default_use_key_repeat)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.j
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardHardware anySoftKeyboardHardware = AnySoftKeyboardHardware.this;
                anySoftKeyboardHardware.getClass();
                anySoftKeyboardHardware.f6331g1 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_use_key_repeat"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_enable_alt_space_language_shortcut, R.bool.settings_default_enable_alt_space_language_shortcut)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.l
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardHardware anySoftKeyboardHardware = AnySoftKeyboardHardware.this;
                anySoftKeyboardHardware.getClass();
                anySoftKeyboardHardware.f6332h1 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_enable_alt_space_language_shortcut"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_enable_shift_space_language_shortcut, R.bool.settings_default_enable_shift_space_language_shortcut)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.h
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardHardware anySoftKeyboardHardware = AnySoftKeyboardHardware.this;
                anySoftKeyboardHardware.getClass();
                anySoftKeyboardHardware.f6333i1 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_enable_shift_space_language_shortcut"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_use_backword, R.bool.settings_default_use_backword)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.k
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardHardware anySoftKeyboardHardware = AnySoftKeyboardHardware.this;
                anySoftKeyboardHardware.getClass();
                anySoftKeyboardHardware.f6334j1 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_use_backword"), interfaceC2119a, interfaceC2123e2));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public void onFinishInput() {
        super.onFinishInput();
        this.f6329e1 = 0;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        long j;
        InputConnection currentInputConnection = getCurrentInputConnection();
        int i2 = 1;
        if (m489k0(i, currentInputConnection)) {
            return true;
        }
        boolean isInputViewShown = isInputViewShown();
        if (keyEvent.getDeviceId() > 0 && keyEvent.isPrintingKey()) {
            EditorInfo currentInputEditorInfo = getCurrentInputEditorInfo();
            this.f6329e1 = currentInputEditorInfo == null ? 0 : currentInputEditorInfo.fieldId;
            if (this.f6375r) {
                hideWindow();
            }
            m467J(false);
        }
        C1691a c1691a = this.f6327c1;
        long j2 = this.f6328d1;
        c1691a.f5247b = false;
        c1691a.f5246a = keyEvent.getKeyCode();
        c1691a.f5248c = j2;
        if (i != 4) {
            if (i == 204) {
                m481q0(currentInputConnection);
                return true;
            } else if (i == 24) {
                if (isInputViewShown && this.f6330f1) {
                    sendDownUpKeyEvents(21);
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            } else if (i == 25) {
                if (isInputViewShown && this.f6330f1) {
                    sendDownUpKeyEvents(22);
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            } else {
                if (i != 62) {
                    if (i != 63) {
                        switch (i) {
                        }
                    }
                    long j3 = this.f6328d1;
                    if (i == 59 || i == 60) {
                        j = 1103823372545L;
                    } else if (i == 57 || i == 58 || i == 78) {
                        i2 = 2;
                        j = 2207646745090L;
                    } else {
                        if (i == 63) {
                            j = 4415293490180L;
                            i2 = 4;
                        }
                        this.f6328d1 = j3;
                    }
                    j3 = AbstractC1077v0.m1288P(j3, i2, j);
                    this.f6328d1 = j3;
                } else if ((keyEvent.isAltPressed() && this.f6332h1) || (keyEvent.isShiftPressed() && this.f6333i1)) {
                    m481q0(currentInputConnection);
                    return true;
                }
                if (!this.f6331g1 && keyEvent.getRepeatCount() > 0) {
                    return true;
                }
                InterfaceC1692r interfaceC1692r = (InterfaceC1692r) this.f6337A;
                AbstractC1762t m908f = this.f6343z.m908f();
                if ((m908f != null && (m908f instanceof InterfaceC1692r)) && interfaceC1692r != null) {
                    if (currentInputConnection != null) {
                        currentInputConnection.beginBatchEdit();
                    }
                    try {
                        if (this.f6334j1 && i == 67 && keyEvent.isShiftPressed()) {
                            mo482p0(currentInputConnection);
                            return true;
                        }
                        ((C1765w) interfaceC1692r).m827A(this.f6327c1, this, this.f6380w);
                        C1691a c1691a2 = this.f6327c1;
                        if (c1691a2.f5247b) {
                            int i3 = c1691a2.f5246a;
                            mo379s(i3, null, -1, new int[]{i3}, true);
                            this.f6328d1 = AbstractC1077v0.m1277b(this.f6328d1);
                            if (currentInputConnection != null) {
                                currentInputConnection.endBatchEdit();
                            }
                            return true;
                        } else if (currentInputConnection != null) {
                            currentInputConnection.endBatchEdit();
                        }
                    } finally {
                        if (currentInputConnection != null) {
                            currentInputConnection.endBatchEdit();
                        }
                    }
                }
                if (keyEvent.isPrintingKey()) {
                    this.f6328d1 = AbstractC1077v0.m1277b(this.f6328d1);
                }
            }
        } else if (keyEvent.getRepeatCount() == 0 && this.f6308d != null && mo419z()) {
            if (currentInputConnection != null) {
                currentInputConnection.clearMetaKeyStates(Integer.MAX_VALUE);
            }
            this.f6328d1 = 0L;
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        long j;
        int i2;
        InputConnection currentInputConnection;
        if (i != 24 && i != 25) {
            if (i != 63) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
                        if (interfaceC1566d3 != null && interfaceC1566d3.isShown() && this.f6308d.mo412a()) {
                            KeyEvent keyEvent2 = new KeyEvent(keyEvent.getDownTime(), keyEvent.getEventTime(), keyEvent.getAction(), keyEvent.getKeyCode(), keyEvent.getRepeatCount(), keyEvent.getDeviceId(), keyEvent.getScanCode(), 65);
                            InputConnection currentInputConnection2 = getCurrentInputConnection();
                            if (currentInputConnection2 != null) {
                                currentInputConnection2.sendKeyEvent(keyEvent2);
                            }
                            return true;
                        }
                        break;
                    default:
                        switch (i) {
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                                break;
                            default:
                                return super.onKeyUp(i, keyEvent);
                        }
                }
            }
            long j2 = this.f6328d1;
            if (i == 59 || i == 60) {
                j = 1103823372545L;
                i2 = 1;
            } else if (i == 57 || i == 58 || i == 78) {
                j = 2207646745090L;
                i2 = 2;
            } else {
                if (i == 63) {
                    j = 4415293490180L;
                    i2 = 4;
                }
                this.f6328d1 = j2;
                currentInputConnection = getCurrentInputConnection();
                if (currentInputConnection != null) {
                    int i3 = AbstractC1077v0.m1258u(this.f6328d1, 2) != 0 ? 0 : 2;
                    if (AbstractC1077v0.m1258u(this.f6328d1, 1) == 0) {
                        i3++;
                    }
                    if (AbstractC1077v0.m1258u(this.f6328d1, 4) == 0) {
                        i3 += 4;
                    }
                    currentInputConnection.clearMetaKeyStates(i3);
                }
            }
            j2 = AbstractC1077v0.m1287Q(j2, i2, j);
            this.f6328d1 = j2;
            currentInputConnection = getCurrentInputConnection();
            if (currentInputConnection != null) {
            }
        } else if (!isInputViewShown()) {
            return super.onKeyUp(i, keyEvent);
        } else {
            if (this.f6330f1) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService
    public boolean onShowInputRequested(int i, boolean z) {
        boolean z2;
        int i2;
        EditorInfo currentInputEditorInfo = getCurrentInputEditorInfo();
        if (z || currentInputEditorInfo == null || (i2 = currentInputEditorInfo.fieldId) != this.f6329e1 || i2 == 0) {
            this.f6329e1 = 0;
            z2 = false;
        } else {
            z2 = true;
        }
        return !z2 && super.onShowInputRequested(i, z);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInput(EditorInfo editorInfo, boolean z) {
        super.onStartInput(editorInfo, z);
        if (z) {
            return;
        }
        this.f6328d1 = 0L;
    }

    /* renamed from: p0 */
    public abstract void mo482p0(InputConnection inputConnection);

    /* renamed from: q0 */
    public final void m481q0(InputConnection inputConnection) {
        if (inputConnection != null) {
            inputConnection.clearMetaKeyStates(Integer.MAX_VALUE);
        }
        this.f6328d1 = 0L;
        this.f6343z.m903k(getCurrentInputEditorInfo(), 3);
    }
}