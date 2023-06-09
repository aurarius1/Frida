package p010b.p046j.p058l.p059d1;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: b.j.l.d1.d */
/* loaded from: classes.dex */
public class C0579d {

    /* renamed from: a */
    public final Object f2701a;

    public C0579d(Object obj) {
        this.f2701a = obj;
    }

    /* renamed from: a */
    public static C0579d m2314a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 21 ? new C0579d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0579d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0579d(null);
    }
}