package p010b.p046j.p055i;

import android.os.Handler;
import java.util.concurrent.Callable;
import p010b.p046j.p057k.InterfaceC0560a;

/* renamed from: b.j.i.r */
/* loaded from: classes.dex */
public class RunnableC0548r implements Runnable {

    /* renamed from: b */
    public Callable f2624b;

    /* renamed from: c */
    public InterfaceC0560a f2625c;

    /* renamed from: d */
    public Handler f2626d;

    public RunnableC0548r(Handler handler, Callable callable, InterfaceC0560a interfaceC0560a) {
        this.f2624b = callable;
        this.f2625c = interfaceC0560a;
        this.f2626d = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        try {
            obj = this.f2624b.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f2626d.post(new RunnableC0547q(this, this.f2625c, obj));
    }
}