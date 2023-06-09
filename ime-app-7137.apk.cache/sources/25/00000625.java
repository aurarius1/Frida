package p093c.p097b.p119s.p120b;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.PopupWindow;

/* renamed from: c.b.s.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC1441a {
    /* renamed from: a */
    public static void m1037a(String str) {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e) {
            throw e;
        }
    }

    @TargetApi(22)
    /* renamed from: b */
    public static void m1036b(PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 22) {
            popupWindow.setAttachedInDecor(false);
        }
    }

    /* renamed from: c */
    public static void m1035c(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}