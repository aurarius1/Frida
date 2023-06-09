package p010b.p027d.p028a.p030b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.d.a.b.h */
/* loaded from: classes.dex */
public class C0359h implements Iterable {

    /* renamed from: b */
    public C0355d f1855b;

    /* renamed from: c */
    public C0355d f1856c;

    /* renamed from: d */
    public WeakHashMap f1857d = new WeakHashMap();

    /* renamed from: e */
    public int f1858e = 0;

    /* renamed from: a */
    public C0355d mo2690a(Object obj) {
        C0355d c0355d = this.f1855b;
        while (c0355d != null && !c0355d.f1846b.equals(obj)) {
            c0355d = c0355d.f1848d;
        }
        return c0355d;
    }

    /* renamed from: b */
    public C0356e m2689b() {
        C0356e c0356e = new C0356e(this);
        this.f1857d.put(c0356e, Boolean.FALSE);
        return c0356e;
    }

    /* renamed from: c */
    public C0355d m2688c(Object obj, Object obj2) {
        C0355d c0355d = new C0355d(obj, obj2);
        this.f1858e++;
        C0355d c0355d2 = this.f1856c;
        if (c0355d2 == null) {
            this.f1855b = c0355d;
        } else {
            c0355d2.f1848d = c0355d;
            c0355d.f1849e = c0355d2;
        }
        this.f1856c = c0355d;
        return c0355d;
    }

    /* renamed from: d */
    public Object mo2687d(Object obj, Object obj2) {
        C0355d mo2690a = mo2690a(obj);
        if (mo2690a != null) {
            return mo2690a.f1847c;
        }
        m2688c(obj, obj2);
        return null;
    }

    /* renamed from: e */
    public Object mo2686e(Object obj) {
        C0355d mo2690a = mo2690a(obj);
        if (mo2690a == null) {
            return null;
        }
        this.f1858e--;
        if (!this.f1857d.isEmpty()) {
            for (InterfaceC0358g interfaceC0358g : this.f1857d.keySet()) {
                interfaceC0358g.mo2691a(mo2690a);
            }
        }
        C0355d c0355d = mo2690a.f1849e;
        C0355d c0355d2 = mo2690a.f1848d;
        if (c0355d != null) {
            c0355d.f1848d = c0355d2;
        } else {
            this.f1855b = c0355d2;
        }
        C0355d c0355d3 = mo2690a.f1848d;
        if (c0355d3 != null) {
            c0355d3.f1849e = c0355d;
        } else {
            this.f1856c = c0355d;
        }
        mo2690a.f1848d = null;
        mo2690a.f1849e = null;
        return mo2690a.f1847c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((p010b.p027d.p028a.p030b.AbstractC0357f) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0359h) {
            C0359h c0359h = (C0359h) obj;
            if (this.f1858e != c0359h.f1858e) {
                return false;
            }
            Iterator it = iterator();
            Iterator it2 = c0359h.iterator();
            while (true) {
                AbstractC0357f abstractC0357f = (AbstractC0357f) it;
                if (!abstractC0357f.hasNext()) {
                    break;
                }
                AbstractC0357f abstractC0357f2 = (AbstractC0357f) it2;
                if (!abstractC0357f2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) abstractC0357f.next();
                Object next = abstractC0357f2.next();
                if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            AbstractC0357f abstractC0357f = (AbstractC0357f) it;
            if (!abstractC0357f.hasNext()) {
                return i;
            }
            i += ((Map.Entry) abstractC0357f.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        C0353b c0353b = new C0353b(this.f1855b, this.f1856c);
        this.f1857d.put(c0353b, Boolean.FALSE);
        return c0353b;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("[");
        Iterator it = iterator();
        while (true) {
            AbstractC0357f abstractC0357f = (AbstractC0357f) it;
            if (!abstractC0357f.hasNext()) {
                m1187i.append("]");
                return m1187i.toString();
            }
            m1187i.append(((Map.Entry) abstractC0357f.next()).toString());
            if (abstractC0357f.hasNext()) {
                m1187i.append(", ");
            }
        }
    }
}