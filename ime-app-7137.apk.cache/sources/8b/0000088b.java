package p093c.p145g.p146a.p175b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: c.g.a.b.i */
/* loaded from: classes.dex */
public class ServiceConnectionC2055i implements ServiceConnection {

    /* renamed from: a */
    public final String f6239a;

    /* renamed from: b */
    public C2054h f6240b;

    public ServiceConnectionC2055i(String str, C2054h c2054h) {
        this.f6239a = str;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((BinderC2058l) iBinder).f6244a.m202a(this.f6240b);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}