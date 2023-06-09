package p093c.p097b.p108i0.p110p;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.C0865d0;
import p010b.p082t.InterfaceC0890q;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.i1 */
/* loaded from: classes.dex */
public class C1338i1 extends AbstractC0904x {
    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_effects_prefs);
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.effects_group));
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        super.mo1080q0(view, bundle);
        m1734R0(m1902G(R.string.settings_key_power_save_mode)).f614g = new InterfaceC0890q() { // from class: c.b.i0.p.f
            @Override // p010b.p082t.InterfaceC0890q
            /* renamed from: a */
            public final boolean mo1123a(Preference preference) {
                ((MainSettingsActivity) C1338i1.this.m1872h()).m374t(new C1377v1(), AbstractC2289b.f7441b);
                return true;
            }
        };
        m1734R0(m1902G(R.string.settings_key_night_mode)).f614g = new InterfaceC0890q() { // from class: c.b.i0.p.g
            @Override // p010b.p082t.InterfaceC0890q
            /* renamed from: a */
            public final boolean mo1123a(Preference preference) {
                ((MainSettingsActivity) C1338i1.this.m1872h()).m374t(new C1374u1(), AbstractC2289b.f7441b);
                return true;
            }
        };
        if (Build.VERSION.SDK_INT < 29) {
            Preference m1734R0 = m1734R0(m1902G(R.string.settings_key_use_system_vibration));
            if (m1734R0.f632y) {
                m1734R0.f632y = false;
                C0865d0 c0865d0 = m1734R0.f602I;
                if (c0865d0 != null) {
                    c0865d0.m1754l();
                }
            }
            if (m1734R0.f625r) {
                m1734R0.f625r = false;
                m1734R0.mo3277m();
            }
        }
    }
}