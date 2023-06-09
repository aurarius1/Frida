package p010b.p036g;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: b.g.g */
/* loaded from: classes.dex */
public class C0383g {

    /* renamed from: a */
    public final LinkedHashMap f1915a;

    /* renamed from: b */
    public int f1916b;

    /* renamed from: c */
    public int f1917c;

    /* renamed from: d */
    public int f1918d;

    /* renamed from: e */
    public int f1919e;

    /* renamed from: f */
    public int f1920f;

    /* renamed from: g */
    public int f1921g;

    public C0383g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1917c = i;
        this.f1915a = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: a */
    public final Object m2639a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f1915a.get(obj);
                if (obj2 != null) {
                    this.f1920f++;
                    return obj2;
                }
                this.f1921g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public final Object m2638b(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1918d++;
            this.f1916b++;
            put = this.f1915a.put(obj, obj2);
            if (put != null) {
                this.f1916b--;
            }
        }
        m2637c(this.f1917c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2637c(int i) {
        while (true) {
            synchronized (this) {
                if (this.f1916b >= 0 && (!this.f1915a.isEmpty() || this.f1916b == 0)) {
                    if (this.f1916b <= i || this.f1915a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f1915a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f1915a.remove(key);
                    this.f1916b--;
                    this.f1919e++;
                } else {
                    break;
                }
            }
        }
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f1920f;
        i2 = this.f1921g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1917c), Integer.valueOf(this.f1920f), Integer.valueOf(this.f1921g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}