package p093c.p097b.p108i0.p110p;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.InterfaceC0890q;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.c1 */
/* loaded from: classes.dex */
public class C1320c1 extends AbstractC0904x implements InterfaceC0890q {
    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_addtional_language_prefs);
    }

    @Override // p010b.p082t.InterfaceC0890q
    /* renamed from: a */
    public boolean mo1123a(Preference preference) {
        AbstractActivityC0681d0 m1872h;
        if (preference.f620m.equals(m1908D(R.string.tweaks_group_key)) && (m1872h = m1872h()) != null && (m1872h instanceof BasicAnyActivity)) {
            ((BasicAnyActivity) m1872h).m374t(new C1356o1(), AbstractC2289b.f7441b);
            return true;
        }
        return false;
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.language_tweaks_settings_tile));
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        super.mo1080q0(view, bundle);
        m1734R0(m1908D(R.string.tweaks_group_key)).f614g = this;
    }
}