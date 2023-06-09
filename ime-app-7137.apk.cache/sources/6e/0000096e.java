package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;

/* renamed from: e.a.p.e.a.f */
/* loaded from: classes.dex */
public final class C2177f extends AtomicReference implements InterfaceC2098f {

    /* renamed from: b */
    public final C2180g f7106b;

    /* renamed from: c */
    public final int f7107c;

    public C2177f(C2180g c2180g, int i) {
        this.f7106b = c2180g;
        this.f7107c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (r3 == r5.length) goto L21;
     */
    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo28b(Throwable th) {
        C2180g c2180g = this.f7106b;
        int i = this.f7107c;
        if (!c2180g.f7118j.m55a(th)) {
            AbstractC1438d.m1044f(th);
            return;
        }
        boolean z = true;
        if (c2180g.f7115g) {
            synchronized (c2180g) {
                Object[] objArr = c2180g.f7113e;
                if (objArr == null) {
                    return;
                }
                boolean z2 = objArr[i] == null;
                if (!z2) {
                    int i2 = c2180g.f7120l + 1;
                    c2180g.f7120l = i2;
                }
                c2180g.f7117i = true;
                z = z2;
            }
        }
        if (z) {
            c2180g.m103a();
        }
        c2180g.m101c();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        EnumC2131c.m122c(this, interfaceC2112c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r4 == r2.length) goto L21;
     */
    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo26d() {
        C2180g c2180g = this.f7106b;
        int i = this.f7107c;
        synchronized (c2180g) {
            Object[] objArr = c2180g.f7113e;
            if (objArr == null) {
                return;
            }
            boolean z = objArr[i] == null;
            if (!z) {
                int i2 = c2180g.f7120l + 1;
                c2180g.f7120l = i2;
            }
            c2180g.f7117i = true;
            if (z) {
                c2180g.m103a();
            }
            c2180g.m101c();
        }
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        boolean z;
        C2180g c2180g = this.f7106b;
        int i = this.f7107c;
        synchronized (c2180g) {
            Object[] objArr = c2180g.f7113e;
            if (objArr == null) {
                return;
            }
            Object obj2 = objArr[i];
            int i2 = c2180g.f7119k;
            if (obj2 == null) {
                i2++;
                c2180g.f7119k = i2;
            }
            objArr[i] = obj;
            if (i2 == objArr.length) {
                c2180g.f7114f.mo68f(objArr.clone());
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c2180g.m101c();
            }
        }
    }
}