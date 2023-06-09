package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p193c.InterfaceC2149a;
import p183e.p184a.p190p.p193c.InterfaceC2152d;
import p183e.p184a.p190p.p198f.C2235b;
import p183e.p184a.p190p.p200h.C2260b;

/* renamed from: e.a.p.e.a.j */
/* loaded from: classes.dex */
public final class C2189j extends AtomicInteger implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7148b;

    /* renamed from: c */
    public final InterfaceC2127i f7149c;

    /* renamed from: d */
    public final int f7150d;

    /* renamed from: e */
    public final C2260b f7151e = new C2260b();

    /* renamed from: f */
    public final C2186i f7152f;

    /* renamed from: g */
    public final boolean f7153g;

    /* renamed from: h */
    public InterfaceC2152d f7154h;

    /* renamed from: i */
    public InterfaceC2112c f7155i;

    /* renamed from: j */
    public volatile boolean f7156j;

    /* renamed from: k */
    public volatile boolean f7157k;

    /* renamed from: l */
    public volatile boolean f7158l;

    /* renamed from: m */
    public int f7159m;

    public C2189j(InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i, int i, boolean z) {
        this.f7148b = interfaceC2098f;
        this.f7149c = interfaceC2127i;
        this.f7150d = i;
        this.f7153g = z;
        this.f7152f = new C2186i(interfaceC2098f, this);
    }

    /* renamed from: a */
    public void m97a() {
        if (getAndIncrement() != 0) {
            return;
        }
        InterfaceC2098f interfaceC2098f = this.f7148b;
        InterfaceC2152d interfaceC2152d = this.f7154h;
        C2260b c2260b = this.f7151e;
        while (true) {
            if (!this.f7156j) {
                if (!this.f7158l) {
                    if (!this.f7153g && ((Throwable) c2260b.get()) != null) {
                        interfaceC2152d.clear();
                        this.f7158l = true;
                        break;
                    }
                    boolean z = this.f7157k;
                    try {
                        Object mo69a = interfaceC2152d.mo69a();
                        boolean z2 = mo69a == null;
                        if (z && z2) {
                            this.f7158l = true;
                            Throwable m54b = c2260b.m54b();
                            if (m54b != null) {
                                interfaceC2098f.mo28b(m54b);
                                return;
                            } else {
                                interfaceC2098f.mo26d();
                                return;
                            }
                        } else if (!z2) {
                            try {
                                Object mo24a = this.f7149c.mo24a(mo69a);
                                AbstractC2148n.m110a(mo24a, "The mapper returned a null ObservableSource");
                                InterfaceC2097e interfaceC2097e = (InterfaceC2097e) mo24a;
                                if (interfaceC2097e instanceof Callable) {
                                    try {
                                        Object call = ((Callable) interfaceC2097e).call();
                                        if (call != null && !this.f7158l) {
                                            interfaceC2098f.mo25g(call);
                                        }
                                    } catch (Throwable th) {
                                        AbstractC1438d.m1039k(th);
                                        c2260b.m55a(th);
                                    }
                                } else {
                                    this.f7156j = true;
                                    interfaceC2097e.mo89a(this.f7152f);
                                }
                            } catch (Throwable th2) {
                                AbstractC1438d.m1039k(th2);
                                this.f7158l = true;
                                this.f7155i.mo35e();
                                interfaceC2152d.clear();
                                c2260b.m55a(th2);
                                interfaceC2098f.mo28b(c2260b.m54b());
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC1438d.m1039k(th3);
                        this.f7158l = true;
                        this.f7155i.mo35e();
                        c2260b.m55a(th3);
                    }
                } else {
                    interfaceC2152d.clear();
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (!this.f7151e.m55a(th)) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7157k = true;
        m97a();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7155i, interfaceC2112c)) {
            this.f7155i = interfaceC2112c;
            if (interfaceC2112c instanceof InterfaceC2149a) {
                InterfaceC2149a interfaceC2149a = (InterfaceC2149a) interfaceC2112c;
                int mo74h = interfaceC2149a.mo74h(3);
                if (mo74h == 1) {
                    this.f7159m = mo74h;
                    this.f7154h = interfaceC2149a;
                    this.f7157k = true;
                    this.f7148b.mo27c(this);
                    m97a();
                    return;
                } else if (mo74h == 2) {
                    this.f7159m = mo74h;
                    this.f7154h = interfaceC2149a;
                    this.f7148b.mo27c(this);
                    return;
                }
            }
            this.f7154h = new C2235b(this.f7150d);
            this.f7148b.mo27c(this);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7157k = true;
        m97a();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7158l = true;
        this.f7155i.mo35e();
        EnumC2131c.m124a(this.f7152f);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7159m == 0) {
            this.f7154h.mo68f(obj);
        }
        m97a();
    }
}