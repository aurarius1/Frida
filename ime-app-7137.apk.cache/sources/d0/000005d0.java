package p093c.p097b.p108i0.p110p;

import android.os.Bundle;
import android.view.View;
import androidx.preference.ListPreference;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;
import p010b.p082t.AbstractC0904x;
import p093c.p097b.p130z.C1671g0;

/* renamed from: c.b.i0.p.o1 */
/* loaded from: classes.dex */
public class C1356o1 extends AbstractC0904x {
    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_language_tweaks);
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.tweaks_group));
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        super.mo1080q0(view, bundle);
        ListPreference listPreference = (ListPreference) m1734R0(m1902G(R.string.settings_key_layout_for_internet_fields));
        List m1057g = AnyApplication.m191k(m1866k()).m1057g();
        CharSequence[] charSequenceArr = new CharSequence[m1057g.size() + 1];
        int i = 0;
        charSequenceArr[0] = m1908D(R.string.no_internet_fields_specific_layout);
        CharSequence[] charSequenceArr2 = new CharSequence[m1057g.size() + 1];
        charSequenceArr2[0] = "none";
        while (i < m1057g.size()) {
            C1671g0 c1671g0 = (C1671g0) m1057g.get(i);
            i++;
            charSequenceArr[i] = c1671g0.f4706b + "\n" + ((Object) c1671g0.f4707c);
            charSequenceArr2[i] = c1671g0.f4705a;
        }
        listPreference.mo3296O(charSequenceArr);
        listPreference.f585W = charSequenceArr2;
    }
}