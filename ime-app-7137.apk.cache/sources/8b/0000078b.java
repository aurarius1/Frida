package p093c.p142f.p143a.p144a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: c.f.a.a.a */
/* loaded from: classes.dex */
public class C1799a extends BroadcastReceiver implements InterfaceC2112c {

    /* renamed from: b */
    public final AtomicBoolean f5479b = new AtomicBoolean(false);

    /* renamed from: c */
    public final InterfaceC2098f f5480c;

    /* renamed from: d */
    public final Context f5481d;

    public C1799a(Context context, InterfaceC2098f interfaceC2098f) {
        this.f5480c = interfaceC2098f;
        this.f5481d = context;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        if (this.f5479b.compareAndSet(false, true)) {
            this.f5481d.unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f5479b.get()) {
            return;
        }
        this.f5480c.mo25g(intent);
    }
}