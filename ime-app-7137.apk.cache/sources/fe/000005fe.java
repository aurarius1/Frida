package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;

/* renamed from: c.b.i0.p.z1.n */
/* loaded from: classes.dex */
public class C1402n extends AbstractC1395g {
    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: Q0 */
    public int mo1084Q0() {
        return R.layout.keyboard_setup_wizard_page_switch_to_layout;
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: R0 */
    public boolean mo1083R0(Context context) {
        return AbstractC1077v0.m1298F(context);
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: S0 */
    public void mo1082S0() {
        if (m1872h() != null) {
            boolean m1298F = AbstractC1077v0.m1298F(m1872h());
            this.f4629W.setImageResource(m1298F ? R.drawable.ic_wizard_switch_on : R.drawable.ic_wizard_switch_off);
            this.f4629W.setClickable(!m1298F);
        }
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4629W = (ImageView) view.findViewById(R.id.step_state_icon);
        View$OnClickListenerC1401m view$OnClickListenerC1401m = new View$OnClickListenerC1401m(this);
        view.findViewById(R.id.go_to_switch_keyboard_action).setOnClickListener(view$OnClickListenerC1401m);
        this.f4629W.setOnClickListener(view$OnClickListenerC1401m);
    }
}