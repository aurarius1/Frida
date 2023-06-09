package p010b.p086w;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: b.w.d1 */
/* loaded from: classes.dex */
public class C1032d1 extends C1029c1 {

    /* renamed from: h */
    public static boolean f3925h = true;

    @Override // p010b.p086w.C1041g1
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo1367d(View view, int i, int i2, int i3, int i4) {
        if (f3925h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f3925h = false;
            }
        }
    }
}