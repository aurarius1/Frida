package p093c.p145g.p146a.p147a.p159k0;

import android.os.Build;
import android.view.View;
import com.google.android.material.timepicker.ClockFaceView;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0579d;
import p010b.p046j.p058l.p059d1.C0580e;
import p093c.p145g.p146a.p147a.AbstractC1840f;

/* renamed from: c.g.a.a.k0.d */
/* loaded from: classes.dex */
public class C1930d extends C0568b {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f5872d;

    public C1930d(ClockFaceView clockFaceView) {
        this.f5872d = clockFaceView;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        int intValue = ((Integer) view.getTag(AbstractC1840f.material_value_index)).intValue();
        if (intValue > 0) {
            View view2 = (View) this.f5872d.f6942y.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                c0580e.f2703b.setTraversalAfter(view2);
            }
        }
        c0580e.m2304j(C0579d.m2314a(0, 1, intValue, 1, false, view.isSelected()));
    }
}