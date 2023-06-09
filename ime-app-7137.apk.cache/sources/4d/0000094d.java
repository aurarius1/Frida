package p183e.p184a.p190p.p192b;

import java.util.concurrent.Callable;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: e.a.p.b.j */
/* loaded from: classes.dex */
public final class CallableC2144j implements Callable, InterfaceC2127i {

    /* renamed from: b */
    public final Object f7035b;

    public CallableC2144j(Object obj) {
        this.f7035b = obj;
    }

    @Override // p183e.p184a.p189o.InterfaceC2127i
    /* renamed from: a */
    public Object mo24a(Object obj) {
        return this.f7035b;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.f7035b;
    }
}