package p183e.p184a.p185l.p186a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p183e.p184a.AbstractC2100h;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p190p.p191a.EnumC2132d;

/* renamed from: e.a.l.a.d */
/* loaded from: classes.dex */
public final class C2107d extends AbstractC2100h {

    /* renamed from: b */
    public final Handler f7011b;

    /* renamed from: c */
    public final boolean f7012c;

    /* renamed from: d */
    public volatile boolean f7013d;

    public C2107d(Handler handler, boolean z) {
        this.f7011b = handler;
        this.f7012c = z;
    }

    @Override // p183e.p184a.AbstractC2100h
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public InterfaceC2112c mo61c(Runnable runnable, long j, TimeUnit timeUnit) {
        EnumC2132d enumC2132d = EnumC2132d.INSTANCE;
        if (runnable != null) {
            if (timeUnit != null) {
                if (this.f7013d) {
                    return enumC2132d;
                }
                Handler handler = this.f7011b;
                RunnableC2108e runnableC2108e = new RunnableC2108e(handler, runnable);
                Message obtain = Message.obtain(handler, runnableC2108e);
                obtain.obj = this;
                if (this.f7012c) {
                    obtain.setAsynchronous(true);
                }
                this.f7011b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (this.f7013d) {
                    this.f7011b.removeCallbacks(runnableC2108e);
                    return enumC2132d;
                }
                return runnableC2108e;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f7013d = true;
        this.f7011b.removeCallbacksAndMessages(this);
    }
}