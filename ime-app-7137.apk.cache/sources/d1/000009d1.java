package p183e.p184a.p203s;

import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2128j;
import p183e.p184a.p190p.p200h.C2259a;
import p183e.p184a.p190p.p200h.C2263e;
import p183e.p184a.p190p.p200h.EnumC2264f;

/* renamed from: e.a.s.a */
/* loaded from: classes.dex */
public final class C2276a implements InterfaceC2112c, InterfaceC2128j {

    /* renamed from: b */
    public final InterfaceC2098f f7400b;

    /* renamed from: c */
    public final C2277b f7401c;

    /* renamed from: d */
    public boolean f7402d;

    /* renamed from: e */
    public boolean f7403e;

    /* renamed from: f */
    public C2259a f7404f;

    /* renamed from: g */
    public boolean f7405g;

    /* renamed from: h */
    public volatile boolean f7406h;

    /* renamed from: i */
    public long f7407i;

    public C2276a(InterfaceC2098f interfaceC2098f, C2277b c2277b) {
        this.f7400b = interfaceC2098f;
        this.f7401c = c2277b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // p183e.p184a.p189o.InterfaceC2128j
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo40a(Object obj) {
        boolean z;
        if (!this.f7406h) {
            InterfaceC2098f interfaceC2098f = this.f7400b;
            if (obj == EnumC2264f.COMPLETE) {
                interfaceC2098f.mo26d();
            } else if (obj instanceof C2263e) {
                interfaceC2098f.mo28b(((C2263e) obj).f7388b);
            } else {
                interfaceC2098f.mo25g(obj);
                z = false;
                if (z) {
                    return false;
                }
            }
            z = true;
            if (z) {
            }
        }
        return true;
    }

    /* renamed from: b */
    public void m39b(Object obj, long j) {
        if (this.f7406h) {
            return;
        }
        if (!this.f7405g) {
            synchronized (this) {
                if (this.f7406h) {
                    return;
                }
                if (this.f7407i == j) {
                    return;
                }
                if (this.f7403e) {
                    C2259a c2259a = this.f7404f;
                    if (c2259a == null) {
                        c2259a = new C2259a(4);
                        this.f7404f = c2259a;
                    }
                    c2259a.m56a(obj);
                    return;
                }
                this.f7402d = true;
                this.f7405g = true;
            }
        }
        mo40a(obj);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7406h) {
            return;
        }
        this.f7406h = true;
        this.f7401c.m38T(this);
    }
}