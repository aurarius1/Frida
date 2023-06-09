package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;

/* renamed from: c.b.i0.p.z1.l */
/* loaded from: classes.dex */
public class C1400l extends AbstractC1395g {

    /* renamed from: X */
    public static final /* synthetic */ int f4634X = 0;

    /* renamed from: Y */
    public final Handler f4635Y = new HandlerC1397i(this, Looper.getMainLooper());

    /* renamed from: Z */
    public final ContentObserver f4636Z = new C1398j(this, null);

    /* renamed from: a0 */
    public Context f4637a0 = null;

    /* renamed from: b0 */
    public Intent f4638b0 = null;

    /* renamed from: c0 */
    public Context f4639c0;

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: N */
    public void mo1100N(Bundle bundle) {
        this.f3214G = true;
        this.f4637a0 = m1872h().getBaseContext();
        Intent intent = new Intent(this.f4637a0, BasicAnyActivity.class);
        this.f4638b0 = intent;
        intent.addFlags(268435456);
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: Q0 */
    public int mo1084Q0() {
        return R.layout.keyboard_setup_wizard_page_enable_layout;
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: R0 */
    public boolean mo1083R0(Context context) {
        return AbstractC1077v0.m1299E(context);
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g
    /* renamed from: S0 */
    public void mo1082S0() {
        if (m1872h() != null) {
            boolean m1299E = AbstractC1077v0.m1299E(m1872h());
            this.f4629W.setImageResource(m1299E ? R.drawable.ic_wizard_enabled_on : R.drawable.ic_wizard_enabled_off);
            this.f4629W.setClickable(!m1299E);
        }
    }

    /* renamed from: U0 */
    public final void m1099U0() {
        this.f4635Y.removeMessages(447);
        Context context = this.f4639c0;
        if (context != null) {
            context.getContentResolver().unregisterContentObserver(this.f4636Z);
            this.f4639c0 = null;
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Y */
    public void mo1098Y() {
        this.f3214G = true;
        m1099U0();
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        this.f4635Y.removeMessages(446);
        m1099U0();
    }

    @Override // p093c.p097b.p108i0.p110p.p113z1.AbstractC1395g, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4629W = (ImageView) view.findViewById(R.id.step_state_icon);
        View$OnClickListenerC1399k view$OnClickListenerC1399k = new View$OnClickListenerC1399k(this);
        view.findViewById(R.id.go_to_language_settings_action).setOnClickListener(view$OnClickListenerC1399k);
        this.f4629W.setOnClickListener(view$OnClickListenerC1399k);
    }
}