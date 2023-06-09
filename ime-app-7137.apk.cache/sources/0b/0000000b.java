package p000a.p001a.p002a.p004b;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: a.a.a.b.i */
/* loaded from: classes.dex */
public class RunnableC0011i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ComponentName f15b;

    /* renamed from: c */
    public final /* synthetic */ IBinder f16c;

    /* renamed from: d */
    public final /* synthetic */ ServiceConnectionC0013k f17d;

    public RunnableC0011i(ServiceConnectionC0013k serviceConnectionC0013k, ComponentName componentName, IBinder iBinder) {
        this.f17d = serviceConnectionC0013k;
        this.f15b = componentName;
        this.f16c = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = C0019q.f35a;
        if (z) {
            StringBuilder m1187i = AbstractC1124a.m1187i("MediaServiceConnection.onServiceConnected name=");
            m1187i.append(this.f15b);
            m1187i.append(" binder=");
            m1187i.append(this.f16c);
            m1187i.toString();
            this.f17d.f20a.m3542g();
        }
        if (this.f17d.m3547a("onServiceConnected")) {
            C0014l c0014l = this.f17d.f20a;
            c0014l.f29i = new C0017o(this.f16c, c0014l.f24d);
            this.f17d.f20a.f30j = new Messenger(this.f17d.f20a.f25e);
            C0014l c0014l2 = this.f17d.f20a;
            c0014l2.f25e.m3548a(c0014l2.f30j);
            C0014l c0014l3 = this.f17d.f20a;
            c0014l3.f27g = 2;
            if (z) {
                try {
                    c0014l3.m3542g();
                } catch (RemoteException unused) {
                    StringBuilder m1187i2 = AbstractC1124a.m1187i("RemoteException during connect for ");
                    m1187i2.append(this.f17d.f20a.f22b);
                    m1187i2.toString();
                    if (C0019q.f35a) {
                        this.f17d.f20a.m3542g();
                        return;
                    }
                    return;
                }
            }
            C0014l c0014l4 = this.f17d.f20a;
            C0017o c0017o = c0014l4.f29i;
            Context context = c0014l4.f21a;
            Messenger messenger = c0014l4.f30j;
            c0017o.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", c0017o.f34b);
            c0017o.m3535a(1, bundle, messenger);
        }
    }
}