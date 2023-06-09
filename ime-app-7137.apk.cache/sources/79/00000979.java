package p183e.p184a.p190p.p195e.p196a;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p192b.AbstractC2148n;

/* renamed from: e.a.p.e.a.i1 */
/* loaded from: classes.dex */
public final class C2188i1 extends AtomicInteger implements InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7142b;

    /* renamed from: c */
    public final InterfaceC2127i f7143c;

    /* renamed from: d */
    public final C2191j1[] f7144d;

    /* renamed from: e */
    public final Object[] f7145e;

    /* renamed from: f */
    public final boolean f7146f;

    /* renamed from: g */
    public volatile boolean f7147g;

    public C2188i1(InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i, int i, boolean z) {
        this.f7142b = interfaceC2098f;
        this.f7143c = interfaceC2127i;
        this.f7144d = new C2191j1[i];
        this.f7145e = new Object[i];
        this.f7146f = z;
    }

    /* renamed from: a */
    public void m99a() {
        for (C2191j1 c2191j1 : this.f7144d) {
            c2191j1.f7162c.clear();
        }
        for (C2191j1 c2191j12 : this.f7144d) {
            EnumC2131c.m124a(c2191j12.f7165f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r8 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m98b() {
        Throwable th;
        boolean z;
        Throwable th2;
        if (getAndIncrement() != 0) {
            return;
        }
        C2191j1[] c2191j1Arr = this.f7144d;
        InterfaceC2098f interfaceC2098f = this.f7142b;
        Object[] objArr = this.f7145e;
        boolean z2 = this.f7146f;
        int i = 1;
        while (true) {
            int i2 = 0;
            int i3 = 0;
            for (C2191j1 c2191j1 : c2191j1Arr) {
                if (objArr[i3] == null) {
                    boolean z3 = c2191j1.f7163d;
                    Object mo69a = c2191j1.f7162c.mo69a();
                    boolean z4 = mo69a == null;
                    if (this.f7147g) {
                        m99a();
                    } else {
                        if (z3) {
                            if (!z2) {
                                th2 = c2191j1.f7164e;
                                if (th2 != null) {
                                    this.f7147g = true;
                                    m99a();
                                    interfaceC2098f.mo28b(th2);
                                } else if (z4) {
                                    this.f7147g = true;
                                    m99a();
                                    interfaceC2098f.mo26d();
                                }
                            } else if (z4) {
                                th2 = c2191j1.f7164e;
                                this.f7147g = true;
                                m99a();
                            }
                        }
                        z = false;
                        if (!z) {
                            return;
                        }
                        if (z4) {
                            i2++;
                        } else {
                            objArr[i3] = mo69a;
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                } else if (c2191j1.f7163d && !z2 && (th = c2191j1.f7164e) != null) {
                    this.f7147g = true;
                    m99a();
                    interfaceC2098f.mo28b(th);
                    return;
                }
                i3++;
            }
            if (i2 != 0) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                try {
                    Object mo24a = this.f7143c.mo24a(objArr.clone());
                    AbstractC2148n.m110a(mo24a, "The zipper returned a null value");
                    interfaceC2098f.mo25g(mo24a);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th3) {
                    AbstractC1438d.m1039k(th3);
                    m99a();
                    interfaceC2098f.mo28b(th3);
                    return;
                }
            }
        }
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7147g) {
            return;
        }
        this.f7147g = true;
        for (C2191j1 c2191j1 : this.f7144d) {
            EnumC2131c.m124a(c2191j1.f7165f);
        }
        if (getAndIncrement() == 0) {
            for (C2191j1 c2191j12 : this.f7144d) {
                c2191j12.f7162c.clear();
            }
        }
    }
}