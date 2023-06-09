package p183e.p184a.p203s;

import java.util.concurrent.atomic.AtomicInteger;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.s.g */
/* loaded from: classes.dex */
public final class C2282g extends AtomicInteger implements InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2098f f7425b;

    /* renamed from: c */
    public final C2284i f7426c;

    /* renamed from: d */
    public Object f7427d;

    /* renamed from: e */
    public volatile boolean f7428e;

    public C2282g(InterfaceC2098f interfaceC2098f, C2284i c2284i) {
        this.f7425b = interfaceC2098f;
        this.f7426c = c2284i;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7428e) {
            return;
        }
        this.f7428e = true;
        this.f7426c.m30T(this);
    }
}