package p010b.p011a.p013l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import p010b.p011a.AbstractActivityC0057g;
import p010b.p011a.C0055e;
import p010b.p011a.RunnableC0053c;
import p010b.p011a.RunnableC0054d;
import p010b.p011a.p013l.p014h.AbstractC0071b;
import p010b.p011a.p013l.p014h.C0070a;
import p010b.p046j.p047d.AbstractC0472e;

/* renamed from: b.a.l.c */
/* loaded from: classes.dex */
public class C0065c {

    /* renamed from: a */
    public final /* synthetic */ String f859a;

    /* renamed from: b */
    public final /* synthetic */ int f860b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0071b f861c;

    /* renamed from: d */
    public final /* synthetic */ C0055e f862d;

    public C0065c(C0055e c0055e, String str, int i, AbstractC0071b abstractC0071b) {
        this.f862d = c0055e;
        this.f859a = str;
        this.f860b = i;
        this.f861c = abstractC0071b;
    }

    /* renamed from: a */
    public void m3088a(Object obj) {
        Bundle bundle;
        this.f862d.f840e.add(this.f859a);
        C0055e c0055e = this.f862d;
        int i = this.f860b;
        AbstractC0071b abstractC0071b = this.f861c;
        AbstractActivityC0057g abstractActivityC0057g = c0055e.f844i;
        C0070a mo3086b = abstractC0071b.mo3086b(abstractActivityC0057g, obj);
        if (mo3086b != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0053c(c0055e, i, mo3086b));
            return;
        }
        Intent mo2109a = abstractC0071b.mo2109a(abstractActivityC0057g, obj);
        if (mo2109a.getExtras() != null && mo2109a.getExtras().getClassLoader() == null) {
            mo2109a.setExtrasClassLoader(abstractActivityC0057g.getClassLoader());
        }
        if (mo2109a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = mo2109a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            mo2109a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo2109a.getAction())) {
            String[] stringArrayExtra = mo2109a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0472e.m2429d(abstractActivityC0057g, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo2109a.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) mo2109a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.f131b;
                Intent intent = intentSenderRequest.f132c;
                int i2 = intentSenderRequest.f133d;
                int i3 = intentSenderRequest.f134e;
                Object obj2 = AbstractC0472e.f2456a;
                if (Build.VERSION.SDK_INT >= 16) {
                    abstractActivityC0057g.startIntentSenderForResult(intentSender, i, intent, i2, i3, 0, bundle);
                } else {
                    abstractActivityC0057g.startIntentSenderForResult(intentSender, i, intent, i2, i3, 0);
                }
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0054d(c0055e, i, e));
            }
        } else {
            Object obj3 = AbstractC0472e.f2456a;
            if (Build.VERSION.SDK_INT >= 16) {
                abstractActivityC0057g.startActivityForResult(mo2109a, i, bundle);
            } else {
                abstractActivityC0057g.startActivityForResult(mo2109a, i);
            }
        }
    }

    /* renamed from: b */
    public void m3087b() {
        this.f862d.m3093g(this.f859a);
    }
}