package p093c.p097b.p108i0.p110p;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.C0875i0;
import p010b.p082t.InterfaceC0890q;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p129y.C1656a;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;
import p204f.p205a.p209b.C2296g;
import p204f.p205a.p209b.InterfaceC2294e;

/* renamed from: c.b.i0.p.g1 */
/* loaded from: classes.dex */
public class C1332g1 extends AbstractC0904x implements InterfaceC0890q {

    /* renamed from: e0 */
    public static final /* synthetic */ int f4549e0 = 0;

    /* renamed from: f0 */
    public C2296g f4550f0;

    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_addtional_ui_addons_prefs);
    }

    @Override // p010b.p082t.InterfaceC0890q
    /* renamed from: a */
    public boolean mo1123a(Preference preference) {
        AbstractComponentCallbacksC0763z c1323d1;
        AbstractActivityC0681d0 m1872h = m1872h();
        if (m1872h == null || !(m1872h instanceof BasicAnyActivity)) {
            return false;
        }
        BasicAnyActivity basicAnyActivity = (BasicAnyActivity) m1872h;
        String str = preference.f620m;
        if (str.equals(m1908D(R.string.tweaks_group_key))) {
            c1323d1 = new C1383x1();
        } else if (str.equals("settings_key_ext_kbd_top_row_key")) {
            c1323d1 = new C1329f1();
        } else if (!str.equals("settings_key_ext_kbd_bottom_row_key")) {
            if ("settings_key_supported_row_modes".equals(str)) {
                this.f4550f0.m20b(1, null);
                return true;
            }
            return false;
        } else {
            c1323d1 = new C1323d1();
        }
        basicAnyActivity.m374t(c1323d1, AbstractC2289b.f7441b);
        return true;
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.more_ui_settings_group));
        Preference m1734R0 = m1734R0("settings_key_ext_kbd_top_row_key");
        m1734R0.f614g = this;
        m1734R0.mo3289H(m1906E(R.string.top_generic_row_summary, ((C1656a) AnyApplication.m188n(m1866k()).m1058f()).f4706b));
        Preference m1734R02 = m1734R0("settings_key_ext_kbd_bottom_row_key");
        m1734R02.f614g = this;
        m1734R02.mo3289H(m1906E(R.string.bottom_generic_row_summary, ((C1656a) AnyApplication.m193i(m1866k()).m1058f()).f4706b));
        m1734R0("settings_key_supported_row_modes").f614g = this;
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        super.mo526p0();
        this.f4550f0.m21a();
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        super.mo1080q0(view, bundle);
        this.f4550f0 = new C2296g(m1872h(), new InterfaceC2294e() { // from class: c.b.i0.p.c
            @Override // p204f.p205a.p209b.InterfaceC2294e
            /* renamed from: a */
            public final void mo23a(C0119p c0119p, int i, Object obj) {
                C1332g1 c1332g1 = C1332g1.this;
                int i2 = C1332g1.f4549e0;
                final SharedPreferences m1746a = C0875i0.m1746a(c1332g1.m1866k());
                final boolean[] zArr = {m1746a.getBoolean("settings_key_support_keyboard_type_state_row_type_2", true), m1746a.getBoolean("settings_key_support_keyboard_type_state_row_type_3", true), m1746a.getBoolean("settings_key_support_keyboard_type_state_row_type_4", true), m1746a.getBoolean("settings_key_support_keyboard_type_state_row_type_5", true)};
                c0119p.f1026a.f938c = R.drawable.ic_settings_language;
                c0119p.m3056h(R.string.supported_keyboard_row_modes_title);
                c0119p.m3060d(17039360, new DialogInterface.OnClickListener() { // from class: c.b.i0.p.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = C1332g1.f4549e0;
                        dialogInterface.cancel();
                    }
                });
                c0119p.m3058f(R.string.label_done_key, new DialogInterface.OnClickListener() { // from class: c.b.i0.p.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        SharedPreferences sharedPreferences = m1746a;
                        boolean[] zArr2 = zArr;
                        int i4 = C1332g1.f4549e0;
                        dialogInterface.dismiss();
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        for (int i5 = 0; i5 < zArr2.length; i5++) {
                            StringBuilder m1187i = AbstractC1124a.m1187i("settings_key_support_keyboard_type_state_row_type_");
                            m1187i.append(i5 + 2);
                            edit.putBoolean(m1187i.toString(), zArr2[i5]);
                        }
                        edit.apply();
                    }
                });
                DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: c.b.i0.p.d
                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3, boolean z) {
                        boolean[] zArr2 = zArr;
                        int i4 = C1332g1.f4549e0;
                        zArr2[i3] = z;
                    }
                };
                C0111l c0111l = c0119p.f1026a;
                c0111l.f951p = c0111l.f936a.getResources().getTextArray(R.array.all_input_field_modes);
                C0111l c0111l2 = c0119p.f1026a;
                c0111l2.f959x = onMultiChoiceClickListener;
                c0111l2.f955t = zArr;
                c0111l2.f956u = true;
                c0111l2.f949n = false;
            }
        });
        m1734R0(m1908D(R.string.tweaks_group_key)).f614g = this;
    }
}