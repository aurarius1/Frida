package p010b.p077q;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p007v4.p008os.ResultReceiver;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import p000a.p001a.p002a.p004b.C0019q;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;
import p010b.p046j.p047d.AbstractC0478k;

/* renamed from: b.q.b0 */
/* loaded from: classes.dex */
public final class HandlerC0806b0 extends Handler {

    /* renamed from: a */
    public final C0840z f3319a;

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat f3320b;

    public HandlerC0806b0(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f3320b = mediaBrowserServiceCompat;
        this.f3319a = new C0840z(mediaBrowserServiceCompat);
    }

    /* renamed from: a */
    public void m1794a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                AbstractC0040o.m3456a(bundle);
                C0840z c0840z = this.f3319a;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i2 = data.getInt("data_calling_uid");
                C0804a0 c0804a0 = new C0804a0(message.replyTo);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = c0840z.f3393a;
                mediaBrowserServiceCompat.getClass();
                boolean z = false;
                if (string != null) {
                    String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i2);
                    int length = packagesForUid.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (packagesForUid[i3].equals(string)) {
                                z = true;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                if (z) {
                    c0840z.f3393a.f570e.m1794a(new RunnableC0831q(c0840z, c0804a0, string, i, i2, bundle));
                    return;
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
            case 2:
                C0840z c0840z2 = this.f3319a;
                c0840z2.f3393a.f570e.m1794a(new RunnableC0832r(c0840z2, new C0804a0(message.replyTo)));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                AbstractC0040o.m3456a(bundle2);
                C0840z c0840z3 = this.f3319a;
                c0840z3.f3393a.f570e.m1794a(new RunnableC0833s(c0840z3, new C0804a0(message.replyTo), data.getString("data_media_item_id"), AbstractC0478k.m2425a(data, "data_callback_token"), bundle2));
                return;
            case 4:
                C0840z c0840z4 = this.f3319a;
                c0840z4.f3393a.f570e.m1794a(new RunnableC0834t(c0840z4, new C0804a0(message.replyTo), data.getString("data_media_item_id"), AbstractC0478k.m2425a(data, "data_callback_token")));
                return;
            case 5:
                C0840z c0840z5 = this.f3319a;
                String string2 = data.getString("data_media_item_id");
                ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                C0804a0 c0804a02 = new C0804a0(message.replyTo);
                c0840z5.getClass();
                if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                    return;
                }
                c0840z5.f3393a.f570e.m1794a(new RunnableC0835u(c0840z5, c0804a02, string2, resultReceiver));
                return;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                AbstractC0040o.m3456a(bundle3);
                C0840z c0840z6 = this.f3319a;
                c0840z6.f3393a.f570e.m1794a(new RunnableC0836v(c0840z6, new C0804a0(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3));
                return;
            case 7:
                C0840z c0840z7 = this.f3319a;
                c0840z7.f3393a.f570e.m1794a(new RunnableC0837w(c0840z7, new C0804a0(message.replyTo)));
                return;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                AbstractC0040o.m3456a(bundle4);
                C0840z c0840z8 = this.f3319a;
                String string3 = data.getString("data_search_query");
                ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                C0804a0 c0804a03 = new C0804a0(message.replyTo);
                c0840z8.getClass();
                if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                    return;
                }
                c0840z8.f3393a.f570e.m1794a(new RunnableC0838x(c0840z8, c0804a03, string3, bundle4, resultReceiver2));
                return;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                AbstractC0040o.m3456a(bundle5);
                C0840z c0840z9 = this.f3319a;
                String string4 = data.getString("data_custom_action");
                ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                C0804a0 c0804a04 = new C0804a0(message.replyTo);
                c0840z9.getClass();
                if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                    return;
                }
                c0840z9.f3393a.f570e.m1794a(new RunnableC0839y(c0840z9, c0804a04, string4, bundle5, resultReceiver3));
                return;
            default:
                String str = "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1;
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(C0019q.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        data.putInt("data_calling_pid", Binder.getCallingPid());
        return super.sendMessageAtTime(message, j);
    }
}