package p183e.p184a.p185l.p186a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: e.a.l.a.f */
/* loaded from: classes.dex */
public final class C2109f extends AbstractC2101i {

    /* renamed from: b */
    public final Handler f7016b;

    /* renamed from: c */
    public final boolean f7017c;

    public C2109f(Handler handler, boolean z) {
        this.f7016b = handler;
        this.f7017c = z;
    }

    @Override // p183e.p184a.AbstractC2101i
    /* renamed from: a */
    public AbstractC2100h mo59a() {
        return new C2107d(this.f7016b, this.f7017c);
    }

    @Override // p183e.p184a.AbstractC2101i
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public InterfaceC2112c mo57c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                Handler handler = this.f7016b;
                RunnableC2108e runnableC2108e = new RunnableC2108e(handler, runnable);
                Message obtain = Message.obtain(handler, runnableC2108e);
                if (this.f7017c) {
                    obtain.setAsynchronous(true);
                }
                this.f7016b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return runnableC2108e;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}