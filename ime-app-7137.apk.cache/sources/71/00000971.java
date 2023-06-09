package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicInteger;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p198f.C2235b;
import p183e.p184a.p190p.p200h.C2260b;

/* renamed from: e.a.p.e.a.g */
/* loaded from: classes.dex */
public final class C2180g extends AtomicInteger implements InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7110b;

    /* renamed from: c */
    public final InterfaceC2127i f7111c;

    /* renamed from: d */
    public final C2177f[] f7112d;

    /* renamed from: e */
    public Object[] f7113e;

    /* renamed from: f */
    public final C2235b f7114f;

    /* renamed from: g */
    public final boolean f7115g;

    /* renamed from: h */
    public volatile boolean f7116h;

    /* renamed from: i */
    public volatile boolean f7117i;

    /* renamed from: j */
    public final C2260b f7118j = new C2260b();

    /* renamed from: k */
    public int f7119k;

    /* renamed from: l */
    public int f7120l;

    public C2180g(InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i, int i, int i2, boolean z) {
        this.f7110b = interfaceC2098f;
        this.f7111c = interfaceC2127i;
        this.f7115g = z;
        this.f7113e = new Object[i];
        C2177f[] c2177fArr = new C2177f[i];
        for (int i3 = 0; i3 < i; i3++) {
            c2177fArr[i3] = new C2177f(this, i3);
        }
        this.f7112d = c2177fArr;
        this.f7114f = new C2235b(i2);
    }

    /* renamed from: a */
    public void m103a() {
        for (C2177f c2177f : this.f7112d) {
            EnumC2131c.m124a(c2177f);
        }
    }

    /* renamed from: b */
    public void m102b(C2235b c2235b) {
        synchronized (this) {
            this.f7113e = null;
        }
        c2235b.clear();
    }

    /* renamed from: c */
    public void m101c() {
        if (getAndIncrement() != 0) {
            return;
        }
        C2235b c2235b = this.f7114f;
        InterfaceC2098f interfaceC2098f = this.f7110b;
        boolean z = this.f7115g;
        int i = 1;
        while (!this.f7116h) {
            if (z || this.f7118j.get() == null) {
                boolean z2 = this.f7117i;
                Object[] objArr = (Object[]) c2235b.mo69a();
                boolean z3 = objArr == null;
                if (z2 && z3) {
                    m102b(c2235b);
                    Throwable m54b = this.f7118j.m54b();
                    if (m54b == null) {
                        interfaceC2098f.mo26d();
                        return;
                    } else {
                        interfaceC2098f.mo28b(m54b);
                        return;
                    }
                } else if (z3) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        Object mo24a = this.f7111c.mo24a(objArr);
                        AbstractC2148n.m110a(mo24a, "The combiner returned a null value");
                        interfaceC2098f.mo25g(mo24a);
                    } catch (Throwable th) {
                        AbstractC1438d.m1039k(th);
                        this.f7118j.m55a(th);
                    }
                }
            }
            m103a();
            m102b(c2235b);
            interfaceC2098f.mo28b(this.f7118j.m54b());
            return;
        }
        m102b(c2235b);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7116h) {
            return;
        }
        this.f7116h = true;
        m103a();
        if (getAndIncrement() == 0) {
            m102b(this.f7114f);
        }
    }
}