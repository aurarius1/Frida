package p010b.p046j.p058l.p059d1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: b.j.l.d1.f */
/* loaded from: classes.dex */
public class C0581f extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C0584i f2706a;

    public C0581f(C0584i c0584i) {
        this.f2706a = c0584i;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0580e mo2155a = this.f2706a.mo2155a(i);
        if (mo2155a == null) {
            return null;
        }
        return mo2155a.f2703b;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i) {
        this.f2706a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f2706a.mo2153c(i, i2, bundle);
    }
}