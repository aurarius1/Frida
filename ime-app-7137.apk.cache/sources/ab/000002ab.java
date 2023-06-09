package p010b.p046j.p056j;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: b.j.j.c */
/* loaded from: classes.dex */
public abstract class AbstractC0551c {

    /* renamed from: a */
    public static Method f2640a;

    /* renamed from: b */
    public static Method f2641b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 24) {
                try {
                    f2641b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f2640a = cls.getMethod("getScript", String.class);
            f2641b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception unused) {
            f2640a = null;
            f2641b = null;
        }
    }
}