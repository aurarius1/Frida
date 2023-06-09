package p010b.p037h.p040b.p041n.p042k;

import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.C0412g;

/* renamed from: b.h.b.n.k.j */
/* loaded from: classes.dex */
public class C0425j extends AbstractC0430o {
    public C0425j(C0410e c0410e) {
        super(c0410e);
        c0410e.f2102d.mo2478f();
        c0410e.f2104e.mo2478f();
        this.f2205f = ((C0412g) c0410e).f2145i0;
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o, p010b.p037h.p040b.p041n.p042k.InterfaceC0420e
    /* renamed from: a */
    public void mo2483a(InterfaceC0420e interfaceC0420e) {
        C0423h c0423h = this.f2207h;
        if (c0423h.f2183c && !c0423h.f2190j) {
            this.f2207h.mo2491c((int) ((((C0423h) c0423h.f2192l.get(0)).f2187g * ((C0412g) this.f2201b).f2141e0) + 0.5f));
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: d */
    public void mo2480d() {
        AbstractC0430o abstractC0430o;
        C0410e c0410e = this.f2201b;
        C0412g c0412g = (C0412g) c0410e;
        int i = c0412g.f2142f0;
        int i2 = c0412g.f2143g0;
        if (c0412g.f2145i0 == 1) {
            C0423h c0423h = this.f2207h;
            if (i != -1) {
                c0423h.f2192l.add(c0410e.f2080K.f2102d.f2207h);
                this.f2201b.f2080K.f2102d.f2207h.f2191k.add(this.f2207h);
                this.f2207h.f2186f = i;
            } else if (i2 != -1) {
                c0423h.f2192l.add(c0410e.f2080K.f2102d.f2208i);
                this.f2201b.f2080K.f2102d.f2208i.f2191k.add(this.f2207h);
                this.f2207h.f2186f = -i2;
            } else {
                c0423h.f2182b = true;
                c0423h.f2192l.add(c0410e.f2080K.f2102d.f2208i);
                this.f2201b.f2080K.f2102d.f2208i.f2191k.add(this.f2207h);
            }
            m2490m(this.f2201b.f2102d.f2207h);
            abstractC0430o = this.f2201b.f2102d;
        } else {
            C0423h c0423h2 = this.f2207h;
            if (i != -1) {
                c0423h2.f2192l.add(c0410e.f2080K.f2104e.f2207h);
                this.f2201b.f2080K.f2104e.f2207h.f2191k.add(this.f2207h);
                this.f2207h.f2186f = i;
            } else if (i2 != -1) {
                c0423h2.f2192l.add(c0410e.f2080K.f2104e.f2208i);
                this.f2201b.f2080K.f2104e.f2208i.f2191k.add(this.f2207h);
                this.f2207h.f2186f = -i2;
            } else {
                c0423h2.f2182b = true;
                c0423h2.f2192l.add(c0410e.f2080K.f2104e.f2208i);
                this.f2201b.f2080K.f2104e.f2208i.f2191k.add(this.f2207h);
            }
            m2490m(this.f2201b.f2104e.f2207h);
            abstractC0430o = this.f2201b.f2104e;
        }
        m2490m(abstractC0430o.f2208i);
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: e */
    public void mo2479e() {
        C0410e c0410e = this.f2201b;
        if (((C0412g) c0410e).f2145i0 == 1) {
            c0410e.f2085P = this.f2207h.f2187g;
        } else {
            c0410e.f2086Q = this.f2207h.f2187g;
        }
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: f */
    public void mo2478f() {
        this.f2207h.m2492b();
    }

    @Override // p010b.p037h.p040b.p041n.p042k.AbstractC0430o
    /* renamed from: k */
    public boolean mo2473k() {
        return false;
    }

    /* renamed from: m */
    public final void m2490m(C0423h c0423h) {
        this.f2207h.f2191k.add(c0423h);
        c0423h.f2192l.add(this.f2207h);
    }
}