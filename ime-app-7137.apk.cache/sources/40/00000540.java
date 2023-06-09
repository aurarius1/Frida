package p093c.p097b.p104e0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p128x.C1627s2;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: c.b.e0.g */
/* loaded from: classes.dex */
public class C1212g {

    /* renamed from: a */
    public final Context f4382a;

    /* renamed from: b */
    public final BroadcastReceiver f4383b;

    /* renamed from: c */
    public final InterfaceC1210e f4384c;

    /* renamed from: d */
    public InterfaceC2112c f4385d;

    /* renamed from: e */
    public Integer f4386e;

    /* renamed from: f */
    public C1627s2 f4387f;

    public C1212g(Context context) {
        C1207b c1207b = C1207b.f4375a;
        this.f4385d = AbstractC1077v0.m1266m();
        this.f4384c = c1207b;
        this.f4382a = context;
        C1211f c1211f = new C1211f(this);
        this.f4383b = c1211f;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.intent.category.DEFAULT");
        intentFilter.addAction("com.anysoftkeyboard.api.BROADCAST_INTENT_MEDIA_INSERTION_AVAILABLE_ACTION");
        context.registerReceiver(c1211f, intentFilter);
    }
}