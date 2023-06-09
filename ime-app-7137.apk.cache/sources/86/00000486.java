package p010b.p086w;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: b.w.b1 */
/* loaded from: classes.dex */
public class C1026b1 extends C1041g1 {

    /* renamed from: e */
    public static boolean f3921e = true;

    @Override // p010b.p086w.C1041g1
    /* renamed from: a */
    public void mo1370a(View view) {
    }

    @Override // p010b.p086w.C1041g1
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo1369b(View view) {
        if (f3921e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f3921e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p010b.p086w.C1041g1
    /* renamed from: c */
    public void mo1368c(View view) {
    }

    @Override // p010b.p086w.C1041g1
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo1366e(View view, float f) {
        if (f3921e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f3921e = false;
            }
        }
        view.setAlpha(f);
    }
}