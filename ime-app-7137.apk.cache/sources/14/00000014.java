package p000a.p001a.p002a.p004b;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p007v4.media.session.MediaSessionCompat$Token;
import p000a.p001a.p002a.p004b.p005x.AbstractBinderC0027b;
import p000a.p001a.p002a.p004b.p005x.InterfaceC0028c;
import p010b.p046j.p047d.AbstractC0478k;
import p010b.p077q.p078l0.C0826a;

/* renamed from: a.a.a.b.r */
/* loaded from: classes.dex */
public class C0020r extends MediaBrowser.ConnectionCallback {

    /* renamed from: a */
    public final C0004b f37a;

    public C0020r(C0004b c0004b) {
        this.f37a = c0004b;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        Bundle extras;
        C0004b c0004b = this.f37a;
        C0006d c0006d = c0004b.f4a.f3342b;
        if (c0006d != null && (extras = ((MediaBrowser) c0006d.f6b).getExtras()) != null) {
            extras.getInt("extra_service_version", 0);
            IBinder m2425a = AbstractC0478k.m2425a(extras, "extra_messenger");
            if (m2425a != null) {
                c0006d.f10f = new C0017o(m2425a, c0006d.f7c);
                Messenger messenger = new Messenger(c0006d.f8d);
                c0006d.f11g = messenger;
                c0006d.f8d.m3548a(messenger);
                try {
                    C0017o c0017o = c0006d.f10f;
                    Context context = c0006d.f5a;
                    Messenger messenger2 = c0006d.f11g;
                    c0017o.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("data_package_name", context.getPackageName());
                    bundle.putBundle("data_root_hints", c0017o.f34b);
                    c0017o.m3535a(6, bundle, messenger2);
                } catch (RemoteException unused) {
                }
            }
            InterfaceC0028c m3458c = AbstractBinderC0027b.m3458c(AbstractC0478k.m2425a(extras, "extra_session_binder"));
            if (m3458c != null) {
                c0006d.f12h = MediaSessionCompat$Token.m3454k(((MediaBrowser) c0006d.f6b).getSessionToken(), m3458c);
            }
        }
        c0004b.f4a.m1791b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        C0826a c0826a = this.f37a.f4a;
        C0006d c0006d = c0826a.f3342b;
        c0826a.m1792a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        C0004b c0004b = this.f37a;
        C0006d c0006d = c0004b.f4a.f3342b;
        if (c0006d != null) {
            c0006d.f10f = null;
            c0006d.f11g = null;
            c0006d.f12h = null;
            c0006d.f8d.m3548a(null);
        }
        c0004b.f4a.m1792a();
    }
}