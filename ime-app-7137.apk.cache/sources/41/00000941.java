package p183e.p184a.p190p.p191a;

import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p190p.p193c.InterfaceC2149a;

/* renamed from: e.a.p.a.d */
/* loaded from: classes.dex */
public enum EnumC2132d implements InterfaceC2149a {
    INSTANCE,
    NEVER;

    /* renamed from: b */
    public static void m120b(Throwable th, InterfaceC2098f interfaceC2098f) {
        interfaceC2098f.mo27c(INSTANCE);
        interfaceC2098f.mo28b(th);
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: a */
    public Object mo69a() {
        return null;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public void clear() {
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    /* renamed from: f */
    public boolean mo68f(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2149a
    /* renamed from: h */
    public int mo74h(int i) {
        return i & 2;
    }

    @Override // p183e.p184a.p190p.p193c.InterfaceC2152d
    public boolean isEmpty() {
        return true;
    }
}