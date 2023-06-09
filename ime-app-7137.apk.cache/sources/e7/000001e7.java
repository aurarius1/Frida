package p010b.p027d.p028a.p030b;

import java.util.Map;

/* renamed from: b.d.a.b.d */
/* loaded from: classes.dex */
public class C0355d implements Map.Entry {

    /* renamed from: b */
    public final Object f1846b;

    /* renamed from: c */
    public final Object f1847c;

    /* renamed from: d */
    public C0355d f1848d;

    /* renamed from: e */
    public C0355d f1849e;

    public C0355d(Object obj, Object obj2) {
        this.f1846b = obj;
        this.f1847c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0355d) {
            C0355d c0355d = (C0355d) obj;
            return this.f1846b.equals(c0355d.f1846b) && this.f1847c.equals(c0355d.f1847c);
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f1846b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f1847c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f1846b.hashCode() ^ this.f1847c.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public String toString() {
        return this.f1846b + "=" + this.f1847c;
    }
}