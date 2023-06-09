package p210g.p211a.p212a.p213l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import p010b.p016c.p017k.AbstractActivityC0127t;

/* renamed from: g.a.a.l.e */
/* loaded from: classes.dex */
public abstract class AbstractC2317e {

    /* renamed from: a */
    public Object f7470a;

    public AbstractC2317e(Object obj) {
        this.f7470a = obj;
    }

    /* renamed from: c */
    public static AbstractC2317e m12c(Activity activity) {
        return Build.VERSION.SDK_INT < 23 ? new C2316d(activity) : activity instanceof AbstractActivityC0127t ? new C2314b((AbstractActivityC0127t) activity) : new C2313a(activity);
    }

    /* renamed from: a */
    public abstract void mo10a(int i, String... strArr);

    /* renamed from: b */
    public abstract Context mo9b();

    /* renamed from: d */
    public abstract boolean mo8d(String str);

    /* renamed from: e */
    public abstract void mo11e(String str, String str2, String str3, int i, int i2, String... strArr);
}