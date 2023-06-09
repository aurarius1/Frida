package p000a.p001a.p002a.p004b;

import android.content.Intent;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: a.a.a.b.g */
/* loaded from: classes.dex */
public class RunnableC0009g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0014l f13b;

    public RunnableC0009g(C0014l c0014l) {
        this.f13b = c0014l;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0014l c0014l = this.f13b;
        if (c0014l.f27g == 0) {
            return;
        }
        c0014l.f27g = 2;
        if (C0019q.f35a && c0014l.f28h != null) {
            StringBuilder m1187i = AbstractC1124a.m1187i("mServiceConnection should be null. Instead it is ");
            m1187i.append(this.f13b.f28h);
            throw new RuntimeException(m1187i.toString());
        } else if (c0014l.f29i != null) {
            StringBuilder m1187i2 = AbstractC1124a.m1187i("mServiceBinderWrapper should be null. Instead it is ");
            m1187i2.append(this.f13b.f29i);
            throw new RuntimeException(m1187i2.toString());
        } else if (c0014l.f30j != null) {
            StringBuilder m1187i3 = AbstractC1124a.m1187i("mCallbacksMessenger should be null. Instead it is ");
            m1187i3.append(this.f13b.f30j);
            throw new RuntimeException(m1187i3.toString());
        } else {
            Intent intent = new Intent("android.media.browse.MediaBrowserService");
            intent.setComponent(this.f13b.f22b);
            C0014l c0014l2 = this.f13b;
            ServiceConnectionC0013k serviceConnectionC0013k = new ServiceConnectionC0013k(c0014l2);
            c0014l2.f28h = serviceConnectionC0013k;
            boolean z = false;
            try {
                z = c0014l2.f21a.bindService(intent, serviceConnectionC0013k, 1);
            } catch (Exception unused) {
                StringBuilder m1187i4 = AbstractC1124a.m1187i("Failed binding to service ");
                m1187i4.append(this.f13b.f22b);
                m1187i4.toString();
            }
            if (!z) {
                this.f13b.m3541h();
                this.f13b.f23c.m1792a();
            }
            if (C0019q.f35a) {
                this.f13b.m3542g();
            }
        }
    }
}