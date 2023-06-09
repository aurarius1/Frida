package p010b.p011a;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: b.a.d */
/* loaded from: classes.dex */
public class RunnableC0054d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f833b;

    /* renamed from: c */
    public final /* synthetic */ IntentSender.SendIntentException f834c;

    /* renamed from: d */
    public final /* synthetic */ C0055e f835d;

    public RunnableC0054d(C0055e c0055e, int i, IntentSender.SendIntentException sendIntentException) {
        this.f835d = c0055e;
        this.f833b = i;
        this.f834c = sendIntentException;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f835d.m3098b(this.f833b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f834c));
    }
}