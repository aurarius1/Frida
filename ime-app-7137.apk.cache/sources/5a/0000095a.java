package p183e.p184a.p190p.p194d;

import java.util.concurrent.CountDownLatch;
import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.p.d.e */
/* loaded from: classes.dex */
public final class C2157e extends CountDownLatch implements InterfaceC2103k {

    /* renamed from: b */
    public Object f7051b;

    /* renamed from: c */
    public Throwable f7052c;

    /* renamed from: d */
    public InterfaceC2112c f7053d;

    /* renamed from: e */
    public volatile boolean f7054e;

    public C2157e() {
        super(1);
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: a */
    public void mo73a(Object obj) {
        this.f7051b = obj;
        countDown();
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: b */
    public void mo72b(Throwable th) {
        this.f7052c = th;
        countDown();
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: c */
    public void mo71c(InterfaceC2112c interfaceC2112c) {
        this.f7053d = interfaceC2112c;
        if (this.f7054e) {
            interfaceC2112c.mo35e();
        }
    }
}