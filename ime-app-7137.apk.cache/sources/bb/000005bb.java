package p093c.p097b.p108i0.p110p;

import android.os.Bundle;
import android.view.View;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.InterfaceC0890q;
import p093c.p097b.p108i0.p110p.p112b2.C1280f0;
import p093c.p097b.p108i0.p110p.p112b2.C1314w0;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.h1 */
/* loaded from: classes.dex */
public class C1335h1 extends AbstractC0904x implements InterfaceC0890q {
    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_dictionaries);
    }

    @Override // p010b.p082t.InterfaceC0890q
    /* renamed from: a */
    public boolean mo1123a(Preference preference) {
        AbstractComponentCallbacksC0763z c1371t1;
        MainSettingsActivity mainSettingsActivity = (MainSettingsActivity) m1872h();
        if (mainSettingsActivity == null) {
            return false;
        }
        if (preference.f620m.equals(m1908D(R.string.user_dict_editor_key))) {
            c1371t1 = new C1314w0();
        } else if (preference.f620m.equals(m1908D(R.string.abbreviation_dict_editor_key))) {
            c1371t1 = new C1280f0();
        } else if (!preference.f620m.equals(m1908D(R.string.next_word_dict_settings_key))) {
            if (preference.f620m.equals(m1908D(R.string.settings_key_use_contacts_dictionary)) && ((CheckBoxPreference) preference).f665P) {
                mainSettingsActivity.startContactsPermissionRequest();
            }
            return false;
        } else {
            c1371t1 = new C1371t1();
        }
        mainSettingsActivity.m374t(c1371t1, AbstractC2289b.f7441b);
        return true;
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.special_dictionaries_group));
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        super.mo1080q0(view, bundle);
        m1734R0(m1908D(R.string.user_dict_editor_key)).f614g = this;
        m1734R0(m1908D(R.string.abbreviation_dict_editor_key)).f614g = this;
        m1734R0(m1908D(R.string.next_word_dict_settings_key)).f614g = this;
        m1734R0(m1908D(R.string.settings_key_use_contacts_dictionary)).f614g = this;
    }
}