package p010b.p086w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: b.w.e1 */
/* loaded from: classes.dex */
public class C1035e1 extends C1032d1 {

    /* renamed from: i */
    public static boolean f3949i = true;

    @Override // p010b.p086w.C1041g1
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo1365f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo1365f(view, i);
        } else if (f3949i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f3949i = false;
            }
        }
    }
}