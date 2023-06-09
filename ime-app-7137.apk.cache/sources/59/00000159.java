package p010b.p016c.p026q;

/* renamed from: b.c.q.a2 */
/* loaded from: classes.dex */
public class RunnableC0213a2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0243f2 f1456b;

    public RunnableC0213a2(C0243f2 c0243f2) {
        this.f1456b = c0243f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0305r1 c0305r1 = this.f1456b.f1561g;
        if (c0305r1 != null) {
            c0305r1.setListSelectionHidden(true);
            c0305r1.requestLayout();
        }
    }
}