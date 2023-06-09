package p010b.p046j.p047d;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.Arrays;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.d.e */
/* loaded from: classes.dex */
public abstract class AbstractC0472e {

    /* renamed from: a */
    public static final Object f2456a = new Object();

    /* renamed from: b */
    public static TypedValue f2457b;

    /* renamed from: a */
    public static int m2432a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static int m2431b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: c */
    public static Drawable m2430c(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f2456a) {
                if (f2457b == null) {
                    f2457b = new TypedValue();
                }
                context.getResources().getValue(i, f2457b, true);
                i = f2457b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: d */
    public static void m2429d(Activity activity, String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                StringBuilder m1187i = AbstractC1124a.m1187i("Permission request for permissions ");
                m1187i.append(Arrays.toString(strArr));
                m1187i.append(" must not contain null or empty values");
                throw new IllegalArgumentException(m1187i.toString());
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof InterfaceC0470d) {
                ((AbstractActivityC0681d0) ((InterfaceC0470d) activity)).getClass();
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof InterfaceC0468c) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0464a(strArr, activity, i));
        }
    }

    /* renamed from: e */
    public static boolean m2428e(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}