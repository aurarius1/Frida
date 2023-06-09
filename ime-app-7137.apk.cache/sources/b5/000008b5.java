package com.anysoftkeyboard.ime;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import p093c.p097b.p128x.C1595k2;
import p093c.p097b.p128x.C1599l2;
import p204f.p205a.p209b.C2296g;
import p204f.p205a.p209b.InterfaceC2293d;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardDialogProvider extends AnySoftKeyboardService {

    /* renamed from: l */
    public C2296g f6326l;

    /* renamed from: E */
    public void m484E(CharSequence charSequence, int i, CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener, InterfaceC2293d interfaceC2293d) {
        this.f6326l.m20b(123123, new C1599l2(this, charSequence, i, charSequenceArr, onClickListener, interfaceC2293d));
    }

    /* renamed from: F */
    public void m483F(int i, boolean z) {
        Toast.makeText(getApplication(), getResources().getText(i), !z ? 1 : 0).show();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6326l = new C2296g((Context) this, (InterfaceC2293d) new C1595k2(this, null));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public View onCreateInputView() {
        this.f6326l.m21a();
        return super.onCreateInputView();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: z */
    public boolean mo419z() {
        return this.f6326l.m21a();
    }
}