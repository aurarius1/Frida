package p010b.p077q;

/* renamed from: b.q.r */
/* loaded from: classes.dex */
public class RunnableC0832r implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3360b;

    /* renamed from: c */
    public final /* synthetic */ C0840z f3361c;

    public RunnableC0832r(C0840z c0840z, C0804a0 c0804a0) {
        this.f3361c = c0840z;
        this.f3360b = c0804a0;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0813f c0813f = (C0813f) this.f3361c.f3393a.f569d.remove(this.f3360b.m1797a());
        if (c0813f != null) {
            c0813f.f3327b.m1797a().unlinkToDeath(c0813f, 0);
        }
    }
}