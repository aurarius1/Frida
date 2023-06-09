package p010b.p036g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: b.g.i */
/* loaded from: classes.dex */
public final class C0385i implements Set {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0389m f1927b;

    public C0385i(AbstractC0389m abstractC0389m) {
        this.f1927b = abstractC0389m;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        int mo2633d = this.f1927b.mo2633d();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.f1927b.mo2630g(entry.getKey(), entry.getValue());
        }
        return mo2633d != this.f1927b.mo2633d();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f1927b.mo2636a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int mo2632e = this.f1927b.mo2632e(entry.getKey());
            if (mo2632e < 0) {
                return false;
            }
            return AbstractC0381e.m2652c(this.f1927b.mo2635b(mo2632e, 1), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return AbstractC0389m.m2627j(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int i = 0;
        for (int mo2633d = this.f1927b.mo2633d() - 1; mo2633d >= 0; mo2633d--) {
            Object mo2635b = this.f1927b.mo2635b(mo2633d, 0);
            Object mo2635b2 = this.f1927b.mo2635b(mo2633d, 1);
            i += (mo2635b == null ? 0 : mo2635b.hashCode()) ^ (mo2635b2 == null ? 0 : mo2635b2.hashCode());
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f1927b.mo2633d() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0387k(this.f1927b);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f1927b.mo2633d();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}