package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p010b.p016c.p017k.AbstractActivityC0127t;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.DialogInterfaceC0121q;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class AppSettingsDialogHolderActivity extends AbstractActivityC0127t implements DialogInterface.OnClickListener {

    /* renamed from: o */
    public DialogInterfaceC0121q f7499o;

    /* renamed from: p */
    public int f7500p;

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f7500p);
            startActivityForResult(data, 7534);
        } else if (i != -2) {
            throw new IllegalStateException(AbstractC1124a.m1193c("Unknown button type: ", i));
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) getIntent().getParcelableExtra("extra_app_settings");
        appSettingsDialog.getClass();
        appSettingsDialog.f7498i = this;
        this.f7500p = appSettingsDialog.f7497h;
        int i = appSettingsDialog.f7491b;
        C0119p c0119p = i != -1 ? new C0119p(this, i) : new C0119p(this);
        C0111l c0111l = c0119p.f1026a;
        c0111l.f949n = false;
        c0111l.f940e = appSettingsDialog.f7493d;
        c0111l.f942g = appSettingsDialog.f7492c;
        c0119p.m3057g(appSettingsDialog.f7494e, this);
        c0119p.m3059e(appSettingsDialog.f7495f, this);
        this.f7499o = c0119p.m3055i();
    }

    @Override // p010b.p016c.p017k.AbstractActivityC0127t, p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DialogInterfaceC0121q dialogInterfaceC0121q = this.f7499o;
        if (dialogInterfaceC0121q == null || !dialogInterfaceC0121q.isShowing()) {
            return;
        }
        this.f7499o.dismiss();
    }
}