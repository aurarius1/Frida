package p010b.p086w;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* renamed from: b.w.a1 */
/* loaded from: classes.dex */
public abstract class AbstractC1023a1 {

    /* renamed from: a */
    public static final C1041g1 f3914a;

    /* renamed from: b */
    public static final Property f3915b;

    static {
        int i = Build.VERSION.SDK_INT;
        f3914a = i >= 29 ? new C1038f1() : i >= 23 ? new C1035e1() : i >= 22 ? new C1032d1() : i >= 21 ? new C1029c1() : i >= 19 ? new C1026b1() : new C1041g1();
        f3915b = new C1083y0(Float.class, "translationAlpha");
        new C1085z0(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static float m1384a(View view) {
        return f3914a.mo1369b(view);
    }

    /* renamed from: b */
    public static InterfaceC1059m1 m1383b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C1056l1(view) : new C1053k1(view.getWindowToken());
    }

    /* renamed from: c */
    public static void m1382c(View view, int i, int i2, int i3, int i4) {
        f3914a.mo1367d(view, i, i2, i3, i4);
    }
}