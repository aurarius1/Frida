package p000a.p001a.p002a.p004b;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p007v4.media.session.MediaSessionCompat$Token;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010b.p036g.C0378b;
import p010b.p036g.C0385i;
import p010b.p077q.p078l0.C0826a;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: a.a.a.b.l */
/* loaded from: classes.dex */
public class C0014l implements InterfaceC0005c, InterfaceC0015m {

    /* renamed from: a */
    public final Context f21a;

    /* renamed from: b */
    public final ComponentName f22b;

    /* renamed from: c */
    public final C0826a f23c;

    /* renamed from: d */
    public final Bundle f24d;

    /* renamed from: e */
    public final HandlerC0003a f25e = new HandlerC0003a(this);

    /* renamed from: f */
    public final C0378b f26f = new C0378b();

    /* renamed from: g */
    public int f27g = 1;

    /* renamed from: h */
    public ServiceConnectionC0013k f28h;

    /* renamed from: i */
    public C0017o f29i;

    /* renamed from: j */
    public Messenger f30j;

    /* renamed from: k */
    public String f31k;

    /* renamed from: l */
    public MediaSessionCompat$Token f32l;

    public C0014l(Context context, ComponentName componentName, C0826a c0826a, Bundle bundle) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (componentName == null) {
            throw new IllegalArgumentException("service component must not be null");
        }
        if (c0826a == null) {
            throw new IllegalArgumentException("connection callback must not be null");
        }
        this.f21a = context;
        this.f22b = componentName;
        this.f23c = c0826a;
        this.f24d = bundle == null ? null : new Bundle(bundle);
    }

    /* renamed from: i */
    public static String m3540i(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? AbstractC1124a.m1193c("UNKNOWN/", i) : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0015m
    /* renamed from: a */
    public void mo3538a(Messenger messenger) {
        StringBuilder m1187i = AbstractC1124a.m1187i("onConnectFailed for ");
        m1187i.append(this.f22b);
        m1187i.toString();
        if (m3539j(messenger, "onConnectFailed")) {
            int i = this.f27g;
            if (i != 2) {
                m3540i(i);
                return;
            }
            m3541h();
            this.f23c.m1792a();
        }
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0005c
    /* renamed from: b */
    public MediaSessionCompat$Token mo3545b() {
        if (this.f27g == 3) {
            return this.f32l;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("getSessionToken() called while not connected(state=");
        m1187i.append(this.f27g);
        m1187i.append(")");
        throw new IllegalStateException(m1187i.toString());
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0005c
    /* renamed from: c */
    public void mo3544c() {
        this.f27g = 0;
        this.f25e.post(new RunnableC0010h(this));
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0005c
    /* renamed from: d */
    public void mo3543d() {
        int i = this.f27g;
        if (i == 0 || i == 1) {
            this.f27g = 2;
            this.f25e.post(new RunnableC0009g(this));
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("connect() called while neigther disconnecting nor disconnected (state=");
        m1187i.append(m3540i(this.f27g));
        m1187i.append(")");
        throw new IllegalStateException(m1187i.toString());
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0015m
    /* renamed from: e */
    public void mo3537e(Messenger messenger, String str, MediaSessionCompat$Token mediaSessionCompat$Token, Bundle bundle) {
        if (m3539j(messenger, "onConnect")) {
            int i = this.f27g;
            if (i != 2) {
                m3540i(i);
                return;
            }
            this.f31k = str;
            this.f32l = mediaSessionCompat$Token;
            this.f27g = 3;
            if (C0019q.f35a) {
                m3542g();
            }
            this.f23c.m1791b();
            try {
                Iterator it = ((C0385i) this.f26f.entrySet()).iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    AbstractC0018p abstractC0018p = (AbstractC0018p) entry.getValue();
                    throw null;
                }
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // p000a.p001a.p002a.p004b.InterfaceC0015m
    /* renamed from: f */
    public void mo3536f(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
        if (m3539j(messenger, "onLoadChildren")) {
            if (C0019q.f35a) {
                StringBuilder m1187i = AbstractC1124a.m1187i("onLoadChildren for ");
                m1187i.append(this.f22b);
                m1187i.append(" id=");
                m1187i.append(str);
                m1187i.toString();
            }
            if (((AbstractC0018p) this.f26f.getOrDefault(str, null)) != null) {
                throw null;
            }
        }
    }

    /* renamed from: g */
    public void m3542g() {
        StringBuilder m1187i = AbstractC1124a.m1187i("  mServiceComponent=");
        m1187i.append(this.f22b);
        m1187i.toString();
        String str = "  mCallback=" + this.f23c;
        String str2 = "  mRootHints=" + this.f24d;
        m3540i(this.f27g);
        String str3 = "  mServiceConnection=" + this.f28h;
        String str4 = "  mServiceBinderWrapper=" + this.f29i;
        String str5 = "  mCallbacksMessenger=" + this.f30j;
        String str6 = "  mMediaSessionToken=" + this.f32l;
    }

    /* renamed from: h */
    public void m3541h() {
        ServiceConnectionC0013k serviceConnectionC0013k = this.f28h;
        if (serviceConnectionC0013k != null) {
            this.f21a.unbindService(serviceConnectionC0013k);
        }
        this.f27g = 1;
        this.f28h = null;
        this.f29i = null;
        this.f30j = null;
        this.f25e.m3548a(null);
        this.f31k = null;
        this.f32l = null;
    }

    /* renamed from: j */
    public final boolean m3539j(Messenger messenger, String str) {
        int i;
        if (this.f30j != messenger || (i = this.f27g) == 0 || i == 1) {
            int i2 = this.f27g;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            String str2 = str + " for " + this.f22b + " with mCallbacksMessenger=" + this.f30j + " this=" + this;
            return false;
        }
        return true;
    }
}