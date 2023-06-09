package com.google.android.voiceime;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.voiceime.ActivityHelper;
import java.util.ArrayList;
import p093c.p145g.p146a.p175b.C2057k;
import p093c.p145g.p146a.p175b.ServiceConnectionC2056j;

/* loaded from: classes.dex */
public class ActivityHelper extends Activity {

    /* renamed from: b */
    public C2057k f6976b;

    /* renamed from: a */
    public final void m203a(String str) {
        this.f6976b.getClass();
        bindService(new Intent(this, ServiceHelper.class), new ServiceConnectionC2056j(this, str, null), 1);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 || intent == null || !intent.hasExtra("android.speech.extra.RESULTS")) {
            m203a(null);
            return;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        final String[] strArr = (String[]) stringArrayListExtra.toArray(new String[stringArrayListExtra.size()]);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, 16973937);
        builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: c.g.a.b.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityHelper activityHelper = ActivityHelper.this;
                String[] strArr2 = strArr;
                activityHelper.getClass();
                activityHelper.m203a(strArr2[i3]);
            }
        });
        builder.setCancelable(true);
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: c.g.a.b.b
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ActivityHelper.this.m203a(null);
            }
        });
        builder.setNeutralButton(17039360, new DialogInterface.OnClickListener() { // from class: c.g.a.b.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityHelper.this.m203a(null);
            }
        });
        builder.create().show();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.f6976b = new C2057k();
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("calling_package", getApplicationContext().getPackageName());
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 5);
        if (bundle != null && (string = bundle.getString("android.speech.extra.LANGUAGE")) != null) {
            intent.putExtra("android.speech.extra.LANGUAGE", string);
        }
        startActivityForResult(intent, 1);
    }
}