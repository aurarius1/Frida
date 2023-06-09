package com.anysoftkeyboard.ime;

import android.inputmethodservice.AbstractInputMethodService;
import android.os.IBinder;
import p093c.p097b.p128x.C1631t2;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardService extends AnySoftKeyboardBase {

    /* renamed from: k */
    public IBinder f6383k = null;

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService
    public AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        return new C1631t2(this);
    }
}