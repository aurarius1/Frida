package p183e.p184a;

import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p199g.C2245j;

/* renamed from: e.a.g */
/* loaded from: classes.dex */
public final class RunnableC2099g implements InterfaceC2112c, Runnable {

    /* renamed from: b */
    public final Runnable f7005b;

    /* renamed from: c */
    public final AbstractC2100h f7006c;

    /* renamed from: d */
    public Thread f7007d;

    public RunnableC2099g(Runnable runnable, AbstractC2100h abstractC2100h) {
        this.f7005b = runnable;
        this.f7006c = abstractC2100h;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7007d == Thread.currentThread()) {
            AbstractC2100h abstractC2100h = this.f7006c;
            if (abstractC2100h instanceof C2245j) {
                C2245j c2245j = (C2245j) abstractC2100h;
                if (c2245j.f7347c) {
                    return;
                }
                c2245j.f7347c = true;
                c2245j.f7346b.shutdown();
                return;
            }
        }
        this.f7006c.mo35e();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7007d = Thread.currentThread();
        try {
            this.f7005b.run();
        } finally {
            mo35e();
            this.f7007d = null;
        }
    }
}