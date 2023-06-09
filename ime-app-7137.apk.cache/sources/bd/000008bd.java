package com.anysoftkeyboard.ime;

import android.graphics.Point;
import android.text.TextUtils;
import com.anysoftkeyboard.ime.AnySoftKeyboardPopText;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.AbstractC1718e0;
import p093c.p097b.p130z.p132r0.p133a1.C1697c;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardPopText extends AnySoftKeyboardPowerSaving {

    /* renamed from: v0 */
    public boolean f6356v0 = true;

    /* renamed from: w0 */
    public boolean f6357w0 = false;

    /* renamed from: x0 */
    public boolean f6358x0 = false;

    /* renamed from: y0 */
    public C1697c f6359y0;

    /* renamed from: z0 */
    public Key f6360z0;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions
    /* renamed from: N */
    public void mo463N(CharSequence charSequence, CharSequence charSequence2) {
        super.mo463N(charSequence, charSequence2);
        if ((this.f6356v0 && !TextUtils.equals(charSequence, charSequence2)) || this.f6357w0) {
            m474i0(charSequence.toString());
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions
    /* renamed from: X */
    public void mo432X(int i, CharSequence charSequence, boolean z) {
        this.f6360z0 = null;
        super.mo432X(i, charSequence, z);
    }

    /* renamed from: i0 */
    public final void m474i0(CharSequence charSequence) {
        if (this.f6360z0 == null) {
            return;
        }
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 instanceof AbstractC1718e0) {
            AbstractC1718e0 abstractC1718e0 = (AbstractC1718e0) interfaceC1566d3;
            Key key = this.f6360z0;
            C1697c c1697c = new C1697c(charSequence, new Point((key.width / 2) + key.x, key.y), this.f6360z0.y - (abstractC1718e0.getHeight() / 2));
            this.f6359y0 = c1697c;
            abstractC1718e0.m873J(c1697c);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6371n.mo117c(((C1785g) this.f6370m.m1170c(R.string.settings_key_pop_text_option, R.string.settings_default_pop_text_option)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.x.q
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
                if (r7.equals("on_word") == false) goto L19;
             */
            @Override // p183e.p184a.p189o.InterfaceC2123e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void accept(Object obj) {
                AnySoftKeyboardPopText anySoftKeyboardPopText = AnySoftKeyboardPopText.this;
                String str = (String) obj;
                char c = 0;
                anySoftKeyboardPopText.f6356v0 = false;
                anySoftKeyboardPopText.f6357w0 = false;
                anySoftKeyboardPopText.f6358x0 = false;
                str.hashCode();
                int hashCode = str.hashCode();
                if (hashCode != -1325709974) {
                    if (hashCode != -842567284) {
                        if (hashCode == 1055217086 && str.equals("on_correction")) {
                            c = 2;
                        }
                        c = 65535;
                    } else {
                        if (str.equals("any_key")) {
                            c = 1;
                        }
                        c = 65535;
                    }
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            return;
                        }
                        anySoftKeyboardPopText.f6356v0 = true;
                    }
                    anySoftKeyboardPopText.f6358x0 = true;
                }
                anySoftKeyboardPopText.f6357w0 = true;
                anySoftKeyboardPopText.f6356v0 = true;
            }
        }, new C1215b("settings_key_pop_text_option"), AbstractC2146l.f7038c, AbstractC2146l.f7039d));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: s */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        super.mo379s(i, key, i2, iArr, z);
        this.f6360z0 = key;
        if (this.f6358x0 && mo460R(i)) {
            m474i0(new String(new int[]{i}, 0, 1));
        }
    }
}