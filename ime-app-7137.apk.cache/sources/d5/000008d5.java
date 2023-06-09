package com.anysoftkeyboard.p180ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p067m.p068d.C0668a;
import p093c.p097b.p108i0.C1253n;
import p093c.p097b.p108i0.p109o.C1261h;

/* renamed from: com.anysoftkeyboard.ui.SendBugReportUiActivity */
/* loaded from: classes.dex */
public class SendBugReportUiActivity extends AbstractActivityC0681d0 {

    /* renamed from: n */
    public BugReportDetails f6598n;

    /* renamed from: com.anysoftkeyboard.ui.SendBugReportUiActivity$BugReportDetails */
    /* loaded from: classes.dex */
    public class BugReportDetails implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C1253n();

        /* renamed from: b */
        public final Throwable f6599b;

        /* renamed from: c */
        public final String f6600c;

        public BugReportDetails(Parcel parcel) {
            this.f6599b = (Throwable) parcel.readSerializable();
            this.f6600c = parcel.readString();
        }

        public BugReportDetails(Throwable th, String str) {
            this.f6599b = th;
            this.f6600c = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.f6599b);
            parcel.writeString(this.f6600c);
        }
    }

    public void onCancelCrashReport(View view) {
        finish();
    }

    public void onClickOnType(View view) {
        findViewById(R.id.logcat_fragment_container).setVisibility(0);
        C0668a c0668a = new C0668a(m2102l());
        c0668a.m2110n(R.id.logcat_fragment_container, new C1261h());
        c0668a.m2119e();
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.send_crash_log_ui);
    }

    public void onSendCrashReport(View view) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"ask+crash@evendanan.net"});
        intent.putExtra("android.intent.extra.SUBJECT", getText(R.string.ime_crashed_title));
        intent.putExtra("android.intent.extra.TEXT", this.f6598n.f6600c);
        try {
            Intent createChooser = Intent.createChooser(intent, getString(R.string.ime_crashed_intent_selector_title));
            createChooser.putExtra("android.intent.extra.EMAIL", intent.getStringArrayExtra("android.intent.extra.EMAIL"));
            createChooser.putExtra("android.intent.extra.SUBJECT", intent.getStringExtra("android.intent.extra.SUBJECT"));
            createChooser.putExtra("android.intent.extra.TEXT", this.f6598n.f6600c);
            String str = "Will send crash report using " + createChooser;
            startActivity(createChooser);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(getApplicationContext(), "Unable to send bug report via e-mail!", 1).show();
        }
        finish();
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onStart() {
        super.onStart();
        TextView textView = (TextView) findViewById(R.id.ime_crash_type);
        BugReportDetails bugReportDetails = (BugReportDetails) getIntent().getParcelableExtra("EXTRA_KEY_BugReportDetails");
        this.f6598n = bugReportDetails;
        if (bugReportDetails == null) {
            finish();
            return;
        }
        Throwable th = bugReportDetails.f6599b;
        textView.setVisibility(8);
    }
}