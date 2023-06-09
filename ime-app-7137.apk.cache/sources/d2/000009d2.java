package p183e.p184a.p203s;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p200h.AbstractC2262d;
import p183e.p184a.p190p.p200h.C2259a;
import p183e.p184a.p190p.p200h.C2263e;
import p183e.p184a.p190p.p200h.EnumC2264f;

/* renamed from: e.a.s.b */
/* loaded from: classes.dex */
public final class C2277b extends AbstractC2285j {

    /* renamed from: b */
    public static final Object[] f7408b = new Object[0];

    /* renamed from: c */
    public static final C2276a[] f7409c = new C2276a[0];

    /* renamed from: d */
    public static final C2276a[] f7410d = new C2276a[0];

    /* renamed from: e */
    public final AtomicReference f7411e;

    /* renamed from: f */
    public final AtomicReference f7412f;

    /* renamed from: g */
    public final ReadWriteLock f7413g;

    /* renamed from: h */
    public final Lock f7414h;

    /* renamed from: i */
    public final Lock f7415i;

    /* renamed from: j */
    public final AtomicReference f7416j;

    /* renamed from: k */
    public long f7417k;

    public C2277b(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7413g = reentrantReadWriteLock;
        this.f7414h = reentrantReadWriteLock.readLock();
        this.f7415i = reentrantReadWriteLock.writeLock();
        this.f7412f = new AtomicReference(f7409c);
        AtomicReference atomicReference = new AtomicReference();
        this.f7411e = atomicReference;
        this.f7416j = new AtomicReference();
        if (obj != null) {
            atomicReference.lazySet(obj);
            return;
        }
        throw new NullPointerException("defaultValue is null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0082, code lost:
        r8 = r8.f7384a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
        if (r8 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
        if (r2 >= 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
        r4 = r8[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (r4 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
        if (r0.mo40a(r4) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r8 = (java.lang.Object[]) r8[4];
     */
    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        boolean z;
        C2276a c2276a = new C2276a(interfaceC2098f, this);
        interfaceC2098f.mo27c(c2276a);
        while (true) {
            C2276a[] c2276aArr = (C2276a[]) this.f7412f.get();
            if (c2276aArr != f7410d) {
                int length = c2276aArr.length;
                C2276a[] c2276aArr2 = new C2276a[length + 1];
                System.arraycopy(c2276aArr, 0, c2276aArr2, 0, length);
                c2276aArr2[length] = c2276a;
                if (this.f7412f.compareAndSet(c2276aArr, c2276aArr2)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            if (c2276a.f7406h) {
                m38T(c2276a);
                return;
            } else if (c2276a.f7406h) {
                return;
            } else {
                synchronized (c2276a) {
                    if (!c2276a.f7406h && !c2276a.f7402d) {
                        C2277b c2277b = c2276a.f7401c;
                        Lock lock = c2277b.f7414h;
                        lock.lock();
                        c2276a.f7407i = c2277b.f7417k;
                        Object obj = c2277b.f7411e.get();
                        lock.unlock();
                        c2276a.f7403e = obj != null;
                        c2276a.f7402d = true;
                        if (obj != null && !c2276a.mo40a(obj)) {
                            while (!c2276a.f7406h) {
                                synchronized (c2276a) {
                                    C2259a c2259a = c2276a.f7404f;
                                    if (c2259a == null) {
                                        c2276a.f7403e = false;
                                    } else {
                                        c2276a.f7404f = null;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
        }
        Throwable th = (Throwable) this.f7416j.get();
        if (th == AbstractC2262d.f7387a) {
            interfaceC2098f.mo26d();
        } else {
            interfaceC2098f.mo28b(th);
        }
    }

    /* renamed from: T */
    public void m38T(C2276a c2276a) {
        C2276a[] c2276aArr;
        C2276a[] c2276aArr2;
        do {
            c2276aArr = (C2276a[]) this.f7412f.get();
            int length = c2276aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2276aArr[i] == c2276a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2276aArr2 = f7409c;
            } else {
                C2276a[] c2276aArr3 = new C2276a[length - 1];
                System.arraycopy(c2276aArr, 0, c2276aArr3, 0, i);
                System.arraycopy(c2276aArr, i + 1, c2276aArr3, i, (length - i) - 1);
                c2276aArr2 = c2276aArr3;
            }
        } while (!this.f7412f.compareAndSet(c2276aArr, c2276aArr2));
    }

    /* renamed from: U */
    public void m37U(Object obj) {
        this.f7415i.lock();
        this.f7417k++;
        this.f7411e.lazySet(obj);
        this.f7415i.unlock();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.f7416j.compareAndSet(null, th)) {
            AbstractC1438d.m1044f(th);
            return;
        }
        C2263e c2263e = new C2263e(th);
        AtomicReference atomicReference = this.f7412f;
        C2276a[] c2276aArr = f7410d;
        C2276a[] c2276aArr2 = (C2276a[]) atomicReference.getAndSet(c2276aArr);
        if (c2276aArr2 != c2276aArr) {
            m37U(c2263e);
        }
        for (C2276a c2276a : c2276aArr2) {
            c2276a.m39b(c2263e, this.f7417k);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (this.f7416j.get() != null) {
            interfaceC2112c.mo35e();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (this.f7416j.compareAndSet(null, AbstractC2262d.f7387a)) {
            EnumC2264f enumC2264f = EnumC2264f.COMPLETE;
            AtomicReference atomicReference = this.f7412f;
            C2276a[] c2276aArr = f7410d;
            C2276a[] c2276aArr2 = (C2276a[]) atomicReference.getAndSet(c2276aArr);
            if (c2276aArr2 != c2276aArr) {
                m37U(enumC2264f);
            }
            for (C2276a c2276a : c2276aArr2) {
                c2276a.m39b(enumC2264f, this.f7417k);
            }
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.f7416j.get() != null) {
            return;
        }
        m37U(obj);
        for (C2276a c2276a : (C2276a[]) this.f7412f.get()) {
            c2276a.m39b(obj, this.f7417k);
        }
    }
}