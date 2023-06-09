package p183e.p184a.p190p.p199g;

import java.util.concurrent.TimeUnit;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.C2133e;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.g.a */
/* loaded from: classes.dex */
public final class C2236a extends AbstractC2100h {

    /* renamed from: b */
    public final C2133e f7310b;

    /* renamed from: c */
    public final C2111b f7311c;

    /* renamed from: d */
    public final C2133e f7312d;

    /* renamed from: e */
    public final C2238c f7313e;

    /* renamed from: f */
    public volatile boolean f7314f;

    public C2236a(C2238c c2238c) {
        this.f7313e = c2238c;
        C2133e c2133e = new C2133e();
        this.f7310b = c2133e;
        C2111b c2111b = new C2111b();
        this.f7311c = c2111b;
        C2133e c2133e2 = new C2133e();
        this.f7312d = c2133e2;
        c2133e2.mo117c(c2133e);
        c2133e2.mo117c(c2111b);
    }

    @Override // p183e.p184a.AbstractC2100h
    /* renamed from: b */
    public InterfaceC2112c mo62b(Runnable runnable) {
        return this.f7314f ? EnumC2132d.INSTANCE : this.f7313e.m66d(runnable, 0L, TimeUnit.MILLISECONDS, this.f7310b);
    }

    @Override // p183e.p184a.AbstractC2100h
    /* renamed from: c */
    public InterfaceC2112c mo61c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f7314f ? EnumC2132d.INSTANCE : this.f7313e.m66d(runnable, j, timeUnit, this.f7311c);
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f7314f) {
            return;
        }
        this.f7314f = true;
        this.f7312d.mo35e();
    }
}