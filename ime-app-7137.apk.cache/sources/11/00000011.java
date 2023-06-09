package p000a.p001a.p002a.p004b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* renamed from: a.a.a.b.o */
/* loaded from: classes.dex */
public class C0017o {

    /* renamed from: a */
    public Messenger f33a;

    /* renamed from: b */
    public Bundle f34b;

    public C0017o(IBinder iBinder, Bundle bundle) {
        this.f33a = new Messenger(iBinder);
        this.f34b = bundle;
    }

    /* renamed from: a */
    public final void m3535a(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        this.f33a.send(obtain);
    }
}