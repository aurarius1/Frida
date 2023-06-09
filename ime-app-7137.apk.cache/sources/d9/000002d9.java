package p010b.p046j.p058l;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: b.j.l.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC0597f0 {
    /* renamed from: a */
    public static C0573c1 m2288a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0573c1 m2317j = C0573c1.m2317j(rootWindowInsets, null);
        m2317j.f2676b.mo2188m(m2317j);
        m2317j.f2676b.mo2192d(view.getRootView());
        return m2317j;
    }
}