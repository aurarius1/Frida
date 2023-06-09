package p093c.p097b.p108i0.p110p;

import android.os.Bundle;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import p010b.p016c.p017k.AbstractActivityC0127t;
import p010b.p082t.AbstractC0904x;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.i0.p.u1 */
/* loaded from: classes.dex */
public class C1374u1 extends AbstractC0904x {

    /* renamed from: e0 */
    public InterfaceC2112c f4607e0 = AbstractC1077v0.m1266m();

    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.night_mode_prefs);
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.night_mode_screen));
        this.f4607e0 = AbstractC1438d.m1045e(m1866k(), R.string.settings_key_night_mode_app_theme_control, R.bool.settings_default_true).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.t0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                ((AbstractActivityC0127t) C1374u1.this.m1872h()).m3026p().mo3015d();
            }
        }, new C1215b("NightModeSettingsFragment"), AbstractC2146l.f7038c, AbstractC2146l.f7039d);
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        super.mo526p0();
        this.f4607e0.mo35e();
    }
}