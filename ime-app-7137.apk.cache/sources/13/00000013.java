package p000a.p001a.p002a.p004b;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import p010b.p077q.p078l0.C0826a;

/* renamed from: a.a.a.b.q */
/* loaded from: classes.dex */
public final class C0019q {

    /* renamed from: a */
    public static final boolean f35a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b */
    public final InterfaceC0005c f36b;

    public C0019q(Context context, ComponentName componentName, C0826a c0826a, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        this.f36b = i >= 26 ? new C0008f(context, componentName, c0826a, null) : i >= 23 ? new C0007e(context, componentName, c0826a, null) : i >= 21 ? new C0006d(context, componentName, c0826a, null) : new C0014l(context, componentName, c0826a, null);
    }
}