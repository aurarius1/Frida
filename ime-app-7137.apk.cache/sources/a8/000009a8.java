package p183e.p184a.p190p.p198f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p010b.p086w.AbstractC1077v0;
import p183e.p184a.p190p.p193c.InterfaceC2151c;

/* renamed from: e.a.p.f.b */
/* loaded from: classes.dex */
public final class C2235b implements InterfaceC2151c {

    /* renamed from: b */
    public static final int f7300b = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: c */
    public static final Object f7301c = new Object();

    /* renamed from: d */
    public final AtomicLong f7302d;

    /* renamed from: e */
    public int f7303e;

    /* renamed from: f */
    public long f7304f;

    /* renamed from: g */
    public final int f7305g;

    /* renamed from: h */
    public AtomicReferenceArray f7306h;

    /* renamed from: i */
    public final int f7307i;

    /* renamed from: j */
    public AtomicReferenceArray f7308j;

    /* renamed from: k */
    public final AtomicLong f7309k;

    public C2235b(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f7302d = atomicLong;
        this.f7309k = new AtomicLong();
        int m1282V = AbstractC1077v0.m1282V(Math.max(8, i));
        int i2 = m1282V - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(m1282V + 1);
        this.f7306h = atomicReferenceArray;
        this.f7305g = i2;
        this.f7303e = Math.min(m1282V / 4, f7300b);
        this.f7308j = atomicReferenceArray;
        this.f7307i = i2;
        this.f7304f = i2 - 1;
        atomicLong.lazySet(0L);
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2151c, p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        AtomicReferenceArray atomicReferenceArray = this.f7308j;
        long j = this.f7309k.get();
        int i = this.f7307i;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = obj == f7301c;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            this.f7309k.lazySet(j + 1);
            return obj;
        } else if (z) {
            int i3 = i + 1;
            AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, null);
            this.f7308j = atomicReferenceArray2;
            Object obj2 = atomicReferenceArray2.get(i2);
            if (obj2 != null) {
                atomicReferenceArray2.lazySet(i2, null);
                this.f7309k.lazySet(j + 1);
            }
            return obj2;
        } else {
            return null;
        }
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
            AtomicReferenceArray atomicReferenceArray = this.f7306h;
            long j = this.f7302d.get();
            int i = this.f7305g;
            int i2 = ((int) j) & i;
            if (j < this.f7304f) {
                atomicReferenceArray.lazySet(i2, obj);
                this.f7302d.lazySet(j + 1);
                return true;
            }
            long j2 = this.f7303e + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.f7304f = j2 - 1;
                atomicReferenceArray.lazySet(i2, obj);
                this.f7302d.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, obj);
                this.f7302d.lazySet(j3);
                return true;
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f7306h = atomicReferenceArray2;
            this.f7304f = (i + j) - 1;
            atomicReferenceArray2.lazySet(i2, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, f7301c);
            this.f7302d.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return this.f7302d.get() == this.f7309k.get();
    }
}