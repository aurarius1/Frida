package p183e.p184a.p185l.p186a;

import android.os.Handler;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.l.a.e */
/* loaded from: classes.dex */
public final class RunnableC2108e implements Runnable, InterfaceC2112c {

    /* renamed from: b */
    public final Handler f7014b;

    /* renamed from: c */
    public final Runnable f7015c;

    public RunnableC2108e(Handler handler, Runnable runnable) {
        this.f7014b = handler;
        this.f7015c = runnable;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7014b.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f7015c.run();
        } catch (Throwable th) {
            AbstractC1438d.m1044f(th);
        }
    }
}