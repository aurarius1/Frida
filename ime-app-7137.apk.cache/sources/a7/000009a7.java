package p183e.p184a.p190p.p198f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p010b.p086w.AbstractC1077v0;
import p183e.p184a.p190p.p193c.InterfaceC2151c;

/* renamed from: e.a.p.f.a */
/* loaded from: classes.dex */
public final class C2234a extends AtomicReferenceArray implements InterfaceC2151c {

    /* renamed from: b */
    public static final Integer f7294b = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: c */
    public final int f7295c;

    /* renamed from: d */
    public final AtomicLong f7296d;

    /* renamed from: e */
    public long f7297e;

    /* renamed from: f */
    public final AtomicLong f7298f;

    /* renamed from: g */
    public final int f7299g;

    public C2234a(int i) {
        super(AbstractC1077v0.m1282V(i));
        this.f7295c = length() - 1;
        this.f7296d = new AtomicLong();
        this.f7298f = new AtomicLong();
        this.f7299g = Math.min(i / 4, f7294b.intValue());
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2151c, p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        long j = this.f7298f.get();
        int i = ((int) j) & this.f7295c;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        this.f7298f.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
        while (true) {
            if (mo69a() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: f */
    public boolean mo68f(Object obj) {
        if (obj != null) {
            int i = this.f7295c;
            long j = this.f7296d.get();
            int i2 = ((int) j) & i;
            if (j >= this.f7297e) {
                long j2 = this.f7299g + j;
                if (get(i & ((int) j2)) == null) {
                    this.f7297e = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            this.f7296d.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return this.f7296d.get() == this.f7298f.get();
    }
}