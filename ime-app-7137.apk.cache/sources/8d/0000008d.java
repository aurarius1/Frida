package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.List;
import p000a.p001a.p002a.p004b.C0019q;
import p010b.p077q.p078l0.C0826a;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static ComponentName m3302a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            String str = "Ignore unsupported intent: " + intent;
            return;
        }
        ComponentName m3302a = m3302a(context, "android.intent.action.MEDIA_BUTTON");
        if (m3302a != null) {
            intent.setComponent(m3302a);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
                return;
            } else {
                context.startService(intent);
                return;
            }
        }
        ComponentName m3302a2 = m3302a(context, "android.media.browse.MediaBrowserService");
        if (m3302a2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0826a c0826a = new C0826a(applicationContext, intent, goAsync);
            C0019q c0019q = new C0019q(applicationContext, m3302a2, c0826a, null);
            c0826a.f3346f = c0019q;
            c0019q.f36b.mo3543d();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}