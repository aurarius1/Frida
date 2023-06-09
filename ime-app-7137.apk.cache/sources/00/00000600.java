package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.i0.p.z1.p */
/* loaded from: classes.dex */
public class View$OnClickListenerC1404p extends AbstractC1395g implements View.OnClickListener {

    /* renamed from: X */
    public DemoAnyKeyboardView f4645X;

    /* renamed from: Y */
    public Runnable f4646Y;

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: Q0 */
    public int mo1084Q0() {
        return R.layout.keyboard_setup_wizard_page_welcome_layout;
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: R0 */
    public boolean mo1083R0(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("setup_wizard_STARTED_SETUP_PREF_KEY", false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Z */
    public void mo1096Z() {
        this.f3214G = true;
        this.f4645X.mo411b();
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        RunnableC1403o runnableC1403o = new RunnableC1403o(m1866k(), this.f4645X);
        this.f4646Y = runnableC1403o;
        runnableC1403o.run();
        AbstractC1077v0.m1289O(this.f3216I, R.id.go_to_start_setup);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.go_to_start_setup) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(m1866k()).edit();
            edit.putBoolean("setup_wizard_STARTED_SETUP_PREF_KEY", true);
            edit.apply();
            m1102T0();
        } else if (id == R.id.setup_wizard_welcome_privacy_action) {
            m1887O0(new Intent("android.intent.action.VIEW", Uri.parse(m1908D(R.string.privacy_policy))));
        } else {
            StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle ");
            m1187i.append(view.getId());
            m1187i.append(" in WizardPageDoneAndMoreSettingsFragment");
            throw new IllegalArgumentException(m1187i.toString());
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        this.f3214G = true;
        this.f4645X.removeCallbacks(this.f4646Y);
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4629W = (ImageView) view.findViewById(R.id.step_state_icon);
        view.findViewById(R.id.go_to_start_setup).setOnClickListener(this);
        view.findViewById(R.id.setup_wizard_welcome_privacy_action).setOnClickListener(this);
        this.f4645X = (DemoAnyKeyboardView) view.findViewById(R.id.demo_keyboard_view);
    }
}