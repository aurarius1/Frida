package p093c.p145g.p146a.p147a.p149b0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0580e;

/* renamed from: c.g.a.a.b0.a */
/* loaded from: classes.dex */
public class C1805a extends C0568b {

    /* renamed from: d */
    public final /* synthetic */ CheckableImageButton f5484d;

    public C1805a(CheckableImageButton checkableImageButton) {
        this.f5484d = checkableImageButton;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: c */
    public void mo794c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2662b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f5484d.isChecked());
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        c0580e.f2703b.setCheckable(this.f5484d.f6818f);
        c0580e.f2703b.setChecked(this.f5484d.isChecked());
    }
}