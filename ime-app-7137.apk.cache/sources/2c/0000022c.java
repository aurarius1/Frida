package p010b.p037h.p040b.p041n.p042k;

/* renamed from: b.h.b.n.k.i */
/* loaded from: classes.dex */
public class C0424i extends C0423h {

    /* renamed from: m */
    public int f2193m;

    public C0424i(AbstractC0430o abstractC0430o) {
        super(abstractC0430o);
        this.f2185e = abstractC0430o instanceof C0427l ? EnumC0422g.HORIZONTAL_DIMENSION : EnumC0422g.VERTICAL_DIMENSION;
    }

    @Override // p010b.p037h.p040b.p041n.p042k.C0423h
    /* renamed from: c */
    public void mo2491c(int i) {
        if (this.f2190j) {
            return;
        }
        this.f2190j = true;
        this.f2187g = i;
        for (InterfaceC0420e interfaceC0420e : this.f2191k) {
            interfaceC0420e.mo2483a(interfaceC0420e);
        }
    }
}