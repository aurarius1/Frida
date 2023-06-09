package p010b.p027d.p028a.p030b;

import java.util.Iterator;

/* renamed from: b.d.a.b.e */
/* loaded from: classes.dex */
public class C0356e implements Iterator, InterfaceC0358g {

    /* renamed from: b */
    public C0355d f1850b;

    /* renamed from: c */
    public boolean f1851c = true;

    /* renamed from: d */
    public final /* synthetic */ C0359h f1852d;

    public C0356e(C0359h c0359h) {
        this.f1852d = c0359h;
    }

    @Override // p010b.p027d.p028a.p030b.InterfaceC0358g
    /* renamed from: a */
    public void mo2691a(C0355d c0355d) {
        C0355d c0355d2 = this.f1850b;
        if (c0355d == c0355d2) {
            C0355d c0355d3 = c0355d2.f1849e;
            this.f1850b = c0355d3;
            this.f1851c = c0355d3 == null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f1851c) {
            return this.f1852d.f1855b != null;
        }
        C0355d c0355d = this.f1850b;
        return (c0355d == null || c0355d.f1848d == null) ? false : true;
    }

    @Override // java.util.Iterator
    public Object next() {
        C0355d c0355d;
        if (this.f1851c) {
            this.f1851c = false;
            c0355d = this.f1852d.f1855b;
        } else {
            C0355d c0355d2 = this.f1850b;
            c0355d = c0355d2 != null ? c0355d2.f1848d : null;
        }
        this.f1850b = c0355d;
        return c0355d;
    }
}