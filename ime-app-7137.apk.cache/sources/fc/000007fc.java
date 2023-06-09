package p093c.p145g.p146a.p147a.p156i0;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import p010b.p046j.p058l.p059d1.C0580e;

/* renamed from: c.g.a.a.i0.r */
/* loaded from: classes.dex */
public class C1912r extends C1911q0 {

    /* renamed from: e */
    public final /* synthetic */ C1923z f5826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1912r(C1923z c1923z, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5826e = c1923z;
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.C1911q0, p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        boolean z;
        super.mo534d(view, c0580e);
        if (!C1923z.m681e(this.f5826e.f5755a.getEditText())) {
            c0580e.f2703b.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z = c0580e.f2703b.isShowingHintText();
        } else {
            Bundle m2308f = c0580e.m2308f();
            z = m2308f != null && (m2308f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
        }
        if (z) {
            c0580e.m2303k(null);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: e */
    public void mo687e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2662b.onPopulateAccessibilityEvent(view, accessibilityEvent);
        AutoCompleteTextView m682d = C1923z.m682d(this.f5826e.f5755a.getEditText());
        if (accessibilityEvent.getEventType() == 1 && this.f5826e.f5847o.isTouchExplorationEnabled() && !C1923z.m681e(this.f5826e.f5755a.getEditText())) {
            C1923z.m679g(this.f5826e, m682d);
        }
    }
}