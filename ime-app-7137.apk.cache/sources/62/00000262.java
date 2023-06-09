package p010b.p046j.p047d;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p001a.p002a.p004b.AbstractC0022t;

/* renamed from: b.j.d.k */
/* loaded from: classes.dex */
public abstract class AbstractC0478k {
    /* renamed from: a */
    public static IBinder m2425a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        if (!AbstractC0022t.f47j) {
            try {
                Method method = Bundle.class.getMethod("getIBinder", String.class);
                AbstractC0022t.f46i = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            AbstractC0022t.f47j = true;
        }
        Method method2 = AbstractC0022t.f46i;
        if (method2 != null) {
            try {
                return (IBinder) method2.invoke(bundle, str);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                AbstractC0022t.f46i = null;
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m2424b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
            return;
        }
        if (!AbstractC0022t.f49l) {
            try {
                Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                AbstractC0022t.f48k = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            AbstractC0022t.f49l = true;
        }
        Method method2 = AbstractC0022t.f48k;
        if (method2 != null) {
            try {
                method2.invoke(bundle, str, iBinder);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                AbstractC0022t.f48k = null;
            }
        }
    }
}