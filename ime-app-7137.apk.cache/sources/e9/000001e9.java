package p010b.p027d.p028a.p030b;

import java.util.Iterator;

/* renamed from: b.d.a.b.f */
/* loaded from: classes.dex */
public abstract class AbstractC0357f implements Iterator, InterfaceC0358g {

    /* renamed from: b */
    public C0355d f1853b;

    /* renamed from: c */
    public C0355d f1854c;

    public AbstractC0357f(C0355d c0355d, C0355d c0355d2) {
        this.f1853b = c0355d2;
        this.f1854c = c0355d;
    }

    @Override // p010b.p027d.p028a.p030b.InterfaceC0358g
    /* renamed from: a */
    public void mo2691a(C0355d c0355d) {
        C0355d c0355d2 = null;
        if (this.f1853b == c0355d && c0355d == this.f1854c) {
            this.f1854c = null;
            this.f1853b = null;
        }
        C0355d c0355d3 = this.f1853b;
        if (c0355d3 == c0355d) {
            this.f1853b = mo2693b(c0355d3);
        }
        C0355d c0355d4 = this.f1854c;
        if (c0355d4 == c0355d) {
            C0355d c0355d5 = this.f1853b;
            if (c0355d4 != c0355d5 && c0355d5 != null) {
                c0355d2 = mo2692c(c0355d4);
            }
            this.f1854c = c0355d2;
        }
    }

    /* renamed from: b */
    public abstract C0355d mo2693b(C0355d c0355d);

    /* renamed from: c */
    public abstract C0355d mo2692c(C0355d c0355d);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1854c != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        C0355d c0355d = this.f1854c;
        C0355d c0355d2 = this.f1853b;
        this.f1854c = (c0355d == c0355d2 || c0355d2 == null) ? null : mo2692c(c0355d);
        return c0355d;
    }
}