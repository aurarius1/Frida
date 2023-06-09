package com.anysoftkeyboard.ime;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.List;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p102d0.C1187d;
import p093c.p097b.p102d0.C1188e;
import p093c.p097b.p102d0.C1193j;
import p093c.p097b.p102d0.InterfaceC1190g;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p122u.C1487n0;
import p093c.p097b.p128x.C1607n2;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardKeyboardTagsSearcher extends AnySoftKeyboardInlineSuggestions {

    /* renamed from: i0 */
    public C1187d f6345i0;

    /* renamed from: j0 */
    public SharedPreferences f6346j0;

    /* renamed from: h0 */
    public InterfaceC1190g f6344h0 = C1193j.f4330a;

    /* renamed from: k0 */
    public SharedPreferences.OnSharedPreferenceChangeListener f6347k0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: c.b.x.n
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            AnySoftKeyboardKeyboardTagsSearcher anySoftKeyboardKeyboardTagsSearcher = AnySoftKeyboardKeyboardTagsSearcher.this;
            anySoftKeyboardKeyboardTagsSearcher.getClass();
            if (str.startsWith("quick_text_") && anySoftKeyboardKeyboardTagsSearcher.f6344h0.isEnabled()) {
                anySoftKeyboardKeyboardTagsSearcher.m477e0();
            }
        }
    };

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions
    /* renamed from: R */
    public boolean mo460R(int i) {
        return this.f6344h0.isEnabled() && i == 58;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions
    /* renamed from: T */
    public boolean mo458T(int i) {
        if (Character.isLetter(i)) {
            return true;
        }
        return this.f6344h0.isEnabled() && i == 58;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions
    /* renamed from: X */
    public void mo432X(int i, CharSequence charSequence, boolean z) {
        if (this.f6389L.m988j()) {
            if (i == 0) {
                charSequence = ((String) this.f6389L.mo995c()).toString();
            } else {
                this.f6345i0.m1156c(charSequence.toString(), charSequence.toString());
            }
        }
        super.mo432X(i, charSequence, z);
    }

    /* renamed from: e0 */
    public final void m477e0() {
        C1450g c1450g = AnyApplication.f6979b;
        List<C1188e> m1057g = ((AnyApplication) getApplicationContext()).f6988k.m1057g();
        ArrayList arrayList = new ArrayList();
        for (C1188e c1188e : m1057g) {
            if (c1188e.m1151f() && c1188e.m1062a() != null) {
                arrayList.add(new C1607n2(c1188e, getApplicationContext(), c1188e.f4322k, null).f5147q);
            }
        }
        C1193j c1193j = new C1193j(this, arrayList, this.f6345i0);
        this.f6344h0 = c1193j;
        ((C1487n0) this.f6391N).f4794j = c1193j;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        C1151a0 c1151a0 = this.f6370m;
        this.f6345i0 = new C1187d(c1151a0);
        this.f6371n.mo117c(((C1785g) c1151a0.m1172a(R.string.settings_key_search_quick_text_tags, R.bool.settings_default_search_quick_text_tags)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.o
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardKeyboardTagsSearcher anySoftKeyboardKeyboardTagsSearcher = AnySoftKeyboardKeyboardTagsSearcher.this;
                if (((Boolean) obj).booleanValue() && !anySoftKeyboardKeyboardTagsSearcher.f6344h0.isEnabled()) {
                    anySoftKeyboardKeyboardTagsSearcher.m477e0();
                    return;
                }
                InterfaceC1190g interfaceC1190g = C1193j.f4330a;
                anySoftKeyboardKeyboardTagsSearcher.f6344h0 = interfaceC1190g;
                ((C1487n0) anySoftKeyboardKeyboardTagsSearcher.f6391N).f4794j = interfaceC1190g;
            }
        }, new C1215b("settings_key_search_quick_text_tags"), AbstractC2146l.f7038c, AbstractC2146l.f7039d));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f6346j0 = defaultSharedPreferences;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.f6347k0);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f6346j0.unregisterOnSharedPreferenceChangeListener(this.f6347k0);
    }
}