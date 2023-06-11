package com.anysoftkeyboard.ime;

import android.annotation.TargetApi;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p010b.p036g.C0385i;
import p010b.p036g.C0387k;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;
import p093c.p097b.p130z.C1687o0;
import p093c.p097b.p130z.InterfaceC1685n0;
import p093c.p097b.p130z.Key;
import p093c.p137d.p138a.p139a.C1785g;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardKeyboardSwitchedListener extends AnySoftKeyboardRxPrefs implements InterfaceC1685n0 {

    /* renamed from: A */
    public AbstractC1762t f6337A;

    /* renamed from: B */
    public AbstractC1762t f6338B;

    /* renamed from: E */
    public CharSequence f6341E;

    /* renamed from: z */
    public C1687o0 f6343z;

    /* renamed from: C */
    public boolean f6339C = true;

    /* renamed from: D */
    public int f6340D = 1;

    /* renamed from: F */
    public int f6342F = 0;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: B */
    public void mo434B() {
        this.f6343z.m910d();
        hideWindow();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs
    /* renamed from: G */
    public void mo469G(String str) {
        if (str.startsWith("settings_key_support_keyboard_type_state_row_type_")) {
            this.f6343z.m910d();
        } else {
            super.mo469G(str);
        }
    }

    /* renamed from: H */
    public final AbstractC1762t m479H() {
        return this.f6339C ? this.f6337A : this.f6338B;
    }

    /* renamed from: I */
    public void mo478I(AbstractC1762t abstractC1762t) {
        String str;
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 != null) {
            C1687o0 c1687o0 = this.f6343z;
            boolean z = c1687o0.f5202s;
            int i = R.string.keyboard_change_locked;
            if (z) {
                str = c1687o0.f5192i.getString(R.string.keyboard_change_locked);
            } else {
                C1671g0[] c1671g0Arr = c1687o0.f5201r;
                int length = c1671g0Arr.length;
                int i2 = c1687o0.f5203t;
                if (c1687o0.f5204u) {
                    i2++;
                }
                if (i2 >= length) {
                    i2 = 0;
                }
                str = c1671g0Arr[i2].f4706b;
            }
            C1687o0 c1687o02 = this.f6343z;
            if (!c1687o02.f5202s) {
                int m900n = c1687o02.m900n(1);
                i = m900n != 1 ? m900n != 2 ? m900n != 3 ? m900n != 4 ? m900n != 5 ? R.string.symbols_keyboard : R.string.symbols_time_keyboard : R.string.symbols_phone_keyboard : R.string.symbols_numbers_keyboard : R.string.symbols_alt_num_keyboard : R.string.symbols_alt_keyboard;
            }
            ((AnyKeyboardViewBase) interfaceC1566d3).m416C(abstractC1762t, str, c1687o02.f5192i.getString(i));
        }
    }

    /* renamed from: d */
    public void mo431d(AbstractC1762t abstractC1762t) {
        this.f6337A = abstractC1762t;
        this.f6339C = true;
        this.f6341E = abstractC1762t.mo818q();
        C1450g c1450g = AnyApplication.f6979b;
        InputMethodManager inputMethodManager = this.f6309e;
        String mo179y = mo179y();
        IBinder iBinder = getWindow().getWindow().getAttributes().token;
        String locale = abstractC1762t.mo823s().toString();
        String mo818q = abstractC1762t.mo818q();
        c1450g.getClass();
        if (locale != null) {
            inputMethodManager.setInputMethodAndSubtype(iBinder, mo179y, c1450g.mo1026e(locale, mo818q));
        }
        mo478I(abstractC1762t);
    }

    @Override // p093c.p097b.p130z.InterfaceC1685n0
    /* renamed from: e */
    public void mo430e(AbstractC1762t abstractC1762t) {
        this.f6342F = 0;
        this.f6338B = abstractC1762t;
        this.f6339C = false;
        mo478I(abstractC1762t);
    }

    @Override // android.inputmethodservice.InputMethodService, android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i != this.f6340D) {
            this.f6340D = i;
            this.f6343z.m910d();
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6340D = getResources().getConfiguration().orientation;
        this.f6343z = new C1687o0(this, getApplicationContext());
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public View onCreateInputView() {
        View onCreateInputView = super.onCreateInputView();
        C1687o0 c1687o0 = this.f6343z;
        c1687o0.f5196m = this.f6308d;
        c1687o0.m910d();
        return onCreateInputView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.inputmethodservice.InputMethodService
    @TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCurrentInputMethodSubtypeChanged(InputMethodSubtype inputMethodSubtype) {
        boolean z;
        super.onCurrentInputMethodSubtypeChanged(inputMethodSubtype);
        String extraValue = inputMethodSubtype.getExtraValue();
        if (TextUtils.isEmpty(extraValue)) {
            return;
        }
        CharSequence charSequence = this.f6341E;
        if (charSequence != null) {
            if (!TextUtils.equals(charSequence, extraValue)) {
                z = false;
                if (z) {
                    return;
                }
                this.f6343z.m904j(getCurrentInputEditorInfo(), extraValue);
                return;
            }
            this.f6341E = null;
        }
        AbstractC1762t abstractC1762t = this.f6337A;
        z = abstractC1762t == null ? true : !TextUtils.equals(extraValue, abstractC1762t.mo818q());
        if (z) {
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C1687o0 c1687o0 = this.f6343z;
        c1687o0.f5186c.mo35e();
        HashSet hashSet = new HashSet(c1687o0.f5193j.f1943h);
        Iterator it = ((C0385i) c1687o0.f5193j.entrySet()).iterator();
        while (true) {
            C0387k c0387k = (C0387k) it;
            if (!c0387k.hasNext()) {
                ((C1785g) AnyApplication.m182t(c1687o0.f5192i).m1169d(R.string.settings_key_persistent_layout_per_package_id_mapping)).m808c(hashSet);
                c1687o0.m910d();
                c1687o0.f5193j.clear();
                this.f6343z = null;
                return;
            }
            c0387k.next();
            hashSet.add(String.format(Locale.US, "%s -> %s", c0387k.getKey(), c0387k.getValue()));
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        C1687o0 c1687o0 = this.f6343z;
        int i = 0;
        int i2 = 0;
        while (true) {
            AbstractC1762t[] abstractC1762tArr = c1687o0.f5199p;
            if (i2 >= abstractC1762tArr.length) {
                break;
            }
            if (c1687o0.f5204u || c1687o0.f5198o != i2) {
                abstractC1762tArr[i2] = null;
            }
            i2++;
        }
        while (true) {
            AbstractC1762t[] abstractC1762tArr2 = c1687o0.f5200q;
            if (i >= abstractC1762tArr2.length) {
                super.onLowMemory();
                return;
            }
            if (c1687o0.f5203t != i) {
                abstractC1762tArr2[i] = null;
            }
            i++;
        }
    }

    /* renamed from: s */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        int i3;
        if (i == 32 && this.f6378u && !this.f6339C && (i3 = this.f6342F) != 0 && i3 != 32) {
            this.f6343z.m903k(getCurrentInputEditorInfo(), 2);
        }
        if (this.f6339C || i <= 0) {
            return;
        }
        this.f6342F = i;
    }
}