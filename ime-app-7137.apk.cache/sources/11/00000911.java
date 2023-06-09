package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.HashMap;
import java.util.Map;
import p010b.p044i.p045d.C0455e;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.AbstractC1801a;
import p093c.p145g.p146a.p147a.p160l0.C1944d;
import p093c.p145g.p146a.p147a.p161m.C1948c;
import p093c.p145g.p146a.p147a.p161m.C1950e;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map f6975i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: C */
    public boolean mo205C(View view, View view2, boolean z, boolean z2) {
        int intValue;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f6975i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof C0455e) && (((C0455e) childAt.getLayoutParams()).f2411a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map map = this.f6975i;
                        intValue = (map != null && map.containsKey(childAt)) ? ((Integer) this.f6975i.get(childAt)).intValue() : 4;
                    } else if (Build.VERSION.SDK_INT >= 16) {
                        this.f6975i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    AbstractC0605j0.m2263T(childAt, intValue);
                }
            }
            if (!z) {
                this.f6975i = null;
            }
        }
        super.mo205C(view, view2, z, z2);
        return true;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: N */
    public C1944d mo204N(Context context, boolean z) {
        int i = z ? AbstractC1801a.mtrl_fab_transformation_sheet_expand_spec : AbstractC1801a.mtrl_fab_transformation_sheet_collapse_spec;
        C1944d c1944d = new C1944d();
        c1944d.f5890a = C1948c.m673b(context, i);
        c1944d.f5891b = new C1950e(17, 0.0f, 0.0f);
        return c1944d;
    }
}