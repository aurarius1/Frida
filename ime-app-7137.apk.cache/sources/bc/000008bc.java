package com.anysoftkeyboard.ime;

import com.anysoftkeyboard.ime.AnySoftKeyboardNightMode;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p047d.AbstractC0472e;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p099b0.C1144g;
import p093c.p097b.p099b0.InterfaceC1141d;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p117q.AbstractC1438d;
import p093c.p097b.p128x.C1551a3;
import p093c.p097b.p128x.C1555b2;
import p093c.p097b.p128x.C1614p1;
import p093c.p097b.p128x.C1651y2;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardNightMode extends AnySoftKeyboardThemeOverlay {

    /* renamed from: r0 */
    public boolean f6354r0;

    /* renamed from: s0 */
    public C1551a3 f6355s0;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay
    /* renamed from: g0 */
    public InterfaceC1141d mo436g0() {
        C1551a3 c1551a3 = new C1551a3(C1144g.f4258a ? new C1651y2(this) : C1614p1.f5045a, this, new C1138a(-14540254, -16777216, -12303292, -7829368, -12303292), "NightMode");
        this.f6355s0 = c1551a3;
        return c1551a3;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC2094b m1045e = AbstractC1438d.m1045e(getApplicationContext(), 0, R.bool.settings_default_true);
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.x.p
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardNightMode anySoftKeyboardNightMode = AnySoftKeyboardNightMode.this;
                anySoftKeyboardNightMode.getClass();
                anySoftKeyboardNightMode.f6354r0 = ((Boolean) obj).booleanValue();
                anySoftKeyboardNightMode.m495C();
            }
        };
        C1215b c1215b = new C1215b("night-mode icon");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        this.f6371n.mo117c(m1045e.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        AbstractC2094b m1045e2 = AbstractC1438d.m1045e(getApplicationContext(), R.string.settings_key_night_mode_theme_control, R.bool.settings_default_false);
        C1551a3 c1551a3 = this.f6355s0;
        c1551a3.getClass();
        this.f6371n.mo117c(m1045e2.m164N(new C1555b2(c1551a3), new C1215b("night-mode theme"), interfaceC2119a, interfaceC2123e2));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: v */
    public List mo426v() {
        List mo426v = super.mo426v();
        if (this.f6354r0) {
            ((ArrayList) mo426v).add(AbstractC0472e.m2430c(this, R.drawable.ic_watermark_night_mode));
        }
        return mo426v;
    }
}