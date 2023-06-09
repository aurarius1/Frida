package p010b.p067m.p068d;

import p010b.p046j.p054h.C0529b;

/* renamed from: b.m.d.p1 */
/* loaded from: classes.dex */
public class RunnableC0730p1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0749u0 f3095b;

    /* renamed from: c */
    public final /* synthetic */ AbstractComponentCallbacksC0763z f3096c;

    /* renamed from: d */
    public final /* synthetic */ C0529b f3097d;

    public RunnableC0730p1(C0749u0 c0749u0, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, C0529b c0529b) {
        this.f3095b = c0749u0;
        this.f3096c = abstractComponentCallbacksC0763z;
        this.f3097d = c0529b;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3095b.m1941a(this.f3096c, this.f3097d);
    }
}