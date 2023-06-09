package p010b.p046j.p056j;

import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: b.j.j.k */
/* loaded from: classes.dex */
public abstract class AbstractC0559k {

    /* renamed from: a */
    public static final Locale f2653a = new Locale("", "");

    /* renamed from: a */
    public static int m2333a(Locale locale) {
        String script;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f2653a)) {
            Method method = AbstractC0551c.f2640a;
            if (i >= 24) {
                script = ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
            } else if (i >= 21) {
                try {
                    script = ((Locale) AbstractC0551c.f2641b.invoke(null, locale)).getScript();
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    script = locale.getScript();
                }
            } else {
                String locale2 = locale.toString();
                try {
                    Method method2 = AbstractC0551c.f2641b;
                    if (method2 != null) {
                        locale2 = (String) method2.invoke(null, locale2);
                    }
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                if (locale2 != null) {
                    try {
                        Method method3 = AbstractC0551c.f2640a;
                        if (method3 != null) {
                            script = (String) method3.invoke(null, locale2);
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                }
                script = null;
            }
            if (script == null) {
                byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
                return (directionality == 1 || directionality == 2) ? 1 : 0;
            } else if (script.equalsIgnoreCase("Arab") || script.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}