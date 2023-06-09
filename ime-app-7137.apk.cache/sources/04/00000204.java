package p010b.p036g;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: b.g.h */
/* loaded from: classes.dex */
public final class C0384h implements Iterator {

    /* renamed from: b */
    public final int f1922b;

    /* renamed from: c */
    public int f1923c;

    /* renamed from: d */
    public int f1924d;

    /* renamed from: e */
    public boolean f1925e = false;

    /* renamed from: f */
    public final /* synthetic */ AbstractC0389m f1926f;

    public C0384h(AbstractC0389m abstractC0389m, int i) {
        this.f1926f = abstractC0389m;
        this.f1922b = i;
        this.f1923c = abstractC0389m.mo2633d();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1924d < this.f1923c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object mo2635b = this.f1926f.mo2635b(this.f1924d, this.f1922b);
            this.f1924d++;
            this.f1925e = true;
            return mo2635b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f1925e) {
            throw new IllegalStateException();
        }
        int i = this.f1924d - 1;
        this.f1924d = i;
        this.f1923c--;
        this.f1925e = false;
        this.f1926f.mo2629h(i);
    }
}