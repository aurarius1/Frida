package p010b.p046j.p055i;

import p010b.p046j.p057k.InterfaceC0560a;

/* renamed from: b.j.i.q */
/* loaded from: classes.dex */
public class RunnableC0547q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0560a f2622b;

    /* renamed from: c */
    public final /* synthetic */ Object f2623c;

    public RunnableC0547q(RunnableC0548r runnableC0548r, InterfaceC0560a interfaceC0560a, Object obj) {
        this.f2622b = interfaceC0560a;
        this.f2623c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2622b.accept(this.f2623c);
    }
}