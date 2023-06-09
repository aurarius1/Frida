package p010b.p067m.p068d;

/* renamed from: b.m.d.n2 */
/* loaded from: classes.dex */
public class RunnableC0723n2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0727o2 f3073b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0743s2 f3074c;

    public RunnableC0723n2(AbstractC0743s2 abstractC0743s2, C0727o2 c0727o2) {
        this.f3074c = abstractC0743s2;
        this.f3073b = c0727o2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3074c.f3128b.remove(this.f3073b);
        this.f3074c.f3129c.remove(this.f3073b);
    }
}