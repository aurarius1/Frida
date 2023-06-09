package p093c.p097b.p128x;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: c.b.x.q2 */
/* loaded from: classes.dex */
public class C1619q2 implements List {

    /* renamed from: b */
    public CharSequence f5051b = "🔍";

    /* renamed from: c */
    public List f5052c = Collections.emptyList();

    @Override // java.util.List
    public void add(int i, Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public Object get(int i) {
        return i == 0 ? this.f5051b : (CharSequence) this.f5052c.get(i - 1);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C1615p2(this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f5052c.size() + 1;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        int size = size();
        Object[] objArr = new Object[size];
        objArr[0] = this.f5051b;
        if (size > 1) {
            System.arraycopy(this.f5052c.toArray(), 0, objArr, 1, size - 1);
        }
        return objArr;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        throw new UnsupportedOperationException();
    }
}