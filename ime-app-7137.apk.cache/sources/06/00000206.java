package p010b.p036g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: b.g.j */
/* loaded from: classes.dex */
public final class C0386j implements Set {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0389m f1928b;

    public C0386j(AbstractC0389m abstractC0389m) {
        this.f1928b = abstractC0389m;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f1928b.mo2636a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f1928b.mo2632e(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Map mo2634c = this.f1928b.mo2634c();
        for (Object obj : collection) {
            if (!mo2634c.containsKey(obj)) {
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
        for (int mo2633d = this.f1928b.mo2633d() - 1; mo2633d >= 0; mo2633d--) {
            Object mo2635b = this.f1928b.mo2635b(mo2633d, 0);
            i += mo2635b == null ? 0 : mo2635b.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f1928b.mo2633d() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0384h(this.f1928b, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int mo2632e = this.f1928b.mo2632e(obj);
        if (mo2632e >= 0) {
            this.f1928b.mo2629h(mo2632e);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Map mo2634c = this.f1928b.mo2634c();
        int size = mo2634c.size();
        for (Object obj : collection) {
            mo2634c.remove(obj);
        }
        return size != mo2634c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        return AbstractC0389m.m2626k(this.f1928b.mo2634c(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f1928b.mo2633d();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f1928b.m2625l(0);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f1928b.m2624m(objArr, 0);
    }
}