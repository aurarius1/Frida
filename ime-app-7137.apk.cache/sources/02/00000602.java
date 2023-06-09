package p093c.p097b.p108i0.p110p.p113z1;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p137d.p138a.p139a.C1785g;
import p210g.p211a.p212a.InterfaceC2302a;

/* renamed from: c.b.i0.p.z1.r */
/* loaded from: classes.dex */
public class View$OnClickListenerC1406r extends AbstractC1395g implements View.OnClickListener {
    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: Q0 */
    public int mo1084Q0() {
        return R.layout.keyboard_setup_wizard_page_permissions_layout;
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: R0 */
    public boolean mo1083R0(Context context) {
        return m1081U0(context) || AbstractC0472e.m2432a(context, "android.permission.READ_CONTACTS") == 0;
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: S0 */
    public void mo1082S0() {
        int i;
        if (m1872h() != null) {
            if (m1081U0(m1872h())) {
                this.f4629W.setClickable(true);
                i = R.drawable.ic_wizard_contacts_disabled;
            } else if (mo1083R0(m1872h())) {
                this.f4629W.setClickable(false);
                i = R.drawable.ic_wizard_contacts_on;
            } else {
                i = R.drawable.ic_wizard_contacts_off;
            }
            this.f4629W.setImageResource(i);
        }
    }

    /* renamed from: U0 */
    public final boolean m1081U0(Context context) {
        return !((Boolean) ((C1785g) AnyApplication.m182t(context).m1172a(R.string.settings_key_use_contacts_dictionary, R.bool.settings_default_contacts_dictionary)).m809b()).booleanValue();
    }

    @InterfaceC2302a(892344)
    public void enableContactsDictionary() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(m1866k()).edit();
        edit.putBoolean(m1908D(R.string.settings_key_use_contacts_dictionary), true);
        edit.apply();
        if (AbstractC1077v0.m1275d(this, 892344)) {
            m1102T0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        BasicAnyActivity basicAnyActivity = (BasicAnyActivity) m1872h();
        if (basicAnyActivity == null) {
            return;
        }
        switch (view.getId()) {
            case R.id.ask_for_permissions_action /* 2131296351 */:
            case R.id.step_state_icon /* 2131296755 */:
                enableContactsDictionary();
                return;
            case R.id.disable_contacts_dictionary /* 2131296458 */:
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(basicAnyActivity).edit();
                edit.putBoolean(m1908D(R.string.settings_key_use_contacts_dictionary), false);
                edit.apply();
                m1102T0();
                return;
            case R.id.open_permissions_wiki_action /* 2131296633 */:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(m1843z().getString(R.string.permissions_wiki_site_url)));
                try {
                    m1887O0(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    intent.getData();
                    return;
                }
            default:
                StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle ");
                m1187i.append(view.getId());
                m1187i.append(" in WizardPermissionsFragment");
                throw new IllegalArgumentException(m1187i.toString());
        }
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4629W = (ImageView) view.findViewById(R.id.step_state_icon);
        view.findViewById(R.id.ask_for_permissions_action).setOnClickListener(this);
        this.f4629W.setOnClickListener(this);
        view.findViewById(R.id.disable_contacts_dictionary).setOnClickListener(this);
        view.findViewById(R.id.open_permissions_wiki_action).setOnClickListener(this);
    }
}