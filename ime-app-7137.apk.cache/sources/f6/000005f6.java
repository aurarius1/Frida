package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p121t.C1450g;

/* renamed from: c.b.i0.p.z1.f */
/* loaded from: classes.dex */
public class C1394f extends AbstractC1395g {

    /* renamed from: X */
    public boolean f4628X;

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: Q0 */
    public int mo1084Q0() {
        return R.layout.keyboard_setup_wizard_page_download_language_pack;
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: R0 */
    public boolean mo1083R0(Context context) {
        if (!PreferenceManager.getDefaultSharedPreferences(context).getBoolean("setup_wizard_SKIPPED_PREF_KEY", false)) {
            C1450g c1450g = AnyApplication.f6979b;
            if (!AbstractC1077v0.m1255x(((AnyApplication) context.getApplicationContext()).f6982e.m1059e())) {
                return false;
            }
        }
        return true;
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: S0 */
    public void mo1082S0() {
        if (m1872h() != null) {
            boolean mo1083R0 = mo1083R0(m1872h());
            this.f4629W.setImageResource((!mo1083R0 || this.f4628X) ? R.drawable.ic_wizard_download_pack_missing : R.drawable.ic_wizard_download_pack_ready);
            this.f4629W.setClickable(!mo1083R0);
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        this.f4628X = PreferenceManager.getDefaultSharedPreferences(m1866k()).getBoolean("setup_wizard_SKIPPED_PREF_KEY", false);
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4629W = (ImageView) view.findViewById(R.id.step_state_icon);
        View$OnClickListenerC1392d view$OnClickListenerC1392d = new View$OnClickListenerC1392d(this);
        view.findViewById(R.id.go_to_download_packs_action).setOnClickListener(view$OnClickListenerC1392d);
        this.f4629W.setOnClickListener(view$OnClickListenerC1392d);
        view.findViewById(R.id.skip_download_packs_action).setOnClickListener(new View$OnClickListenerC1393e(this));
    }
}