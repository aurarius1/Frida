package p000a.p001a.p002a.p004b;

import android.os.Messenger;
import android.os.RemoteException;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: a.a.a.b.h */
/* loaded from: classes.dex */
public class RunnableC0010h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0014l f14b;

    public RunnableC0010h(C0014l c0014l) {
        this.f14b = c0014l;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0014l c0014l = this.f14b;
        Messenger messenger = c0014l.f30j;
        if (messenger != null) {
            try {
                c0014l.f29i.m3535a(2, null, messenger);
            } catch (RemoteException unused) {
                StringBuilder m1187i = AbstractC1124a.m1187i("RemoteException during connect for ");
                m1187i.append(this.f14b.f22b);
                m1187i.toString();
            }
        }
        C0014l c0014l2 = this.f14b;
        int i = c0014l2.f27g;
        c0014l2.m3541h();
        if (i != 0) {
            this.f14b.f27g = i;
        }
        if (C0019q.f35a) {
            this.f14b.m3542g();
        }
    }
}