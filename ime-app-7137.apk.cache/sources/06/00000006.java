package p000a.p001a.p002a.p004b;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p007v4.media.session.MediaSessionCompat$Token;
import java.util.List;
import p010b.p036g.C0378b;
import p010b.p077q.p078l0.C0826a;

/* renamed from: a.a.a.b.d */
/* loaded from: classes.dex */
public class C0006d implements InterfaceC0005c, InterfaceC0015m {

    /* renamed from: a */
    public final Context f5a;

    /* renamed from: b */
    public final Object f6b;

    /* renamed from: c */
    public final Bundle f7c;

    /* renamed from: d */
    public final HandlerC0003a f8d = new HandlerC0003a(this);

    /* renamed from: e */
    public final C0378b f9e = new C0378b();

    /* renamed from: f */
    public C0017o f10f;

    /* renamed from: g */
    public Messenger f11g;

    /* renamed from: h */
    public MediaSessionCompat$Token f12h;

    public C0006d(Context context, ComponentName componentName, C0826a c0826a, Bundle bundle) {
        this.f5a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.f7c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        c0826a.f3342b = this;
        this.f6b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) c0826a.f3341a, bundle2);
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0015m
    /* renamed from: a */
    public void mo3538a(Messenger messenger) {
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0005c
    /* renamed from: b */
    public MediaSessionCompat$Token mo3545b() {
        if (this.f12h == null) {
            this.f12h = MediaSessionCompat$Token.m3454k(((MediaBrowser) this.f6b).getSessionToken(), null);
        }
        return this.f12h;
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0005c
    /* renamed from: c */
    public void mo3544c() {
        Messenger messenger;
        C0017o c0017o = this.f10f;
        if (c0017o != null && (messenger = this.f11g) != null) {
            try {
                c0017o.m3535a(7, null, messenger);
            } catch (RemoteException unused) {
            }
        }
        ((MediaBrowser) this.f6b).disconnect();
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0005c
    /* renamed from: d */
    public void mo3543d() {
        ((MediaBrowser) this.f6b).connect();
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0015m
    /* renamed from: e */
    public void mo3537e(Messenger messenger, String str, MediaSessionCompat$Token mediaSessionCompat$Token, Bundle bundle) {
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0015m
    /* renamed from: f */
    public void mo3536f(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
        if (this.f11g != messenger) {
            return;
        }
        if (((AbstractC0018p) this.f9e.getOrDefault(str, null)) != null) {
            throw null;
        }
        boolean z = C0019q.f35a;
    }
}