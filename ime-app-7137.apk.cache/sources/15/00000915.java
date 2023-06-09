package com.menny.android.anysoftkeyboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import p010b.p086w.AbstractC1077v0;

/* loaded from: classes.dex */
public class LauncherSettingsActivity extends Activity {

    /* renamed from: b */
    public boolean f6991b = false;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6991b = bundle.getBoolean("LAUNCHED_KEY", false);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f6991b = bundle.getBoolean("LAUNCHED_KEY");
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f6991b) {
            finish();
        } else {
            startActivity(AbstractC1077v0.m1299E(getApplication()) ? new Intent(this, MainSettingsActivity.class) : new Intent(this, BasicAnyActivity.class));
        }
        this.f6991b = true;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("LAUNCHED_KEY", this.f6991b);
    }
}