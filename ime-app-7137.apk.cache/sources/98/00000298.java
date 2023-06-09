package p010b.p046j.p055i;

import p010b.p046j.p048e.p049b.AbstractC0503i;
import p010b.p046j.p050f.C0510e;

/* renamed from: b.j.i.b */
/* loaded from: classes.dex */
public class RunnableC0532b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0510e f2586b;

    /* renamed from: c */
    public final /* synthetic */ int f2587c;

    public RunnableC0532b(C0533c c0533c, C0510e c0510e, int i) {
        this.f2586b = c0510e;
        this.f2587c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0510e c0510e = this.f2586b;
        int i = this.f2587c;
        AbstractC0503i abstractC0503i = c0510e.f2549a;
        if (abstractC0503i != null) {
            abstractC0503i.mo761d(i);
        }
    }
}