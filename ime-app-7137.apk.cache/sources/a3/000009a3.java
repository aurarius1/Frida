package p183e.p184a.p190p.p195e.p197b;

import p183e.p184a.InterfaceC2103k;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.p.e.b.f */
/* loaded from: classes.dex */
public final class C2230f implements InterfaceC2103k {

    /* renamed from: b */
    public final InterfaceC2103k f7285b;

    /* renamed from: c */
    public final /* synthetic */ C2231g f7286c;

    public C2230f(C2231g c2231g, InterfaceC2103k interfaceC2103k) {
        this.f7286c = c2231g;
        this.f7285b = interfaceC2103k;
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: a */
    public void mo73a(Object obj) {
        this.f7285b.mo73a(obj);
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: b */
    public void mo72b(Throwable th) {
        this.f7286c.getClass();
        Object obj = this.f7286c.f7288b;
        if (obj != null) {
            this.f7285b.mo73a(obj);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
        nullPointerException.initCause(th);
        this.f7285b.mo72b(nullPointerException);
    }

    @Override // p183e.p184a.InterfaceC2103k
    /* renamed from: c */
    public void mo71c(InterfaceC2112c interfaceC2112c) {
        this.f7285b.mo71c(interfaceC2112c);
    }
}