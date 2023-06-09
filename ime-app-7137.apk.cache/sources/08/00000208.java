package p010b.p036g;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: b.g.l */
/* loaded from: classes.dex */
public final class C0388l implements Collection {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0389m f1933b;

    public C0388l(AbstractC0389m abstractC0389m) {
        this.f1933b = abstractC0389m;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.f1933b.mo2636a();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f1933b.mo2631f(obj) >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f1933b.mo2633d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0384h(this.f1933b, 1);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        int mo2631f = this.f1933b.mo2631f(obj);
        if (mo2631f >= 0) {
            this.f1933b.mo2629h(mo2631f);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        int mo2633d = this.f1933b.mo2633d();
        int i = 0;
        boolean z = false;
        while (i < mo2633d) {
            if (collection.contains(this.f1933b.mo2635b(i, 1))) {
                this.f1933b.mo2629h(i);
                i--;
                mo2633d--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        int mo2633d = this.f1933b.mo2633d();
        int i = 0;
        boolean z = false;
        while (i < mo2633d) {
            if (!collection.contains(this.f1933b.mo2635b(i, 1))) {
                this.f1933b.mo2629h(i);
                i--;
                mo2633d--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public int size() {
        return this.f1933b.mo2633d();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f1933b.m2625l(1);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f1933b.m2624m(objArr, 1);
    }
}