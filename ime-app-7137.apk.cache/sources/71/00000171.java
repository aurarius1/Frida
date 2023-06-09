package p010b.p016c.p026q;

import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.q.e2 */
/* loaded from: classes.dex */
public class RunnableC0237e2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0243f2 f1536b;

    public RunnableC0237e2(C0243f2 c0243f2) {
        this.f1536b = c0243f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0305r1 c0305r1 = this.f1536b.f1561g;
        if (c0305r1 == null || !AbstractC0605j0.m2233y(c0305r1) || this.f1536b.f1561g.getCount() <= this.f1536b.f1561g.getChildCount()) {
            return;
        }
        int childCount = this.f1536b.f1561g.getChildCount();
        C0243f2 c0243f2 = this.f1536b;
        if (childCount <= c0243f2.f1571q) {
            c0243f2.f1558D.setInputMethodMode(2);
            this.f1536b.mo2833f();
        }
    }
}