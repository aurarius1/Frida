package p183e.p184a.p190p.p195e.p196a;

import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p194d.AbstractC2155c;

/* renamed from: e.a.p.e.a.a0 */
/* loaded from: classes.dex */
public final class C2163a0 extends AbstractC2155c {

    /* renamed from: b */
    public final InterfaceC2098f f7068b;

    /* renamed from: c */
    public final Object[] f7069c;

    /* renamed from: d */
    public int f7070d;

    /* renamed from: e */
    public boolean f7071e;

    /* renamed from: f */
    public volatile boolean f7072f;

    public C2163a0(InterfaceC2098f interfaceC2098f, Object[] objArr) {
        this.f7068b = interfaceC2098f;
        this.f7069c = objArr;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        int i = this.f7070d;
        Object[] objArr = this.f7069c;
        if (i != objArr.length) {
            this.f7070d = i + 1;
            Object obj = objArr[i];
            AbstractC2148n.m110a(obj, "The array element is null");
            return obj;
        }
        return null;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
        this.f7070d = this.f7069c.length;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7072f = true;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2149a
    /* renamed from: h */
    public int mo74h(int i) {
        if ((i & 1) != 0) {
            this.f7071e = true;
            return 1;
        }
        return 0;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return this.f7070d == this.f7069c.length;
    }
}