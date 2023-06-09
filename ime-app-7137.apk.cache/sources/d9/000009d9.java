package p183e.p184a.p203s;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p200h.EnumC2264f;

/* renamed from: e.a.s.i */
/* loaded from: classes.dex */
public final class C2284i extends AbstractC2285j {

    /* renamed from: b */
    public static final C2282g[] f7434b = new C2282g[0];

    /* renamed from: c */
    public static final C2282g[] f7435c = new C2282g[0];

    /* renamed from: d */
    public static final Object[] f7436d = new Object[0];

    /* renamed from: e */
    public final InterfaceC2281f f7437e;

    /* renamed from: f */
    public final AtomicReference f7438f = new AtomicReference(f7434b);

    /* renamed from: g */
    public boolean f7439g;

    public C2284i(InterfaceC2281f interfaceC2281f) {
        this.f7437e = interfaceC2281f;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        boolean z;
        C2282g c2282g = new C2282g(interfaceC2098f, this);
        interfaceC2098f.mo27c(c2282g);
        if (c2282g.f7428e) {
            return;
        }
        while (true) {
            C2282g[] c2282gArr = (C2282g[]) this.f7438f.get();
            z = false;
            if (c2282gArr != f7435c) {
                int length = c2282gArr.length;
                C2282g[] c2282gArr2 = new C2282g[length + 1];
                System.arraycopy(c2282gArr, 0, c2282gArr2, 0, length);
                c2282gArr2[length] = c2282g;
                if (this.f7438f.compareAndSet(c2282gArr, c2282gArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z && c2282g.f7428e) {
            m30T(c2282g);
        } else {
            ((C2283h) this.f7437e).m32c(c2282g);
        }
    }

    /* renamed from: T */
    public void m30T(C2282g c2282g) {
        C2282g[] c2282gArr;
        C2282g[] c2282gArr2;
        do {
            c2282gArr = (C2282g[]) this.f7438f.get();
            if (c2282gArr == f7435c || c2282gArr == f7434b) {
                return;
            }
            int length = c2282gArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2282gArr[i] == c2282g) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2282gArr2 = f7434b;
            } else {
                C2282g[] c2282gArr3 = new C2282g[length - 1];
                System.arraycopy(c2282gArr, 0, c2282gArr3, 0, i);
                System.arraycopy(c2282gArr, i + 1, c2282gArr3, i, (length - i) - 1);
                c2282gArr2 = c2282gArr3;
            }
        } while (!this.f7438f.compareAndSet(c2282gArr, c2282gArr2));
    }

    /* renamed from: U */
    public C2282g[] m29U(Object obj) {
        return this.f7437e.compareAndSet(null, obj) ? (C2282g[]) this.f7438f.getAndSet(f7435c) : f7435c;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.f7439g) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7439g = true;
        Object m51b = EnumC2264f.m51b(th);
        C2283h c2283h = (C2283h) this.f7437e;
        c2283h.m34a(m51b);
        for (C2282g c2282g : m29U(m51b)) {
            c2283h.m32c(c2282g);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (this.f7439g) {
            interfaceC2112c.mo35e();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (this.f7439g) {
            return;
        }
        this.f7439g = true;
        EnumC2264f enumC2264f = EnumC2264f.COMPLETE;
        C2283h c2283h = (C2283h) this.f7437e;
        c2283h.m34a(enumC2264f);
        for (C2282g c2282g : m29U(enumC2264f)) {
            c2283h.m32c(c2282g);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.f7439g) {
            return;
        }
        InterfaceC2281f interfaceC2281f = this.f7437e;
        C2283h c2283h = (C2283h) interfaceC2281f;
        c2283h.getClass();
        C2280e c2280e = new C2280e(obj);
        C2280e c2280e2 = c2283h.f7432e;
        c2283h.f7432e = c2280e;
        c2283h.f7430c++;
        c2280e2.set(c2280e);
        int i = c2283h.f7430c;
        if (i > c2283h.f7429b) {
            c2283h.f7430c = i - 1;
            c2283h.f7431d = (C2280e) c2283h.f7431d.get();
        }
        for (C2282g c2282g : (C2282g[]) this.f7438f.get()) {
            ((C2283h) interfaceC2281f).m32c(c2282g);
        }
    }
}