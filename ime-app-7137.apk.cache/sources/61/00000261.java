package p010b.p046j.p047d;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: b.j.d.j */
/* loaded from: classes.dex */
public abstract class AbstractC0477j {

    /* renamed from: a */
    public static final Class f2470a;

    /* renamed from: b */
    public static final Field f2471b;

    /* renamed from: c */
    public static final Field f2472c;

    /* renamed from: d */
    public static final Method f2473d;

    /* renamed from: e */
    public static final Method f2474e;

    /* renamed from: f */
    public static final Method f2475f;

    /* renamed from: g */
    public static final Handler f2476g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class cls2;
        Method declaredMethod2;
        Class cls3;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f2470a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f2471b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        f2472c = field2;
        Class cls4 = f2470a;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            f2473d = declaredMethod;
            cls2 = f2470a;
            if (cls2 != null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                f2474e = declaredMethod2;
                cls3 = f2470a;
                if (m2427a() && cls3 != null) {
                    try {
                        Class<?> cls5 = Boolean.TYPE;
                        Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                        declaredMethod3.setAccessible(true);
                        method = declaredMethod3;
                    } catch (Throwable unused6) {
                    }
                }
                f2475f = method;
            }
            declaredMethod2 = null;
            f2474e = declaredMethod2;
            cls3 = f2470a;
            if (m2427a()) {
                Class<?> cls52 = Boolean.TYPE;
                Method declaredMethod32 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls52, Configuration.class, Configuration.class, cls52, cls52);
                declaredMethod32.setAccessible(true);
                method = declaredMethod32;
            }
            f2475f = method;
        }
        declaredMethod = null;
        f2473d = declaredMethod;
        cls2 = f2470a;
        if (cls2 != null) {
        }
        declaredMethod2 = null;
        f2474e = declaredMethod2;
        cls3 = f2470a;
        if (m2427a()) {
        }
        f2475f = method;
    }

    /* renamed from: a */
    public static boolean m2427a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: b */
    public static boolean m2426b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2427a() && f2475f == null) {
            return false;
        } else {
            if (f2474e == null && f2473d == null) {
                return false;
            }
            try {
                Object obj2 = f2472c.get(activity);
                if (obj2 == null || (obj = f2471b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C0476i c0476i = new C0476i(activity);
                application.registerActivityLifecycleCallbacks(c0476i);
                Handler handler = f2476g;
                handler.post(new RunnableC0473f(c0476i, obj2));
                if (m2427a()) {
                    Method method = f2475f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC0474g(application, c0476i));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}