package p093c.p097b.p108i0.p110p.p113z1;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;
import com.menny.android.anysoftkeyboard.R;

/* renamed from: c.b.i0.p.z1.k */
/* loaded from: classes.dex */
public class View$OnClickListenerC1399k implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1400l f4633b;

    public View$OnClickListenerC1399k(C1400l c1400l) {
        this.f4633b = c1400l;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1400l c1400l = this.f4633b;
        c1400l.f4639c0 = c1400l.m1872h().getApplicationContext();
        this.f4633b.f4639c0.getContentResolver().registerContentObserver(Settings.Secure.CONTENT_URI, true, this.f4633b.f4636Z);
        this.f4633b.f4635Y.removeMessages(447);
        Handler handler = this.f4633b.f4635Y;
        handler.sendMessageDelayed(handler.obtainMessage(447), 45000L);
        Intent intent = new Intent("android.settings.INPUT_METHOD_SETTINGS");
        intent.setFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        try {
            this.f4633b.f4639c0.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.f4633b.f4639c0, (int) R.string.setup_wizard_step_one_action_error_no_settings_activity, 1).show();
        }
    }
}