package p010b.p037h.p040b.p041n.p042k;

import java.util.ArrayList;
import java.util.List;

/* renamed from: b.h.b.n.k.h */
/* loaded from: classes.dex */
public class C0423h implements InterfaceC0420e {

    /* renamed from: d */
    public AbstractC0430o f2184d;

    /* renamed from: f */
    public int f2186f;

    /* renamed from: g */
    public int f2187g;

    /* renamed from: a */
    public InterfaceC0420e f2181a = null;

    /* renamed from: b */
    public boolean f2182b = false;

    /* renamed from: c */
    public boolean f2183c = false;

    /* renamed from: e */
    public EnumC0422g f2185e = EnumC0422g.UNKNOWN;

    /* renamed from: h */
    public int f2188h = 1;

    /* renamed from: i */
    public C0424i f2189i = null;

    /* renamed from: j */
    public boolean f2190j = false;

    /* renamed from: k */
    public List f2191k = new ArrayList();

    /* renamed from: l */
    public List f2192l = new ArrayList();

    public C0423h(AbstractC0430o abstractC0430o) {
        this.f2184d = abstractC0430o;
    }

    @Override // p010b.p037h.p040b.p041n.p042k.InterfaceC0420e
    /* renamed from: a */
    public void mo2483a(InterfaceC0420e interfaceC0420e) {
        for (C0423h c0423h : this.f2192l) {
            if (!c0423h.f2190j) {
                return;
            }
        }
        this.f2183c = true;
        InterfaceC0420e interfaceC0420e2 = this.f2181a;
        if (interfaceC0420e2 != null) {
            interfaceC0420e2.mo2483a(this);
        }
        if (this.f2182b) {
            this.f2184d.mo2483a(this);
            return;
        }
        C0423h c0423h2 = null;
        int i = 0;
        for (C0423h c0423h3 : this.f2192l) {
            if (!(c0423h3 instanceof C0424i)) {
                i++;
                c0423h2 = c0423h3;
            }
        }
        if (c0423h2 != null && i == 1 && c0423h2.f2190j) {
            C0424i c0424i = this.f2189i;
            if (c0424i != null) {
                if (!c0424i.f2190j) {
                    return;
                }
                this.f2186f = this.f2188h * c0424i.f2187g;
            }
            mo2491c(c0423h2.f2187g + this.f2186f);
        }
        InterfaceC0420e interfaceC0420e3 = this.f2181a;
        if (interfaceC0420e3 != null) {
            interfaceC0420e3.mo2483a(this);
        }
    }

    /* renamed from: b */
    public void m2492b() {
        this.f2192l.clear();
        this.f2191k.clear();
        this.f2190j = false;
        this.f2187g = 0;
        this.f2183c = false;
        this.f2182b = false;
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2184d.f2201b.f2094Y);
        sb.append(":");
        sb.append(this.f2185e);
        sb.append("(");
        sb.append(this.f2190j ? Integer.valueOf(this.f2187g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2192l.size());
        sb.append(":d=");
        sb.append(this.f2191k.size());
        sb.append(">");
        return sb.toString();
    }
}