package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.InterfaceC0871g0;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: X */
    public boolean f643X;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0505k.m2404a(context, AbstractC0883m0.preferenceScreenStyle, 16842891), 0);
        this.f643X = true;
    }

    @Override // androidx.preference.Preference
    /* renamed from: s */
    public void mo3247s() {
        InterfaceC0871g0 interfaceC0871g0;
        if (this.f621n != null || this.f622o != null || m3267P() == 0 || (interfaceC0871g0 = this.f610c.f3477j) == null) {
            return;
        }
        ((AbstractC0904x) interfaceC0871g0).m1872h();
    }
}