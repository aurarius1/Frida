package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.t0 */
/* loaded from: classes.dex */
public final class C2212t0 extends AtomicReference implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public static final C2210s0[] f7220b = new C2210s0[0];

    /* renamed from: c */
    public static final C2210s0[] f7221c = new C2210s0[0];

    /* renamed from: e */
    public final AtomicReference f7223e;

    /* renamed from: g */
    public Throwable f7225g;

    /* renamed from: d */
    public final AtomicBoolean f7222d = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicReference f7224f = new AtomicReference();

    public C2212t0(AtomicReference atomicReference) {
        this.f7223e = atomicReference;
        lazySet(f7220b);
    }

    /* renamed from: a */
    public void m86a(C2210s0 c2210s0) {
        C2210s0[] c2210s0Arr;
        C2210s0[] c2210s0Arr2;
        do {
            c2210s0Arr = (C2210s0[]) get();
            int length = c2210s0Arr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2210s0Arr[i] == c2210s0) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            c2210s0Arr2 = f7220b;
            if (length != 1) {
                c2210s0Arr2 = new C2210s0[length - 1];
                System.arraycopy(c2210s0Arr, 0, c2210s0Arr2, 0, i);
                System.arraycopy(c2210s0Arr, i + 1, c2210s0Arr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(c2210s0Arr, c2210s0Arr2));
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        this.f7225g = th;
        this.f7224f.lazySet(EnumC2131c.DISPOSED);
        for (C2210s0 c2210s0 : (C2210s0[]) getAndSet(f7221c)) {
            c2210s0.f7217b.mo28b(th);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m122c(this.f7224f, interfaceC2112c);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7224f.lazySet(EnumC2131c.DISPOSED);
        for (C2210s0 c2210s0 : (C2210s0[]) getAndSet(f7221c)) {
            c2210s0.f7217b.mo26d();
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        getAndSet(f7221c);
        this.f7223e.compareAndSet(this, null);
        EnumC2131c.m124a(this.f7224f);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        for (C2210s0 c2210s0 : (C2210s0[]) get()) {
            c2210s0.f7217b.mo25g(obj);
        }
    }
}