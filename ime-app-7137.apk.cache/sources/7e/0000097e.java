package p183e.p184a.p190p.p195e.p196a;

import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p193c.InterfaceC2149a;
import p183e.p184a.p190p.p193c.InterfaceC2152d;
import p183e.p184a.p190p.p194d.AbstractC2154b;
import p183e.p184a.p190p.p198f.C2235b;

/* renamed from: e.a.p.e.a.k0 */
/* loaded from: classes.dex */
public final class RunnableC2193k0 extends AbstractC2154b implements InterfaceC2098f, Runnable {

    /* renamed from: b */
    public final InterfaceC2098f f7168b;

    /* renamed from: c */
    public final AbstractC2100h f7169c;

    /* renamed from: d */
    public final boolean f7170d;

    /* renamed from: e */
    public final int f7171e;

    /* renamed from: f */
    public InterfaceC2152d f7172f;

    /* renamed from: g */
    public InterfaceC2112c f7173g;

    /* renamed from: h */
    public Throwable f7174h;

    /* renamed from: i */
    public volatile boolean f7175i;

    /* renamed from: j */
    public volatile boolean f7176j;

    /* renamed from: k */
    public int f7177k;

    /* renamed from: l */
    public boolean f7178l;

    public RunnableC2193k0(InterfaceC2098f interfaceC2098f, AbstractC2100h abstractC2100h, boolean z, int i) {
        this.f7168b = interfaceC2098f;
        this.f7169c = abstractC2100h;
        this.f7170d = z;
        this.f7171e = i;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        return this.f7172f.mo69a();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: b */
    public void mo28b(Throwable th) {
        if (this.f7175i) {
            AbstractC1438d.m1044f(th);
            return;
        }
        this.f7174h = th;
        this.f7175i = true;
        m95j();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: c */
    public void mo27c(InterfaceC2112c interfaceC2112c) {
        if (EnumC2131c.m121d(this.f7173g, interfaceC2112c)) {
            this.f7173g = interfaceC2112c;
            if (interfaceC2112c instanceof InterfaceC2149a) {
                InterfaceC2149a interfaceC2149a = (InterfaceC2149a) interfaceC2112c;
                int mo74h = interfaceC2149a.mo74h(7);
                if (mo74h == 1) {
                    this.f7177k = mo74h;
                    this.f7172f = interfaceC2149a;
                    this.f7175i = true;
                    this.f7168b.mo27c(this);
                    m95j();
                    return;
                } else if (mo74h == 2) {
                    this.f7177k = mo74h;
                    this.f7172f = interfaceC2149a;
                    this.f7168b.mo27c(this);
                    return;
                }
            }
            this.f7172f = new C2235b(this.f7171e);
            this.f7168b.mo27c(this);
        }
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
        this.f7172f.clear();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: d */
    public void mo26d() {
        if (this.f7175i) {
            return;
        }
        this.f7175i = true;
        m95j();
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7176j) {
            return;
        }
        this.f7176j = true;
        this.f7173g.mo35e();
        this.f7169c.mo35e();
        if (this.f7178l || getAndIncrement() != 0) {
            return;
        }
        this.f7172f.clear();
    }

    @Override // p183e.p184a.InterfaceC2098f
    /* renamed from: g */
    public void mo25g(Object obj) {
        if (this.f7175i) {
            return;
        }
        if (this.f7177k != 2) {
            this.f7172f.mo68f(obj);
        }
        m95j();
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2149a
    /* renamed from: h */
    public int mo74h(int i) {
        if ((i & 2) != 0) {
            this.f7178l = true;
            return 2;
        }
        return 0;
    }

    /* renamed from: i */
    public boolean m96i(boolean z, boolean z2, InterfaceC2098f interfaceC2098f) {
        if (this.f7176j) {
            this.f7172f.clear();
            return true;
        } else if (z) {
            Throwable th = this.f7174h;
            if (this.f7170d) {
                if (z2) {
                    this.f7176j = true;
                    if (th != null) {
                        interfaceC2098f.mo28b(th);
                    } else {
                        interfaceC2098f.mo26d();
                    }
                    this.f7169c.mo35e();
                    return true;
                }
                return false;
            } else if (th != null) {
                this.f7176j = true;
                this.f7172f.clear();
                interfaceC2098f.mo28b(th);
                this.f7169c.mo35e();
                return true;
            } else if (z2) {
                this.f7176j = true;
                interfaceC2098f.mo26d();
                this.f7169c.mo35e();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return this.f7172f.isEmpty();
    }

    /* renamed from: j */
    public void m95j() {
        if (getAndIncrement() == 0) {
            this.f7169c.mo62b(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7178l) {
            int i = 1;
            while (!this.f7176j) {
                boolean z = this.f7175i;
                Throwable th = this.f7174h;
                if (this.f7170d || !z || th == null) {
                    this.f7168b.mo25g(null);
                    if (z) {
                        this.f7176j = true;
                        Throwable th2 = this.f7174h;
                        if (th2 != null) {
                            this.f7168b.mo28b(th2);
                        } else {
                            this.f7168b.mo26d();
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    this.f7176j = true;
                    this.f7168b.mo28b(this.f7174h);
                }
                this.f7169c.mo35e();
                return;
            }
            return;
        }
        InterfaceC2152d interfaceC2152d = this.f7172f;
        InterfaceC2098f interfaceC2098f = this.f7168b;
        int i2 = 1;
        while (!m96i(this.f7175i, interfaceC2152d.isEmpty(), interfaceC2098f)) {
            while (true) {
                boolean z2 = this.f7175i;
                try {
                    Object mo69a = interfaceC2152d.mo69a();
                    boolean z3 = mo69a == null;
                    if (m96i(z2, z3, interfaceC2098f)) {
                        return;
                    }
                    if (z3) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        interfaceC2098f.mo25g(mo69a);
                    }
                } catch (Throwable th3) {
                    AbstractC1438d.m1039k(th3);
                    this.f7176j = true;
                    this.f7173g.mo35e();
                    interfaceC2152d.clear();
                    interfaceC2098f.mo28b(th3);
                    this.f7169c.mo35e();
                    return;
                }
            }
        }
    }
}