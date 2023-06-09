package p183e.p184a.p190p.p195e.p196a;

import java.util.Iterator;
import p183e.p184a.InterfaceC2097e;

/* renamed from: e.a.p.e.a.c */
/* loaded from: classes.dex */
public final class C2168c implements Iterable {

    /* renamed from: b */
    public final InterfaceC2097e f7083b;

    /* renamed from: c */
    public final int f7084c;

    public C2168c(InterfaceC2097e interfaceC2097e, int i) {
        this.f7083b = interfaceC2097e;
        this.f7084c = i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        C2165b c2165b = new C2165b(this.f7084c);
        this.f7083b.mo89a(c2165b);
        return c2165b;
    }
}