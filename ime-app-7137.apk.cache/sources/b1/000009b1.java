package p183e.p184a.p190p.p199g;

import java.util.concurrent.ThreadFactory;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.AbstractC2101i;

/* renamed from: e.a.p.g.i */
/* loaded from: classes.dex */
public final class C2244i extends AbstractC2101i {

    /* renamed from: b */
    public static final ThreadFactoryC2247l f7344b = new ThreadFactoryC2247l("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c */
    public final ThreadFactory f7345c = f7344b;

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: a */
    public AbstractC2100h mo59a() {
        return new C2245j(this.f7345c);
    }
}