package p183e.p184a.p203s;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.s.d */
/* loaded from: classes.dex */
public final class C2279d extends AbstractC2285j {

    /* renamed from: b */
    public static final C2278c[] f7420b = new C2278c[0];

    /* renamed from: c */
    public static final C2278c[] f7421c = new C2278c[0];

    /* renamed from: d */
    public final AtomicReference f7422d = new AtomicReference(f7421c);

    /* renamed from: e */
    public Throwable f7423e;

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        boolean z;
        C2278c c2278c = new C2278c(interfaceC2098f, this);
        interfaceC2098f.mo27c(c2278c);
        while (true) {
            C2278c[] c2278cArr = (C2278c[]) this.f7422d.get();
            z = false;
            if (c2278cArr != f7420b) {
                int length = c2278cArr.length;
                C2278c[] c2278cArr2 = new C2278c[length + 1];
                System.arraycopy(c2278cArr, 0, c2278cArr2, 0, length);
                c2278cArr2[length] = c2278c;
                if (this.f7422d.compareAndSet(c2278cArr, c2278cArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            if (c2278c.get()) {
                m36T(c2278c);
                return;
            }
            return;
        }
        Throwable th = this.f7423e;
        if (th != null) {
            interfaceC2098f.mo28b(th);
        } else {
            interfaceC2098f.mo26d();
        }
    }

    /* renamed from: T */
    public void m36T(C2278c c2278c) {
        C2278c[] c2278cArr;
        C2278c[] c2278cArr2;
        do {
            c2278cArr = (C2278c[]) this.f7422d.get();
            if (c2278cArr == f7420b || c2278cArr == f7421c) {
                return;
            }
            int length = c2278cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2278cArr[i] == c2278c) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2278cArr2 = f7421c;
            } else {
                C2278c[] c2278cArr3 = new C2278c[length - 1];
                System.arraycopy(c2278cArr, 0, c2278cArr3, 0, i);
                System.arraycopy(c2278cArr, i + 1, c2278cArr3, i, (length - i) - 1);
                c2278cArr2 = c2278cArr3;
            }
        } while (!this.f7422d.compareAndSet(c2278cArr, c2278cArr2));
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        C2278c[] c2278cArr;
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj = this.f7422d.get();
        Object obj2 = f7420b;
        if (obj == obj2) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7423e = th;
        for (C2278c c2278c : (C2278c[]) this.f7422d.getAndSet(obj2)) {
            if (c2278c.get()) {
                AbstractC1438d.m1044f(th);
            } else {
                c2278c.f7418b.mo28b(th);
            }
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (this.f7422d.get() == f7420b) {
            interfaceC2112c.mo35e();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        C2278c[] c2278cArr;
        Object obj = this.f7422d.get();
        Object obj2 = f7420b;
        if (obj == obj2) {
            return;
        }
        for (C2278c c2278c : (C2278c[]) this.f7422d.getAndSet(obj2)) {
            if (!c2278c.get()) {
                c2278c.f7418b.mo26d();
            }
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        C2278c[] c2278cArr;
        if (obj == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        for (C2278c c2278c : (C2278c[]) this.f7422d.get()) {
            if (!c2278c.get()) {
                c2278c.f7418b.mo25g(obj);
            }
        }
    }
}