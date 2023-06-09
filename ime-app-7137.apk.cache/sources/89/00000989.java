package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.p0 */
/* loaded from: classes.dex */
public final class C2204p0 implements InterfaceC2098f, InterfaceC2112c {

    /* renamed from: b */
    public static final C2202o0[] f7200b = new C2202o0[0];

    /* renamed from: c */
    public static final C2202o0[] f7201c = new C2202o0[0];

    /* renamed from: d */
    public final AtomicReference f7202d;

    /* renamed from: g */
    public final AtomicReference f7205g = new AtomicReference();

    /* renamed from: e */
    public final AtomicReference f7203e = new AtomicReference(f7200b);

    /* renamed from: f */
    public final AtomicBoolean f7204f = new AtomicBoolean();

    public C2204p0(AtomicReference atomicReference) {
        this.f7202d = atomicReference;
    }

    /* renamed from: a */
    public void m90a(C2202o0 c2202o0) {
        C2202o0[] c2202o0Arr;
        C2202o0[] c2202o0Arr2;
        do {
            c2202o0Arr = (C2202o0[]) this.f7203e.get();
            int length = c2202o0Arr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2202o0Arr[i].equals(c2202o0)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2202o0Arr2 = f7200b;
            } else {
                C2202o0[] c2202o0Arr3 = new C2202o0[length - 1];
                System.arraycopy(c2202o0Arr, 0, c2202o0Arr3, 0, i);
                System.arraycopy(c2202o0Arr, i + 1, c2202o0Arr3, i, (length - i) - 1);
                c2202o0Arr2 = c2202o0Arr3;
            }
        } while (!this.f7203e.compareAndSet(c2202o0Arr, c2202o0Arr2));
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        this.f7202d.compareAndSet(this, null);
        C2202o0[] c2202o0Arr = (C2202o0[]) this.f7203e.getAndSet(f7201c);
        if (c2202o0Arr.length == 0) {
            AbstractC1438d.m1044f(th);
            return;
        }
        for (C2202o0 c2202o0 : c2202o0Arr) {
            c2202o0.f7196b.mo28b(th);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m122c(this.f7205g, interfaceC2112c);
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        this.f7202d.compareAndSet(this, null);
        for (C2202o0 c2202o0 : (C2202o0[]) this.f7203e.getAndSet(f7201c)) {
            c2202o0.f7196b.mo26d();
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        AtomicReference atomicReference = this.f7203e;
        C2202o0[] c2202o0Arr = f7201c;
        if (((C2202o0[]) atomicReference.getAndSet(c2202o0Arr)) != c2202o0Arr) {
            this.f7202d.compareAndSet(this, null);
            EnumC2131c.m124a(this.f7205g);
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        for (C2202o0 c2202o0 : (C2202o0[]) this.f7203e.get()) {
            c2202o0.f7196b.mo25g(obj);
        }
    }
}