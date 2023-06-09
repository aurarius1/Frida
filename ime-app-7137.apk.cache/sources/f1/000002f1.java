package p010b.p046j.p058l;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: b.j.l.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC0621r0 {

    /* renamed from: a */
    public static Field f2780a;

    /* renamed from: b */
    public static Field f2781b;

    /* renamed from: c */
    public static Field f2782c;

    /* renamed from: d */
    public static boolean f2783d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2780a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2781b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2782c = declaredField3;
            declaredField3.setAccessible(true);
            f2783d = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }
}