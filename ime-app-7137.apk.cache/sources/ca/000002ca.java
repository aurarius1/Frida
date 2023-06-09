package p010b.p046j.p058l.p059d1;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: b.j.l.d1.g */
/* loaded from: classes.dex */
public class C0582g extends C0581f {
    public C0582g(C0584i c0584i) {
        super(c0584i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i) {
        C0580e mo2154b = this.f2706a.mo2154b(i);
        if (mo2154b == null) {
            return null;
        }
        return mo2154b.f2703b;
    }
}