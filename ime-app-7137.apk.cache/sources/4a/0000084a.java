package p093c.p145g.p146a.p147a.p168t;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0579d;
import p010b.p046j.p058l.p059d1.C0580e;

/* renamed from: c.g.a.a.t.e */
/* loaded from: classes.dex */
public class C1990e extends C0568b {

    /* renamed from: d */
    public final /* synthetic */ MaterialButtonToggleGroup f6035d;

    public C1990e(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f6035d = materialButtonToggleGroup;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f6035d;
        String str = MaterialButtonToggleGroup.f6754b;
        materialButtonToggleGroup.getClass();
        int i = -1;
        if (view instanceof MaterialButton) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= materialButtonToggleGroup.getChildCount()) {
                    break;
                } else if (materialButtonToggleGroup.getChildAt(i2) == view) {
                    i = i3;
                    break;
                } else {
                    if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.m311d(i2)) {
                        i3++;
                    }
                    i2++;
                }
            }
        }
        c0580e.m2304j(C0579d.m2314a(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
    }
}