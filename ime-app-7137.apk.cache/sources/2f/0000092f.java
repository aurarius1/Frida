package p183e.p184a.p187m;

import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: e.a.m.e */
/* loaded from: classes.dex */
public final class C2114e extends AbstractC2113d {
    public C2114e(Runnable runnable) {
        super(runnable);
    }

    @Override // p183e.p184a.p187m.AbstractC2113d
    /* renamed from: a */
    public void mo130a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("RunnableDisposable(disposed=");
        m1187i.append(get() == null);
        m1187i.append(", ");
        m1187i.append(get());
        m1187i.append(")");
        return m1187i.toString();
    }
}