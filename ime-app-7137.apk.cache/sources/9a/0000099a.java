package p183e.p184a.p190p.p195e.p196a;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p193c.InterfaceC2151c;
import p183e.p184a.p190p.p193c.InterfaceC2152d;
import p183e.p184a.p190p.p198f.C2234a;
import p183e.p184a.p190p.p198f.C2235b;
import p183e.p184a.p190p.p200h.AbstractC2262d;
import p183e.p184a.p190p.p200h.C2260b;

/* renamed from: e.a.p.e.a.y */
/* loaded from: classes.dex */
public final class C2221y extends AtomicInteger implements InterfaceC2112c, InterfaceC2098f {

    /* renamed from: b */
    public static final C2219x[] f7248b = new C2219x[0];

    /* renamed from: c */
    public static final C2219x[] f7249c = new C2219x[0];

    /* renamed from: d */
    public final InterfaceC2098f f7250d;

    /* renamed from: e */
    public final InterfaceC2127i f7251e;

    /* renamed from: f */
    public final boolean f7252f;

    /* renamed from: g */
    public final int f7253g;

    /* renamed from: h */
    public final int f7254h;

    /* renamed from: i */
    public volatile InterfaceC2151c f7255i;

    /* renamed from: j */
    public volatile boolean f7256j;

    /* renamed from: k */
    public final C2260b f7257k = new C2260b();

    /* renamed from: l */
    public volatile boolean f7258l;

    /* renamed from: m */
    public final AtomicReference f7259m;

    /* renamed from: n */
    public InterfaceC2112c f7260n;

    /* renamed from: o */
    public long f7261o;

    /* renamed from: p */
    public long f7262p;

    /* renamed from: q */
    public int f7263q;

    /* renamed from: r */
    public Queue f7264r;

    /* renamed from: s */
    public int f7265s;

    public C2221y(InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i, boolean z, int i, int i2) {
        this.f7250d = interfaceC2098f;
        this.f7251e = interfaceC2127i;
        this.f7252f = z;
        this.f7253g = i;
        this.f7254h = i2;
        if (i != Integer.MAX_VALUE) {
            this.f7264r = new ArrayDeque(i);
        }
        this.f7259m = new AtomicReference(f7248b);
    }

    /* renamed from: a */
    public boolean m81a() {
        if (this.f7258l) {
            return true;
        }
        Throwable th = (Throwable) this.f7257k.get();
        if (this.f7252f || th == null) {
            return false;
        }
        m80f();
        Throwable m54b = this.f7257k.m54b();
        if (m54b != AbstractC2262d.f7387a) {
            this.f7250d.mo28b(m54b);
        }
        return true;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (this.f7256j) {
            AbstractC1438d.m1044f(th);
        } else if (!this.f7257k.m55a(th)) {
            AbstractC1438d.m1044f(th);
        } else {
            this.f7256j = true;
            m79i();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7260n, interfaceC2112c)) {
            this.f7260n = interfaceC2112c;
            this.f7250d.mo27c(this);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (this.f7256j) {
            return;
        }
        this.f7256j = true;
        m79i();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        Throwable m54b;
        if (this.f7258l) {
            return;
        }
        this.f7258l = true;
        if (!m80f() || (m54b = this.f7257k.m54b()) == null || m54b == AbstractC2262d.f7387a) {
            return;
        }
        AbstractC1438d.m1044f(m54b);
    }

