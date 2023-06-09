package p093c.p097b.p108i0.p110p.p113z1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;

/* renamed from: c.b.i0.p.z1.e */
/* loaded from: classes.dex */
public class View$OnClickListenerC1393e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1394f f4627b;

    public View$OnClickListenerC1393e(C1394f c1394f) {
        this.f4627b = c1394f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1394f c1394f = this.f4627b;
        c1394f.f4628X = true;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(c1394f.m1866k()).edit();
        edit.putBoolean("setup_wizard_SKIPPED_PREF_KEY", true);
        edit.apply();
        this.f4627b.m1102T0();
    }
}