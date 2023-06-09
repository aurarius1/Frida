package p010b.p077q;

import android.service.media.MediaBrowserService;
import java.lang.reflect.Field;

/* renamed from: b.q.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC0822j0 {

    /* renamed from: a */
    public static Field f3337a;

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f3337a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }
}