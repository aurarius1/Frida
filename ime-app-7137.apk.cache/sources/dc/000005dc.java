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
import p093c.p097b.p108i0.p109o.View$OnClickListenerC1259f;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.s1 */
/* loaded from: classes.dex */
public class C1368s1 extends AbstractC0904x {

    /* renamed from: e0 */
    public static final /* synthetic */ int f4599e0 = 0;

    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_main_tweaks);
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
        Preference m1734R0 = m1734R0("dev_tools");
        if (m1734R0 != null) {
            m1734R0.f614g = new InterfaceC0890q() { // from class: c.b.i0.p.a0
                @Override // p010b.p082t.InterfaceC0890q
                /* renamed from: a */
                public final boolean mo1123a(Preference preference) {
                    C1368s1 c1368s1 = C1368s1.this;
                    int i = C1368s1.f4599e0;
                    AbstractActivityC0681d0 m1872h = c1368s1.m1872h();
                    if (m1872h == null || !(m1872h instanceof BasicAnyActivity)) {
                        return false;
                    }
                    ((BasicAnyActivity) m1872h).m374t(new View$OnClickListenerC1259f(), AbstractC2289b.f7441b);
                    return true;
                }
            };
            return;
        }
        throw new NullPointerException("Preference with key 'dev_tools' was not found in resource 2132017225");
    }
}