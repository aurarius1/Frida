package p093c.p097b.p108i0.p110p;

import android.os.Build;
import android.os.Bundle;
import androidx.preference.Preference;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.C0865d0;

/* renamed from: c.b.i0.p.w1 */
/* loaded from: classes.dex */
public class C1380w1 extends AbstractC0904x {
    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_quick_text_addons_prefs);
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            Preference m1734R0 = m1734R0(m1908D(R.string.settings_key_default_emoji_gender));
            m1734R0.m3291F(false);
            if (m1734R0.f632y) {
                m1734R0.f632y = false;
                C0865d0 c0865d0 = m1734R0.f602I;
                if (c0865d0 != null) {
                    c0865d0.m1754l();
                }
            }
            if (i < 24) {
                Preference m1734R02 = m1734R0(m1908D(R.string.settings_key_default_emoji_skin_tone));
                m1734R02.m3291F(false);
                if (m1734R02.f632y) {
                    m1734R02.f632y = false;
                    C0865d0 c0865d02 = m1734R02.f602I;
                    if (c0865d02 != null) {
                        c0865d02.m1754l();
                    }
                }
            }
        }
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.quick_text_keys_group));
    }
}