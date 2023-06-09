package p183e.p184a.p190p.p199g;

import java.util.concurrent.ThreadFactory;

/* renamed from: e.a.p.g.b */
/* loaded from: classes.dex */
public final class C2237b {

    /* renamed from: a */
    public final int f7315a;

    /* renamed from: b */
    public final C2238c[] f7316b;

    /* renamed from: c */
    public long f7317c;

    public C2237b(int i, ThreadFactory threadFactory) {
        this.f7315a = i;
        this.f7316b = new C2238c[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f7316b[i2] = new C2238c(threadFactory);
        }
    }

    /* renamed from: a */
    public C2238c m67a() {
        int i = this.f7315a;
        if (i == 0) {
            return C2239d.f7321e;
        }
        C2238c[] c2238cArr = this.f7316b;
        long j = this.f7317c;
        this.f7317c = 1 + j;
        return c2238cArr[(int) (j % i)];
    }
}