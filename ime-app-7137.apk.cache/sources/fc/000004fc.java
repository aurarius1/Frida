package p093c.p097b.p099b0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.util.TypedValue;
import p010b.p046j.p047d.AbstractC0472e;

/* renamed from: c.b.b0.g */
/* loaded from: classes.dex */
public class C1144g implements InterfaceC1141d {

    /* renamed from: a */
    public static final boolean f4258a;

    /* renamed from: b */
    public static final C1138a f4259b;

    /* renamed from: c */
    public final Context f4260c;

    /* renamed from: d */
    public final C1138a f4261d = new C1138a();

    static {
        f4258a = Build.VERSION.SDK_INT >= 21;
        f4259b = new C1143f(null);
    }

    public C1144g(Context context) {
        this.f4260c = context;
    }

    /* renamed from: b */
    public static int m1175b(Context context, TypedValue typedValue, int i, int i2) {
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.type == 1 ? AbstractC0472e.m2431b(context, typedValue.resourceId) : typedValue.data : i2;
    }

    @Override // p093c.p097b.p099b0.InterfaceC1141d
    /* renamed from: a */
    public C1138a mo937a(ComponentName componentName) {
        if (f4258a) {
            try {
                ActivityInfo activityInfo = this.f4260c.getPackageManager().getActivityInfo(componentName, 128);
                Context createPackageContext = this.f4260c.createPackageContext(componentName.getPackageName(), 2);
                createPackageContext.setTheme(activityInfo.getThemeResource());
                C1138a c1138a = this.f4261d;
                TypedValue typedValue = new TypedValue();
                int m1175b = m1175b(createPackageContext, typedValue, 16843827, 0);
                c1138a.f4250a = m1175b;
                c1138a.f4251b = m1175b(createPackageContext, typedValue, 16843828, m1175b);
                c1138a.f4252c = -1;
                c1138a.f4253d = -3355444;
                return this.f4261d;
            } catch (Exception unused) {
            }
        }
        return f4259b;
    }
}