package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p108i0.p110p.C1344k1;
import p093c.p097b.p108i0.p110p.C1347l1;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.z1.h */
/* loaded from: classes.dex */
public class View$OnClickListenerC1396h extends AbstractC1395g implements View.OnClickListener {

    /* renamed from: X */
    public DemoAnyKeyboardView f4630X;

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: Q0 */
    public int mo1084Q0() {
        return R.layout.keyboard_setup_wizard_page_additional_settings_layout;
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: R0 */
    public boolean mo1083R0(Context context) {
        return false;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Z */
    public void mo1096Z() {
        this.f3214G = true;
        this.f4630X.mo411b();
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        AbstractC1762t m922b = ((C1671g0) AnyApplication.m191k(m1866k()).m1058f()).m922b(1);
        m922b.mo837i(this.f4630X.getThemedKeyboardDimens());
        this.f4630X.m416C(m922b, null, null);
        AbstractC1077v0.m1289O(this.f3216I, R.id.go_to_languages_action, 0, R.id.go_to_theme_action, 0, R.id.go_to_all_settings_action);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractComponentCallbacksC0763z c1344k1;
        BasicAnyActivity basicAnyActivity = (BasicAnyActivity) m1872h();
        int id = view.getId();
        if (id == R.id.go_to_all_settings_action) {
            m1887O0(new Intent(m1866k(), MainSettingsActivity.class));
            basicAnyActivity.finish();
            return;
        }
        if (id == R.id.go_to_languages_action) {
            c1344k1 = new C1344k1();
        } else if (id != R.id.go_to_theme_action) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle ");
            m1187i.append(view.getId());
            m1187i.append(" in WizardPageDoneAndMoreSettingsFragment");
            throw new IllegalArgumentException(m1187i.toString());
        } else {
            c1344k1 = new C1347l1();
        }
        basicAnyActivity.m374t(c1344k1, AbstractC2289b.f7441b);
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4629W = (ImageView) view.findViewById(R.id.step_state_icon);
        view.findViewById(R.id.go_to_languages_action).setOnClickListener(this);
        view.findViewById(R.id.go_to_theme_action).setOnClickListener(this);
        view.findViewById(R.id.go_to_all_settings_action).setOnClickListener(this);
        this.f4630X = (DemoAnyKeyboardView) view.findViewById(R.id.demo_keyboard_view);
    }
}