package p000a.p001a.p002a.p004b;

import android.content.ComponentName;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: a.a.a.b.j */
/* loaded from: classes.dex */
public class RunnableC0012j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ComponentName f18b;

    /* renamed from: c */
    public final /* synthetic */ ServiceConnectionC0013k f19c;

    public RunnableC0012j(ServiceConnectionC0013k serviceConnectionC0013k, ComponentName componentName) {
        this.f19c = serviceConnectionC0013k;
        this.f18b = componentName;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C0019q.f35a) {
            StringBuilder m1187i = AbstractC1124a.m1187i("MediaServiceConnection.onServiceDisconnected name=");
            m1187i.append(this.f18b);
            m1187i.append(" this=");
            m1187i.append(this);
            m1187i.append(" mServiceConnection=");
            m1187i.append(this.f19c.f20a.f28h);
            m1187i.toString();
            this.f19c.f20a.m3542g();
        }
        if (this.f19c.m3547a("onServiceDisconnected")) {
            C0014l c0014l = this.f19c.f20a;
            c0014l.f29i = null;
            c0014l.f30j = null;
            c0014l.f25e.m3548a(null);
            C0014l c0014l2 = this.f19c.f20a;
            c0014l2.f27g = 4;
            c0014l2.f23c.m1792a();
        }
    }
}