package p010b.p046j.p058l.p059d1;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: b.j.l.d1.c */
/* loaded from: classes.dex */
public class C0578c {

    /* renamed from: a */
    public final Object f2700a;

    public C0578c(Object obj) {
        this.f2700a = obj;
    }

    /* renamed from: a */
    public static C0578c m2315a(int i, int i2, boolean z, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 21 ? new C0578c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C0578c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C0578c(null);
    }
}