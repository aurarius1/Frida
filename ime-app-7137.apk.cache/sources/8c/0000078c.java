package p093c.p142f.p143a.p144a;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import p010b.p086w.AbstractC1077v0;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.InterfaceC2098f;

/* renamed from: c.f.a.a.b */
/* loaded from: classes.dex */
public class C1800b extends AbstractC2094b {

    /* renamed from: b */
    public final Context f5482b;

    /* renamed from: c */
    public final IntentFilter f5483c;

    public C1800b(Context context, IntentFilter intentFilter) {
        this.f5482b = context.getApplicationContext();
        this.f5483c = intentFilter;
    }

    @Override // p183e.p184a.AbstractC2094b
    /* renamed from: O */
    public void mo31O(InterfaceC2098f interfaceC2098f) {
        boolean z;
        if (Looper.myLooper() == null) {
            interfaceC2098f.mo27c(AbstractC1077v0.m1266m());
            interfaceC2098f.mo28b(new IllegalStateException("Calling thread is not associated with Looper"));
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1799a c1799a = new C1799a(this.f5482b, interfaceC2098f);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f5482b.registerReceiver(c1799a, this.f5483c);
            } else {
                this.f5482b.registerReceiver(c1799a, this.f5483c, null, new Handler(Looper.myLooper()));
            }
            interfaceC2098f.mo27c(c1799a);
        }
    }
}