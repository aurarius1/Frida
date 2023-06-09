package com.anysoftkeyboard.p180ui.tutorials;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.menny.android.anysoftkeyboard.R;

/* renamed from: com.anysoftkeyboard.ui.tutorials.TestersNoticeActivity */
/* loaded from: classes.dex */
public class TestersNoticeActivity extends Activity {
    public void onCloseClicked(View view) {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.testers_version);
    }
}