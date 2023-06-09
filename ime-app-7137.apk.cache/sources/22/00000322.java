package p010b.p067m.p068d;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import p010b.p011a.p013l.p014h.AbstractC0071b;

/* renamed from: b.m.d.a1 */
/* loaded from: classes.dex */
public class C0670a1 extends AbstractC0071b {
    @Override // p010b.p011a.p013l.p014h.AbstractC0071b
    /* renamed from: a */
    public Intent mo2109a(Context context, Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest.f132c;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f131b, null, intentSenderRequest.f133d, intentSenderRequest.f134e);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        if (C0690f1.m2078S(2)) {
            String str = "CreateIntent created the following intent: " + intent;
        }
        return intent;
    }

    @Override // p010b.p011a.p013l.p014h.AbstractC0071b
    /* renamed from: c */
    public Object mo2108c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}