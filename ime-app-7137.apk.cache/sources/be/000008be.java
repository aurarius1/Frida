package com.anysoftkeyboard.ime;

import com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p099b0.InterfaceC1141d;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p128x.C1551a3;
import p093c.p097b.p128x.C1555b2;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardPowerSaving extends AnySoftKeyboardNightMode {

    /* renamed from: t0 */
    public boolean f6361t0;

    /* renamed from: u0 */
    public C1551a3 f6362u0;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay
    /* renamed from: g0 */
    public InterfaceC1141d mo436g0() {
        C1551a3 c1551a3 = new C1551a3(super.mo436g0(), this, new C1138a(-16777216, -16777216, -12303292, -7829368, -12303292), "PowerSaving");
        this.f6362u0 = c1551a3;
        return c1551a3;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC2094b m1295I = AbstractC1077v0.m1295I(getApplicationContext(), 0);
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.x.r
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardPowerSaving anySoftKeyboardPowerSaving = AnySoftKeyboardPowerSaving.this;
                anySoftKeyboardPowerSaving.getClass();
                anySoftKeyboardPowerSaving.f6361t0 = ((Boolean) obj).booleanValue();
                anySoftKeyboardPowerSaving.m495C();
            }
        };
        C1215b c1215b = new C1215b("Power-Saving icon");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        this.f6371n.mo117c(m1295I.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        AbstractC2094b m1294J = AbstractC1077v0.m1294J(getApplicationContext(), R.string.settings_key_power_save_mode_theme_control, R.bool.settings_default_true);
        C1551a3 c1551a3 = this.f6362u0;
        c1551a3.getClass();
        this.f6371n.mo117c(m1294J.m164N(new C1555b2(c1551a3), new C1215b("Power-Saving theme"), interfaceC2119a, interfaceC2123e2));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: v */
    public List mo426v() {
        List mo426v = super.mo426v();
        if (this.f6361t0) {
            ((ArrayList) mo426v).add(AbstractC0472e.m2430c(this, R.drawable.ic_watermark_power_saving));
        }
        return mo426v;
    }
}