package p010b.p036g;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: b.g.b */
/* loaded from: classes.dex */
public class C0378b extends C0390n implements Map {

    /* renamed from: i */
    public AbstractC0389m f1895i;

    public C0378b() {
    }

    public C0378b(int i) {
        super(i);
    }

    public C0378b(C0390n c0390n) {
        if (c0390n != null) {
            int i = c0390n.f1943h;
            m2622b(this.f1943h + i);
            if (this.f1943h != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c0390n.m2616h(i2), c0390n.m2613k(i2));
                }
            } else if (i > 0) {
                System.arraycopy(c0390n.f1941f, 0, this.f1941f, 0, i);
                System.arraycopy(c0390n.f1942g, 0, this.f1942g, 0, i << 1);
                this.f1943h = i;
            }
        }
    }

    @Override // java.util.Map
    public Set entrySet() {
        AbstractC0389m m2660l = m2660l();
        if (m2660l.f1934a == null) {
            m2660l.f1934a = new C0385i(m2660l);
        }
        return m2660l.f1934a;
    }

    @Override // java.util.Map
    public Set keySet() {
        AbstractC0389m m2660l = m2660l();
        if (m2660l.f1935b == null) {
            m2660l.f1935b = new C0386j(m2660l);
        }
        return m2660l.f1935b;
    }

    /* renamed from: l */
    public final AbstractC0389m m2660l() {
        if (this.f1895i == null) {
            this.f1895i = new C0377a(this);
        }
        return this.f1895i;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m2622b(map.size() + this.f1943h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        AbstractC0389m m2660l = m2660l();
        if (m2660l.f1936c == null) {
            m2660l.f1936c = new C0388l(m2660l);
        }
        return m2660l.f1936c;
    }
}