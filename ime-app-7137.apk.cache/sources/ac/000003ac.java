package p010b.p077q;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;
import p010b.p046j.p047d.AbstractC0478k;

/* renamed from: b.q.c0 */
/* loaded from: classes.dex */
public class C0808c0 extends MediaBrowserService {

    /* renamed from: b */
    public final InterfaceC0812e0 f3322b;

    public C0808c0(Context context, InterfaceC0812e0 interfaceC0812e0) {
        attachBaseContext(context);
        this.f3322b = interfaceC0812e0;
    }

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        AbstractC0040o.m3456a(bundle);
        InterfaceC0812e0 interfaceC0812e0 = this.f3322b;
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        C0819i c0819i = (C0819i) interfaceC0812e0;
        c0819i.getClass();
        if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
            bundle2.remove("extra_client_version");
            c0819i.f3333c = new Messenger(c0819i.f3334d.f570e);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            AbstractC0478k.m2424b(bundle3, "extra_messenger", c0819i.f3333c.getBinder());
            c0819i.f3334d.getClass();
            c0819i.f3331a.add(bundle3);
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = c0819i.f3334d;
        new HashMap();
        if (Build.VERSION.SDK_INT >= 28) {
            new MediaSessionManager.RemoteUserInfo(str, -1, i);
        }
        mediaBrowserServiceCompat.getClass();
        c0819i.f3334d.m3309b(str, i, bundle2);
        c0819i.f3334d.getClass();
        return null;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result result) {
        C0819i c0819i = (C0819i) this.f3322b;
        c0819i.f3334d.m3308c(str, new C0817h(c0819i, str, new C0810d0(result)));
    }
}