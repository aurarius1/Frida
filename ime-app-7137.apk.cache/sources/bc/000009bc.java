package p183e.p184a.p190p.p199g;

/* renamed from: e.a.p.g.t */
/* loaded from: classes.dex */
public final class C2255t implements Comparable {

    /* renamed from: b */
    public final Runnable f7373b;

    /* renamed from: c */
    public final long f7374c;

    /* renamed from: d */
    public final int f7375d;

    /* renamed from: e */
    public volatile boolean f7376e;

    public C2255t(Runnable runnable, Long l, int i) {
        this.f7373b = runnable;
        this.f7374c = l.longValue();
        this.f7375d = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C2255t c2255t = (C2255t) obj;
        long j = this.f7374c;
        long j2 = c2255t.f7374c;
        int i = 0;
        int i2 = j < j2 ? -1 : j > j2 ? 1 : 0;
        if (i2 == 0) {
            int i3 = this.f7375d;
            int i4 = c2255t.f7375d;
            if (i3 < i4) {
                i = -1;
            } else if (i3 > i4) {
                i = 1;
            }
            return i;
        }
        return i2;
    }
}