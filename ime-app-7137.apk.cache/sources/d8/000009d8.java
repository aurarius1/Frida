package p183e.p184a.p203s;

import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p200h.EnumC2264f;

/* renamed from: e.a.s.h */
/* loaded from: classes.dex */
public final class C2283h extends AtomicReference implements InterfaceC2281f {

    /* renamed from: b */
    public final int f7429b;

    /* renamed from: c */
    public int f7430c;

    /* renamed from: d */
    public volatile C2280e f7431d;

    /* renamed from: e */
    public C2280e f7432e;

    /* renamed from: f */
    public volatile boolean f7433f;

    public C2283h(int i) {
        AbstractC2148n.m109b(i, "maxSize");
        this.f7429b = i;
        C2280e c2280e = new C2280e(null);
        this.f7432e = c2280e;
        this.f7431d = c2280e;
    }

    /* renamed from: a */
    public void m34a(Object obj) {
        C2280e c2280e = new C2280e(obj);
        C2280e c2280e2 = this.f7432e;
        this.f7432e = c2280e;
        this.f7430c++;
        c2280e2.lazySet(c2280e);
        C2280e c2280e3 = this.f7431d;
        if (c2280e3.f7424b != null) {
            C2280e c2280e4 = new C2280e(null);
            c2280e4.lazySet(c2280e3.get());
            this.f7431d = c2280e4;
        }
        this.f7433f = true;
    }

    /* renamed from: b */
    public Object m33b() {
        C2280e c2280e = this.f7431d;
        C2280e c2280e2 = null;
        while (true) {
            C2280e c2280e3 = (C2280e) c2280e.get();
            if (c2280e3 == null) {
                break;
            }
            c2280e2 = c2280e;
            c2280e = c2280e3;
        }
        Object obj = c2280e.f7424b;
        if (obj == null) {
            return null;
        }
        return (EnumC2264f.m49d(obj) || EnumC2264f.m48e(obj)) ? c2280e2.f7424b : obj;
    }

    /* renamed from: c */
    public void m32c(C2282g c2282g) {
        if (c2282g.getAndIncrement() != 0) {
            return;
        }
        InterfaceC2098f interfaceC2098f = c2282g.f7425b;
        C2280e c2280e = (C2280e) c2282g.f7427d;
        if (c2280e == null) {
            c2280e = this.f7431d;
        }
        int i = 1;
        while (!c2282g.f7428e) {
            C2280e c2280e2 = (C2280e) c2280e.get();
            if (c2280e2 != null) {
                Object obj = c2280e2.f7424b;
                if (this.f7433f && c2280e2.get() == null) {
                    if (EnumC2264f.m49d(obj)) {
                        interfaceC2098f.mo26d();
                    } else {
                        interfaceC2098f.mo28b(EnumC2264f.m50c(obj));
                    }
                    c2282g.f7427d = null;
                    c2282g.f7428e = true;
                    return;
                }
                interfaceC2098f.mo25g(obj);
                c2280e = c2280e2;
            } else if (c2280e.get() != null) {
                continue;
            } else {
                c2282g.f7427d = c2280e;
                i = c2282g.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
        c2282g.f7427d = null;
    }
}