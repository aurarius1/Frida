package p183e.p184a.p190p.p199g;

import java.util.concurrent.TimeUnit;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.p.g.w */
/* loaded from: classes.dex */
public final class C2258w extends AbstractC2101i {

    /* renamed from: b */
    public static final C2258w f7383b = new C2258w();

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: a */
    public AbstractC2100h mo59a() {
        return new C2257v();
    }

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: b */
    public InterfaceC2112c mo58b(Runnable runnable) {
        runnable.run();
        return EnumC2132d.INSTANCE;
    }

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: c */
    public InterfaceC2112c mo57c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            AbstractC1438d.m1044f(e);
        }
        if (runnable != null) {
            runnable.run();
            return EnumC2132d.INSTANCE;
        }
        throw new NullPointerException("run is null");
    }
}