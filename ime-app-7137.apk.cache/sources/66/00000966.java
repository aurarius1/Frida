package p183e.p184a.p190p.p195e.p196a;

import java.util.Iterator;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p194d.AbstractC2155c;

/* renamed from: e.a.p.e.a.c0 */
/* loaded from: classes.dex */
public final class C2169c0 extends AbstractC2155c {

    /* renamed from: b */
    public final InterfaceC2098f f7085b;

    /* renamed from: c */
    public final Iterator f7086c;

    /* renamed from: d */
    public volatile boolean f7087d;

    /* renamed from: e */
    public boolean f7088e;

    /* renamed from: f */
    public boolean f7089f;

    /* renamed from: g */
    public boolean f7090g;

    public C2169c0(InterfaceC2098f interfaceC2098f, Iterator it) {
        this.f7085b = interfaceC2098f;
        this.f7086c = it;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        if (this.f7089f) {
            return null;
        }
        if (!this.f7090g) {
            this.f7090g = true;
        } else if (!this.f7086c.hasNext()) {
            this.f7089f = true;
            return null;
        }
        Object next = this.f7086c.next();
        AbstractC2148n.m110a(next, "The iterator returned a null value");
        return next;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
        this.f7089f = true;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7087d = true;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2149a
    /* renamed from: h */
    public int mo74h(int i) {
        if ((i & 1) != 0) {
            this.f7088e = true;
            return 1;
        }
        return 0;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return this.f7089f;
    }
}