    /* renamed from: f */
    public boolean m80f() {
        C2219x[] c2219xArr;
        this.f7260n.mo35e();
        C2219x[] c2219xArr2 = (C2219x[]) this.f7259m.get();
        C2219x[] c2219xArr3 = f7249c;
        if (c2219xArr2 == c2219xArr3 || (c2219xArr = (C2219x[]) this.f7259m.getAndSet(c2219xArr3)) == c2219xArr3) {
            return false;
        }
        for (C2219x c2219x : c2219xArr) {
            EnumC2131c.m124a(c2219x);
        }
        return true;
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7256j) {
            return;
        }
        try {
            Object mo24a = this.f7251e.mo24a(obj);
            AbstractC2148n.m110a(mo24a, "The mapper returned a null ObservableSource");
            InterfaceC2097e interfaceC2097e = (InterfaceC2097e) mo24a;
            if (this.f7253g != Integer.MAX_VALUE) {
                synchronized (this) {
                    int i = this.f7265s;
                    if (i == this.f7253g) {
                        this.f7264r.offer(interfaceC2097e);
                        return;
                    }
                    this.f7265s = i + 1;
                }
            }
            m76l(interfaceC2097e);
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            this.f7260n.mo35e();
            mo28b(th);
        }
    }

    /* renamed from: i */
    public void m79i() {
        if (getAndIncrement() == 0) {
            m78j();
        }
    }

    /* renamed from: j */
    public void m78j() {
        int i;
        int i2;
        InterfaceC2098f interfaceC2098f = this.f7250d;
        int i3 = 1;
        while (!m81a()) {
            InterfaceC2151c interfaceC2151c = this.f7255i;
            int i4 = 0;
            if (interfaceC2151c != null) {
                while (!m81a()) {
                    Object mo69a = interfaceC2151c.mo69a();
                    if (mo69a != null) {
                        interfaceC2098f.mo25g(mo69a);
                        i4++;
                    }
                }
                return;
            }
            if (i4 == 0) {
                boolean z = this.f7256j;
                InterfaceC2151c interfaceC2151c2 = this.f7255i;
                C2219x[] c2219xArr = (C2219x[]) this.f7259m.get();
                int length = c2219xArr.length;
                if (this.f7253g != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.f7264r.size();
                    }
                } else {
                    i = 0;
                }
                if (z && ((interfaceC2151c2 == null || interfaceC2151c2.isEmpty()) && length == 0 && i == 0)) {
                    Throwable m54b = this.f7257k.m54b();
                    if (m54b != AbstractC2262d.f7387a) {
                        if (m54b == null) {
                            interfaceC2098f.mo26d();
                            return;
                        } else {
                            interfaceC2098f.mo28b(m54b);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j = this.f7262p;
                    int i5 = this.f7263q;
                    if (length <= i5 || c2219xArr[i5].f7239b != j) {
                        if (length <= i5) {
                            i5 = 0;
                        }
                        for (int i6 = 0; i6 < length && c2219xArr[i5].f7239b != j; i6++) {
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.f7263q = i5;
                        this.f7262p = c2219xArr[i5].f7239b;
                    }
                    while (i2 < length) {
                        if (m81a()) {
                            return;
                        }
                        C2219x c2219x = c2219xArr[i5];
                        InterfaceC2152d interfaceC2152d = c2219x.f7242e;
                        if (interfaceC2152d != null) {
                            while (true) {
                                try {
                                    Object mo69a2 = interfaceC2152d.mo69a();
                                    if (mo69a2 == null) {
                                        break;
                                    }
                                    interfaceC2098f.mo25g(mo69a2);
                                    if (m81a()) {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    AbstractC1438d.m1039k(th);
                                    EnumC2131c.m124a(c2219x);
                                    this.f7257k.m55a(th);
                                    if (m81a()) {
                                        return;
                                    }
                                    m77k(c2219x);
                                    i4++;
                                    i5++;
                                    if (i5 != length) {
                                    }
                                }
                            }
                        }
                        boolean z2 = c2219x.f7241d;
                        InterfaceC2152d interfaceC2152d2 = c2219x.f7242e;
                        if (z2 && (interfaceC2152d2 == null || interfaceC2152d2.isEmpty())) {
                            m77k(c2219x);
                            if (m81a()) {
                                return;
                            }
                            i4++;
                        }
                        i5++;
                        i2 = i5 != length ? i2 + 1 : 0;
                        i5 = 0;
                    }
                    this.f7263q = i5;
                    this.f7262p = c2219xArr[i5].f7239b;
                }
                if (i4 == 0) {
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else if (this.f7253g != Integer.MAX_VALUE) {
                    m75m(i4);
                }
            } else if (this.f7253g != Integer.MAX_VALUE) {
                m75m(i4);
            }
        }
    }

    /* renamed from: k */
    public void m77k(C2219x c2219x) {
        C2219x[] c2219xArr;
        C2219x[] c2219xArr2;
        do {
            c2219xArr = (C2219x[]) this.f7259m.get();
            int length = c2219xArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2219xArr[i] == c2219x) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2219xArr2 = f7248b;
            } else {
                C2219x[] c2219xArr3 = new C2219x[length - 1];
                System.arraycopy(c2219xArr, 0, c2219xArr3, 0, i);
                System.arraycopy(c2219xArr, i + 1, c2219xArr3, i, (length - i) - 1);
                c2219xArr2 = c2219xArr3;
            }
        } while (!this.f7259m.compareAndSet(c2219xArr, c2219xArr2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (decrementAndGet() == 0) goto L49;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m76l(InterfaceC2097e interfaceC2097e) {
        boolean z;
        boolean z2;
        Object call;
        do {
            z = false;
            if (!(interfaceC2097e instanceof Callable)) {
                long j = this.f7261o;
                this.f7261o = 1 + j;
                C2219x c2219x = new C2219x(this, j);
                while (true) {
                    C2219x[] c2219xArr = (C2219x[]) this.f7259m.get();
                    if (c2219xArr == f7249c) {
                        EnumC2131c.m124a(c2219x);
                        break;
                    }
                    int length = c2219xArr.length;
                    C2219x[] c2219xArr2 = new C2219x[length + 1];
                    System.arraycopy(c2219xArr, 0, c2219xArr2, 0, length);
                    c2219xArr2[length] = c2219x;
                    if (this.f7259m.compareAndSet(c2219xArr, c2219xArr2)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    interfaceC2097e.mo89a(c2219x);
                    return;
                }
                return;
            }
            try {
                call = ((Callable) interfaceC2097e).call();
            } catch (Throwable th) {
                AbstractC1438d.m1039k(th);
                this.f7257k.m55a(th);
                m79i();
            }
            if (call != null) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f7250d.mo25g(call);
                } else {
                    InterfaceC2151c interfaceC2151c = this.f7255i;
                    if (interfaceC2151c == null) {
                        interfaceC2151c = this.f7253g == Integer.MAX_VALUE ? new C2235b(this.f7254h) : new C2234a(this.f7253g);
                        this.f7255i = interfaceC2151c;
                    }
                    if (!interfaceC2151c.mo68f(call)) {
                        mo28b(new IllegalStateException("Scalar queue full?!"));
                    } else if (getAndIncrement() != 0) {
                        z2 = false;
                        if (z2 || this.f7253g == Integer.MAX_VALUE) {
                            return;
                        }
                        synchronized (this) {
                            interfaceC2097e = (InterfaceC2097e) this.f7264r.poll();
                            if (interfaceC2097e == null) {
                                this.f7265s--;
                                z = true;
                            }
                        }
                    }
                }
                m78j();
            }
            z2 = true;
            if (z2) {
                return;
            }
            return;
        } while (!z);
        m79i();
    }

    /* renamed from: m */
    public void m75m(int i) {
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            synchronized (this) {
                InterfaceC2097e interfaceC2097e = (InterfaceC2097e) this.f7264r.poll();
                if (interfaceC2097e == null) {
                    this.f7265s--;
                } else {
                    m76l(interfaceC2097e);
                }
            }
            i = i2;
        }
    }
}