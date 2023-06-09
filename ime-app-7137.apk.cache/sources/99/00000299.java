package p010b.p046j.p055i;

import android.os.Handler;
import p010b.p046j.p050f.C0510e;

/* renamed from: b.j.i.c */
/* loaded from: classes.dex */
public class C0533c {

    /* renamed from: a */
    public final C0510e f2588a;

    /* renamed from: b */
    public final Handler f2589b;

    public C0533c(C0510e c0510e, Handler handler) {
        this.f2588a = c0510e;
        this.f2589b = handler;
    }

    /* renamed from: a */
    public void m2346a(C0541k c0541k) {
        int i = c0541k.f2607b;
        if (!(i == 0)) {
            this.f2589b.post(new RunnableC0532b(this, this.f2588a, i));
            return;
        }
        this.f2589b.post(new RunnableC0531a(this, this.f2588a, c0541k.f2606a));
    }
}