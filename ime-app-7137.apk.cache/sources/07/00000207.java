package p010b.p036g;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: b.g.k */
/* loaded from: classes.dex */
public final class C0387k implements Iterator, Map.Entry {

    /* renamed from: b */
    public int f1929b;

    /* renamed from: e */
    public final /* synthetic */ AbstractC0389m f1932e;

    /* renamed from: d */
    public boolean f1931d = false;

    /* renamed from: c */
    public int f1930c = -1;

    public C0387k(AbstractC0389m abstractC0389m) {
        this.f1932e = abstractC0389m;
        this.f1929b = abstractC0389m.mo2633d() - 1;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this.f1931d) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC0381e.m2652c(entry.getKey(), this.f1932e.mo2635b(this.f1930c, 0)) && AbstractC0381e.m2652c(entry.getValue(), this.f1932e.mo2635b(this.f1930c, 1));
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        if (this.f1931d) {
            return this.f1932e.mo2635b(this.f1930c, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        if (this.f1931d) {
            return this.f1932e.mo2635b(this.f1930c, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1930c < this.f1929b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        if (this.f1931d) {
            Object mo2635b = this.f1932e.mo2635b(this.f1930c, 0);
            Object mo2635b2 = this.f1932e.mo2635b(this.f1930c, 1);
            return (mo2635b == null ? 0 : mo2635b.hashCode()) ^ (mo2635b2 != null ? mo2635b2.hashCode() : 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            this.f1930c++;
            this.f1931d = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f1931d) {
            throw new IllegalStateException();
        }
        this.f1932e.mo2629h(this.f1930c);
        this.f1930c--;
        this.f1929b--;
        this.f1931d = false;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (this.f1931d) {
            return this.f1932e.mo2628i(this.f1930c, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}