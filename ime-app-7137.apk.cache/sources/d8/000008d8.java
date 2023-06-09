package com.anysoftkeyboard.p180ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.menny.android.anysoftkeyboard.R;

/* renamed from: com.anysoftkeyboard.ui.VoiceInputNotInstalledActivity */
/* loaded from: classes.dex */
public class VoiceInputNotInstalledActivity extends Activity implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.install_button) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://search?q=pname:com.google.android.voicesearch"));
            intent.setFlags(268435456);
            try {
                getApplicationContext().startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(getApplicationContext(), getText(R.string.voice_input_not_voice_pack_in_market), 1).show();
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.voice_input_not_installed);
        findViewById(R.id.install_button).setOnClickListener(this);
        findViewById(R.id.no_button).setOnClickListener(this);
    }
}