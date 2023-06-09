package p183e.p184a.p190p.p199g;

/* renamed from: e.a.p.g.u */
/* loaded from: classes.dex */
public final class RunnableC2256u implements Runnable {

    /* renamed from: b */
    public final C2255t f7377b;

    /* renamed from: c */
    public final /* synthetic */ C2257v f7378c;

    public RunnableC2256u(C2257v c2257v, C2255t c2255t) {
        this.f7378c = c2257v;
        this.f7377b = c2255t;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7377b.f7376e = true;
        this.f7378c.f7379b.remove(this.f7377b);
    }
}